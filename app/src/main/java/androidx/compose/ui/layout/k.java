package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements p0 {
    public final Enum A;
    public final /* synthetic */ int e;
    public final p0 y;
    public final Enum z;

    public /* synthetic */ k(p0 p0Var, Enum r2, Enum r3, int i) {
        this.e = i;
        this.y = p0Var;
        this.z = r2;
        this.A = r3;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.y.B(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final c1 F(long j) {
        switch (this.e) {
            case 0:
                u uVar = (u) this.A;
                t tVar = (t) this.z;
                t tVar2 = t.y;
                p0 p0Var = this.y;
                if (uVar == u.e) {
                    return new m(tVar == tVar2 ? p0Var.B(androidx.compose.ui.unit.a.g(j)) : p0Var.v(androidx.compose.ui.unit.a.g(j)), androidx.compose.ui.unit.a.c(j) ? androidx.compose.ui.unit.a.g(j) : 32767, 0);
                }
                return new m(androidx.compose.ui.unit.a.d(j) ? androidx.compose.ui.unit.a.h(j) : 32767, tVar == tVar2 ? p0Var.b(androidx.compose.ui.unit.a.h(j)) : p0Var.Z(androidx.compose.ui.unit.a.h(j)), 0);
            case 1:
                u0 u0Var = (u0) this.A;
                t0 t0Var = (t0) this.z;
                t0 t0Var2 = t0.y;
                p0 p0Var2 = this.y;
                if (u0Var == u0.e) {
                    return new m(t0Var == t0Var2 ? p0Var2.B(androidx.compose.ui.unit.a.g(j)) : p0Var2.v(androidx.compose.ui.unit.a.g(j)), androidx.compose.ui.unit.a.c(j) ? androidx.compose.ui.unit.a.g(j) : 32767, 1);
                }
                return new m(androidx.compose.ui.unit.a.d(j) ? androidx.compose.ui.unit.a.h(j) : 32767, t0Var == t0Var2 ? p0Var2.b(androidx.compose.ui.unit.a.h(j)) : p0Var2.Z(androidx.compose.ui.unit.a.h(j)), 1);
            default:
                androidx.compose.ui.node.g1 g1Var = (androidx.compose.ui.node.g1) this.A;
                androidx.compose.ui.node.f1 f1Var = (androidx.compose.ui.node.f1) this.z;
                androidx.compose.ui.node.f1 f1Var2 = androidx.compose.ui.node.f1.y;
                p0 p0Var3 = this.y;
                if (g1Var == androidx.compose.ui.node.g1.e) {
                    return new m(f1Var == f1Var2 ? p0Var3.B(androidx.compose.ui.unit.a.g(j)) : p0Var3.v(androidx.compose.ui.unit.a.g(j)), androidx.compose.ui.unit.a.c(j) ? androidx.compose.ui.unit.a.g(j) : 32767, 2);
                }
                return new m(androidx.compose.ui.unit.a.d(j) ? androidx.compose.ui.unit.a.h(j) : 32767, f1Var == f1Var2 ? p0Var3.b(androidx.compose.ui.unit.a.h(j)) : p0Var3.Z(androidx.compose.ui.unit.a.h(j)), 2);
        }
    }

    @Override // androidx.compose.ui.layout.p0
    public final Object K() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.y.K();
    }

    @Override // androidx.compose.ui.layout.p0
    public final int Z(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.y.Z(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.y.b(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.y.v(i);
    }
}
