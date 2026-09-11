package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r2 {
    public static final float a;
    public static final float b = 12;
    public static final float c;

    static {
        float f = 2;
        a = f;
        c = f;
    }

    public static final void a(final boolean z, final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z2, final p2 p2Var, androidx.compose.runtime.r rVar2, final int i) {
        final androidx.compose.ui.r rVar3;
        final boolean z3;
        boolean z4;
        androidx.compose.ui.r rVar4;
        long j;
        Object objV;
        androidx.compose.ui.r rVarA;
        rVar2.c0(408580840);
        int i2 = i | (rVar2.g(z) ? 4 : 2) | (rVar2.h(aVar) ? 32 : 16) | 3456 | (rVar2.f(p2Var) ? 16384 : 8192) | 196608;
        if (rVar2.T(i2 & 1, (74899 & i2) != 74898)) {
            rVar2.Y();
            int i3 = i & 1;
            androidx.compose.ui.r rVar5 = androidx.compose.ui.o.b;
            if (i3 == 0 || rVar2.C()) {
                z4 = true;
                rVar4 = rVar5;
            } else {
                rVar2.W();
                rVar4 = rVar;
                z4 = z2;
            }
            rVar2.q();
            androidx.compose.runtime.t2 t2VarA = androidx.compose.animation.core.h.a(z ? b / 2 : 0, t2.o(androidx.compose.material3.tokens.p.e, rVar2), rVar2);
            if (z4 && z) {
                j = p2Var.a;
            } else if (!z4 || z) {
                j = (z4 || !z) ? p2Var.d : p2Var.c;
            } else {
                j = p2Var.b;
            }
            if (z4) {
                rVar2.b0(1194696477);
                objV = androidx.compose.animation.e1.a(j, t2.o(androidx.compose.material3.tokens.p.y, rVar2), rVar2);
                rVar2.p(false);
            } else {
                rVar2.b0(1194874138);
                objV = androidx.compose.runtime.s.v(new androidx.compose.ui.graphics.t(j), rVar2);
                rVar2.p(false);
            }
            Object obj = objV;
            if (aVar != null) {
                z3 = z4;
                rVarA = androidx.compose.foundation.selection.c.a(rVar5, z, null, u2.a(false, androidx.compose.material3.tokens.t.e / 2, 4), z3, new androidx.compose.ui.semantics.h(3), aVar);
            } else {
                z3 = z4;
                rVarA = rVar5;
            }
            if (aVar != null) {
                androidx.compose.ui.layout.n nVar = i1.a;
                rVar5 = r1.b;
            }
            androidx.compose.ui.r rVarI = androidx.compose.foundation.layout.w0.i(androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.r(rVar4.d(rVar5).d(rVarA)), a), androidx.compose.material3.tokens.t.c);
            boolean zF = rVar2.f(obj) | rVar2.f(t2VarA);
            Object objQ = rVar2.Q();
            if (zF || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.activity.compose.h(24, obj, t2VarA);
                rVar2.l0(objQ);
            }
            androidx.compose.foundation.s.b(rVarI, (kotlin.jvm.functions.l) objQ, rVar2, 0);
            rVar3 = rVar4;
        } else {
            rVar2.W();
            rVar3 = rVar;
            z3 = z2;
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(z, aVar, rVar3, z3, p2Var, i) { // from class: androidx.compose.material3.q2
                public final /* synthetic */ boolean A;
                public final /* synthetic */ p2 B;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ kotlin.jvm.functions.a y;
                public final /* synthetic */ androidx.compose.ui.r z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    r2.a(this.e, this.y, this.z, this.A, this.B, (androidx.compose.runtime.r) obj2, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
