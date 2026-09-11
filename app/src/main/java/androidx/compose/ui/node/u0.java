package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ v0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i) {
        super(0);
        this.y = i;
        this.z = v0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.compose.ui.layout.b1 placementScope;
        switch (this.y) {
            case 0:
                v0 v0Var = this.z;
                j0 j0Var = v0Var.C;
                j0Var.i = 0;
                androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
                Object[] objArr = bVarZ.e;
                int i = bVarZ.z;
                for (int i2 = 0; i2 < i; i2++) {
                    v0 v0Var2 = ((f0) objArr[i2]).e0.p;
                    v0Var2.E = v0Var2.F;
                    v0Var2.F = Integer.MAX_VALUE;
                    v0Var2.P = false;
                    if (v0Var2.I == d0.y) {
                        v0Var2.I = d0.z;
                    }
                }
                f0 f0Var = j0Var.a;
                f0 f0Var2 = j0Var.a;
                androidx.compose.runtime.collection.b bVarZ2 = f0Var.z();
                Object[] objArr2 = bVarZ2.e;
                int i3 = bVarZ2.z;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((f0) objArr2[i4]).e0.p.T.getClass();
                }
                if (v0Var.g().H) {
                    androidx.collection.h0 h0Var = (androidx.collection.h0) f0Var2.n();
                    int i5 = ((androidx.compose.runtime.collection.b) h0Var.y).z;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((d1) ((f0) h0Var.get(i6)).d0.e).H = true;
                    }
                }
                v0Var.g().B0().d();
                if (v0Var.g().H) {
                    androidx.collection.h0 h0Var2 = (androidx.collection.h0) f0Var2.n();
                    int i7 = ((androidx.compose.runtime.collection.b) h0Var2.y).z;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((d1) ((f0) h0Var2.get(i8)).d0.e).H = false;
                    }
                }
                androidx.compose.runtime.collection.b bVarZ3 = f0Var2.z();
                Object[] objArr3 = bVarZ3.e;
                int i9 = bVarZ3.z;
                for (int i10 = 0; i10 < i9; i10++) {
                    f0 f0Var3 = (f0) objArr3[i10];
                    j0 j0Var2 = f0Var3.e0;
                    if (j0Var2.p.E != f0Var3.w()) {
                        f0Var2.O();
                        f0Var2.C();
                        if (f0Var3.w() == Integer.MAX_VALUE) {
                            if (j0Var2.c || k.o(f0Var3)) {
                                r0 r0Var = j0Var2.q;
                                r0Var.getClass();
                                r0Var.n0(false);
                            }
                            j0Var2.p.o0();
                        }
                    }
                }
                androidx.compose.runtime.collection.b bVarZ4 = f0Var2.z();
                Object[] objArr4 = bVarZ4.e;
                int i11 = bVarZ4.z;
                for (int i12 = 0; i12 < i11; i12++) {
                    g0 g0Var = ((f0) objArr4[i12]).e0.p.T;
                    g0Var.getClass();
                    g0Var.c = false;
                }
                break;
            case 1:
                v0 v0Var3 = this.z;
                v0Var3.C.a().F(v0Var3.X);
                break;
            default:
                v0 v0Var4 = this.z;
                j0 j0Var3 = v0Var4.C;
                d1 d1Var = j0Var3.a().N;
                if (d1Var == null || (placementScope = d1Var.I) == null) {
                    placementScope = ((androidx.compose.ui.platform.u) i0.a(j0Var3.a)).getPlacementScope();
                }
                kotlin.jvm.functions.l lVar = v0Var4.c0;
                if (lVar == null) {
                    d1 d1VarA = j0Var3.a();
                    long j = v0Var4.d0;
                    float f = v0Var4.e0;
                    placementScope.getClass();
                    androidx.compose.ui.layout.b1.b(placementScope, d1VarA);
                    d1VarA.h0(androidx.compose.ui.unit.j.c(j, d1VarA.B), f, null);
                } else {
                    d1 d1VarA2 = j0Var3.a();
                    long j2 = v0Var4.d0;
                    float f2 = v0Var4.e0;
                    placementScope.getClass();
                    androidx.compose.ui.layout.b1.b(placementScope, d1VarA2);
                    d1VarA2.h0(androidx.compose.ui.unit.j.c(j2, d1VarA2.B), f2, lVar);
                }
                break;
        }
        return kotlin.y.a;
    }
}
