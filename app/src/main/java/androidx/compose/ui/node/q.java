package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends o0 {
    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.b((d1) f0Var.d0.e, f0Var.l(), i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.c1 F(long j) {
        l0(j);
        d1 d1Var = this.L;
        androidx.compose.runtime.collection.b bVarZ = d1Var.L.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            r0 r0Var = ((f0) objArr[i2]).e0.q;
            r0Var.getClass();
            r0Var.G = d0.z;
        }
        f0 f0Var = d1Var.L;
        o0.I0(this, f0Var.U.a(this, f0Var.l(), j));
        return this;
    }

    @Override // androidx.compose.ui.node.o0
    public final void J0() {
        r0 r0Var = this.L.L.e0.q;
        r0Var.getClass();
        r0Var.v0();
    }

    @Override // androidx.compose.ui.layout.p0
    public final int Z(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.e((d1) f0Var.d0.e, f0Var.l(), i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.h((d1) f0Var.d0.e, f0Var.l(), i);
    }

    @Override // androidx.compose.ui.node.n0
    public final int n0(androidx.compose.ui.layout.a aVar) {
        r0 r0Var = this.L.L.e0.q;
        r0Var.getClass();
        j0 j0Var = r0Var.C;
        b0 b0Var = j0Var.d;
        g0 g0Var = r0Var.N;
        if (b0Var == b0.y) {
            g0Var.d = true;
            if (g0Var.b) {
                j0Var.f = true;
                j0Var.g = true;
            }
        } else {
            g0Var.e = true;
        }
        q qVar = r0Var.g().p0;
        if (qVar != null) {
            qVar.H = true;
        }
        r0Var.Q();
        q qVar2 = r0Var.g().p0;
        if (qVar2 != null) {
            qVar2.H = false;
        }
        Integer num = (Integer) g0Var.g.get(aVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.Q.g(iIntValue, aVar);
        return iIntValue;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.g((d1) f0Var.d0.e, f0Var.l(), i);
    }
}
