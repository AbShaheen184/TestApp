package androidx.compose.foundation.layout;

import androidx.compose.ui.node.a2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final a a = new a(0);
    public static final a b = new a(1);

    public static m0 a(int i, float f) {
        if ((i & 1) != 0) {
            f = 0;
        }
        float f2 = 0;
        return new m0(f, f2, f, f2);
    }

    public static final m0 b(float f, float f2, float f3, float f4) {
        return new m0(f, f2, f3, f4);
    }

    public static m0 c(float f) {
        return new m0(0, 0, 0, f);
    }

    public static final void d(androidx.compose.runtime.r rVar, androidx.compose.ui.r rVar2) {
        o oVar = o.c;
        int iHashCode = Long.hashCode(rVar.T);
        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVar2);
        androidx.compose.runtime.internal.j jVarL = rVar.l();
        androidx.compose.ui.node.g.b.getClass();
        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
        a2 a2Var = rVar.a;
        rVar.e0();
        if (rVar.S) {
            rVar.k(yVar);
        } else {
            rVar.o0();
        }
        androidx.compose.runtime.s.x(rVar, oVar, androidx.compose.ui.node.f.e);
        androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
        androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
        androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
        androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
        rVar.p(true);
    }

    public static androidx.compose.ui.r e(androidx.compose.ui.r rVar, androidx.compose.ui.j jVar) {
        return rVar.d(new l(jVar));
    }

    public static androidx.compose.ui.r g(androidx.compose.ui.r rVar, float f) {
        return rVar.d(new i(f));
    }

    public static final float h(m0 m0Var, androidx.compose.ui.unit.m mVar) {
        return mVar == androidx.compose.ui.unit.m.e ? m0Var.b(mVar) : m0Var.a(mVar);
    }

    public static final float i(m0 m0Var, androidx.compose.ui.unit.m mVar) {
        return mVar == androidx.compose.ui.unit.m.e ? m0Var.a(mVar) : m0Var.b(mVar);
    }

    public static final q0 j(androidx.compose.ui.layout.p0 p0Var) {
        Object objK = p0Var.K();
        if (objK instanceof q0) {
            return (q0) objK;
        }
        return null;
    }

    public static final float k(q0 q0Var) {
        if (q0Var != null) {
            return q0Var.a;
        }
        return 0.0f;
    }

    public static final boolean l(int i, int i2, long j) {
        int iJ = androidx.compose.ui.unit.a.j(j);
        if (i > androidx.compose.ui.unit.a.h(j) || iJ > i) {
            return false;
        }
        return i2 <= androidx.compose.ui.unit.a.g(j) && androidx.compose.ui.unit.a.i(j) <= i2;
    }

    public static androidx.compose.ui.layout.r0 m(p0 p0Var, int i, int i2, int i3, int i4, int i5, androidx.compose.ui.layout.s0 s0Var, List list, androidx.compose.ui.layout.c1[] c1VarArr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list2.get(i11);
            float fK = k(j(p0Var2));
            if (fK > 0.0f) {
                f2 += fK;
                i12++;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                androidx.compose.ui.layout.c1 c1VarF = c1VarArr[i11];
                if (c1VarF == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    c1VarF = p0Var2.F(p0Var.d(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                androidx.compose.ui.layout.c1 c1Var = c1VarF;
                int iF = p0Var.f(c1Var);
                int i15 = p0Var.i(c1Var);
                iArr[i8] = iF;
                int i16 = i14 - iF;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i5, i16);
                i13 += iF + iMin;
                iMax = Math.max(iMax, i15);
                c1VarArr[i8] = c1Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j = j;
        }
        long j2 = j;
        int i17 = i12;
        if (i17 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j3 = ((long) (i17 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i18 = 0; i18 < i6; i18++) {
                jRound -= (long) Math.round(k(j((androidx.compose.ui.layout.p0) list2.get(i18))) * f3);
            }
            int i19 = iMax;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i6) {
                if (c1VarArr[i20] == null) {
                    androidx.compose.ui.layout.p0 p0Var3 = (androidx.compose.ui.layout.p0) list2.get(i20);
                    q0 q0VarJ = j(p0Var3);
                    float fK2 = k(q0VarJ);
                    if (fK2 <= 0.0f) {
                        androidx.compose.foundation.layout.internal.a.b("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fK2 * f) + iSignum);
                    androidx.compose.ui.layout.c1 c1VarF2 = p0Var3.F(p0Var.d((!(q0VarJ != null ? q0VarJ.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iF2 = p0Var.f(c1VarF2);
                    int i22 = p0Var.i(c1VarF2);
                    iArr[i20] = iF2;
                    i21 += iF2;
                    int iMax3 = Math.max(i19, i22);
                    c1VarArr[i20] = c1VarF2;
                    i19 = iMax3;
                } else {
                    f = f3;
                }
                i20++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (((long) i21) + j3);
            int i23 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i23) {
                i7 = i23;
            }
            iMax = i19;
        }
        int i24 = i7 + i13;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax4 = Math.max(i24, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        p0Var.c(iMax4, s0Var, iArr, iArr2);
        return p0Var.j(c1VarArr, s0Var, iArr2, iMax4, iMax5);
    }

    public static final androidx.compose.ui.r n(androidx.compose.ui.r rVar, m0 m0Var) {
        return rVar.d(new l0(m0Var));
    }

    public static final androidx.compose.ui.r o(androidx.compose.ui.r rVar, float f) {
        return rVar.d(new j0(f, f, f, f));
    }

    public static final androidx.compose.ui.r p(androidx.compose.ui.r rVar, float f, float f2) {
        return rVar.d(new j0(f, f2, f, f2));
    }

    public static androidx.compose.ui.r q(androidx.compose.ui.r rVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return p(rVar, f, f2);
    }

    public static final androidx.compose.ui.r r(androidx.compose.ui.r rVar, float f, float f2, float f3, float f4) {
        return rVar.d(new j0(f, f2, f3, f4));
    }

    public static androidx.compose.ui.r s(androidx.compose.ui.r rVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return r(rVar, f, f2, f3, f4);
    }

    public static final androidx.compose.ui.r t(androidx.compose.ui.r rVar) {
        return rVar.d(new f0());
    }

    public abstract int f(int i, int i2, androidx.compose.ui.unit.m mVar);
}
