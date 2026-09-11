package org.mozilla.javascript;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeContinuation extends IdScriptableObject implements Function {
    private static final Object FTAG = "Continuation";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    private static final long serialVersionUID = 1794167133757605367L;
    private Object implementation;

    public static boolean equalImplementations(NativeContinuation nativeContinuation, NativeContinuation nativeContinuation2) {
        return Objects.equals(nativeContinuation.implementation, nativeContinuation2.implementation);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        new NativeContinuation().exportAsJSClass(1, scriptable, z);
    }

    public static boolean isContinuationConstructor(IdFunctionObject idFunctionObject) {
        return idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1;
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return Interpreter.restartContinuation(this, context, scriptable, objArr);
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        throw Context.reportRuntimeError("Direct call is not supported");
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(FTAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int iMethodId = idFunctionObject.methodId();
        if (iMethodId == 1) {
            throw Context.reportRuntimeError("Direct call is not supported");
        }
        net.luminis.tls.engine.impl.c.o(String.valueOf(iMethodId));
        return null;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        return !str.equals("constructor") ? 0 : 1;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Continuation";
    }

    public Object getImplementation() {
        return this.implementation;
    }

    public void initImplementation(Object obj) {
        this.implementation = obj;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        if (i == 1) {
            initPrototypeMethod(FTAG, i, "constructor", 0);
        } else {
            net.luminis.tls.engine.impl.c.o(String.valueOf(i));
        }
    }
}
