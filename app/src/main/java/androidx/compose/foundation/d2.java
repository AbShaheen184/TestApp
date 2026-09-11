package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends androidx.compose.ui.node.j implements androidx.compose.ui.node.h, androidx.compose.ui.node.h1 {
    public androidx.compose.foundation.gestures.g2 N;
    public androidx.compose.foundation.gestures.k1 O;
    public boolean P;
    public androidx.compose.foundation.gestures.l Q;
    public androidx.compose.foundation.interaction.k R;
    public boolean S;
    public n T;
    public androidx.compose.foundation.gestures.f2 U;
    public androidx.compose.ui.node.i V;
    public o W;
    public n X;
    public boolean Y;

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        this.Y = P0();
        O0();
        if (this.U == null) {
            androidx.compose.foundation.gestures.g2 g2Var = this.N;
            androidx.compose.foundation.gestures.f2 f2Var = new androidx.compose.foundation.gestures.f2(this.S ? this.X : this.T, this.Q, this.O, g2Var, this.R, this.P, this.Y);
            L0(f2Var);
            this.U = f2Var;
        }
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        androidx.compose.ui.node.i iVar = this.V;
        if (iVar != null) {
            M0(iVar);
        }
    }

    @Override // androidx.compose.ui.node.i
    public final void N() {
        boolean zP0 = P0();
        if (this.Y != zP0) {
            this.Y = zP0;
            androidx.compose.foundation.gestures.g2 g2Var = this.N;
            androidx.compose.foundation.gestures.k1 k1Var = this.O;
            boolean z = this.S;
            Q0(z ? this.X : this.T, this.Q, k1Var, g2Var, this.R, z, this.P);
        }
    }

    public final void O0() {
        androidx.compose.ui.node.i iVar = this.V;
        if (iVar != null) {
            if (((androidx.compose.ui.q) iVar).e.K) {
                return;
            }
            L0(iVar);
            return;
        }
        if (this.S) {
            androidx.compose.ui.node.k.p(this, new androidx.activity.w(this, 4));
        }
        n nVar = this.S ? this.X : this.T;
        if (nVar != null) {
            androidx.compose.ui.node.j jVar = nVar.i;
            if (jVar.e.K) {
                return;
            }
            L0(jVar);
            this.V = jVar;
        }
    }

    public final boolean P0() {
        return (this.K ? androidx.compose.ui.node.k.t(this).X : androidx.compose.ui.unit.m.e) != androidx.compose.ui.unit.m.y || this.O == androidx.compose.foundation.gestures.k1.e;
    }

    public final void Q0(n nVar, androidx.compose.foundation.gestures.l lVar, androidx.compose.foundation.gestures.k1 k1Var, androidx.compose.foundation.gestures.g2 g2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        boolean z3;
        this.N = g2Var;
        this.O = k1Var;
        boolean z4 = true;
        if (this.S != z) {
            this.S = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (kotlin.jvm.internal.l.a(this.T, nVar)) {
            z4 = false;
        } else {
            this.T = nVar;
        }
        if (z3 || (z4 && !z)) {
            androidx.compose.ui.node.i iVar = this.V;
            if (iVar != null) {
                M0(iVar);
            }
            this.V = null;
            O0();
        }
        this.P = z2;
        this.Q = lVar;
        this.R = kVar;
        boolean zP0 = P0();
        this.Y = zP0;
        androidx.compose.foundation.gestures.f2 f2Var = this.U;
        if (f2Var != null) {
            f2Var.c1(this.S ? this.X : this.T, lVar, k1Var, g2Var, kVar, z2, zP0);
        }
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        o oVar = (o) androidx.compose.ui.node.k.h(this, q1.a);
        if (kotlin.jvm.internal.l.a(oVar, this.W)) {
            return;
        }
        this.W = oVar;
        this.X = null;
        androidx.compose.ui.node.i iVar = this.V;
        if (iVar != null) {
            M0(iVar);
        }
        this.V = null;
        O0();
        androidx.compose.foundation.gestures.f2 f2Var = this.U;
        if (f2Var != null) {
            androidx.compose.foundation.gestures.g2 g2Var = this.N;
            androidx.compose.foundation.gestures.k1 k1Var = this.O;
            f2Var.c1(this.S ? this.X : this.T, this.Q, k1Var, g2Var, this.R, this.P, this.Y);
        }
    }
}
