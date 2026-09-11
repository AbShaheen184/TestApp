package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {
    public static final w1 a = new w1();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public static k3 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, androidx.compose.runtime.r rVar, int i) {
        long j8 = androidx.compose.ui.graphics.t.i;
        long j9 = (i & 8388608) != 0 ? j8 : j6;
        long j10 = (i & 16777216) != 0 ? j8 : j7;
        n0 n0Var = (n0) rVar.j(o0.a);
        k3 k3VarA = n0Var.e0;
        boolean z = false;
        if (k3VarA == null) {
            rVar.b0(390452338);
            rVar.p(false);
            k3VarA = null;
        } else {
            rVar.b0(390452339);
            androidx.compose.foundation.text.selection.j1 j1Var = (androidx.compose.foundation.text.selection.j1) rVar.j(androidx.compose.foundation.text.selection.k1.a);
            if (!kotlin.jvm.internal.l.a(k3VarA.k, j1Var)) {
                k3VarA = k3VarA.a(k3VarA.a, k3VarA.b, k3VarA.c, k3VarA.d, k3VarA.e, k3VarA.f, k3VarA.g, k3VarA.h, k3VarA.i, k3VarA.j, j1Var, k3VarA.l, k3VarA.m, k3VarA.n, k3VarA.o, k3VarA.p, k3VarA.q, k3VarA.r, k3VarA.s, k3VarA.t, k3VarA.u, k3VarA.v, k3VarA.w, k3VarA.x, k3VarA.y, k3VarA.z, k3VarA.A, k3VarA.B, k3VarA.C, k3VarA.D, k3VarA.E, k3VarA.F, k3VarA.G, k3VarA.H, k3VarA.I, k3VarA.J, k3VarA.K, k3VarA.L, k3VarA.M, k3VarA.N, k3VarA.O, k3VarA.P, k3VarA.Q);
                n0Var.e0 = k3VarA;
                z = false;
            }
            rVar.p(z);
        }
        if (k3VarA == null) {
            rVar.b0(-1788321191);
            long jC = o0.c(n0Var, androidx.compose.material3.tokens.r.s);
            long jC2 = o0.c(n0Var, androidx.compose.material3.tokens.r.y);
            androidx.compose.material3.tokens.f fVar = androidx.compose.material3.tokens.r.f;
            long jB = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, fVar));
            long jC3 = o0.c(n0Var, androidx.compose.material3.tokens.r.m);
            long j11 = androidx.compose.ui.graphics.t.h;
            long jC4 = o0.c(n0Var, androidx.compose.material3.tokens.r.d);
            long jC5 = o0.c(n0Var, androidx.compose.material3.tokens.r.l);
            androidx.compose.foundation.text.selection.j1 j1Var2 = (androidx.compose.foundation.text.selection.j1) rVar.j(androidx.compose.foundation.text.selection.k1.a);
            long jC6 = o0.c(n0Var, androidx.compose.material3.tokens.r.v);
            long jC7 = o0.c(n0Var, androidx.compose.material3.tokens.r.E);
            long jB2 = androidx.compose.ui.graphics.t.b(0.12f, o0.c(n0Var, androidx.compose.material3.tokens.r.i));
            long jC8 = o0.c(n0Var, androidx.compose.material3.tokens.r.p);
            long jC9 = o0.c(n0Var, androidx.compose.material3.tokens.r.u);
            long jC10 = o0.c(n0Var, androidx.compose.material3.tokens.r.D);
            long jB3 = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, androidx.compose.material3.tokens.r.h));
            long jC11 = o0.c(n0Var, androidx.compose.material3.tokens.r.o);
            long jC12 = o0.c(n0Var, androidx.compose.material3.tokens.r.x);
            long jC13 = o0.c(n0Var, androidx.compose.material3.tokens.r.G);
            long jB4 = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, androidx.compose.material3.tokens.r.k));
            long jC14 = o0.c(n0Var, androidx.compose.material3.tokens.r.r);
            long jC15 = o0.c(n0Var, androidx.compose.material3.tokens.r.t);
            long jC16 = o0.c(n0Var, androidx.compose.material3.tokens.r.C);
            long jB5 = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, androidx.compose.material3.tokens.r.g));
            long jC17 = o0.c(n0Var, androidx.compose.material3.tokens.r.n);
            androidx.compose.material3.tokens.f fVar2 = androidx.compose.material3.tokens.r.z;
            long jC18 = o0.c(n0Var, fVar2);
            long jC19 = o0.c(n0Var, fVar2);
            long jB6 = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, fVar));
            long jC20 = o0.c(n0Var, fVar2);
            long jC21 = o0.c(n0Var, androidx.compose.material3.tokens.r.w);
            long jC22 = o0.c(n0Var, androidx.compose.material3.tokens.r.F);
            long jB7 = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, androidx.compose.material3.tokens.r.j));
            long jC23 = o0.c(n0Var, androidx.compose.material3.tokens.r.q);
            androidx.compose.material3.tokens.f fVar3 = androidx.compose.material3.tokens.r.A;
            long jC24 = o0.c(n0Var, fVar3);
            long jC25 = o0.c(n0Var, fVar3);
            long jB8 = androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, fVar3));
            long jC26 = o0.c(n0Var, fVar3);
            androidx.compose.material3.tokens.f fVar4 = androidx.compose.material3.tokens.r.B;
            k3VarA = new k3(jC, jC2, jB, jC3, j11, j11, j11, j11, jC4, jC5, j1Var2, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, o0.c(n0Var, fVar4), o0.c(n0Var, fVar4), androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, fVar4)), o0.c(n0Var, fVar4));
            n0Var.e0 = k3VarA;
            rVar.p(false);
        } else {
            rVar.b0(-1788515437);
            rVar.p(false);
        }
        return k3VarA.a(j, j2, j8, j8, j8, j8, j8, j8, j3, j8, null, j4, j5, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j9, j10, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:103:0x0185  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:106:0x018d  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01df  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0146  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0150  */
    public final void a(final boolean z, final androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.r rVar, final k3 k3Var, final androidx.compose.ui.graphics.n0 n0Var, float f, float f2, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        androidx.compose.ui.r rVar3;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        boolean z2;
        final androidx.compose.ui.r rVar4;
        final float f5;
        final float f6;
        androidx.compose.runtime.q1 q1VarT;
        androidx.compose.ui.r rVar5;
        float f7;
        boolean zBooleanValue;
        long j;
        androidx.compose.animation.core.k1 k1VarO;
        boolean z3;
        androidx.compose.runtime.t2 t2VarV;
        androidx.compose.animation.core.k1 k1VarO2;
        androidx.compose.runtime.t2 t2VarV2;
        long j2;
        float f8;
        rVar2.c0(1035477640);
        int i6 = (rVar2.g(z) ? 4 : 2) | i | (rVar2.g(false) ? 32 : 16) | (rVar2.f(kVar) ? LibretroCore.SCREEN_WIDTH : 128);
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                rVar3 = rVar;
                i6 |= rVar2.f(rVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (rVar2.f(k3Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            int i8 = i6 | i3;
            if (rVar2.f(n0Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i5 = i8 | i4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i9 = rVar2.c(f3) ? 1048576 : 524288;
                    i5 |= i9;
                } else {
                    f3 = f;
                }
                i5 |= i9;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i10 = rVar2.c(f4) ? 8388608 : 4194304;
                    i5 |= i10;
                } else {
                    f4 = f2;
                }
                i5 |= i10;
            } else {
                f4 = f2;
            }
            if ((38347923 & i5) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rVar2.T(i5 & 1, z2)) {
                rVar2.Y();
                if ((i & 1) != 0 || rVar2.C()) {
                    if (i7 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f7 = e;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                        f4 = d;
                    }
                } else {
                    rVar2.W();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    rVar5 = rVar3;
                    f7 = f3;
                }
                rVar2.q();
                zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, (i5 >> 6) & 14).getValue()).booleanValue();
                float f9 = androidx.compose.material3.internal.z.a;
                if (!z) {
                    j = k3Var.n;
                } else if (zBooleanValue) {
                    j = k3Var.l;
                } else {
                    j = k3Var.m;
                }
                androidx.compose.material3.tokens.p pVar = androidx.compose.material3.tokens.p.z;
                k1VarO = t2.o(pVar, rVar2);
                if (z) {
                    rVar2.b0(-1674507999);
                    t2VarV = androidx.compose.animation.e1.a(j, k1VarO, rVar2);
                    z3 = false;
                    rVar2.p(false);
                } else {
                    z3 = false;
                    rVar2.b0(-1674427244);
                    t2VarV = androidx.compose.runtime.s.v(new androidx.compose.ui.graphics.t(j), rVar2);
                    rVar2.p(false);
                }
                k1VarO2 = t2.o(androidx.compose.material3.tokens.p.e, rVar2);
                if (z) {
                    rVar2.b0(-1674245832);
                    if (zBooleanValue) {
                        f8 = f7;
                    } else {
                        f8 = f4;
                    }
                    t2VarV2 = androidx.compose.animation.core.h.a(f8, k1VarO2, rVar2);
                    rVar2.p(z3);
                } else {
                    rVar2.b0(-1674063769);
                    t2VarV2 = androidx.compose.runtime.s.v(new androidx.compose.ui.unit.f(f4), rVar2);
                    rVar2.p(z3);
                }
                androidx.compose.runtime.y0 y0VarV = androidx.compose.runtime.s.v(androidx.compose.foundation.s.a(((androidx.compose.ui.unit.f) t2VarV2.getValue()).e, ((androidx.compose.ui.graphics.t) t2VarV.getValue()).a), rVar2);
                if (!z) {
                    j2 = k3Var.g;
                } else if (zBooleanValue) {
                    j2 = k3Var.e;
                } else {
                    j2 = k3Var.f;
                }
                androidx.compose.runtime.t2 t2VarA = androidx.compose.animation.e1.a(j2, t2.o(pVar, rVar2), rVar2);
                androidx.compose.foundation.a0 a0Var = (androidx.compose.foundation.a0) y0VarV.getValue();
                androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.d(rVar5.d(new androidx.compose.foundation.z(a0Var.a, a0Var.b, n0Var)), new androidx.activity.compose.h(26, n0Var, new l3(new androidx.compose.foundation.lazy.o(0, 2, androidx.compose.runtime.t2.class, t2VarA, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;")))), rVar2, 0);
                rVar4 = rVar5;
                f5 = f7;
            } else {
                rVar2.W();
                rVar4 = rVar3;
                f5 = f3;
            }
            f6 = f4;
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.u1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.e.a(z, kVar, rVar4, k3Var, n0Var, f5, f6, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i6 |= 3072;
        rVar3 = rVar;
        if (rVar2.f(k3Var)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i11 = i6 | i3;
        if (rVar2.f(n0Var)) {
            i4 = 131072;
        } else {
            i4 = Parser.ARGC_LIMIT;
        }
        i5 = i11 | i4;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (rVar2.c(f3)) {
                }
                i5 |= i9;
            } else {
                f3 = f;
            }
            i5 |= i9;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (rVar2.c(f4)) {
                }
                i5 |= i10;
            } else {
                f4 = f2;
            }
            i5 |= i10;
        } else {
            f4 = f2;
        }
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rVar2.T(i5 & 1, z2)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = e;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = d;
                }
            } else {
                if (i7 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = e;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = d;
                }
            }
            rVar2.q();
            zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, (i5 >> 6) & 14).getValue()).booleanValue();
            float f10 = androidx.compose.material3.internal.z.a;
            if (!z) {
                j = k3Var.n;
            } else if (zBooleanValue) {
                j = k3Var.l;
            } else {
                j = k3Var.m;
            }
            androidx.compose.material3.tokens.p pVar2 = androidx.compose.material3.tokens.p.z;
            k1VarO = t2.o(pVar2, rVar2);
            if (z) {
                rVar2.b0(-1674507999);
                t2VarV = androidx.compose.animation.e1.a(j, k1VarO, rVar2);
                z3 = false;
                rVar2.p(false);
            } else {
                z3 = false;
                rVar2.b0(-1674427244);
                t2VarV = androidx.compose.runtime.s.v(new androidx.compose.ui.graphics.t(j), rVar2);
                rVar2.p(false);
            }
            k1VarO2 = t2.o(androidx.compose.material3.tokens.p.e, rVar2);
            if (z) {
                rVar2.b0(-1674245832);
                if (zBooleanValue) {
                    f8 = f7;
                } else {
                    f8 = f4;
                }
                t2VarV2 = androidx.compose.animation.core.h.a(f8, k1VarO2, rVar2);
                rVar2.p(z3);
            } else {
                rVar2.b0(-1674063769);
                t2VarV2 = androidx.compose.runtime.s.v(new androidx.compose.ui.unit.f(f4), rVar2);
                rVar2.p(z3);
            }
            androidx.compose.runtime.y0 y0VarV2 = androidx.compose.runtime.s.v(androidx.compose.foundation.s.a(((androidx.compose.ui.unit.f) t2VarV2.getValue()).e, ((androidx.compose.ui.graphics.t) t2VarV.getValue()).a), rVar2);
            if (!z) {
                j2 = k3Var.g;
            } else if (zBooleanValue) {
                j2 = k3Var.e;
            } else {
                j2 = k3Var.f;
            }
            androidx.compose.runtime.t2 t2VarA2 = androidx.compose.animation.e1.a(j2, t2.o(pVar2, rVar2), rVar2);
            androidx.compose.foundation.a0 a0Var2 = (androidx.compose.foundation.a0) y0VarV2.getValue();
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.d(rVar5.d(new androidx.compose.foundation.z(a0Var2.a, a0Var2.b, n0Var)), new androidx.activity.compose.h(26, n0Var, new l3(new androidx.compose.foundation.lazy.o(0, 2, androidx.compose.runtime.t2.class, t2VarA2, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;")))), rVar2, 0);
            rVar4 = rVar5;
            f5 = f7;
        } else {
            rVar2.W();
            rVar4 = rVar3;
            f5 = f3;
        }
        f6 = f4;
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.u1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.a(z, kVar, rVar4, k3Var, n0Var, f5, f6, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public final void b(final String str, final kotlin.jvm.functions.p pVar, final boolean z, final boolean z2, final androidx.compose.ui.text.input.g0 g0Var, final androidx.compose.foundation.interaction.k kVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, final kotlin.jvm.functions.p pVar4, final kotlin.jvm.functions.p pVar5, final k3 k3Var, androidx.compose.foundation.layout.m0 m0Var, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, final int i) {
        int i2;
        kotlin.jvm.functions.p pVar6;
        boolean z3;
        final androidx.compose.foundation.layout.m0 m0Var2;
        androidx.compose.foundation.layout.m0 m0Var3;
        int i3;
        androidx.compose.runtime.internal.f fVar2;
        rVar.c0(-1732281618);
        if ((i & 6) == 0) {
            i2 = (rVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pVar6 = pVar;
            i2 |= rVar.h(pVar6) ? 32 : 16;
        } else {
            pVar6 = pVar;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= rVar.g(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar.f(g0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar.f(kVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= rVar.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= rVar.h(pVar2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= rVar.h(pVar3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= rVar.h(pVar4) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (rVar.h(pVar5) ? 4 : 2) | (rVar.h(null) ? 32 : 16) | (rVar.h(null) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(null) ? 2048 : 1024) | (rVar.f(k3Var) ? 16384 : 8192) | Parser.ARGC_LIMIT;
        if (rVar.T(i2 & 1, ((i2 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            rVar.Y();
            if ((i & 1) == 0 || rVar.C()) {
                float f = androidx.compose.material3.internal.z.a;
                m0Var3 = new androidx.compose.foundation.layout.m0(f, f, f, f);
                i3 = i4 & (-458753);
            } else {
                rVar.W();
                i3 = i4 & (-458753);
                m0Var3 = m0Var;
            }
            rVar.q();
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objQ = rVar.Q();
            if (z4 || objQ == androidx.compose.runtime.m.a) {
                objQ = g0Var.b(new androidx.compose.ui.text.g(str));
                rVar.l0(objQ);
            }
            String str2 = ((androidx.compose.ui.text.input.e0) objQ).a.y;
            n3 n3Var = new n3();
            if (pVar2 == null) {
                rVar.b0(1927058812);
                rVar.p(false);
                fVar2 = null;
            } else {
                rVar.b0(1927058813);
                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1459717586, new androidx.compose.foundation.text.contextmenu.internal.m(pVar2, 2), rVar);
                rVar.p(false);
                fVar2 = fVarC;
            }
            int i5 = i2 >> 9;
            int i6 = i3 << 21;
            androidx.compose.foundation.layout.m0 m0Var4 = m0Var3;
            androidx.compose.material3.internal.z.a(str2, pVar6, n3Var, fVar2, pVar3, pVar4, pVar5, z3, z, kVar, m0Var4, k3Var, fVar, rVar, ((i2 << 3) & 896) | 6 | (i5 & 458752) | (i5 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), (i2 & 896) | ((i3 >> 9) & 14) | ((i2 >> 6) & Token.ASSIGN_MOD) | (i5 & 7168) | ((i2 >> 3) & 57344) | ((i3 << 6) & 3670016) | 12582912);
            m0Var2 = m0Var4;
        } else {
            rVar.W();
            m0Var2 = m0Var;
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.v1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    this.e.b(str, pVar, z, z2, g0Var, kVar, pVar2, pVar3, pVar4, pVar5, k3Var, m0Var2, fVar, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
