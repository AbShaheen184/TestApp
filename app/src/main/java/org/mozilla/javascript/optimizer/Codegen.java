package org.mozilla.javascript.optimizer;

import androidx.constraintlayout.core.g;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.TemplateCharacters;
import org.mozilla.javascript.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Codegen implements Evaluator {
    static final String DEFAULT_MAIN_METHOD_CLASS = "org.mozilla.javascript.optimizer.OptRuntime";
    static final String FUNCTION_CONSTRUCTOR_SIGNATURE = "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V";
    static final String FUNCTION_INIT_SIGNATURE = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V";
    static final String ID_FIELD_NAME = "_id";
    static final String REGEXP_INIT_METHOD_NAME = "_reInit";
    static final String REGEXP_INIT_METHOD_SIGNATURE = "(Lorg/mozilla/javascript/Context;)V";
    private static final String SUPER_CLASS_NAME = "org.mozilla.javascript.NativeFunction";
    static final String TEMPLATE_LITERAL_INIT_METHOD_NAME = "_qInit";
    static final String TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE = "()V";
    private static final Object globalLock = new Object();
    private static int globalSerialClassCounter;
    private CompilerEnvirons compilerEnv;
    private List<OptFunctionNode> directCallTargets;
    private double[] itsConstantList;
    private int itsConstantListSize;
    String mainClassName;
    String mainClassSignature;
    private String mainMethodClass = DEFAULT_MAIN_METHOD_CLASS;
    private HashMap<ScriptNode, Integer> scriptOrFnIndexes;
    ScriptNode[] scriptOrFnNodes;

    private static void addDoubleWrap(ClassFileWriter classFileWriter) {
        classFileWriter.m("org/mozilla/javascript/optimizer/OptRuntime", Token.DOTDOTDOT, "wrapDouble", "(D)Ljava/lang/Double;");
    }

    public static RuntimeException badTree() {
        throw new RuntimeException("Bad tree in codegen");
    }

    private static void collectScriptNodes_r(ScriptNode scriptNode, List<ScriptNode> list) {
        list.add(scriptNode);
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            collectScriptNodes_r(scriptNode.getFunctionNode(i), list);
        }
    }

    private Class<?> defineClass(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        String str = (String) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        GeneratedClassLoader generatedClassLoaderCreateLoader = SecurityController.createLoader(getClass().getClassLoader(), obj2);
        try {
            Class<?> clsDefineClass = generatedClassLoaderCreateLoader.defineClass(str, bArr);
            generatedClassLoaderCreateLoader.linkClass(clsDefineClass);
            return clsDefineClass;
        } catch (IllegalArgumentException | SecurityException e) {
            c.b("Malformed optimizer package ".concat(String.valueOf(e)));
            return null;
        }
    }

    private void emitConstantDudeInitializers(ClassFileWriter classFileWriter) {
        int i = this.itsConstantListSize;
        if (i == 0) {
            return;
        }
        classFileWriter.N("<clinit>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 24);
        double[] dArr = this.itsConstantList;
        for (int i2 = 0; i2 != i; i2++) {
            double d = dArr[i2];
            String strL = a.l(i2, "_k");
            String staticConstantWrapperType = getStaticConstantWrapperType(d);
            classFileWriter.k(strL, staticConstantWrapperType, (short) 10);
            int i3 = (int) d;
            if (i3 == d) {
                classFileWriter.r(i3);
                classFileWriter.m("java/lang/Integer", Token.DOTDOTDOT, "valueOf", "(I)Ljava/lang/Integer;");
            } else {
                classFileWriter.q(d);
                addDoubleWrap(classFileWriter);
            }
            classFileWriter.f(this.mainClassName, Token.YIELD_STAR, strL, staticConstantWrapperType);
        }
        classFileWriter.c(Token.METHOD);
        classFileWriter.O(0);
    }

    private void emitDirectConstructor(ClassFileWriter classFileWriter, OptFunctionNode optFunctionNode) {
        classFileWriter.N(getDirectCtorName(optFunctionNode.fnode), getBodyMethodSignature(optFunctionNode.fnode), (short) 10);
        int paramCount = optFunctionNode.fnode.getParamCount();
        int i = paramCount * 3;
        int i2 = i + 4;
        int i3 = i + 5;
        classFileWriter.g(0);
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.m("org/mozilla/javascript/BaseFunction", Token.TEMPLATE_LITERAL_SUBST, "createObject", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.h(i3);
        classFileWriter.g(0);
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.g(i3);
        for (int i4 = 0; i4 < paramCount; i4++) {
            int i5 = i4 * 3;
            classFileWriter.g(i5 + 4);
            classFileWriter.i(i5 + 5);
        }
        classFileWriter.g(i2);
        classFileWriter.m(this.mainClassName, Token.DOTDOTDOT, getBodyMethodName(optFunctionNode.fnode), getBodyMethodSignature(optFunctionNode.fnode));
        int iB = classFileWriter.b();
        classFileWriter.c(89);
        classFileWriter.e(193, "org/mozilla/javascript/Scriptable");
        classFileWriter.d(Token.SETPROP_OP, iB);
        classFileWriter.e(192, "org/mozilla/javascript/Scriptable");
        classFileWriter.c(Token.GENEXPR);
        classFileWriter.D(iB);
        classFileWriter.g(i3);
        classFileWriter.c(Token.GENEXPR);
        classFileWriter.O((short) (i + 6));
    }

    private void emitRegExpInit(ClassFileWriter classFileWriter) {
        int i = 0;
        int i2 = 0;
        int regexpCount = 0;
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i2 == scriptNodeArr.length) {
                break;
            }
            regexpCount += scriptNodeArr[i2].getRegexpCount();
            i2++;
        }
        if (regexpCount == 0) {
            return;
        }
        short s = 10;
        classFileWriter.N(REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE, (short) 10);
        classFileWriter.k("_reInitDone", "Z", (short) 74);
        classFileWriter.f(this.mainClassName, Token.ARROW, "_reInitDone", "Z");
        int iB = classFileWriter.b();
        classFileWriter.d(Token.SETPROP_OP, iB);
        classFileWriter.c(Token.METHOD);
        classFileWriter.D(iB);
        classFileWriter.g(0);
        classFileWriter.m("org/mozilla/javascript/ScriptRuntime", Token.DOTDOTDOT, "checkRegExpProxy", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        classFileWriter.h(1);
        int i3 = 0;
        while (true) {
            ScriptNode[] scriptNodeArr2 = this.scriptOrFnNodes;
            if (i3 == scriptNodeArr2.length) {
                classFileWriter.r(1);
                classFileWriter.f(this.mainClassName, Token.YIELD_STAR, "_reInitDone", "Z");
                classFileWriter.c(Token.METHOD);
                classFileWriter.O(2);
                return;
            }
            ScriptNode scriptNode = scriptNodeArr2[i3];
            int regexpCount2 = scriptNode.getRegexpCount();
            int i4 = i;
            while (i4 != regexpCount2) {
                String compiledRegexpName = getCompiledRegexpName(scriptNode, i4);
                String regexpString = scriptNode.getRegexpString(i4);
                String regexpFlags = scriptNode.getRegexpFlags(i4);
                classFileWriter.k(compiledRegexpName, "Ljava/lang/Object;", s);
                classFileWriter.g(1);
                classFileWriter.g(i);
                classFileWriter.s(regexpString);
                if (regexpFlags == null) {
                    classFileWriter.c(1);
                } else {
                    classFileWriter.s(regexpFlags);
                }
                classFileWriter.m("org/mozilla/javascript/RegExpProxy", 185, "compileRegExp", "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
                classFileWriter.f(this.mainClassName, Token.YIELD_STAR, compiledRegexpName, "Ljava/lang/Object;");
                i4++;
                i = 0;
                s = 10;
            }
            i3++;
            i = 0;
            s = 10;
        }
    }

    private void emitTemplateLiteralInit(ClassFileWriter classFileWriter) {
        int templateLiteralCount = 0;
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            templateLiteralCount += scriptNode.getTemplateLiteralCount();
        }
        if (templateLiteralCount == 0) {
            return;
        }
        short s = 10;
        classFileWriter.N(TEMPLATE_LITERAL_INIT_METHOD_NAME, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 10);
        classFileWriter.k("_qInitDone", "Z", (short) 74);
        classFileWriter.f(this.mainClassName, Token.ARROW, "_qInitDone", "Z");
        int iB = classFileWriter.b();
        classFileWriter.d(Token.SETPROP_OP, iB);
        classFileWriter.c(Token.METHOD);
        classFileWriter.D(iB);
        ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
        int length = scriptNodeArr.length;
        int i = 0;
        while (i < length) {
            ScriptNode scriptNode2 = scriptNodeArr[i];
            int templateLiteralCount2 = scriptNode2.getTemplateLiteralCount();
            if (templateLiteralCount2 != 0) {
                String templateLiteralName = getTemplateLiteralName(scriptNode2);
                classFileWriter.k(templateLiteralName, "[Ljava/lang/Object;", s);
                classFileWriter.r(templateLiteralCount2);
                int i2 = 189;
                classFileWriter.e(189, "java/lang/Object");
                int i3 = 0;
                while (i3 < templateLiteralCount2) {
                    List<TemplateCharacters> templateLiteralStrings = scriptNode2.getTemplateLiteralStrings(i3);
                    int i4 = 89;
                    classFileWriter.c(89);
                    classFileWriter.r(i3);
                    classFileWriter.r(templateLiteralStrings.size() * 2);
                    classFileWriter.e(i2, "java/lang/String");
                    int i5 = 0;
                    for (TemplateCharacters templateCharacters : templateLiteralStrings) {
                        classFileWriter.c(i4);
                        int i6 = i5 + 1;
                        classFileWriter.r(i5);
                        if (templateCharacters.getValue() != null) {
                            classFileWriter.s(templateCharacters.getValue());
                        } else {
                            classFileWriter.c(1);
                        }
                        classFileWriter.c(83);
                        classFileWriter.c(89);
                        i5 += 2;
                        classFileWriter.r(i6);
                        classFileWriter.s(templateCharacters.getRawValue());
                        classFileWriter.c(83);
                        i4 = 89;
                    }
                    classFileWriter.c(83);
                    i3++;
                    i2 = 189;
                }
                classFileWriter.f(this.mainClassName, Token.YIELD_STAR, templateLiteralName, "[Ljava/lang/Object;");
            }
            i++;
            s = 10;
        }
        classFileWriter.t(true);
        classFileWriter.f(this.mainClassName, Token.YIELD_STAR, "_qInitDone", "Z");
        classFileWriter.c(Token.METHOD);
        classFileWriter.O(0);
    }

    private void generateCallMethod(ClassFileWriter classFileWriter, boolean z) {
        int iW;
        int paramCount;
        classFileWriter.N("call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        int iB = classFileWriter.b();
        classFileWriter.g(1);
        classFileWriter.m("org/mozilla/javascript/ScriptRuntime", Token.DOTDOTDOT, "hasTopCall", "(Lorg/mozilla/javascript/Context;)Z");
        classFileWriter.d(Token.SETELEM_OP, iB);
        int i = 0;
        classFileWriter.g(0);
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.g(3);
        classFileWriter.g(4);
        classFileWriter.t(z);
        classFileWriter.m("org/mozilla/javascript/ScriptRuntime", Token.DOTDOTDOT, "doTopCall", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Z)Ljava/lang/Object;");
        classFileWriter.c(Token.GENEXPR);
        classFileWriter.D(iB);
        classFileWriter.g(0);
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.g(3);
        classFileWriter.g(4);
        int length = this.scriptOrFnNodes.length;
        boolean z2 = 2 <= length;
        if (z2) {
            classFileWriter.p();
            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
            iW = classFileWriter.w(1, length - 1);
        } else {
            iW = 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 != length) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i2];
            if (z2) {
                if (i2 == 0) {
                    classFileWriter.H(iW);
                    i3 = classFileWriter.m;
                } else {
                    classFileWriter.G(iW, i2 - 1, i3);
                }
            }
            if (scriptNode.getType() == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                if (optFunctionNode.isTargetOfDirectCall() && (paramCount = optFunctionNode.fnode.getParamCount()) != 0) {
                    for (int i4 = i; i4 != paramCount; i4++) {
                        classFileWriter.c(190);
                        classFileWriter.r(i4);
                        int iB2 = classFileWriter.b();
                        int iB3 = classFileWriter.b();
                        classFileWriter.d(Token.TO_DOUBLE, iB2);
                        classFileWriter.g(4);
                        classFileWriter.r(i4);
                        classFileWriter.c(50);
                        classFileWriter.d(Token.LET, iB3);
                        classFileWriter.D(iB2);
                        pushUndefined(classFileWriter);
                        classFileWriter.D(iB3);
                        classFileWriter.z();
                        classFileWriter.q(0.0d);
                        classFileWriter.g(4);
                    }
                }
            }
            classFileWriter.m(this.mainClassName, Token.DOTDOTDOT, getBodyMethodName(scriptNode), getBodyMethodSignature(scriptNode));
            classFileWriter.c(Token.GENEXPR);
            i2++;
            i = 0;
        }
        classFileWriter.O(5);
    }

    private byte[] generateCode(String str) {
        boolean z = true;
        boolean z2 = this.scriptOrFnNodes[0].getType() == 150;
        ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
        if (scriptNodeArr.length <= 1 && z2) {
            z = false;
        }
        boolean zIsInStrictMode = scriptNodeArr[0].isInStrictMode();
        ClassFileWriter classFileWriter = new ClassFileWriter(this.mainClassName, SUPER_CLASS_NAME, this.scriptOrFnNodes[0].getSourceName());
        classFileWriter.k(ID_FIELD_NAME, "I", (short) 2);
        if (z) {
            generateFunctionConstructor(classFileWriter);
        }
        if (z2) {
            classFileWriter.r.add(Short.valueOf(classFileWriter.k.a("org/mozilla/javascript/Script")));
            generateScriptCtor(classFileWriter);
            generateMain(classFileWriter);
            generateExecute(classFileWriter);
        }
        generateCallMethod(classFileWriter, zIsInStrictMode);
        generateResumeGenerator(classFileWriter);
        generateNativeFunctionOverrides(classFileWriter, str);
        int length = this.scriptOrFnNodes.length;
        for (int i = 0; i != length; i++) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i];
            BodyCodegen bodyCodegen = new BodyCodegen();
            bodyCodegen.cfw = classFileWriter;
            bodyCodegen.codegen = this;
            bodyCodegen.compilerEnv = this.compilerEnv;
            bodyCodegen.scriptOrFn = scriptNode;
            bodyCodegen.scriptOrFnIndex = i;
            bodyCodegen.generateBodyCode();
            if (scriptNode.getType() == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                generateFunctionInit(classFileWriter, optFunctionNode);
                if (optFunctionNode.isTargetOfDirectCall()) {
                    emitDirectConstructor(classFileWriter, optFunctionNode);
                }
            }
        }
        emitRegExpInit(classFileWriter);
        emitTemplateLiteralInit(classFileWriter);
        emitConstantDudeInitializers(classFileWriter);
        return classFileWriter.P();
    }

    private static void generateExecute(ClassFileWriter classFileWriter) {
        classFileWriter.N("exec", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;", (short) 17);
        classFileWriter.p();
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.c(89);
        classFileWriter.c(1);
        classFileWriter.m(classFileWriter.d, Token.TEMPLATE_LITERAL_SUBST, "call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        classFileWriter.g(1);
        classFileWriter.m("org.mozilla.javascript.Context", Token.TEMPLATE_LITERAL_SUBST, "processMicrotasks", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.c(Token.GENEXPR);
        classFileWriter.O(3);
    }

    private void generateFunctionConstructor(ClassFileWriter classFileWriter) {
        int iW;
        classFileWriter.N("<init>", FUNCTION_CONSTRUCTOR_SIGNATURE, (short) 1);
        int i = 0;
        classFileWriter.g(0);
        classFileWriter.m(SUPER_CLASS_NAME, Token.TAGGED_TEMPLATE_LITERAL, "<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.p();
        classFileWriter.l(3);
        classFileWriter.f(classFileWriter.d, Token.TEMPLATE_CHARS, ID_FIELD_NAME, "I");
        classFileWriter.p();
        classFileWriter.g(2);
        classFileWriter.g(1);
        int i2 = this.scriptOrFnNodes[0].getType() == 150 ? 1 : 0;
        int length = this.scriptOrFnNodes.length;
        if (i2 == length) {
            throw badTree();
        }
        boolean z = 2 <= length - i2;
        if (z) {
            classFileWriter.l(3);
            iW = classFileWriter.w(i2 + 1, length - 1);
        } else {
            iW = 0;
        }
        for (int i3 = i2; i3 != length; i3++) {
            if (z) {
                if (i3 == i2) {
                    classFileWriter.H(iW);
                    i = classFileWriter.m;
                } else {
                    classFileWriter.G(iW, (i3 - 1) - i2, i);
                }
            }
            classFileWriter.m(this.mainClassName, Token.TAGGED_TEMPLATE_LITERAL, getFunctionInitMethodName(OptFunctionNode.get(this.scriptOrFnNodes[i3])), FUNCTION_INIT_SIGNATURE);
            classFileWriter.c(Token.METHOD);
        }
        classFileWriter.O(4);
    }

    private void generateFunctionInit(ClassFileWriter classFileWriter, OptFunctionNode optFunctionNode) {
        classFileWriter.N(getFunctionInitMethodName(optFunctionNode), FUNCTION_INIT_SIGNATURE, (short) 18);
        classFileWriter.p();
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.m("org/mozilla/javascript/NativeFunction", Token.TEMPLATE_LITERAL_SUBST, "initScriptFunction", FUNCTION_INIT_SIGNATURE);
        if (optFunctionNode.fnode.getRegexpCount() != 0) {
            classFileWriter.g(1);
            classFileWriter.m(this.mainClassName, Token.DOTDOTDOT, REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE);
        }
        if (optFunctionNode.fnode.getTemplateLiteralCount() != 0) {
            classFileWriter.m(this.mainClassName, Token.DOTDOTDOT, TEMPLATE_LITERAL_INIT_METHOD_NAME, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        }
        classFileWriter.c(Token.METHOD);
        classFileWriter.O(3);
    }

    private void generateMain(ClassFileWriter classFileWriter) {
        classFileWriter.N("main", "([Ljava/lang/String;)V", (short) 9);
        String str = classFileWriter.d;
        classFileWriter.e(Token.LAST_TOKEN, str);
        classFileWriter.c(89);
        classFileWriter.m(str, Token.TAGGED_TEMPLATE_LITERAL, "<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.c(42);
        classFileWriter.m(this.mainMethodClass, Token.DOTDOTDOT, "main", "(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V");
        classFileWriter.c(Token.METHOD);
        classFileWriter.O(1);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x016a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:79:0x0181  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e4  */
    private void generateNativeFunctionOverrides(ClassFileWriter classFileWriter, String str) {
        short s;
        int length;
        int iW;
        int i;
        int i2;
        short s2;
        ScriptNode scriptNode;
        short s3;
        int paramAndVarCount;
        short s4;
        int iW2;
        int i3;
        int paramAndVarCount2;
        boolean[] paramAndVarConst;
        int iW3;
        int i4;
        boolean z;
        short s5 = 1;
        classFileWriter.N("getLanguageVersion", "()I", (short) 1);
        classFileWriter.r(this.compilerEnv.getLanguageVersion());
        int i5 = Token.LETEXPR;
        classFileWriter.c(Token.LETEXPR);
        classFileWriter.O(1);
        int i6 = 0;
        while (i6 != 9) {
            if (i6 == 4 && str == null) {
                s2 = s5;
            } else {
                int i7 = 3;
                switch (i6) {
                    case 0:
                        classFileWriter.N("getFunctionName", "()Ljava/lang/String;", s5);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 1:
                        classFileWriter.N("getParamCount", "()I", s5);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName2 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName2);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 2:
                        classFileWriter.N("getParamAndVarCount", "()I", s5);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName3 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName3);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 3:
                        classFileWriter.N("getParamOrVarName", "(I)Ljava/lang/String;", s5);
                        s = 2;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName4 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName4);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 4:
                        classFileWriter.N("getRawSource", "()Ljava/lang/String;", s5);
                        classFileWriter.s(str);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName5 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName5);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 5:
                        classFileWriter.N("getParamOrVarConst", "(I)Z", s5);
                        s = 3;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName6 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName6);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 6:
                        classFileWriter.N("isGeneratorFunction", "()Z", (short) 4);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName7 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName7);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 7:
                        classFileWriter.N("hasRestParameter", "()Z", s5);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName8 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName8);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    case 8:
                        classFileWriter.N("hasDefaultParameters", "()Z", s5);
                        s = s5;
                        length = this.scriptOrFnNodes.length;
                        if (length > s5) {
                            classFileWriter.p();
                            classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
                            iW = classFileWriter.w(s5, length - 1);
                        } else {
                            iW = 0;
                        }
                        i = 0;
                        i2 = 0;
                        while (i != length) {
                            scriptNode = this.scriptOrFnNodes[i];
                            if (i != 0) {
                                classFileWriter.G(iW, i - 1, i2);
                            } else if (length > s5) {
                                classFileWriter.H(iW);
                                i2 = classFileWriter.m;
                            }
                            switch (i6) {
                                case 0:
                                    s3 = s5;
                                    if (scriptNode.getType() == 150) {
                                        classFileWriter.s("");
                                    } else {
                                        classFileWriter.s(((FunctionNode) scriptNode).getName());
                                    }
                                    classFileWriter.c(Token.GENEXPR);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 1:
                                    if (scriptNode.hasRestParameter()) {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount() - 1);
                                    } else {
                                        s3 = 1;
                                        classFileWriter.r(scriptNode.getParamCount());
                                    }
                                    classFileWriter.c(i5);
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 2:
                                    classFileWriter.r(scriptNode.getParamAndVarCount());
                                    i5 = Token.LETEXPR;
                                    classFileWriter.c(Token.LETEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 3:
                                    paramAndVarCount = scriptNode.getParamAndVarCount();
                                    if (paramAndVarCount != 0) {
                                        s4 = 1;
                                        if (paramAndVarCount != 1) {
                                            classFileWriter.l(1);
                                            iW2 = classFileWriter.w(1, paramAndVarCount - 1);
                                            i3 = 0;
                                            while (i3 != paramAndVarCount) {
                                                if (classFileWriter.m != 0) {
                                                    Kit.codeBug();
                                                }
                                                String paramOrVarName9 = scriptNode.getParamOrVarName(i3);
                                                if (i3 == 0) {
                                                    classFileWriter.H(iW2);
                                                } else {
                                                    classFileWriter.G(iW2, i3 - 1, 0);
                                                }
                                                classFileWriter.s(paramOrVarName9);
                                                classFileWriter.c(Token.GENEXPR);
                                                i3++;
                                                i5 = Token.LETEXPR;
                                            }
                                            s3 = 1;
                                            i++;
                                            s5 = s3;
                                            i7 = 3;
                                        } else {
                                            classFileWriter.s(scriptNode.getParamOrVarName(0));
                                            classFileWriter.c(Token.GENEXPR);
                                        }
                                    } else {
                                        s4 = 1;
                                        classFileWriter.c(1);
                                        classFileWriter.c(Token.GENEXPR);
                                    }
                                    s3 = s4;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 4:
                                    classFileWriter.r(scriptNode.getRawSourceStart());
                                    classFileWriter.r(scriptNode.getRawSourceEnd());
                                    classFileWriter.m("java/lang/String", Token.TEMPLATE_LITERAL_SUBST, "substring", "(II)Ljava/lang/String;");
                                    classFileWriter.c(Token.GENEXPR);
                                    s3 = 1;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 5:
                                    paramAndVarCount2 = scriptNode.getParamAndVarCount();
                                    paramAndVarConst = scriptNode.getParamAndVarConst();
                                    if (paramAndVarCount2 == 0) {
                                        classFileWriter.c(i7);
                                        classFileWriter.c(i5);
                                    } else if (paramAndVarCount2 == s5) {
                                        classFileWriter.t(paramAndVarConst[0]);
                                        classFileWriter.c(i5);
                                    } else {
                                        classFileWriter.l(s5);
                                        iW3 = classFileWriter.w(s5, paramAndVarCount2 - 1);
                                        i4 = 0;
                                        while (i4 != paramAndVarCount2) {
                                            if (classFileWriter.m != 0) {
                                                Kit.codeBug();
                                            }
                                            if (i4 == 0) {
                                                classFileWriter.H(iW3);
                                            } else {
                                                classFileWriter.G(iW3, i4 - 1, 0);
                                            }
                                            classFileWriter.t(paramAndVarConst[i4]);
                                            classFileWriter.c(i5);
                                            i4++;
                                            s5 = 1;
                                        }
                                    }
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 6:
                                    if (scriptNode instanceof FunctionNode) {
                                        classFileWriter.t(((FunctionNode) scriptNode).isES6Generator());
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 7:
                                    classFileWriter.t(scriptNode.hasRestParameter());
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                case 8:
                                    if (scriptNode instanceof FunctionNode) {
                                        if (scriptNode.getDefaultParams() != null) {
                                            z = s5;
                                        } else {
                                            z = false;
                                        }
                                        classFileWriter.t(z);
                                    } else {
                                        classFileWriter.c(i7);
                                    }
                                    classFileWriter.c(i5);
                                    s3 = s5;
                                    i++;
                                    s5 = s3;
                                    i7 = 3;
                                    break;
                                default:
                                    throw Kit.codeBug();
                            }
                        }
                        s2 = s5;
                        classFileWriter.O(s);
                        break;
                    default:
                        throw Kit.codeBug();
                }
            }
            i6++;
            s5 = s2;
        }
    }

    private void generateResumeGenerator(ClassFileWriter classFileWriter) {
        int i = 0;
        boolean z = false;
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            if (isGenerator(scriptNode)) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        classFileWriter.N("resumeGenerator", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        classFileWriter.g(0);
        classFileWriter.g(1);
        classFileWriter.g(2);
        classFileWriter.g(4);
        classFileWriter.g(5);
        classFileWriter.l(3);
        classFileWriter.p();
        classFileWriter.f(classFileWriter.d, 180, ID_FIELD_NAME, "I");
        int iW = classFileWriter.w(0, this.scriptOrFnNodes.length - 1);
        classFileWriter.H(iW);
        int iB = classFileWriter.b();
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i >= scriptNodeArr.length) {
                classFileWriter.D(iB);
                pushUndefined(classFileWriter);
                classFileWriter.c(Token.GENEXPR);
                classFileWriter.O(6);
                return;
            }
            ScriptNode scriptNode2 = scriptNodeArr[i];
            classFileWriter.G(iW, i, 6);
            if (isGenerator(scriptNode2)) {
                classFileWriter.m(this.mainClassName, Token.DOTDOTDOT, g.c(getBodyMethodName(scriptNode2), "_gen"), a.q("(", this.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;"));
                classFileWriter.c(Token.GENEXPR);
            } else {
                classFileWriter.d(Token.LET, iB);
            }
            i++;
        }
    }

    private static void generateScriptCtor(ClassFileWriter classFileWriter) {
        classFileWriter.N("<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 1);
        classFileWriter.p();
        classFileWriter.m(SUPER_CLASS_NAME, Token.TAGGED_TEMPLATE_LITERAL, "<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.p();
        classFileWriter.r(0);
        classFileWriter.f(classFileWriter.d, Token.TEMPLATE_CHARS, ID_FIELD_NAME, "I");
        classFileWriter.c(Token.METHOD);
        classFileWriter.O(1);
    }

    private static String getStaticConstantWrapperType(double d) {
        return ((double) ((int) d)) == d ? "Ljava/lang/Integer;" : "Ljava/lang/Double;";
    }

    private static void initOptFunctions_r(ScriptNode scriptNode) {
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            FunctionNode functionNode = scriptNode.getFunctionNode(i);
            new OptFunctionNode(functionNode);
            initOptFunctions_r(functionNode);
        }
    }

    private void initScriptNodesData(ScriptNode scriptNode) {
        ArrayList arrayList = new ArrayList();
        collectScriptNodes_r(scriptNode, arrayList);
        int size = arrayList.size();
        ScriptNode[] scriptNodeArr = new ScriptNode[size];
        this.scriptOrFnNodes = scriptNodeArr;
        arrayList.toArray(scriptNodeArr);
        this.scriptOrFnIndexes = new HashMap<>();
        for (int i = 0; i != size; i++) {
            this.scriptOrFnIndexes.put(this.scriptOrFnNodes[i], Integer.valueOf(i));
        }
    }

    public static boolean isGenerator(ScriptNode scriptNode) {
        return scriptNode.getType() == 122 && ((FunctionNode) scriptNode).isGenerator();
    }

    public static void pushUndefined(ClassFileWriter classFileWriter) {
        classFileWriter.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
    }

    private void transform(ScriptNode scriptNode) {
        initOptFunctions_r(scriptNode);
        boolean zIsInterpretedMode = this.compilerEnv.isInterpretedMode();
        HashMap map = null;
        if (!zIsInterpretedMode && scriptNode.getType() == 150) {
            int functionCount = scriptNode.getFunctionCount();
            for (int i = 0; i != functionCount; i++) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode, i);
                if (optFunctionNode.fnode.getFunctionType() == 1) {
                    String name = optFunctionNode.fnode.getName();
                    if (name.length() != 0) {
                        if (map == null) {
                            map = new HashMap();
                        }
                        map.put(name, optFunctionNode);
                    }
                }
            }
        }
        if (map != null) {
            this.directCallTargets = new ArrayList();
        }
        new OptTransformer(map, this.directCallTargets).transform(scriptNode, this.compilerEnv);
        if (zIsInterpretedMode) {
            return;
        }
        new Optimizer().optimize(scriptNode);
    }

    @Override // org.mozilla.javascript.Evaluator
    public void captureStackInfo(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    public String cleanName(ScriptNode scriptNode) {
        if (!(scriptNode instanceof FunctionNode)) {
            return "script";
        }
        Name functionName = ((FunctionNode) scriptNode).getFunctionName();
        return functionName == null ? "anonymous" : functionName.getIdentifier();
    }

    @Override // org.mozilla.javascript.Evaluator
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z) {
        int i;
        synchronized (globalLock) {
            i = globalSerialClassCounter + 1;
            globalSerialClassCounter = i;
        }
        String strReplaceAll = "c";
        if (scriptNode.getSourceName().length() > 0) {
            strReplaceAll = scriptNode.getSourceName().replaceAll("\\W", "_");
            if (!Character.isJavaIdentifierStart(strReplaceAll.charAt(0))) {
                strReplaceAll = "_".concat(strReplaceAll);
            }
        }
        String str2 = "org.mozilla.javascript.gen." + strReplaceAll + "_" + i;
        return new Object[]{str2, compileToClassFile(compilerEnvirons, str2, scriptNode, str, z)};
    }

    public byte[] compileToClassFile(CompilerEnvirons compilerEnvirons, String str, ScriptNode scriptNode, String str2, boolean z) {
        this.compilerEnv = compilerEnvirons;
        transform(scriptNode);
        if (z) {
            scriptNode = scriptNode.getFunctionNode(0);
        }
        initScriptNodesData(scriptNode);
        this.mainClassName = str;
        int i = ClassFileWriter.E;
        int length = str.length();
        int i2 = length + 1;
        int i3 = length + 2;
        char[] cArr = new char[i3];
        cArr[0] = 'L';
        cArr[i2] = ';';
        str.getChars(0, length, cArr, 1);
        for (int i4 = 1; i4 != i2; i4++) {
            if (cArr[i4] == '.') {
                cArr[i4] = '/';
            }
        }
        this.mainClassSignature = new String(cArr, 0, i3);
        return generateCode(str2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2) {
        try {
            return (NativeFunction) defineClass(obj, obj2).getConstructors()[0].newInstance(scriptable, context, 0);
        } catch (Exception e) {
            c.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Unable to instantiate compiled class:", e.toString()));
            return null;
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public Script createScriptObject(Object obj, Object obj2) {
        try {
            return (Script) defineClass(obj, obj2).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            c.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Unable to instantiate compiled class:", e.toString()));
            return null;
        }
    }

    public String getBodyMethodName(ScriptNode scriptNode) {
        return "_c_" + cleanName(scriptNode) + "_" + getIndex(scriptNode);
    }

    public String getBodyMethodSignature(ScriptNode scriptNode) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.mainClassSignature);
        sb.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;");
        if (scriptNode.getType() == 122) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
            if (optFunctionNode.isTargetOfDirectCall()) {
                int paramCount = optFunctionNode.fnode.getParamCount();
                for (int i = 0; i != paramCount; i++) {
                    sb.append("Ljava/lang/Object;D");
                }
            }
        }
        sb.append("[Ljava/lang/Object;)Ljava/lang/Object;");
        return sb.toString();
    }

    public String getCompiledRegexpName(ScriptNode scriptNode, int i) {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("_re", getIndex(scriptNode), "_", i);
    }

    public String getDirectCtorName(ScriptNode scriptNode) {
        return a.l(getIndex(scriptNode), "_n");
    }

    public String getFunctionInitMethodName(OptFunctionNode optFunctionNode) {
        return a.l(getIndex(optFunctionNode.fnode), "_i");
    }

    public int getIndex(ScriptNode scriptNode) {
        return this.scriptOrFnIndexes.get(scriptNode).intValue();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getPatchedStack(RhinoException rhinoException, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public List<String> getScriptStack(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getSourcePositionFromStack(Context context, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public String getTemplateLiteralName(ScriptNode scriptNode) {
        return a.l(getIndex(scriptNode), "_q");
    }

    public void pushNumberAsObject(ClassFileWriter classFileWriter, double d) {
        if (d == 0.0d) {
            if (1.0d / d > 0.0d) {
                classFileWriter.f("org/mozilla/javascript/ScriptRuntime", Token.ARROW, "zeroObj", "Ljava/lang/Integer;");
                return;
            } else {
                classFileWriter.q(d);
                addDoubleWrap(classFileWriter);
                return;
            }
        }
        if (d == 1.0d) {
            classFileWriter.f("org/mozilla/javascript/optimizer/OptRuntime", Token.ARROW, "oneObj", "Ljava/lang/Integer;");
            return;
        }
        if (d == -1.0d) {
            classFileWriter.f("org/mozilla/javascript/optimizer/OptRuntime", Token.ARROW, "minusOneObj", "Ljava/lang/Integer;");
            return;
        }
        if (Double.isNaN(d)) {
            classFileWriter.f("org/mozilla/javascript/ScriptRuntime", Token.ARROW, "NaNobj", "Ljava/lang/Double;");
            return;
        }
        int i = this.itsConstantListSize;
        if (i >= 2000) {
            classFileWriter.q(d);
            addDoubleWrap(classFileWriter);
            return;
        }
        int i2 = 0;
        if (i == 0) {
            this.itsConstantList = new double[64];
        } else {
            double[] dArr = this.itsConstantList;
            int i3 = 0;
            while (i3 != i && dArr[i3] != d) {
                i3++;
            }
            if (i == dArr.length) {
                double[] dArr2 = new double[i * 2];
                System.arraycopy(this.itsConstantList, 0, dArr2, 0, i);
                this.itsConstantList = dArr2;
            }
            i2 = i3;
        }
        if (i2 == i) {
            this.itsConstantList[i] = d;
            this.itsConstantListSize = i + 1;
        }
        classFileWriter.f(this.mainClassName, Token.ARROW, a.l(i2, "_k"), getStaticConstantWrapperType(d));
    }

    @Override // org.mozilla.javascript.Evaluator
    public void setEvalScriptFlag(Script script) {
        throw new UnsupportedOperationException();
    }

    public void setMainMethodClass(String str) {
        this.mainMethodClass = str;
    }
}
