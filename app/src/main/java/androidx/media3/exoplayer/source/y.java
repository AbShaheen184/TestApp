package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements androidx.media3.common.util.i {
    public final /* synthetic */ s A;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.media3.exoplayer.drm.d y;
    public final /* synthetic */ n z;

    public /* synthetic */ y(androidx.media3.exoplayer.drm.d dVar, n nVar, s sVar, int i) {
        this.e = i;
        this.y = dVar;
        this.z = nVar;
        this.A = sVar;
    }

    @Override // androidx.media3.common.util.i
    public final void accept(Object obj) {
        c0 c0Var = (c0) obj;
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.drm.d dVar = this.y;
                c0Var.j(dVar.a, dVar.b, this.z, this.A);
                break;
            default:
                androidx.media3.exoplayer.drm.d dVar2 = this.y;
                c0Var.F(dVar2.a, dVar2.b, this.z, this.A);
                break;
        }
    }
}
