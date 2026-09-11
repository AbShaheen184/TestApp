package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Callable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Scriptable y;
    public final /* synthetic */ Callable z;

    public /* synthetic */ a0(Scriptable scriptable, Callable callable, Object obj, int i) {
        this.e = i;
        this.y = scriptable;
        this.z = callable;
        this.A = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativePromise.lambda$makeThenFinally$5(this.y, this.z, this.A, context, scriptable, scriptable2, objArr);
            default:
                return NativePromise.lambda$makeCatchFinally$7(this.y, this.z, this.A, context, scriptable, scriptable2, objArr);
        }
    }
}
