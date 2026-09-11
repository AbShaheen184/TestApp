package androidx.media3.exoplayer.source;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements w0 {
    public int e;
    public boolean y;
    public final /* synthetic */ d1 z;

    public b1(d1 d1Var) {
        this.z = d1Var;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final boolean a() {
        return this.z.I;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final void b() throws IOException {
        d1 d1Var = this.z;
        if (d1Var.H) {
            return;
        }
        d1Var.F.b();
    }

    public final void c() {
        if (this.y) {
            return;
        }
        d1 d1Var = this.z;
        d1Var.B.b(androidx.media3.common.i0.i(d1Var.G.o), d1Var.G, 0, null, 0L);
        this.y = true;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int g(long j) {
        c();
        if (j <= 0 || this.e == 2) {
            return 0;
        }
        this.e = 2;
        return 1;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int o(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i) {
        c();
        d1 d1Var = this.z;
        boolean z = d1Var.I;
        if (z && d1Var.J == null) {
            this.e = 2;
        }
        int i2 = this.e;
        if (i2 == 2) {
            eVar.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            bVar.z = d1Var.G;
            this.e = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        d1Var.J.getClass();
        eVar.a(1);
        eVar.D = 0L;
        if ((i & 4) == 0) {
            eVar.q(d1Var.K);
            eVar.B.put(d1Var.J, 0, d1Var.K);
        }
        if ((i & 1) == 0) {
            this.e = 2;
        }
        return -4;
    }
}
