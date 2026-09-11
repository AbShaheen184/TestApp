package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return ((Interpreter.CallFrame) this.y).lambda$equals$0(this.z, context, scriptable, scriptable2, objArr);
            default:
                return ((NativePromise.PromiseAnyRejector) this.y).lambda$reject$0((NativePromise.PromiseElementResolver) this.z, context, scriptable, scriptable2, objArr);
        }
    }
}
