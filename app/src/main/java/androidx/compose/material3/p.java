package androidx.compose.material3;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final androidx.compose.ui.window.d0 a = new androidx.compose.ui.window.d0(14);

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.ui.r rVar, long j, androidx.compose.foundation.b2 b2Var, androidx.compose.ui.window.d0 d0Var, androidx.compose.ui.graphics.n0 n0Var, long j2, float f, float f2, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        long jFloatToRawIntBits;
        int i3;
        int i4;
        boolean z2;
        final androidx.compose.ui.window.d0 d0Var2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j3;
        final float f3;
        final float f4;
        final long j4;
        final androidx.compose.foundation.b2 b2Var2;
        androidx.compose.runtime.q1 q1VarT;
        androidx.compose.foundation.b2 b2Var3;
        androidx.compose.ui.graphics.n0 n0Var3;
        float f5;
        long j5;
        float f6;
        int i5;
        androidx.compose.ui.window.d0 d0Var3;
        Object objQ;
        Object obj;
        androidx.compose.animation.core.p0 p0Var;
        Object objQ2;
        androidx.compose.runtime.y0 y0Var;
        androidx.compose.ui.unit.c cVar;
        boolean zF;
        Object objQ3;
        androidx.compose.ui.window.d0 d0Var4;
        rVar2.c0(1725609375);
        int i6 = (rVar2.g(z) ? 4 : 2) | i;
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                jFloatToRawIntBits = j;
                i6 |= rVar2.e(jFloatToRawIntBits) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 = i6 | 910893056;
            i4 = 0;
            if ((306783379 & i3) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (rVar2.T(i3 & 1, z2)) {
                rVar2.Y();
                if ((i & 1) != 0 || rVar2.C()) {
                    if (i7 != 0) {
                        float f7 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                    }
                    androidx.compose.foundation.b2 b2VarO = androidx.compose.foundation.s.o(rVar2);
                    float f8 = k1.a;
                    androidx.compose.ui.graphics.n0 n0VarA = a3.a(androidx.compose.material3.tokens.o.c, rVar2);
                    long jD = o0.d(androidx.compose.material3.tokens.o.a, rVar2);
                    b2Var3 = b2VarO;
                    n0Var3 = n0VarA;
                    f5 = k1.a;
                    j5 = jD;
                    f6 = k1.b;
                    i5 = i3 & (-33087489);
                    d0Var3 = a;
                } else {
                    rVar2.W();
                    b2Var3 = b2Var;
                    n0Var3 = n0Var;
                    j5 = j2;
                    f5 = f;
                    f6 = f2;
                    i5 = i3 & (-33087489);
                    d0Var3 = d0Var;
                }
                rVar2.q();
                objQ = rVar2.Q();
                obj = androidx.compose.runtime.m.a;
                if (objQ == obj) {
                    objQ = new androidx.compose.animation.core.p0(Boolean.FALSE);
                    rVar2.l0(objQ);
                }
                p0Var = (androidx.compose.animation.core.p0) objQ;
                p0Var.z.setValue(Boolean.valueOf(z));
                if (!((Boolean) p0Var.y.getValue()).booleanValue() || ((Boolean) p0Var.z.getValue()).booleanValue()) {
                    rVar2.b0(1165905588);
                    objQ2 = rVar2.Q();
                    if (objQ2 == obj) {
                        objQ2 = androidx.compose.runtime.s.r(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.b));
                        rVar2.l0(objQ2);
                    }
                    y0Var = (androidx.compose.runtime.y0) objQ2;
                    cVar = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                    zF = rVar2.f(cVar) | ((i5 & 7168) == 2048);
                    objQ3 = rVar2.Q();
                    if (zF || objQ3 == obj) {
                        objQ3 = new androidx.compose.material3.internal.h(jFloatToRawIntBits, cVar, new m(y0Var, i4));
                        rVar2.l0(objQ3);
                    }
                    androidx.compose.ui.window.d0 d0Var5 = d0Var3;
                    androidx.compose.ui.window.o.a((androidx.compose.material3.internal.h) objQ3, aVar, d0Var5, androidx.compose.runtime.internal.k.c(-917492520, new o(rVar, p0Var, y0Var, b2Var3, n0Var3, j5, f5, f6, fVar), rVar2), rVar2, 3504, 0);
                    d0Var4 = d0Var5;
                    rVar2.p(false);
                } else {
                    rVar2.b0(1166965571);
                    rVar2.p(false);
                    d0Var4 = d0Var3;
                }
                j4 = jFloatToRawIntBits;
                d0Var2 = d0Var4;
                b2Var2 = b2Var3;
                n0Var2 = n0Var3;
                j3 = j5;
                f3 = f5;
                f4 = f6;
            } else {
                rVar2.W();
                d0Var2 = d0Var;
                n0Var2 = n0Var;
                j3 = j2;
                f3 = f;
                f4 = f2;
                j4 = jFloatToRawIntBits;
                b2Var2 = b2Var;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.n
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = androidx.compose.runtime.s.A(i | 1);
                        p.a(z, aVar, rVar, j4, b2Var2, d0Var2, n0Var2, j3, f3, f4, fVar, (androidx.compose.runtime.r) obj2, iA, i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i6 |= 3072;
        jFloatToRawIntBits = j;
        i3 = i6 | 910893056;
        i4 = 0;
        if ((306783379 & i3) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rVar2.T(i3 & 1, z2)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    float f9 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                }
                androidx.compose.foundation.b2 b2VarO2 = androidx.compose.foundation.s.o(rVar2);
                float f10 = k1.a;
                androidx.compose.ui.graphics.n0 n0VarA2 = a3.a(androidx.compose.material3.tokens.o.c, rVar2);
                long jD2 = o0.d(androidx.compose.material3.tokens.o.a, rVar2);
                b2Var3 = b2VarO2;
                n0Var3 = n0VarA2;
                f5 = k1.a;
                j5 = jD2;
                f6 = k1.b;
                i5 = i3 & (-33087489);
                d0Var3 = a;
            } else {
                if (i7 != 0) {
                    float f11 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                }
                androidx.compose.foundation.b2 b2VarO3 = androidx.compose.foundation.s.o(rVar2);
                float f12 = k1.a;
                androidx.compose.ui.graphics.n0 n0VarA3 = a3.a(androidx.compose.material3.tokens.o.c, rVar2);
                long jD3 = o0.d(androidx.compose.material3.tokens.o.a, rVar2);
                b2Var3 = b2VarO3;
                n0Var3 = n0VarA3;
                f5 = k1.a;
                j5 = jD3;
                f6 = k1.b;
                i5 = i3 & (-33087489);
                d0Var3 = a;
            }
            rVar2.q();
            objQ = rVar2.Q();
            obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = new androidx.compose.animation.core.p0(Boolean.FALSE);
                rVar2.l0(objQ);
            }
            p0Var = (androidx.compose.animation.core.p0) objQ;
            p0Var.z.setValue(Boolean.valueOf(z));
            if (((Boolean) p0Var.y.getValue()).booleanValue()) {
                rVar2.b0(1165905588);
                objQ2 = rVar2.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.s.r(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.b));
                    rVar2.l0(objQ2);
                }
                y0Var = (androidx.compose.runtime.y0) objQ2;
                cVar = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                zF = rVar2.f(cVar) | ((i5 & 7168) == 2048);
                objQ3 = rVar2.Q();
                if (zF) {
                    objQ3 = new androidx.compose.material3.internal.h(jFloatToRawIntBits, cVar, new m(y0Var, i4));
                    rVar2.l0(objQ3);
                } else {
                    objQ3 = new androidx.compose.material3.internal.h(jFloatToRawIntBits, cVar, new m(y0Var, i4));
                    rVar2.l0(objQ3);
                }
                androidx.compose.ui.window.d0 d0Var6 = d0Var3;
                androidx.compose.ui.window.o.a((androidx.compose.material3.internal.h) objQ3, aVar, d0Var6, androidx.compose.runtime.internal.k.c(-917492520, new o(rVar, p0Var, y0Var, b2Var3, n0Var3, j5, f5, f6, fVar), rVar2), rVar2, 3504, 0);
                d0Var4 = d0Var6;
                rVar2.p(false);
            } else {
                rVar2.b0(1165905588);
                objQ2 = rVar2.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.s.r(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.b));
                    rVar2.l0(objQ2);
                }
                y0Var = (androidx.compose.runtime.y0) objQ2;
                cVar = (androidx.compose.ui.unit.c) rVar2.j(androidx.compose.ui.platform.l1.h);
                zF = rVar2.f(cVar) | ((i5 & 7168) == 2048);
                objQ3 = rVar2.Q();
                if (zF) {
                    objQ3 = new androidx.compose.material3.internal.h(jFloatToRawIntBits, cVar, new m(y0Var, i4));
                    rVar2.l0(objQ3);
                } else {
                    objQ3 = new androidx.compose.material3.internal.h(jFloatToRawIntBits, cVar, new m(y0Var, i4));
                    rVar2.l0(objQ3);
                }
                androidx.compose.ui.window.d0 d0Var7 = d0Var3;
                androidx.compose.ui.window.o.a((androidx.compose.material3.internal.h) objQ3, aVar, d0Var7, androidx.compose.runtime.internal.k.c(-917492520, new o(rVar, p0Var, y0Var, b2Var3, n0Var3, j5, f5, f6, fVar), rVar2), rVar2, 3504, 0);
                d0Var4 = d0Var7;
                rVar2.p(false);
            }
            j4 = jFloatToRawIntBits;
            d0Var2 = d0Var4;
            b2Var2 = b2Var3;
            n0Var2 = n0Var3;
            j3 = j5;
            f3 = f5;
            f4 = f6;
        } else {
            rVar2.W();
            d0Var2 = d0Var;
            n0Var2 = n0Var;
            j3 = j2;
            f3 = f;
            f4 = f2;
            j4 = jFloatToRawIntBits;
            b2Var2 = b2Var;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.n
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    p.a(z, aVar, rVar, j4, b2Var2, d0Var2, n0Var2, j3, f3, f4, fVar, (androidx.compose.runtime.r) obj2, iA, i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, l1 l1Var, androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        androidx.compose.ui.r rVar3;
        boolean z2;
        l1 l1Var2;
        androidx.compose.foundation.layout.m0 m0Var2;
        int i3;
        l1 l1Var3;
        androidx.compose.foundation.layout.m0 m0Var3;
        androidx.compose.ui.r rVar4;
        boolean z3;
        rVar2.c0(-532959117);
        if ((i & 48) == 0) {
            i2 = i | (rVar2.h(aVar) ? 32 : 16);
        } else {
            i2 = i;
        }
        int i4 = i2 | 113995136;
        if (rVar2.T(i4 & 1, (38347923 & i4) != 38347922)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                float f = k1.a;
                n0 n0Var = (n0) rVar2.j(o0.a);
                l1 l1Var4 = n0Var.c0;
                if (l1Var4 == null) {
                    l1 l1Var5 = new l1(o0.c(n0Var, androidx.compose.material3.tokens.n.g), o0.c(n0Var, androidx.compose.material3.tokens.n.h), o0.c(n0Var, androidx.compose.material3.tokens.n.i), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.n.b, o0.c(n0Var, androidx.compose.material3.tokens.n.a)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.n.d, o0.c(n0Var, androidx.compose.material3.tokens.n.c)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.n.f, o0.c(n0Var, androidx.compose.material3.tokens.n.e)));
                    n0Var.c0 = l1Var5;
                    l1Var4 = l1Var5;
                }
                i3 = i4 & (-3670017);
                l1Var3 = l1Var4;
                m0Var3 = k1.c;
                rVar4 = androidx.compose.ui.o.b;
                z3 = true;
            } else {
                rVar2.W();
                i3 = i4 & (-3670017);
                rVar4 = rVar;
                z3 = z;
                l1Var3 = l1Var;
                m0Var3 = m0Var;
            }
            rVar2.q();
            q1.b(fVar, aVar, rVar4, z3, l1Var3, m0Var3, rVar2, 268435454 & i3);
            l1Var2 = l1Var3;
            m0Var2 = m0Var3;
            rVar3 = rVar4;
            z2 = z3;
        } else {
            rVar2.W();
            rVar3 = rVar;
            z2 = z;
            l1Var2 = l1Var;
            m0Var2 = m0Var;
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new l(fVar, aVar, rVar3, z2, l1Var2, m0Var2, i, 0);
        }
    }
}
