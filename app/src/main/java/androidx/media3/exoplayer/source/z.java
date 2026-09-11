package androidx.media3.exoplayer.source;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements androidx.media3.common.util.i {
    public final /* synthetic */ IOException A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ androidx.media3.exoplayer.drm.d e;
    public final /* synthetic */ n y;
    public final /* synthetic */ s z;

    public /* synthetic */ z(androidx.media3.exoplayer.drm.d dVar, n nVar, s sVar, IOException iOException, boolean z) {
        this.e = dVar;
        this.y = nVar;
        this.z = sVar;
        this.A = iOException;
        this.B = z;
    }

    @Override // androidx.media3.common.util.i
    public final void accept(Object obj) {
        c0 c0Var = (c0) obj;
        androidx.media3.exoplayer.drm.d dVar = this.e;
        c0Var.C(dVar.a, dVar.b, this.y, this.z, this.A, this.B);
    }
}
