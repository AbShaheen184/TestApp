package org.mozilla.javascript;

import java.util.EnumSet;
import org.mozilla.javascript.debug.DebuggableScript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeFunction extends BaseFunction {
    private static final long serialVersionUID = 8713897114082216401L;

    @Override // org.mozilla.javascript.BaseFunction
    public final String decompile(int i, EnumSet<DecompilerFlag> enumSet) {
        String rawSource = getRawSource();
        return rawSource != null ? rawSource : super.decompile(i, enumSet);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return getParamCount();
    }

    public DebuggableScript getDebuggableView() {
        return null;
    }

    public abstract int getLanguageVersion();

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        NativeCall nativeCallFindFunctionActivation;
        return (getLanguageVersion() == 120 && (nativeCallFindFunctionActivation = ScriptRuntime.findFunctionActivation(Context.getContext(), this)) != null) ? nativeCallFindFunctionActivation.originalArgs.length : getParamCount();
    }

    public abstract int getParamAndVarCount();

    public abstract int getParamCount();

    public boolean getParamOrVarConst(int i) {
        return false;
    }

    public abstract String getParamOrVarName(int i);

    public String getRawSource() {
        return null;
    }

    public final void initScriptFunction(Context context, Scriptable scriptable) {
        initScriptFunction(context, scriptable, isGeneratorFunction());
    }

    @Deprecated
    public String jsGet_name() {
        return getFunctionName();
    }

    public Object resumeGenerator(Context context, Scriptable scriptable, int i, Object obj, Object obj2) {
        throw new EvaluatorException("resumeGenerator() not implemented");
    }

    public final void initScriptFunction(Context context, Scriptable scriptable, boolean z) {
        ScriptRuntime.setFunctionProtoAndParent(this, context, scriptable, z);
    }
}
