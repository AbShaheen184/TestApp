package androidx.compose.ui.layout;

import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final h a = new h(4);
    public static final Object b = new Object();

    public static final void a(l1 l1Var, androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar2, int i) {
        rVar2.c0(-511989831);
        int i2 = (rVar2.h(l1Var) ? 4 : 2) | i | (rVar2.f(rVar) ? 32 : 16) | (rVar2.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.p pVarU = androidx.compose.runtime.s.u(rVar2);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVar);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(androidx.compose.ui.node.y.y);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, l1Var, l1Var.c);
            androidx.compose.runtime.s.x(rVar2, pVarU, l1Var.d);
            androidx.compose.runtime.s.x(rVar2, pVar, l1Var.e);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            rVar2.p(true);
            if (rVar2.F()) {
                rVar2.b0(-1266202711);
            } else {
                rVar2.b0(-1259244916);
                boolean zH = rVar2.h(l1Var);
                Object objQ = rVar2.Q();
                if (zH || objQ == androidx.compose.runtime.m.a) {
                    objQ = new androidx.compose.animation.z(l1Var, 6);
                    rVar2.l0(objQ);
                }
                androidx.compose.runtime.j0.e((kotlin.jvm.functions.a) objQ, rVar2);
            }
            rVar2.p(false);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new h1(l1Var, rVar, pVar, i, 0);
        }
    }

    public static final float b(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float c(b1 b1Var, boolean z, p[] pVarArr, float f) {
        float f2 = Float.NaN;
        for (p pVar : pVarArr) {
            float fC = b1Var.c(pVar);
            if (Float.isNaN(f2)) {
                f2 = fC;
            } else if (z == (fC > f2)) {
                f2 = fC;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final androidx.compose.ui.geometry.c d(x xVar) {
        x xVarM = xVar.M();
        return xVarM != null ? xVarM.s(xVar, true) : new androidx.compose.ui.geometry.c(0.0f, 0.0f, (int) (xVar.u() >> 32), (int) (xVar.u() & 4294967295L));
    }

    public static final androidx.compose.ui.geometry.c e(x xVar, boolean z) {
        x xVarG = g(xVar);
        float fU = (int) (xVarG.u() >> 32);
        float fU2 = (int) (xVarG.u() & 4294967295L);
        androidx.compose.ui.geometry.c cVarS = xVarG.s(xVar, z);
        float f = cVarS.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fU) {
                f = fU;
            }
        }
        float f2 = cVarS.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fU2) {
                f2 = fU2;
            }
        }
        float f3 = cVarS.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fU) {
                fU = f3;
            }
            f3 = fU;
        }
        float f4 = cVarS.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fU2) {
                fU2 = f5;
            }
            f4 = fU2;
        }
        if (f == f3 || f2 == f4) {
            return androidx.compose.ui.geometry.c.e;
        }
        long jF = xVarG.f((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jF2 = xVarG.f((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jF3 = xVarG.f((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jF4 = xVarG.f((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jF4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jF3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jF & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jF2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jF4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jF3 & 4294967295L));
        return new androidx.compose.ui.geometry.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final x g(x xVar) {
        x xVar2;
        x xVarM = xVar.M();
        while (true) {
            x xVar3 = xVarM;
            xVar2 = xVar;
            xVar = xVar3;
            if (xVar == null) {
                break;
            }
            xVarM = xVar.M();
        }
        androidx.compose.ui.node.d1 d1Var = xVar2 instanceof androidx.compose.ui.node.d1 ? (androidx.compose.ui.node.d1) xVar2 : null;
        if (d1Var == null) {
            return xVar2;
        }
        androidx.compose.ui.node.d1 d1Var2 = d1Var.N;
        while (true) {
            androidx.compose.ui.node.d1 d1Var3 = d1Var2;
            androidx.compose.ui.node.d1 d1Var4 = d1Var;
            d1Var = d1Var3;
            if (d1Var == null) {
                return d1Var4;
            }
            d1Var2 = d1Var.N;
        }
    }

    public static final Object h(p0 p0Var) {
        Object objK = p0Var.K();
        b0 b0Var = objK instanceof b0 ? (b0) objK : null;
        if (b0Var != null) {
            return b0Var.L;
        }
        return null;
    }

    public static final androidx.compose.ui.node.o0 i(androidx.compose.ui.node.o0 o0Var) {
        androidx.compose.ui.node.f0 f0Var = o0Var.L.L;
        while (true) {
            androidx.compose.ui.node.f0 f0VarV = f0Var.v();
            androidx.compose.ui.node.f0 f0Var2 = null;
            if ((f0VarV != null ? f0VarV.F : null) == null) {
                androidx.compose.ui.node.o0 o0VarR0 = ((androidx.compose.ui.node.d1) f0Var.d0.e).R0();
                o0VarR0.getClass();
                return o0VarR0;
            }
            androidx.compose.ui.node.f0 f0VarV2 = f0Var.v();
            if (f0VarV2 != null) {
                f0Var2 = f0VarV2.F;
            }
            f0Var2.getClass();
            androidx.compose.ui.node.f0 f0VarV3 = f0Var.v();
            f0VarV3.getClass();
            f0Var = f0VarV3.F;
            f0Var.getClass();
        }
    }

    public static final androidx.compose.ui.r j(androidx.compose.ui.r rVar, kotlin.jvm.functions.q qVar) {
        return rVar.d(new y(qVar));
    }

    public static final androidx.compose.ui.r k(androidx.compose.ui.r rVar, String str) {
        return rVar.d(new z(str));
    }

    public static final androidx.compose.ui.r l(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new v0(lVar));
    }

    public static final androidx.compose.ui.r m(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new x0(lVar));
    }

    public static final long n(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
