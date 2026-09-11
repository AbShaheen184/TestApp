package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ o0 y;

    public /* synthetic */ h0(o0 o0Var, int i) {
        this.e = i;
        this.y = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.g0 = true;
                break;
            case 1:
                this.y.A();
                break;
            default:
                o0 o0Var = this.y;
                if (!o0Var.m0) {
                    t tVar = o0Var.N;
                    tVar.getClass();
                    tVar.o(o0Var);
                }
                break;
        }
    }
}
