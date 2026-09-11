package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j3 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final androidx.compose.animation.core.i1 f;

    static {
        float f2 = androidx.compose.material3.tokens.x.o;
        a = f2;
        b = androidx.compose.material3.tokens.x.w;
        c = androidx.compose.material3.tokens.x.u;
        float f3 = androidx.compose.material3.tokens.x.r;
        d = f3;
        e = (f3 - f2) / 2;
        f = new androidx.compose.animation.core.i1(0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, boolean z2, final g3 g3Var, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        boolean z3;
        g3 g3Var2;
        int i4;
        boolean z4;
        final boolean z5;
        final androidx.compose.ui.r rVar3;
        androidx.compose.runtime.q1 q1VarT;
        int i5;
        androidx.compose.ui.r rVarB;
        androidx.compose.ui.r rVar4;
        Object objQ;
        androidx.compose.foundation.interaction.k kVar;
        int i6;
        rVar2.c0(-263339167);
        if ((i & 6) == 0) {
            i3 = (rVar2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar2.h(lVar) ? 32 : 16;
        }
        int i7 = i3 | 3456;
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i7 |= rVar2.g(z3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                g3Var2 = g3Var;
                if (rVar2.f(g3Var2)) {
                    i6 = 131072;
                } else {
                    i6 = Parser.ARGC_LIMIT;
                }
                i7 |= i6;
            } else {
                g3Var2 = g3Var;
            }
            i4 = 1572864 | i7;
            if ((599187 & i4) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (rVar2.T(i4 & 1, z4)) {
                rVar2.Y();
                i5 = i & 1;
                rVarB = androidx.compose.ui.o.b;
                if (i5 != 0 || rVar2.C()) {
                    z3 = i8 == 0 ? z3 : true;
                    rVar4 = rVarB;
                } else {
                    rVar2.W();
                    rVar4 = rVar;
                }
                rVar2.q();
                rVar2.b0(1768604058);
                objQ = rVar2.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                kVar = (androidx.compose.foundation.interaction.k) objQ;
                rVar2.p(false);
                if (lVar != null) {
                    androidx.compose.ui.layout.n nVar = i1.a;
                    rVarB = androidx.compose.foundation.selection.c.b(r1.b, z, kVar, z3, new androidx.compose.ui.semantics.h(2), lVar);
                    kVar = kVar;
                }
                boolean z6 = z3;
                int i9 = i4 << 3;
                int i10 = i4 >> 6;
                b(androidx.compose.foundation.layout.w0.j(androidx.compose.foundation.layout.w0.r(rVar4.d(rVarB)), c, d), z, z6, g3Var2, kVar, a3.a(androidx.compose.material3.tokens.x.m, rVar2), rVar2, (i9 & 57344) | (i9 & Token.ASSIGN_MOD) | (i10 & 896) | (i10 & 7168));
                z5 = z6;
                rVar3 = rVar4;
            } else {
                rVar2.W();
                z5 = z3;
                rVar3 = rVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.i3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j3.a(z, lVar, rVar3, z5, g3Var, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 = i3 | 28032;
        z3 = z2;
        if ((196608 & i) == 0) {
            g3Var2 = g3Var;
            if (rVar2.f(g3Var2)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i7 |= i6;
        } else {
            g3Var2 = g3Var;
        }
        i4 = 1572864 | i7;
        if ((599187 & i4) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rVar2.T(i4 & 1, z4)) {
            rVar2.Y();
            i5 = i & 1;
            rVarB = androidx.compose.ui.o.b;
            if (i5 != 0) {
                z3 = i8 == 0 ? z3 : true;
                rVar4 = rVarB;
            } else {
                z3 = i8 == 0 ? z3 : true;
                rVar4 = rVarB;
            }
            rVar2.q();
            rVar2.b0(1768604058);
            objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            kVar = (androidx.compose.foundation.interaction.k) objQ;
            rVar2.p(false);
            if (lVar != null) {
                androidx.compose.ui.layout.n nVar2 = i1.a;
                rVarB = androidx.compose.foundation.selection.c.b(r1.b, z, kVar, z3, new androidx.compose.ui.semantics.h(2), lVar);
                kVar = kVar;
            }
            boolean z7 = z3;
            int i11 = i4 << 3;
            int i12 = i4 >> 6;
            b(androidx.compose.foundation.layout.w0.j(androidx.compose.foundation.layout.w0.r(rVar4.d(rVarB)), c, d), z, z7, g3Var2, kVar, a3.a(androidx.compose.material3.tokens.x.m, rVar2), rVar2, (i11 & 57344) | (i11 & Token.ASSIGN_MOD) | (i12 & 896) | (i12 & 7168));
            z5 = z7;
            rVar3 = rVar4;
        } else {
            rVar2.W();
            z5 = z3;
            rVar3 = rVar;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.i3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3.a(z, lVar, rVar3, z5, g3Var, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.r rVar, final boolean z, final boolean z2, final g3 g3Var, final androidx.compose.foundation.interaction.k kVar, final androidx.compose.ui.graphics.n0 n0Var, androidx.compose.runtime.r rVar2, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        rVar2.c0(-670917213);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.g(z2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.f(g3Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar2.f(kVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= rVar2.f(n0Var) ? 1048576 : 524288;
        }
        if (rVar2.T(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? g3Var.b : g3Var.f;
            } else {
                j = z ? g3Var.j : g3Var.n;
            }
            if (z2) {
                j2 = z ? g3Var.a : g3Var.e;
            } else {
                j2 = z ? g3Var.i : g3Var.m;
            }
            androidx.compose.ui.graphics.n0 n0VarA = a3.a(androidx.compose.material3.tokens.x.t, rVar2);
            float f2 = androidx.compose.material3.tokens.x.s;
            if (z2) {
                j3 = z ? g3Var.c : g3Var.g;
            } else {
                j3 = z ? g3Var.k : g3Var.o;
            }
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVar, f2, j3, n0VarA), j, n0VarA);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarF);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar2, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
            androidx.compose.ui.r rVarF2 = androidx.compose.foundation.s.f(androidx.compose.foundation.a1.a(androidx.compose.foundation.layout.b.e(androidx.compose.ui.o.b, androidx.compose.ui.c.A).d(new q3(kVar, z, t2.o(androidx.compose.material3.tokens.p.e, rVar2))), kVar, u2.a(false, androidx.compose.material3.tokens.x.q / 2, 4)), j2, n0Var);
            androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarF2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD2, eVar);
            androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, rVar2, iHashCode2, eVar3);
            }
            androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
            rVar2.b0(1236071411);
            rVar2.p(false);
            rVar2.p(true);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.h3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3.b(rVar, z, z2, g3Var, kVar, n0Var, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }
}
