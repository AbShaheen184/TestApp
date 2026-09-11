package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ Scriptable A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ NativePromise.Reaction y;
    public final /* synthetic */ Context z;

    public /* synthetic */ x(NativePromise.Reaction reaction, Context context, Scriptable scriptable, Object obj, int i) {
        this.e = i;
        this.y = reaction;
        this.z = context;
        this.A = scriptable;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.invoke(this.z, this.A, this.B);
                break;
            default:
                this.y.invoke(this.z, this.A, this.B);
                break;
        }
    }
}
