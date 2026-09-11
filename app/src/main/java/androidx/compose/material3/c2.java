package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final float a = 4;

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0150  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:109:0x015f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0172  */
    /* JADX WARN: Code duplicated, block: B:118:0x0178  */
    /* JADX WARN: Code duplicated, block: B:122:0x0180  */
    /* JADX WARN: Code duplicated, block: B:125:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:162:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x020f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0213  */
    /* JADX WARN: Code duplicated, block: B:168:0x021f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0222  */
    /* JADX WARN: Code duplicated, block: B:171:0x0224  */
    /* JADX WARN: Code duplicated, block: B:173:0x0228  */
    /* JADX WARN: Code duplicated, block: B:174:0x022a  */
    /* JADX WARN: Code duplicated, block: B:176:0x022e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0231  */
    /* JADX WARN: Code duplicated, block: B:179:0x0235  */
    /* JADX WARN: Code duplicated, block: B:180:0x0238  */
    /* JADX WARN: Code duplicated, block: B:182:0x023c  */
    /* JADX WARN: Code duplicated, block: B:183:0x023f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0243  */
    /* JADX WARN: Code duplicated, block: B:186:0x0246  */
    /* JADX WARN: Code duplicated, block: B:189:0x024c  */
    /* JADX WARN: Code duplicated, block: B:193:0x026b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0279  */
    /* JADX WARN: Code duplicated, block: B:197:0x0285  */
    /* JADX WARN: Code duplicated, block: B:201:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:203:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02be  */
    /* JADX WARN: Code duplicated, block: B:211:0x031f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0340  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    public static final void a(final String str, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.r rVar, boolean z, boolean z2, androidx.compose.ui.text.m0 m0Var, final kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, androidx.compose.ui.text.input.g0 g0Var, androidx.compose.foundation.text.q0 q0Var, androidx.compose.foundation.text.p0 p0Var, final boolean z3, int i, int i2, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.n0 n0Var, final k3 k3Var, androidx.compose.runtime.r rVar2, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        int i10;
        kotlin.jvm.functions.p pVar5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z6;
        androidx.compose.runtime.r rVar3;
        final kotlin.jvm.functions.p pVar6;
        final kotlin.jvm.functions.p pVar7;
        final androidx.compose.ui.text.input.g0 g0Var2;
        final androidx.compose.foundation.text.q0 q0Var2;
        final androidx.compose.foundation.text.p0 p0Var2;
        final int i27;
        final int i28;
        final androidx.compose.foundation.interaction.k kVar2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final boolean z7;
        final kotlin.jvm.functions.p pVar8;
        final androidx.compose.ui.text.m0 m0Var2;
        final boolean z8;
        androidx.compose.runtime.q1 q1VarT;
        androidx.compose.ui.text.m0 m0Var3;
        kotlin.jvm.functions.p pVar9;
        kotlin.jvm.functions.p pVar10;
        androidx.compose.ui.text.input.g0 g0Var3;
        androidx.compose.foundation.text.q0 q0Var3;
        androidx.compose.foundation.text.p0 p0Var3;
        int i29;
        androidx.compose.ui.graphics.n0 n0VarA;
        androidx.compose.foundation.text.q0 q0Var4;
        androidx.compose.foundation.text.p0 p0Var4;
        int i30;
        kotlin.jvm.functions.p pVar11;
        kotlin.jvm.functions.p pVar12;
        androidx.compose.ui.text.input.g0 g0Var4;
        int i31;
        androidx.compose.foundation.interaction.k kVar3;
        boolean z9;
        androidx.compose.foundation.interaction.k kVar4;
        long jB;
        boolean zBooleanValue;
        long j;
        Object objQ;
        int i32;
        rVar2.c0(1901501544);
        if ((i3 & 6) == 0) {
            i7 = (rVar2.f(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= rVar2.h(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= rVar2.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i33 = i6 & 8;
        if (i33 == 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                i7 |= rVar2.g(z4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i8 = i6 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (rVar2.g(z5)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i7 |= i9;
                }
                if ((i3 & 196608) == 0) {
                    i7 |= Parser.ARGC_LIMIT;
                }
                if ((i3 & 1572864) != 0) {
                    if (rVar2.h(pVar)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i7 |= i32;
                }
                i10 = i6 & 128;
                if (i10 != 0) {
                    i7 |= 12582912;
                    pVar5 = pVar2;
                } else {
                    pVar5 = pVar2;
                    if ((i3 & 12582912) == 0) {
                        if (rVar2.h(pVar5)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i7 |= i11;
                    }
                }
                i12 = i6 & LibretroCore.SCREEN_WIDTH;
                if (i12 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (rVar2.h(pVar3)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                        if ((i3 & 805306368) == 0) {
                            if (rVar2.h(pVar4)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i7 |= i15;
                        }
                        i16 = i4 | 3510;
                        i17 = i6 & 16384;
                        if (i17 != 0) {
                            i18 = i17;
                            i19 = i4 | 28086;
                        } else {
                            i18 = i17;
                            if ((i4 & 24576) == 0) {
                                i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                            } else {
                                i19 = i16;
                            }
                        }
                        i20 = i6 & 32768;
                        if (i20 != 0) {
                            i19 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            if (rVar2.f(q0Var)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i19 |= i21;
                        }
                        i22 = i6 & Parser.ARGC_LIMIT;
                        if (i22 != 0) {
                            i19 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                        }
                        if ((i4 & 12582912) == 0) {
                            i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                        }
                        if ((i4 & 100663296) == 0) {
                            i19 |= 33554432;
                        }
                        int i34 = i19 | 805306368;
                        i23 = i6 & 1048576;
                        if (i23 != 0) {
                            i24 = 6;
                        } else if ((i5 & 6) == 0) {
                            if (rVar2.f(kVar)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i5 | i25;
                        } else {
                            i24 = i5;
                        }
                        int i35 = i24 | 16;
                        if (rVar2.f(k3Var)) {
                            i26 = LibretroCore.SCREEN_WIDTH;
                        } else {
                            i26 = 128;
                        }
                        int i36 = i35 | i26;
                        if ((i7 & 306783379) != 306783378 && (i34 & 306783379) == 306783378 && (i36 & Token.EXPR_VOID) == 146) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (rVar2.T(i7 & 1, z6)) {
                            rVar2.Y();
                            if ((i3 & 1) != 0 || rVar2.C()) {
                                if (i33 != 0) {
                                    z4 = true;
                                }
                                if (i8 != 0) {
                                    z5 = false;
                                }
                                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                                if (i10 != 0) {
                                    pVar5 = null;
                                }
                                if (i12 != 0) {
                                    pVar9 = null;
                                } else {
                                    pVar9 = pVar3;
                                }
                                if (i14 != 0) {
                                    pVar10 = null;
                                } else {
                                    pVar10 = pVar4;
                                }
                                if (i18 != 0) {
                                    g0Var3 = androidx.compose.ui.text.input.f0.e;
                                } else {
                                    g0Var3 = g0Var;
                                }
                                if (i20 != 0) {
                                    q0Var3 = androidx.compose.foundation.text.q0.c;
                                } else {
                                    q0Var3 = q0Var;
                                }
                                if (i22 != 0) {
                                    p0Var3 = androidx.compose.foundation.text.p0.b;
                                } else {
                                    p0Var3 = p0Var;
                                }
                                if (z3) {
                                    i29 = 1;
                                } else {
                                    i29 = Integer.MAX_VALUE;
                                }
                                androidx.compose.foundation.interaction.k kVar5 = i23 == 0 ? kVar : null;
                                w1 w1Var = w1.a;
                                n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                                q0Var4 = q0Var3;
                                p0Var4 = p0Var3;
                                i30 = i29;
                                pVar11 = pVar9;
                                pVar12 = pVar5;
                                g0Var4 = g0Var3;
                                i31 = 1;
                                kVar3 = kVar5;
                            } else {
                                rVar2.W();
                                m0Var3 = m0Var;
                                pVar11 = pVar3;
                                pVar10 = pVar4;
                                q0Var4 = q0Var;
                                p0Var4 = p0Var;
                                i30 = i;
                                i31 = i2;
                                kVar3 = kVar;
                                n0VarA = n0Var;
                                pVar12 = pVar5;
                                g0Var4 = g0Var;
                            }
                            rVar2.q();
                            if (kVar3 == null) {
                                rVar2.b0(1310051731);
                                objQ = rVar2.Q();
                                if (objQ == androidx.compose.runtime.m.a) {
                                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                                }
                                z9 = false;
                                rVar2.p(false);
                                kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                            } else {
                                z9 = false;
                                rVar2.b0(1981921732);
                                rVar2.p(false);
                                kVar4 = kVar3;
                            }
                            rVar2.b0(1981927842);
                            jB = m0Var3.b();
                            if (jB == 16) {
                                zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                                if (!z4) {
                                    j = k3Var.c;
                                } else if (zBooleanValue) {
                                    j = k3Var.a;
                                } else {
                                    j = k3Var.b;
                                }
                                jB = j;
                                z9 = false;
                            }
                            long j2 = jB;
                            rVar2.p(z9);
                            androidx.compose.ui.text.m0 m0VarD = m0Var3.d(new androidx.compose.ui.text.m0(j2, 0L, null, 0L, 0, 0L, 16777214));
                            androidx.appcompat.widget.r rVarA = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                            kotlin.jvm.functions.p pVar13 = pVar10;
                            b2 b2Var = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar13, n0VarA);
                            rVar3 = rVar2;
                            androidx.compose.runtime.s.a(rVarA, androidx.compose.runtime.internal.k.c(1874034984, b2Var, rVar3), rVar3, 56);
                            z7 = z4;
                            i27 = i30;
                            g0Var2 = g0Var4;
                            pVar8 = pVar12;
                            m0Var2 = m0Var3;
                            q0Var2 = q0Var4;
                            i28 = i31;
                            pVar6 = pVar11;
                            kVar2 = kVar3;
                            p0Var2 = p0Var4;
                            pVar7 = pVar13;
                            n0Var2 = n0VarA;
                        } else {
                            rVar3 = rVar2;
                            rVar3.W();
                            pVar6 = pVar3;
                            pVar7 = pVar4;
                            g0Var2 = g0Var;
                            q0Var2 = q0Var;
                            p0Var2 = p0Var;
                            i27 = i;
                            i28 = i2;
                            kVar2 = kVar;
                            n0Var2 = n0Var;
                            z7 = z4;
                            pVar8 = pVar5;
                            m0Var2 = m0Var;
                        }
                        z8 = z5;
                        q1VarT = rVar3.t();
                        if (q1VarT != null) {
                            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(i3 | 1);
                                    int iA2 = androidx.compose.runtime.s.A(i4);
                                    int iA3 = androidx.compose.runtime.s.A(i5);
                                    c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i7 |= 805306368;
                    i16 = i4 | 3510;
                    i17 = i6 & 16384;
                    if (i17 != 0) {
                        i18 = i17;
                        i19 = i4 | 28086;
                    } else {
                        i18 = i17;
                        if ((i4 & 24576) == 0) {
                            i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                        } else {
                            i19 = i16;
                        }
                    }
                    i20 = i6 & 32768;
                    if (i20 != 0) {
                        i19 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (rVar2.f(q0Var)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i19 |= i21;
                    }
                    i22 = i6 & Parser.ARGC_LIMIT;
                    if (i22 != 0) {
                        i19 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                    }
                    if ((i4 & 12582912) == 0) {
                        i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        i19 |= 33554432;
                    }
                    int i37 = i19 | 805306368;
                    i23 = i6 & 1048576;
                    if (i23 != 0) {
                        i24 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (rVar2.f(kVar)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    int i38 = i24 | 16;
                    if (rVar2.f(k3Var)) {
                        i26 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i26 = 128;
                    }
                    int i39 = i38 | i26;
                    if ((i7 & 306783379) != 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (rVar2.T(i7 & 1, z6)) {
                        rVar2.Y();
                        if ((i3 & 1) != 0) {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var2 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        } else {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var3 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        }
                        rVar2.q();
                        if (kVar3 == null) {
                            rVar2.b0(1310051731);
                            objQ = rVar2.Q();
                            if (objQ == androidx.compose.runtime.m.a) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            z9 = false;
                            rVar2.p(false);
                            kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                        } else {
                            z9 = false;
                            rVar2.b0(1981921732);
                            rVar2.p(false);
                            kVar4 = kVar3;
                        }
                        rVar2.b0(1981927842);
                        jB = m0Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                            if (!z4) {
                                j = k3Var.c;
                            } else if (zBooleanValue) {
                                j = k3Var.a;
                            } else {
                                j = k3Var.b;
                            }
                            jB = j;
                            z9 = false;
                        }
                        long j3 = jB;
                        rVar2.p(z9);
                        androidx.compose.ui.text.m0 m0VarD2 = m0Var3.d(new androidx.compose.ui.text.m0(j3, 0L, null, 0L, 0, 0L, 16777214));
                        androidx.appcompat.widget.r rVarA2 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                        kotlin.jvm.functions.p pVar14 = pVar10;
                        b2 b2Var2 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD2, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar14, n0VarA);
                        rVar3 = rVar2;
                        androidx.compose.runtime.s.a(rVarA2, androidx.compose.runtime.internal.k.c(1874034984, b2Var2, rVar3), rVar3, 56);
                        z7 = z4;
                        i27 = i30;
                        g0Var2 = g0Var4;
                        pVar8 = pVar12;
                        m0Var2 = m0Var3;
                        q0Var2 = q0Var4;
                        i28 = i31;
                        pVar6 = pVar11;
                        kVar2 = kVar3;
                        p0Var2 = p0Var4;
                        pVar7 = pVar14;
                        n0Var2 = n0VarA;
                    } else {
                        rVar3 = rVar2;
                        rVar3.W();
                        pVar6 = pVar3;
                        pVar7 = pVar4;
                        g0Var2 = g0Var;
                        q0Var2 = q0Var;
                        p0Var2 = p0Var;
                        i27 = i;
                        i28 = i2;
                        kVar2 = kVar;
                        n0Var2 = n0Var;
                        z7 = z4;
                        pVar8 = pVar5;
                        m0Var2 = m0Var;
                    }
                    z8 = z5;
                    q1VarT = rVar3.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i3 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i4);
                                int iA3 = androidx.compose.runtime.s.A(i5);
                                c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                i14 = i6 & 512;
                if (i14 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (rVar2.h(pVar4)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i7 |= i15;
                    }
                    i16 = i4 | 3510;
                    i17 = i6 & 16384;
                    if (i17 != 0) {
                        i18 = i17;
                        i19 = i4 | 28086;
                    } else {
                        i18 = i17;
                        if ((i4 & 24576) == 0) {
                            i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                        } else {
                            i19 = i16;
                        }
                    }
                    i20 = i6 & 32768;
                    if (i20 != 0) {
                        i19 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (rVar2.f(q0Var)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i19 |= i21;
                    }
                    i22 = i6 & Parser.ARGC_LIMIT;
                    if (i22 != 0) {
                        i19 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                    }
                    if ((i4 & 12582912) == 0) {
                        i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        i19 |= 33554432;
                    }
                    int i310 = i19 | 805306368;
                    i23 = i6 & 1048576;
                    if (i23 != 0) {
                        i24 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (rVar2.f(kVar)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    int i311 = i24 | 16;
                    if (rVar2.f(k3Var)) {
                        i26 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i26 = 128;
                    }
                    int i312 = i311 | i26;
                    if ((i7 & 306783379) != 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (rVar2.T(i7 & 1, z6)) {
                        rVar2.Y();
                        if ((i3 & 1) != 0) {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var4 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        } else {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var5 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        }
                        rVar2.q();
                        if (kVar3 == null) {
                            rVar2.b0(1310051731);
                            objQ = rVar2.Q();
                            if (objQ == androidx.compose.runtime.m.a) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            z9 = false;
                            rVar2.p(false);
                            kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                        } else {
                            z9 = false;
                            rVar2.b0(1981921732);
                            rVar2.p(false);
                            kVar4 = kVar3;
                        }
                        rVar2.b0(1981927842);
                        jB = m0Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                            if (!z4) {
                                j = k3Var.c;
                            } else if (zBooleanValue) {
                                j = k3Var.a;
                            } else {
                                j = k3Var.b;
                            }
                            jB = j;
                            z9 = false;
                        }
                        long j4 = jB;
                        rVar2.p(z9);
                        androidx.compose.ui.text.m0 m0VarD3 = m0Var3.d(new androidx.compose.ui.text.m0(j4, 0L, null, 0L, 0, 0L, 16777214));
                        androidx.appcompat.widget.r rVarA3 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                        kotlin.jvm.functions.p pVar15 = pVar10;
                        b2 b2Var3 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD3, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar15, n0VarA);
                        rVar3 = rVar2;
                        androidx.compose.runtime.s.a(rVarA3, androidx.compose.runtime.internal.k.c(1874034984, b2Var3, rVar3), rVar3, 56);
                        z7 = z4;
                        i27 = i30;
                        g0Var2 = g0Var4;
                        pVar8 = pVar12;
                        m0Var2 = m0Var3;
                        q0Var2 = q0Var4;
                        i28 = i31;
                        pVar6 = pVar11;
                        kVar2 = kVar3;
                        p0Var2 = p0Var4;
                        pVar7 = pVar15;
                        n0Var2 = n0VarA;
                    } else {
                        rVar3 = rVar2;
                        rVar3.W();
                        pVar6 = pVar3;
                        pVar7 = pVar4;
                        g0Var2 = g0Var;
                        q0Var2 = q0Var;
                        p0Var2 = p0Var;
                        i27 = i;
                        i28 = i2;
                        kVar2 = kVar;
                        n0Var2 = n0Var;
                        z7 = z4;
                        pVar8 = pVar5;
                        m0Var2 = m0Var;
                    }
                    z8 = z5;
                    q1VarT = rVar3.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i3 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i4);
                                int iA3 = androidx.compose.runtime.s.A(i5);
                                c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i16 = i4 | 3510;
                i17 = i6 & 16384;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i4 | 28086;
                } else {
                    i18 = i17;
                    if ((i4 & 24576) == 0) {
                        i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                    } else {
                        i19 = i16;
                    }
                }
                i20 = i6 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (rVar2.f(q0Var)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i19 |= i21;
                }
                i22 = i6 & Parser.ARGC_LIMIT;
                if (i22 != 0) {
                    i19 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i19 |= 33554432;
                }
                int i313 = i19 | 805306368;
                i23 = i6 & 1048576;
                if (i23 != 0) {
                    i24 = 6;
                } else if ((i5 & 6) == 0) {
                    if (rVar2.f(kVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                int i314 = i24 | 16;
                if (rVar2.f(k3Var)) {
                    i26 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i26 = 128;
                }
                int i315 = i314 | i26;
                if ((i7 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (rVar2.T(i7 & 1, z6)) {
                    rVar2.Y();
                    if ((i3 & 1) != 0) {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var6 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    } else {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var7 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    }
                    rVar2.q();
                    if (kVar3 == null) {
                        rVar2.b0(1310051731);
                        objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        z9 = false;
                        rVar2.p(false);
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                    } else {
                        z9 = false;
                        rVar2.b0(1981921732);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    rVar2.b0(1981927842);
                    jB = m0Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                        if (!z4) {
                            j = k3Var.c;
                        } else if (zBooleanValue) {
                            j = k3Var.a;
                        } else {
                            j = k3Var.b;
                        }
                        jB = j;
                        z9 = false;
                    }
                    long j5 = jB;
                    rVar2.p(z9);
                    androidx.compose.ui.text.m0 m0VarD4 = m0Var3.d(new androidx.compose.ui.text.m0(j5, 0L, null, 0L, 0, 0L, 16777214));
                    androidx.appcompat.widget.r rVarA4 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                    kotlin.jvm.functions.p pVar16 = pVar10;
                    b2 b2Var4 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD4, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar16, n0VarA);
                    rVar3 = rVar2;
                    androidx.compose.runtime.s.a(rVarA4, androidx.compose.runtime.internal.k.c(1874034984, b2Var4, rVar3), rVar3, 56);
                    z7 = z4;
                    i27 = i30;
                    g0Var2 = g0Var4;
                    pVar8 = pVar12;
                    m0Var2 = m0Var3;
                    q0Var2 = q0Var4;
                    i28 = i31;
                    pVar6 = pVar11;
                    kVar2 = kVar3;
                    p0Var2 = p0Var4;
                    pVar7 = pVar16;
                    n0Var2 = n0VarA;
                } else {
                    rVar3 = rVar2;
                    rVar3.W();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    g0Var2 = g0Var;
                    q0Var2 = q0Var;
                    p0Var2 = p0Var;
                    i27 = i;
                    i28 = i2;
                    kVar2 = kVar;
                    n0Var2 = n0Var;
                    z7 = z4;
                    pVar8 = pVar5;
                    m0Var2 = m0Var;
                }
                z8 = z5;
                q1VarT = rVar3.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i3 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i4);
                            int iA3 = androidx.compose.runtime.s.A(i5);
                            c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            z5 = z2;
            if ((i3 & 196608) == 0) {
                i7 |= Parser.ARGC_LIMIT;
            }
            if ((i3 & 1572864) != 0) {
                if (rVar2.h(pVar)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i7 |= i32;
            }
            i10 = i6 & 128;
            if (i10 != 0) {
                i7 |= 12582912;
                pVar5 = pVar2;
            } else {
                pVar5 = pVar2;
                if ((i3 & 12582912) == 0) {
                    if (rVar2.h(pVar5)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i7 |= i11;
                }
            }
            i12 = i6 & LibretroCore.SCREEN_WIDTH;
            if (i12 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (rVar2.h(pVar3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (rVar2.h(pVar4)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i7 |= i15;
                    }
                    i16 = i4 | 3510;
                    i17 = i6 & 16384;
                    if (i17 != 0) {
                        i18 = i17;
                        i19 = i4 | 28086;
                    } else {
                        i18 = i17;
                        if ((i4 & 24576) == 0) {
                            i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                        } else {
                            i19 = i16;
                        }
                    }
                    i20 = i6 & 32768;
                    if (i20 != 0) {
                        i19 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (rVar2.f(q0Var)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i19 |= i21;
                    }
                    i22 = i6 & Parser.ARGC_LIMIT;
                    if (i22 != 0) {
                        i19 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                    }
                    if ((i4 & 12582912) == 0) {
                        i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        i19 |= 33554432;
                    }
                    int i316 = i19 | 805306368;
                    i23 = i6 & 1048576;
                    if (i23 != 0) {
                        i24 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (rVar2.f(kVar)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    int i317 = i24 | 16;
                    if (rVar2.f(k3Var)) {
                        i26 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i26 = 128;
                    }
                    int i318 = i317 | i26;
                    if ((i7 & 306783379) != 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (rVar2.T(i7 & 1, z6)) {
                        rVar2.Y();
                        if ((i3 & 1) != 0) {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var8 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        } else {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var9 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        }
                        rVar2.q();
                        if (kVar3 == null) {
                            rVar2.b0(1310051731);
                            objQ = rVar2.Q();
                            if (objQ == androidx.compose.runtime.m.a) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            z9 = false;
                            rVar2.p(false);
                            kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                        } else {
                            z9 = false;
                            rVar2.b0(1981921732);
                            rVar2.p(false);
                            kVar4 = kVar3;
                        }
                        rVar2.b0(1981927842);
                        jB = m0Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                            if (!z4) {
                                j = k3Var.c;
                            } else if (zBooleanValue) {
                                j = k3Var.a;
                            } else {
                                j = k3Var.b;
                            }
                            jB = j;
                            z9 = false;
                        }
                        long j6 = jB;
                        rVar2.p(z9);
                        androidx.compose.ui.text.m0 m0VarD5 = m0Var3.d(new androidx.compose.ui.text.m0(j6, 0L, null, 0L, 0, 0L, 16777214));
                        androidx.appcompat.widget.r rVarA5 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                        kotlin.jvm.functions.p pVar17 = pVar10;
                        b2 b2Var5 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD5, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar17, n0VarA);
                        rVar3 = rVar2;
                        androidx.compose.runtime.s.a(rVarA5, androidx.compose.runtime.internal.k.c(1874034984, b2Var5, rVar3), rVar3, 56);
                        z7 = z4;
                        i27 = i30;
                        g0Var2 = g0Var4;
                        pVar8 = pVar12;
                        m0Var2 = m0Var3;
                        q0Var2 = q0Var4;
                        i28 = i31;
                        pVar6 = pVar11;
                        kVar2 = kVar3;
                        p0Var2 = p0Var4;
                        pVar7 = pVar17;
                        n0Var2 = n0VarA;
                    } else {
                        rVar3 = rVar2;
                        rVar3.W();
                        pVar6 = pVar3;
                        pVar7 = pVar4;
                        g0Var2 = g0Var;
                        q0Var2 = q0Var;
                        p0Var2 = p0Var;
                        i27 = i;
                        i28 = i2;
                        kVar2 = kVar;
                        n0Var2 = n0Var;
                        z7 = z4;
                        pVar8 = pVar5;
                        m0Var2 = m0Var;
                    }
                    z8 = z5;
                    q1VarT = rVar3.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i3 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i4);
                                int iA3 = androidx.compose.runtime.s.A(i5);
                                c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i16 = i4 | 3510;
                i17 = i6 & 16384;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i4 | 28086;
                } else {
                    i18 = i17;
                    if ((i4 & 24576) == 0) {
                        i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                    } else {
                        i19 = i16;
                    }
                }
                i20 = i6 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (rVar2.f(q0Var)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i19 |= i21;
                }
                i22 = i6 & Parser.ARGC_LIMIT;
                if (i22 != 0) {
                    i19 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i19 |= 33554432;
                }
                int i319 = i19 | 805306368;
                i23 = i6 & 1048576;
                if (i23 != 0) {
                    i24 = 6;
                } else if ((i5 & 6) == 0) {
                    if (rVar2.f(kVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                int i3110 = i24 | 16;
                if (rVar2.f(k3Var)) {
                    i26 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i26 = 128;
                }
                int i3111 = i3110 | i26;
                if ((i7 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (rVar2.T(i7 & 1, z6)) {
                    rVar2.Y();
                    if ((i3 & 1) != 0) {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var10 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    } else {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var11 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    }
                    rVar2.q();
                    if (kVar3 == null) {
                        rVar2.b0(1310051731);
                        objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        z9 = false;
                        rVar2.p(false);
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                    } else {
                        z9 = false;
                        rVar2.b0(1981921732);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    rVar2.b0(1981927842);
                    jB = m0Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                        if (!z4) {
                            j = k3Var.c;
                        } else if (zBooleanValue) {
                            j = k3Var.a;
                        } else {
                            j = k3Var.b;
                        }
                        jB = j;
                        z9 = false;
                    }
                    long j7 = jB;
                    rVar2.p(z9);
                    androidx.compose.ui.text.m0 m0VarD6 = m0Var3.d(new androidx.compose.ui.text.m0(j7, 0L, null, 0L, 0, 0L, 16777214));
                    androidx.appcompat.widget.r rVarA6 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                    kotlin.jvm.functions.p pVar18 = pVar10;
                    b2 b2Var6 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD6, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar18, n0VarA);
                    rVar3 = rVar2;
                    androidx.compose.runtime.s.a(rVarA6, androidx.compose.runtime.internal.k.c(1874034984, b2Var6, rVar3), rVar3, 56);
                    z7 = z4;
                    i27 = i30;
                    g0Var2 = g0Var4;
                    pVar8 = pVar12;
                    m0Var2 = m0Var3;
                    q0Var2 = q0Var4;
                    i28 = i31;
                    pVar6 = pVar11;
                    kVar2 = kVar3;
                    p0Var2 = p0Var4;
                    pVar7 = pVar18;
                    n0Var2 = n0VarA;
                } else {
                    rVar3 = rVar2;
                    rVar3.W();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    g0Var2 = g0Var;
                    q0Var2 = q0Var;
                    p0Var2 = p0Var;
                    i27 = i;
                    i28 = i2;
                    kVar2 = kVar;
                    n0Var2 = n0Var;
                    z7 = z4;
                    pVar8 = pVar5;
                    m0Var2 = m0Var;
                }
                z8 = z5;
                q1VarT = rVar3.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i3 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i4);
                            int iA3 = androidx.compose.runtime.s.A(i5);
                            c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i14 = i6 & 512;
            if (i14 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (rVar2.h(pVar4)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i7 |= i15;
                }
                i16 = i4 | 3510;
                i17 = i6 & 16384;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i4 | 28086;
                } else {
                    i18 = i17;
                    if ((i4 & 24576) == 0) {
                        i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                    } else {
                        i19 = i16;
                    }
                }
                i20 = i6 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (rVar2.f(q0Var)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i19 |= i21;
                }
                i22 = i6 & Parser.ARGC_LIMIT;
                if (i22 != 0) {
                    i19 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i19 |= 33554432;
                }
                int i3112 = i19 | 805306368;
                i23 = i6 & 1048576;
                if (i23 != 0) {
                    i24 = 6;
                } else if ((i5 & 6) == 0) {
                    if (rVar2.f(kVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                int i3113 = i24 | 16;
                if (rVar2.f(k3Var)) {
                    i26 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i26 = 128;
                }
                int i3114 = i3113 | i26;
                if ((i7 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (rVar2.T(i7 & 1, z6)) {
                    rVar2.Y();
                    if ((i3 & 1) != 0) {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var12 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    } else {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var13 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    }
                    rVar2.q();
                    if (kVar3 == null) {
                        rVar2.b0(1310051731);
                        objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        z9 = false;
                        rVar2.p(false);
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                    } else {
                        z9 = false;
                        rVar2.b0(1981921732);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    rVar2.b0(1981927842);
                    jB = m0Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                        if (!z4) {
                            j = k3Var.c;
                        } else if (zBooleanValue) {
                            j = k3Var.a;
                        } else {
                            j = k3Var.b;
                        }
                        jB = j;
                        z9 = false;
                    }
                    long j8 = jB;
                    rVar2.p(z9);
                    androidx.compose.ui.text.m0 m0VarD7 = m0Var3.d(new androidx.compose.ui.text.m0(j8, 0L, null, 0L, 0, 0L, 16777214));
                    androidx.appcompat.widget.r rVarA7 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                    kotlin.jvm.functions.p pVar19 = pVar10;
                    b2 b2Var7 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD7, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar19, n0VarA);
                    rVar3 = rVar2;
                    androidx.compose.runtime.s.a(rVarA7, androidx.compose.runtime.internal.k.c(1874034984, b2Var7, rVar3), rVar3, 56);
                    z7 = z4;
                    i27 = i30;
                    g0Var2 = g0Var4;
                    pVar8 = pVar12;
                    m0Var2 = m0Var3;
                    q0Var2 = q0Var4;
                    i28 = i31;
                    pVar6 = pVar11;
                    kVar2 = kVar3;
                    p0Var2 = p0Var4;
                    pVar7 = pVar19;
                    n0Var2 = n0VarA;
                } else {
                    rVar3 = rVar2;
                    rVar3.W();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    g0Var2 = g0Var;
                    q0Var2 = q0Var;
                    p0Var2 = p0Var;
                    i27 = i;
                    i28 = i2;
                    kVar2 = kVar;
                    n0Var2 = n0Var;
                    z7 = z4;
                    pVar8 = pVar5;
                    m0Var2 = m0Var;
                }
                z8 = z5;
                q1VarT = rVar3.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i3 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i4);
                            int iA3 = androidx.compose.runtime.s.A(i5);
                            c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i7 |= 805306368;
            i16 = i4 | 3510;
            i17 = i6 & 16384;
            if (i17 != 0) {
                i18 = i17;
                i19 = i4 | 28086;
            } else {
                i18 = i17;
                if ((i4 & 24576) == 0) {
                    i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                } else {
                    i19 = i16;
                }
            }
            i20 = i6 & 32768;
            if (i20 != 0) {
                i19 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (rVar2.f(q0Var)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i19 |= i21;
            }
            i22 = i6 & Parser.ARGC_LIMIT;
            if (i22 != 0) {
                i19 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
            }
            if ((i4 & 12582912) == 0) {
                i19 |= rVar2.g(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) == 0) {
                i19 |= 33554432;
            }
            int i3115 = i19 | 805306368;
            i23 = i6 & 1048576;
            if (i23 != 0) {
                i24 = 6;
            } else if ((i5 & 6) == 0) {
                if (rVar2.f(kVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            int i3116 = i24 | 16;
            if (rVar2.f(k3Var)) {
                i26 = LibretroCore.SCREEN_WIDTH;
            } else {
                i26 = 128;
            }
            int i3117 = i3116 | i26;
            if ((i7 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (rVar2.T(i7 & 1, z6)) {
                rVar2.Y();
                if ((i3 & 1) != 0) {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var14 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                } else {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var15 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                }
                rVar2.q();
                if (kVar3 == null) {
                    rVar2.b0(1310051731);
                    objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    z9 = false;
                    rVar2.p(false);
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                } else {
                    z9 = false;
                    rVar2.b0(1981921732);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                rVar2.b0(1981927842);
                jB = m0Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                    if (!z4) {
                        j = k3Var.c;
                    } else if (zBooleanValue) {
                        j = k3Var.a;
                    } else {
                        j = k3Var.b;
                    }
                    jB = j;
                    z9 = false;
                }
                long j9 = jB;
                rVar2.p(z9);
                androidx.compose.ui.text.m0 m0VarD8 = m0Var3.d(new androidx.compose.ui.text.m0(j9, 0L, null, 0L, 0, 0L, 16777214));
                androidx.appcompat.widget.r rVarA8 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                kotlin.jvm.functions.p pVar110 = pVar10;
                b2 b2Var8 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD8, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar110, n0VarA);
                rVar3 = rVar2;
                androidx.compose.runtime.s.a(rVarA8, androidx.compose.runtime.internal.k.c(1874034984, b2Var8, rVar3), rVar3, 56);
                z7 = z4;
                i27 = i30;
                g0Var2 = g0Var4;
                pVar8 = pVar12;
                m0Var2 = m0Var3;
                q0Var2 = q0Var4;
                i28 = i31;
                pVar6 = pVar11;
                kVar2 = kVar3;
                p0Var2 = p0Var4;
                pVar7 = pVar110;
                n0Var2 = n0VarA;
            } else {
                rVar3 = rVar2;
                rVar3.W();
                pVar6 = pVar3;
                pVar7 = pVar4;
                g0Var2 = g0Var;
                q0Var2 = q0Var;
                p0Var2 = p0Var;
                i27 = i;
                i28 = i2;
                kVar2 = kVar;
                n0Var2 = n0Var;
                z7 = z4;
                pVar8 = pVar5;
                m0Var2 = m0Var;
            }
            z8 = z5;
            q1VarT = rVar3.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i3 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i4);
                        int iA3 = androidx.compose.runtime.s.A(i5);
                        c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 |= 3072;
        z4 = z;
        i8 = i6 & 16;
        if (i8 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (rVar2.g(z5)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i7 |= i9;
            }
            if ((i3 & 196608) == 0) {
                i7 |= Parser.ARGC_LIMIT;
            }
            if ((i3 & 1572864) != 0) {
                if (rVar2.h(pVar)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i7 |= i32;
            }
            i10 = i6 & 128;
            if (i10 != 0) {
                i7 |= 12582912;
                pVar5 = pVar2;
            } else {
                pVar5 = pVar2;
                if ((i3 & 12582912) == 0) {
                    if (rVar2.h(pVar5)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i7 |= i11;
                }
            }
            i12 = i6 & LibretroCore.SCREEN_WIDTH;
            if (i12 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (rVar2.h(pVar3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (rVar2.h(pVar4)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i7 |= i15;
                    }
                    i16 = i4 | 3510;
                    i17 = i6 & 16384;
                    if (i17 != 0) {
                        i18 = i17;
                        i19 = i4 | 28086;
                    } else {
                        i18 = i17;
                        if ((i4 & 24576) == 0) {
                            i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                        } else {
                            i19 = i16;
                        }
                    }
                    i20 = i6 & 32768;
                    if (i20 != 0) {
                        i19 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (rVar2.f(q0Var)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i19 |= i21;
                    }
                    i22 = i6 & Parser.ARGC_LIMIT;
                    if (i22 != 0) {
                        i19 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                    }
                    if ((i4 & 12582912) == 0) {
                        i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        i19 |= 33554432;
                    }
                    int i3118 = i19 | 805306368;
                    i23 = i6 & 1048576;
                    if (i23 != 0) {
                        i24 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (rVar2.f(kVar)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i5 | i25;
                    } else {
                        i24 = i5;
                    }
                    int i3119 = i24 | 16;
                    if (rVar2.f(k3Var)) {
                        i26 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i26 = 128;
                    }
                    int i31110 = i3119 | i26;
                    if ((i7 & 306783379) != 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (rVar2.T(i7 & 1, z6)) {
                        rVar2.Y();
                        if ((i3 & 1) != 0) {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var16 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        } else {
                            if (i33 != 0) {
                                z4 = true;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                            if (i10 != 0) {
                                pVar5 = null;
                            }
                            if (i12 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i14 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar4;
                            }
                            if (i18 != 0) {
                                g0Var3 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var3 = g0Var;
                            }
                            if (i20 != 0) {
                                q0Var3 = androidx.compose.foundation.text.q0.c;
                            } else {
                                q0Var3 = q0Var;
                            }
                            if (i22 != 0) {
                                p0Var3 = androidx.compose.foundation.text.p0.b;
                            } else {
                                p0Var3 = p0Var;
                            }
                            if (z3) {
                                i29 = 1;
                            } else {
                                i29 = Integer.MAX_VALUE;
                            }
                            if (i23 == 0) {
                            }
                            w1 w1Var17 = w1.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                            q0Var4 = q0Var3;
                            p0Var4 = p0Var3;
                            i30 = i29;
                            pVar11 = pVar9;
                            pVar12 = pVar5;
                            g0Var4 = g0Var3;
                            i31 = 1;
                            kVar3 = kVar5;
                        }
                        rVar2.q();
                        if (kVar3 == null) {
                            rVar2.b0(1310051731);
                            objQ = rVar2.Q();
                            if (objQ == androidx.compose.runtime.m.a) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            z9 = false;
                            rVar2.p(false);
                            kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                        } else {
                            z9 = false;
                            rVar2.b0(1981921732);
                            rVar2.p(false);
                            kVar4 = kVar3;
                        }
                        rVar2.b0(1981927842);
                        jB = m0Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                            if (!z4) {
                                j = k3Var.c;
                            } else if (zBooleanValue) {
                                j = k3Var.a;
                            } else {
                                j = k3Var.b;
                            }
                            jB = j;
                            z9 = false;
                        }
                        long j10 = jB;
                        rVar2.p(z9);
                        androidx.compose.ui.text.m0 m0VarD9 = m0Var3.d(new androidx.compose.ui.text.m0(j10, 0L, null, 0L, 0, 0L, 16777214));
                        androidx.appcompat.widget.r rVarA9 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                        kotlin.jvm.functions.p pVar111 = pVar10;
                        b2 b2Var9 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD9, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar111, n0VarA);
                        rVar3 = rVar2;
                        androidx.compose.runtime.s.a(rVarA9, androidx.compose.runtime.internal.k.c(1874034984, b2Var9, rVar3), rVar3, 56);
                        z7 = z4;
                        i27 = i30;
                        g0Var2 = g0Var4;
                        pVar8 = pVar12;
                        m0Var2 = m0Var3;
                        q0Var2 = q0Var4;
                        i28 = i31;
                        pVar6 = pVar11;
                        kVar2 = kVar3;
                        p0Var2 = p0Var4;
                        pVar7 = pVar111;
                        n0Var2 = n0VarA;
                    } else {
                        rVar3 = rVar2;
                        rVar3.W();
                        pVar6 = pVar3;
                        pVar7 = pVar4;
                        g0Var2 = g0Var;
                        q0Var2 = q0Var;
                        p0Var2 = p0Var;
                        i27 = i;
                        i28 = i2;
                        kVar2 = kVar;
                        n0Var2 = n0Var;
                        z7 = z4;
                        pVar8 = pVar5;
                        m0Var2 = m0Var;
                    }
                    z8 = z5;
                    q1VarT = rVar3.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.s.A(i3 | 1);
                                int iA2 = androidx.compose.runtime.s.A(i4);
                                int iA3 = androidx.compose.runtime.s.A(i5);
                                c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i7 |= 805306368;
                i16 = i4 | 3510;
                i17 = i6 & 16384;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i4 | 28086;
                } else {
                    i18 = i17;
                    if ((i4 & 24576) == 0) {
                        i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                    } else {
                        i19 = i16;
                    }
                }
                i20 = i6 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (rVar2.f(q0Var)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i19 |= i21;
                }
                i22 = i6 & Parser.ARGC_LIMIT;
                if (i22 != 0) {
                    i19 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i19 |= 33554432;
                }
                int i31111 = i19 | 805306368;
                i23 = i6 & 1048576;
                if (i23 != 0) {
                    i24 = 6;
                } else if ((i5 & 6) == 0) {
                    if (rVar2.f(kVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                int i31112 = i24 | 16;
                if (rVar2.f(k3Var)) {
                    i26 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i26 = 128;
                }
                int i31113 = i31112 | i26;
                if ((i7 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (rVar2.T(i7 & 1, z6)) {
                    rVar2.Y();
                    if ((i3 & 1) != 0) {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var18 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    } else {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var19 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    }
                    rVar2.q();
                    if (kVar3 == null) {
                        rVar2.b0(1310051731);
                        objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        z9 = false;
                        rVar2.p(false);
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                    } else {
                        z9 = false;
                        rVar2.b0(1981921732);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    rVar2.b0(1981927842);
                    jB = m0Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                        if (!z4) {
                            j = k3Var.c;
                        } else if (zBooleanValue) {
                            j = k3Var.a;
                        } else {
                            j = k3Var.b;
                        }
                        jB = j;
                        z9 = false;
                    }
                    long j11 = jB;
                    rVar2.p(z9);
                    androidx.compose.ui.text.m0 m0VarD10 = m0Var3.d(new androidx.compose.ui.text.m0(j11, 0L, null, 0L, 0, 0L, 16777214));
                    androidx.appcompat.widget.r rVarA10 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                    kotlin.jvm.functions.p pVar112 = pVar10;
                    b2 b2Var10 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD10, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar112, n0VarA);
                    rVar3 = rVar2;
                    androidx.compose.runtime.s.a(rVarA10, androidx.compose.runtime.internal.k.c(1874034984, b2Var10, rVar3), rVar3, 56);
                    z7 = z4;
                    i27 = i30;
                    g0Var2 = g0Var4;
                    pVar8 = pVar12;
                    m0Var2 = m0Var3;
                    q0Var2 = q0Var4;
                    i28 = i31;
                    pVar6 = pVar11;
                    kVar2 = kVar3;
                    p0Var2 = p0Var4;
                    pVar7 = pVar112;
                    n0Var2 = n0VarA;
                } else {
                    rVar3 = rVar2;
                    rVar3.W();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    g0Var2 = g0Var;
                    q0Var2 = q0Var;
                    p0Var2 = p0Var;
                    i27 = i;
                    i28 = i2;
                    kVar2 = kVar;
                    n0Var2 = n0Var;
                    z7 = z4;
                    pVar8 = pVar5;
                    m0Var2 = m0Var;
                }
                z8 = z5;
                q1VarT = rVar3.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i3 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i4);
                            int iA3 = androidx.compose.runtime.s.A(i5);
                            c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            i14 = i6 & 512;
            if (i14 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (rVar2.h(pVar4)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i7 |= i15;
                }
                i16 = i4 | 3510;
                i17 = i6 & 16384;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i4 | 28086;
                } else {
                    i18 = i17;
                    if ((i4 & 24576) == 0) {
                        i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                    } else {
                        i19 = i16;
                    }
                }
                i20 = i6 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (rVar2.f(q0Var)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i19 |= i21;
                }
                i22 = i6 & Parser.ARGC_LIMIT;
                if (i22 != 0) {
                    i19 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i19 |= 33554432;
                }
                int i31114 = i19 | 805306368;
                i23 = i6 & 1048576;
                if (i23 != 0) {
                    i24 = 6;
                } else if ((i5 & 6) == 0) {
                    if (rVar2.f(kVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                int i31115 = i24 | 16;
                if (rVar2.f(k3Var)) {
                    i26 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i26 = 128;
                }
                int i31116 = i31115 | i26;
                if ((i7 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (rVar2.T(i7 & 1, z6)) {
                    rVar2.Y();
                    if ((i3 & 1) != 0) {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var110 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    } else {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var111 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    }
                    rVar2.q();
                    if (kVar3 == null) {
                        rVar2.b0(1310051731);
                        objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        z9 = false;
                        rVar2.p(false);
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                    } else {
                        z9 = false;
                        rVar2.b0(1981921732);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    rVar2.b0(1981927842);
                    jB = m0Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                        if (!z4) {
                            j = k3Var.c;
                        } else if (zBooleanValue) {
                            j = k3Var.a;
                        } else {
                            j = k3Var.b;
                        }
                        jB = j;
                        z9 = false;
                    }
                    long j12 = jB;
                    rVar2.p(z9);
                    androidx.compose.ui.text.m0 m0VarD11 = m0Var3.d(new androidx.compose.ui.text.m0(j12, 0L, null, 0L, 0, 0L, 16777214));
                    androidx.appcompat.widget.r rVarA11 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                    kotlin.jvm.functions.p pVar113 = pVar10;
                    b2 b2Var11 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD11, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar113, n0VarA);
                    rVar3 = rVar2;
                    androidx.compose.runtime.s.a(rVarA11, androidx.compose.runtime.internal.k.c(1874034984, b2Var11, rVar3), rVar3, 56);
                    z7 = z4;
                    i27 = i30;
                    g0Var2 = g0Var4;
                    pVar8 = pVar12;
                    m0Var2 = m0Var3;
                    q0Var2 = q0Var4;
                    i28 = i31;
                    pVar6 = pVar11;
                    kVar2 = kVar3;
                    p0Var2 = p0Var4;
                    pVar7 = pVar113;
                    n0Var2 = n0VarA;
                } else {
                    rVar3 = rVar2;
                    rVar3.W();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    g0Var2 = g0Var;
                    q0Var2 = q0Var;
                    p0Var2 = p0Var;
                    i27 = i;
                    i28 = i2;
                    kVar2 = kVar;
                    n0Var2 = n0Var;
                    z7 = z4;
                    pVar8 = pVar5;
                    m0Var2 = m0Var;
                }
                z8 = z5;
                q1VarT = rVar3.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i3 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i4);
                            int iA3 = androidx.compose.runtime.s.A(i5);
                            c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i7 |= 805306368;
            i16 = i4 | 3510;
            i17 = i6 & 16384;
            if (i17 != 0) {
                i18 = i17;
                i19 = i4 | 28086;
            } else {
                i18 = i17;
                if ((i4 & 24576) == 0) {
                    i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                } else {
                    i19 = i16;
                }
            }
            i20 = i6 & 32768;
            if (i20 != 0) {
                i19 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (rVar2.f(q0Var)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i19 |= i21;
            }
            i22 = i6 & Parser.ARGC_LIMIT;
            if (i22 != 0) {
                i19 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
            }
            if ((i4 & 12582912) == 0) {
                i19 |= rVar2.g(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) == 0) {
                i19 |= 33554432;
            }
            int i31117 = i19 | 805306368;
            i23 = i6 & 1048576;
            if (i23 != 0) {
                i24 = 6;
            } else if ((i5 & 6) == 0) {
                if (rVar2.f(kVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            int i31118 = i24 | 16;
            if (rVar2.f(k3Var)) {
                i26 = LibretroCore.SCREEN_WIDTH;
            } else {
                i26 = 128;
            }
            int i31119 = i31118 | i26;
            if ((i7 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (rVar2.T(i7 & 1, z6)) {
                rVar2.Y();
                if ((i3 & 1) != 0) {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var112 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                } else {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var113 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                }
                rVar2.q();
                if (kVar3 == null) {
                    rVar2.b0(1310051731);
                    objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    z9 = false;
                    rVar2.p(false);
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                } else {
                    z9 = false;
                    rVar2.b0(1981921732);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                rVar2.b0(1981927842);
                jB = m0Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                    if (!z4) {
                        j = k3Var.c;
                    } else if (zBooleanValue) {
                        j = k3Var.a;
                    } else {
                        j = k3Var.b;
                    }
                    jB = j;
                    z9 = false;
                }
                long j13 = jB;
                rVar2.p(z9);
                androidx.compose.ui.text.m0 m0VarD12 = m0Var3.d(new androidx.compose.ui.text.m0(j13, 0L, null, 0L, 0, 0L, 16777214));
                androidx.appcompat.widget.r rVarA12 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                kotlin.jvm.functions.p pVar114 = pVar10;
                b2 b2Var12 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD12, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar114, n0VarA);
                rVar3 = rVar2;
                androidx.compose.runtime.s.a(rVarA12, androidx.compose.runtime.internal.k.c(1874034984, b2Var12, rVar3), rVar3, 56);
                z7 = z4;
                i27 = i30;
                g0Var2 = g0Var4;
                pVar8 = pVar12;
                m0Var2 = m0Var3;
                q0Var2 = q0Var4;
                i28 = i31;
                pVar6 = pVar11;
                kVar2 = kVar3;
                p0Var2 = p0Var4;
                pVar7 = pVar114;
                n0Var2 = n0VarA;
            } else {
                rVar3 = rVar2;
                rVar3.W();
                pVar6 = pVar3;
                pVar7 = pVar4;
                g0Var2 = g0Var;
                q0Var2 = q0Var;
                p0Var2 = p0Var;
                i27 = i;
                i28 = i2;
                kVar2 = kVar;
                n0Var2 = n0Var;
                z7 = z4;
                pVar8 = pVar5;
                m0Var2 = m0Var;
            }
            z8 = z5;
            q1VarT = rVar3.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i3 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i4);
                        int iA3 = androidx.compose.runtime.s.A(i5);
                        c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 |= 24576;
        z5 = z2;
        if ((i3 & 196608) == 0) {
            i7 |= Parser.ARGC_LIMIT;
        }
        if ((i3 & 1572864) != 0) {
            if (rVar2.h(pVar)) {
                i32 = 1048576;
            } else {
                i32 = 524288;
            }
            i7 |= i32;
        }
        i10 = i6 & 128;
        if (i10 != 0) {
            i7 |= 12582912;
            pVar5 = pVar2;
        } else {
            pVar5 = pVar2;
            if ((i3 & 12582912) == 0) {
                if (rVar2.h(pVar5)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i7 |= i11;
            }
        }
        i12 = i6 & LibretroCore.SCREEN_WIDTH;
        if (i12 != 0) {
            if ((i3 & 100663296) == 0) {
                if (rVar2.h(pVar3)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i7 |= i13;
            }
            i14 = i6 & 512;
            if (i14 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (rVar2.h(pVar4)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i7 |= i15;
                }
                i16 = i4 | 3510;
                i17 = i6 & 16384;
                if (i17 != 0) {
                    i18 = i17;
                    i19 = i4 | 28086;
                } else {
                    i18 = i17;
                    if ((i4 & 24576) == 0) {
                        i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                    } else {
                        i19 = i16;
                    }
                }
                i20 = i6 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (rVar2.f(q0Var)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i19 |= i21;
                }
                i22 = i6 & Parser.ARGC_LIMIT;
                if (i22 != 0) {
                    i19 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i19 |= rVar2.g(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i19 |= 33554432;
                }
                int i311110 = i19 | 805306368;
                i23 = i6 & 1048576;
                if (i23 != 0) {
                    i24 = 6;
                } else if ((i5 & 6) == 0) {
                    if (rVar2.f(kVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i5 | i25;
                } else {
                    i24 = i5;
                }
                int i311111 = i24 | 16;
                if (rVar2.f(k3Var)) {
                    i26 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i26 = 128;
                }
                int i311112 = i311111 | i26;
                if ((i7 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (rVar2.T(i7 & 1, z6)) {
                    rVar2.Y();
                    if ((i3 & 1) != 0) {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var114 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    } else {
                        if (i33 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                        if (i10 != 0) {
                            pVar5 = null;
                        }
                        if (i12 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i14 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar4;
                        }
                        if (i18 != 0) {
                            g0Var3 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var3 = g0Var;
                        }
                        if (i20 != 0) {
                            q0Var3 = androidx.compose.foundation.text.q0.c;
                        } else {
                            q0Var3 = q0Var;
                        }
                        if (i22 != 0) {
                            p0Var3 = androidx.compose.foundation.text.p0.b;
                        } else {
                            p0Var3 = p0Var;
                        }
                        if (z3) {
                            i29 = 1;
                        } else {
                            i29 = Integer.MAX_VALUE;
                        }
                        if (i23 == 0) {
                        }
                        w1 w1Var115 = w1.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                        q0Var4 = q0Var3;
                        p0Var4 = p0Var3;
                        i30 = i29;
                        pVar11 = pVar9;
                        pVar12 = pVar5;
                        g0Var4 = g0Var3;
                        i31 = 1;
                        kVar3 = kVar5;
                    }
                    rVar2.q();
                    if (kVar3 == null) {
                        rVar2.b0(1310051731);
                        objQ = rVar2.Q();
                        if (objQ == androidx.compose.runtime.m.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        z9 = false;
                        rVar2.p(false);
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                    } else {
                        z9 = false;
                        rVar2.b0(1981921732);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    rVar2.b0(1981927842);
                    jB = m0Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                        if (!z4) {
                            j = k3Var.c;
                        } else if (zBooleanValue) {
                            j = k3Var.a;
                        } else {
                            j = k3Var.b;
                        }
                        jB = j;
                        z9 = false;
                    }
                    long j14 = jB;
                    rVar2.p(z9);
                    androidx.compose.ui.text.m0 m0VarD13 = m0Var3.d(new androidx.compose.ui.text.m0(j14, 0L, null, 0L, 0, 0L, 16777214));
                    androidx.appcompat.widget.r rVarA13 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                    kotlin.jvm.functions.p pVar115 = pVar10;
                    b2 b2Var13 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD13, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar115, n0VarA);
                    rVar3 = rVar2;
                    androidx.compose.runtime.s.a(rVarA13, androidx.compose.runtime.internal.k.c(1874034984, b2Var13, rVar3), rVar3, 56);
                    z7 = z4;
                    i27 = i30;
                    g0Var2 = g0Var4;
                    pVar8 = pVar12;
                    m0Var2 = m0Var3;
                    q0Var2 = q0Var4;
                    i28 = i31;
                    pVar6 = pVar11;
                    kVar2 = kVar3;
                    p0Var2 = p0Var4;
                    pVar7 = pVar115;
                    n0Var2 = n0VarA;
                } else {
                    rVar3 = rVar2;
                    rVar3.W();
                    pVar6 = pVar3;
                    pVar7 = pVar4;
                    g0Var2 = g0Var;
                    q0Var2 = q0Var;
                    p0Var2 = p0Var;
                    i27 = i;
                    i28 = i2;
                    kVar2 = kVar;
                    n0Var2 = n0Var;
                    z7 = z4;
                    pVar8 = pVar5;
                    m0Var2 = m0Var;
                }
                z8 = z5;
                q1VarT = rVar3.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(i3 | 1);
                            int iA2 = androidx.compose.runtime.s.A(i4);
                            int iA3 = androidx.compose.runtime.s.A(i5);
                            c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i7 |= 805306368;
            i16 = i4 | 3510;
            i17 = i6 & 16384;
            if (i17 != 0) {
                i18 = i17;
                i19 = i4 | 28086;
            } else {
                i18 = i17;
                if ((i4 & 24576) == 0) {
                    i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                } else {
                    i19 = i16;
                }
            }
            i20 = i6 & 32768;
            if (i20 != 0) {
                i19 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (rVar2.f(q0Var)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i19 |= i21;
            }
            i22 = i6 & Parser.ARGC_LIMIT;
            if (i22 != 0) {
                i19 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
            }
            if ((i4 & 12582912) == 0) {
                i19 |= rVar2.g(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) == 0) {
                i19 |= 33554432;
            }
            int i311113 = i19 | 805306368;
            i23 = i6 & 1048576;
            if (i23 != 0) {
                i24 = 6;
            } else if ((i5 & 6) == 0) {
                if (rVar2.f(kVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            int i311114 = i24 | 16;
            if (rVar2.f(k3Var)) {
                i26 = LibretroCore.SCREEN_WIDTH;
            } else {
                i26 = 128;
            }
            int i311115 = i311114 | i26;
            if ((i7 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (rVar2.T(i7 & 1, z6)) {
                rVar2.Y();
                if ((i3 & 1) != 0) {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var116 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                } else {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var117 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                }
                rVar2.q();
                if (kVar3 == null) {
                    rVar2.b0(1310051731);
                    objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    z9 = false;
                    rVar2.p(false);
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                } else {
                    z9 = false;
                    rVar2.b0(1981921732);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                rVar2.b0(1981927842);
                jB = m0Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                    if (!z4) {
                        j = k3Var.c;
                    } else if (zBooleanValue) {
                        j = k3Var.a;
                    } else {
                        j = k3Var.b;
                    }
                    jB = j;
                    z9 = false;
                }
                long j15 = jB;
                rVar2.p(z9);
                androidx.compose.ui.text.m0 m0VarD14 = m0Var3.d(new androidx.compose.ui.text.m0(j15, 0L, null, 0L, 0, 0L, 16777214));
                androidx.appcompat.widget.r rVarA14 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                kotlin.jvm.functions.p pVar116 = pVar10;
                b2 b2Var14 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD14, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar116, n0VarA);
                rVar3 = rVar2;
                androidx.compose.runtime.s.a(rVarA14, androidx.compose.runtime.internal.k.c(1874034984, b2Var14, rVar3), rVar3, 56);
                z7 = z4;
                i27 = i30;
                g0Var2 = g0Var4;
                pVar8 = pVar12;
                m0Var2 = m0Var3;
                q0Var2 = q0Var4;
                i28 = i31;
                pVar6 = pVar11;
                kVar2 = kVar3;
                p0Var2 = p0Var4;
                pVar7 = pVar116;
                n0Var2 = n0VarA;
            } else {
                rVar3 = rVar2;
                rVar3.W();
                pVar6 = pVar3;
                pVar7 = pVar4;
                g0Var2 = g0Var;
                q0Var2 = q0Var;
                p0Var2 = p0Var;
                i27 = i;
                i28 = i2;
                kVar2 = kVar;
                n0Var2 = n0Var;
                z7 = z4;
                pVar8 = pVar5;
                m0Var2 = m0Var;
            }
            z8 = z5;
            q1VarT = rVar3.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i3 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i4);
                        int iA3 = androidx.compose.runtime.s.A(i5);
                        c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 |= 100663296;
        i14 = i6 & 512;
        if (i14 != 0) {
            if ((i3 & 805306368) == 0) {
                if (rVar2.h(pVar4)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i7 |= i15;
            }
            i16 = i4 | 3510;
            i17 = i6 & 16384;
            if (i17 != 0) {
                i18 = i17;
                i19 = i4 | 28086;
            } else {
                i18 = i17;
                if ((i4 & 24576) == 0) {
                    i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
                } else {
                    i19 = i16;
                }
            }
            i20 = i6 & 32768;
            if (i20 != 0) {
                i19 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (rVar2.f(q0Var)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i19 |= i21;
            }
            i22 = i6 & Parser.ARGC_LIMIT;
            if (i22 != 0) {
                i19 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
            }
            if ((i4 & 12582912) == 0) {
                i19 |= rVar2.g(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) == 0) {
                i19 |= 33554432;
            }
            int i311116 = i19 | 805306368;
            i23 = i6 & 1048576;
            if (i23 != 0) {
                i24 = 6;
            } else if ((i5 & 6) == 0) {
                if (rVar2.f(kVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i5 | i25;
            } else {
                i24 = i5;
            }
            int i311117 = i24 | 16;
            if (rVar2.f(k3Var)) {
                i26 = LibretroCore.SCREEN_WIDTH;
            } else {
                i26 = 128;
            }
            int i311118 = i311117 | i26;
            if ((i7 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (rVar2.T(i7 & 1, z6)) {
                rVar2.Y();
                if ((i3 & 1) != 0) {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var118 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                } else {
                    if (i33 != 0) {
                        z4 = true;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                    if (i10 != 0) {
                        pVar5 = null;
                    }
                    if (i12 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i14 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar4;
                    }
                    if (i18 != 0) {
                        g0Var3 = androidx.compose.ui.text.input.f0.e;
                    } else {
                        g0Var3 = g0Var;
                    }
                    if (i20 != 0) {
                        q0Var3 = androidx.compose.foundation.text.q0.c;
                    } else {
                        q0Var3 = q0Var;
                    }
                    if (i22 != 0) {
                        p0Var3 = androidx.compose.foundation.text.p0.b;
                    } else {
                        p0Var3 = p0Var;
                    }
                    if (z3) {
                        i29 = 1;
                    } else {
                        i29 = Integer.MAX_VALUE;
                    }
                    if (i23 == 0) {
                    }
                    w1 w1Var119 = w1.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                    q0Var4 = q0Var3;
                    p0Var4 = p0Var3;
                    i30 = i29;
                    pVar11 = pVar9;
                    pVar12 = pVar5;
                    g0Var4 = g0Var3;
                    i31 = 1;
                    kVar3 = kVar5;
                }
                rVar2.q();
                if (kVar3 == null) {
                    rVar2.b0(1310051731);
                    objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    z9 = false;
                    rVar2.p(false);
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                } else {
                    z9 = false;
                    rVar2.b0(1981921732);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                rVar2.b0(1981927842);
                jB = m0Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                    if (!z4) {
                        j = k3Var.c;
                    } else if (zBooleanValue) {
                        j = k3Var.a;
                    } else {
                        j = k3Var.b;
                    }
                    jB = j;
                    z9 = false;
                }
                long j16 = jB;
                rVar2.p(z9);
                androidx.compose.ui.text.m0 m0VarD15 = m0Var3.d(new androidx.compose.ui.text.m0(j16, 0L, null, 0L, 0, 0L, 16777214));
                androidx.appcompat.widget.r rVarA15 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
                kotlin.jvm.functions.p pVar117 = pVar10;
                b2 b2Var15 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD15, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar117, n0VarA);
                rVar3 = rVar2;
                androidx.compose.runtime.s.a(rVarA15, androidx.compose.runtime.internal.k.c(1874034984, b2Var15, rVar3), rVar3, 56);
                z7 = z4;
                i27 = i30;
                g0Var2 = g0Var4;
                pVar8 = pVar12;
                m0Var2 = m0Var3;
                q0Var2 = q0Var4;
                i28 = i31;
                pVar6 = pVar11;
                kVar2 = kVar3;
                p0Var2 = p0Var4;
                pVar7 = pVar117;
                n0Var2 = n0VarA;
            } else {
                rVar3 = rVar2;
                rVar3.W();
                pVar6 = pVar3;
                pVar7 = pVar4;
                g0Var2 = g0Var;
                q0Var2 = q0Var;
                p0Var2 = p0Var;
                i27 = i;
                i28 = i2;
                kVar2 = kVar;
                n0Var2 = n0Var;
                z7 = z4;
                pVar8 = pVar5;
                m0Var2 = m0Var;
            }
            z8 = z5;
            q1VarT = rVar3.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i3 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i4);
                        int iA3 = androidx.compose.runtime.s.A(i5);
                        c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i7 |= 805306368;
        i16 = i4 | 3510;
        i17 = i6 & 16384;
        if (i17 != 0) {
            i18 = i17;
            i19 = i4 | 28086;
        } else {
            i18 = i17;
            if ((i4 & 24576) == 0) {
                i19 = i16 | (rVar2.f(g0Var) ? 16384 : 8192);
            } else {
                i19 = i16;
            }
        }
        i20 = i6 & 32768;
        if (i20 != 0) {
            i19 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (rVar2.f(q0Var)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i19 |= i21;
        }
        i22 = i6 & Parser.ARGC_LIMIT;
        if (i22 != 0) {
            i19 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i19 |= rVar2.f(p0Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i19 |= rVar2.g(z3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i19 |= 33554432;
        }
        int i311119 = i19 | 805306368;
        i23 = i6 & 1048576;
        if (i23 != 0) {
            i24 = 6;
        } else if ((i5 & 6) == 0) {
            if (rVar2.f(kVar)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i5 | i25;
        } else {
            i24 = i5;
        }
        int i3111110 = i24 | 16;
        if (rVar2.f(k3Var)) {
            i26 = LibretroCore.SCREEN_WIDTH;
        } else {
            i26 = 128;
        }
        int i3111111 = i3111110 | i26;
        if ((i7 & 306783379) != 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (rVar2.T(i7 & 1, z6)) {
            rVar2.Y();
            if ((i3 & 1) != 0) {
                if (i33 != 0) {
                    z4 = true;
                }
                if (i8 != 0) {
                    z5 = false;
                }
                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                if (i10 != 0) {
                    pVar5 = null;
                }
                if (i12 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar3;
                }
                if (i14 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar4;
                }
                if (i18 != 0) {
                    g0Var3 = androidx.compose.ui.text.input.f0.e;
                } else {
                    g0Var3 = g0Var;
                }
                if (i20 != 0) {
                    q0Var3 = androidx.compose.foundation.text.q0.c;
                } else {
                    q0Var3 = q0Var;
                }
                if (i22 != 0) {
                    p0Var3 = androidx.compose.foundation.text.p0.b;
                } else {
                    p0Var3 = p0Var;
                }
                if (z3) {
                    i29 = 1;
                } else {
                    i29 = Integer.MAX_VALUE;
                }
                if (i23 == 0) {
                }
                w1 w1Var1110 = w1.a;
                n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                q0Var4 = q0Var3;
                p0Var4 = p0Var3;
                i30 = i29;
                pVar11 = pVar9;
                pVar12 = pVar5;
                g0Var4 = g0Var3;
                i31 = 1;
                kVar3 = kVar5;
            } else {
                if (i33 != 0) {
                    z4 = true;
                }
                if (i8 != 0) {
                    z5 = false;
                }
                m0Var3 = (androidx.compose.ui.text.m0) rVar2.j(p3.a);
                if (i10 != 0) {
                    pVar5 = null;
                }
                if (i12 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar3;
                }
                if (i14 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar4;
                }
                if (i18 != 0) {
                    g0Var3 = androidx.compose.ui.text.input.f0.e;
                } else {
                    g0Var3 = g0Var;
                }
                if (i20 != 0) {
                    q0Var3 = androidx.compose.foundation.text.q0.c;
                } else {
                    q0Var3 = q0Var;
                }
                if (i22 != 0) {
                    p0Var3 = androidx.compose.foundation.text.p0.b;
                } else {
                    p0Var3 = p0Var;
                }
                if (z3) {
                    i29 = 1;
                } else {
                    i29 = Integer.MAX_VALUE;
                }
                if (i23 == 0) {
                }
                w1 w1Var1111 = w1.a;
                n0VarA = a3.a(androidx.compose.material3.tokens.r.e, rVar2);
                q0Var4 = q0Var3;
                p0Var4 = p0Var3;
                i30 = i29;
                pVar11 = pVar9;
                pVar12 = pVar5;
                g0Var4 = g0Var3;
                i31 = 1;
                kVar3 = kVar5;
            }
            rVar2.q();
            if (kVar3 == null) {
                rVar2.b0(1310051731);
                objQ = rVar2.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                z9 = false;
                rVar2.p(false);
                kVar4 = (androidx.compose.foundation.interaction.k) objQ;
            } else {
                z9 = false;
                rVar2.b0(1981921732);
                rVar2.p(false);
                kVar4 = kVar3;
            }
            rVar2.b0(1981927842);
            jB = m0Var3.b();
            if (jB == 16) {
                zBooleanValue = ((Boolean) android.support.v4.media.session.b.g(kVar4, rVar2, z9 ? 1 : 0).getValue()).booleanValue();
                if (!z4) {
                    j = k3Var.c;
                } else if (zBooleanValue) {
                    j = k3Var.a;
                } else {
                    j = k3Var.b;
                }
                jB = j;
                z9 = false;
            }
            long j17 = jB;
            rVar2.p(z9);
            androidx.compose.ui.text.m0 m0VarD16 = m0Var3.d(new androidx.compose.ui.text.m0(j17, 0L, null, 0L, 0, 0L, 16777214));
            androidx.appcompat.widget.r rVarA16 = androidx.compose.foundation.text.selection.k1.a.a(k3Var.k);
            kotlin.jvm.functions.p pVar118 = pVar10;
            b2 b2Var16 = new b2(rVar, pVar, k3Var, str, lVar, z4, z5, m0VarD16, q0Var4, p0Var4, z3, i30, i31, g0Var4, kVar4, pVar12, pVar11, pVar118, n0VarA);
            rVar3 = rVar2;
            androidx.compose.runtime.s.a(rVarA16, androidx.compose.runtime.internal.k.c(1874034984, b2Var16, rVar3), rVar3, 56);
            z7 = z4;
            i27 = i30;
            g0Var2 = g0Var4;
            pVar8 = pVar12;
            m0Var2 = m0Var3;
            q0Var2 = q0Var4;
            i28 = i31;
            pVar6 = pVar11;
            kVar2 = kVar3;
            p0Var2 = p0Var4;
            pVar7 = pVar118;
            n0Var2 = n0VarA;
        } else {
            rVar3 = rVar2;
            rVar3.W();
            pVar6 = pVar3;
            pVar7 = pVar4;
            g0Var2 = g0Var;
            q0Var2 = q0Var;
            p0Var2 = p0Var;
            i27 = i;
            i28 = i2;
            kVar2 = kVar;
            n0Var2 = n0Var;
            z7 = z4;
            pVar8 = pVar5;
            m0Var2 = m0Var;
        }
        z8 = z5;
        q1VarT = rVar3.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(i3 | 1);
                    int iA2 = androidx.compose.runtime.s.A(i4);
                    int iA3 = androidx.compose.runtime.s.A(i5);
                    c2.a(str, lVar, rVar, z7, z8, m0Var2, pVar, pVar8, pVar6, pVar7, g0Var2, q0Var2, p0Var2, z3, i27, i28, kVar2, n0Var2, k3Var, (androidx.compose.runtime.r) obj, iA, iA2, iA3, i6);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:254:0x0556  */
    /* JADX WARN: Code duplicated, block: B:256:0x055a  */
    /* JADX WARN: Code duplicated, block: B:259:0x0598  */
    /* JADX WARN: Code duplicated, block: B:260:0x059c  */
    /* JADX WARN: Code duplicated, block: B:263:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:265:0x05b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    public static final void b(final kotlin.jvm.functions.p pVar, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, final kotlin.jvm.functions.p pVar4, final kotlin.jvm.functions.p pVar5, final kotlin.jvm.functions.p pVar6, final boolean z, final n3 n3Var, final androidx.compose.material3.internal.y yVar, final kotlin.jvm.functions.l lVar, final androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.p pVar7, final androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.r rVar, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.p pVar8;
        kotlin.jvm.functions.q qVar2;
        kotlin.jvm.functions.p pVar9;
        androidx.compose.runtime.r rVar2;
        androidx.compose.ui.j jVar;
        androidx.compose.runtime.r rVar3;
        androidx.compose.ui.j jVar2;
        boolean z2;
        ?? r10;
        androidx.compose.ui.j jVar3;
        kotlin.jvm.functions.p pVar10;
        kotlin.jvm.functions.p pVar11;
        float f;
        androidx.compose.ui.o oVar;
        int i5;
        kotlin.jvm.functions.q qVar3;
        kotlin.jvm.functions.p pVar12;
        kotlin.jvm.functions.p pVar13;
        boolean z3;
        Object obj;
        boolean z4;
        Object objQ;
        int iHashCode;
        androidx.compose.ui.j jVar4 = androidx.compose.ui.c.B;
        androidx.compose.ui.j jVar5 = androidx.compose.ui.c.e;
        rVar.c0(753699262);
        int i6 = i & 6;
        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
        if (i6 == 0) {
            i3 = i | (rVar.f(oVar2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar.h(pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= rVar.h(qVar) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i7 == 0) {
            i3 |= rVar.h(pVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar.h(pVar3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= rVar.h(pVar4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i3 |= rVar.h(pVar5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rVar.h(pVar6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= rVar.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rVar.f(n3Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? rVar.f(yVar) : rVar.h(yVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= rVar.h(lVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= rVar.h(fVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(pVar7)) {
                i8 = 2048;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i4 |= rVar.f(m0Var) ? 16384 : 8192;
        }
        int i9 = i4;
        if (rVar.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true)) {
            float f2 = androidx.compose.material3.internal.z.f(rVar);
            int i10 = i9 & 14;
            boolean zC = ((i9 & 57344) == 16384) | ((i9 & Token.ASSIGN_MOD) == 32) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i10 == 4 || ((i9 & 8) != 0 && rVar.f(yVar))) | rVar.c(f2);
            Object objQ2 = rVar.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
            if (zC || objQ2 == fVar2) {
                jVar = jVar4;
                androidx.compose.runtime.r rVar4 = rVar;
                e2 e2Var = new e2(lVar, z, n3Var, yVar, m0Var, f2);
                rVar4.l0(e2Var);
                objQ2 = e2Var;
                rVar3 = rVar4;
            } else {
                jVar = jVar4;
                rVar3 = rVar;
            }
            e2 e2Var2 = (e2) objQ2;
            androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) rVar3.j(androidx.compose.ui.platform.l1.n);
            int iHashCode2 = Long.hashCode(rVar3.T);
            androidx.compose.runtime.internal.j jVarL = rVar3.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x020b: INVOKE (r12v22 'rVarC' androidx.compose.ui.r) = (r3v5 'rVar3' androidx.compose.runtime.r), (r21v2 ?? I:??[OBJECT, ARRAY]) STATIC call: androidx.compose.ui.a.c(androidx.compose.runtime.r, androidx.compose.ui.r):androidx.compose.ui.r A[DECLARE_VAR, MD:(androidx.compose.runtime.r, androidx.compose.ui.r):androidx.compose.ui.r (m)] (LINE:16) in method: androidx.compose.material3.c2.b(kotlin.jvm.functions.p, kotlin.jvm.functions.q, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, androidx.compose.material3.n3, androidx.compose.material3.internal.y, kotlin.jvm.functions.l, androidx.compose.runtime.internal.f, kotlin.jvm.functions.p, androidx.compose.foundation.layout.m0, androidx.compose.runtime.r, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1702
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.c2.b(kotlin.jvm.functions.p, kotlin.jvm.functions.q, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, androidx.compose.material3.n3, androidx.compose.material3.internal.y, kotlin.jvm.functions.l, androidx.compose.runtime.internal.f, kotlin.jvm.functions.p, androidx.compose.foundation.layout.m0, androidx.compose.runtime.r, int, int):void");
        }
    }
