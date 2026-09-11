package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ z(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativePromise.lambda$makeThenFinally$4(this.y, context, scriptable, scriptable2, objArr);
            default:
                return NativePromise.lambda$makeCatchFinally$6(this.y, context, scriptable, scriptable2, objArr);
        }
    }
}
