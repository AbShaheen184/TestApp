package androidx.compose.foundation.layout;

import androidx.compose.runtime.q1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final androidx.collection.o0 a = c(true);
    public static final androidx.collection.o0 b = c(false);
    public static final o c = o.b;

    public static final void a(androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(-211209833);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (rVar2.T(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, c, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new n(rVar, i);
        }
    }

    public static final void b(androidx.compose.ui.layout.b1 b1Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.p0 p0Var, androidx.compose.ui.unit.m mVar, int i, int i2, androidx.compose.ui.j jVar) {
        androidx.compose.ui.j jVar2;
        Object objK = p0Var.K();
        m mVar2 = objK instanceof m ? (m) objK : null;
        androidx.compose.ui.layout.b1.k(b1Var, c1Var, ((mVar2 == null || (jVar2 = mVar2.L) == null) ? jVar : jVar2).a((((long) c1Var.e) << 32) | (((long) c1Var.y) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), mVar));
    }

    public static final androidx.collection.o0 c(boolean z) {
        androidx.collection.o0 o0Var = new androidx.collection.o0(9);
        androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
        o0Var.m(jVar, new s(jVar, z));
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.y;
        o0Var.m(jVar2, new s(jVar2, z));
        androidx.compose.ui.j jVar3 = androidx.compose.ui.c.z;
        o0Var.m(jVar3, new s(jVar3, z));
        androidx.compose.ui.j jVar4 = androidx.compose.ui.c.A;
        o0Var.m(jVar4, new s(jVar4, z));
        androidx.compose.ui.j jVar5 = androidx.compose.ui.c.B;
        o0Var.m(jVar5, new s(jVar5, z));
        androidx.compose.ui.j jVar6 = androidx.compose.ui.c.C;
        o0Var.m(jVar6, new s(jVar6, z));
        androidx.compose.ui.j jVar7 = androidx.compose.ui.c.D;
        o0Var.m(jVar7, new s(jVar7, z));
        androidx.compose.ui.j jVar8 = androidx.compose.ui.c.E;
        o0Var.m(jVar8, new s(jVar8, z));
        androidx.compose.ui.j jVar9 = androidx.compose.ui.c.F;
        o0Var.m(jVar9, new s(jVar9, z));
        return o0Var;
    }

    public static final androidx.compose.ui.layout.q0 d(androidx.compose.ui.j jVar, boolean z) {
        androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) (z ? a : b).g(jVar);
        return q0Var == null ? new s(jVar, z) : q0Var;
    }
}
