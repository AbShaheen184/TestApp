package coil3.compose.internal;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.n0;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.node.v;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.x;
import coil3.compose.i;
import coil3.compose.o;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q implements m, v, u1 {
    public androidx.compose.ui.e L;
    public j M;
    public float N = 1.0f;
    public boolean O = true;
    public String P;
    public o Q;
    public final i R;

    public c(i iVar, androidx.compose.ui.e eVar, j jVar, String str, o oVar) {
        this.L = eVar;
        this.M = jVar;
        this.P = str;
        this.Q = oVar;
        this.R = iVar;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.node.v
    public final int B(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(0, i, 7);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.f(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.v(i);
        }
        long jM0 = M0(jB);
        return Math.max(androidx.compose.ui.unit.a.j(jM0), p0Var.v(i));
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        CoroutineScope coroutineScopeZ0 = z0();
        i iVar = this.R;
        iVar.I = coroutineScopeZ0;
        iVar.c();
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.R.b();
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.R.n(null);
    }

    public final long L0(long j) {
        if (androidx.compose.ui.geometry.e.e(j)) {
            return 0L;
        }
        long jH = this.R.h();
        if (jH == 9205357640488583168L) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jA = this.M.a(jFloatToRawIntBits, j);
        return (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) > Float.MAX_VALUE) ? j : a0.n(jFloatToRawIntBits, jA);
    }

    public final long M0(long j) {
        float fJ;
        int i;
        float fB;
        boolean zF = androidx.compose.ui.unit.a.f(j);
        boolean zE = androidx.compose.ui.unit.a.e(j);
        if (zF && zE) {
            return j;
        }
        boolean z = androidx.compose.ui.unit.a.d(j) && androidx.compose.ui.unit.a.c(j);
        i iVar = this.R;
        long jH = iVar.h();
        if (jH == 9205357640488583168L) {
            return (!z || ((coil3.compose.h) iVar.S.getValue()).a() == null) ? j : androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.a.h(j), 0, androidx.compose.ui.unit.a.g(j), 0, 10);
        }
        if (!z || (!zF && !zE)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i2 = h.b;
                fJ = com.google.android.material.resources.c.b(fIntBitsToFloat, androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j));
            } else {
                fJ = androidx.compose.ui.unit.a.j(j);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i3 = h.b;
                fB = com.google.android.material.resources.c.b(fIntBitsToFloat2, androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.g(j));
            } else {
                i = androidx.compose.ui.unit.a.i(j);
            }
            long jL0 = L0((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
            return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.b.g(kotlin.math.a.F(Float.intBitsToFloat((int) (jL0 >> 32))), j), 0, androidx.compose.ui.unit.b.f(kotlin.math.a.F(Float.intBitsToFloat((int) (jL0 & 4294967295L))), j), 0, 10);
        }
        fJ = androidx.compose.ui.unit.a.h(j);
        i = androidx.compose.ui.unit.a.g(j);
        fB = i;
        long jL1 = L0((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
        return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.b.g(kotlin.math.a.F(Float.intBitsToFloat((int) (jL1 >> 32))), j), 0, androidx.compose.ui.unit.b.f(kotlin.math.a.F(Float.intBitsToFloat((int) (jL1 & 4294967295L))), j), 0, 10);
    }

    @Override // androidx.compose.ui.node.m
    public final void W(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jL0 = L0(bVar.d());
        long jA = this.L.a(h.b(jL0), h.b(bVar.d()), h0Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        c2 c2Var = bVar.y;
        long jH = c2Var.H();
        c2Var.w().f();
        try {
            com.google.firebase.platforminfo.c cVar = (com.google.firebase.platforminfo.c) c2Var.y;
            c2 c2Var2 = (c2) cVar.e;
            if (this.O) {
                c2Var2.w().o(0.0f, 0.0f, Float.intBitsToFloat((int) (c2Var2.H() >> 32)), Float.intBitsToFloat((int) (4294967295L & c2Var2.H())), 1);
            }
            cVar.r(i, i2);
            this.R.g(h0Var, jL0, this.N, null);
            c2Var.w().q();
            c2Var.c0(jH);
            h0Var.b();
        } catch (Throwable th) {
            androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(i, 0, 13);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.f(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.Z(i);
        }
        long jM0 = M0(jB);
        return Math.max(androidx.compose.ui.unit.a.i(jM0), p0Var.Z(i));
    }

    @Override // androidx.compose.ui.node.v
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        o oVar = this.Q;
        if (oVar != null) {
            oVar.f(j);
        }
        c1 c1VarF = p0Var.F(M0(j));
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new androidx.compose.foundation.layout.j(c1VarF, 10));
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(x xVar) {
        String str = this.P;
        if (str != null) {
            kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
            xVar.b(t.a, com.google.common.base.c.p(str));
            androidx.compose.ui.semantics.v.c(xVar, 5);
        }
    }

    @Override // androidx.compose.ui.node.v
    public final int v(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(0, i, 7);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.f(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.B(i);
        }
        long jM0 = M0(jB);
        return Math.max(androidx.compose.ui.unit.a.j(jM0), p0Var.B(i));
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(i, 0, 13);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.f(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.b(i);
        }
        long jM0 = M0(jB);
        return Math.max(androidx.compose.ui.unit.a.i(jM0), p0Var.b(i));
    }
}
