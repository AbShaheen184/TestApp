package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static final float a;
    public static final androidx.compose.foundation.layout.m0 b;

    static {
        float f = 8;
        a = f;
        androidx.compose.foundation.layout.b.a(2, f);
        b = androidx.compose.foundation.layout.b.a(2, f);
        androidx.compose.foundation.layout.b.a(2, f);
    }

    public static final void a(final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.text.m0 m0Var, final long j, final long j2, final long j3, final float f, final androidx.compose.foundation.layout.m0 m0Var2, androidx.compose.runtime.r rVar, final int i) {
        rVar.c0(-2070754602);
        int i2 = i | (rVar.h(fVar) ? 4 : 2) | (rVar.f(m0Var) ? 32 : 16) | (rVar.e(j) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(null) ? 16384 : 8192) | (rVar.h(null) ? 131072 : Parser.ARGC_LIMIT) | (rVar.e(j2) ? 1048576 : 524288) | (rVar.e(j3) ? 8388608 : 4194304) | (rVar.c(f) ? 67108864 : 33554432) | (rVar.f(m0Var2) ? 536870912 : 268435456);
        if (rVar.T(i2 & 1, (306783379 & i2) != 306783378)) {
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{q0.a.a(new androidx.compose.ui.graphics.t(j)), p3.a.a(m0Var)}, androidx.compose.runtime.internal.k.c(-668234218, new i0(f, m0Var2, j2, fVar, j3), rVar), rVar, 56);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(m0Var, j, j2, j3, f, m0Var2, i) { // from class: androidx.compose.material3.g0
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ float C;
                public final /* synthetic */ androidx.compose.foundation.layout.m0 D;
                public final /* synthetic */ androidx.compose.ui.text.m0 y;
                public final /* synthetic */ long z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    k0.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.r rVar, boolean z2, androidx.compose.ui.graphics.n0 n0Var, final w2 w2Var, x2 x2Var, androidx.compose.foundation.a0 a0Var, final androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.r rVar2, final int i) {
        final boolean z3;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final x2 x2Var2;
        final androidx.compose.foundation.a0 a0VarA;
        int i2;
        boolean z4;
        rVar2.c0(-1385473344);
        int i3 = i | (rVar2.g(z) ? 4 : 2) | (rVar2.h(aVar) ? 32 : 16) | (rVar2.f(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 5988352 | (rVar2.f(w2Var) ? 67108864 : 33554432) | 268435456;
        if (rVar2.T(i3 & 1, (306783379 & i3) != 306783378)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                float f = z0.a;
                androidx.compose.ui.graphics.n0 n0VarA = a3.a(androidx.compose.material3.tokens.l.b, rVar2);
                float f2 = androidx.compose.material3.tokens.l.f;
                x2 x2Var3 = new x2(f2, androidx.compose.material3.tokens.l.o, androidx.compose.material3.tokens.l.l, androidx.compose.material3.tokens.l.m, androidx.compose.material3.tokens.l.e, f2);
                i2 = i3 & (-1908408321);
                long jD = o0.d(androidx.compose.material3.tokens.l.p, rVar2);
                long j = androidx.compose.ui.graphics.t.h;
                androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.j, o0.d(androidx.compose.material3.tokens.l.i, rVar2));
                float f3 = androidx.compose.material3.tokens.l.q;
                float f4 = androidx.compose.material3.tokens.l.n;
                if (z) {
                    jD = j;
                }
                if (z) {
                    f3 = f4;
                }
                n0Var2 = n0VarA;
                a0VarA = androidx.compose.foundation.s.a(f3, jD);
                x2Var2 = x2Var3;
                z4 = true;
            } else {
                rVar2.W();
                i2 = i3 & (-1908408321);
                z4 = z2;
                n0Var2 = n0Var;
                x2Var2 = x2Var;
                a0VarA = a0Var;
            }
            rVar2.q();
            c(z, rVar, aVar, z4, fVar, u3.a(androidx.compose.material3.tokens.l.r, rVar2), n0Var2, w2Var, x2Var2, a0VarA, z0.a, b, kVar, rVar2, (i2 & 14) | 12582912 | ((i2 >> 6) & Token.ASSIGN_MOD) | ((i2 << 3) & 896) | 102263808, ((i2 >> 24) & 14) | 224256);
            z3 = z4;
        } else {
            rVar2.W();
            z3 = z2;
            n0Var2 = n0Var;
            x2Var2 = x2Var;
            a0VarA = a0Var;
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(z, aVar, fVar, rVar, z3, n0Var2, w2Var, x2Var2, a0VarA, kVar, i) { // from class: androidx.compose.material3.e0
                public final /* synthetic */ androidx.compose.ui.r A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 C;
                public final /* synthetic */ w2 D;
                public final /* synthetic */ x2 E;
                public final /* synthetic */ androidx.compose.foundation.a0 F;
                public final /* synthetic */ androidx.compose.foundation.interaction.k G;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ kotlin.jvm.functions.a y;
                public final /* synthetic */ androidx.compose.runtime.internal.f z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(385);
                    k0.b(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static final void c(final boolean z, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.a aVar, final boolean z2, final androidx.compose.runtime.internal.f fVar, final androidx.compose.ui.text.m0 m0Var, final androidx.compose.ui.graphics.n0 n0Var, final w2 w2Var, final x2 x2Var, final androidx.compose.foundation.a0 a0Var, final float f, final androidx.compose.foundation.layout.m0 m0Var2, final androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.r rVar3;
        androidx.compose.foundation.interaction.k kVar2;
        long j;
        float f2;
        boolean z3;
        androidx.compose.animation.core.n nVar;
        ?? r12;
        rVar2.c0(1786844928);
        if ((i & 6) == 0) {
            i3 = (rVar2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar2.f(rVar) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = LibretroCore.SCREEN_WIDTH;
        if (i5 == 0) {
            i3 |= rVar2.h(aVar) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i7 == 0) {
            i3 |= rVar2.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar2.h(fVar) ? 16384 : 8192;
        }
        int i9 = i & 196608;
        int i10 = Parser.ARGC_LIMIT;
        if (i9 == 0) {
            i3 |= rVar2.f(m0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= rVar2.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rVar2.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= rVar2.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rVar2.f(n0Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rVar2.f(w2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rVar2.f(x2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!rVar2.f(a0Var)) {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.c(f)) {
                i8 = 2048;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rVar2.f(m0Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            if (rVar2.f(kVar)) {
                i10 = 131072;
            }
            i4 |= i10;
        }
        int i11 = i3;
        if (rVar2.T(i11 & 1, ((i3 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            Object obj = androidx.compose.runtime.m.a;
            if (kVar == null) {
                rVar2.b0(73215547);
                Object objQ = rVar2.Q();
                if (objQ == obj) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                kVar2 = (androidx.compose.foundation.interaction.k) objQ;
                rVar2.p(false);
            } else {
                rVar2.b0(-828922852);
                rVar2.p(false);
                kVar2 = kVar;
            }
            Object objQ2 = rVar2.Q();
            if (objQ2 == obj) {
                objQ2 = new androidx.compose.foundation.lazy.i(21);
                rVar2.l0(objQ2);
            }
            androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(rVar, false, (kotlin.jvm.functions.l) objQ2);
            if (z2) {
                j = !z ? w2Var.a : w2Var.i;
            } else {
                j = z ? w2Var.j : w2Var.e;
            }
            if (x2Var == null) {
                rVar2.b0(73531126);
                rVar2.p(false);
                kVar2 = kVar2;
                j = j;
                r12 = 0;
                nVar = null;
            } else {
                rVar2.b0(-828912021);
                int i12 = ((i4 << 3) & 896) | ((i11 >> 9) & 14);
                Object objQ3 = rVar2.Q();
                if (objQ3 == obj) {
                    objQ3 = new androidx.compose.runtime.snapshots.q();
                    rVar2.l0(objQ3);
                }
                androidx.compose.runtime.snapshots.q qVar = (androidx.compose.runtime.snapshots.q) objQ3;
                Object objQ4 = rVar2.Q();
                if (objQ4 == obj) {
                    objQ4 = androidx.compose.runtime.s.r(null);
                    rVar2.l0(objQ4);
                }
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ4;
                boolean zF = rVar2.f(kVar2);
                Object objQ5 = rVar2.Q();
                if (zF || objQ5 == obj) {
                    objQ5 = new t(kVar2, qVar, null, 1);
                    rVar2.l0(objQ5);
                }
                androidx.compose.runtime.j0.c(rVar2, kVar2, (kotlin.jvm.functions.p) objQ5);
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar);
                if (!z2) {
                    f2 = x2Var.f;
                } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                    f2 = x2Var.b;
                } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                    f2 = x2Var.d;
                } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                    f2 = x2Var.c;
                } else {
                    f2 = jVar instanceof androidx.compose.foundation.interaction.b ? x2Var.e : x2Var.a;
                }
                Object objQ6 = rVar2.Q();
                if (objQ6 == obj) {
                    objQ6 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f2), androidx.compose.animation.core.e.l, null, 12);
                    rVar2.l0(objQ6);
                }
                androidx.compose.animation.core.d dVar = (androidx.compose.animation.core.d) objQ6;
                androidx.compose.ui.unit.f fVar2 = new androidx.compose.ui.unit.f(f2);
                boolean zH = rVar2.h(dVar) | rVar2.c(f2) | ((((i12 & 14) ^ 6) > 4 && rVar2.g(z2)) || (i12 & 6) == 4) | rVar2.h(jVar);
                Object objQ7 = rVar2.Q();
                if (zH || objQ7 == obj) {
                    z3 = false;
                    u uVar = new u(dVar, f2, z2, jVar, y0Var, (kotlin.coroutines.d) null);
                    rVar2.l0(uVar);
                    objQ7 = uVar;
                } else {
                    z3 = false;
                }
                androidx.compose.runtime.j0.c(rVar2, fVar2, (kotlin.jvm.functions.p) objQ7);
                nVar = dVar.c;
                rVar2.p(z3);
                r12 = z3;
            }
            float f3 = nVar != null ? ((androidx.compose.ui.unit.f) nVar.y.getValue()).e : (float) r12;
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-990050154, new j0(w2Var, z2, z, fVar, m0Var, f, m0Var2), rVar2);
            androidx.compose.runtime.b0 b0Var = f3.a;
            long jB = o0.b(j, rVar2);
            float f4 = (float) r12;
            if (kVar2 == null) {
                rVar2.b0(1528143336);
                Object objQ8 = rVar2.Q();
                if (objQ8 == obj) {
                    objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                rVar2.p(r12);
                kVar2 = (androidx.compose.foundation.interaction.k) objQ8;
            } else {
                rVar2.b0(-227800369);
                rVar2.p(r12);
            }
            androidx.compose.runtime.b0 b0Var2 = f3.a;
            float f5 = ((androidx.compose.ui.unit.f) rVar2.j(b0Var2)).e + f4;
            androidx.compose.runtime.r rVar4 = rVar2;
            androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{q0.a.a(new androidx.compose.ui.graphics.t(jB)), b0Var2.a(new androidx.compose.ui.unit.f(f5))}, androidx.compose.runtime.internal.k.c(1508735219, new e3(rVarA, n0Var, j, f5, a0Var, z, kVar2, z2, aVar, f3, fVarC), rVar4), rVar4, 56);
            rVar3 = rVar4;
        } else {
            androidx.compose.runtime.r rVar5 = rVar2;
            rVar5.W();
            rVar3 = rVar5;
        }
        androidx.compose.runtime.q1 q1VarT = rVar3.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.f0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    int iA2 = androidx.compose.runtime.s.A(i2);
                    k0.c(z, rVar, aVar, z2, fVar, m0Var, n0Var, w2Var, x2Var, a0Var, f, m0Var2, kVar, (androidx.compose.runtime.r) obj2, iA, iA2);
                    return kotlin.y.a;
                }
            };
        }
    }
}
