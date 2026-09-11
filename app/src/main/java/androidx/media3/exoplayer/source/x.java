package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements androidx.media3.common.util.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.media3.exoplayer.drm.d e;
    public final /* synthetic */ n y;
    public final /* synthetic */ s z;

    public /* synthetic */ x(androidx.media3.exoplayer.drm.d dVar, n nVar, s sVar, int i) {
        this.e = dVar;
        this.y = nVar;
        this.z = sVar;
        this.A = i;
    }

    @Override // androidx.media3.common.util.i
    public final void accept(Object obj) {
        c0 c0Var = (c0) obj;
        androidx.media3.exoplayer.drm.d dVar = this.e;
        c0Var.z(dVar.a, dVar.b, this.y, this.z, this.A);
    }
}
