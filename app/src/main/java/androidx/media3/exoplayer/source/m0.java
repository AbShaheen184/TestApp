package androidx.media3.exoplayer.source;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements w0 {
    public final int e;
    public final /* synthetic */ o0 y;

    public m0(o0 o0Var, int i) {
        this.y = o0Var;
        this.e = i;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final boolean a() {
        o0 o0Var = this.y;
        return !o0Var.F() && o0Var.Q[this.e].z(o0Var.l0);
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final void b() throws IOException {
        int i = this.e;
        o0 o0Var = this.y;
        o0Var.Q[i].B();
        androidx.media3.exoplayer.upstream.n nVar = o0Var.H;
        int iF = o0Var.A.f(o0Var.a0);
        IOException iOException = nVar.c;
        if (iOException != null) {
            throw iOException;
        }
        androidx.media3.exoplayer.upstream.j jVar = nVar.b;
        if (jVar != null) {
            if (iF == Integer.MIN_VALUE) {
                iF = jVar.e;
            }
            IOException iOException2 = jVar.B;
            if (iOException2 != null && jVar.C > iF) {
                throw iOException2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int g(long j) {
        o0 o0Var = this.y;
        if (o0Var.F()) {
            return 0;
        }
        int i = this.e;
        o0Var.B(i);
        v0 v0Var = o0Var.Q[i];
        int iW = v0Var.w(j, o0Var.l0);
        v0Var.J(iW);
        if (iW == 0) {
            o0Var.C(i);
        }
        return iW;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int o(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i) {
        o0 o0Var = this.y;
        if (o0Var.F()) {
            return -3;
        }
        int i2 = this.e;
        o0Var.B(i2);
        int iE = o0Var.Q[i2].E(bVar, eVar, i, o0Var.l0);
        if (iE == -3) {
            o0Var.C(i2);
        }
        return iE;
    }
}
