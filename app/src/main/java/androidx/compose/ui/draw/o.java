package androidx.compose.ui.draw;

import androidx.compose.animation.e0;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.n0;
import androidx.compose.ui.node.v;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends q implements v, androidx.compose.ui.node.m {
    public androidx.compose.ui.graphics.painter.b L;
    public boolean M;
    public androidx.compose.ui.e N;
    public androidx.compose.ui.layout.h O;
    public float P;
    public androidx.compose.ui.graphics.m Q;

    public static boolean M0(long j) {
        return !androidx.compose.ui.geometry.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean N0(long j) {
        return !androidx.compose.ui.geometry.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.node.v
    public final int B(n0 n0Var, p0 p0Var, int i) {
        if (!L0()) {
            return p0Var.v(i);
        }
        long jO0 = O0(androidx.compose.ui.unit.b.b(0, i, 7));
        return Math.max(androidx.compose.ui.unit.a.j(jO0), p0Var.v(i));
    }

    public final boolean L0() {
        return this.M && this.L.h() != 9205357640488583168L;
    }

    public final long O0(long j) {
        boolean z = false;
        boolean z2 = androidx.compose.ui.unit.a.d(j) && androidx.compose.ui.unit.a.c(j);
        if (androidx.compose.ui.unit.a.f(j) && androidx.compose.ui.unit.a.e(j)) {
            z = true;
        }
        if ((!L0() && z2) || z) {
            return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.a.h(j), 0, androidx.compose.ui.unit.a.g(j), 0, 10);
        }
        long jH = this.L.h();
        int iRound = N0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : androidx.compose.ui.unit.a.j(j);
        int iRound2 = M0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : androidx.compose.ui.unit.a.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.b.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.b.g(iRound, j))) << 32);
        if (L0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!N0(this.L.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.L.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!M0(this.L.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.L.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : a0.n(jFloatToRawIntBits2, this.O.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, androidx.compose.ui.unit.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // androidx.compose.ui.node.m
    public final void W(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jH = this.L.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(N0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(M0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L);
        long jN = (Float.intBitsToFloat((int) (bVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) == 0.0f) ? 0L : a0.n(jFloatToRawIntBits, this.O.a(jFloatToRawIntBits, bVar.d()));
        long jA = this.N.a((((long) Math.round(Float.intBitsToFloat((int) (jN >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L), h0Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((com.google.firebase.platforminfo.c) bVar.y.y).r(f, f2);
        try {
            this.L.g(h0Var, jN, this.P, this.Q);
            ((com.google.firebase.platforminfo.c) bVar.y.y).r(-f, -f2);
            h0Var.b();
        } catch (Throwable th) {
            ((com.google.firebase.platforminfo.c) bVar.y.y).r(-f, -f2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(n0 n0Var, p0 p0Var, int i) {
        if (!L0()) {
            return p0Var.Z(i);
        }
        long jO0 = O0(androidx.compose.ui.unit.b.b(i, 0, 13));
        return Math.max(androidx.compose.ui.unit.a.i(jO0), p0Var.Z(i));
    }

    @Override // androidx.compose.ui.node.v
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        c1 c1VarF = p0Var.F(O0(j));
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new e0(c1VarF, 3));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.L + ", sizeToIntrinsics=" + this.M + ", alignment=" + this.N + ", alpha=" + this.P + ", colorFilter=" + this.Q + ')';
    }

    @Override // androidx.compose.ui.node.v
    public final int v(n0 n0Var, p0 p0Var, int i) {
        if (!L0()) {
            return p0Var.B(i);
        }
        long jO0 = O0(androidx.compose.ui.unit.b.b(0, i, 7));
        return Math.max(androidx.compose.ui.unit.a.j(jO0), p0Var.B(i));
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(n0 n0Var, p0 p0Var, int i) {
        if (!L0()) {
            return p0Var.b(i);
        }
        long jO0 = O0(androidx.compose.ui.unit.b.b(i, 0, 13));
        return Math.max(androidx.compose.ui.unit.a.i(jO0), p0Var.b(i));
    }
}
