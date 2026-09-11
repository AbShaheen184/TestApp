package coil3.compose;

import androidx.compose.runtime.e1;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.compose.ui.graphics.painter.b {
    public final androidx.compose.ui.graphics.painter.b C;
    public final androidx.compose.ui.layout.j D;
    public final long E;
    public final boolean G;
    public kotlin.time.f I;
    public boolean J;
    public androidx.compose.ui.graphics.m L;
    public androidx.compose.ui.graphics.painter.b M;
    public final long N;
    public final kotlin.time.h F = kotlin.time.g.b;
    public final e1 H = new e1(0);
    public float K = 1.0f;

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    public p(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, androidx.compose.ui.layout.j jVar, long j, boolean z, boolean z2) {
        this.C = bVar2;
        this.D = jVar;
        this.E = j;
        this.G = z;
        this.M = bVar;
        long jH = bVar != null ? bVar.h() : 0L;
        long jH2 = bVar2 != null ? bVar2.h() : 0L;
        boolean z3 = jH != 9205357640488583168L;
        boolean z4 = jH2 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                jH = jH2;
            } else if (!z3) {
                if (z3) {
                    jH = 9205357640488583168L;
                } else {
                    jH = 9205357640488583168L;
                }
            }
        } else if (z3 || !z4) {
            jH = 9205357640488583168L;
        } else {
            jH = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH2 >> 32))))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 & 4294967295L))))));
        }
        this.N = jH;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean d(float f) {
        this.K = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean e(androidx.compose.ui.graphics.m mVar) {
        this.L = mVar;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return this.N;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(h0 h0Var) {
        boolean z = this.J;
        androidx.compose.ui.graphics.painter.b bVar = this.C;
        if (z) {
            j(h0Var, bVar, this.K);
            return;
        }
        kotlin.time.f fVarA = this.I;
        if (fVarA == null) {
            fVarA = this.F.a();
            this.I = fVarA;
        }
        float f = kotlin.time.a.f(kotlin.time.f.a(fVarA.e)) / kotlin.time.a.f(this.E);
        float fB = com.google.android.material.resources.c.b(f, 0.0f, 1.0f);
        float f2 = this.K;
        float f3 = fB * f2;
        if (this.G) {
            f2 -= f3;
        }
        this.J = f >= 1.0f;
        j(h0Var, this.M, f2);
        j(h0Var, bVar, f3);
        if (this.J) {
            this.M = null;
        } else {
            e1 e1Var = this.H;
            e1Var.h(e1Var.g() + 1);
        }
    }

    public final void j(h0 h0Var, androidx.compose.ui.graphics.painter.b bVar, float f) {
        androidx.compose.ui.graphics.drawscope.b bVar2 = h0Var.e;
        if (bVar == null || f <= 0.0f) {
            return;
        }
        long jD = bVar2.d();
        long jH = bVar.h();
        long jN = (jH == 9205357640488583168L || androidx.compose.ui.geometry.e.e(jH) || jD == 9205357640488583168L || androidx.compose.ui.geometry.e.e(jD)) ? jD : a0.n(jH, this.D.a(jH, jD));
        if (jD == 9205357640488583168L || androidx.compose.ui.geometry.e.e(jD)) {
            bVar.g(h0Var, jN, f, this.L);
            return;
        }
        long j = jN;
        float f2 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jD >> 32)) - Float.intBitsToFloat((int) (j >> 32))) / f2;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jD & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & j))) / f2;
        ((com.google.firebase.platforminfo.c) bVar2.y.y).k(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            bVar.g(h0Var, j, f, this.L);
        } finally {
            float f3 = -fIntBitsToFloat;
            float f4 = -fIntBitsToFloat2;
            ((com.google.firebase.platforminfo.c) bVar2.y.y).k(f3, f4, f3, f4);
        }
    }
}
