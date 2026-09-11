package androidx.media3.exoplayer.source.chunk;

import androidx.media3.exoplayer.source.v0;
import androidx.media3.exoplayer.source.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements w0 {
    public boolean A;
    public final /* synthetic */ h B;
    public final h e;
    public final v0 y;
    public final int z;

    public g(h hVar, h hVar2, v0 v0Var, int i) {
        this.B = hVar;
        this.e = hVar2;
        this.y = v0Var;
        this.z = i;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final boolean a() {
        h hVar = this.B;
        return !hVar.z() && this.y.z(hVar.W);
    }

    public final void c() {
        if (this.A) {
            return;
        }
        h hVar = this.B;
        androidx.media3.exoplayer.drm.d dVar = hVar.D;
        int[] iArr = hVar.y;
        int i = this.z;
        dVar.b(iArr[i], hVar.z[i], 0, null, hVar.Q);
        this.A = true;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int g(long j) {
        h hVar = this.B;
        if (hVar.z()) {
            return 0;
        }
        boolean z = hVar.W;
        v0 v0Var = this.y;
        int iW = v0Var.w(j, z);
        a aVar = hVar.S;
        if (aVar != null) {
            iW = Math.min(iW, aVar.d(this.z + 1) - v0Var.u());
        }
        v0Var.J(iW);
        if (iW > 0) {
            c();
        }
        return iW;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int o(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i) {
        h hVar = this.B;
        if (hVar.z()) {
            return -3;
        }
        a aVar = hVar.S;
        v0 v0Var = this.y;
        if (aVar != null && aVar.d(this.z + 1) <= v0Var.u()) {
            return -3;
        }
        c();
        return v0Var.E(bVar, eVar, i, hVar.W);
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final void b() {
    }
}
