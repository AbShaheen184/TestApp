package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Synchronizer extends Delegator {
    private Object syncObject;

    public Synchronizer(Scriptable scriptable, Object obj) {
        super(scriptable);
        this.syncObject = obj;
    }

    @Override // org.mozilla.javascript.Delegator, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object objCall;
        Object objUnwrap = this.syncObject;
        if (objUnwrap == null) {
            objUnwrap = scriptable2;
        }
        if (objUnwrap instanceof Wrapper) {
            objUnwrap = ((Wrapper) objUnwrap).unwrap();
        }
        synchronized (objUnwrap) {
            objCall = ((Function) this.obj).call(context, scriptable, scriptable2, objArr);
        }
        return objCall;
    }

    public Synchronizer(Scriptable scriptable) {
        super(scriptable);
    }
}
