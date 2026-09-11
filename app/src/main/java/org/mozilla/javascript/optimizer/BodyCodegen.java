package org.mozilla.javascript.optimizer;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import coil3.compose.internal.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.luminis.tls.engine.impl.c;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.e;
import org.mozilla.classfile.g;
import org.mozilla.classfile.h;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.ScriptNode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class BodyCodegen {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ECMAERROR_EXCEPTION = 2;
    private static final int EVALUATOR_EXCEPTION = 1;
    private static final int EXCEPTION_MAX = 5;
    private static final int FINALLY_EXCEPTION = 4;
    static final int GENERATOR_START = 0;
    static final int GENERATOR_TERMINATE = -1;
    static final int GENERATOR_YIELD_START = 1;
    private static final int JAVASCRIPT_EXCEPTION = 0;
    private static final int MAX_LOCALS = 1024;
    private static final String SIGNATURE_CALL0 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final String SIGNATURE_CALL1 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final String SIGNATURE_CALL2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final String SIGNATURE_CALLN = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
    private static final int THROWABLE_EXCEPTION = 3;
    private int argsLocal;
    ClassFileWriter cfw;
    Codegen codegen;
    CompilerEnvirons compilerEnv;
    private int contextLocal;
    private int enterAreaStartLabel;
    private int epilogueLabel;
    private Map<Node, FinallyReturnPoint> finallys;
    private int firstFreeLocal;
    private OptFunctionNode fnCurrent;
    private int funObjLocal;
    private int generatorStateLocal;
    private int generatorSwitch;
    private boolean hasVarsInRegs;
    private boolean inDirectCallFunction;
    private boolean inLocalBlock;
    private boolean isGenerator;
    private boolean itsForcedObjectParameters;
    private int itsLineNumber;
    private int itsOneArgArray;
    private int itsZeroArgArray;
    private ArrayList<Node> literals;
    private int[] locals;
    private int localsMax;
    private int operationLocal;
    private int popvLocal;
    private int savedCodeOffset;
    private int savedHomeObjectLocal;
    ScriptNode scriptOrFn;
    public int scriptOrFnIndex;
    private int thisObjLocal;
    private int[] varRegisters;
    private int variableObjectLocal;
    private ExceptionManager exceptionManager = new ExceptionManager();
    private int maxLocals = 0;
    private int maxStack = 0;
    private int unnestedYieldCount = 0;
    private IdentityHashMap<Node, String> unnestedYields = new IdentityHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public class ExceptionManager {
        private ArrayDeque<ExceptionInfo> exceptionInfo = new ArrayDeque<>();

        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public class ExceptionInfo {
            Node finallyBlock;
            int[] handlerLabels = new int[5];
            int[] exceptionStarts = new int[5];
            Node currentFinally = null;

            public ExceptionInfo(Jump jump, Node node) {
                this.finallyBlock = node;
            }
        }

        public ExceptionManager() {
        }

        private void endCatch(ExceptionInfo exceptionInfo, int i, int i2) {
            int i3 = exceptionInfo.exceptionStarts[i];
            if (i3 == 0) {
                c.r("bad exception start");
            } else if (BodyCodegen.this.cfw.C(i3) != BodyCodegen.this.cfw.C(i2)) {
                BodyCodegen.this.cfw.j(exceptionInfo.exceptionStarts[i], BodyCodegen.exceptionTypeToName(i), i2, exceptionInfo.handlerLabels[i]);
            }
        }

        private ExceptionInfo getTop() {
            return this.exceptionInfo.getLast();
        }

        public void addHandler(int i, int i2, int i3) {
            ExceptionInfo top = getTop();
            top.handlerLabels[i] = i2;
            top.exceptionStarts[i] = i3;
        }

        public void markInlineFinallyEnd(Node node, int i) {
            Iterator<ExceptionInfo> itDescendingIterator = this.exceptionInfo.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                ExceptionInfo next = itDescendingIterator.next();
                for (int i2 = 0; i2 < 5; i2++) {
                    if (next.handlerLabels[i2] != 0 && next.currentFinally == node) {
                        next.exceptionStarts[i2] = i;
                        next.currentFinally = null;
                    }
                }
                if (next.finallyBlock == node) {
                    return;
                }
            }
        }

        public void markInlineFinallyStart(Node node, int i) {
            Iterator<ExceptionInfo> itDescendingIterator = this.exceptionInfo.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                ExceptionInfo next = itDescendingIterator.next();
                for (int i2 = 0; i2 < 5; i2++) {
                    if (next.handlerLabels[i2] != 0 && next.currentFinally == null) {
                        endCatch(next, i2, i);
                        next.exceptionStarts[i2] = 0;
                        next.currentFinally = node;
                    }
                }
                if (next.finallyBlock == node) {
                    return;
                }
            }
        }

        public void popExceptionInfo() {
            this.exceptionInfo.removeLast();
        }

        public void pushExceptionInfo(Jump jump) {
            this.exceptionInfo.add(new ExceptionInfo(jump, BodyCodegen.getFinallyAtTarget(jump.getFinally())));
        }

        public int removeHandler(int i, int i2) {
            ExceptionInfo top = getTop();
            int i3 = top.handlerLabels[i];
            if (i3 == 0) {
                return 0;
            }
            endCatch(top, i, i2);
            top.handlerLabels[i] = 0;
            return i3;
        }

        public void setHandlers(int[] iArr, int i) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    addHandler(i2, i3, i);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class FinallyReturnPoint {
        public List<Integer> jsrPoints = new ArrayList();
        public int tableLabel = 0;
    }

    private void addDoubleWrap() {
        addOptRuntimeInvoke("wrapDouble", "(D)Ljava/lang/Double;");
    }

    private void addDynamicInvoke(String str, String str2) {
        ClassFileWriter classFileWriter = this.cfw;
        e eVar = Bootstrapper.BOOTSTRAP_HANDLE;
        Object[] objArr = new Object[0];
        classFileWriter.getClass();
        if (ClassFileWriter.E < 51) {
            org.mozilla.javascript.c.b("Please build and run with JDK 1.7 for invokedynamic support");
            return;
        }
        int iL = classFileWriter.m + ((short) ClassFileWriter.L(str2));
        if (iL < 0 || 32767 < iL) {
            ClassFileWriter.A(iL);
            throw null;
        }
        org.mozilla.classfile.c cVar = new org.mozilla.classfile.c(classFileWriter, eVar, objArr);
        if (classFileWriter.B == null) {
            classFileWriter.B = new ArrayList();
        }
        int iIndexOf = classFileWriter.B.indexOf(cVar);
        if (iIndexOf == -1) {
            iIndexOf = classFileWriter.B.size();
            classFileWriter.B.add(cVar);
            classFileWriter.C += cVar.a.length;
        }
        h hVar = classFileWriter.k;
        hVar.getClass();
        g gVar = new g();
        gVar.a = iIndexOf;
        gVar.b = str;
        gVar.c = str2;
        gVar.d = ((str2.hashCode() * str.hashCode()) + iIndexOf) ^ 18;
        HashMap map = hVar.g;
        int iIntValue = ((Integer) map.getOrDefault(gVar, -1)).intValue();
        if (iIntValue == -1) {
            short sH = hVar.h(str, str2);
            hVar.j(5);
            byte[] bArr = hVar.l;
            int i = hVar.h;
            int i2 = i + 1;
            hVar.h = i2;
            bArr[i] = 18;
            int I = ClassFileWriter.I(bArr, iIndexOf, i2);
            hVar.h = I;
            hVar.h = ClassFileWriter.I(hVar.l, sH, I);
            iIntValue = hVar.i;
            hVar.i = iIntValue + 1;
            map.put(gVar, Integer.valueOf(iIntValue));
            hVar.m(iIntValue, str2);
            hVar.k.put(Integer.valueOf(iIntValue), (byte) 18);
        }
        classFileWriter.x(Token.QUESTION_DOT);
        classFileWriter.y((short) iIntValue);
        classFileWriter.y(0);
        short s = (short) iL;
        classFileWriter.m = s;
        if (iL > classFileWriter.n) {
            classFileWriter.n = s;
        }
    }

    private void addGoto(Node node, int i) {
        this.cfw.d(i, getTargetLabel(node));
    }

    private void addGotoWithReturn(Node node) {
        FinallyReturnPoint finallyReturnPoint = this.finallys.get(node);
        this.cfw.o(finallyReturnPoint.jsrPoints.size());
        addGoto(node, Token.LET);
        this.cfw.c(87);
        int iB = this.cfw.b();
        this.cfw.D(iB);
        finallyReturnPoint.jsrPoints.add(Integer.valueOf(iB));
    }

    private void addInstructionCount(int i) {
        this.cfw.g(this.contextLocal);
        this.cfw.r(i);
        addScriptRuntimeInvoke("addInstructionCount", "(Lorg/mozilla/javascript/Context;I)V");
    }

    private void addJumpedBooleanWrap(int i, int i2) {
        this.cfw.D(i2);
        int iB = this.cfw.b();
        this.cfw.f("java/lang/Boolean", Token.ARROW, "FALSE", "Ljava/lang/Boolean;");
        this.cfw.d(Token.LET, iB);
        this.cfw.D(i);
        this.cfw.f("java/lang/Boolean", Token.ARROW, "TRUE", "Ljava/lang/Boolean;");
        this.cfw.D(iB);
        this.cfw.z();
    }

    private void addLoadProperty(Node node, Node node2, Object[] objArr, int i) {
        int i2 = 0;
        if (i == 0) {
            addNewObjectArray(0);
            addNewObjectArray(0);
            return;
        }
        if (this.isGenerator) {
            while (i2 < i) {
                addLoadPropertyId(node, objArr, i2);
                addLoadPropertyValue(node, node2);
                node2 = node2.getNext();
                i2++;
            }
            int i3 = this.firstFreeLocal;
            int i4 = i3 + 1;
            int i5 = this.localsMax;
            this.firstFreeLocal = i3 + 2;
            this.localsMax = i5 + 2;
            addNewObjectArray(i);
            this.cfw.h(i3);
            addNewObjectArray(i);
            this.cfw.h(i4);
            while (true) {
                i--;
                ClassFileWriter classFileWriter = this.cfw;
                if (i < 0) {
                    classFileWriter.g(i3);
                    this.cfw.g(i4);
                    return;
                }
                classFileWriter.g(i4);
                this.cfw.c(95);
                this.cfw.o(i);
                this.cfw.c(95);
                this.cfw.c(83);
                this.cfw.g(i3);
                this.cfw.c(95);
                this.cfw.o(i);
                this.cfw.c(95);
                this.cfw.c(83);
            }
        } else {
            addNewObjectArray(i);
            addNewObjectArray(i);
            while (true) {
                ClassFileWriter classFileWriter2 = this.cfw;
                if (i2 >= i) {
                    classFileWriter2.c(95);
                    return;
                }
                classFileWriter2.c(92);
                this.cfw.o(i2);
                addLoadPropertyId(node, objArr, i2);
                this.cfw.c(83);
                this.cfw.o(i2);
                addLoadPropertyValue(node, node2);
                this.cfw.c(83);
                node2 = node2.getNext();
                i2++;
            }
        }
    }

    private void addLoadPropertyId(Node node, Object[] objArr, int i) {
        Object obj = objArr[i];
        if (obj instanceof Node) {
            generateExpression(((Node) obj).getFirstChild(), node);
            return;
        }
        boolean z = obj instanceof String;
        ClassFileWriter classFileWriter = this.cfw;
        if (z) {
            classFileWriter.s((String) obj);
        } else {
            classFileWriter.r(((Integer) obj).intValue());
            addScriptRuntimeInvoke("wrapInt", "(I)Ljava/lang/Integer;");
        }
    }

    private void addLoadPropertyValue(Node node, Node node2) {
        int type = node2.getType();
        if (type == 165 || type == 166 || type == 177) {
            generateExpression(node2.getFirstChild(), node);
        } else {
            generateExpression(node2, node);
        }
    }

    private void addNewObjectArray(int i) {
        if (i != 0) {
            this.cfw.r(i);
            this.cfw.e(189, "java/lang/Object");
            return;
        }
        int i2 = this.itsZeroArgArray;
        ClassFileWriter classFileWriter = this.cfw;
        if (i2 >= 0) {
            classFileWriter.g(i2);
        } else {
            classFileWriter.f("org/mozilla/javascript/ScriptRuntime", Token.ARROW, "emptyArgs", "[Ljava/lang/Object;");
        }
    }

    private void addObjectToDouble() {
        addDynamicInvoke("MATH:TONUMBER", Signatures.MATH_TO_NUMBER);
    }

    private void addObjectToNumeric() {
        addDynamicInvoke("MATH:TONUMERIC", Signatures.MATH_TO_NUMERIC);
    }

    private void addOptRuntimeInvoke(String str, String str2) {
        this.cfw.m("org/mozilla/javascript/optimizer/OptRuntime", Token.DOTDOTDOT, str, str2);
    }

    private void addScriptRuntimeInvoke(String str, String str2) {
        this.cfw.m("org.mozilla.javascript.ScriptRuntime", Token.DOTDOTDOT, str, str2);
    }

    private static int countArguments(Node node) {
        int i = 0;
        while (node != null) {
            i++;
            node = node.getNext();
        }
        return i;
    }

    private void dcpLoadAsNumber(int i) {
        this.cfw.g(i);
        this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
        int iB = this.cfw.b();
        this.cfw.d(Token.GET, iB);
        ClassFileWriter classFileWriter = this.cfw;
        int i2 = classFileWriter.m;
        classFileWriter.g(i);
        addObjectToDouble();
        int iB2 = this.cfw.b();
        this.cfw.d(Token.LET, iB2);
        this.cfw.E(iB, i2);
        this.cfw.i(i + 1);
        this.cfw.D(iB2);
    }

    private void dcpLoadAsObject(int i) {
        this.cfw.g(i);
        this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
        int iB = this.cfw.b();
        this.cfw.d(Token.GET, iB);
        ClassFileWriter classFileWriter = this.cfw;
        int i2 = classFileWriter.m;
        classFileWriter.g(i);
        int iB2 = this.cfw.b();
        this.cfw.d(Token.LET, iB2);
        this.cfw.E(iB, i2);
        this.cfw.i(i + 1);
        addDoubleWrap();
        this.cfw.D(iB2);
    }

    private void decReferenceWordLocal(int i) {
        int[] iArr = this.locals;
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String exceptionTypeToName(int i) {
        if (i == 0) {
            return "org/mozilla/javascript/JavaScriptException";
        }
        if (i == 1) {
            return "org/mozilla/javascript/EvaluatorException";
        }
        if (i == 2) {
            return "org/mozilla/javascript/EcmaError";
        }
        if (i == 3) {
            return "java/lang/Throwable";
        }
        if (i == 4) {
            return null;
        }
        throw Kit.codeBug();
    }

    private Node findNestedYield(Node node) {
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            if (firstChild.getType() == 78 || firstChild.getType() == 179) {
                return firstChild;
            }
            Node nodeFindNestedYield = findNestedYield(firstChild);
            if (nodeFindNestedYield != null) {
                return nodeFindNestedYield;
            }
        }
        return null;
    }

    private void finishGetElemGeneration(Node node, Node node2) {
        generateExpression(node2.getNext(), node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (node.getIntProp(31, 0) == 1) {
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke("PROP:GETELEMENTSUPER", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
        } else if (node.getIntProp(8, -1) != -1) {
            addDynamicInvoke("PROP:GETINDEX", Signatures.PROP_GET_INDEX);
        } else {
            addDynamicInvoke("PROP:GETELEMENT", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        }
    }

    private void finishGetPropGeneration(Node node, Node node2) {
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (node.getIntProp(31, 0) == 1) {
            this.cfw.g(this.thisObjLocal);
            this.cfw.o(node.getType() == 34 ? 1 : 0);
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:GETSUPER:", node2.getString()), Signatures.PROP_GET_SUPER);
        } else if (node.getType() == 34) {
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:GETNOWARN:", node2.getString()), "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        } else {
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:GET:", node2.getString()), "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        }
    }

    private void finishGetRefGeneration() {
        this.cfw.g(this.contextLocal);
        addScriptRuntimeInvoke("refGet", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
    }

    private void finishRefSpecialGeneration(Node node) {
        this.cfw.s((String) node.getProp(17));
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("specialRef", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Ref;");
    }

    private void genSimpleCompare(int i, int i2, int i3) {
        if (i2 == -1) {
            throw Codegen.badTree();
        }
        switch (i) {
            case 14:
                this.cfw.c(Token.USE_STACK);
                this.cfw.d(Token.LOCAL_BLOCK, i2);
                break;
            case 15:
                this.cfw.c(Token.USE_STACK);
                this.cfw.d(Token.COLONCOLON, i2);
                break;
            case 16:
                this.cfw.c(Token.TYPEOFNAME);
                this.cfw.d(Token.DOTDOT, i2);
                break;
            case 17:
                this.cfw.c(Token.TYPEOFNAME);
                this.cfw.d(Token.SET_REF_OP, i2);
                break;
            default:
                throw Codegen.badTree();
        }
        if (i3 != -1) {
            this.cfw.d(Token.LET, i3);
        }
    }

    private void generateActivationExit() {
        if (this.fnCurrent == null || this.hasVarsInRegs) {
            throw Kit.codeBug();
        }
        this.cfw.g(this.contextLocal);
        addScriptRuntimeInvoke("exitActivationFunction", "(Lorg/mozilla/javascript/Context;)V");
    }

    private void generateArrayLiteralFactory(Node node, int i) {
        String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + i;
        initBodyGeneration();
        int i2 = this.firstFreeLocal;
        int i3 = i2 + 1;
        this.firstFreeLocal = i3;
        this.argsLocal = i2;
        this.localsMax = i3;
        this.cfw.N(str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short) 2);
        visitArrayLiteral(node, node.getFirstChild(), true);
        this.cfw.c(Token.GENEXPR);
        this.cfw.O((short) (this.localsMax + 1));
    }

    private void generateCallArgArray(Node node, Node node2, boolean z) {
        int i;
        int iCountArguments = countArguments(node2);
        if (iCountArguments != 1 || (i = this.itsOneArgArray) < 0) {
            addNewObjectArray(iCountArguments);
        } else {
            this.cfw.g(i);
        }
        for (int i2 = 0; i2 != iCountArguments; i2++) {
            if (!this.isGenerator) {
                this.cfw.c(89);
                this.cfw.r(i2);
            }
            if (z) {
                int iNodeIsDirectCallParameter = nodeIsDirectCallParameter(node2);
                if (iNodeIsDirectCallParameter >= 0) {
                    dcpLoadAsObject(iNodeIsDirectCallParameter);
                } else {
                    generateExpression(node2, node);
                    if (node2.getIntProp(8, -1) == 0) {
                        addDoubleWrap();
                    }
                }
            } else {
                generateExpression(node2, node);
            }
            if (this.isGenerator) {
                short newWordLocal = getNewWordLocal();
                this.cfw.h(newWordLocal);
                this.cfw.e(192, "[Ljava/lang/Object;");
                this.cfw.c(89);
                this.cfw.r(i2);
                this.cfw.g(newWordLocal);
                releaseWordLocal(newWordLocal);
            }
            this.cfw.c(83);
            node2 = node2.getNext();
        }
    }

    private void generateCatchBlock(int i, short s, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = this.cfw.b();
        }
        ClassFileWriter classFileWriter = this.cfw;
        classFileWriter.m = 1;
        classFileWriter.D(i4);
        this.cfw.h(i3);
        this.cfw.g(s);
        this.cfw.h(this.variableObjectLocal);
        this.cfw.d(Token.LET, i2);
    }

    private void generateCheckForThrowOrClose(int i, boolean z, int i2) {
        int iB = this.cfw.b();
        int iB2 = this.cfw.b();
        this.cfw.D(iB);
        this.cfw.g(this.argsLocal);
        generateThrowJavaScriptException();
        this.cfw.D(iB2);
        this.cfw.g(this.argsLocal);
        this.cfw.e(192, "java/lang/Throwable");
        this.cfw.c(191);
        if (i != -1) {
            this.cfw.D(i);
        }
        if (!z) {
            this.cfw.F(this.generatorSwitch, i2);
        }
        this.cfw.l(this.operationLocal);
        this.cfw.o(2);
        this.cfw.d(Token.XML, iB2);
        this.cfw.l(this.operationLocal);
        this.cfw.o(1);
        this.cfw.d(Token.XML, iB);
    }

    private void generateEpilogue() {
        ClassFileWriter classFileWriter;
        if (this.compilerEnv.isGenerateObserverCount()) {
            addInstructionCount();
        }
        if (this.isGenerator) {
            Map<Node, int[]> liveLocals = ((FunctionNode) this.scriptOrFn).getLiveLocals();
            if (liveLocals != null) {
                for (Node node : ((FunctionNode) this.scriptOrFn).getResumptionPoints()) {
                    int[] iArr = liveLocals.get(node);
                    if (iArr != null) {
                        this.cfw.F(this.generatorSwitch, getNextGeneratorState(node));
                        generateGetGeneratorLocalsState();
                        int i = 0;
                        while (true) {
                            int length = iArr.length;
                            classFileWriter = this.cfw;
                            if (i >= length) {
                                break;
                            }
                            classFileWriter.c(89);
                            this.cfw.o(i);
                            this.cfw.c(50);
                            this.cfw.h(iArr[i]);
                            i++;
                        }
                        classFileWriter.c(87);
                        this.cfw.d(Token.LET, getTargetLabel(node));
                    }
                }
            }
            Map<Node, FinallyReturnPoint> map = this.finallys;
            if (map != null) {
                for (Map.Entry<Node, FinallyReturnPoint> entry : map.entrySet()) {
                    if (entry.getKey().getType() == 138) {
                        FinallyReturnPoint value = entry.getValue();
                        this.cfw.E(value.tableLabel, 1);
                        int iW = this.cfw.w(0, value.jsrPoints.size() - 1);
                        this.cfw.H(iW);
                        int i2 = 0;
                        for (int i3 = 0; i3 < value.jsrPoints.size(); i3++) {
                            this.cfw.F(iW, i2);
                            this.cfw.d(Token.LET, value.jsrPoints.get(i3).intValue());
                            i2++;
                        }
                    }
                }
            }
        }
        int i4 = this.epilogueLabel;
        if (i4 != -1) {
            this.cfw.D(i4);
        }
        if (this.isGenerator) {
            if (((FunctionNode) this.scriptOrFn).getResumptionPoints() != null) {
                this.cfw.H(this.generatorSwitch);
            }
            generateSetGeneratorResumptionPoint(-1);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.generatorStateLocal);
            addOptRuntimeInvoke("throwStopIteration", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            Codegen.pushUndefined(this.cfw);
            this.cfw.c(Token.GENEXPR);
            return;
        }
        if (this.hasVarsInRegs) {
            this.cfw.c(Token.GENEXPR);
            return;
        }
        if (this.fnCurrent == null) {
            this.cfw.g(this.popvLocal);
            this.cfw.c(Token.GENEXPR);
            return;
        }
        generateActivationExit();
        this.cfw.c(Token.GENEXPR);
        int iB = this.cfw.b();
        ClassFileWriter classFileWriter2 = this.cfw;
        classFileWriter2.m = 1;
        classFileWriter2.D(iB);
        short newWordLocal = getNewWordLocal();
        this.cfw.h(newWordLocal);
        generateActivationExit();
        this.cfw.g(newWordLocal);
        releaseWordLocal(newWordLocal);
        this.cfw.c(191);
        this.cfw.j(this.enterAreaStartLabel, null, this.epilogueLabel, iB);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:174:0x0512  */
    /* JADX WARN: Code duplicated, block: B:190:0x056a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0573  */
    /* JADX WARN: Code duplicated, block: B:194:0x057d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0581  */
    /* JADX WARN: Code duplicated, block: B:198:0x0585  */
    /* JADX WARN: Code duplicated, block: B:200:0x0589  */
    /* JADX WARN: Code duplicated, block: B:202:0x058d  */
    /* JADX WARN: Code duplicated, block: B:234:0x064f  */
    /* JADX WARN: Code duplicated, block: B:236:0x0662  */
    private void generateExpression(Node node, Node node2) {
        int i;
        int i2;
        int intProp;
        int intProp2;
        OptFunctionNode optFunctionNode;
        String str;
        String str2;
        int type = node.getType();
        Node firstChild = node.getFirstChild();
        if (type == 163) {
            if (firstChild.getType() == 45) {
                i = -1;
                i2 = 8;
                intProp = firstChild.getIntProp(8, -1);
            } else {
                i = -1;
                i2 = 8;
                intProp = -1;
            }
            if (intProp == i) {
                generateExpression(firstChild, node);
                addDoubleWrap();
                return;
            } else {
                firstChild.removeProp(i2);
                generateExpression(firstChild, node);
                firstChild.putIntProp(i2, intProp);
                return;
            }
        }
        if (type == 164) {
            generateExpression(firstChild, node);
            addObjectToDouble();
            return;
        }
        if (type != 179) {
            if (type == 180) {
                visitTemplateLiteral(node);
                return;
            }
            switch (type) {
                case 8:
                    visitSetName(node, firstChild);
                    return;
                case 9:
                case 10:
                case 11:
                case 18:
                case 19:
                case 20:
                    visitBitOp(node, type, firstChild);
                    return;
                case 12:
                case 13:
                    int iB = this.cfw.b();
                    int iB2 = this.cfw.b();
                    visitIfJumpEqOp(node, firstChild, iB, iB2);
                    addJumpedBooleanWrap(iB, iB2);
                    return;
                case 14:
                case 15:
                case 16:
                case 17:
                    int iB3 = this.cfw.b();
                    int iB4 = this.cfw.b();
                    visitIfJumpRelOp(node, firstChild, iB3, iB4);
                    addJumpedBooleanWrap(iB3, iB4);
                    return;
                case 21:
                    generateExpression(firstChild, node);
                    generateExpression(firstChild.getNext(), node);
                    int intProp3 = node.getIntProp(8, -1);
                    if (intProp3 == 0) {
                        this.cfw.c(99);
                        return;
                    }
                    ClassFileWriter classFileWriter = this.cfw;
                    if (intProp3 == 1) {
                        classFileWriter.g(this.contextLocal);
                        addOptRuntimeInvoke("add", "(DLjava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                        return;
                    }
                    int i3 = this.contextLocal;
                    if (intProp3 != 2) {
                        classFileWriter.g(i3);
                        addDynamicInvoke("MATH:ADD", Signatures.MATH_ADD);
                        return;
                    } else {
                        classFileWriter.g(i3);
                        addOptRuntimeInvoke("add", "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                        return;
                    }
                case 22:
                case 23:
                case 24:
                case 25:
                    visitArithmetic(node, type, firstChild, node2);
                    return;
                case 26:
                    int iB5 = this.cfw.b();
                    int iB6 = this.cfw.b();
                    int iB7 = this.cfw.b();
                    generateIfJump(firstChild, node, iB5, iB6);
                    this.cfw.D(iB5);
                    this.cfw.f("java/lang/Boolean", Token.ARROW, "FALSE", "Ljava/lang/Boolean;");
                    this.cfw.d(Token.LET, iB7);
                    this.cfw.D(iB6);
                    this.cfw.f("java/lang/Boolean", Token.ARROW, "TRUE", "Ljava/lang/Boolean;");
                    this.cfw.D(iB7);
                    this.cfw.z();
                    return;
                case 27:
                    visitBitNot(node, firstChild);
                    return;
                case 28:
                    int intProp4 = node.getIntProp(8, -1);
                    generateExpression(firstChild, node);
                    if (intProp4 == -1) {
                        addObjectToDouble();
                        addDoubleWrap();
                        return;
                    }
                    return;
                case 29:
                    int intProp5 = node.getIntProp(8, -1);
                    generateExpression(firstChild, node);
                    if (intProp5 != -1) {
                        this.cfw.c(Token.INC);
                        return;
                    } else {
                        addObjectToNumeric();
                        addScriptRuntimeInvoke("negate", "(Ljava/lang/Number;)Ljava/lang/Number;");
                        return;
                    }
                case 30:
                    intProp2 = node.getIntProp(10, 0);
                    if (intProp2 == 0) {
                        visitSpecialCall(node, type, intProp2, firstChild);
                        return;
                    }
                    optFunctionNode = (OptFunctionNode) node.getProp(9);
                    if (optFunctionNode != null) {
                        visitOptimizedCall(node, optFunctionNode, type, firstChild);
                        return;
                    } else if (type == 43) {
                        visitStandardCall(node, firstChild);
                        return;
                    } else {
                        visitStandardNew(node, firstChild);
                        return;
                    }
                case 31:
                    boolean z = firstChild.getType() == 54;
                    generateExpression(firstChild, node);
                    generateExpression(firstChild.getNext(), node);
                    int intProp6 = node.getIntProp(31, 0);
                    ClassFileWriter classFileWriter2 = this.cfw;
                    if (intProp6 == 1) {
                        classFileWriter2.c(88);
                        this.cfw.o(0);
                        addScriptRuntimeInvoke("throwDeleteOnSuperPropertyNotAllowed", "()V");
                        return;
                    } else {
                        classFileWriter2.g(this.contextLocal);
                        this.cfw.t(z);
                        addScriptRuntimeInvoke("delete", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Z)Ljava/lang/Object;");
                        return;
                    }
                case 32:
                    generateExpression(firstChild, node);
                    addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
                    return;
                case Token.GETPROP /* 33 */:
                case Token.GETPROPNOWARN /* 34 */:
                    visitGetProp(node, firstChild);
                    return;
                default:
                    switch (type) {
                        case Token.SETPROP /* 37 */:
                            visitSetProp(type, node, firstChild);
                            return;
                        case Token.GETELEM /* 39 */:
                            generateExpression(firstChild, node);
                            if (node.getIntProp(30, 0) != 1) {
                                finishGetElemGeneration(node, firstChild);
                                return;
                            }
                            int iB8 = this.cfw.b();
                            int iB9 = this.cfw.b();
                            this.cfw.c(89);
                            addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                            this.cfw.d(Token.SETPROP_OP, iB8);
                            this.cfw.c(87);
                            this.cfw.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
                            this.cfw.d(Token.LET, iB9);
                            this.cfw.D(iB8);
                            finishGetElemGeneration(node, firstChild);
                            this.cfw.D(iB9);
                            return;
                        case Token.SETELEM /* 41 */:
                            visitSetElem(type, node, firstChild);
                            return;
                        case Token.COMMA /* 98 */:
                            Node next = firstChild.getNext();
                            while (true) {
                                Node node3 = firstChild;
                                firstChild = next;
                                if (firstChild == null) {
                                    generateExpression(node3, node);
                                    return;
                                } else {
                                    generateExpression(node3, node);
                                    this.cfw.c(87);
                                    next = firstChild.getNext();
                                }
                            }
                            break;
                        case Token.HOOK /* 115 */:
                            Node next2 = firstChild.getNext();
                            Node next3 = next2.getNext();
                            generateExpression(firstChild, node);
                            addDynamicInvoke("MATH:TOBOOLEAN", Signatures.MATH_TO_BOOLEAN);
                            int iB10 = this.cfw.b();
                            this.cfw.d(Token.SETPROP_OP, iB10);
                            int i4 = this.cfw.m;
                            generateExpression(next2, node);
                            int iB11 = this.cfw.b();
                            this.cfw.d(Token.LET, iB11);
                            this.cfw.E(iB10, i4);
                            generateExpression(next3, node);
                            this.cfw.D(iB11);
                            return;
                        case Token.FUNCTION /* 122 */:
                            if (this.fnCurrent == null && node2.getType() == 150) {
                                return;
                            }
                            OptFunctionNode optFunctionNode2 = OptFunctionNode.get(this.scriptOrFn, node.getExistingIntProp(1));
                            int functionType = optFunctionNode2.fnode.getFunctionType();
                            if (functionType != 2 && functionType != 4) {
                                throw Codegen.badTree();
                            }
                            visitFunction(optFunctionNode2, functionType);
                            return;
                        case Token.VOID /* 139 */:
                            generateExpression(firstChild, node);
                            this.cfw.c(87);
                            Codegen.pushUndefined(this.cfw);
                            return;
                        case Token.SET_REF_OP /* 156 */:
                            generateExpression(firstChild, node);
                            Node next4 = firstChild.getNext();
                            if (type == 156) {
                                this.cfw.c(89);
                                this.cfw.g(this.contextLocal);
                                addScriptRuntimeInvoke("refGet", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                            }
                            generateExpression(next4, node);
                            this.cfw.g(this.contextLocal);
                            this.cfw.g(this.variableObjectLocal);
                            addScriptRuntimeInvoke("refSet", "(Lorg/mozilla/javascript/Ref;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
                            return;
                        case 160:
                            visitDotQuery(node, firstChild);
                            return;
                        case Token.WITHEXPR /* 173 */:
                            Node next5 = firstChild.getNext();
                            Node next6 = next5.getNext();
                            generateStatement(firstChild);
                            generateExpression(next5.getFirstChild(), next5);
                            generateStatement(next6);
                            return;
                        case 185:
                            generateExpression(firstChild, node);
                            int iB12 = this.cfw.b();
                            this.cfw.c(89);
                            addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                            this.cfw.d(Token.SETPROP_OP, iB12);
                            this.cfw.c(87);
                            generateExpression(firstChild.getNext(), node);
                            this.cfw.D(iB12);
                            return;
                        default:
                            switch (type) {
                                case Token.CALL /* 43 */:
                                    intProp2 = node.getIntProp(10, 0);
                                    if (intProp2 == 0) {
                                        visitSpecialCall(node, type, intProp2, firstChild);
                                        return;
                                    }
                                    optFunctionNode = (OptFunctionNode) node.getProp(9);
                                    if (optFunctionNode != null) {
                                        visitOptimizedCall(node, optFunctionNode, type, firstChild);
                                        return;
                                    } else if (type == 43) {
                                        visitStandardCall(node, firstChild);
                                        return;
                                    } else {
                                        visitStandardNew(node, firstChild);
                                        return;
                                    }
                                case Token.NAME /* 44 */:
                                    this.cfw.g(this.variableObjectLocal);
                                    this.cfw.g(this.contextLocal);
                                    addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("NAME:GET:", node.getString()), Signatures.NAME_GET);
                                    return;
                                case Token.NUMBER /* 45 */:
                                    double d = node.getDouble();
                                    if (node.getIntProp(8, -1) != -1) {
                                        this.cfw.q(d);
                                        return;
                                    } else {
                                        this.codegen.pushNumberAsObject(this.cfw, d);
                                        return;
                                    }
                                case Token.STRING /* 46 */:
                                    this.cfw.s(node.getString());
                                    return;
                                case Token.NULL /* 47 */:
                                    this.cfw.c(1);
                                    return;
                                case Token.THIS /* 48 */:
                                    this.cfw.g(this.thisObjLocal);
                                    return;
                                case Token.FALSE /* 49 */:
                                    this.cfw.f("java/lang/Boolean", Token.ARROW, "FALSE", "Ljava/lang/Boolean;");
                                    return;
                                case Token.TRUE /* 50 */:
                                    this.cfw.f("java/lang/Boolean", Token.ARROW, "TRUE", "Ljava/lang/Boolean;");
                                    return;
                                case Token.SHEQ /* 51 */:
                                case Token.SHNE /* 52 */:
                                    int iB13 = this.cfw.b();
                                    int iB14 = this.cfw.b();
                                    visitIfJumpEqOp(node, firstChild, iB13, iB14);
                                    addJumpedBooleanWrap(iB13, iB14);
                                    return;
                                case Token.REGEXP /* 53 */:
                                    this.cfw.g(this.contextLocal);
                                    this.cfw.g(this.variableObjectLocal);
                                    int existingIntProp = node.getExistingIntProp(4);
                                    ClassFileWriter classFileWriter3 = this.cfw;
                                    Codegen codegen = this.codegen;
                                    classFileWriter3.f(codegen.mainClassName, Token.ARROW, codegen.getCompiledRegexpName(this.scriptOrFn, existingIntProp), "Ljava/lang/Object;");
                                    this.cfw.m("org/mozilla/javascript/ScriptRuntime", Token.DOTDOTDOT, "wrapRegExp", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
                                    return;
                                case Token.BINDNAME /* 54 */:
                                    while (firstChild != null) {
                                        generateExpression(firstChild, node);
                                        firstChild = firstChild.getNext();
                                    }
                                    this.cfw.g(this.variableObjectLocal);
                                    this.cfw.g(this.contextLocal);
                                    addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("NAME:BIND:", node.getString()), Signatures.NAME_BIND);
                                    return;
                                default:
                                    switch (type) {
                                        case Token.IN /* 57 */:
                                        case Token.INSTANCEOF /* 58 */:
                                            int iB15 = this.cfw.b();
                                            int iB16 = this.cfw.b();
                                            visitIfJumpRelOp(node, firstChild, iB15, iB16);
                                            addJumpedBooleanWrap(iB15, iB16);
                                            return;
                                        case Token.LOCAL_LOAD /* 59 */:
                                            this.cfw.g(getLocalBlockRegister(node));
                                            return;
                                        case 60:
                                            visitGetVar(node);
                                            return;
                                        case 61:
                                            visitSetVar(node, firstChild, true);
                                            return;
                                        default:
                                            switch (type) {
                                                case Token.ENUM_NEXT /* 67 */:
                                                case Token.ENUM_ID /* 68 */:
                                                    this.cfw.g(getLocalBlockRegister(node));
                                                    this.cfw.g(this.contextLocal);
                                                    if (type == 67) {
                                                        addScriptRuntimeInvoke("enumNext", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Boolean;");
                                                        return;
                                                    } else {
                                                        addScriptRuntimeInvoke("enumId", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                                                        return;
                                                    }
                                                case Token.THISFN /* 69 */:
                                                    this.cfw.c(42);
                                                    return;
                                                default:
                                                    switch (type) {
                                                        case Token.ARRAYLIT /* 71 */:
                                                            visitArrayLiteral(node, firstChild, false);
                                                            return;
                                                        case Token.OBJECTLIT /* 72 */:
                                                            visitObjectLiteral(node, firstChild, false);
                                                            return;
                                                        case Token.GET_REF /* 73 */:
                                                            generateExpression(firstChild, node);
                                                            if (node.getIntProp(30, 0) != 1) {
                                                                finishGetRefGeneration();
                                                                return;
                                                            }
                                                            int iB17 = this.cfw.b();
                                                            int iB18 = this.cfw.b();
                                                            this.cfw.c(89);
                                                            addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                                                            this.cfw.d(Token.SETPROP_OP, iB17);
                                                            this.cfw.d(Token.LET, iB18);
                                                            this.cfw.D(iB17);
                                                            this.cfw.e(192, "org/mozilla/javascript/Ref");
                                                            finishGetRefGeneration();
                                                            this.cfw.D(iB18);
                                                            return;
                                                        case Token.SET_REF /* 74 */:
                                                            generateExpression(firstChild, node);
                                                            Node next7 = firstChild.getNext();
                                                            if (type == 156) {
                                                                this.cfw.c(89);
                                                                this.cfw.g(this.contextLocal);
                                                                addScriptRuntimeInvoke("refGet", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                                                            }
                                                            generateExpression(next7, node);
                                                            this.cfw.g(this.contextLocal);
                                                            this.cfw.g(this.variableObjectLocal);
                                                            addScriptRuntimeInvoke("refSet", "(Lorg/mozilla/javascript/Ref;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
                                                            return;
                                                        case Token.DEL_REF /* 75 */:
                                                            generateExpression(firstChild, node);
                                                            this.cfw.g(this.contextLocal);
                                                            addScriptRuntimeInvoke("refDel", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                                                            return;
                                                        case Token.REF_CALL /* 76 */:
                                                            generateFunctionAndThisObj(firstChild, node);
                                                            pushThisFromLastScriptable();
                                                            generateCallArgArray(node, firstChild.getNext(), false);
                                                            this.cfw.g(this.contextLocal);
                                                            addScriptRuntimeInvoke("callRef", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Ref;");
                                                            return;
                                                        case Token.REF_SPECIAL /* 77 */:
                                                            generateExpression(firstChild, node);
                                                            if (node.getIntProp(30, 0) != 1) {
                                                                finishRefSpecialGeneration(node);
                                                                return;
                                                            }
                                                            int iB19 = this.cfw.b();
                                                            int iB20 = this.cfw.b();
                                                            this.cfw.c(89);
                                                            addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                                                            this.cfw.d(Token.SETPROP_OP, iB19);
                                                            this.cfw.c(87);
                                                            this.cfw.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
                                                            this.cfw.d(Token.LET, iB20);
                                                            this.cfw.D(iB19);
                                                            finishRefSpecialGeneration(node);
                                                            this.cfw.D(iB20);
                                                            return;
                                                        case Token.YIELD /* 78 */:
                                                            break;
                                                        case Token.SUPER /* 79 */:
                                                            this.cfw.g(this.variableObjectLocal);
                                                            this.cfw.e(192, "org/mozilla/javascript/NativeCall");
                                                            this.cfw.m("org/mozilla/javascript/NativeCall", Token.TEMPLATE_LITERAL_SUBST, "getHomeObject", "()Lorg/mozilla/javascript/Scriptable;");
                                                            int iB21 = this.cfw.b();
                                                            int iB22 = this.cfw.b();
                                                            this.cfw.c(89);
                                                            this.cfw.d(199, iB22);
                                                            this.cfw.c(87);
                                                            this.cfw.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
                                                            this.cfw.d(Token.LET, iB21);
                                                            this.cfw.D(iB22);
                                                            this.cfw.m("org/mozilla/javascript/Scriptable", 185, "getPrototype", "()Lorg/mozilla/javascript/Scriptable;");
                                                            this.cfw.D(iB21);
                                                            return;
                                                        case Token.STRICT_SETNAME /* 80 */:
                                                            visitStrictSetName(node, firstChild);
                                                            return;
                                                        case Token.EXP /* 81 */:
                                                            visitExponentiation(node, firstChild, node2);
                                                            return;
                                                        case Token.DEFAULTNAMESPACE /* 82 */:
                                                            generateExpression(firstChild, node);
                                                            this.cfw.g(this.contextLocal);
                                                            addScriptRuntimeInvoke("setDefaultNamespace", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
                                                            return;
                                                        case Token.ESCXMLATTR /* 83 */:
                                                            generateExpression(firstChild, node);
                                                            this.cfw.g(this.contextLocal);
                                                            addScriptRuntimeInvoke("escapeAttributeValue", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/String;");
                                                            return;
                                                        case Token.ESCXMLTEXT /* 84 */:
                                                            generateExpression(firstChild, node);
                                                            this.cfw.g(this.contextLocal);
                                                            addScriptRuntimeInvoke("escapeTextValue", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/String;");
                                                            return;
                                                        case Token.REF_MEMBER /* 85 */:
                                                        case Token.REF_NS_MEMBER /* 86 */:
                                                        case Token.REF_NAME /* 87 */:
                                                        case Token.REF_NS_NAME /* 88 */:
                                                            int intProp7 = node.getIntProp(16, 0);
                                                            do {
                                                                generateExpression(firstChild, node);
                                                                firstChild = firstChild.getNext();
                                                            } while (firstChild != null);
                                                            this.cfw.g(this.contextLocal);
                                                            String str3 = "memberRef";
                                                            switch (type) {
                                                                case Token.REF_MEMBER /* 85 */:
                                                                    str = "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;I)Lorg/mozilla/javascript/Ref;";
                                                                    this.cfw.r(intProp7);
                                                                    addScriptRuntimeInvoke(str3, str);
                                                                    return;
                                                                case Token.REF_NS_MEMBER /* 86 */:
                                                                    str = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;I)Lorg/mozilla/javascript/Ref;";
                                                                    this.cfw.r(intProp7);
                                                                    addScriptRuntimeInvoke(str3, str);
                                                                    return;
                                                                case Token.REF_NAME /* 87 */:
                                                                    this.cfw.g(this.variableObjectLocal);
                                                                    str2 = "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Lorg/mozilla/javascript/Ref;";
                                                                    str = str2;
                                                                    str3 = "nameRef";
                                                                    this.cfw.r(intProp7);
                                                                    addScriptRuntimeInvoke(str3, str);
                                                                    return;
                                                                case Token.REF_NS_NAME /* 88 */:
                                                                    this.cfw.g(this.variableObjectLocal);
                                                                    str2 = "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Lorg/mozilla/javascript/Ref;";
                                                                    str = str2;
                                                                    str3 = "nameRef";
                                                                    this.cfw.r(intProp7);
                                                                    addScriptRuntimeInvoke(str3, str);
                                                                    return;
                                                                default:
                                                                    throw Kit.codeBug();
                                                            }
                                                        case 89:
                                                            byte[] byteArray = node.getBigInt().toByteArray();
                                                            this.cfw.e(Token.LAST_TOKEN, "java/math/BigInteger");
                                                            this.cfw.c(89);
                                                            this.cfw.r(byteArray.length);
                                                            this.cfw.d(188, 8);
                                                            int i5 = 0;
                                                            while (true) {
                                                                int length = byteArray.length;
                                                                ClassFileWriter classFileWriter4 = this.cfw;
                                                                if (i5 >= length) {
                                                                    classFileWriter4.m("java/math/BigInteger", Token.TAGGED_TEMPLATE_LITERAL, "<init>", "([B)V");
                                                                    return;
                                                                }
                                                                classFileWriter4.c(89);
                                                                this.cfw.r(i5);
                                                                this.cfw.d(16, byteArray[i5]);
                                                                this.cfw.c(84);
                                                                i5++;
                                                            }
                                                            break;
                                                        default:
                                                            switch (type) {
                                                                case Token.OR /* 117 */:
                                                                case Token.AND /* 118 */:
                                                                    generateExpression(firstChild, node);
                                                                    this.cfw.c(89);
                                                                    addDynamicInvoke("MATH:TOBOOLEAN", Signatures.MATH_TO_BOOLEAN);
                                                                    int iB23 = this.cfw.b();
                                                                    ClassFileWriter classFileWriter5 = this.cfw;
                                                                    if (type == 118) {
                                                                        classFileWriter5.d(Token.SETPROP_OP, iB23);
                                                                    } else {
                                                                        classFileWriter5.d(Token.SETELEM_OP, iB23);
                                                                    }
                                                                    this.cfw.c(87);
                                                                    generateExpression(firstChild.getNext(), node);
                                                                    this.cfw.D(iB23);
                                                                    return;
                                                                case Token.INC /* 119 */:
                                                                case 120:
                                                                    visitIncDec(node);
                                                                    return;
                                                                default:
                                                                    switch (type) {
                                                                        case Token.TYPEOFNAME /* 151 */:
                                                                            visitTypeofname(node);
                                                                            return;
                                                                        case Token.USE_STACK /* 152 */:
                                                                            return;
                                                                        case Token.SETPROP_OP /* 153 */:
                                                                            visitSetProp(type, node, firstChild);
                                                                            return;
                                                                        case Token.SETELEM_OP /* 154 */:
                                                                            visitSetElem(type, node, firstChild);
                                                                            return;
                                                                        default:
                                                                            switch (type) {
                                                                                case Token.SETCONST /* 169 */:
                                                                                    visitSetConst(node, firstChild);
                                                                                    return;
                                                                                case 170:
                                                                                    visitSetConstVar(node, firstChild, true);
                                                                                    return;
                                                                                case Token.ARRAYCOMP /* 171 */:
                                                                                    Node next8 = firstChild.getNext();
                                                                                    generateStatement(firstChild);
                                                                                    generateExpression(next8, node);
                                                                                    return;
                                                                                default:
                                                                                    org.mozilla.javascript.c.b(a.l(type, "Unexpected node type "));
                                                                                    return;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        generateYieldPoint(node, true);
    }

    private void generateFunctionAndThisObj(Node node, Node node2) {
        int type = node.getType();
        boolean z = node2.getIntProp(30, 0) == 1;
        int type2 = node.getType();
        if (type2 != 33) {
            if (type2 == 34) {
                throw Kit.codeBug();
            }
            if (type2 != 39) {
                if (type2 != 44) {
                    generateExpression(node, node2);
                    this.cfw.g(this.contextLocal);
                    addScriptRuntimeInvoke(z ? "getValueFunctionAndThisOptional" : "getValueFunctionAndThis", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Callable;");
                    return;
                } else {
                    String string = node.getString();
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.g(this.contextLocal);
                    addDynamicInvoke(f.e("NAME:", z ? "GETWITHTHISOPTIONAL" : "GETWITHTHIS", ":", string), Signatures.NAME_GET_THIS);
                    return;
                }
            }
        }
        Node firstChild = node.getFirstChild();
        generateExpression(firstChild, node);
        Node next = firstChild.getNext();
        if (type == 33) {
            String string2 = next.getString();
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            addDynamicInvoke(f.e("PROP:", z ? "GETWITHTHISOPTIONAL" : "GETWITHTHIS", ":", string2), Signatures.PROP_GET_THIS);
            return;
        }
        generateExpression(next, node);
        if (node.getIntProp(8, -1) != -1) {
            addDoubleWrap();
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke(z ? "getElemFunctionAndThisOptional" : "getElemFunctionAndThis", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;");
    }

    private void generateGenerator() {
        this.cfw.N(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short) 10);
        initBodyGeneration();
        int i = this.firstFreeLocal;
        int i2 = i + 1;
        this.firstFreeLocal = i2;
        this.argsLocal = i;
        this.localsMax = i2;
        if (this.fnCurrent != null) {
            this.cfw.g(this.funObjLocal);
            this.cfw.m("org/mozilla/javascript/Scriptable", 185, "getParentScope", "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.variableObjectLocal);
        }
        this.cfw.g(this.funObjLocal);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.argsLocal);
        this.cfw.t(this.scriptOrFn.isInStrictMode());
        this.cfw.t(this.scriptOrFn.hasRestParameter());
        this.cfw.p();
        this.cfw.m("org/mozilla/javascript/BaseFunction", Token.TEMPLATE_LITERAL_SUBST, "getHomeObject", "()Lorg/mozilla/javascript/Scriptable;");
        addScriptRuntimeInvoke("createFunctionActivation", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;ZZLorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.h(this.variableObjectLocal);
        this.cfw.e(Token.LAST_TOKEN, this.codegen.mainClassName);
        this.cfw.c(89);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.contextLocal);
        this.cfw.r(this.scriptOrFnIndex);
        this.cfw.m(this.codegen.mainClassName, Token.TAGGED_TEMPLATE_LITERAL, "<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        generateNestedFunctionInits();
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.thisObjLocal);
        this.cfw.o(this.maxLocals);
        this.cfw.o(this.maxStack);
        addOptRuntimeInvoke("createNativeGenerator", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;II)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.c(Token.GENEXPR);
        this.cfw.O((short) (this.localsMax + 1));
    }

    private void generateGetGeneratorLocalsState() {
        this.cfw.g(this.generatorStateLocal);
        addOptRuntimeInvoke("getGeneratorLocalsState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateGetGeneratorResumptionPoint() {
        this.cfw.g(this.generatorStateLocal);
        this.cfw.f("org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", 180, "resumptionPoint", "I");
    }

    private void generateGetGeneratorStackState() {
        this.cfw.g(this.generatorStateLocal);
        addOptRuntimeInvoke("getGeneratorStackState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateIfJump(Node node, Node node2, int i, int i2) {
        int type = node.getType();
        Node firstChild = node.getFirstChild();
        if (type == 26) {
            generateIfJump(firstChild, node, i2, i);
            return;
        }
        if (type != 51 && type != 52) {
            if (type != 57 && type != 58) {
                if (type == 117 || type == 118) {
                    int iB = this.cfw.b();
                    if (type == 118) {
                        generateIfJump(firstChild, node, iB, i2);
                    } else {
                        generateIfJump(firstChild, node, i, iB);
                    }
                    this.cfw.D(iB);
                    generateIfJump(firstChild.getNext(), node, i, i2);
                    return;
                }
                switch (type) {
                    case 12:
                    case 13:
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        break;
                    default:
                        generateExpression(node, node2);
                        addDynamicInvoke("MATH:TOBOOLEAN", Signatures.MATH_TO_BOOLEAN);
                        this.cfw.d(Token.SETELEM_OP, i);
                        this.cfw.d(Token.LET, i2);
                        break;
                }
                return;
            }
            visitIfJumpRelOp(node, firstChild, i, i2);
            return;
        }
        visitIfJumpEqOp(node, firstChild, i, i2);
    }

    private void generateIntegerUnwrap() {
        this.cfw.m("java/lang/Integer", Token.TEMPLATE_LITERAL_SUBST, "intValue", "()I");
    }

    private void generateIntegerWrap() {
        this.cfw.m("java/lang/Integer", Token.DOTDOTDOT, "valueOf", "(I)Ljava/lang/Integer;");
    }

    private void generateLocalYieldPoint(Node node, boolean z) {
        ClassFileWriter classFileWriter;
        ClassFileWriter classFileWriter2;
        int i = this.cfw.m;
        int i2 = this.maxStack;
        if (i2 <= i) {
            i2 = i;
        }
        this.maxStack = i2;
        if (i != 0) {
            generateGetGeneratorStackState();
            int i3 = 0;
            while (true) {
                classFileWriter2 = this.cfw;
                if (i3 >= i) {
                    break;
                }
                classFileWriter2.c(90);
                this.cfw.c(95);
                this.cfw.o(i3);
                this.cfw.c(95);
                this.cfw.c(83);
                i3++;
            }
            classFileWriter2.c(87);
        }
        Node firstChild = node.getFirstChild();
        if (firstChild != null) {
            generateExpression(firstChild, node);
        } else {
            Codegen.pushUndefined(this.cfw);
        }
        if (node.getType() == 179) {
            this.cfw.e(Token.LAST_TOKEN, "org/mozilla/javascript/ES6Generator$YieldStarResult");
            this.cfw.c(90);
            this.cfw.c(95);
            this.cfw.m("org/mozilla/javascript/ES6Generator$YieldStarResult", Token.TAGGED_TEMPLATE_LITERAL, "<init>", "(Ljava/lang/Object;)V");
        }
        int nextGeneratorState = getNextGeneratorState(node);
        generateSetGeneratorResumptionPoint(nextGeneratorState);
        boolean zGenerateSaveLocals = generateSaveLocals(node);
        this.cfw.c(Token.GENEXPR);
        generateCheckForThrowOrClose(getTargetLabel(node), zGenerateSaveLocals, nextGeneratorState);
        if (i != 0) {
            generateGetGeneratorStackState();
            while (true) {
                i--;
                classFileWriter = this.cfw;
                if (i < 0) {
                    break;
                }
                classFileWriter.c(89);
                this.cfw.o(i);
                this.cfw.c(50);
                this.cfw.c(95);
            }
            classFileWriter.c(87);
        }
        if (z) {
            this.cfw.g(this.argsLocal);
        }
    }

    private void generateNestedFunctionInits() {
        int functionCount = this.scriptOrFn.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn, i);
            if (optFunctionNode.fnode.getFunctionType() == 1) {
                visitFunction(optFunctionNode, 1);
            }
        }
    }

    private void generateObjectLiteralFactory(Node node, int i) {
        String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + i;
        initBodyGeneration();
        int i2 = this.firstFreeLocal;
        int i3 = i2 + 1;
        this.firstFreeLocal = i3;
        this.argsLocal = i2;
        this.localsMax = i3;
        this.cfw.N(str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short) 2);
        visitObjectLiteral(node, node.getFirstChild(), true);
        this.cfw.c(Token.GENEXPR);
        this.cfw.O((short) (this.localsMax + 1));
    }

    private void generatePrologue() {
        String str;
        int newWordLocal;
        if (this.inDirectCallFunction) {
            int paramCount = this.scriptOrFn.getParamCount();
            if (this.firstFreeLocal != 4) {
                Kit.codeBug();
            }
            for (int i = 0; i != paramCount; i++) {
                int[] iArr = this.varRegisters;
                int i2 = this.firstFreeLocal;
                iArr[i] = i2;
                this.firstFreeLocal = i2 + 3;
            }
            if (!this.fnCurrent.getParameterNumberContext()) {
                this.itsForcedObjectParameters = true;
                for (int i3 = 0; i3 != paramCount; i3++) {
                    int i4 = this.varRegisters[i3];
                    this.cfw.g(i4);
                    this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
                    int iB = this.cfw.b();
                    this.cfw.d(Token.SET, iB);
                    this.cfw.i(i4 + 1);
                    addDoubleWrap();
                    this.cfw.h(i4);
                    this.cfw.D(iB);
                }
            }
        }
        if (this.fnCurrent != null) {
            this.cfw.g(this.funObjLocal);
            this.cfw.m("org/mozilla/javascript/Scriptable", 185, "getParentScope", "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.variableObjectLocal);
        }
        int i5 = this.firstFreeLocal;
        int i6 = i5 + 1;
        this.firstFreeLocal = i6;
        this.argsLocal = i5;
        this.localsMax = i6;
        if (this.isGenerator) {
            int i7 = i5 + 2;
            this.firstFreeLocal = i7;
            this.operationLocal = i6;
            this.localsMax = i7;
            this.cfw.g(this.thisObjLocal);
            int i8 = this.firstFreeLocal;
            int i9 = i8 + 1;
            this.firstFreeLocal = i9;
            this.generatorStateLocal = i8;
            this.localsMax = i9;
            this.cfw.e(192, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState");
            this.cfw.c(89);
            this.cfw.h(this.generatorStateLocal);
            this.cfw.f("org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", 180, "thisObj", "Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.thisObjLocal);
            if (this.epilogueLabel == -1) {
                this.epilogueLabel = this.cfw.b();
            }
            List<Node> resumptionPoints = ((FunctionNode) this.scriptOrFn).getResumptionPoints();
            if (resumptionPoints != null) {
                generateGetGeneratorResumptionPoint();
                this.generatorSwitch = this.cfw.w(0, resumptionPoints.size());
                generateCheckForThrowOrClose(-1, false, 0);
            }
        }
        if (this.fnCurrent == null) {
            if (this.scriptOrFn.getRegexpCount() != 0) {
                this.cfw.g(this.contextLocal);
                this.cfw.m(this.codegen.mainClassName, Token.DOTDOTDOT, "_reInit", "(Lorg/mozilla/javascript/Context;)V");
            }
            if (this.scriptOrFn.getTemplateLiteralCount() != 0) {
                this.cfw.m(this.codegen.mainClassName, Token.DOTDOTDOT, "_qInit", "()V");
            }
        }
        if (this.compilerEnv.isGenerateObserverCount()) {
            saveCurrentCodeOffset();
        }
        if (this.isGenerator) {
            return;
        }
        boolean z = this.hasVarsInRegs;
        ScriptNode scriptNode = this.scriptOrFn;
        if (z) {
            int paramCount2 = scriptNode.getParamCount();
            if (paramCount2 > 0 && !this.inDirectCallFunction) {
                boolean zHasRestParameter = this.scriptOrFn.hasRestParameter();
                ClassFileWriter classFileWriter = this.cfw;
                if (zHasRestParameter) {
                    classFileWriter.g(this.contextLocal);
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.g(this.argsLocal);
                    this.cfw.r(paramCount2);
                    addScriptRuntimeInvoke("padAndRestArguments", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;I)[Ljava/lang/Object;");
                    this.cfw.h(this.argsLocal);
                } else {
                    classFileWriter.g(this.argsLocal);
                    this.cfw.c(190);
                    this.cfw.r(paramCount2);
                    int iB2 = this.cfw.b();
                    this.cfw.d(Token.XMLEND, iB2);
                    this.cfw.g(this.argsLocal);
                    this.cfw.r(paramCount2);
                    addScriptRuntimeInvoke("padArguments", "([Ljava/lang/Object;I)[Ljava/lang/Object;");
                    this.cfw.h(this.argsLocal);
                    this.cfw.D(iB2);
                }
            }
            int paramCount3 = this.fnCurrent.fnode.getParamCount();
            int paramAndVarCount = this.fnCurrent.fnode.getParamAndVarCount();
            boolean[] paramAndVarConst = this.fnCurrent.fnode.getParamAndVarConst();
            int i10 = -1;
            for (int i11 = 0; i11 != paramAndVarCount; i11++) {
                if (i11 < paramCount3) {
                    if (this.inDirectCallFunction) {
                        newWordLocal = -1;
                    } else {
                        newWordLocal = getNewWordLocal();
                        this.cfw.g(this.argsLocal);
                        this.cfw.r(i11);
                        this.cfw.c(50);
                        this.cfw.h(newWordLocal);
                    }
                } else if (this.fnCurrent.isNumberVar(i11)) {
                    newWordLocal = getNewWordPairLocal(paramAndVarConst[i11]);
                    this.cfw.q(0.0d);
                    this.cfw.Q(71, 57, newWordLocal);
                } else {
                    newWordLocal = getNewWordLocal(paramAndVarConst[i11]);
                    ClassFileWriter classFileWriter2 = this.cfw;
                    if (i10 == -1) {
                        Codegen.pushUndefined(classFileWriter2);
                        i10 = newWordLocal;
                    } else {
                        classFileWriter2.g(i10);
                    }
                    this.cfw.h(newWordLocal);
                }
                if (newWordLocal >= 0) {
                    if (paramAndVarConst[i11]) {
                        this.cfw.r(0);
                        this.cfw.Q(59, 54, (this.fnCurrent.isNumberVar(i11) ? 2 : 1) + newWordLocal);
                    }
                    this.varRegisters[i11] = newWordLocal;
                }
                if (this.compilerEnv.isGenerateDebugInfo()) {
                    String paramOrVarName = this.fnCurrent.fnode.getParamOrVarName(i11);
                    String str2 = this.fnCurrent.isNumberVar(i11) ? "D" : "Ljava/lang/Object;";
                    ClassFileWriter classFileWriter3 = this.cfw;
                    int i12 = classFileWriter3.j;
                    if (newWordLocal < 0) {
                        newWordLocal = this.varRegisters[i11];
                    }
                    h hVar = classFileWriter3.k;
                    int[] iArr2 = {hVar.i(paramOrVarName), hVar.i(str2), i12, newWordLocal};
                    if (classFileWriter3.A == null) {
                        classFileWriter3.A = new ArrayList();
                    }
                    classFileWriter3.A.add(iArr2);
                }
            }
            return;
        }
        boolean z2 = (scriptNode instanceof FunctionNode) && ((FunctionNode) scriptNode).getFunctionType() == 4;
        OptFunctionNode optFunctionNode = this.fnCurrent;
        ClassFileWriter classFileWriter4 = this.cfw;
        int i13 = this.funObjLocal;
        if (optFunctionNode != null) {
            classFileWriter4.g(i13);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.argsLocal);
            this.cfw.t(this.scriptOrFn.isInStrictMode());
            this.cfw.t(this.scriptOrFn.hasRestParameter());
            ClassFileWriter classFileWriter5 = this.cfw;
            if (z2) {
                int iB3 = classFileWriter5.b();
                int iB4 = this.cfw.b();
                this.cfw.g(this.variableObjectLocal);
                this.cfw.e(193, "org/mozilla/javascript/NativeCall");
                this.cfw.d(Token.SETPROP_OP, iB3);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.e(192, "org/mozilla/javascript/NativeCall");
                this.cfw.m("org/mozilla/javascript/NativeCall", Token.TEMPLATE_LITERAL_SUBST, "getHomeObject", "()Lorg/mozilla/javascript/Scriptable;");
                this.cfw.d(Token.LET, iB4);
                this.cfw.D(iB3);
                this.cfw.c(1);
                this.cfw.D(iB4);
            } else {
                classFileWriter5.p();
                this.cfw.m("org/mozilla/javascript/BaseFunction", Token.TEMPLATE_LITERAL_SUBST, "getHomeObject", "()Lorg/mozilla/javascript/Scriptable;");
            }
            addScriptRuntimeInvoke(z2 ? "createArrowFunctionActivation" : "createFunctionActivation", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;ZZLorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
            this.cfw.h(this.variableObjectLocal);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            addScriptRuntimeInvoke("enterActivationFunction", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
            str = "activation";
        } else {
            classFileWriter4.g(i13);
            this.cfw.g(this.thisObjLocal);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.r(0);
            addScriptRuntimeInvoke("initScript", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Z)V");
            str = "global";
        }
        this.enterAreaStartLabel = this.cfw.b();
        this.epilogueLabel = this.cfw.b();
        this.cfw.D(this.enterAreaStartLabel);
        generateNestedFunctionInits();
        if (this.compilerEnv.isGenerateDebugInfo()) {
            ClassFileWriter classFileWriter6 = this.cfw;
            int i14 = classFileWriter6.j;
            int i15 = this.variableObjectLocal;
            h hVar2 = classFileWriter6.k;
            int[] iArr3 = {hVar2.i(str), hVar2.i("Lorg/mozilla/javascript/Scriptable;"), i14, i15};
            if (classFileWriter6.A == null) {
                classFileWriter6.A = new ArrayList();
            }
            classFileWriter6.A.add(iArr3);
        }
        OptFunctionNode optFunctionNode2 = this.fnCurrent;
        if (optFunctionNode2 == null) {
            this.popvLocal = getNewWordLocal();
            Codegen.pushUndefined(this.cfw);
            this.cfw.h(this.popvLocal);
            int endLineno = this.scriptOrFn.getEndLineno();
            if (endLineno != -1) {
                this.cfw.n((short) endLineno);
                return;
            }
            return;
        }
        if (optFunctionNode2.itsContainsCalls0) {
            this.itsZeroArgArray = getNewWordLocal();
            this.cfw.f("org/mozilla/javascript/ScriptRuntime", Token.ARROW, "emptyArgs", "[Ljava/lang/Object;");
            this.cfw.h(this.itsZeroArgArray);
        }
        if (this.fnCurrent.itsContainsCalls1) {
            this.itsOneArgArray = getNewWordLocal();
            this.cfw.r(1);
            this.cfw.e(189, "java/lang/Object");
            this.cfw.h(this.itsOneArgArray);
        }
    }

    private boolean generateSaveLocals(Node node) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.firstFreeLocal; i3++) {
            if (this.locals[i3] != 0) {
                i2++;
            }
        }
        if (i2 == 0) {
            ((FunctionNode) this.scriptOrFn).addLiveLocals(node, null);
            return false;
        }
        int i4 = this.maxLocals;
        if (i4 <= i2) {
            i4 = i2;
        }
        this.maxLocals = i4;
        int[] iArr = new int[i2];
        int i5 = 0;
        for (int i6 = 0; i6 < this.firstFreeLocal; i6++) {
            if (this.locals[i6] != 0) {
                iArr[i5] = i6;
                i5++;
            }
        }
        ((FunctionNode) this.scriptOrFn).addLiveLocals(node, iArr);
        generateGetGeneratorLocalsState();
        while (true) {
            ClassFileWriter classFileWriter = this.cfw;
            if (i >= i2) {
                classFileWriter.c(87);
                return true;
            }
            classFileWriter.c(89);
            this.cfw.o(i);
            this.cfw.g(iArr[i]);
            this.cfw.c(83);
            i++;
        }
    }

    private void generateSetGeneratorResumptionPoint(int i) {
        this.cfw.g(this.generatorStateLocal);
        this.cfw.o(i);
        this.cfw.f("org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", Token.TEMPLATE_CHARS, "resumptionPoint", "I");
    }

    private void generateSetGeneratorReturnValue() {
        this.cfw.g(this.generatorStateLocal);
        this.cfw.c(95);
        addOptRuntimeInvoke("setGeneratorReturnValue", "(Ljava/lang/Object;Ljava/lang/Object;)V");
    }

    private void generateStatement(Node node) {
        updateLineNumber(node);
        int type = node.getType();
        Node firstChild = node.getFirstChild();
        if (type == 55) {
            generateExpression(firstChild, node);
            if (this.compilerEnv.isGenerateObserverCount()) {
                addInstructionCount();
            }
            generateThrowJavaScriptException();
            return;
        }
        if (type == 56) {
            if (this.compilerEnv.isGenerateObserverCount()) {
                addInstructionCount();
            }
            this.cfw.g(getLocalBlockRegister(node));
            this.cfw.c(191);
            return;
        }
        if (type != 70) {
            if (type == 90) {
                visitTryCatchFinally((Jump) node, firstChild);
                return;
            }
            int i = 1;
            if (type == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn, node.getExistingIntProp(1));
                int functionType = optFunctionNode.fnode.getFunctionType();
                if (functionType == 3) {
                    visitFunction(optFunctionNode, functionType);
                    return;
                } else {
                    if (functionType != 1) {
                        throw Codegen.badTree();
                    }
                    return;
                }
            }
            if (type == 127) {
                if (this.compilerEnv.isGenerateObserverCount()) {
                    addInstructionCount();
                }
                visitSwitch((Jump) node, firstChild);
                return;
            }
            if (type != 136) {
                if (type == 138) {
                    if (this.isGenerator) {
                        if (this.compilerEnv.isGenerateObserverCount()) {
                            saveCurrentCodeOffset();
                        }
                        this.cfw.m = 1;
                        short newWordLocal = getNewWordLocal();
                        int iB = this.cfw.b();
                        int iB2 = this.cfw.b();
                        this.cfw.D(iB);
                        generateIntegerWrap();
                        this.cfw.h(newWordLocal);
                        while (firstChild != null) {
                            generateStatement(firstChild);
                            firstChild = firstChild.getNext();
                        }
                        this.cfw.g(newWordLocal);
                        this.cfw.e(192, "java/lang/Integer");
                        generateIntegerUnwrap();
                        FinallyReturnPoint finallyReturnPoint = this.finallys.get(node);
                        int iB3 = this.cfw.b();
                        finallyReturnPoint.tableLabel = iB3;
                        this.cfw.d(Token.LET, iB3);
                        this.cfw.m = 0;
                        releaseWordLocal(newWordLocal);
                        this.cfw.D(iB2);
                        return;
                    }
                    return;
                }
                if (type != 141) {
                    if (type == 155) {
                        boolean z = this.inLocalBlock;
                        this.inLocalBlock = true;
                        short newWordLocal2 = getNewWordLocal();
                        if (this.isGenerator) {
                            this.cfw.c(1);
                            this.cfw.h(newWordLocal2);
                        }
                        node.putIntProp(2, newWordLocal2);
                        while (firstChild != null) {
                            generateStatement(firstChild);
                            firstChild = firstChild.getNext();
                        }
                        releaseWordLocal(newWordLocal2);
                        node.removeProp(2);
                        this.inLocalBlock = z;
                        return;
                    }
                    if (type != 174) {
                        switch (type) {
                            case 2:
                                generateExpression(firstChild, node);
                                this.cfw.g(this.contextLocal);
                                this.cfw.g(this.variableObjectLocal);
                                addScriptRuntimeInvoke("enterWith", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                                this.cfw.h(this.variableObjectLocal);
                                incReferenceWordLocal(this.variableObjectLocal);
                                return;
                            case 3:
                                this.cfw.g(this.variableObjectLocal);
                                addScriptRuntimeInvoke("leaveWith", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                                this.cfw.h(this.variableObjectLocal);
                                decReferenceWordLocal(this.variableObjectLocal);
                                return;
                            case 4:
                                break;
                            default:
                                switch (type) {
                                    case Token.CATCH_SCOPE /* 62 */:
                                        this.cfw.m = 0;
                                        int localBlockRegister = getLocalBlockRegister(node);
                                        int existingIntProp = node.getExistingIntProp(14);
                                        String string = firstChild.getType() == 44 ? firstChild.getString() : null;
                                        generateExpression(firstChild.getNext(), node);
                                        ClassFileWriter classFileWriter = this.cfw;
                                        if (existingIntProp == 0) {
                                            classFileWriter.c(1);
                                        } else {
                                            classFileWriter.g(localBlockRegister);
                                        }
                                        ClassFileWriter classFileWriter2 = this.cfw;
                                        if (string != null) {
                                            classFileWriter2.s(string);
                                        } else {
                                            classFileWriter2.c(1);
                                        }
                                        this.cfw.g(this.contextLocal);
                                        this.cfw.g(this.variableObjectLocal);
                                        addScriptRuntimeInvoke("newCatchScope", "(Ljava/lang/Throwable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                                        this.cfw.h(localBlockRegister);
                                        return;
                                    case Token.ENUM_INIT_KEYS /* 63 */:
                                    case Token.ENUM_INIT_VALUES /* 64 */:
                                    case Token.ENUM_INIT_ARRAY /* 65 */:
                                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                        generateExpression(firstChild, node);
                                        this.cfw.g(this.contextLocal);
                                        this.cfw.g(this.variableObjectLocal);
                                        if (type == 63) {
                                            i = 0;
                                        } else if (type != 64) {
                                            i = type == 66 ? 6 : 2;
                                        }
                                        this.cfw.r(i);
                                        addScriptRuntimeInvoke("enumInit", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                                        this.cfw.h(getLocalBlockRegister(node));
                                        return;
                                    default:
                                        switch (type) {
                                            case Token.BLOCK /* 143 */:
                                            case Token.LABEL /* 144 */:
                                            case Token.LOOP /* 146 */:
                                            case 150:
                                                break;
                                            case Token.TARGET /* 145 */:
                                                if (this.compilerEnv.isGenerateObserverCount()) {
                                                    addInstructionCount();
                                                }
                                                this.cfw.D(getTargetLabel(node));
                                                if (this.compilerEnv.isGenerateObserverCount()) {
                                                    saveCurrentCodeOffset();
                                                    return;
                                                }
                                                return;
                                            case Token.EXPR_VOID /* 147 */:
                                                if (firstChild.getType() == 61) {
                                                    visitSetVar(firstChild, firstChild.getFirstChild(), false);
                                                    return;
                                                }
                                                if (firstChild.getType() == 170) {
                                                    visitSetConstVar(firstChild, firstChild.getFirstChild(), false);
                                                    return;
                                                }
                                                if (firstChild.getType() == 78 || firstChild.getType() == 179) {
                                                    generateYieldPoint(firstChild, false);
                                                    return;
                                                }
                                                generateExpression(firstChild, node);
                                                int intProp = node.getIntProp(8, -1);
                                                ClassFileWriter classFileWriter3 = this.cfw;
                                                if (intProp != -1) {
                                                    classFileWriter3.c(88);
                                                    return;
                                                } else {
                                                    classFileWriter3.c(87);
                                                    return;
                                                }
                                            case Token.EXPR_RESULT /* 148 */:
                                                generateExpression(firstChild, node);
                                                if (this.popvLocal < 0) {
                                                    this.popvLocal = getNewWordLocal();
                                                }
                                                this.cfw.h(this.popvLocal);
                                                return;
                                            case Token.JSR /* 149 */:
                                                break;
                                            default:
                                                throw Codegen.badTree();
                                        }
                                        break;
                                }
                            case 5:
                            case 6:
                            case 7:
                                if (this.compilerEnv.isGenerateObserverCount()) {
                                    addInstructionCount();
                                }
                                visitGoto((Jump) node, type, firstChild);
                                return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.compilerEnv.isGenerateObserverCount()) {
                addInstructionCount(1);
            }
            while (firstChild != null) {
                generateStatement(firstChild);
                firstChild = firstChild.getNext();
            }
            return;
        }
        if (firstChild != null) {
            generateExpression(firstChild, node);
        } else if (type == 4) {
            Codegen.pushUndefined(this.cfw);
        } else {
            int i2 = this.popvLocal;
            if (i2 < 0) {
                throw Codegen.badTree();
            }
            this.cfw.g(i2);
        }
        if (this.isGenerator) {
            generateSetGeneratorReturnValue();
        }
        if (this.compilerEnv.isGenerateObserverCount()) {
            addInstructionCount();
        }
        if (this.epilogueLabel == -1) {
            if (!this.hasVarsInRegs) {
                throw Codegen.badTree();
            }
            this.epilogueLabel = this.cfw.b();
        }
        this.cfw.d(Token.LET, this.epilogueLabel);
    }

    private void generateThrowJavaScriptException() {
        this.cfw.e(Token.LAST_TOKEN, "org/mozilla/javascript/JavaScriptException");
        this.cfw.c(90);
        this.cfw.c(95);
        this.cfw.s(this.scriptOrFn.getSourceName());
        this.cfw.r(this.itsLineNumber);
        this.cfw.m("org/mozilla/javascript/JavaScriptException", Token.TAGGED_TEMPLATE_LITERAL, "<init>", "(Ljava/lang/Object;Ljava/lang/String;I)V");
        this.cfw.c(191);
    }

    private void generateYieldPoint(Node node, boolean z) {
        if (this.unnestedYields.containsKey(node)) {
            if (z) {
                String str = this.unnestedYields.get(node);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                addDynamicInvoke("PROP:GETNOWARN:" + str, "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
                return;
            }
            return;
        }
        Node nodeFindNestedYield = findNestedYield(node);
        if (nodeFindNestedYield != null) {
            generateYieldPoint(nodeFindNestedYield, true);
            String strL = a.l(this.unnestedYieldCount, "__nested__yield__");
            this.unnestedYieldCount++;
            this.cfw.g(this.variableObjectLocal);
            this.cfw.c(95);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            addDynamicInvoke("PROP:SET:".concat(strL), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
            this.cfw.c(87);
            this.unnestedYields.put(nodeFindNestedYield, strL);
        }
        generateLocalYieldPoint(node, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Node getFinallyAtTarget(Node node) {
        Node next;
        if (node == null) {
            return null;
        }
        if (node.getType() == 138) {
            return node;
        }
        if (node.getType() == 145 && (next = node.getNext()) != null && next.getType() == 138) {
            return next;
        }
        throw Kit.codeBug("bad finally target");
    }

    private static int getLocalBlockRegister(Node node) {
        return ((Node) node.getProp(3)).getExistingIntProp(2);
    }

    private short getNewWordIntern(int i) {
        int[] iArr = this.locals;
        int i2 = this.firstFreeLocal;
        if (i > 1) {
            loop0: while (true) {
                if (i2 + i > 1024) {
                    i2 = -1;
                    break;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i) {
                        break loop0;
                    }
                    if (iArr[i2 + i3] != 0) {
                        break;
                    }
                    i3++;
                }
                i2 += i3 + 1;
            }
        }
        if (i2 != -1) {
            iArr[i2] = 1;
            if (i > 1) {
                iArr[i2 + 1] = 1;
            }
            if (i > 2) {
                iArr[i2 + 2] = 1;
            }
            if (i2 != this.firstFreeLocal) {
                return (short) i2;
            }
            for (int i4 = i + i2; i4 < 1024; i4++) {
                if (iArr[i4] == 0) {
                    short s = (short) i4;
                    this.firstFreeLocal = s;
                    if (this.localsMax < s) {
                        this.localsMax = s;
                    }
                    return (short) i2;
                }
            }
        }
        throw Context.reportRuntimeError("Program too complex (out of locals)");
    }

    private short getNewWordLocal(boolean z) {
        return getNewWordIntern(z ? 2 : 1);
    }

    private short getNewWordPairLocal(boolean z) {
        return getNewWordIntern(z ? 3 : 2);
    }

    private int getNextGeneratorState(Node node) {
        return ((FunctionNode) this.scriptOrFn).getResumptionPoints().indexOf(node) + 1;
    }

    private int getTargetLabel(Node node) {
        int iLabelId = node.labelId();
        if (iLabelId != -1) {
            return iLabelId;
        }
        int iB = this.cfw.b();
        node.labelId(iB);
        return iB;
    }

    private void incReferenceWordLocal(int i) {
        int[] iArr = this.locals;
        iArr[i] = iArr[i] + 1;
    }

    private void initBodyGeneration() {
        int paramAndVarCount;
        this.varRegisters = null;
        if (this.scriptOrFn.getType() == 122) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn);
            this.fnCurrent = optFunctionNode;
            boolean zRequiresActivation = optFunctionNode.fnode.requiresActivation();
            this.hasVarsInRegs = !zRequiresActivation;
            if (!zRequiresActivation && (paramAndVarCount = this.fnCurrent.fnode.getParamAndVarCount()) != 0) {
                this.varRegisters = new int[paramAndVarCount];
            }
            boolean zIsTargetOfDirectCall = this.fnCurrent.isTargetOfDirectCall();
            this.inDirectCallFunction = zIsTargetOfDirectCall;
            if (zIsTargetOfDirectCall && !this.hasVarsInRegs) {
                Codegen.badTree();
            }
        } else {
            this.fnCurrent = null;
            this.hasVarsInRegs = false;
            this.inDirectCallFunction = false;
        }
        this.locals = new int[1024];
        this.funObjLocal = 0;
        this.contextLocal = 1;
        this.variableObjectLocal = 2;
        this.thisObjLocal = 3;
        this.localsMax = 4;
        this.firstFreeLocal = 4;
        this.popvLocal = -1;
        this.argsLocal = -1;
        this.itsZeroArgArray = -1;
        this.itsOneArgArray = -1;
        this.epilogueLabel = -1;
        this.enterAreaStartLabel = -1;
        this.generatorStateLocal = -1;
        this.savedHomeObjectLocal = -1;
    }

    private void inlineFinally(Node node, int i, int i2) {
        Node finallyAtTarget = getFinallyAtTarget(node);
        finallyAtTarget.resetTargets();
        this.exceptionManager.markInlineFinallyStart(finallyAtTarget, i);
        for (Node firstChild = finallyAtTarget.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            generateStatement(firstChild);
        }
        this.exceptionManager.markInlineFinallyEnd(finallyAtTarget, i2);
    }

    private static boolean isArithmeticNode(Node node) {
        int type = node.getType();
        return type == 22 || type == 25 || type == 24 || type == 23;
    }

    private int nodeIsDirectCallParameter(Node node) {
        if (node.getType() != 60 || !this.inDirectCallFunction || this.itsForcedObjectParameters) {
            return -1;
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        if (this.fnCurrent.isParameter(varIndex)) {
            return this.varRegisters[varIndex];
        }
        return -1;
    }

    private void pushThisFromLastScriptable() {
        this.cfw.g(this.contextLocal);
        addScriptRuntimeInvoke("lastStoredScriptable", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void releaseWordLocal(int i) {
        if (i < this.firstFreeLocal) {
            this.firstFreeLocal = i;
        }
        this.locals[i] = 0;
    }

    private void saveCurrentCodeOffset() {
        this.savedCodeOffset = this.cfw.j;
    }

    private void updateLineNumber(Node node) {
        int lineno = node.getLineno();
        this.itsLineNumber = lineno;
        if (lineno == -1) {
            return;
        }
        this.cfw.n((short) lineno);
    }

    private boolean varIsDirectCallParameter(int i) {
        return this.fnCurrent.isParameter(i) && this.inDirectCallFunction && !this.itsForcedObjectParameters;
    }

    private void visitArithmetic(Node node, int i, Node node2, Node node3) {
        if (node.getIntProp(8, -1) != -1) {
            generateExpression(node2, node);
            generateExpression(node2.getNext(), node);
            switch (i) {
                case 22:
                    this.cfw.c(Token.ASSIGN_BITAND);
                    return;
                case 23:
                    this.cfw.c(Token.ASSIGN_URSH);
                    return;
                case 24:
                    this.cfw.c(Token.ASSIGN_DIV);
                    return;
                case 25:
                    this.cfw.c(Token.HOOK);
                    return;
                default:
                    throw Kit.codeBug(Token.typeToName(i));
            }
        }
        generateExpression(node2, node);
        if (!isArithmeticNode(node2)) {
            addObjectToNumeric();
        }
        generateExpression(node2.getNext(), node);
        if (!isArithmeticNode(node2.getNext())) {
            addObjectToNumeric();
        }
        switch (i) {
            case 22:
                addScriptRuntimeInvoke("subtract", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            case 23:
                addScriptRuntimeInvoke("multiply", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            case 24:
                addScriptRuntimeInvoke("divide", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            case 25:
                addScriptRuntimeInvoke("remainder", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            default:
                throw Kit.codeBug(Token.typeToName(i));
        }
    }

    private void visitArrayLiteral(Node node, Node node2, boolean z) {
        int iCountArguments = countArguments(node2);
        if (!z && ((iCountArguments > 10 || this.cfw.j > 30000) && !this.hasVarsInRegs && !this.isGenerator && !this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new ArrayList<>();
            }
            this.literals.add(node);
            String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + this.literals.size();
            this.cfw.g(this.funObjLocal);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.g(this.argsLocal);
            this.cfw.m(this.codegen.mainClassName, Token.TEMPLATE_LITERAL_SUBST, str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        int i = 0;
        if (this.isGenerator) {
            for (int i2 = 0; i2 != iCountArguments; i2++) {
                generateExpression(node2, node);
                node2 = node2.getNext();
            }
            addNewObjectArray(iCountArguments);
            while (i != iCountArguments) {
                this.cfw.c(90);
                this.cfw.c(95);
                this.cfw.r((iCountArguments - i) - 1);
                this.cfw.c(95);
                this.cfw.c(83);
                i++;
            }
        } else {
            addNewObjectArray(iCountArguments);
            while (i != iCountArguments) {
                this.cfw.c(89);
                this.cfw.r(i);
                generateExpression(node2, node);
                this.cfw.c(83);
                node2 = node2.getNext();
                i++;
            }
        }
        int[] iArr = (int[]) node.getProp(11);
        ClassFileWriter classFileWriter = this.cfw;
        if (iArr == null) {
            classFileWriter.c(1);
            this.cfw.c(3);
        } else {
            classFileWriter.s(OptRuntime.encodeIntArray(iArr));
            this.cfw.r(iArr.length);
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addOptRuntimeInvoke("newArrayLiteral", "([Ljava/lang/Object;Ljava/lang/String;ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitBitNot(Node node, Node node2) {
        int intProp = node.getIntProp(8, -1);
        generateExpression(node2, node);
        if (intProp == -1) {
            addObjectToNumeric();
            addScriptRuntimeInvoke("bitwiseNOT", "(Ljava/lang/Number;)Ljava/lang/Number;");
        } else {
            addScriptRuntimeInvoke("toInt32", "(D)I");
            this.cfw.r(-1);
            this.cfw.c(130);
            this.cfw.c(Token.VAR);
        }
    }

    private void visitBitOp(Node node, int i, Node node2) {
        int intProp = node.getIntProp(8, -1);
        generateExpression(node2, node);
        if (i == 20) {
            addDynamicInvoke("MATH:TOUINT32", Signatures.MATH_TO_UINT32);
            generateExpression(node2.getNext(), node);
            addDynamicInvoke("MATH:TOINT32", Signatures.MATH_TO_INT32);
            this.cfw.r(31);
            this.cfw.c(Token.ELSE);
            this.cfw.c(Token.IF);
            this.cfw.c(Token.FINALLY);
            addDoubleWrap();
            return;
        }
        if (intProp == -1) {
            addObjectToNumeric();
            generateExpression(node2.getNext(), node);
            addObjectToNumeric();
            if (i == 18) {
                addScriptRuntimeInvoke("leftShift", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            }
            if (i == 19) {
                addScriptRuntimeInvoke("signedRightShift", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                return;
            }
            switch (i) {
                case 9:
                    addScriptRuntimeInvoke("bitwiseOR", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                    return;
                case 10:
                    addScriptRuntimeInvoke("bitwiseXOR", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                    return;
                case 11:
                    addScriptRuntimeInvoke("bitwiseAND", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                    return;
                default:
                    throw Kit.codeBug(Token.typeToName(i));
            }
        }
        addScriptRuntimeInvoke("toInt32", "(D)I");
        generateExpression(node2.getNext(), node);
        addScriptRuntimeInvoke("toInt32", "(D)I");
        if (i == 18) {
            this.cfw.c(120);
        } else if (i != 19) {
            switch (i) {
                case 9:
                    this.cfw.c(128);
                    break;
                case 10:
                    this.cfw.c(130);
                    break;
                case 11:
                    this.cfw.c(Token.ELSE);
                    break;
                default:
                    throw Kit.codeBug(Token.typeToName(i));
            }
        } else {
            this.cfw.c(Token.FUNCTION);
        }
        this.cfw.c(Token.VAR);
    }

    private void visitDotQuery(Node node, Node node2) {
        updateLineNumber(node);
        generateExpression(node2, node);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("enterDotQuery", "(Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.h(this.variableObjectLocal);
        this.cfw.c(1);
        int iB = this.cfw.b();
        this.cfw.D(iB);
        this.cfw.c(87);
        generateExpression(node2.getNext(), node);
        addDynamicInvoke("MATH:TOBOOLEAN", Signatures.MATH_TO_BOOLEAN);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("updateDotQuery", "(ZLorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        this.cfw.c(89);
        this.cfw.d(198, iB);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("leaveDotQuery", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.h(this.variableObjectLocal);
    }

    private void visitExponentiation(Node node, Node node2, Node node3) {
        if (node.getIntProp(8, -1) != -1) {
            generateExpression(node2, node);
            generateExpression(node2.getNext(), node);
            this.cfw.m("java/lang/Math", Token.DOTDOTDOT, "pow", "(DD)D");
            return;
        }
        generateExpression(node2, node);
        generateExpression(node2.getNext(), node);
        short newWordLocal = getNewWordLocal();
        this.cfw.h(newWordLocal);
        addObjectToNumeric();
        this.cfw.g(newWordLocal);
        addObjectToNumeric();
        addScriptRuntimeInvoke("exponentiate", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
    }

    private void visitFunction(OptFunctionNode optFunctionNode, int i) {
        int index = this.codegen.getIndex(optFunctionNode.fnode);
        this.cfw.e(Token.LAST_TOKEN, this.codegen.mainClassName);
        this.cfw.c(89);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.contextLocal);
        this.cfw.r(index);
        this.cfw.m(this.codegen.mainClassName, Token.TAGGED_TEMPLATE_LITERAL, "<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        if (i == 4) {
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            addOptRuntimeInvoke("bindThis", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Function;");
        }
        if (optFunctionNode.fnode.isMethodDefinition()) {
            this.cfw.c(89);
            this.cfw.g(this.savedHomeObjectLocal);
            this.cfw.m("org/mozilla/javascript/BaseFunction", Token.TEMPLATE_LITERAL_SUBST, "setHomeObject", "(Lorg/mozilla/javascript/Scriptable;)V");
        }
        if (i == 2 || i == 4) {
            return;
        }
        this.cfw.r(i);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.g(this.contextLocal);
        addOptRuntimeInvoke("initFunction", "(Lorg/mozilla/javascript/NativeFunction;ILorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;)V");
    }

    private void visitGetProp(Node node, Node node2) {
        generateExpression(node2, node);
        if (node.getIntProp(30, 0) != 1) {
            finishGetPropGeneration(node, node2.getNext());
            return;
        }
        int iB = this.cfw.b();
        int iB2 = this.cfw.b();
        this.cfw.c(89);
        addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
        this.cfw.d(Token.SETPROP_OP, iB);
        this.cfw.c(87);
        this.cfw.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
        this.cfw.d(Token.LET, iB2);
        this.cfw.D(iB);
        finishGetPropGeneration(node, node2.getNext());
        this.cfw.D(iB2);
    }

    private void visitGetVar(Node node) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        int i = this.varRegisters[varIndex];
        if (varIsDirectCallParameter(varIndex)) {
            if (node.getIntProp(8, -1) != -1) {
                dcpLoadAsNumber(i);
                return;
            } else {
                dcpLoadAsObject(i);
                return;
            }
        }
        boolean zIsNumberVar = this.fnCurrent.isNumberVar(varIndex);
        ClassFileWriter classFileWriter = this.cfw;
        if (zIsNumberVar) {
            classFileWriter.i(i);
        } else {
            classFileWriter.g(i);
        }
    }

    private void visitGoto(Jump jump, int i, Node node) {
        Node node2 = jump.target;
        if (i != 6 && i != 7) {
            if (i != 149) {
                addGoto(node2, Token.LET);
                return;
            } else if (this.isGenerator) {
                addGotoWithReturn(node2);
                return;
            } else {
                inlineFinally(node2);
                return;
            }
        }
        if (node == null) {
            throw Codegen.badTree();
        }
        int targetLabel = getTargetLabel(node2);
        int iB = this.cfw.b();
        if (i == 6) {
            generateIfJump(node, jump, targetLabel, iB);
        } else {
            generateIfJump(node, jump, iB, targetLabel);
        }
        this.cfw.D(iB);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5 A[PHI: r1
  0x00e5: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v8 java.lang.String) binds: [B:33:0x00ce, B:37:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    private void visitIfJumpEqOp(Node node, Node node2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Node node3 = node2;
        if (i == -1 || i2 == -1) {
            throw Codegen.badTree();
        }
        int i6 = this.cfw.m;
        int type = node.getType();
        Node next = node3.getNext();
        if (type == 12 || type == 13 || !(node3.getType() == 47 || next.getType() == 47)) {
            int iNodeIsDirectCallParameter = nodeIsDirectCallParameter(node3);
            if (iNodeIsDirectCallParameter == -1 || next.getType() != 163) {
                i3 = Token.SETPROP_OP;
                i4 = Token.SETELEM_OP;
            } else {
                Node firstChild = next.getFirstChild();
                if (firstChild.getType() == 45) {
                    this.cfw.g(iNodeIsDirectCallParameter);
                    this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
                    int iB = this.cfw.b();
                    this.cfw.d(Token.SET, iB);
                    this.cfw.i(iNodeIsDirectCallParameter + 1);
                    this.cfw.q(firstChild.getDouble());
                    this.cfw.c(Token.TYPEOFNAME);
                    ClassFileWriter classFileWriter = this.cfw;
                    if (type == 12) {
                        i3 = Token.SETPROP_OP;
                        classFileWriter.d(Token.SETPROP_OP, i);
                        i4 = Token.SETELEM_OP;
                    } else {
                        i3 = Token.SETPROP_OP;
                        i4 = Token.SETELEM_OP;
                        classFileWriter.d(Token.SETELEM_OP, i);
                    }
                    this.cfw.d(Token.LET, i2);
                    this.cfw.D(iB);
                } else {
                    i3 = Token.SETPROP_OP;
                    i4 = Token.SETELEM_OP;
                }
            }
            generateExpression(node3, node);
            generateExpression(next, node);
            String str = "MATH:EQ";
            if (type == 12) {
                i5 = i4;
            } else {
                if (type != 13) {
                    str = "MATH:SHALLOWEQ";
                    if (type == 51) {
                        i5 = i4;
                    } else if (type != 52) {
                        throw Codegen.badTree();
                    }
                }
                i5 = i3;
            }
            addDynamicInvoke(str, "(Ljava/lang/Object;Ljava/lang/Object;)Z");
            this.cfw.d(i5, i);
            this.cfw.d(Token.LET, i2);
        } else {
            if (node3.getType() == 47) {
                node3 = next;
            }
            generateExpression(node3, node);
            this.cfw.d(type == 51 ? 198 : 199, i);
            this.cfw.d(Token.LET, i2);
        }
        if (i6 != this.cfw.m) {
            throw Codegen.badTree();
        }
    }

    private void visitIfJumpRelOp(Node node, Node node2, int i, int i2) {
        String str;
        if (i == -1 || i2 == -1) {
            throw Codegen.badTree();
        }
        int type = node.getType();
        Node next = node2.getNext();
        if (type == 58 || type == 57) {
            generateExpression(node2, node);
            generateExpression(next, node);
            this.cfw.g(this.contextLocal);
            addScriptRuntimeInvoke(type == 58 ? "instanceOf" : "in", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Z");
            this.cfw.d(Token.SETELEM_OP, i);
            this.cfw.d(Token.LET, i2);
            return;
        }
        int intProp = node.getIntProp(8, -1);
        int iNodeIsDirectCallParameter = nodeIsDirectCallParameter(node2);
        int iNodeIsDirectCallParameter2 = nodeIsDirectCallParameter(next);
        if (intProp != -1) {
            if (intProp != 2) {
                generateExpression(node2, node);
            } else if (iNodeIsDirectCallParameter != -1) {
                dcpLoadAsNumber(iNodeIsDirectCallParameter);
            } else {
                generateExpression(node2, node);
                addObjectToDouble();
            }
            if (intProp != 1) {
                generateExpression(next, node);
            } else if (iNodeIsDirectCallParameter2 != -1) {
                dcpLoadAsNumber(iNodeIsDirectCallParameter2);
            } else {
                generateExpression(next, node);
                addObjectToDouble();
            }
            genSimpleCompare(type, i, i2);
            return;
        }
        if (iNodeIsDirectCallParameter == -1 || iNodeIsDirectCallParameter2 == -1) {
            generateExpression(node2, node);
            generateExpression(next, node);
        } else {
            ClassFileWriter classFileWriter = this.cfw;
            int i3 = classFileWriter.m;
            int iB = classFileWriter.b();
            this.cfw.g(iNodeIsDirectCallParameter);
            this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
            this.cfw.d(Token.SET, iB);
            this.cfw.i(iNodeIsDirectCallParameter + 1);
            dcpLoadAsNumber(iNodeIsDirectCallParameter2);
            genSimpleCompare(type, i, i2);
            ClassFileWriter classFileWriter2 = this.cfw;
            if (i3 != classFileWriter2.m) {
                throw Codegen.badTree();
            }
            classFileWriter2.D(iB);
            int iB2 = this.cfw.b();
            this.cfw.g(iNodeIsDirectCallParameter2);
            this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
            this.cfw.d(Token.SET, iB2);
            this.cfw.g(iNodeIsDirectCallParameter);
            addObjectToDouble();
            this.cfw.i(iNodeIsDirectCallParameter2 + 1);
            genSimpleCompare(type, i, i2);
            ClassFileWriter classFileWriter3 = this.cfw;
            if (i3 != classFileWriter3.m) {
                throw Codegen.badTree();
            }
            classFileWriter3.D(iB2);
            this.cfw.g(iNodeIsDirectCallParameter);
            this.cfw.g(iNodeIsDirectCallParameter2);
        }
        switch (type) {
            case 14:
                str = "MATH:COMPARELT";
                break;
            case 15:
                str = "MATH:COMPARELE";
                break;
            case 16:
                str = "MATH:COMPAREGT";
                break;
            case 17:
                str = "MATH:COMPAREGE";
                break;
            default:
                throw Kit.codeBug();
        }
        addDynamicInvoke(str, "(Ljava/lang/Object;Ljava/lang/Object;)Z");
        this.cfw.d(Token.SETELEM_OP, i);
        this.cfw.d(Token.LET, i2);
    }

    private void visitIncDec(Node node) {
        int existingIntProp = node.getExistingIntProp(13);
        Node firstChild = node.getFirstChild();
        if (firstChild.getIntProp(31, 0) == 1) {
            visitSuperIncDec(node, firstChild, existingIntProp);
            return;
        }
        int type = firstChild.getType();
        if (type == 33) {
            Node firstChild2 = firstChild.getFirstChild();
            generateExpression(firstChild2, node);
            generateExpression(firstChild2.getNext(), node);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.r(existingIntProp);
            addScriptRuntimeInvoke("propIncrDecr", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
            return;
        }
        if (type == 34) {
            throw Kit.codeBug();
        }
        if (type == 39) {
            Node firstChild3 = firstChild.getFirstChild();
            generateExpression(firstChild3, node);
            generateExpression(firstChild3.getNext(), node);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.r(existingIntProp);
            if (firstChild3.getNext().getIntProp(8, -1) != -1) {
                addOptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                return;
            } else {
                addScriptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                return;
            }
        }
        if (type == 44) {
            this.cfw.g(this.variableObjectLocal);
            this.cfw.s(firstChild.getString());
            this.cfw.g(this.contextLocal);
            this.cfw.r(existingIntProp);
            addScriptRuntimeInvoke("nameIncrDecr", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
            return;
        }
        if (type != 60) {
            if (type != 73) {
                Codegen.badTree();
                return;
            }
            generateExpression(firstChild.getFirstChild(), node);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.r(existingIntProp);
            addScriptRuntimeInvoke("refIncrDecr", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
            return;
        }
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        boolean z = (existingIntProp & 2) != 0;
        int varIndex = this.fnCurrent.getVarIndex(firstChild);
        int i = this.varRegisters[varIndex];
        if (this.fnCurrent.fnode.getParamAndVarConst()[varIndex]) {
            if (node.getIntProp(8, -1) != -1) {
                this.cfw.i(i + (varIsDirectCallParameter(varIndex) ? 1 : 0));
                if (z) {
                    return;
                }
                this.cfw.q(1.0d);
                int i2 = existingIntProp & 1;
                ClassFileWriter classFileWriter = this.cfw;
                if (i2 == 0) {
                    classFileWriter.c(99);
                    return;
                } else {
                    classFileWriter.c(Token.ASSIGN_BITAND);
                    return;
                }
            }
            if (varIsDirectCallParameter(varIndex)) {
                dcpLoadAsObject(i);
            } else {
                this.cfw.g(i);
            }
            if (z) {
                this.cfw.c(89);
                addObjectToDouble();
                this.cfw.c(88);
                return;
            }
            addObjectToDouble();
            this.cfw.q(1.0d);
            int i3 = existingIntProp & 1;
            ClassFileWriter classFileWriter2 = this.cfw;
            if (i3 == 0) {
                classFileWriter2.c(99);
            } else {
                classFileWriter2.c(Token.ASSIGN_BITAND);
            }
            addDoubleWrap();
            return;
        }
        if (node.getIntProp(8, -1) != -1) {
            boolean zVarIsDirectCallParameter = varIsDirectCallParameter(varIndex);
            ClassFileWriter classFileWriter3 = this.cfw;
            int i4 = i + (zVarIsDirectCallParameter ? 1 : 0);
            classFileWriter3.i(i4);
            if (z) {
                this.cfw.c(92);
            }
            this.cfw.q(1.0d);
            int i5 = existingIntProp & 1;
            ClassFileWriter classFileWriter4 = this.cfw;
            if (i5 == 0) {
                classFileWriter4.c(99);
            } else {
                classFileWriter4.c(Token.ASSIGN_BITAND);
            }
            if (!z) {
                this.cfw.c(92);
            }
            this.cfw.Q(71, 57, i4);
            return;
        }
        if (varIsDirectCallParameter(varIndex)) {
            dcpLoadAsObject(i);
        } else {
            this.cfw.g(i);
        }
        addObjectToDouble();
        if (z) {
            this.cfw.c(92);
        }
        this.cfw.q(1.0d);
        int i6 = existingIntProp & 1;
        ClassFileWriter classFileWriter5 = this.cfw;
        if (i6 == 0) {
            classFileWriter5.c(99);
        } else {
            classFileWriter5.c(Token.ASSIGN_BITAND);
        }
        addDoubleWrap();
        if (!z) {
            this.cfw.c(89);
        }
        this.cfw.h(i);
        if (z) {
            addDoubleWrap();
        }
    }

    private void visitObjectLiteral(Node node, Node node2, boolean z) {
        Object[] objArr = (Object[]) node.getProp(12);
        int length = objArr == null ? 0 : objArr.length;
        if (!z && ((length > 10 || this.cfw.j > 30000) && !this.hasVarsInRegs && !this.isGenerator && !this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new ArrayList<>();
            }
            this.literals.add(node);
            String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + this.literals.size();
            this.cfw.g(this.funObjLocal);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.g(this.argsLocal);
            this.cfw.m(this.codegen.mainClassName, Token.TEMPLATE_LITERAL_SUBST, str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        this.cfw.m("org/mozilla/javascript/Context", Token.TEMPLATE_LITERAL_SUBST, "newObject", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.c(89);
        short newWordLocal = getNewWordLocal();
        this.savedHomeObjectLocal = newWordLocal;
        this.cfw.h(newWordLocal);
        this.cfw.c(89);
        addLoadProperty(node, node2, objArr, length);
        Node next = node2;
        for (int i = 0; i != length; i++) {
            int type = next.getType();
            if (type == 165 || type == 166) {
                this.cfw.r(length);
                this.cfw.d(188, 10);
                for (int i2 = 0; i2 != length; i2++) {
                    this.cfw.c(89);
                    this.cfw.r(i2);
                    int type2 = node2.getType();
                    if (type2 == 165) {
                        this.cfw.c(2);
                    } else {
                        ClassFileWriter classFileWriter = this.cfw;
                        if (type2 == 166) {
                            classFileWriter.c(4);
                        } else {
                            classFileWriter.c(3);
                        }
                    }
                    this.cfw.c(79);
                    node2 = node2.getNext();
                }
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                addScriptRuntimeInvoke("fillObjectLiteral", "(Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
            }
            next = next.getNext();
        }
        this.cfw.c(1);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addScriptRuntimeInvoke("fillObjectLiteral", "(Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
    }

    private void visitOptimizedCall(Node node, OptFunctionNode optFunctionNode, int i, Node node2) {
        short newWordLocal = 0;
        if (node.getIntProp(31, 0) == 1) {
            Kit.codeBug();
        }
        Node next = node2.getNext();
        String str = this.codegen.mainClassName;
        if (i == 30) {
            generateExpression(node2, node);
        } else {
            generateFunctionAndThisObj(node2, node);
            pushThisFromLastScriptable();
            newWordLocal = getNewWordLocal();
            this.cfw.h(newWordLocal);
        }
        int iB = this.cfw.b();
        int iB2 = this.cfw.b();
        this.cfw.c(89);
        this.cfw.e(193, str);
        this.cfw.d(Token.SETPROP_OP, iB2);
        this.cfw.e(192, str);
        this.cfw.c(89);
        this.cfw.f(str, 180, "_id", "I");
        this.cfw.r(this.codegen.getIndex(optFunctionNode.fnode));
        this.cfw.d(160, iB2);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        ClassFileWriter classFileWriter = this.cfw;
        if (i == 30) {
            classFileWriter.c(1);
        } else {
            classFileWriter.g(newWordLocal);
        }
        for (Node next2 = next; next2 != null; next2 = next2.getNext()) {
            int iNodeIsDirectCallParameter = nodeIsDirectCallParameter(next2);
            if (iNodeIsDirectCallParameter >= 0) {
                this.cfw.g(iNodeIsDirectCallParameter);
                this.cfw.i(iNodeIsDirectCallParameter + 1);
            } else if (next2.getIntProp(8, -1) == 0) {
                this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
                generateExpression(next2, node);
            } else {
                generateExpression(next2, node);
                this.cfw.q(0.0d);
            }
        }
        this.cfw.f("org/mozilla/javascript/ScriptRuntime", Token.ARROW, "emptyArgs", "[Ljava/lang/Object;");
        ClassFileWriter classFileWriter2 = this.cfw;
        Codegen codegen = this.codegen;
        String str2 = codegen.mainClassName;
        FunctionNode functionNode = optFunctionNode.fnode;
        classFileWriter2.m(str2, Token.DOTDOTDOT, i == 30 ? codegen.getDirectCtorName(functionNode) : codegen.getBodyMethodName(functionNode), this.codegen.getBodyMethodSignature(optFunctionNode.fnode));
        this.cfw.d(Token.LET, iB);
        this.cfw.D(iB2);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (i != 30) {
            this.cfw.g(newWordLocal);
            releaseWordLocal(newWordLocal);
        }
        generateCallArgArray(node, next, true);
        if (i == 30) {
            addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        } else {
            this.cfw.m("org/mozilla/javascript/Callable", 185, "call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        }
        this.cfw.D(iB);
    }

    private void visitSetConst(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.g(this.contextLocal);
        addDynamicInvoke("NAME:SETCONST:" + string, Signatures.NAME_SET_CONST);
    }

    private void visitSetConstVar(Node node, Node node2, boolean z) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        generateExpression(node2.getNext(), node);
        boolean z2 = node.getIntProp(8, -1) != -1;
        int i = this.varRegisters[varIndex];
        int iB = this.cfw.b();
        int iB2 = this.cfw.b();
        ClassFileWriter classFileWriter = this.cfw;
        if (z2) {
            int i2 = i + 2;
            classFileWriter.l(i2);
            this.cfw.d(Token.SETELEM_OP, iB2);
            ClassFileWriter classFileWriter2 = this.cfw;
            int i3 = classFileWriter2.m;
            classFileWriter2.r(1);
            this.cfw.Q(59, 54, i2);
            this.cfw.Q(71, 57, i);
            ClassFileWriter classFileWriter3 = this.cfw;
            if (z) {
                classFileWriter3.i(i);
                this.cfw.E(iB2, i3);
            } else {
                classFileWriter3.d(Token.LET, iB);
                this.cfw.E(iB2, i3);
                this.cfw.c(88);
            }
        } else {
            int i4 = i + 1;
            classFileWriter.l(i4);
            this.cfw.d(Token.SETELEM_OP, iB2);
            ClassFileWriter classFileWriter4 = this.cfw;
            int i5 = classFileWriter4.m;
            classFileWriter4.r(1);
            this.cfw.Q(59, 54, i4);
            this.cfw.h(i);
            ClassFileWriter classFileWriter5 = this.cfw;
            if (z) {
                classFileWriter5.g(i);
                this.cfw.E(iB2, i5);
            } else {
                classFileWriter5.d(Token.LET, iB);
                this.cfw.E(iB2, i5);
                this.cfw.c(87);
            }
        }
        this.cfw.D(iB);
    }

    private void visitSetElem(int i, Node node, Node node2) {
        generateExpression(node2, node);
        Node next = node2.getNext();
        if (i == 154) {
            this.cfw.c(89);
        }
        generateExpression(next, node);
        Node next2 = next.getNext();
        boolean z = node.getIntProp(8, -1) != -1;
        boolean z2 = node.getIntProp(31, 0) == 1;
        if (i == 154) {
            if (z2) {
                this.cfw.c(90);
                this.cfw.g(this.contextLocal);
                this.cfw.g(this.variableObjectLocal);
                this.cfw.g(this.thisObjLocal);
                addDynamicInvoke("PROP:GETELEMENTSUPER", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
            } else {
                ClassFileWriter classFileWriter = this.cfw;
                if (z) {
                    classFileWriter.c(93);
                    this.cfw.g(this.contextLocal);
                    this.cfw.g(this.variableObjectLocal);
                    addDynamicInvoke("PROP:GETINDEX", Signatures.PROP_GET_INDEX);
                } else {
                    classFileWriter.c(90);
                    this.cfw.g(this.contextLocal);
                    this.cfw.g(this.variableObjectLocal);
                    addDynamicInvoke("PROP:GETELEMENT", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
                }
            }
        }
        generateExpression(next2, node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (z2) {
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke("PROP:SETELEMENTSUPER", Signatures.PROP_SET_ELEMENT_SUPER);
        } else if (z) {
            addDynamicInvoke("PROP:SETINDEX", Signatures.PROP_SET_INDEX);
        } else {
            addDynamicInvoke("PROP:SETELEMENT", Signatures.PROP_SET_ELEMENT);
        }
    }

    private void visitSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addDynamicInvoke("NAME:SET:" + string, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
    }

    private void visitSetProp(int i, Node node, Node node2) {
        generateExpression(node2, node);
        Node next = node2.getNext();
        if (i == 153) {
            this.cfw.c(89);
            finishGetPropGeneration(node, next);
        }
        generateExpression(next.getNext(), node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        if (node.getIntProp(31, 0) != 1) {
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:SET:", next.getString()), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        } else {
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:SETSUPER:", next.getString()), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
        }
    }

    private void visitSetVar(Node node, Node node2, boolean z) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        generateExpression(node2.getNext(), node);
        boolean z2 = node.getIntProp(8, -1) != -1;
        int i = this.varRegisters[varIndex];
        if (this.fnCurrent.fnode.getParamAndVarConst()[varIndex]) {
            if (z) {
                return;
            }
            ClassFileWriter classFileWriter = this.cfw;
            if (z2) {
                classFileWriter.c(88);
                return;
            } else {
                classFileWriter.c(87);
                return;
            }
        }
        if (varIsDirectCallParameter(varIndex)) {
            if (!z2) {
                if (z) {
                    this.cfw.c(89);
                }
                this.cfw.h(i);
                return;
            }
            if (z) {
                this.cfw.c(92);
            }
            this.cfw.g(i);
            this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
            int iB = this.cfw.b();
            int iB2 = this.cfw.b();
            this.cfw.d(Token.GET, iB);
            int i2 = this.cfw.m;
            addDoubleWrap();
            this.cfw.h(i);
            this.cfw.d(Token.LET, iB2);
            this.cfw.E(iB, i2);
            this.cfw.Q(71, 57, i + 1);
            this.cfw.D(iB2);
            return;
        }
        boolean zIsNumberVar = this.fnCurrent.isNumberVar(varIndex);
        if (!z2) {
            if (zIsNumberVar) {
                Kit.codeBug();
            }
            this.cfw.h(i);
            if (z) {
                this.cfw.g(i);
                return;
            }
            return;
        }
        if (zIsNumberVar) {
            this.cfw.Q(71, 57, i);
            if (z) {
                this.cfw.i(i);
                return;
            }
            return;
        }
        if (z) {
            this.cfw.c(92);
        }
        addDoubleWrap();
        this.cfw.h(i);
    }

    private void visitSpecialCall(Node node, int i, int i2, Node node2) {
        String str;
        String str2;
        this.cfw.g(this.contextLocal);
        if (i == 30) {
            generateExpression(node2, node);
        } else {
            generateFunctionAndThisObj(node2, node);
            pushThisFromLastScriptable();
        }
        generateCallArgArray(node, node2.getNext(), false);
        if (i == 30) {
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.r(i2);
            str = "newObjectSpecial";
            str2 = "(Lorg/mozilla/javascript/Context;Ljava/lang/Object;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;";
        } else {
            boolean z = node.getIntProp(30, 0) == 1;
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.r(i2);
            String sourceName = this.scriptOrFn.getSourceName();
            ClassFileWriter classFileWriter = this.cfw;
            if (sourceName == null) {
                sourceName = "";
            }
            classFileWriter.s(sourceName);
            this.cfw.r(this.itsLineNumber);
            this.cfw.t(z);
            str = "callSpecial";
            str2 = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;ILjava/lang/String;IZ)Ljava/lang/Object;";
        }
        addOptRuntimeInvoke(str, str2);
    }

    private void visitStandardCall(Node node, Node node2) {
        if (node.getType() != 43) {
            throw Codegen.badTree();
        }
        Node next = node2.getNext();
        int type = node2.getType();
        boolean z = node.getIntProp(30, 0) == 1;
        int intProp = node.getIntProp(31, 0);
        String str = SIGNATURE_CALL2;
        String str2 = "call2";
        Integer numValueOf = null;
        if (intProp == 1) {
            int iCountArguments = countArguments(next);
            generateFunctionAndThisObj(node2, node);
            this.cfw.g(this.contextLocal);
            this.cfw.m("org/mozilla/javascript/ScriptRuntime", Token.DOTDOTDOT, "discardLastStoredScriptable", "(Lorg/mozilla/javascript/Context;)V");
            this.cfw.g(this.thisObjLocal);
            if (iCountArguments == 0) {
                str = SIGNATURE_CALL0;
                str2 = "call0";
            } else if (iCountArguments == 1) {
                generateExpression(next, node);
                str = SIGNATURE_CALL1;
                str2 = "call1";
            } else if (iCountArguments == 2) {
                generateExpression(next, node);
                generateExpression(next.getNext(), node);
            } else {
                generateCallArgArray(node, next, false);
                str = SIGNATURE_CALLN;
                str2 = "callN";
            }
        } else if (next != null) {
            boolean z2 = z;
            if (type == 44) {
                String string = node2.getString();
                if (z2) {
                    this.cfw.g(this.variableObjectLocal);
                    this.cfw.g(this.contextLocal);
                    addDynamicInvoke("NAME:GETWITHTHISOPTIONAL:" + string, Signatures.NAME_GET_THIS);
                    int iB = this.cfw.b();
                    numValueOf = Integer.valueOf(iB);
                    int iB2 = this.cfw.b();
                    this.cfw.c(89);
                    addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                    this.cfw.d(Token.SETPROP_OP, iB2);
                    this.cfw.c(87);
                    this.cfw.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
                    this.cfw.d(Token.LET, iB);
                    this.cfw.D(iB2);
                    pushThisFromLastScriptable();
                    generateCallArgArray(node, next, false);
                    str = SIGNATURE_CALLN;
                    str2 = "callN";
                } else {
                    generateCallArgArray(node, next, false);
                    this.cfw.s(string);
                    str2 = "callName";
                    str = "([Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
                }
            } else {
                int iCountArguments2 = countArguments(next);
                generateFunctionAndThisObj(node2, node);
                if (z2) {
                    int iB3 = this.cfw.b();
                    numValueOf = Integer.valueOf(iB3);
                    int iB4 = this.cfw.b();
                    this.cfw.c(89);
                    addOptRuntimeInvoke("isNullOrUndefined", Signatures.MATH_TO_BOOLEAN);
                    this.cfw.d(Token.SETPROP_OP, iB4);
                    this.cfw.c(87);
                    this.cfw.f("org/mozilla/javascript/Undefined", Token.ARROW, "instance", "Ljava/lang/Object;");
                    this.cfw.d(Token.LET, iB3);
                    this.cfw.D(iB4);
                    this.cfw.e(192, "org/mozilla/javascript/Callable");
                }
                pushThisFromLastScriptable();
                if (iCountArguments2 == 1) {
                    generateExpression(next, node);
                    str = SIGNATURE_CALL1;
                    str2 = "call1";
                } else if (iCountArguments2 == 2) {
                    generateExpression(next, node);
                    generateExpression(next.getNext(), node);
                    str = SIGNATURE_CALL2;
                } else {
                    generateCallArgArray(node, next, false);
                    str = SIGNATURE_CALLN;
                    str2 = "callN";
                }
            }
        } else if (type == 44) {
            this.cfw.s(node2.getString());
            str2 = z ? "callName0Optional" : "callName0";
            str = "(Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
        } else if (type == 33) {
            Node firstChild = node2.getFirstChild();
            generateExpression(firstChild, node);
            this.cfw.s(firstChild.getNext().getString());
            str2 = z ? "callProp0Optional" : "callProp0";
            str = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
        } else {
            if (type == 34) {
                throw Kit.codeBug();
            }
            generateFunctionAndThisObj(node2, node);
            pushThisFromLastScriptable();
            str2 = z ? "call0Optional" : "call0";
            str = SIGNATURE_CALL0;
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addOptRuntimeInvoke(str2, str);
        if (numValueOf != null) {
            this.cfw.D(numValueOf.intValue());
        }
    }

    private void visitStandardNew(Node node, Node node2) {
        if (node.getType() != 30) {
            throw Codegen.badTree();
        }
        Node next = node2.getNext();
        generateExpression(node2, node);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        generateCallArgArray(node, next, false);
        addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitStrictSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        addDynamicInvoke("NAME:SETSTRICT:" + string, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
    }

    private void visitSuperIncDec(Node node, Node node2, int i) {
        Node firstChild = node2.getFirstChild();
        generateExpression(firstChild, node);
        this.cfw.c(89);
        int type = node2.getType();
        if (type == 33) {
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            this.cfw.o(0);
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:GETSUPER:", node2.getFirstChild().getNext().getString()), Signatures.PROP_GET_SUPER);
        } else if (type != 39) {
            Codegen.badTree();
        } else {
            generateExpression(firstChild.getNext(), node);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke("PROP:GETELEMENTSUPER", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
        }
        int i2 = i & 2;
        if (i2 != 0) {
            this.cfw.c(95);
            this.cfw.c(92);
            this.cfw.c(87);
        }
        addObjectToDouble();
        this.cfw.q(1.0d);
        int i3 = i & 1;
        ClassFileWriter classFileWriter = this.cfw;
        if (i3 == 0) {
            classFileWriter.c(99);
        } else {
            classFileWriter.c(Token.ASSIGN_BITAND);
        }
        addDoubleWrap();
        int type2 = node2.getType();
        if (type2 == 33) {
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("PROP:SETSUPER:", node2.getFirstChild().getNext().getString()), "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Ljava/lang/Object;");
        } else if (type2 == 39) {
            generateExpression(firstChild.getNext(), node);
            this.cfw.c(95);
            this.cfw.g(this.contextLocal);
            this.cfw.g(this.variableObjectLocal);
            this.cfw.g(this.thisObjLocal);
            addDynamicInvoke("PROP:SETELEMENTSUPER", Signatures.PROP_SET_ELEMENT_SUPER);
        }
        if (i2 != 0) {
            this.cfw.c(87);
        }
    }

    private void visitSwitch(Jump jump, Node node) {
        generateExpression(node, jump);
        short newWordLocal = getNewWordLocal();
        this.cfw.h(newWordLocal);
        for (Jump jump2 = (Jump) node.getNext(); jump2 != null; jump2 = (Jump) jump2.getNext()) {
            if (jump2.getType() != 128) {
                throw Codegen.badTree();
            }
            generateExpression(jump2.getFirstChild(), jump2);
            this.cfw.g(newWordLocal);
            addDynamicInvoke("MATH:SHALLOWEQ", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
            addGoto(jump2.target, Token.SETELEM_OP);
        }
        releaseWordLocal(newWordLocal);
    }

    private void visitTemplateLiteral(Node node) {
        int existingIntProp = node.getExistingIntProp(27);
        this.cfw.g(this.contextLocal);
        this.cfw.g(this.variableObjectLocal);
        ClassFileWriter classFileWriter = this.cfw;
        Codegen codegen = this.codegen;
        classFileWriter.f(codegen.mainClassName, Token.ARROW, codegen.getTemplateLiteralName(this.scriptOrFn), "[Ljava/lang/Object;");
        this.cfw.r(existingIntProp);
        this.cfw.m("org/mozilla/javascript/ScriptRuntime", Token.DOTDOTDOT, "getTemplateLiteralCallSite", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;I)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitTryCatchFinally(Jump jump, Node node) {
        int i;
        BodyCodegen bodyCodegen = this;
        short newWordLocal = bodyCodegen.getNewWordLocal();
        bodyCodegen.cfw.g(bodyCodegen.variableObjectLocal);
        bodyCodegen.cfw.h(newWordLocal);
        int iB = bodyCodegen.cfw.b();
        bodyCodegen.cfw.E(iB, 0);
        Node node2 = jump.target;
        Node node3 = jump.getFinally();
        int[] iArr = new int[5];
        bodyCodegen.exceptionManager.pushExceptionInfo(jump);
        if (node2 != null) {
            iArr[0] = bodyCodegen.cfw.b();
            iArr[1] = bodyCodegen.cfw.b();
            iArr[2] = bodyCodegen.cfw.b();
            Context currentContext = Context.getCurrentContext();
            if (currentContext != null && currentContext.hasFeature(13)) {
                iArr[3] = bodyCodegen.cfw.b();
            }
        }
        if (node3 != null) {
            iArr[4] = bodyCodegen.cfw.b();
        }
        bodyCodegen.exceptionManager.setHandlers(iArr, iB);
        if (bodyCodegen.isGenerator && node3 != null) {
            FinallyReturnPoint finallyReturnPoint = new FinallyReturnPoint();
            if (bodyCodegen.finallys == null) {
                bodyCodegen.finallys = new HashMap();
            }
            bodyCodegen.finallys.put(node3, finallyReturnPoint);
            bodyCodegen.finallys.put(node3.getNext(), finallyReturnPoint);
        }
        for (Node next = node; next != null; next = next.getNext()) {
            if (next == node2) {
                int targetLabel = bodyCodegen.getTargetLabel(node2);
                bodyCodegen.exceptionManager.removeHandler(0, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(1, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(2, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(3, targetLabel);
            }
            bodyCodegen.generateStatement(next);
        }
        int iB2 = bodyCodegen.cfw.b();
        bodyCodegen.cfw.d(Token.LET, iB2);
        int localBlockRegister = getLocalBlockRegister(jump);
        if (node2 != null) {
            int iLabelId = node2.labelId();
            i = localBlockRegister;
            bodyCodegen.generateCatchBlock(0, newWordLocal, iLabelId, i, iArr[0]);
            generateCatchBlock(1, newWordLocal, iLabelId, i, iArr[1]);
            generateCatchBlock(2, newWordLocal, iLabelId, i, iArr[2]);
            Context currentContext2 = Context.getCurrentContext();
            if (currentContext2 == null || !currentContext2.hasFeature(13)) {
                bodyCodegen = this;
            } else {
                bodyCodegen = this;
                bodyCodegen.generateCatchBlock(3, newWordLocal, iLabelId, i, iArr[3]);
            }
        } else {
            i = localBlockRegister;
        }
        if (node3 != null) {
            int iB3 = bodyCodegen.cfw.b();
            int iB4 = bodyCodegen.cfw.b();
            ClassFileWriter classFileWriter = bodyCodegen.cfw;
            classFileWriter.m = 1;
            classFileWriter.D(iB3);
            if (!bodyCodegen.isGenerator) {
                bodyCodegen.cfw.D(iArr[4]);
            }
            bodyCodegen.cfw.h(i);
            bodyCodegen.cfw.g(newWordLocal);
            bodyCodegen.cfw.h(bodyCodegen.variableObjectLocal);
            int iLabelId2 = node3.labelId();
            if (bodyCodegen.isGenerator) {
                bodyCodegen.addGotoWithReturn(node3);
            } else {
                bodyCodegen.inlineFinally(node3, iArr[4], iB4);
            }
            bodyCodegen.cfw.g(i);
            if (bodyCodegen.isGenerator) {
                bodyCodegen.cfw.e(192, "java/lang/Throwable");
            }
            bodyCodegen.cfw.c(191);
            bodyCodegen.cfw.D(iB4);
            if (bodyCodegen.isGenerator) {
                bodyCodegen.cfw.j(iB, null, iLabelId2, iB3);
            }
        }
        bodyCodegen.releaseWordLocal(newWordLocal);
        bodyCodegen.cfw.D(iB2);
        if (bodyCodegen.isGenerator) {
            return;
        }
        bodyCodegen.exceptionManager.popExceptionInfo();
    }

    private void visitTypeofname(Node node) {
        int indexForNameNode;
        if (!this.hasVarsInRegs || (indexForNameNode = this.fnCurrent.fnode.getIndexForNameNode(node)) < 0) {
            this.cfw.g(this.variableObjectLocal);
            this.cfw.s(node.getString());
            addScriptRuntimeInvoke("typeofName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/String;");
            return;
        }
        if (this.fnCurrent.isNumberVar(indexForNameNode)) {
            this.cfw.s("number");
            return;
        }
        if (!varIsDirectCallParameter(indexForNameNode)) {
            this.cfw.g(this.varRegisters[indexForNameNode]);
            addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
            return;
        }
        int i = this.varRegisters[indexForNameNode];
        this.cfw.g(i);
        this.cfw.f("java/lang/Void", Token.ARROW, "TYPE", "Ljava/lang/Class;");
        int iB = this.cfw.b();
        this.cfw.d(Token.GET, iB);
        ClassFileWriter classFileWriter = this.cfw;
        int i2 = classFileWriter.m;
        classFileWriter.g(i);
        addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
        int iB2 = this.cfw.b();
        this.cfw.d(Token.LET, iB2);
        this.cfw.E(iB, i2);
        this.cfw.s("number");
        this.cfw.D(iB2);
    }

    public void generateBodyCode() {
        this.isGenerator = Codegen.isGenerator(this.scriptOrFn);
        initBodyGeneration();
        if (this.isGenerator) {
            String strQ = a.q("(", this.codegen.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;");
            this.cfw.N(this.codegen.getBodyMethodName(this.scriptOrFn) + "_gen", strQ, (short) 10);
        } else {
            this.cfw.N(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short) 10);
        }
        generatePrologue();
        OptFunctionNode optFunctionNode = this.fnCurrent;
        Node lastChild = this.scriptOrFn;
        if (optFunctionNode != null) {
            lastChild = lastChild.getLastChild();
        }
        generateStatement(lastChild);
        generateEpilogue();
        this.cfw.O((short) (this.localsMax + 1));
        if (this.isGenerator) {
            generateGenerator();
        }
        if (this.literals != null) {
            for (int i = 0; i < this.literals.size(); i++) {
                Node node = this.literals.get(i);
                int type = node.getType();
                if (type == 71) {
                    generateArrayLiteralFactory(node, i + 1);
                } else if (type != 72) {
                    Kit.codeBug(Token.typeToName(type));
                } else {
                    generateObjectLiteralFactory(node, i + 1);
                }
            }
        }
    }

    private short getNewWordLocal() {
        return getNewWordIntern(1);
    }

    private void addInstructionCount() {
        addInstructionCount(Math.max(this.cfw.j - this.savedCodeOffset, 1));
    }

    private void inlineFinally(Node node) {
        int iB = this.cfw.b();
        int iB2 = this.cfw.b();
        this.cfw.D(iB);
        inlineFinally(node, iB, iB2);
        this.cfw.D(iB2);
    }
}
