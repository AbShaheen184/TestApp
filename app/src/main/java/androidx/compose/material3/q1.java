package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static final float a;
    public static final float b;
    public static final float c = 12;
    public static final float d = 8;
    public static final float e = Token.ASSIGN_MOD;
    public static final float f = 280;

    static {
        float f2 = 48;
        a = f2;
        b = f2;
    }

    public static final void a(final androidx.compose.ui.r rVar, final androidx.compose.animation.core.p0 p0Var, final androidx.compose.runtime.y0 y0Var, final androidx.compose.foundation.b2 b2Var, final androidx.compose.ui.graphics.n0 n0Var, final long j, final float f2, final float f3, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, final int i) {
        rVar2.c0(848986741);
        int i2 = i | (rVar2.f(rVar) ? 4 : 2) | (rVar2.f(p0Var) ? 32 : 16) | (rVar2.f(b2Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar2.f(n0Var) ? 16384 : 8192) | (rVar2.e(j) ? 131072 : Parser.ARGC_LIMIT) | (rVar2.c(f2) ? 1048576 : 524288) | (rVar2.c(f3) ? 8388608 : 4194304) | (rVar2.f(null) ? 67108864 : 33554432) | (rVar2.h(fVar) ? 536870912 : 268435456);
        if (rVar2.T(i2 & 1, (i2 & 306783379) != 306783378)) {
            androidx.compose.animation.core.e2 e2VarD = androidx.compose.animation.core.i2.d(p0Var, "DropDownMenu", rVar2, (((i2 >> 3) & 14) | 48) & Token.ELSE);
            androidx.compose.animation.core.k1 k1VarO = t2.o(androidx.compose.material3.tokens.p.e, rVar2);
            androidx.compose.animation.core.k1 k1VarO2 = t2.o(androidx.compose.material3.tokens.p.z, rVar2);
            androidx.compose.animation.core.l2 l2Var = androidx.compose.animation.core.e.j;
            androidx.compose.animation.core.j2 j2Var = e2VarD.a;
            androidx.compose.runtime.h1 h1Var = e2VarD.d;
            boolean zBooleanValue = ((Boolean) j2Var.n()).booleanValue();
            rVar2.b0(143964305);
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            rVar2.p(false);
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) h1Var.getValue()).booleanValue();
            rVar2.b0(143964305);
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            rVar2.p(false);
            Float fValueOf2 = Float.valueOf(f5);
            e2VarD.f();
            rVar2.b0(-745957716);
            rVar2.p(false);
            androidx.compose.animation.core.a2 a2VarC = androidx.compose.animation.core.i2.c(e2VarD, fValueOf, fValueOf2, k1VarO, l2Var, rVar2, 0);
            boolean zBooleanValue3 = ((Boolean) e2VarD.a.n()).booleanValue();
            rVar2.b0(892761509);
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            rVar2.p(false);
            Float fValueOf3 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) h1Var.getValue()).booleanValue();
            rVar2.b0(892761509);
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            rVar2.p(false);
            Float fValueOf4 = Float.valueOf(f7);
            e2VarD.f();
            rVar2.b0(2839488);
            rVar2.p(false);
            androidx.compose.animation.core.a2 a2VarC2 = androidx.compose.animation.core.i2.c(e2VarD, fValueOf3, fValueOf4, k1VarO2, l2Var, rVar2, 0);
            boolean zBooleanValue5 = ((Boolean) rVar2.j(androidx.compose.ui.platform.w1.a)).booleanValue();
            boolean zG = rVar2.g(zBooleanValue5) | rVar2.f(a2VarC) | ((i2 & Token.ASSIGN_MOD) == 32) | rVar2.f(a2VarC2);
            Object objQ = rVar2.Q();
            if (zG || objQ == androidx.compose.runtime.m.a) {
                Object m1Var = new m1(zBooleanValue5, p0Var, y0Var, a2VarC, a2VarC2);
                rVar2.l0(m1Var);
                objQ = m1Var;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            f3.a(androidx.compose.ui.graphics.a0.o(androidx.compose.ui.o.b, (kotlin.jvm.functions.l) objQ), n0Var, j, 0L, f2, f3, androidx.compose.runtime.internal.k.c(-1463404422, new o1(rVar, b2Var, fVar), rVar2), rVar2, (i3 & 896) | (i3 & Token.ASSIGN_MOD) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(p0Var, y0Var, b2Var, n0Var, j, f2, f3, fVar, i) { // from class: androidx.compose.material3.n1
                public final /* synthetic */ androidx.compose.foundation.b2 A;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ float D;
                public final /* synthetic */ float E;
                public final /* synthetic */ androidx.compose.runtime.internal.f F;
                public final /* synthetic */ androidx.compose.animation.core.p0 y;
                public final /* synthetic */ androidx.compose.runtime.y0 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(385);
                    q1.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, l1 l1Var, androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar2.g(z) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= rVar2.f(l1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= rVar2.f(m0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= rVar2.f(null) ? 67108864 : 33554432;
        }
        if (rVar2.T(i2 & 1, (38347923 & i2) != 38347922)) {
            androidx.compose.ui.r rVarN = androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.w0.o(androidx.compose.foundation.layout.w0.d(androidx.compose.foundation.s.i(rVar, null, u2.a(true, 0.0f, 6), z, null, aVar, 24), 1.0f), e, f, 8), m0Var);
            androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarN);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            p3.a(((t3) rVar2.j(u3.a)).m, androidx.compose.runtime.internal.k.c(865999929, new p1(l1Var, z, fVar), rVar2), rVar2, 48);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new l(fVar, aVar, rVar, z, l1Var, m0Var, i, 1);
        }
    }
}
