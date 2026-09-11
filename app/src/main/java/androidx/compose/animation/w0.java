package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.w1;
import androidx.compose.animation.core.x1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends d1 {
    public e2 L;
    public x1 M;
    public x1 N;
    public x0 O;
    public y0 P;
    public kotlin.jvm.functions.a Q;
    public o0 R;
    public long S = j0.a;
    public androidx.compose.ui.e T;
    public final v0 U;

    public w0(e2 e2Var, x1 x1Var, x1 x1Var2, x0 x0Var, y0 y0Var, kotlin.jvm.functions.a aVar, o0 o0Var) {
        this.L = e2Var;
        this.M = x1Var;
        this.N = x1Var2;
        this.O = x0Var;
        this.P = y0Var;
        this.Q = aVar;
        this.R = o0Var;
        androidx.compose.ui.unit.b.b(0, 0, 15);
        this.U = new v0(this, 0);
        new v0(this, 1);
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        this.S = j0.a;
    }

    public final androidx.compose.ui.e L0() {
        androidx.compose.ui.e eVar;
        androidx.compose.ui.e eVar2;
        if (this.L.f().a(m0.e, m0.y)) {
            k0 k0Var = this.O.a.b;
            if (k0Var != null && (eVar2 = k0Var.a) != null) {
                return eVar2;
            }
            k0 k0Var2 = this.P.a.b;
            if (k0Var2 != null) {
                return k0Var2.a;
            }
            return null;
        }
        k0 k0Var3 = this.P.a.b;
        if (k0Var3 != null && (eVar = k0Var3.a) != null) {
            return eVar;
        }
        k0 k0Var4 = this.O.a.b;
        if (k0Var4 != null) {
            return k0Var4.a;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        long jA;
        w1 w1VarA = null;
        if (this.L.a.n() == this.L.d.getValue()) {
            this.T = null;
        } else if (this.T == null) {
            androidx.compose.ui.e eVarL0 = L0();
            if (eVarL0 == null) {
                eVarL0 = androidx.compose.ui.c.e;
            }
            this.T = eVarL0;
        }
        boolean zU = s0Var.U();
        kotlin.collections.v vVar = kotlin.collections.v.e;
        if (zU) {
            androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
            long j2 = (((long) c1VarF.e) << 32) | (((long) c1VarF.y) & 4294967295L);
            this.S = j2;
            return s0Var.q((int) (j2 >> 32), (int) (4294967295L & j2), vVar, new e0(c1VarF, 1));
        }
        if (!((Boolean) this.Q.invoke()).booleanValue()) {
            androidx.compose.ui.layout.c1 c1VarF2 = p0Var.F(j);
            return s0Var.q(c1VarF2.e, c1VarF2.y, vVar, new e0(c1VarF2, 2));
        }
        o0 o0Var = this.R;
        x1 x1Var = o0Var.a;
        x1 x1Var2 = o0Var.b;
        e2 e2Var = o0Var.c;
        x0 x0Var = o0Var.d;
        y0 y0Var = o0Var.e;
        x1 x1Var3 = o0Var.f;
        w1 w1VarA2 = x1Var != null ? x1Var.a(new p0(x0Var, y0Var, 0), new p0(x0Var, y0Var, 1)) : null;
        w1 w1VarA3 = x1Var2 != null ? x1Var2.a(new p0(x0Var, y0Var, 2), new p0(x0Var, y0Var, 3)) : null;
        if (e2Var.a.n() == m0.e) {
            h1 h1Var = y0Var.a;
        } else {
            h1 h1Var2 = y0Var.a;
        }
        h hVar = new h(1, w1VarA2, w1VarA3, x1Var3 != null ? x1Var3.a(c0.D, new h(2, null, x0Var, y0Var)) : null);
        androidx.compose.ui.layout.c1 c1VarF3 = p0Var.F(j);
        long j3 = (((long) c1VarF3.y) & 4294967295L) | (((long) c1VarF3.e) << 32);
        long j4 = !androidx.compose.ui.unit.l.a(this.S, j0.a) ? this.S : j3;
        x1 x1Var4 = this.M;
        if (x1Var4 != null) {
            w1VarA = x1Var4.a(this.U, new u0(this, j4, 0));
        }
        if (w1VarA != null) {
            j3 = ((androidx.compose.ui.unit.l) w1VarA.getValue()).a;
        }
        long jD = androidx.compose.ui.unit.b.d(j, j3);
        x1 x1Var5 = this.N;
        long j5 = x1Var5 != null ? ((androidx.compose.ui.unit.j) x1Var5.a(c0.E, new u0(this, j4, 1)).getValue()).a : 0L;
        androidx.compose.ui.e eVar = this.T;
        if (eVar != null) {
            jA = eVar.a(j4, jD, androidx.compose.ui.unit.m.e);
        } else {
            jA = 0;
        }
        return s0Var.q((int) (jD >> 32), (int) (jD & 4294967295L), vVar, new t0(c1VarF3, androidx.compose.ui.unit.j.c(jA, 0L), j5, hVar));
    }
}
