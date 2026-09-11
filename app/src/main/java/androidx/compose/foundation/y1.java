package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends androidx.compose.ui.q implements androidx.compose.ui.node.v, androidx.compose.ui.node.u1 {
    public b2 L;
    public boolean M;

    @Override // androidx.compose.ui.node.v
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.v(i);
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (!this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.Z(i);
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        s.h(j, this.M ? androidx.compose.foundation.gestures.k1.e : androidx.compose.foundation.gestures.k1.y);
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.a.a(j, 0, this.M ? androidx.compose.ui.unit.a.h(j) : Integer.MAX_VALUE, 0, this.M ? Integer.MAX_VALUE : androidx.compose.ui.unit.a.g(j), 5));
        int i = c1VarF.e;
        int iH = androidx.compose.ui.unit.a.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = c1VarF.y;
        int iG = androidx.compose.ui.unit.a.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = c1VarF.y - i2;
        int i4 = c1VarF.e - i;
        if (!this.M) {
            i3 = i4;
        }
        b2 b2Var = this.L;
        androidx.compose.runtime.e1 e1Var = b2Var.e;
        androidx.compose.runtime.e1 e1Var2 = b2Var.a;
        e1Var.h(i3);
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            if (e1Var2.g() > i3) {
                e1Var2.h(i3);
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            this.L.b.h(this.M ? i2 : i);
            this.L.c.h(this.M ? c1VarF.y : c1VarF.e);
            return s0Var.q(i, i2, kotlin.collections.v.e, new w1(this, i3, c1VarF, 0));
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.m;
        kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
        kotlin.reflect.j jVar = jVarArr2[6];
        xVar.b(wVar, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        androidx.compose.ui.semantics.i iVar = new androidx.compose.ui.semantics.i(new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.x1
            public final /* synthetic */ y1 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int iG;
                switch (i) {
                    case 0:
                        iG = this.y.L.a.g();
                        break;
                    default:
                        iG = this.y.L.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.x1
            public final /* synthetic */ y1 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int iG;
                switch (i2) {
                    case 0:
                        iG = this.y.L.a.g();
                        break;
                    default:
                        iG = this.y.L.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.M) {
            androidx.compose.ui.semantics.w wVar2 = androidx.compose.ui.semantics.t.v;
            kotlin.reflect.j jVar2 = jVarArr2[13];
            xVar.b(wVar2, iVar);
        } else {
            androidx.compose.ui.semantics.w wVar3 = androidx.compose.ui.semantics.t.u;
            kotlin.reflect.j jVar3 = jVarArr2[12];
            xVar.b(wVar3, iVar);
        }
    }

    @Override // androidx.compose.ui.node.v
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        if (!this.M) {
            i = Integer.MAX_VALUE;
        }
        return p0Var.b(i);
    }
}
