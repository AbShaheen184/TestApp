package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p3 {
    public static final androidx.compose.runtime.b0 a = new androidx.compose.runtime.b0(new androidx.activity.compose.b(26));

    public static final void a(androidx.compose.ui.text.m0 m0Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(15327438);
        int i2 = (rVar.f(m0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= rVar.h(fVar) ? 32 : 16;
        }
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.runtime.b0 b0Var = a;
            androidx.compose.runtime.s.a(b0Var.a(((androidx.compose.ui.text.m0) rVar.j(b0Var)).d(m0Var)), fVar, rVar, (i2 & Token.ASSIGN_MOD) | 8);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.core.v1(m0Var, fVar, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0138  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:123:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:154:0x025e  */
    /* JADX WARN: Code duplicated, block: B:157:0x027a  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    public static final void b(final String str, androidx.compose.ui.r rVar, long j, long j2, androidx.compose.ui.text.font.l lVar, long j3, androidx.compose.ui.text.style.k kVar, long j4, int i, boolean z, int i2, int i3, androidx.compose.ui.text.m0 m0Var, androidx.compose.runtime.r rVar2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j5;
        int i12;
        int i13;
        int i14;
        androidx.compose.ui.text.font.l lVar2;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.text.style.k kVar2;
        int i18;
        int i19;
        int i20;
        long j6;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final int i26;
        int i27;
        int i28;
        boolean z2;
        boolean z3;
        final long j7;
        final long j8;
        final androidx.compose.ui.r rVar3;
        final long j9;
        final boolean z4;
        final int i29;
        final androidx.compose.ui.text.m0 m0Var2;
        final androidx.compose.ui.text.font.l lVar3;
        final androidx.compose.ui.text.style.k kVar3;
        final long j10;
        final int i30;
        androidx.compose.runtime.q1 q1VarT;
        androidx.compose.ui.r rVar4;
        long j11;
        long j12;
        int i31;
        androidx.compose.ui.text.m0 m0Var3;
        int i32;
        long jB;
        rVar2.c0(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (rVar2.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i33 = i6 & 2;
        if (i33 == 0) {
            if ((i4 & 48) == 0) {
                i7 |= rVar2.f(rVar) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                if (rVar2.e(j)) {
                    i9 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            i10 = i7 | 3072;
            i11 = i6 & 16;
            if (i11 != 0) {
                i10 = i7 | 27648;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 24576) == 0) {
                    if (rVar2.e(j5)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i10 |= i12;
                }
            }
            i13 = i10 | 196608;
            i14 = i6 & 64;
            if (i14 != 0) {
                if ((1572864 & i4) == 0) {
                    lVar2 = lVar;
                    if (rVar2.f(lVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 918552576;
                i17 = i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i17 != 0) {
                    i19 = i5 | 6;
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar;
                    if (rVar2.f(kVar2)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i19 = i18 | i5;
                }
                i20 = i6 & 2048;
                if (i20 != 0) {
                    i19 |= 48;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i5 & 48) == 0) {
                        if (rVar2.e(j6)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i19 |= i21;
                    }
                }
                i22 = i6 & 4096;
                if (i22 != 0) {
                    if ((i5 & 384) == 0) {
                        if (rVar2.d(i)) {
                            i23 = LibretroCore.SCREEN_WIDTH;
                        } else {
                            i23 = 128;
                        }
                        i19 |= i23;
                    }
                    i24 = i19 | 3072;
                    i25 = i6 & 16384;
                    if (i25 != 0) {
                        if ((i5 & 24576) == 0) {
                            i26 = i2;
                            i24 |= rVar2.d(i26) ? 16384 : 8192;
                        }
                        int i34 = i24 | 1769472;
                        if ((i6 & 131072) == 0) {
                            i27 = i25;
                            int i35 = rVar2.f(m0Var) ? 8388608 : 4194304;
                            i28 = i34 | i35;
                            z2 = true;
                            if ((i16 & 306783379) == 306783378 || (i28 & 4793491) != 4793490) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rVar2.T(i16 & 1, z3)) {
                                rVar2.Y();
                                if ((i4 & 1) != 0 || rVar2.C()) {
                                    if (i33 != 0) {
                                        rVar4 = androidx.compose.ui.o.b;
                                    } else {
                                        rVar4 = rVar;
                                    }
                                    if (i8 != 0) {
                                        j11 = androidx.compose.ui.graphics.t.i;
                                    } else {
                                        j11 = j;
                                    }
                                    if (i11 != 0) {
                                        j5 = androidx.compose.ui.unit.o.c;
                                    }
                                    if (i14 != 0) {
                                        lVar2 = null;
                                    }
                                    j12 = androidx.compose.ui.unit.o.c;
                                    if (i17 != 0) {
                                        kVar2 = null;
                                    }
                                    if (i20 != 0) {
                                        j6 = j12;
                                    }
                                    if (i22 != 0) {
                                        i31 = 1;
                                    } else {
                                        i31 = i;
                                    }
                                    if (i27 != 0) {
                                        i26 = Integer.MAX_VALUE;
                                    }
                                    if ((i6 & 131072) != 0) {
                                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                        i28 &= -29360129;
                                    } else {
                                        m0Var3 = m0Var;
                                    }
                                    i32 = 1;
                                } else {
                                    rVar2.W();
                                    if ((i6 & 131072) != 0) {
                                        i28 &= -29360129;
                                    }
                                    rVar4 = rVar;
                                    j11 = j;
                                    j12 = j3;
                                    i31 = i;
                                    z2 = z;
                                    i32 = i3;
                                    m0Var3 = m0Var;
                                }
                                rVar2.q();
                                rVar2.b0(-565217106);
                                if (j11 != 16) {
                                    rVar4 = rVar4;
                                    i32 = i32;
                                    jB = j11;
                                } else {
                                    rVar2.b0(-565216333);
                                    jB = m0Var3.b();
                                    if (jB != 16) {
                                        jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                                    }
                                    rVar2.p(false);
                                }
                                rVar2.p(false);
                                int i36 = i28 << 6;
                                androidx.compose.ui.r rVar5 = rVar4;
                                int i37 = i32;
                                androidx.compose.foundation.text.n0.a(str, rVar5, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i37, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i36) | 196608 | (i36 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                                i29 = i37;
                                rVar3 = rVar5;
                                m0Var2 = m0Var3;
                                lVar3 = lVar2;
                                z4 = z2;
                                j10 = j12;
                                androidx.compose.ui.text.style.k kVar4 = kVar2;
                                i30 = i31;
                                long j13 = j5;
                                kVar3 = kVar4;
                                j7 = j6;
                                j8 = j13;
                                j9 = j11;
                            } else {
                                rVar2.W();
                                j7 = j6;
                                j8 = j5;
                                rVar3 = rVar;
                                j9 = j;
                                z4 = z;
                                i29 = i3;
                                m0Var2 = m0Var;
                                lVar3 = lVar2;
                                kVar3 = kVar2;
                                j10 = j3;
                                i30 = i;
                            }
                            q1VarT = rVar2.t();
                            if (q1VarT != null) {
                                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                                    @Override // kotlin.jvm.functions.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iA = androidx.compose.runtime.s.A(i4 | 1);
                                        int iA2 = androidx.compose.runtime.s.A(i5);
                                        p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                        return kotlin.y.a;
                                    }
                                };
                            }
                        }
                        i27 = i25;
                        i28 = i34 | i35;
                        z2 = true;
                        if ((i16 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (rVar2.T(i16 & 1, z3)) {
                            rVar2.Y();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            } else {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            }
                            rVar2.q();
                            rVar2.b0(-565217106);
                            if (j11 != 16) {
                                rVar4 = rVar4;
                                i32 = i32;
                                jB = j11;
                            } else {
                                rVar2.b0(-565216333);
                                jB = m0Var3.b();
                                if (jB != 16) {
                                    jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                                }
                                rVar2.p(false);
                            }
                            rVar2.p(false);
                            int i38 = i28 << 6;
                            androidx.compose.ui.r rVar6 = rVar4;
                            int i39 = i32;
                            androidx.compose.foundation.text.n0.a(str, rVar6, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i39, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i38) | 196608 | (i38 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                            i29 = i39;
                            rVar3 = rVar6;
                            m0Var2 = m0Var3;
                            lVar3 = lVar2;
                            z4 = z2;
                            j10 = j12;
                            androidx.compose.ui.text.style.k kVar5 = kVar2;
                            i30 = i31;
                            long j14 = j5;
                            kVar3 = kVar5;
                            j7 = j6;
                            j8 = j14;
                            j9 = j11;
                        } else {
                            rVar2.W();
                            j7 = j6;
                            j8 = j5;
                            rVar3 = rVar;
                            j9 = j;
                            z4 = z;
                            i29 = i3;
                            m0Var2 = m0Var;
                            lVar3 = lVar2;
                            kVar3 = kVar2;
                            j10 = j3;
                            i30 = i;
                        }
                        q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(i4 | 1);
                                    int iA2 = androidx.compose.runtime.s.A(i5);
                                    p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i24 = i19 | 27648;
                    i26 = i2;
                    int i310 = i24 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i27 = i25;
                        if (rVar2.f(m0Var)) {
                        }
                        i28 = i310 | i35;
                        z2 = true;
                        if ((i16 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (rVar2.T(i16 & 1, z3)) {
                            rVar2.Y();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            } else {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            }
                            rVar2.q();
                            rVar2.b0(-565217106);
                            if (j11 != 16) {
                                rVar4 = rVar4;
                                i32 = i32;
                                jB = j11;
                            } else {
                                rVar2.b0(-565216333);
                                jB = m0Var3.b();
                                if (jB != 16) {
                                    jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                                }
                                rVar2.p(false);
                            }
                            rVar2.p(false);
                            int i311 = i28 << 6;
                            androidx.compose.ui.r rVar7 = rVar4;
                            int i312 = i32;
                            androidx.compose.foundation.text.n0.a(str, rVar7, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i312, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311) | 196608 | (i311 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                            i29 = i312;
                            rVar3 = rVar7;
                            m0Var2 = m0Var3;
                            lVar3 = lVar2;
                            z4 = z2;
                            j10 = j12;
                            androidx.compose.ui.text.style.k kVar6 = kVar2;
                            i30 = i31;
                            long j15 = j5;
                            kVar3 = kVar6;
                            j7 = j6;
                            j8 = j15;
                            j9 = j11;
                        } else {
                            rVar2.W();
                            j7 = j6;
                            j8 = j5;
                            rVar3 = rVar;
                            j9 = j;
                            z4 = z;
                            i29 = i3;
                            m0Var2 = m0Var;
                            lVar3 = lVar2;
                            kVar3 = kVar2;
                            j10 = j3;
                            i30 = i;
                        }
                        q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(i4 | 1);
                                    int iA2 = androidx.compose.runtime.s.A(i5);
                                    p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i27 = i25;
                    i28 = i310 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i313 = i28 << 6;
                        androidx.compose.ui.r rVar8 = rVar4;
                        int i314 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar8, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i314, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i313) | 196608 | (i313 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i314;
                        rVar3 = rVar8;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar7 = kVar2;
                        i30 = i31;
                        long j16 = j5;
                        kVar3 = kVar7;
                        j7 = j6;
                        j8 = j16;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i19 |= 384;
                i24 = i19 | 3072;
                i25 = i6 & 16384;
                if (i25 != 0) {
                    if ((i5 & 24576) == 0) {
                        i26 = i2;
                        i24 |= rVar2.d(i26) ? 16384 : 8192;
                    }
                    int i315 = i24 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i27 = i25;
                        if (rVar2.f(m0Var)) {
                        }
                        i28 = i315 | i35;
                        z2 = true;
                        if ((i16 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (rVar2.T(i16 & 1, z3)) {
                            rVar2.Y();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            } else {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            }
                            rVar2.q();
                            rVar2.b0(-565217106);
                            if (j11 != 16) {
                                rVar4 = rVar4;
                                i32 = i32;
                                jB = j11;
                            } else {
                                rVar2.b0(-565216333);
                                jB = m0Var3.b();
                                if (jB != 16) {
                                    jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                                }
                                rVar2.p(false);
                            }
                            rVar2.p(false);
                            int i316 = i28 << 6;
                            androidx.compose.ui.r rVar9 = rVar4;
                            int i317 = i32;
                            androidx.compose.foundation.text.n0.a(str, rVar9, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i317, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i316) | 196608 | (i316 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                            i29 = i317;
                            rVar3 = rVar9;
                            m0Var2 = m0Var3;
                            lVar3 = lVar2;
                            z4 = z2;
                            j10 = j12;
                            androidx.compose.ui.text.style.k kVar8 = kVar2;
                            i30 = i31;
                            long j17 = j5;
                            kVar3 = kVar8;
                            j7 = j6;
                            j8 = j17;
                            j9 = j11;
                        } else {
                            rVar2.W();
                            j7 = j6;
                            j8 = j5;
                            rVar3 = rVar;
                            j9 = j;
                            z4 = z;
                            i29 = i3;
                            m0Var2 = m0Var;
                            lVar3 = lVar2;
                            kVar3 = kVar2;
                            j10 = j3;
                            i30 = i;
                        }
                        q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(i4 | 1);
                                    int iA2 = androidx.compose.runtime.s.A(i5);
                                    p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i27 = i25;
                    i28 = i315 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i318 = i28 << 6;
                        androidx.compose.ui.r rVar10 = rVar4;
                        int i319 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar10, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i319, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i318) | 196608 | (i318 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i319;
                        rVar3 = rVar10;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar9 = kVar2;
                        i30 = i31;
                        long j18 = j5;
                        kVar3 = kVar9;
                        j7 = j6;
                        j8 = j18;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i24 = i19 | 27648;
                i26 = i2;
                int i3110 = i24 | 1769472;
                if ((i6 & 131072) == 0) {
                    i27 = i25;
                    if (rVar2.f(m0Var)) {
                    }
                    i28 = i3110 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i3111 = i28 << 6;
                        androidx.compose.ui.r rVar11 = rVar4;
                        int i3112 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar11, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111) | 196608 | (i3111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i3112;
                        rVar3 = rVar11;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar10 = kVar2;
                        i30 = i31;
                        long j19 = j5;
                        kVar3 = kVar10;
                        j7 = j6;
                        j8 = j19;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i27 = i25;
                i28 = i3110 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i3113 = i28 << 6;
                    androidx.compose.ui.r rVar12 = rVar4;
                    int i3114 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar12, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3113) | 196608 | (i3113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i3114;
                    rVar3 = rVar12;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar11 = kVar2;
                    i30 = i31;
                    long j110 = j5;
                    kVar3 = kVar11;
                    j7 = j6;
                    j8 = j110;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i13 = i10 | 1769472;
            lVar2 = lVar;
            i16 = i13 | 918552576;
            i17 = i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i17 != 0) {
                i19 = i5 | 6;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if (rVar2.f(kVar2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i19 = i18 | i5;
            }
            i20 = i6 & 2048;
            if (i20 != 0) {
                i19 |= 48;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i5 & 48) == 0) {
                    if (rVar2.e(j6)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i19 |= i21;
                }
            }
            i22 = i6 & 4096;
            if (i22 != 0) {
                if ((i5 & 384) == 0) {
                    if (rVar2.d(i)) {
                        i23 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i23 = 128;
                    }
                    i19 |= i23;
                }
                i24 = i19 | 3072;
                i25 = i6 & 16384;
                if (i25 != 0) {
                    if ((i5 & 24576) == 0) {
                        i26 = i2;
                        i24 |= rVar2.d(i26) ? 16384 : 8192;
                    }
                    int i3115 = i24 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i27 = i25;
                        if (rVar2.f(m0Var)) {
                        }
                        i28 = i3115 | i35;
                        z2 = true;
                        if ((i16 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (rVar2.T(i16 & 1, z3)) {
                            rVar2.Y();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            } else {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            }
                            rVar2.q();
                            rVar2.b0(-565217106);
                            if (j11 != 16) {
                                rVar4 = rVar4;
                                i32 = i32;
                                jB = j11;
                            } else {
                                rVar2.b0(-565216333);
                                jB = m0Var3.b();
                                if (jB != 16) {
                                    jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                                }
                                rVar2.p(false);
                            }
                            rVar2.p(false);
                            int i3116 = i28 << 6;
                            androidx.compose.ui.r rVar13 = rVar4;
                            int i3117 = i32;
                            androidx.compose.foundation.text.n0.a(str, rVar13, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3117, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3116) | 196608 | (i3116 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                            i29 = i3117;
                            rVar3 = rVar13;
                            m0Var2 = m0Var3;
                            lVar3 = lVar2;
                            z4 = z2;
                            j10 = j12;
                            androidx.compose.ui.text.style.k kVar12 = kVar2;
                            i30 = i31;
                            long j111 = j5;
                            kVar3 = kVar12;
                            j7 = j6;
                            j8 = j111;
                            j9 = j11;
                        } else {
                            rVar2.W();
                            j7 = j6;
                            j8 = j5;
                            rVar3 = rVar;
                            j9 = j;
                            z4 = z;
                            i29 = i3;
                            m0Var2 = m0Var;
                            lVar3 = lVar2;
                            kVar3 = kVar2;
                            j10 = j3;
                            i30 = i;
                        }
                        q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(i4 | 1);
                                    int iA2 = androidx.compose.runtime.s.A(i5);
                                    p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i27 = i25;
                    i28 = i3115 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i3118 = i28 << 6;
                        androidx.compose.ui.r rVar14 = rVar4;
                        int i3119 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar14, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3119, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3118) | 196608 | (i3118 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i3119;
                        rVar3 = rVar14;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar13 = kVar2;
                        i30 = i31;
                        long j112 = j5;
                        kVar3 = kVar13;
                        j7 = j6;
                        j8 = j112;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i24 = i19 | 27648;
                i26 = i2;
                int i31110 = i24 | 1769472;
                if ((i6 & 131072) == 0) {
                    i27 = i25;
                    if (rVar2.f(m0Var)) {
                    }
                    i28 = i31110 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i31111 = i28 << 6;
                        androidx.compose.ui.r rVar15 = rVar4;
                        int i31112 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar15, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31111) | 196608 | (i31111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i31112;
                        rVar3 = rVar15;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar14 = kVar2;
                        i30 = i31;
                        long j113 = j5;
                        kVar3 = kVar14;
                        j7 = j6;
                        j8 = j113;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i27 = i25;
                i28 = i31110 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i31113 = i28 << 6;
                    androidx.compose.ui.r rVar16 = rVar4;
                    int i31114 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar16, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31113) | 196608 | (i31113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i31114;
                    rVar3 = rVar16;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar15 = kVar2;
                    i30 = i31;
                    long j114 = j5;
                    kVar3 = kVar15;
                    j7 = j6;
                    j8 = j114;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i19 |= 384;
            i24 = i19 | 3072;
            i25 = i6 & 16384;
            if (i25 != 0) {
                if ((i5 & 24576) == 0) {
                    i26 = i2;
                    i24 |= rVar2.d(i26) ? 16384 : 8192;
                }
                int i31115 = i24 | 1769472;
                if ((i6 & 131072) == 0) {
                    i27 = i25;
                    if (rVar2.f(m0Var)) {
                    }
                    i28 = i31115 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i31116 = i28 << 6;
                        androidx.compose.ui.r rVar17 = rVar4;
                        int i31117 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar17, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31117, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31116) | 196608 | (i31116 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i31117;
                        rVar3 = rVar17;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar16 = kVar2;
                        i30 = i31;
                        long j115 = j5;
                        kVar3 = kVar16;
                        j7 = j6;
                        j8 = j115;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i27 = i25;
                i28 = i31115 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i31118 = i28 << 6;
                    androidx.compose.ui.r rVar18 = rVar4;
                    int i31119 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar18, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31119, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31118) | 196608 | (i31118 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i31119;
                    rVar3 = rVar18;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar17 = kVar2;
                    i30 = i31;
                    long j116 = j5;
                    kVar3 = kVar17;
                    j7 = j6;
                    j8 = j116;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i24 = i19 | 27648;
            i26 = i2;
            int i311110 = i24 | 1769472;
            if ((i6 & 131072) == 0) {
                i27 = i25;
                if (rVar2.f(m0Var)) {
                }
                i28 = i311110 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i311111 = i28 << 6;
                    androidx.compose.ui.r rVar19 = rVar4;
                    int i311112 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar19, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311111) | 196608 | (i311111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i311112;
                    rVar3 = rVar19;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar18 = kVar2;
                    i30 = i31;
                    long j117 = j5;
                    kVar3 = kVar18;
                    j7 = j6;
                    j8 = j117;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i27 = i25;
            i28 = i311110 | i35;
            z2 = true;
            if ((i16 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i16 & 1, z3)) {
                rVar2.Y();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                } else {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                }
                rVar2.q();
                rVar2.b0(-565217106);
                if (j11 != 16) {
                    rVar4 = rVar4;
                    i32 = i32;
                    jB = j11;
                } else {
                    rVar2.b0(-565216333);
                    jB = m0Var3.b();
                    if (jB != 16) {
                        jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    }
                    rVar2.p(false);
                }
                rVar2.p(false);
                int i311113 = i28 << 6;
                androidx.compose.ui.r rVar110 = rVar4;
                int i311114 = i32;
                androidx.compose.foundation.text.n0.a(str, rVar110, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311113) | 196608 | (i311113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                i29 = i311114;
                rVar3 = rVar110;
                m0Var2 = m0Var3;
                lVar3 = lVar2;
                z4 = z2;
                j10 = j12;
                androidx.compose.ui.text.style.k kVar19 = kVar2;
                i30 = i31;
                long j118 = j5;
                kVar3 = kVar19;
                j7 = j6;
                j8 = j118;
                j9 = j11;
            } else {
                rVar2.W();
                j7 = j6;
                j8 = j5;
                rVar3 = rVar;
                j9 = j;
                z4 = z;
                i29 = i3;
                m0Var2 = m0Var;
                lVar3 = lVar2;
                kVar3 = kVar2;
                j10 = j3;
                i30 = i;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i4 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i5);
                        p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 |= 48;
        i8 = i6 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            if (rVar2.e(j)) {
                i9 = LibretroCore.SCREEN_WIDTH;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        }
        i10 = i7 | 3072;
        i11 = i6 & 16;
        if (i11 != 0) {
            i10 = i7 | 27648;
            j5 = j2;
        } else {
            j5 = j2;
            if ((i4 & 24576) == 0) {
                if (rVar2.e(j5)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
        }
        i13 = i10 | 196608;
        i14 = i6 & 64;
        if (i14 != 0) {
            if ((1572864 & i4) == 0) {
                lVar2 = lVar;
                if (rVar2.f(lVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            i16 = i13 | 918552576;
            i17 = i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i17 != 0) {
                i19 = i5 | 6;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if (rVar2.f(kVar2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i19 = i18 | i5;
            }
            i20 = i6 & 2048;
            if (i20 != 0) {
                i19 |= 48;
                j6 = j4;
            } else {
                j6 = j4;
                if ((i5 & 48) == 0) {
                    if (rVar2.e(j6)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i19 |= i21;
                }
            }
            i22 = i6 & 4096;
            if (i22 != 0) {
                if ((i5 & 384) == 0) {
                    if (rVar2.d(i)) {
                        i23 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i23 = 128;
                    }
                    i19 |= i23;
                }
                i24 = i19 | 3072;
                i25 = i6 & 16384;
                if (i25 != 0) {
                    if ((i5 & 24576) == 0) {
                        i26 = i2;
                        i24 |= rVar2.d(i26) ? 16384 : 8192;
                    }
                    int i311115 = i24 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i27 = i25;
                        if (rVar2.f(m0Var)) {
                        }
                        i28 = i311115 | i35;
                        z2 = true;
                        if ((i16 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (rVar2.T(i16 & 1, z3)) {
                            rVar2.Y();
                            if ((i4 & 1) != 0) {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            } else {
                                if (i33 != 0) {
                                    rVar4 = androidx.compose.ui.o.b;
                                } else {
                                    rVar4 = rVar;
                                }
                                if (i8 != 0) {
                                    j11 = androidx.compose.ui.graphics.t.i;
                                } else {
                                    j11 = j;
                                }
                                if (i11 != 0) {
                                    j5 = androidx.compose.ui.unit.o.c;
                                }
                                if (i14 != 0) {
                                    lVar2 = null;
                                }
                                j12 = androidx.compose.ui.unit.o.c;
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if (i20 != 0) {
                                    j6 = j12;
                                }
                                if (i22 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i27 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                    i28 &= -29360129;
                                } else {
                                    m0Var3 = m0Var;
                                }
                                i32 = 1;
                            }
                            rVar2.q();
                            rVar2.b0(-565217106);
                            if (j11 != 16) {
                                rVar4 = rVar4;
                                i32 = i32;
                                jB = j11;
                            } else {
                                rVar2.b0(-565216333);
                                jB = m0Var3.b();
                                if (jB != 16) {
                                    jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                                }
                                rVar2.p(false);
                            }
                            rVar2.p(false);
                            int i311116 = i28 << 6;
                            androidx.compose.ui.r rVar111 = rVar4;
                            int i311117 = i32;
                            androidx.compose.foundation.text.n0.a(str, rVar111, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311117, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311116) | 196608 | (i311116 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                            i29 = i311117;
                            rVar3 = rVar111;
                            m0Var2 = m0Var3;
                            lVar3 = lVar2;
                            z4 = z2;
                            j10 = j12;
                            androidx.compose.ui.text.style.k kVar110 = kVar2;
                            i30 = i31;
                            long j119 = j5;
                            kVar3 = kVar110;
                            j7 = j6;
                            j8 = j119;
                            j9 = j11;
                        } else {
                            rVar2.W();
                            j7 = j6;
                            j8 = j5;
                            rVar3 = rVar;
                            j9 = j;
                            z4 = z;
                            i29 = i3;
                            m0Var2 = m0Var;
                            lVar3 = lVar2;
                            kVar3 = kVar2;
                            j10 = j3;
                            i30 = i;
                        }
                        q1VarT = rVar2.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(i4 | 1);
                                    int iA2 = androidx.compose.runtime.s.A(i5);
                                    p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i27 = i25;
                    i28 = i311115 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i311118 = i28 << 6;
                        androidx.compose.ui.r rVar112 = rVar4;
                        int i311119 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar112, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311119, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311118) | 196608 | (i311118 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i311119;
                        rVar3 = rVar112;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar111 = kVar2;
                        i30 = i31;
                        long j1110 = j5;
                        kVar3 = kVar111;
                        j7 = j6;
                        j8 = j1110;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i24 = i19 | 27648;
                i26 = i2;
                int i3111110 = i24 | 1769472;
                if ((i6 & 131072) == 0) {
                    i27 = i25;
                    if (rVar2.f(m0Var)) {
                    }
                    i28 = i3111110 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i3111111 = i28 << 6;
                        androidx.compose.ui.r rVar113 = rVar4;
                        int i3111112 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar113, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3111112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111111) | 196608 | (i3111111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i3111112;
                        rVar3 = rVar113;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar112 = kVar2;
                        i30 = i31;
                        long j1111 = j5;
                        kVar3 = kVar112;
                        j7 = j6;
                        j8 = j1111;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i27 = i25;
                i28 = i3111110 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i3111113 = i28 << 6;
                    androidx.compose.ui.r rVar114 = rVar4;
                    int i3111114 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar114, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3111114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111113) | 196608 | (i3111113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i3111114;
                    rVar3 = rVar114;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar113 = kVar2;
                    i30 = i31;
                    long j1112 = j5;
                    kVar3 = kVar113;
                    j7 = j6;
                    j8 = j1112;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i19 |= 384;
            i24 = i19 | 3072;
            i25 = i6 & 16384;
            if (i25 != 0) {
                if ((i5 & 24576) == 0) {
                    i26 = i2;
                    i24 |= rVar2.d(i26) ? 16384 : 8192;
                }
                int i3111115 = i24 | 1769472;
                if ((i6 & 131072) == 0) {
                    i27 = i25;
                    if (rVar2.f(m0Var)) {
                    }
                    i28 = i3111115 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i3111116 = i28 << 6;
                        androidx.compose.ui.r rVar115 = rVar4;
                        int i3111117 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar115, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3111117, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111116) | 196608 | (i3111116 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i3111117;
                        rVar3 = rVar115;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar114 = kVar2;
                        i30 = i31;
                        long j1113 = j5;
                        kVar3 = kVar114;
                        j7 = j6;
                        j8 = j1113;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i27 = i25;
                i28 = i3111115 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i3111118 = i28 << 6;
                    androidx.compose.ui.r rVar116 = rVar4;
                    int i3111119 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar116, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3111119, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111118) | 196608 | (i3111118 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i3111119;
                    rVar3 = rVar116;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar115 = kVar2;
                    i30 = i31;
                    long j1114 = j5;
                    kVar3 = kVar115;
                    j7 = j6;
                    j8 = j1114;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i24 = i19 | 27648;
            i26 = i2;
            int i31111110 = i24 | 1769472;
            if ((i6 & 131072) == 0) {
                i27 = i25;
                if (rVar2.f(m0Var)) {
                }
                i28 = i31111110 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i31111111 = i28 << 6;
                    androidx.compose.ui.r rVar117 = rVar4;
                    int i31111112 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar117, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31111112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31111111) | 196608 | (i31111111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i31111112;
                    rVar3 = rVar117;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar116 = kVar2;
                    i30 = i31;
                    long j1115 = j5;
                    kVar3 = kVar116;
                    j7 = j6;
                    j8 = j1115;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i27 = i25;
            i28 = i31111110 | i35;
            z2 = true;
            if ((i16 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i16 & 1, z3)) {
                rVar2.Y();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                } else {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                }
                rVar2.q();
                rVar2.b0(-565217106);
                if (j11 != 16) {
                    rVar4 = rVar4;
                    i32 = i32;
                    jB = j11;
                } else {
                    rVar2.b0(-565216333);
                    jB = m0Var3.b();
                    if (jB != 16) {
                        jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    }
                    rVar2.p(false);
                }
                rVar2.p(false);
                int i31111113 = i28 << 6;
                androidx.compose.ui.r rVar118 = rVar4;
                int i31111114 = i32;
                androidx.compose.foundation.text.n0.a(str, rVar118, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31111114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31111113) | 196608 | (i31111113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                i29 = i31111114;
                rVar3 = rVar118;
                m0Var2 = m0Var3;
                lVar3 = lVar2;
                z4 = z2;
                j10 = j12;
                androidx.compose.ui.text.style.k kVar117 = kVar2;
                i30 = i31;
                long j1116 = j5;
                kVar3 = kVar117;
                j7 = j6;
                j8 = j1116;
                j9 = j11;
            } else {
                rVar2.W();
                j7 = j6;
                j8 = j5;
                rVar3 = rVar;
                j9 = j;
                z4 = z;
                i29 = i3;
                m0Var2 = m0Var;
                lVar3 = lVar2;
                kVar3 = kVar2;
                j10 = j3;
                i30 = i;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i4 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i5);
                        p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i13 = i10 | 1769472;
        lVar2 = lVar;
        i16 = i13 | 918552576;
        i17 = i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i17 != 0) {
            i19 = i5 | 6;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if (rVar2.f(kVar2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i19 = i18 | i5;
        }
        i20 = i6 & 2048;
        if (i20 != 0) {
            i19 |= 48;
            j6 = j4;
        } else {
            j6 = j4;
            if ((i5 & 48) == 0) {
                if (rVar2.e(j6)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i19 |= i21;
            }
        }
        i22 = i6 & 4096;
        if (i22 != 0) {
            if ((i5 & 384) == 0) {
                if (rVar2.d(i)) {
                    i23 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i23 = 128;
                }
                i19 |= i23;
            }
            i24 = i19 | 3072;
            i25 = i6 & 16384;
            if (i25 != 0) {
                if ((i5 & 24576) == 0) {
                    i26 = i2;
                    i24 |= rVar2.d(i26) ? 16384 : 8192;
                }
                int i31111115 = i24 | 1769472;
                if ((i6 & 131072) == 0) {
                    i27 = i25;
                    if (rVar2.f(m0Var)) {
                    }
                    i28 = i31111115 | i35;
                    z2 = true;
                    if ((i16 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (rVar2.T(i16 & 1, z3)) {
                        rVar2.Y();
                        if ((i4 & 1) != 0) {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        } else {
                            if (i33 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar;
                            }
                            if (i8 != 0) {
                                j11 = androidx.compose.ui.graphics.t.i;
                            } else {
                                j11 = j;
                            }
                            if (i11 != 0) {
                                j5 = androidx.compose.ui.unit.o.c;
                            }
                            if (i14 != 0) {
                                lVar2 = null;
                            }
                            j12 = androidx.compose.ui.unit.o.c;
                            if (i17 != 0) {
                                kVar2 = null;
                            }
                            if (i20 != 0) {
                                j6 = j12;
                            }
                            if (i22 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i27 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                                i28 &= -29360129;
                            } else {
                                m0Var3 = m0Var;
                            }
                            i32 = 1;
                        }
                        rVar2.q();
                        rVar2.b0(-565217106);
                        if (j11 != 16) {
                            rVar4 = rVar4;
                            i32 = i32;
                            jB = j11;
                        } else {
                            rVar2.b0(-565216333);
                            jB = m0Var3.b();
                            if (jB != 16) {
                                jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            }
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        int i31111116 = i28 << 6;
                        androidx.compose.ui.r rVar119 = rVar4;
                        int i31111117 = i32;
                        androidx.compose.foundation.text.n0.a(str, rVar119, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31111117, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31111116) | 196608 | (i31111116 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                        i29 = i31111117;
                        rVar3 = rVar119;
                        m0Var2 = m0Var3;
                        lVar3 = lVar2;
                        z4 = z2;
                        j10 = j12;
                        androidx.compose.ui.text.style.k kVar118 = kVar2;
                        i30 = i31;
                        long j1117 = j5;
                        kVar3 = kVar118;
                        j7 = j6;
                        j8 = j1117;
                        j9 = j11;
                    } else {
                        rVar2.W();
                        j7 = j6;
                        j8 = j5;
                        rVar3 = rVar;
                        j9 = j;
                        z4 = z;
                        i29 = i3;
                        m0Var2 = m0Var;
                        lVar3 = lVar2;
                        kVar3 = kVar2;
                        j10 = j3;
                        i30 = i;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i4 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i5);
                                p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i27 = i25;
                i28 = i31111115 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i31111118 = i28 << 6;
                    androidx.compose.ui.r rVar1110 = rVar4;
                    int i31111119 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar1110, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i31111119, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i31111118) | 196608 | (i31111118 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i31111119;
                    rVar3 = rVar1110;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar119 = kVar2;
                    i30 = i31;
                    long j1118 = j5;
                    kVar3 = kVar119;
                    j7 = j6;
                    j8 = j1118;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i24 = i19 | 27648;
            i26 = i2;
            int i311111110 = i24 | 1769472;
            if ((i6 & 131072) == 0) {
                i27 = i25;
                if (rVar2.f(m0Var)) {
                }
                i28 = i311111110 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i311111111 = i28 << 6;
                    androidx.compose.ui.r rVar1111 = rVar4;
                    int i311111112 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar1111, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311111112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311111111) | 196608 | (i311111111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i311111112;
                    rVar3 = rVar1111;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar1110 = kVar2;
                    i30 = i31;
                    long j1119 = j5;
                    kVar3 = kVar1110;
                    j7 = j6;
                    j8 = j1119;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i27 = i25;
            i28 = i311111110 | i35;
            z2 = true;
            if ((i16 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i16 & 1, z3)) {
                rVar2.Y();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                } else {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                }
                rVar2.q();
                rVar2.b0(-565217106);
                if (j11 != 16) {
                    rVar4 = rVar4;
                    i32 = i32;
                    jB = j11;
                } else {
                    rVar2.b0(-565216333);
                    jB = m0Var3.b();
                    if (jB != 16) {
                        jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    }
                    rVar2.p(false);
                }
                rVar2.p(false);
                int i311111113 = i28 << 6;
                androidx.compose.ui.r rVar1112 = rVar4;
                int i311111114 = i32;
                androidx.compose.foundation.text.n0.a(str, rVar1112, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311111114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311111113) | 196608 | (i311111113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                i29 = i311111114;
                rVar3 = rVar1112;
                m0Var2 = m0Var3;
                lVar3 = lVar2;
                z4 = z2;
                j10 = j12;
                androidx.compose.ui.text.style.k kVar1111 = kVar2;
                i30 = i31;
                long j11110 = j5;
                kVar3 = kVar1111;
                j7 = j6;
                j8 = j11110;
                j9 = j11;
            } else {
                rVar2.W();
                j7 = j6;
                j8 = j5;
                rVar3 = rVar;
                j9 = j;
                z4 = z;
                i29 = i3;
                m0Var2 = m0Var;
                lVar3 = lVar2;
                kVar3 = kVar2;
                j10 = j3;
                i30 = i;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i4 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i5);
                        p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i19 |= 384;
        i24 = i19 | 3072;
        i25 = i6 & 16384;
        if (i25 != 0) {
            if ((i5 & 24576) == 0) {
                i26 = i2;
                i24 |= rVar2.d(i26) ? 16384 : 8192;
            }
            int i311111115 = i24 | 1769472;
            if ((i6 & 131072) == 0) {
                i27 = i25;
                if (rVar2.f(m0Var)) {
                }
                i28 = i311111115 | i35;
                z2 = true;
                if ((i16 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (rVar2.T(i16 & 1, z3)) {
                    rVar2.Y();
                    if ((i4 & 1) != 0) {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    } else {
                        if (i33 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar;
                        }
                        if (i8 != 0) {
                            j11 = androidx.compose.ui.graphics.t.i;
                        } else {
                            j11 = j;
                        }
                        if (i11 != 0) {
                            j5 = androidx.compose.ui.unit.o.c;
                        }
                        if (i14 != 0) {
                            lVar2 = null;
                        }
                        j12 = androidx.compose.ui.unit.o.c;
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if (i20 != 0) {
                            j6 = j12;
                        }
                        if (i22 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i27 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                            i28 &= -29360129;
                        } else {
                            m0Var3 = m0Var;
                        }
                        i32 = 1;
                    }
                    rVar2.q();
                    rVar2.b0(-565217106);
                    if (j11 != 16) {
                        rVar4 = rVar4;
                        i32 = i32;
                        jB = j11;
                    } else {
                        rVar2.b0(-565216333);
                        jB = m0Var3.b();
                        if (jB != 16) {
                            jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        }
                        rVar2.p(false);
                    }
                    rVar2.p(false);
                    int i311111116 = i28 << 6;
                    androidx.compose.ui.r rVar1113 = rVar4;
                    int i311111117 = i32;
                    androidx.compose.foundation.text.n0.a(str, rVar1113, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311111117, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311111116) | 196608 | (i311111116 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                    i29 = i311111117;
                    rVar3 = rVar1113;
                    m0Var2 = m0Var3;
                    lVar3 = lVar2;
                    z4 = z2;
                    j10 = j12;
                    androidx.compose.ui.text.style.k kVar1112 = kVar2;
                    i30 = i31;
                    long j11111 = j5;
                    kVar3 = kVar1112;
                    j7 = j6;
                    j8 = j11111;
                    j9 = j11;
                } else {
                    rVar2.W();
                    j7 = j6;
                    j8 = j5;
                    rVar3 = rVar;
                    j9 = j;
                    z4 = z;
                    i29 = i3;
                    m0Var2 = m0Var;
                    lVar3 = lVar2;
                    kVar3 = kVar2;
                    j10 = j3;
                    i30 = i;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i4 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i5);
                            p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i27 = i25;
            i28 = i311111115 | i35;
            z2 = true;
            if ((i16 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i16 & 1, z3)) {
                rVar2.Y();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                } else {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                }
                rVar2.q();
                rVar2.b0(-565217106);
                if (j11 != 16) {
                    rVar4 = rVar4;
                    i32 = i32;
                    jB = j11;
                } else {
                    rVar2.b0(-565216333);
                    jB = m0Var3.b();
                    if (jB != 16) {
                        jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    }
                    rVar2.p(false);
                }
                rVar2.p(false);
                int i311111118 = i28 << 6;
                androidx.compose.ui.r rVar1114 = rVar4;
                int i311111119 = i32;
                androidx.compose.foundation.text.n0.a(str, rVar1114, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i311111119, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i311111118) | 196608 | (i311111118 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                i29 = i311111119;
                rVar3 = rVar1114;
                m0Var2 = m0Var3;
                lVar3 = lVar2;
                z4 = z2;
                j10 = j12;
                androidx.compose.ui.text.style.k kVar1113 = kVar2;
                i30 = i31;
                long j11112 = j5;
                kVar3 = kVar1113;
                j7 = j6;
                j8 = j11112;
                j9 = j11;
            } else {
                rVar2.W();
                j7 = j6;
                j8 = j5;
                rVar3 = rVar;
                j9 = j;
                z4 = z;
                i29 = i3;
                m0Var2 = m0Var;
                lVar3 = lVar2;
                kVar3 = kVar2;
                j10 = j3;
                i30 = i;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i4 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i5);
                        p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i24 = i19 | 27648;
        i26 = i2;
        int i3111111110 = i24 | 1769472;
        if ((i6 & 131072) == 0) {
            i27 = i25;
            if (rVar2.f(m0Var)) {
            }
            i28 = i3111111110 | i35;
            z2 = true;
            if ((i16 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (rVar2.T(i16 & 1, z3)) {
                rVar2.Y();
                if ((i4 & 1) != 0) {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                } else {
                    if (i33 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar;
                    }
                    if (i8 != 0) {
                        j11 = androidx.compose.ui.graphics.t.i;
                    } else {
                        j11 = j;
                    }
                    if (i11 != 0) {
                        j5 = androidx.compose.ui.unit.o.c;
                    }
                    if (i14 != 0) {
                        lVar2 = null;
                    }
                    j12 = androidx.compose.ui.unit.o.c;
                    if (i17 != 0) {
                        kVar2 = null;
                    }
                    if (i20 != 0) {
                        j6 = j12;
                    }
                    if (i22 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i27 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                        i28 &= -29360129;
                    } else {
                        m0Var3 = m0Var;
                    }
                    i32 = 1;
                }
                rVar2.q();
                rVar2.b0(-565217106);
                if (j11 != 16) {
                    rVar4 = rVar4;
                    i32 = i32;
                    jB = j11;
                } else {
                    rVar2.b0(-565216333);
                    jB = m0Var3.b();
                    if (jB != 16) {
                        jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    }
                    rVar2.p(false);
                }
                rVar2.p(false);
                int i3111111111 = i28 << 6;
                androidx.compose.ui.r rVar1115 = rVar4;
                int i3111111112 = i32;
                androidx.compose.foundation.text.n0.a(str, rVar1115, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3111111112, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111111111) | 196608 | (i3111111111 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
                i29 = i3111111112;
                rVar3 = rVar1115;
                m0Var2 = m0Var3;
                lVar3 = lVar2;
                z4 = z2;
                j10 = j12;
                androidx.compose.ui.text.style.k kVar1114 = kVar2;
                i30 = i31;
                long j11113 = j5;
                kVar3 = kVar1114;
                j7 = j6;
                j8 = j11113;
                j9 = j11;
            } else {
                rVar2.W();
                j7 = j6;
                j8 = j5;
                rVar3 = rVar;
                j9 = j;
                z4 = z;
                i29 = i3;
                m0Var2 = m0Var;
                lVar3 = lVar2;
                kVar3 = kVar2;
                j10 = j3;
                i30 = i;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i4 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i5);
                        p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i27 = i25;
        i28 = i3111111110 | i35;
        z2 = true;
        if ((i16 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (rVar2.T(i16 & 1, z3)) {
            rVar2.Y();
            if ((i4 & 1) != 0) {
                if (i33 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar;
                }
                if (i8 != 0) {
                    j11 = androidx.compose.ui.graphics.t.i;
                } else {
                    j11 = j;
                }
                if (i11 != 0) {
                    j5 = androidx.compose.ui.unit.o.c;
                }
                if (i14 != 0) {
                    lVar2 = null;
                }
                j12 = androidx.compose.ui.unit.o.c;
                if (i17 != 0) {
                    kVar2 = null;
                }
                if (i20 != 0) {
                    j6 = j12;
                }
                if (i22 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i27 != 0) {
                    i26 = Integer.MAX_VALUE;
                }
                if ((i6 & 131072) != 0) {
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                    i28 &= -29360129;
                } else {
                    m0Var3 = m0Var;
                }
                i32 = 1;
            } else {
                if (i33 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar;
                }
                if (i8 != 0) {
                    j11 = androidx.compose.ui.graphics.t.i;
                } else {
                    j11 = j;
                }
                if (i11 != 0) {
                    j5 = androidx.compose.ui.unit.o.c;
                }
                if (i14 != 0) {
                    lVar2 = null;
                }
                j12 = androidx.compose.ui.unit.o.c;
                if (i17 != 0) {
                    kVar2 = null;
                }
                if (i20 != 0) {
                    j6 = j12;
                }
                if (i22 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i27 != 0) {
                    i26 = Integer.MAX_VALUE;
                }
                if ((i6 & 131072) != 0) {
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(a);
                    i28 &= -29360129;
                } else {
                    m0Var3 = m0Var;
                }
                i32 = 1;
            }
            rVar2.q();
            rVar2.b0(-565217106);
            if (j11 != 16) {
                rVar4 = rVar4;
                i32 = i32;
                jB = j11;
            } else {
                rVar2.b0(-565216333);
                jB = m0Var3.b();
                if (jB != 16) {
                    jB = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                }
                rVar2.p(false);
            }
            rVar2.p(false);
            int i3111111113 = i28 << 6;
            androidx.compose.ui.r rVar1116 = rVar4;
            int i3111111114 = i32;
            androidx.compose.foundation.text.n0.a(str, rVar1116, androidx.compose.ui.text.m0.e(m0Var3, jB, j5, lVar2, j12, kVar2 != null ? kVar2.a : 0, j6, 16609104), i31, z2, i26, i3111111114, rVar2, (i16 & Token.ELSE) | 3072 | (57344 & i3111111113) | 196608 | (i3111111113 & 3670016) | 12582912 | ((i16 << 18) & 1879048192), LibretroCore.SCREEN_WIDTH);
            i29 = i3111111114;
            rVar3 = rVar1116;
            m0Var2 = m0Var3;
            lVar3 = lVar2;
            z4 = z2;
            j10 = j12;
            androidx.compose.ui.text.style.k kVar1115 = kVar2;
            i30 = i31;
            long j11114 = j5;
            kVar3 = kVar1115;
            j7 = j6;
            j8 = j11114;
            j9 = j11;
        } else {
            rVar2.W();
            j7 = j6;
            j8 = j5;
            rVar3 = rVar;
            j9 = j;
            z4 = z;
            i29 = i3;
            m0Var2 = m0Var;
            lVar3 = lVar2;
            kVar3 = kVar2;
            j10 = j3;
            i30 = i;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(i4 | 1);
                    int iA2 = androidx.compose.runtime.s.A(i5);
                    p3.b(str, rVar3, j9, j8, lVar3, j10, kVar3, j7, i30, z4, i26, i29, m0Var2, (androidx.compose.runtime.r) obj, iA, iA2, i6);
                    return kotlin.y.a;
                }
            };
        }
    }
}
