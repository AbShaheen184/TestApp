package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {
    public static final androidx.compose.material.ripple.b a = new androidx.compose.material.ripple.b();

    /* JADX WARN: Code duplicated, block: B:111:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    public static final void a(final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, androidx.compose.ui.graphics.n0 n0Var, final long j, long j2, long j3, long j4, float f, androidx.compose.ui.window.w wVar, androidx.compose.runtime.r rVar2, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.runtime.internal.f fVar2;
        kotlin.jvm.functions.p pVar4;
        int i5;
        androidx.compose.ui.graphics.n0 n0VarA;
        long jD;
        int i6;
        long jD2;
        int i7;
        boolean z;
        final float f2;
        final androidx.compose.ui.window.w wVar2;
        final long j5;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j6;
        final long j7;
        final kotlin.jvm.functions.p pVar5;
        final androidx.compose.ui.r rVar3;
        androidx.compose.runtime.q1 q1VarT;
        int i8;
        androidx.compose.ui.r rVar4;
        kotlin.jvm.functions.p pVar6;
        androidx.compose.ui.graphics.n0 n0Var3;
        long j8;
        float f3;
        long j9;
        long j10;
        androidx.compose.ui.window.w wVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        rVar2.c0(94478519);
        if ((i & 6) == 0) {
            i4 = (rVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            fVar2 = fVar;
            i4 |= rVar2.h(fVar2) ? 32 : 16;
        } else {
            fVar2 = fVar;
        }
        int i15 = i4 | 384;
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i & 3072) == 0) {
                pVar4 = pVar;
                i15 |= rVar2.h(pVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i5 = i15 | 24576;
            if ((196608 & i) != 0) {
                if (rVar2.h(pVar2)) {
                    i14 = 131072;
                } else {
                    i14 = Parser.ARGC_LIMIT;
                }
                i5 |= i14;
            }
            if ((1572864 & i) != 0) {
                if (rVar2.h(pVar3)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    n0VarA = n0Var;
                    int i17 = rVar2.f(n0VarA) ? 8388608 : 4194304;
                    i5 |= i17;
                } else {
                    n0VarA = n0Var;
                }
                i5 |= i17;
            } else {
                n0VarA = n0Var;
            }
            if ((100663296 & i) == 0) {
                if (rVar2.e(j)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i5 |= i12;
            }
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                jD = j3;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !rVar2.e(jD)) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                i6 = i2 | i11;
            } else {
                jD = j3;
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                jD2 = j4;
                if ((i3 & 2048) == 0 || !rVar2.e(jD2)) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                i6 |= i10;
            } else {
                jD2 = j4;
            }
            i7 = i6 | 3456;
            if ((i5 & 306783379) == 306783378 || (i7 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (rVar2.T(i5 & 1, z)) {
                rVar2.Y();
                if ((i & 1) != 0 || rVar2.C()) {
                    if (i16 != 0) {
                        pVar4 = null;
                    }
                    if ((i3 & 128) != 0) {
                        float f4 = a.a;
                        i8 = i5 & (-29360129);
                        n0VarA = a3.a(androidx.compose.material3.tokens.g.c, rVar2);
                    } else {
                        i8 = i5;
                    }
                    float f5 = a.a;
                    long jD3 = o0.d(androidx.compose.material3.tokens.g.h, rVar2);
                    int i18 = i8 & (-1879048193);
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        jD = o0.d(androidx.compose.material3.tokens.g.d, rVar2);
                        i7 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        jD2 = o0.d(androidx.compose.material3.tokens.g.f, rVar2);
                        i7 &= -113;
                    }
                    float f6 = a.a;
                    androidx.compose.ui.window.w wVar4 = new androidx.compose.ui.window.w(7, false, false);
                    rVar4 = androidx.compose.ui.o.b;
                    long j11 = jD2;
                    pVar6 = pVar4;
                    n0Var3 = n0VarA;
                    j8 = j11;
                    f3 = f6;
                    j9 = jD;
                    j10 = jD3;
                    wVar3 = wVar4;
                    i9 = i18;
                } else {
                    rVar2.W();
                    i9 = ((i3 & 128) != 0 ? i5 & (-29360129) : i5) & (-1879048193);
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i7 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        i7 &= -113;
                    }
                    long j12 = jD2;
                    pVar6 = pVar4;
                    n0Var3 = n0VarA;
                    j8 = j12;
                    rVar4 = rVar;
                    f3 = f;
                    wVar3 = wVar;
                    j9 = jD;
                    j10 = j2;
                }
                rVar2.q();
                androidx.compose.ui.r rVar5 = rVar4;
                j.c(aVar, fVar2, rVar5, pVar6, pVar2, pVar3, n0Var3, j, j10, j9, j8, f3, wVar3, rVar2, i9 & 2147483646, i7 & 8190);
                pVar5 = pVar6;
                n0Var2 = n0Var3;
                wVar2 = wVar3;
                rVar3 = rVar5;
                f2 = f3;
                j7 = j8;
                j5 = j9;
                j6 = j10;
            } else {
                rVar2.W();
                f2 = f;
                wVar2 = wVar;
                j5 = jD;
                n0Var2 = n0VarA;
                j6 = j2;
                j7 = jD2;
                pVar5 = pVar4;
                rVar3 = rVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.k
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.s.A(i | 1);
                        int iA2 = androidx.compose.runtime.s.A(i2);
                        t2.a(aVar, fVar, rVar3, pVar5, pVar2, pVar3, n0Var2, j, j6, j5, j7, f2, wVar2, (androidx.compose.runtime.r) obj, iA, iA2, i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i15 = i4 | 3456;
        pVar4 = pVar;
        i5 = i15 | 24576;
        if ((196608 & i) != 0) {
            if (rVar2.h(pVar2)) {
                i14 = 131072;
            } else {
                i14 = Parser.ARGC_LIMIT;
            }
            i5 |= i14;
        }
        if ((1572864 & i) != 0) {
            if (rVar2.h(pVar3)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                n0VarA = n0Var;
                if (rVar2.f(n0VarA)) {
                }
                i5 |= i17;
            } else {
                n0VarA = n0Var;
            }
            i5 |= i17;
        } else {
            n0VarA = n0Var;
        }
        if ((100663296 & i) == 0) {
            if (rVar2.e(j)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i5 |= i12;
        }
        if ((i & 805306368) == 0) {
            i5 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            jD = j3;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                i11 = 2;
            } else {
                i11 = 2;
            }
            i6 = i2 | i11;
        } else {
            jD = j3;
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            jD2 = j4;
            if ((i3 & 2048) == 0) {
                i10 = 16;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        } else {
            jD2 = j4;
        }
        i7 = i6 | 3456;
        if ((i5 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (rVar2.T(i5 & 1, z)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    pVar4 = null;
                }
                if ((i3 & 128) != 0) {
                    float f7 = a.a;
                    i8 = i5 & (-29360129);
                    n0VarA = a3.a(androidx.compose.material3.tokens.g.c, rVar2);
                } else {
                    i8 = i5;
                }
                float f8 = a.a;
                long jD4 = o0.d(androidx.compose.material3.tokens.g.h, rVar2);
                int i19 = i8 & (-1879048193);
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    jD = o0.d(androidx.compose.material3.tokens.g.d, rVar2);
                    i7 &= -15;
                }
                if ((i3 & 2048) != 0) {
                    jD2 = o0.d(androidx.compose.material3.tokens.g.f, rVar2);
                    i7 &= -113;
                }
                float f9 = a.a;
                androidx.compose.ui.window.w wVar5 = new androidx.compose.ui.window.w(7, false, false);
                rVar4 = androidx.compose.ui.o.b;
                long j13 = jD2;
                pVar6 = pVar4;
                n0Var3 = n0VarA;
                j8 = j13;
                f3 = f9;
                j9 = jD;
                j10 = jD4;
                wVar3 = wVar5;
                i9 = i19;
            } else {
                if (i16 != 0) {
                    pVar4 = null;
                }
                if ((i3 & 128) != 0) {
                    float f10 = a.a;
                    i8 = i5 & (-29360129);
                    n0VarA = a3.a(androidx.compose.material3.tokens.g.c, rVar2);
                } else {
                    i8 = i5;
                }
                float f11 = a.a;
                long jD5 = o0.d(androidx.compose.material3.tokens.g.h, rVar2);
                int i110 = i8 & (-1879048193);
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    jD = o0.d(androidx.compose.material3.tokens.g.d, rVar2);
                    i7 &= -15;
                }
                if ((i3 & 2048) != 0) {
                    jD2 = o0.d(androidx.compose.material3.tokens.g.f, rVar2);
                    i7 &= -113;
                }
                float f12 = a.a;
                androidx.compose.ui.window.w wVar6 = new androidx.compose.ui.window.w(7, false, false);
                rVar4 = androidx.compose.ui.o.b;
                long j14 = jD2;
                pVar6 = pVar4;
                n0Var3 = n0VarA;
                j8 = j14;
                f3 = f12;
                j9 = jD;
                j10 = jD5;
                wVar3 = wVar6;
                i9 = i110;
            }
            rVar2.q();
            androidx.compose.ui.r rVar6 = rVar4;
            j.c(aVar, fVar2, rVar6, pVar6, pVar2, pVar3, n0Var3, j, j10, j9, j8, f3, wVar3, rVar2, i9 & 2147483646, i7 & 8190);
            pVar5 = pVar6;
            n0Var2 = n0Var3;
            wVar2 = wVar3;
            rVar3 = rVar6;
            f2 = f3;
            j7 = j8;
            j5 = j9;
            j6 = j10;
        } else {
            rVar2.W();
            f2 = f;
            wVar2 = wVar;
            j5 = jD;
            n0Var2 = n0VarA;
            j6 = j2;
            j7 = jD2;
            pVar5 = pVar4;
            rVar3 = rVar;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.k
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    int iA2 = androidx.compose.runtime.s.A(i2);
                    t2.a(aVar, fVar, rVar3, pVar5, pVar2, pVar3, n0Var2, j, j6, j5, j7, f2, wVar2, (androidx.compose.runtime.r) obj, iA, iA2, i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:156:0x020f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x022b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0244  */
    /* JADX WARN: Code duplicated, block: B:166:0x0247  */
    /* JADX WARN: Code duplicated, block: B:168:0x024b  */
    /* JADX WARN: Code duplicated, block: B:169:0x024e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0252  */
    /* JADX WARN: Code duplicated, block: B:172:0x0255  */
    /* JADX WARN: Code duplicated, block: B:174:0x0259  */
    /* JADX WARN: Code duplicated, block: B:175:0x025c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0264  */
    /* JADX WARN: Code duplicated, block: B:179:0x027b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0296  */
    /* JADX WARN: Code duplicated, block: B:184:0x029c  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:209:0x0303  */
    /* JADX WARN: Code duplicated, block: B:211:0x034d  */
    /* JADX WARN: Code duplicated, block: B:214:0x035f  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static final void b(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, q qVar, v vVar, androidx.compose.foundation.a0 a0Var, androidx.compose.foundation.layout.m0 m0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.q qVar2, androidx.compose.runtime.r rVar2, int i, int i2) {
        int i3;
        androidx.compose.ui.r rVar3;
        int i4;
        boolean z2;
        int i5;
        androidx.compose.ui.graphics.n0 n0VarA;
        v vVar2;
        int i6;
        androidx.compose.foundation.a0 a0Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        androidx.compose.foundation.layout.m0 m0Var2;
        androidx.compose.ui.r rVar4;
        androidx.compose.foundation.a0 a0Var3;
        boolean z4;
        androidx.compose.ui.graphics.n0 n0Var2;
        v vVar3;
        androidx.compose.foundation.interaction.k kVar2;
        androidx.compose.runtime.q1 q1VarT;
        v vVar4;
        androidx.compose.foundation.layout.m0 m0Var3;
        androidx.compose.foundation.a0 a0Var4;
        androidx.compose.foundation.interaction.k kVar3;
        androidx.compose.foundation.layout.m0 m0Var4;
        boolean z5;
        v vVar5;
        Object obj;
        androidx.compose.foundation.interaction.k kVar4;
        long j;
        long j2;
        Object objQ;
        androidx.compose.runtime.snapshots.q qVar3;
        boolean zF;
        Object objQ2;
        androidx.compose.foundation.interaction.j jVar;
        float f;
        Object objQ3;
        androidx.compose.animation.core.d dVar;
        boolean zH;
        Object objQ4;
        boolean z6;
        androidx.compose.animation.core.n nVar;
        ?? r10;
        float f2;
        Object objQ5;
        Object objQ6;
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.functions.q qVar4 = qVar2;
        rVar2.c0(-1310015664);
        if ((i & 6) == 0) {
            i3 = (rVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                rVar3 = rVar;
                i3 |= rVar2.f(rVar3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (rVar2.g(z2)) {
                        i5 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        n0VarA = n0Var;
                        if (rVar2.f(n0VarA)) {
                            i15 = 2048;
                        }
                        i3 |= i15;
                    } else {
                        n0VarA = n0Var;
                    }
                    i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    i3 |= i15;
                } else {
                    n0VarA = n0Var;
                }
                if ((i & 24576) == 0) {
                    if (rVar2.f(qVar)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i3 |= i14;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vVar2 = vVar;
                        if (rVar2.f(vVar2)) {
                            i13 = 131072;
                        }
                        i3 |= i13;
                    } else {
                        vVar2 = vVar;
                    }
                    i13 = Parser.ARGC_LIMIT;
                    i3 |= i13;
                } else {
                    vVar2 = vVar;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    a0Var2 = a0Var;
                } else {
                    a0Var2 = a0Var;
                    if ((i & 1572864) == 0) {
                        if (rVar2.f(a0Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (rVar2.f(m0Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i2 & LibretroCore.SCREEN_WIDTH;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        if (rVar2.f(kVar)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i & 805306368) == 0) {
                        if (rVar2.h(qVar4)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rVar2.T(i3 & 1, z3)) {
                        rVar2.Y();
                        if ((i & 1) != 0 || rVar2.C()) {
                            if (i16 != 0) {
                                rVar3 = androidx.compose.ui.o.b;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                androidx.compose.foundation.layout.m0 m0Var5 = r.a;
                                i3 &= -7169;
                                n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                            }
                            if ((i2 & 32) != 0) {
                                androidx.compose.foundation.layout.m0 m0Var6 = r.a;
                                vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                                i3 &= -458753;
                            } else {
                                vVar4 = vVar2;
                            }
                            if (i6 != 0) {
                                a0Var2 = null;
                            }
                            if (i8 != 0) {
                                m0Var3 = r.a;
                            } else {
                                m0Var3 = m0Var;
                            }
                            a0Var4 = a0Var2;
                            if (i10 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            m0Var4 = m0Var3;
                            z5 = z2;
                            vVar5 = vVar4;
                        } else {
                            rVar2.W();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            a0Var4 = a0Var2;
                            kVar3 = kVar;
                            i3 = i3;
                            vVar5 = vVar2;
                            m0Var4 = m0Var;
                            n0VarA = n0VarA;
                            z5 = z2;
                        }
                        rVar2.q();
                        obj = androidx.compose.runtime.m.a;
                        if (kVar3 == null) {
                            rVar2.b0(1691738187);
                            objQ6 = rVar2.Q();
                            if (objQ6 == obj) {
                                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                            rVar2.p(false);
                        } else {
                            rVar2.b0(-499617780);
                            rVar2.p(false);
                            kVar4 = kVar3;
                        }
                        if (z5) {
                            j = qVar.a;
                        } else {
                            j = qVar.c;
                        }
                        androidx.compose.foundation.layout.m0 m0Var7 = m0Var4;
                        if (z5) {
                            j2 = qVar.b;
                        } else {
                            j2 = qVar.d;
                        }
                        if (vVar5 == null) {
                            rVar2.b0(1691921830);
                            rVar2.p(false);
                            j = j;
                            z6 = z5;
                            n0VarA = n0VarA;
                            kVar4 = kVar4;
                            r10 = 0;
                            nVar = null;
                        } else {
                            rVar2.b0(-499611205);
                            int i17 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                            objQ = rVar2.Q();
                            if (objQ == obj) {
                                objQ = new androidx.compose.runtime.snapshots.q();
                                rVar2.l0(objQ);
                            }
                            qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                            zF = rVar2.f(kVar4);
                            objQ2 = rVar2.Q();
                            if (zF || objQ2 == obj) {
                                objQ2 = new t(kVar4, qVar3, null, 0);
                                rVar2.l0(objQ2);
                            }
                            androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                            jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                            if (!z5) {
                                f = vVar5.e;
                            } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                                f = vVar5.b;
                            } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                                f = vVar5.d;
                            } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                                f = vVar5.c;
                            } else {
                                f = vVar5.a;
                            }
                            objQ3 = rVar2.Q();
                            if (objQ3 == obj) {
                                objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                                rVar2.l0(objQ3);
                            }
                            dVar = (androidx.compose.animation.core.d) objQ3;
                            androidx.compose.ui.unit.f fVar = new androidx.compose.ui.unit.f(f);
                            zH = ((((i17 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i17 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i17 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i17 & 6) == 4) | rVar2.h(jVar);
                            objQ4 = rVar2.Q();
                            if (!zH || objQ4 == obj) {
                                z6 = z5;
                                objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                                rVar2.l0(objQ4);
                            } else {
                                z6 = z5;
                            }
                            androidx.compose.runtime.j0.c(rVar2, fVar, (kotlin.jvm.functions.p) objQ4);
                            nVar = dVar.c;
                            r10 = 0;
                            rVar2.p(false);
                        }
                        if (nVar != null) {
                            f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                        } else {
                            f2 = (float) r10;
                        }
                        float f3 = f2;
                        objQ5 = rVar2.Q();
                        if (objQ5 == obj) {
                            objQ5 = new androidx.compose.foundation.lazy.i(20);
                            rVar2.l0(objQ5);
                        }
                        androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                        qVar4 = qVar2;
                        androidx.compose.ui.graphics.n0 n0Var3 = n0VarA;
                        boolean z7 = z6;
                        f3.b(aVar, rVarA, z7, n0Var3, j, j2, f3, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var7, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                        kVar2 = kVar3;
                        vVar3 = vVar5;
                        m0Var2 = m0Var7;
                        rVar4 = rVar3;
                        n0Var2 = n0Var3;
                        a0Var3 = a0Var4;
                        z4 = z7;
                    } else {
                        rVar2.W();
                        m0Var2 = m0Var;
                        rVar4 = rVar3;
                        a0Var3 = a0Var2;
                        z4 = z2;
                        n0Var2 = n0VarA;
                        vVar3 = vVar2;
                        kVar2 = kVar;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
                    }
                }
                i3 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (rVar2.h(qVar4)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i3 & 1, z3)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var8 = r.a;
                            i3 &= -7169;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var9 = r.a;
                            vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            vVar4 = vVar2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            m0Var3 = r.a;
                        } else {
                            m0Var3 = m0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        m0Var4 = m0Var3;
                        z5 = z2;
                        vVar5 = vVar4;
                    } else {
                        if (i16 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var10 = r.a;
                            i3 &= -7169;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var11 = r.a;
                            vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            vVar4 = vVar2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            m0Var3 = r.a;
                        } else {
                            m0Var3 = m0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        m0Var4 = m0Var3;
                        z5 = z2;
                        vVar5 = vVar4;
                    }
                    rVar2.q();
                    obj = androidx.compose.runtime.m.a;
                    if (kVar3 == null) {
                        rVar2.b0(1691738187);
                        objQ6 = rVar2.Q();
                        if (objQ6 == obj) {
                            objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                        rVar2.p(false);
                    } else {
                        rVar2.b0(-499617780);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    if (z5) {
                        j = qVar.a;
                    } else {
                        j = qVar.c;
                    }
                    androidx.compose.foundation.layout.m0 m0Var12 = m0Var4;
                    if (z5) {
                        j2 = qVar.b;
                    } else {
                        j2 = qVar.d;
                    }
                    if (vVar5 == null) {
                        rVar2.b0(1691921830);
                        rVar2.p(false);
                        j = j;
                        z6 = z5;
                        n0VarA = n0VarA;
                        kVar4 = kVar4;
                        r10 = 0;
                        nVar = null;
                    } else {
                        rVar2.b0(-499611205);
                        int i18 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        objQ = rVar2.Q();
                        if (objQ == obj) {
                            objQ = new androidx.compose.runtime.snapshots.q();
                            rVar2.l0(objQ);
                        }
                        qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                        zF = rVar2.f(kVar4);
                        objQ2 = rVar2.Q();
                        if (zF) {
                            objQ2 = new t(kVar4, qVar3, null, 0);
                            rVar2.l0(objQ2);
                        } else {
                            objQ2 = new t(kVar4, qVar3, null, 0);
                            rVar2.l0(objQ2);
                        }
                        androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                        jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                        if (!z5) {
                            f = vVar5.e;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                            f = vVar5.b;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                            f = vVar5.d;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                            f = vVar5.c;
                        } else {
                            f = vVar5.a;
                        }
                        objQ3 = rVar2.Q();
                        if (objQ3 == obj) {
                            objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                            rVar2.l0(objQ3);
                        }
                        dVar = (androidx.compose.animation.core.d) objQ3;
                        androidx.compose.ui.unit.f fVar2 = new androidx.compose.ui.unit.f(f);
                        zH = ((((i18 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i18 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i18 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i18 & 6) == 4) | rVar2.h(jVar);
                        objQ4 = rVar2.Q();
                        if (zH) {
                            z6 = z5;
                            objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                            rVar2.l0(objQ4);
                        } else {
                            z6 = z5;
                            objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                            rVar2.l0(objQ4);
                        }
                        androidx.compose.runtime.j0.c(rVar2, fVar2, (kotlin.jvm.functions.p) objQ4);
                        nVar = dVar.c;
                        r10 = 0;
                        rVar2.p(false);
                    }
                    if (nVar != null) {
                        f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                    } else {
                        f2 = (float) r10;
                    }
                    float f4 = f2;
                    objQ5 = rVar2.Q();
                    if (objQ5 == obj) {
                        objQ5 = new androidx.compose.foundation.lazy.i(20);
                        rVar2.l0(objQ5);
                    }
                    androidx.compose.ui.r rVarA2 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                    qVar4 = qVar2;
                    androidx.compose.ui.graphics.n0 n0Var4 = n0VarA;
                    boolean z8 = z6;
                    f3.b(aVar, rVarA2, z8, n0Var4, j, j2, f4, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var12, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                    kVar2 = kVar3;
                    vVar3 = vVar5;
                    m0Var2 = m0Var12;
                    rVar4 = rVar3;
                    n0Var2 = n0Var4;
                    a0Var3 = a0Var4;
                    z4 = z8;
                } else {
                    rVar2.W();
                    m0Var2 = m0Var;
                    rVar4 = rVar3;
                    a0Var3 = a0Var2;
                    z4 = z2;
                    n0Var2 = n0VarA;
                    vVar3 = vVar2;
                    kVar2 = kVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    n0VarA = n0Var;
                    if (rVar2.f(n0VarA)) {
                        i15 = 2048;
                    }
                    i3 |= i15;
                } else {
                    n0VarA = n0Var;
                }
                i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i15;
            } else {
                n0VarA = n0Var;
            }
            if ((i & 24576) == 0) {
                if (rVar2.f(qVar)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i3 |= i14;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vVar2 = vVar;
                    if (rVar2.f(vVar2)) {
                        i13 = 131072;
                    }
                    i3 |= i13;
                } else {
                    vVar2 = vVar;
                }
                i13 = Parser.ARGC_LIMIT;
                i3 |= i13;
            } else {
                vVar2 = vVar;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                a0Var2 = a0Var;
            } else {
                a0Var2 = a0Var;
                if ((i & 1572864) == 0) {
                    if (rVar2.f(a0Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (rVar2.f(m0Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    if (rVar2.f(kVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (rVar2.h(qVar4)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i3 & 1, z3)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var13 = r.a;
                            i3 &= -7169;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var14 = r.a;
                            vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            vVar4 = vVar2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            m0Var3 = r.a;
                        } else {
                            m0Var3 = m0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        m0Var4 = m0Var3;
                        z5 = z2;
                        vVar5 = vVar4;
                    } else {
                        if (i16 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var15 = r.a;
                            i3 &= -7169;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var16 = r.a;
                            vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            vVar4 = vVar2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            m0Var3 = r.a;
                        } else {
                            m0Var3 = m0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        m0Var4 = m0Var3;
                        z5 = z2;
                        vVar5 = vVar4;
                    }
                    rVar2.q();
                    obj = androidx.compose.runtime.m.a;
                    if (kVar3 == null) {
                        rVar2.b0(1691738187);
                        objQ6 = rVar2.Q();
                        if (objQ6 == obj) {
                            objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                        rVar2.p(false);
                    } else {
                        rVar2.b0(-499617780);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    if (z5) {
                        j = qVar.a;
                    } else {
                        j = qVar.c;
                    }
                    androidx.compose.foundation.layout.m0 m0Var17 = m0Var4;
                    if (z5) {
                        j2 = qVar.b;
                    } else {
                        j2 = qVar.d;
                    }
                    if (vVar5 == null) {
                        rVar2.b0(1691921830);
                        rVar2.p(false);
                        j = j;
                        z6 = z5;
                        n0VarA = n0VarA;
                        kVar4 = kVar4;
                        r10 = 0;
                        nVar = null;
                    } else {
                        rVar2.b0(-499611205);
                        int i19 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        objQ = rVar2.Q();
                        if (objQ == obj) {
                            objQ = new androidx.compose.runtime.snapshots.q();
                            rVar2.l0(objQ);
                        }
                        qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                        zF = rVar2.f(kVar4);
                        objQ2 = rVar2.Q();
                        if (zF) {
                            objQ2 = new t(kVar4, qVar3, null, 0);
                            rVar2.l0(objQ2);
                        } else {
                            objQ2 = new t(kVar4, qVar3, null, 0);
                            rVar2.l0(objQ2);
                        }
                        androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                        jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                        if (!z5) {
                            f = vVar5.e;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                            f = vVar5.b;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                            f = vVar5.d;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                            f = vVar5.c;
                        } else {
                            f = vVar5.a;
                        }
                        objQ3 = rVar2.Q();
                        if (objQ3 == obj) {
                            objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                            rVar2.l0(objQ3);
                        }
                        dVar = (androidx.compose.animation.core.d) objQ3;
                        androidx.compose.ui.unit.f fVar3 = new androidx.compose.ui.unit.f(f);
                        zH = ((((i19 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i19 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i19 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i19 & 6) == 4) | rVar2.h(jVar);
                        objQ4 = rVar2.Q();
                        if (zH) {
                            z6 = z5;
                            objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                            rVar2.l0(objQ4);
                        } else {
                            z6 = z5;
                            objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                            rVar2.l0(objQ4);
                        }
                        androidx.compose.runtime.j0.c(rVar2, fVar3, (kotlin.jvm.functions.p) objQ4);
                        nVar = dVar.c;
                        r10 = 0;
                        rVar2.p(false);
                    }
                    if (nVar != null) {
                        f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                    } else {
                        f2 = (float) r10;
                    }
                    float f5 = f2;
                    objQ5 = rVar2.Q();
                    if (objQ5 == obj) {
                        objQ5 = new androidx.compose.foundation.lazy.i(20);
                        rVar2.l0(objQ5);
                    }
                    androidx.compose.ui.r rVarA3 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                    qVar4 = qVar2;
                    androidx.compose.ui.graphics.n0 n0Var5 = n0VarA;
                    boolean z9 = z6;
                    f3.b(aVar, rVarA3, z9, n0Var5, j, j2, f5, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var17, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                    kVar2 = kVar3;
                    vVar3 = vVar5;
                    m0Var2 = m0Var17;
                    rVar4 = rVar3;
                    n0Var2 = n0Var5;
                    a0Var3 = a0Var4;
                    z4 = z9;
                } else {
                    rVar2.W();
                    m0Var2 = m0Var;
                    rVar4 = rVar3;
                    a0Var3 = a0Var2;
                    z4 = z2;
                    n0Var2 = n0VarA;
                    vVar3 = vVar2;
                    kVar2 = kVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) == 0) {
                if (rVar2.h(qVar4)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i3 & 1, z3)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var18 = r.a;
                        i3 &= -7169;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var19 = r.a;
                        vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        m0Var3 = r.a;
                    } else {
                        m0Var3 = m0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    m0Var4 = m0Var3;
                    z5 = z2;
                    vVar5 = vVar4;
                } else {
                    if (i16 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var110 = r.a;
                        i3 &= -7169;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var111 = r.a;
                        vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        m0Var3 = r.a;
                    } else {
                        m0Var3 = m0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    m0Var4 = m0Var3;
                    z5 = z2;
                    vVar5 = vVar4;
                }
                rVar2.q();
                obj = androidx.compose.runtime.m.a;
                if (kVar3 == null) {
                    rVar2.b0(1691738187);
                    objQ6 = rVar2.Q();
                    if (objQ6 == obj) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                    rVar2.p(false);
                } else {
                    rVar2.b0(-499617780);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                if (z5) {
                    j = qVar.a;
                } else {
                    j = qVar.c;
                }
                androidx.compose.foundation.layout.m0 m0Var112 = m0Var4;
                if (z5) {
                    j2 = qVar.b;
                } else {
                    j2 = qVar.d;
                }
                if (vVar5 == null) {
                    rVar2.b0(1691921830);
                    rVar2.p(false);
                    j = j;
                    z6 = z5;
                    n0VarA = n0VarA;
                    kVar4 = kVar4;
                    r10 = 0;
                    nVar = null;
                } else {
                    rVar2.b0(-499611205);
                    int i110 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                    objQ = rVar2.Q();
                    if (objQ == obj) {
                        objQ = new androidx.compose.runtime.snapshots.q();
                        rVar2.l0(objQ);
                    }
                    qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                    zF = rVar2.f(kVar4);
                    objQ2 = rVar2.Q();
                    if (zF) {
                        objQ2 = new t(kVar4, qVar3, null, 0);
                        rVar2.l0(objQ2);
                    } else {
                        objQ2 = new t(kVar4, qVar3, null, 0);
                        rVar2.l0(objQ2);
                    }
                    androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                    jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                    if (!z5) {
                        f = vVar5.e;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                        f = vVar5.b;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                        f = vVar5.d;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                        f = vVar5.c;
                    } else {
                        f = vVar5.a;
                    }
                    objQ3 = rVar2.Q();
                    if (objQ3 == obj) {
                        objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                        rVar2.l0(objQ3);
                    }
                    dVar = (androidx.compose.animation.core.d) objQ3;
                    androidx.compose.ui.unit.f fVar4 = new androidx.compose.ui.unit.f(f);
                    zH = ((((i110 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i110 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i110 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i110 & 6) == 4) | rVar2.h(jVar);
                    objQ4 = rVar2.Q();
                    if (zH) {
                        z6 = z5;
                        objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                        rVar2.l0(objQ4);
                    } else {
                        z6 = z5;
                        objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                        rVar2.l0(objQ4);
                    }
                    androidx.compose.runtime.j0.c(rVar2, fVar4, (kotlin.jvm.functions.p) objQ4);
                    nVar = dVar.c;
                    r10 = 0;
                    rVar2.p(false);
                }
                if (nVar != null) {
                    f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                } else {
                    f2 = (float) r10;
                }
                float f6 = f2;
                objQ5 = rVar2.Q();
                if (objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.lazy.i(20);
                    rVar2.l0(objQ5);
                }
                androidx.compose.ui.r rVarA4 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                qVar4 = qVar2;
                androidx.compose.ui.graphics.n0 n0Var6 = n0VarA;
                boolean z10 = z6;
                f3.b(aVar, rVarA4, z10, n0Var6, j, j2, f6, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var112, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                kVar2 = kVar3;
                vVar3 = vVar5;
                m0Var2 = m0Var112;
                rVar4 = rVar3;
                n0Var2 = n0Var6;
                a0Var3 = a0Var4;
                z4 = z10;
            } else {
                rVar2.W();
                m0Var2 = m0Var;
                rVar4 = rVar3;
                a0Var3 = a0Var2;
                z4 = z2;
                n0Var2 = n0VarA;
                vVar3 = vVar2;
                kVar2 = kVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
            }
        }
        i3 |= 48;
        rVar3 = rVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (rVar2.g(z2)) {
                    i5 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    n0VarA = n0Var;
                    if (rVar2.f(n0VarA)) {
                        i15 = 2048;
                    }
                    i3 |= i15;
                } else {
                    n0VarA = n0Var;
                }
                i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i15;
            } else {
                n0VarA = n0Var;
            }
            if ((i & 24576) == 0) {
                if (rVar2.f(qVar)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i3 |= i14;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vVar2 = vVar;
                    if (rVar2.f(vVar2)) {
                        i13 = 131072;
                    }
                    i3 |= i13;
                } else {
                    vVar2 = vVar;
                }
                i13 = Parser.ARGC_LIMIT;
                i3 |= i13;
            } else {
                vVar2 = vVar;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                a0Var2 = a0Var;
            } else {
                a0Var2 = a0Var;
                if ((i & 1572864) == 0) {
                    if (rVar2.f(a0Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (rVar2.f(m0Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    if (rVar2.f(kVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (rVar2.h(qVar4)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i3 & 1, z3)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var113 = r.a;
                            i3 &= -7169;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var114 = r.a;
                            vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            vVar4 = vVar2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            m0Var3 = r.a;
                        } else {
                            m0Var3 = m0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        m0Var4 = m0Var3;
                        z5 = z2;
                        vVar5 = vVar4;
                    } else {
                        if (i16 != 0) {
                            rVar3 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var115 = r.a;
                            i3 &= -7169;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.m0 m0Var116 = r.a;
                            vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            vVar4 = vVar2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            m0Var3 = r.a;
                        } else {
                            m0Var3 = m0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        m0Var4 = m0Var3;
                        z5 = z2;
                        vVar5 = vVar4;
                    }
                    rVar2.q();
                    obj = androidx.compose.runtime.m.a;
                    if (kVar3 == null) {
                        rVar2.b0(1691738187);
                        objQ6 = rVar2.Q();
                        if (objQ6 == obj) {
                            objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                        rVar2.p(false);
                    } else {
                        rVar2.b0(-499617780);
                        rVar2.p(false);
                        kVar4 = kVar3;
                    }
                    if (z5) {
                        j = qVar.a;
                    } else {
                        j = qVar.c;
                    }
                    androidx.compose.foundation.layout.m0 m0Var117 = m0Var4;
                    if (z5) {
                        j2 = qVar.b;
                    } else {
                        j2 = qVar.d;
                    }
                    if (vVar5 == null) {
                        rVar2.b0(1691921830);
                        rVar2.p(false);
                        j = j;
                        z6 = z5;
                        n0VarA = n0VarA;
                        kVar4 = kVar4;
                        r10 = 0;
                        nVar = null;
                    } else {
                        rVar2.b0(-499611205);
                        int i111 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        objQ = rVar2.Q();
                        if (objQ == obj) {
                            objQ = new androidx.compose.runtime.snapshots.q();
                            rVar2.l0(objQ);
                        }
                        qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                        zF = rVar2.f(kVar4);
                        objQ2 = rVar2.Q();
                        if (zF) {
                            objQ2 = new t(kVar4, qVar3, null, 0);
                            rVar2.l0(objQ2);
                        } else {
                            objQ2 = new t(kVar4, qVar3, null, 0);
                            rVar2.l0(objQ2);
                        }
                        androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                        jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                        if (!z5) {
                            f = vVar5.e;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                            f = vVar5.b;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                            f = vVar5.d;
                        } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                            f = vVar5.c;
                        } else {
                            f = vVar5.a;
                        }
                        objQ3 = rVar2.Q();
                        if (objQ3 == obj) {
                            objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                            rVar2.l0(objQ3);
                        }
                        dVar = (androidx.compose.animation.core.d) objQ3;
                        androidx.compose.ui.unit.f fVar5 = new androidx.compose.ui.unit.f(f);
                        zH = ((((i111 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i111 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i111 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i111 & 6) == 4) | rVar2.h(jVar);
                        objQ4 = rVar2.Q();
                        if (zH) {
                            z6 = z5;
                            objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                            rVar2.l0(objQ4);
                        } else {
                            z6 = z5;
                            objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                            rVar2.l0(objQ4);
                        }
                        androidx.compose.runtime.j0.c(rVar2, fVar5, (kotlin.jvm.functions.p) objQ4);
                        nVar = dVar.c;
                        r10 = 0;
                        rVar2.p(false);
                    }
                    if (nVar != null) {
                        f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                    } else {
                        f2 = (float) r10;
                    }
                    float f7 = f2;
                    objQ5 = rVar2.Q();
                    if (objQ5 == obj) {
                        objQ5 = new androidx.compose.foundation.lazy.i(20);
                        rVar2.l0(objQ5);
                    }
                    androidx.compose.ui.r rVarA5 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                    qVar4 = qVar2;
                    androidx.compose.ui.graphics.n0 n0Var7 = n0VarA;
                    boolean z11 = z6;
                    f3.b(aVar, rVarA5, z11, n0Var7, j, j2, f7, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var117, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                    kVar2 = kVar3;
                    vVar3 = vVar5;
                    m0Var2 = m0Var117;
                    rVar4 = rVar3;
                    n0Var2 = n0Var7;
                    a0Var3 = a0Var4;
                    z4 = z11;
                } else {
                    rVar2.W();
                    m0Var2 = m0Var;
                    rVar4 = rVar3;
                    a0Var3 = a0Var2;
                    z4 = z2;
                    n0Var2 = n0VarA;
                    vVar3 = vVar2;
                    kVar2 = kVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) == 0) {
                if (rVar2.h(qVar4)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i3 & 1, z3)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var118 = r.a;
                        i3 &= -7169;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var119 = r.a;
                        vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        m0Var3 = r.a;
                    } else {
                        m0Var3 = m0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    m0Var4 = m0Var3;
                    z5 = z2;
                    vVar5 = vVar4;
                } else {
                    if (i16 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var1110 = r.a;
                        i3 &= -7169;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var1111 = r.a;
                        vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        m0Var3 = r.a;
                    } else {
                        m0Var3 = m0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    m0Var4 = m0Var3;
                    z5 = z2;
                    vVar5 = vVar4;
                }
                rVar2.q();
                obj = androidx.compose.runtime.m.a;
                if (kVar3 == null) {
                    rVar2.b0(1691738187);
                    objQ6 = rVar2.Q();
                    if (objQ6 == obj) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                    rVar2.p(false);
                } else {
                    rVar2.b0(-499617780);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                if (z5) {
                    j = qVar.a;
                } else {
                    j = qVar.c;
                }
                androidx.compose.foundation.layout.m0 m0Var1112 = m0Var4;
                if (z5) {
                    j2 = qVar.b;
                } else {
                    j2 = qVar.d;
                }
                if (vVar5 == null) {
                    rVar2.b0(1691921830);
                    rVar2.p(false);
                    j = j;
                    z6 = z5;
                    n0VarA = n0VarA;
                    kVar4 = kVar4;
                    r10 = 0;
                    nVar = null;
                } else {
                    rVar2.b0(-499611205);
                    int i112 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                    objQ = rVar2.Q();
                    if (objQ == obj) {
                        objQ = new androidx.compose.runtime.snapshots.q();
                        rVar2.l0(objQ);
                    }
                    qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                    zF = rVar2.f(kVar4);
                    objQ2 = rVar2.Q();
                    if (zF) {
                        objQ2 = new t(kVar4, qVar3, null, 0);
                        rVar2.l0(objQ2);
                    } else {
                        objQ2 = new t(kVar4, qVar3, null, 0);
                        rVar2.l0(objQ2);
                    }
                    androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                    jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                    if (!z5) {
                        f = vVar5.e;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                        f = vVar5.b;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                        f = vVar5.d;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                        f = vVar5.c;
                    } else {
                        f = vVar5.a;
                    }
                    objQ3 = rVar2.Q();
                    if (objQ3 == obj) {
                        objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                        rVar2.l0(objQ3);
                    }
                    dVar = (androidx.compose.animation.core.d) objQ3;
                    androidx.compose.ui.unit.f fVar6 = new androidx.compose.ui.unit.f(f);
                    zH = ((((i112 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i112 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i112 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i112 & 6) == 4) | rVar2.h(jVar);
                    objQ4 = rVar2.Q();
                    if (zH) {
                        z6 = z5;
                        objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                        rVar2.l0(objQ4);
                    } else {
                        z6 = z5;
                        objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                        rVar2.l0(objQ4);
                    }
                    androidx.compose.runtime.j0.c(rVar2, fVar6, (kotlin.jvm.functions.p) objQ4);
                    nVar = dVar.c;
                    r10 = 0;
                    rVar2.p(false);
                }
                if (nVar != null) {
                    f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                } else {
                    f2 = (float) r10;
                }
                float f8 = f2;
                objQ5 = rVar2.Q();
                if (objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.lazy.i(20);
                    rVar2.l0(objQ5);
                }
                androidx.compose.ui.r rVarA6 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                qVar4 = qVar2;
                androidx.compose.ui.graphics.n0 n0Var8 = n0VarA;
                boolean z12 = z6;
                f3.b(aVar, rVarA6, z12, n0Var8, j, j2, f8, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var1112, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                kVar2 = kVar3;
                vVar3 = vVar5;
                m0Var2 = m0Var1112;
                rVar4 = rVar3;
                n0Var2 = n0Var8;
                a0Var3 = a0Var4;
                z4 = z12;
            } else {
                rVar2.W();
                m0Var2 = m0Var;
                rVar4 = rVar3;
                a0Var3 = a0Var2;
                z4 = z2;
                n0Var2 = n0VarA;
                vVar3 = vVar2;
                kVar2 = kVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                n0VarA = n0Var;
                if (rVar2.f(n0VarA)) {
                    i15 = 2048;
                }
                i3 |= i15;
            } else {
                n0VarA = n0Var;
            }
            i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i15;
        } else {
            n0VarA = n0Var;
        }
        if ((i & 24576) == 0) {
            if (rVar2.f(qVar)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i3 |= i14;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vVar2 = vVar;
                if (rVar2.f(vVar2)) {
                    i13 = 131072;
                }
                i3 |= i13;
            } else {
                vVar2 = vVar;
            }
            i13 = Parser.ARGC_LIMIT;
            i3 |= i13;
        } else {
            vVar2 = vVar;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            a0Var2 = a0Var;
        } else {
            a0Var2 = a0Var;
            if ((i & 1572864) == 0) {
                if (rVar2.f(a0Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (rVar2.f(m0Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        i10 = i2 & LibretroCore.SCREEN_WIDTH;
        if (i10 != 0) {
            if ((i & 100663296) == 0) {
                if (rVar2.f(kVar)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i & 805306368) == 0) {
                if (rVar2.h(qVar4)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i3 & 1, z3)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var1113 = r.a;
                        i3 &= -7169;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var1114 = r.a;
                        vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        m0Var3 = r.a;
                    } else {
                        m0Var3 = m0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    m0Var4 = m0Var3;
                    z5 = z2;
                    vVar5 = vVar4;
                } else {
                    if (i16 != 0) {
                        rVar3 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var1115 = r.a;
                        i3 &= -7169;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.m0 m0Var1116 = r.a;
                        vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        m0Var3 = r.a;
                    } else {
                        m0Var3 = m0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    m0Var4 = m0Var3;
                    z5 = z2;
                    vVar5 = vVar4;
                }
                rVar2.q();
                obj = androidx.compose.runtime.m.a;
                if (kVar3 == null) {
                    rVar2.b0(1691738187);
                    objQ6 = rVar2.Q();
                    if (objQ6 == obj) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                    rVar2.p(false);
                } else {
                    rVar2.b0(-499617780);
                    rVar2.p(false);
                    kVar4 = kVar3;
                }
                if (z5) {
                    j = qVar.a;
                } else {
                    j = qVar.c;
                }
                androidx.compose.foundation.layout.m0 m0Var1117 = m0Var4;
                if (z5) {
                    j2 = qVar.b;
                } else {
                    j2 = qVar.d;
                }
                if (vVar5 == null) {
                    rVar2.b0(1691921830);
                    rVar2.p(false);
                    j = j;
                    z6 = z5;
                    n0VarA = n0VarA;
                    kVar4 = kVar4;
                    r10 = 0;
                    nVar = null;
                } else {
                    rVar2.b0(-499611205);
                    int i113 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                    objQ = rVar2.Q();
                    if (objQ == obj) {
                        objQ = new androidx.compose.runtime.snapshots.q();
                        rVar2.l0(objQ);
                    }
                    qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                    zF = rVar2.f(kVar4);
                    objQ2 = rVar2.Q();
                    if (zF) {
                        objQ2 = new t(kVar4, qVar3, null, 0);
                        rVar2.l0(objQ2);
                    } else {
                        objQ2 = new t(kVar4, qVar3, null, 0);
                        rVar2.l0(objQ2);
                    }
                    androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                    jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                    if (!z5) {
                        f = vVar5.e;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                        f = vVar5.b;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                        f = vVar5.d;
                    } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                        f = vVar5.c;
                    } else {
                        f = vVar5.a;
                    }
                    objQ3 = rVar2.Q();
                    if (objQ3 == obj) {
                        objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                        rVar2.l0(objQ3);
                    }
                    dVar = (androidx.compose.animation.core.d) objQ3;
                    androidx.compose.ui.unit.f fVar7 = new androidx.compose.ui.unit.f(f);
                    zH = ((((i113 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i113 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i113 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i113 & 6) == 4) | rVar2.h(jVar);
                    objQ4 = rVar2.Q();
                    if (zH) {
                        z6 = z5;
                        objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                        rVar2.l0(objQ4);
                    } else {
                        z6 = z5;
                        objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                        rVar2.l0(objQ4);
                    }
                    androidx.compose.runtime.j0.c(rVar2, fVar7, (kotlin.jvm.functions.p) objQ4);
                    nVar = dVar.c;
                    r10 = 0;
                    rVar2.p(false);
                }
                if (nVar != null) {
                    f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                } else {
                    f2 = (float) r10;
                }
                float f9 = f2;
                objQ5 = rVar2.Q();
                if (objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.lazy.i(20);
                    rVar2.l0(objQ5);
                }
                androidx.compose.ui.r rVarA7 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
                qVar4 = qVar2;
                androidx.compose.ui.graphics.n0 n0Var9 = n0VarA;
                boolean z13 = z6;
                f3.b(aVar, rVarA7, z13, n0Var9, j, j2, f9, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var1117, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                kVar2 = kVar3;
                vVar3 = vVar5;
                m0Var2 = m0Var1117;
                rVar4 = rVar3;
                n0Var2 = n0Var9;
                a0Var3 = a0Var4;
                z4 = z13;
            } else {
                rVar2.W();
                m0Var2 = m0Var;
                rVar4 = rVar3;
                a0Var3 = a0Var2;
                z4 = z2;
                n0Var2 = n0VarA;
                vVar3 = vVar2;
                kVar2 = kVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
            }
        }
        i3 |= 100663296;
        if ((i & 805306368) == 0) {
            if (rVar2.h(qVar4)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i3 |= i12;
        }
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.T(i3 & 1, z3)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    rVar3 = androidx.compose.ui.o.b;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    androidx.compose.foundation.layout.m0 m0Var1118 = r.a;
                    i3 &= -7169;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                }
                if ((i2 & 32) != 0) {
                    androidx.compose.foundation.layout.m0 m0Var1119 = r.a;
                    vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                    i3 &= -458753;
                } else {
                    vVar4 = vVar2;
                }
                if (i6 != 0) {
                    a0Var2 = null;
                }
                if (i8 != 0) {
                    m0Var3 = r.a;
                } else {
                    m0Var3 = m0Var;
                }
                a0Var4 = a0Var2;
                if (i10 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                m0Var4 = m0Var3;
                z5 = z2;
                vVar5 = vVar4;
            } else {
                if (i16 != 0) {
                    rVar3 = androidx.compose.ui.o.b;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    androidx.compose.foundation.layout.m0 m0Var11110 = r.a;
                    i3 &= -7169;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                }
                if ((i2 & 32) != 0) {
                    androidx.compose.foundation.layout.m0 m0Var11111 = r.a;
                    vVar4 = new v(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                    i3 &= -458753;
                } else {
                    vVar4 = vVar2;
                }
                if (i6 != 0) {
                    a0Var2 = null;
                }
                if (i8 != 0) {
                    m0Var3 = r.a;
                } else {
                    m0Var3 = m0Var;
                }
                a0Var4 = a0Var2;
                if (i10 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                m0Var4 = m0Var3;
                z5 = z2;
                vVar5 = vVar4;
            }
            rVar2.q();
            obj = androidx.compose.runtime.m.a;
            if (kVar3 == null) {
                rVar2.b0(1691738187);
                objQ6 = rVar2.Q();
                if (objQ6 == obj) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                rVar2.p(false);
            } else {
                rVar2.b0(-499617780);
                rVar2.p(false);
                kVar4 = kVar3;
            }
            if (z5) {
                j = qVar.a;
            } else {
                j = qVar.c;
            }
            androidx.compose.foundation.layout.m0 m0Var11112 = m0Var4;
            if (z5) {
                j2 = qVar.b;
            } else {
                j2 = qVar.d;
            }
            if (vVar5 == null) {
                rVar2.b0(1691921830);
                rVar2.p(false);
                j = j;
                z6 = z5;
                n0VarA = n0VarA;
                kVar4 = kVar4;
                r10 = 0;
                nVar = null;
            } else {
                rVar2.b0(-499611205);
                int i114 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                objQ = rVar2.Q();
                if (objQ == obj) {
                    objQ = new androidx.compose.runtime.snapshots.q();
                    rVar2.l0(objQ);
                }
                qVar3 = (androidx.compose.runtime.snapshots.q) objQ;
                zF = rVar2.f(kVar4);
                objQ2 = rVar2.Q();
                if (zF) {
                    objQ2 = new t(kVar4, qVar3, null, 0);
                    rVar2.l0(objQ2);
                } else {
                    objQ2 = new t(kVar4, qVar3, null, 0);
                    rVar2.l0(objQ2);
                }
                androidx.compose.runtime.j0.c(rVar2, kVar4, (kotlin.jvm.functions.p) objQ2);
                jVar = (androidx.compose.foundation.interaction.j) kotlin.collections.o.T(qVar3);
                if (!z5) {
                    f = vVar5.e;
                } else if (jVar instanceof androidx.compose.foundation.interaction.m) {
                    f = vVar5.b;
                } else if (jVar instanceof androidx.compose.foundation.interaction.h) {
                    f = vVar5.d;
                } else if (jVar instanceof androidx.compose.foundation.interaction.d) {
                    f = vVar5.c;
                } else {
                    f = vVar5.a;
                }
                objQ3 = rVar2.Q();
                if (objQ3 == obj) {
                    objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                    rVar2.l0(objQ3);
                }
                dVar = (androidx.compose.animation.core.d) objQ3;
                androidx.compose.ui.unit.f fVar8 = new androidx.compose.ui.unit.f(f);
                zH = ((((i114 & 896) ^ 384) <= 256 && rVar2.f(vVar5)) || (i114 & 384) == 256) | rVar2.h(dVar) | rVar2.c(f) | ((((i114 & 14) ^ 6) <= 4 && rVar2.g(z5)) || (i114 & 6) == 4) | rVar2.h(jVar);
                objQ4 = rVar2.Q();
                if (zH) {
                    z6 = z5;
                    objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                    rVar2.l0(objQ4);
                } else {
                    z6 = z5;
                    objQ4 = new u(dVar, f, z6, vVar5, jVar, (kotlin.coroutines.d) null);
                    rVar2.l0(objQ4);
                }
                androidx.compose.runtime.j0.c(rVar2, fVar8, (kotlin.jvm.functions.p) objQ4);
                nVar = dVar.c;
                r10 = 0;
                rVar2.p(false);
            }
            if (nVar != null) {
                f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
            } else {
                f2 = (float) r10;
            }
            float f10 = f2;
            objQ5 = rVar2.Q();
            if (objQ5 == obj) {
                objQ5 = new androidx.compose.foundation.lazy.i(20);
                rVar2.l0(objQ5);
            }
            androidx.compose.ui.r rVarA8 = androidx.compose.ui.semantics.n.a(rVar3, r10, (kotlin.jvm.functions.l) objQ5);
            qVar4 = qVar2;
            androidx.compose.ui.graphics.n0 n0Var10 = n0VarA;
            boolean z14 = z6;
            f3.b(aVar, rVarA8, z14, n0Var10, j, j2, f10, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new z(j2, m0Var11112, qVar4), rVar2), rVar2, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
            kVar2 = kVar3;
            vVar3 = vVar5;
            m0Var2 = m0Var11112;
            rVar4 = rVar3;
            n0Var2 = n0Var10;
            a0Var3 = a0Var4;
            z4 = z14;
        } else {
            rVar2.W();
            m0Var2 = m0Var;
            rVar4 = rVar3;
            a0Var3 = a0Var2;
            z4 = z2;
            n0Var2 = n0VarA;
            vVar3 = vVar2;
            kVar2 = kVar;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar4, z4, n0Var2, qVar, vVar3, a0Var3, m0Var2, kVar2, qVar4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void c(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, a0 a0Var, b0 b0Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i, int i2) {
        int i3;
        a0 a0Var2;
        b0 b0Var2;
        int i4;
        int i5;
        boolean z;
        androidx.compose.runtime.internal.f fVar2;
        a0 a0Var3;
        b0 b0Var3;
        androidx.compose.ui.r rVar3;
        androidx.compose.runtime.q1 q1VarT;
        a0 a0VarM;
        b0 b0VarJ;
        androidx.compose.ui.r rVar4;
        a0 a0Var4;
        b0 b0Var4;
        float f;
        Object objQ;
        rVar2.c0(1359693790);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (rVar2.f(rVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i3 | (rVar2.f(n0Var) ? 32 : 16);
        if ((i2 & 4) == 0) {
            a0Var2 = a0Var;
            int i8 = rVar2.f(a0Var2) ? LibretroCore.SCREEN_WIDTH : 128;
            int i9 = i7 | i8;
            if ((i2 & 8) == 0) {
                b0Var2 = b0Var;
                if (rVar2.f(b0Var2)) {
                    i4 = 2048;
                }
                i5 = i9 | i4 | 24576;
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (rVar2.T(i5 & 1, z)) {
                    rVar2.Y();
                    if ((i & 1) != 0 || rVar2.C()) {
                        if (i6 != 0) {
                            rVar = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            a0VarM = m((n0) rVar2.j(o0.a));
                            i5 &= -897;
                        } else {
                            a0VarM = a0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            b0VarJ = j(63, 0.0f);
                            i5 &= -7169;
                        } else {
                            b0VarJ = b0Var2;
                        }
                        a0 a0Var5 = a0VarM;
                        rVar4 = rVar;
                        a0Var4 = a0Var5;
                        b0Var4 = b0VarJ;
                    } else {
                        rVar2.W();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i5 &= -7169;
                        }
                        rVar4 = rVar;
                        a0Var4 = a0Var2;
                        b0Var4 = b0Var2;
                    }
                    rVar2.q();
                    long j = a0Var4.a;
                    long j2 = a0Var4.b;
                    f = b0Var4.a;
                    rVar2.b0(-1763481333);
                    rVar2.b0(167751211);
                    objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.compose.runtime.s.r(new androidx.compose.ui.unit.f(f));
                        rVar2.l0(objQ);
                    }
                    rVar2.p(false);
                    rVar2.p(false);
                    fVar2 = fVar;
                    f3.a(rVar4, n0Var, j, j2, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.y0) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new d0(fVar2, 0), rVar2), rVar2, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
                    a0Var3 = a0Var4;
                    rVar3 = rVar4;
                    b0Var3 = b0Var4;
                } else {
                    fVar2 = fVar;
                    rVar2.W();
                    a0Var3 = a0Var2;
                    b0Var3 = b0Var2;
                    rVar3 = rVar;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new c0(rVar3, n0Var, a0Var3, b0Var3, fVar2, i, i2);
                }
            }
            b0Var2 = b0Var;
            i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i5 = i9 | i4 | 24576;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (rVar2.T(i5 & 1, z)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        a0VarM = m((n0) rVar2.j(o0.a));
                        i5 &= -897;
                    } else {
                        a0VarM = a0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        b0VarJ = j(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        b0VarJ = b0Var2;
                    }
                    a0 a0Var6 = a0VarM;
                    rVar4 = rVar;
                    a0Var4 = a0Var6;
                    b0Var4 = b0VarJ;
                } else {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        a0VarM = m((n0) rVar2.j(o0.a));
                        i5 &= -897;
                    } else {
                        a0VarM = a0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        b0VarJ = j(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        b0VarJ = b0Var2;
                    }
                    a0 a0Var7 = a0VarM;
                    rVar4 = rVar;
                    a0Var4 = a0Var7;
                    b0Var4 = b0VarJ;
                }
                rVar2.q();
                long j3 = a0Var4.a;
                long j4 = a0Var4.b;
                f = b0Var4.a;
                rVar2.b0(-1763481333);
                rVar2.b0(167751211);
                objQ = rVar2.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.compose.runtime.s.r(new androidx.compose.ui.unit.f(f));
                    rVar2.l0(objQ);
                }
                rVar2.p(false);
                rVar2.p(false);
                fVar2 = fVar;
                f3.a(rVar4, n0Var, j3, j4, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.y0) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new d0(fVar2, 0), rVar2), rVar2, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
                a0Var3 = a0Var4;
                rVar3 = rVar4;
                b0Var3 = b0Var4;
            } else {
                fVar2 = fVar;
                rVar2.W();
                a0Var3 = a0Var2;
                b0Var3 = b0Var2;
                rVar3 = rVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new c0(rVar3, n0Var, a0Var3, b0Var3, fVar2, i, i2);
            }
        }
        a0Var2 = a0Var;
        int i10 = i7 | i8;
        if ((i2 & 8) == 0) {
            b0Var2 = b0Var;
            if (rVar2.f(b0Var2)) {
                i4 = 2048;
            }
            i5 = i10 | i4 | 24576;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (rVar2.T(i5 & 1, z)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        a0VarM = m((n0) rVar2.j(o0.a));
                        i5 &= -897;
                    } else {
                        a0VarM = a0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        b0VarJ = j(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        b0VarJ = b0Var2;
                    }
                    a0 a0Var8 = a0VarM;
                    rVar4 = rVar;
                    a0Var4 = a0Var8;
                    b0Var4 = b0VarJ;
                } else {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        a0VarM = m((n0) rVar2.j(o0.a));
                        i5 &= -897;
                    } else {
                        a0VarM = a0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        b0VarJ = j(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        b0VarJ = b0Var2;
                    }
                    a0 a0Var9 = a0VarM;
                    rVar4 = rVar;
                    a0Var4 = a0Var9;
                    b0Var4 = b0VarJ;
                }
                rVar2.q();
                long j5 = a0Var4.a;
                long j6 = a0Var4.b;
                f = b0Var4.a;
                rVar2.b0(-1763481333);
                rVar2.b0(167751211);
                objQ = rVar2.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.compose.runtime.s.r(new androidx.compose.ui.unit.f(f));
                    rVar2.l0(objQ);
                }
                rVar2.p(false);
                rVar2.p(false);
                fVar2 = fVar;
                f3.a(rVar4, n0Var, j5, j6, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.y0) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new d0(fVar2, 0), rVar2), rVar2, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
                a0Var3 = a0Var4;
                rVar3 = rVar4;
                b0Var3 = b0Var4;
            } else {
                fVar2 = fVar;
                rVar2.W();
                a0Var3 = a0Var2;
                b0Var3 = b0Var2;
                rVar3 = rVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new c0(rVar3, n0Var, a0Var3, b0Var3, fVar2, i, i2);
            }
        }
        b0Var2 = b0Var;
        i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        i5 = i10 | i4 | 24576;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rVar2.T(i5 & 1, z)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                if ((i2 & 4) != 0) {
                    a0VarM = m((n0) rVar2.j(o0.a));
                    i5 &= -897;
                } else {
                    a0VarM = a0Var2;
                }
                if ((i2 & 8) != 0) {
                    b0VarJ = j(63, 0.0f);
                    i5 &= -7169;
                } else {
                    b0VarJ = b0Var2;
                }
                a0 a0Var10 = a0VarM;
                rVar4 = rVar;
                a0Var4 = a0Var10;
                b0Var4 = b0VarJ;
            } else {
                if (i6 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                if ((i2 & 4) != 0) {
                    a0VarM = m((n0) rVar2.j(o0.a));
                    i5 &= -897;
                } else {
                    a0VarM = a0Var2;
                }
                if ((i2 & 8) != 0) {
                    b0VarJ = j(63, 0.0f);
                    i5 &= -7169;
                } else {
                    b0VarJ = b0Var2;
                }
                a0 a0Var11 = a0VarM;
                rVar4 = rVar;
                a0Var4 = a0Var11;
                b0Var4 = b0VarJ;
            }
            rVar2.q();
            long j7 = a0Var4.a;
            long j8 = a0Var4.b;
            f = b0Var4.a;
            rVar2.b0(-1763481333);
            rVar2.b0(167751211);
            objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.compose.runtime.s.r(new androidx.compose.ui.unit.f(f));
                rVar2.l0(objQ);
            }
            rVar2.p(false);
            rVar2.p(false);
            fVar2 = fVar;
            f3.a(rVar4, n0Var, j7, j8, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.y0) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new d0(fVar2, 0), rVar2), rVar2, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
            a0Var3 = a0Var4;
            rVar3 = rVar4;
            b0Var3 = b0Var4;
        } else {
            fVar2 = fVar;
            rVar2.W();
            a0Var3 = a0Var2;
            b0Var3 = b0Var2;
            rVar3 = rVar;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new c0(rVar3, n0Var, a0Var3, b0Var3, fVar2, i, i2);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, final float f, final long j, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        rVar2.c0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            i5 |= rVar2.e(j) ? 256 : 128;
        }
        boolean z = true;
        if (rVar2.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                if (i4 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                f = w0.a;
            } else {
                rVar2.W();
            }
            rVar2.q();
            androidx.compose.ui.r rVarF = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(rVar, 1.0f), f);
            if ((((i5 & 896) ^ 384) <= 256 || !rVar2.e(j)) && (i5 & 384) != 256) {
                z = false;
            }
            Object objQ = rVar2.Q();
            if (z || objQ == androidx.compose.runtime.m.a) {
                objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.x0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                        float f2 = f;
                        float fV = dVar.V(f2);
                        float f3 = 2;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(dVar.V(f2) / f3)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
                        dVar.y(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(dVar.V(f2) / f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fV, (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 0);
                        return kotlin.y.a;
                    }
                };
                rVar2.l0(objQ);
            }
            androidx.compose.foundation.s.b(rVarF, (kotlin.jvm.functions.l) objQ, rVar2, 0);
        } else {
            rVar2.W();
        }
        final androidx.compose.ui.r rVar3 = rVar;
        final float f2 = f;
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.y0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2.d(rVar3, f2, j, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0133  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164  */
    /* JADX WARN: Code duplicated, block: B:97:0x0174  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void e(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, a1 a1Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.n0 n0Var, final kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        int i3;
        androidx.compose.ui.r rVar3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        androidx.compose.foundation.interaction.k kVar2;
        int i7;
        kotlin.jvm.functions.p pVar2;
        boolean z3;
        final androidx.compose.ui.r rVar4;
        final boolean z4;
        final androidx.compose.foundation.interaction.k kVar3;
        final a1 a1Var2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        androidx.compose.runtime.q1 q1VarT;
        androidx.compose.ui.r rVar5;
        long j;
        n0 n0Var3;
        a1 a1Var3;
        long j2;
        int i8;
        androidx.compose.ui.graphics.n0 n0VarA;
        androidx.compose.ui.r rVar6;
        long jB;
        long j3;
        int i9;
        float f = androidx.compose.material3.tokens.r.L;
        rVar2.c0(1413012038);
        if ((i & 6) == 0) {
            i3 = (rVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                rVar3 = rVar;
                i3 |= rVar2.f(rVar3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (rVar2.g(z2)) {
                        i5 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        kVar2 = kVar;
                        if (rVar2.f(kVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= Parser.ARGC_LIMIT;
                    }
                    if ((1572864 & i) == 0) {
                        pVar2 = pVar;
                        if (rVar2.h(pVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    } else {
                        pVar2 = pVar;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rVar2.T(i3 & 1, z3)) {
                        rVar2.Y();
                        if ((i & 1) != 0 || rVar2.C()) {
                            if (i10 != 0) {
                                rVar5 = androidx.compose.ui.o.b;
                            } else {
                                rVar5 = rVar3;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                            n0Var3 = (n0) rVar2.j(o0.a);
                            a1Var3 = n0Var3.b0;
                            if (a1Var3 == null) {
                                long j4 = androidx.compose.ui.graphics.t.h;
                                a1Var3 = new a1(j4, j, j4, androidx.compose.ui.graphics.t.b(f, j));
                                n0Var3.b0 = a1Var3;
                            }
                            int i11 = i3;
                            j2 = a1Var3.b;
                            if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                                jB = androidx.compose.ui.graphics.t.b(f, j);
                                long j5 = a1Var3.a;
                                long j6 = a1Var3.c;
                                if (j == 16) {
                                    j = j2;
                                }
                                if (jB != 16) {
                                    j3 = jB;
                                } else {
                                    j3 = a1Var3.d;
                                }
                                a1Var3 = new a1(j5, j, j6, j3);
                            }
                            if (i6 != 0) {
                                kVar2 = null;
                            }
                            i8 = i11 & (-465921);
                            androidx.compose.ui.r rVar7 = rVar5;
                            n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                            rVar6 = rVar7;
                            a1Var2 = a1Var3;
                        } else {
                            rVar2.W();
                            n0VarA = n0Var;
                            i8 = i3 & (-465921);
                            rVar6 = rVar3;
                            a1Var2 = a1Var;
                        }
                        boolean z5 = z2;
                        kVar3 = kVar2;
                        rVar2.q();
                        int i12 = i8 << 3;
                        f(rVar6, aVar, z5, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i12 & Token.ASSIGN_MOD) | (i8 & 896) | (i12 & 458752) | (i8 & 3670016));
                        n0Var2 = n0VarA;
                        z4 = z5;
                        rVar4 = rVar6;
                    } else {
                        rVar2.W();
                        rVar4 = rVar3;
                        z4 = z2;
                        kVar3 = kVar2;
                        a1Var2 = a1Var;
                        n0Var2 = n0Var;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                kVar2 = kVar;
                if ((196608 & i) == 0) {
                    i3 |= Parser.ARGC_LIMIT;
                }
                if ((1572864 & i) == 0) {
                    pVar2 = pVar;
                    if (rVar2.h(pVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    pVar2 = pVar;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i3 & 1, z3)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        n0Var3 = (n0) rVar2.j(o0.a);
                        a1Var3 = n0Var3.b0;
                        if (a1Var3 == null) {
                            long j7 = androidx.compose.ui.graphics.t.h;
                            a1Var3 = new a1(j7, j, j7, androidx.compose.ui.graphics.t.b(f, j));
                            n0Var3.b0 = a1Var3;
                        }
                        int i13 = i3;
                        j2 = a1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j8 = a1Var3.a;
                            long j9 = a1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = a1Var3.d;
                            }
                            a1Var3 = new a1(j8, j, j9, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i13 & (-465921);
                        androidx.compose.ui.r rVar8 = rVar5;
                        n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                        rVar6 = rVar8;
                        a1Var2 = a1Var3;
                    } else {
                        if (i10 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        n0Var3 = (n0) rVar2.j(o0.a);
                        a1Var3 = n0Var3.b0;
                        if (a1Var3 == null) {
                            long j10 = androidx.compose.ui.graphics.t.h;
                            a1Var3 = new a1(j10, j, j10, androidx.compose.ui.graphics.t.b(f, j));
                            n0Var3.b0 = a1Var3;
                        }
                        int i14 = i3;
                        j2 = a1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j11 = a1Var3.a;
                            long j12 = a1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = a1Var3.d;
                            }
                            a1Var3 = new a1(j11, j, j12, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i14 & (-465921);
                        androidx.compose.ui.r rVar9 = rVar5;
                        n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                        rVar6 = rVar9;
                        a1Var2 = a1Var3;
                    }
                    boolean z6 = z2;
                    kVar3 = kVar2;
                    rVar2.q();
                    int i15 = i8 << 3;
                    f(rVar6, aVar, z6, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i15 & Token.ASSIGN_MOD) | (i8 & 896) | (i15 & 458752) | (i8 & 3670016));
                    n0Var2 = n0VarA;
                    z4 = z6;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    rVar4 = rVar3;
                    z4 = z2;
                    kVar3 = kVar2;
                    a1Var2 = a1Var;
                    n0Var2 = n0Var;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    kVar2 = kVar;
                    if (rVar2.f(kVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= Parser.ARGC_LIMIT;
                }
                if ((1572864 & i) == 0) {
                    pVar2 = pVar;
                    if (rVar2.h(pVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    pVar2 = pVar;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i3 & 1, z3)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        n0Var3 = (n0) rVar2.j(o0.a);
                        a1Var3 = n0Var3.b0;
                        if (a1Var3 == null) {
                            long j13 = androidx.compose.ui.graphics.t.h;
                            a1Var3 = new a1(j13, j, j13, androidx.compose.ui.graphics.t.b(f, j));
                            n0Var3.b0 = a1Var3;
                        }
                        int i16 = i3;
                        j2 = a1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j14 = a1Var3.a;
                            long j15 = a1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = a1Var3.d;
                            }
                            a1Var3 = new a1(j14, j, j15, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i16 & (-465921);
                        androidx.compose.ui.r rVar10 = rVar5;
                        n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                        rVar6 = rVar10;
                        a1Var2 = a1Var3;
                    } else {
                        if (i10 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        n0Var3 = (n0) rVar2.j(o0.a);
                        a1Var3 = n0Var3.b0;
                        if (a1Var3 == null) {
                            long j16 = androidx.compose.ui.graphics.t.h;
                            a1Var3 = new a1(j16, j, j16, androidx.compose.ui.graphics.t.b(f, j));
                            n0Var3.b0 = a1Var3;
                        }
                        int i17 = i3;
                        j2 = a1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j17 = a1Var3.a;
                            long j18 = a1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = a1Var3.d;
                            }
                            a1Var3 = new a1(j17, j, j18, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i17 & (-465921);
                        androidx.compose.ui.r rVar11 = rVar5;
                        n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                        rVar6 = rVar11;
                        a1Var2 = a1Var3;
                    }
                    boolean z7 = z2;
                    kVar3 = kVar2;
                    rVar2.q();
                    int i18 = i8 << 3;
                    f(rVar6, aVar, z7, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i18 & Token.ASSIGN_MOD) | (i8 & 896) | (i18 & 458752) | (i8 & 3670016));
                    n0Var2 = n0VarA;
                    z4 = z7;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    rVar4 = rVar3;
                    z4 = z2;
                    kVar3 = kVar2;
                    a1Var2 = a1Var;
                    n0Var2 = n0Var;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            kVar2 = kVar;
            if ((196608 & i) == 0) {
                i3 |= Parser.ARGC_LIMIT;
            }
            if ((1572864 & i) == 0) {
                pVar2 = pVar;
                if (rVar2.h(pVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                pVar2 = pVar;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i3 & 1, z3)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    n0Var3 = (n0) rVar2.j(o0.a);
                    a1Var3 = n0Var3.b0;
                    if (a1Var3 == null) {
                        long j19 = androidx.compose.ui.graphics.t.h;
                        a1Var3 = new a1(j19, j, j19, androidx.compose.ui.graphics.t.b(f, j));
                        n0Var3.b0 = a1Var3;
                    }
                    int i19 = i3;
                    j2 = a1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j110 = a1Var3.a;
                        long j111 = a1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = a1Var3.d;
                        }
                        a1Var3 = new a1(j110, j, j111, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i19 & (-465921);
                    androidx.compose.ui.r rVar12 = rVar5;
                    n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                    rVar6 = rVar12;
                    a1Var2 = a1Var3;
                } else {
                    if (i10 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    n0Var3 = (n0) rVar2.j(o0.a);
                    a1Var3 = n0Var3.b0;
                    if (a1Var3 == null) {
                        long j112 = androidx.compose.ui.graphics.t.h;
                        a1Var3 = new a1(j112, j, j112, androidx.compose.ui.graphics.t.b(f, j));
                        n0Var3.b0 = a1Var3;
                    }
                    int i110 = i3;
                    j2 = a1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j113 = a1Var3.a;
                        long j114 = a1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = a1Var3.d;
                        }
                        a1Var3 = new a1(j113, j, j114, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i110 & (-465921);
                    androidx.compose.ui.r rVar13 = rVar5;
                    n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                    rVar6 = rVar13;
                    a1Var2 = a1Var3;
                }
                boolean z8 = z2;
                kVar3 = kVar2;
                rVar2.q();
                int i111 = i8 << 3;
                f(rVar6, aVar, z8, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i111 & Token.ASSIGN_MOD) | (i8 & 896) | (i111 & 458752) | (i8 & 3670016));
                n0Var2 = n0VarA;
                z4 = z8;
                rVar4 = rVar6;
            } else {
                rVar2.W();
                rVar4 = rVar3;
                z4 = z2;
                kVar3 = kVar2;
                a1Var2 = a1Var;
                n0Var2 = n0Var;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 48;
        rVar3 = rVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (rVar2.g(z2)) {
                    i5 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    kVar2 = kVar;
                    if (rVar2.f(kVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= Parser.ARGC_LIMIT;
                }
                if ((1572864 & i) == 0) {
                    pVar2 = pVar;
                    if (rVar2.h(pVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    pVar2 = pVar;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rVar2.T(i3 & 1, z3)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        n0Var3 = (n0) rVar2.j(o0.a);
                        a1Var3 = n0Var3.b0;
                        if (a1Var3 == null) {
                            long j115 = androidx.compose.ui.graphics.t.h;
                            a1Var3 = new a1(j115, j, j115, androidx.compose.ui.graphics.t.b(f, j));
                            n0Var3.b0 = a1Var3;
                        }
                        int i112 = i3;
                        j2 = a1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j116 = a1Var3.a;
                            long j117 = a1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = a1Var3.d;
                            }
                            a1Var3 = new a1(j116, j, j117, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i112 & (-465921);
                        androidx.compose.ui.r rVar14 = rVar5;
                        n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                        rVar6 = rVar14;
                        a1Var2 = a1Var3;
                    } else {
                        if (i10 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                        n0Var3 = (n0) rVar2.j(o0.a);
                        a1Var3 = n0Var3.b0;
                        if (a1Var3 == null) {
                            long j118 = androidx.compose.ui.graphics.t.h;
                            a1Var3 = new a1(j118, j, j118, androidx.compose.ui.graphics.t.b(f, j));
                            n0Var3.b0 = a1Var3;
                        }
                        int i113 = i3;
                        j2 = a1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j119 = a1Var3.a;
                            long j1110 = a1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = a1Var3.d;
                            }
                            a1Var3 = new a1(j119, j, j1110, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i113 & (-465921);
                        androidx.compose.ui.r rVar15 = rVar5;
                        n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                        rVar6 = rVar15;
                        a1Var2 = a1Var3;
                    }
                    boolean z9 = z2;
                    kVar3 = kVar2;
                    rVar2.q();
                    int i114 = i8 << 3;
                    f(rVar6, aVar, z9, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i114 & Token.ASSIGN_MOD) | (i8 & 896) | (i114 & 458752) | (i8 & 3670016));
                    n0Var2 = n0VarA;
                    z4 = z9;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    rVar4 = rVar3;
                    z4 = z2;
                    kVar3 = kVar2;
                    a1Var2 = a1Var;
                    n0Var2 = n0Var;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            kVar2 = kVar;
            if ((196608 & i) == 0) {
                i3 |= Parser.ARGC_LIMIT;
            }
            if ((1572864 & i) == 0) {
                pVar2 = pVar;
                if (rVar2.h(pVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                pVar2 = pVar;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i3 & 1, z3)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    n0Var3 = (n0) rVar2.j(o0.a);
                    a1Var3 = n0Var3.b0;
                    if (a1Var3 == null) {
                        long j1111 = androidx.compose.ui.graphics.t.h;
                        a1Var3 = new a1(j1111, j, j1111, androidx.compose.ui.graphics.t.b(f, j));
                        n0Var3.b0 = a1Var3;
                    }
                    int i115 = i3;
                    j2 = a1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j1112 = a1Var3.a;
                        long j1113 = a1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = a1Var3.d;
                        }
                        a1Var3 = new a1(j1112, j, j1113, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i115 & (-465921);
                    androidx.compose.ui.r rVar16 = rVar5;
                    n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                    rVar6 = rVar16;
                    a1Var2 = a1Var3;
                } else {
                    if (i10 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    n0Var3 = (n0) rVar2.j(o0.a);
                    a1Var3 = n0Var3.b0;
                    if (a1Var3 == null) {
                        long j1114 = androidx.compose.ui.graphics.t.h;
                        a1Var3 = new a1(j1114, j, j1114, androidx.compose.ui.graphics.t.b(f, j));
                        n0Var3.b0 = a1Var3;
                    }
                    int i116 = i3;
                    j2 = a1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j1115 = a1Var3.a;
                        long j1116 = a1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = a1Var3.d;
                        }
                        a1Var3 = new a1(j1115, j, j1116, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i116 & (-465921);
                    androidx.compose.ui.r rVar17 = rVar5;
                    n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                    rVar6 = rVar17;
                    a1Var2 = a1Var3;
                }
                boolean z10 = z2;
                kVar3 = kVar2;
                rVar2.q();
                int i117 = i8 << 3;
                f(rVar6, aVar, z10, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i117 & Token.ASSIGN_MOD) | (i8 & 896) | (i117 & 458752) | (i8 & 3670016));
                n0Var2 = n0VarA;
                z4 = z10;
                rVar4 = rVar6;
            } else {
                rVar2.W();
                rVar4 = rVar3;
                z4 = z2;
                kVar3 = kVar2;
                a1Var2 = a1Var;
                n0Var2 = n0Var;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                kVar2 = kVar;
                if (rVar2.f(kVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                i3 |= Parser.ARGC_LIMIT;
            }
            if ((1572864 & i) == 0) {
                pVar2 = pVar;
                if (rVar2.h(pVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                pVar2 = pVar;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i3 & 1, z3)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    n0Var3 = (n0) rVar2.j(o0.a);
                    a1Var3 = n0Var3.b0;
                    if (a1Var3 == null) {
                        long j1117 = androidx.compose.ui.graphics.t.h;
                        a1Var3 = new a1(j1117, j, j1117, androidx.compose.ui.graphics.t.b(f, j));
                        n0Var3.b0 = a1Var3;
                    }
                    int i118 = i3;
                    j2 = a1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j1118 = a1Var3.a;
                        long j1119 = a1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = a1Var3.d;
                        }
                        a1Var3 = new a1(j1118, j, j1119, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i118 & (-465921);
                    androidx.compose.ui.r rVar18 = rVar5;
                    n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                    rVar6 = rVar18;
                    a1Var2 = a1Var3;
                } else {
                    if (i10 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                    n0Var3 = (n0) rVar2.j(o0.a);
                    a1Var3 = n0Var3.b0;
                    if (a1Var3 == null) {
                        long j11110 = androidx.compose.ui.graphics.t.h;
                        a1Var3 = new a1(j11110, j, j11110, androidx.compose.ui.graphics.t.b(f, j));
                        n0Var3.b0 = a1Var3;
                    }
                    int i119 = i3;
                    j2 = a1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j11111 = a1Var3.a;
                        long j11112 = a1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = a1Var3.d;
                        }
                        a1Var3 = new a1(j11111, j, j11112, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i119 & (-465921);
                    androidx.compose.ui.r rVar19 = rVar5;
                    n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                    rVar6 = rVar19;
                    a1Var2 = a1Var3;
                }
                boolean z11 = z2;
                kVar3 = kVar2;
                rVar2.q();
                int i1110 = i8 << 3;
                f(rVar6, aVar, z11, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i1110 & Token.ASSIGN_MOD) | (i8 & 896) | (i1110 & 458752) | (i8 & 3670016));
                n0Var2 = n0VarA;
                z4 = z11;
                rVar4 = rVar6;
            } else {
                rVar2.W();
                rVar4 = rVar3;
                z4 = z2;
                kVar3 = kVar2;
                a1Var2 = a1Var;
                n0Var2 = n0Var;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 24576;
        kVar2 = kVar;
        if ((196608 & i) == 0) {
            i3 |= Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            pVar2 = pVar;
            if (rVar2.h(pVar2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            pVar2 = pVar;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.T(i3 & 1, z3)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                n0Var3 = (n0) rVar2.j(o0.a);
                a1Var3 = n0Var3.b0;
                if (a1Var3 == null) {
                    long j11113 = androidx.compose.ui.graphics.t.h;
                    a1Var3 = new a1(j11113, j, j11113, androidx.compose.ui.graphics.t.b(f, j));
                    n0Var3.b0 = a1Var3;
                }
                int i1111 = i3;
                j2 = a1Var3.b;
                if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                    jB = androidx.compose.ui.graphics.t.b(f, j);
                    long j11114 = a1Var3.a;
                    long j11115 = a1Var3.c;
                    if (j == 16) {
                        j = j2;
                    }
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        j3 = a1Var3.d;
                    }
                    a1Var3 = new a1(j11114, j, j11115, j3);
                }
                if (i6 != 0) {
                    kVar2 = null;
                }
                i8 = i1111 & (-465921);
                androidx.compose.ui.r rVar110 = rVar5;
                n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                rVar6 = rVar110;
                a1Var2 = a1Var3;
            } else {
                if (i10 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                j = ((androidx.compose.ui.graphics.t) rVar2.j(q0.a)).a;
                n0Var3 = (n0) rVar2.j(o0.a);
                a1Var3 = n0Var3.b0;
                if (a1Var3 == null) {
                    long j11116 = androidx.compose.ui.graphics.t.h;
                    a1Var3 = new a1(j11116, j, j11116, androidx.compose.ui.graphics.t.b(f, j));
                    n0Var3.b0 = a1Var3;
                }
                int i1112 = i3;
                j2 = a1Var3.b;
                if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                    jB = androidx.compose.ui.graphics.t.b(f, j);
                    long j11117 = a1Var3.a;
                    long j11118 = a1Var3.c;
                    if (j == 16) {
                        j = j2;
                    }
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        j3 = a1Var3.d;
                    }
                    a1Var3 = new a1(j11117, j, j11118, j3);
                }
                if (i6 != 0) {
                    kVar2 = null;
                }
                i8 = i1112 & (-465921);
                androidx.compose.ui.r rVar111 = rVar5;
                n0VarA = a3.a(androidx.compose.material3.tokens.w.b, rVar2);
                rVar6 = rVar111;
                a1Var2 = a1Var3;
            }
            boolean z12 = z2;
            kVar3 = kVar2;
            rVar2.q();
            int i1113 = i8 << 3;
            f(rVar6, aVar, z12, n0VarA, a1Var2, kVar3, pVar2, rVar2, ((i8 >> 3) & 14) | (i1113 & Token.ASSIGN_MOD) | (i8 & 896) | (i1113 & 458752) | (i8 & 3670016));
            n0Var2 = n0VarA;
            z4 = z12;
            rVar4 = rVar6;
        } else {
            rVar2.W();
            rVar4 = rVar3;
            z4 = z2;
            kVar3 = kVar2;
            a1Var2 = a1Var;
            n0Var2 = n0Var;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.b1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2.e(aVar, rVar4, z4, a1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void f(final androidx.compose.ui.r rVar, final kotlin.jvm.functions.a aVar, final boolean z, final androidx.compose.ui.graphics.n0 n0Var, final a1 a1Var, final androidx.compose.foundation.interaction.k kVar, final kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar2, final int i) {
        int i2;
        androidx.compose.foundation.interaction.k kVar2;
        rVar2.c0(-1134296466);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.f(n0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.f(a1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar2.f(kVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= rVar2.h(pVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (rVar2.T(i3 & 1, (599187 & i3) != 599186)) {
            if (kVar == null) {
                rVar2.b0(977045485);
                Object objQ = rVar2.Q();
                if (objQ == androidx.compose.runtime.m.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                kVar2 = (androidx.compose.foundation.interaction.k) objQ;
                rVar2.p(false);
            } else {
                rVar2.b0(862800938);
                rVar2.p(false);
                kVar2 = kVar;
            }
            androidx.compose.ui.layout.n nVar = i1.a;
            androidx.compose.ui.r rVarD = rVar.d(r1.b);
            float f = androidx.compose.material3.tokens.w.c;
            long jB = _COROUTINE.b.b(androidx.compose.material3.tokens.w.d + f + f, androidx.compose.material3.tokens.w.a);
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.a;
            androidx.compose.ui.r rVarB = androidx.compose.material3.internal.g.b(androidx.compose.foundation.s.i(androidx.compose.foundation.s.f(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.w0.m(rVarD, androidx.compose.ui.unit.h.b(jB), androidx.compose.ui.unit.h.a(jB)), n0Var), z ? a1Var.a : a1Var.c, n0Var), kVar2, u2.a(false, 0.0f, 7), z, new androidx.compose.ui.semantics.h(0), aVar, 8));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarB);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.runtime.s.a(q0.a.a(new androidx.compose.ui.graphics.t(z ? a1Var.b : a1Var.d)), pVar, rVar2, ((i3 >> 15) & Token.ASSIGN_MOD) | 8);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2.f(rVar, aVar, z, n0Var, a1Var, kVar, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void g(final kotlin.jvm.functions.a aVar, final androidx.compose.ui.r rVar, final boolean z, androidx.compose.ui.graphics.n0 n0Var, final q qVar, final androidx.compose.foundation.a0 a0Var, androidx.compose.foundation.layout.m0 m0Var, final androidx.compose.foundation.interaction.k kVar, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, final int i) {
        int i2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final androidx.compose.foundation.layout.m0 m0Var2;
        int i3;
        androidx.compose.ui.graphics.n0 n0Var3;
        rVar2.c0(399974542);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar2.f(qVar) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= rVar2.f(a0Var) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            i5 |= rVar2.f(kVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= rVar2.h(fVar) ? 536870912 : 268435456;
        }
        if (rVar2.T(i5 & 1, (306783379 & i5) != 306783378)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                androidx.compose.foundation.layout.m0 m0Var3 = r.a;
                androidx.compose.ui.graphics.n0 n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                i3 = i5 & (-7169);
                m0Var2 = r.a;
                n0Var3 = n0VarA;
            } else {
                rVar2.W();
                i3 = i5 & (-7169);
                n0Var3 = n0Var;
                m0Var2 = m0Var;
            }
            rVar2.q();
            b(aVar, rVar, z, n0Var3, qVar, null, a0Var, m0Var2, kVar, fVar, rVar2, i3 & 2147483646, 0);
            n0Var2 = n0Var3;
        } else {
            rVar2.W();
            n0Var2 = n0Var;
            m0Var2 = m0Var;
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.x
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2.g(aVar, rVar, z, n0Var2, qVar, a0Var, m0Var2, kVar, fVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void h(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, q qVar, androidx.compose.foundation.layout.m0 m0Var, androidx.compose.foundation.interaction.k kVar, final kotlin.jvm.functions.q qVar2, androidx.compose.runtime.r rVar2, final int i, final int i2) {
        kotlin.jvm.functions.a aVar2;
        int i3;
        androidx.compose.ui.r rVar3;
        int i4;
        int i5;
        androidx.compose.foundation.layout.m0 m0Var2;
        int i6;
        int i7;
        final androidx.compose.foundation.interaction.k kVar2;
        int i8;
        boolean z2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final q qVar3;
        final androidx.compose.foundation.layout.m0 m0Var3;
        final androidx.compose.ui.r rVar4;
        final boolean z3;
        androidx.compose.runtime.q1 q1VarT;
        androidx.compose.ui.r rVar5;
        androidx.compose.ui.graphics.n0 n0VarA;
        n0 n0Var3;
        q qVar4;
        int i9;
        int i10;
        androidx.compose.foundation.interaction.k kVar3;
        q qVar5;
        androidx.compose.foundation.layout.m0 m0Var4;
        androidx.compose.ui.r rVar6;
        boolean z4;
        rVar2.c0(-1061374109);
        if ((i & 6) == 0) {
            aVar2 = aVar;
            i3 = i | (rVar2.h(aVar2) ? 4 : 2);
        } else {
            aVar2 = aVar;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                rVar3 = rVar;
                i3 |= rVar2.f(rVar3) ? 32 : 16;
            }
            i4 = 1779072 | i3;
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((i & 12582912) == 0) {
                    m0Var2 = m0Var;
                    if (rVar2.f(m0Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                i7 = i2 & LibretroCore.SCREEN_WIDTH;
                if (i7 != 0) {
                    if ((i & 100663296) == 0) {
                        kVar2 = kVar;
                        if (rVar2.f(kVar2)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i4 |= i8;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rVar2.T(i4 & 1, z2)) {
                        rVar2.Y();
                        if ((i & 1) != 0 || rVar2.C()) {
                            if (i11 != 0) {
                                rVar5 = androidx.compose.ui.o.b;
                            } else {
                                rVar5 = rVar3;
                            }
                            androidx.compose.foundation.layout.m0 m0Var5 = r.a;
                            n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                            n0Var3 = (n0) rVar2.j(o0.a);
                            qVar4 = n0Var3.Y;
                            if (qVar4 == null) {
                                long j = androidx.compose.ui.graphics.t.h;
                                q qVar6 = new q(j, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                                n0Var3.Y = qVar6;
                                qVar4 = qVar6;
                            }
                            i9 = i4 & (-64513);
                            if (i5 != 0) {
                                m0Var2 = r.b;
                            }
                            if (i7 != 0) {
                                m0Var4 = m0Var2;
                                rVar6 = rVar5;
                                kVar3 = null;
                                z4 = true;
                                i10 = i9;
                                qVar5 = qVar4;
                            } else {
                                i10 = i9;
                                kVar3 = kVar2;
                                qVar5 = qVar4;
                                m0Var4 = m0Var2;
                                rVar6 = rVar5;
                                z4 = true;
                            }
                        } else {
                            rVar2.W();
                            int i12 = i4 & (-64513);
                            qVar5 = qVar;
                            i10 = i12;
                            kVar3 = kVar2;
                            z4 = z;
                            m0Var4 = m0Var2;
                            rVar6 = rVar3;
                            n0VarA = n0Var;
                        }
                        rVar2.q();
                        b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                        qVar3 = qVar5;
                        m0Var3 = m0Var4;
                        kVar2 = kVar3;
                        n0Var2 = n0VarA;
                        z3 = z4;
                        rVar4 = rVar6;
                    } else {
                        rVar2.W();
                        n0Var2 = n0Var;
                        qVar3 = qVar;
                        m0Var3 = m0Var2;
                        rVar4 = rVar3;
                        z3 = z;
                    }
                    q1VarT = rVar2.t();
                    if (q1VarT != null) {
                        q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                kVar2 = kVar;
                if ((306783379 & i4) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rVar2.T(i4 & 1, z2)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        androidx.compose.foundation.layout.m0 m0Var6 = r.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        n0Var3 = (n0) rVar2.j(o0.a);
                        qVar4 = n0Var3.Y;
                        if (qVar4 == null) {
                            long j2 = androidx.compose.ui.graphics.t.h;
                            q qVar7 = new q(j2, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j2, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                            n0Var3.Y = qVar7;
                            qVar4 = qVar7;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            m0Var2 = r.b;
                        }
                        if (i7 != 0) {
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            qVar5 = qVar4;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            qVar5 = qVar4;
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            z4 = true;
                        }
                    } else {
                        if (i11 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        androidx.compose.foundation.layout.m0 m0Var7 = r.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        n0Var3 = (n0) rVar2.j(o0.a);
                        qVar4 = n0Var3.Y;
                        if (qVar4 == null) {
                            long j3 = androidx.compose.ui.graphics.t.h;
                            q qVar8 = new q(j3, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j3, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                            n0Var3.Y = qVar8;
                            qVar4 = qVar8;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            m0Var2 = r.b;
                        }
                        if (i7 != 0) {
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            qVar5 = qVar4;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            qVar5 = qVar4;
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            z4 = true;
                        }
                    }
                    rVar2.q();
                    b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                    qVar3 = qVar5;
                    m0Var3 = m0Var4;
                    kVar2 = kVar3;
                    n0Var2 = n0VarA;
                    z3 = z4;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    n0Var2 = n0Var;
                    qVar3 = qVar;
                    m0Var3 = m0Var2;
                    rVar4 = rVar3;
                    z3 = z;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i4 = 14361984 | i3;
            m0Var2 = m0Var;
            i7 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i7 != 0) {
                if ((i & 100663296) == 0) {
                    kVar2 = kVar;
                    if (rVar2.f(kVar2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                if ((306783379 & i4) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rVar2.T(i4 & 1, z2)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        androidx.compose.foundation.layout.m0 m0Var8 = r.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        n0Var3 = (n0) rVar2.j(o0.a);
                        qVar4 = n0Var3.Y;
                        if (qVar4 == null) {
                            long j4 = androidx.compose.ui.graphics.t.h;
                            q qVar9 = new q(j4, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j4, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                            n0Var3.Y = qVar9;
                            qVar4 = qVar9;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            m0Var2 = r.b;
                        }
                        if (i7 != 0) {
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            qVar5 = qVar4;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            qVar5 = qVar4;
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            z4 = true;
                        }
                    } else {
                        if (i11 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        androidx.compose.foundation.layout.m0 m0Var9 = r.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        n0Var3 = (n0) rVar2.j(o0.a);
                        qVar4 = n0Var3.Y;
                        if (qVar4 == null) {
                            long j5 = androidx.compose.ui.graphics.t.h;
                            q qVar10 = new q(j5, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j5, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                            n0Var3.Y = qVar10;
                            qVar4 = qVar10;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            m0Var2 = r.b;
                        }
                        if (i7 != 0) {
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            qVar5 = qVar4;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            qVar5 = qVar4;
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            z4 = true;
                        }
                    }
                    rVar2.q();
                    b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                    qVar3 = qVar5;
                    m0Var3 = m0Var4;
                    kVar2 = kVar3;
                    n0Var2 = n0VarA;
                    z3 = z4;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    n0Var2 = n0Var;
                    qVar3 = qVar;
                    m0Var3 = m0Var2;
                    rVar4 = rVar3;
                    z3 = z;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            kVar2 = kVar;
            if ((306783379 & i4) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rVar2.T(i4 & 1, z2)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    androidx.compose.foundation.layout.m0 m0Var10 = r.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    n0Var3 = (n0) rVar2.j(o0.a);
                    qVar4 = n0Var3.Y;
                    if (qVar4 == null) {
                        long j6 = androidx.compose.ui.graphics.t.h;
                        q qVar11 = new q(j6, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j6, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                        n0Var3.Y = qVar11;
                        qVar4 = qVar11;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        m0Var2 = r.b;
                    }
                    if (i7 != 0) {
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        qVar5 = qVar4;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        qVar5 = qVar4;
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        z4 = true;
                    }
                } else {
                    if (i11 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    androidx.compose.foundation.layout.m0 m0Var11 = r.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    n0Var3 = (n0) rVar2.j(o0.a);
                    qVar4 = n0Var3.Y;
                    if (qVar4 == null) {
                        long j7 = androidx.compose.ui.graphics.t.h;
                        q qVar12 = new q(j7, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j7, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                        n0Var3.Y = qVar12;
                        qVar4 = qVar12;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        m0Var2 = r.b;
                    }
                    if (i7 != 0) {
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        qVar5 = qVar4;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        qVar5 = qVar4;
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        z4 = true;
                    }
                }
                rVar2.q();
                b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                qVar3 = qVar5;
                m0Var3 = m0Var4;
                kVar2 = kVar3;
                n0Var2 = n0VarA;
                z3 = z4;
                rVar4 = rVar6;
            } else {
                rVar2.W();
                n0Var2 = n0Var;
                qVar3 = qVar;
                m0Var3 = m0Var2;
                rVar4 = rVar3;
                z3 = z;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 48;
        rVar3 = rVar;
        i4 = 1779072 | i3;
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((i & 12582912) == 0) {
                m0Var2 = m0Var;
                if (rVar2.f(m0Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            i7 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i7 != 0) {
                if ((i & 100663296) == 0) {
                    kVar2 = kVar;
                    if (rVar2.f(kVar2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                if ((306783379 & i4) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rVar2.T(i4 & 1, z2)) {
                    rVar2.Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        androidx.compose.foundation.layout.m0 m0Var12 = r.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        n0Var3 = (n0) rVar2.j(o0.a);
                        qVar4 = n0Var3.Y;
                        if (qVar4 == null) {
                            long j8 = androidx.compose.ui.graphics.t.h;
                            q qVar13 = new q(j8, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j8, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                            n0Var3.Y = qVar13;
                            qVar4 = qVar13;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            m0Var2 = r.b;
                        }
                        if (i7 != 0) {
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            qVar5 = qVar4;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            qVar5 = qVar4;
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            z4 = true;
                        }
                    } else {
                        if (i11 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        androidx.compose.foundation.layout.m0 m0Var13 = r.a;
                        n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                        n0Var3 = (n0) rVar2.j(o0.a);
                        qVar4 = n0Var3.Y;
                        if (qVar4 == null) {
                            long j9 = androidx.compose.ui.graphics.t.h;
                            q qVar14 = new q(j9, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j9, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                            n0Var3.Y = qVar14;
                            qVar4 = qVar14;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            m0Var2 = r.b;
                        }
                        if (i7 != 0) {
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            qVar5 = qVar4;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            qVar5 = qVar4;
                            m0Var4 = m0Var2;
                            rVar6 = rVar5;
                            z4 = true;
                        }
                    }
                    rVar2.q();
                    b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                    qVar3 = qVar5;
                    m0Var3 = m0Var4;
                    kVar2 = kVar3;
                    n0Var2 = n0VarA;
                    z3 = z4;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    n0Var2 = n0Var;
                    qVar3 = qVar;
                    m0Var3 = m0Var2;
                    rVar4 = rVar3;
                    z3 = z;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            kVar2 = kVar;
            if ((306783379 & i4) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rVar2.T(i4 & 1, z2)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    androidx.compose.foundation.layout.m0 m0Var14 = r.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    n0Var3 = (n0) rVar2.j(o0.a);
                    qVar4 = n0Var3.Y;
                    if (qVar4 == null) {
                        long j10 = androidx.compose.ui.graphics.t.h;
                        q qVar15 = new q(j10, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j10, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                        n0Var3.Y = qVar15;
                        qVar4 = qVar15;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        m0Var2 = r.b;
                    }
                    if (i7 != 0) {
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        qVar5 = qVar4;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        qVar5 = qVar4;
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        z4 = true;
                    }
                } else {
                    if (i11 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    androidx.compose.foundation.layout.m0 m0Var15 = r.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    n0Var3 = (n0) rVar2.j(o0.a);
                    qVar4 = n0Var3.Y;
                    if (qVar4 == null) {
                        long j11 = androidx.compose.ui.graphics.t.h;
                        q qVar16 = new q(j11, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j11, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                        n0Var3.Y = qVar16;
                        qVar4 = qVar16;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        m0Var2 = r.b;
                    }
                    if (i7 != 0) {
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        qVar5 = qVar4;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        qVar5 = qVar4;
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        z4 = true;
                    }
                }
                rVar2.q();
                b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                qVar3 = qVar5;
                m0Var3 = m0Var4;
                kVar2 = kVar3;
                n0Var2 = n0VarA;
                z3 = z4;
                rVar4 = rVar6;
            } else {
                rVar2.W();
                n0Var2 = n0Var;
                qVar3 = qVar;
                m0Var3 = m0Var2;
                rVar4 = rVar3;
                z3 = z;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i4 = 14361984 | i3;
        m0Var2 = m0Var;
        i7 = i2 & LibretroCore.SCREEN_WIDTH;
        if (i7 != 0) {
            if ((i & 100663296) == 0) {
                kVar2 = kVar;
                if (rVar2.f(kVar2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((306783379 & i4) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rVar2.T(i4 & 1, z2)) {
                rVar2.Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    androidx.compose.foundation.layout.m0 m0Var16 = r.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    n0Var3 = (n0) rVar2.j(o0.a);
                    qVar4 = n0Var3.Y;
                    if (qVar4 == null) {
                        long j12 = androidx.compose.ui.graphics.t.h;
                        q qVar17 = new q(j12, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j12, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                        n0Var3.Y = qVar17;
                        qVar4 = qVar17;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        m0Var2 = r.b;
                    }
                    if (i7 != 0) {
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        qVar5 = qVar4;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        qVar5 = qVar4;
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        z4 = true;
                    }
                } else {
                    if (i11 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    androidx.compose.foundation.layout.m0 m0Var17 = r.a;
                    n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                    n0Var3 = (n0) rVar2.j(o0.a);
                    qVar4 = n0Var3.Y;
                    if (qVar4 == null) {
                        long j13 = androidx.compose.ui.graphics.t.h;
                        q qVar18 = new q(j13, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j13, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                        n0Var3.Y = qVar18;
                        qVar4 = qVar18;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        m0Var2 = r.b;
                    }
                    if (i7 != 0) {
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        qVar5 = qVar4;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        qVar5 = qVar4;
                        m0Var4 = m0Var2;
                        rVar6 = rVar5;
                        z4 = true;
                    }
                }
                rVar2.q();
                b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
                qVar3 = qVar5;
                m0Var3 = m0Var4;
                kVar2 = kVar3;
                n0Var2 = n0VarA;
                z3 = z4;
                rVar4 = rVar6;
            } else {
                rVar2.W();
                n0Var2 = n0Var;
                qVar3 = qVar;
                m0Var3 = m0Var2;
                rVar4 = rVar3;
                z3 = z;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        kVar2 = kVar;
        if ((306783379 & i4) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rVar2.T(i4 & 1, z2)) {
            rVar2.Y();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                androidx.compose.foundation.layout.m0 m0Var18 = r.a;
                n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                n0Var3 = (n0) rVar2.j(o0.a);
                qVar4 = n0Var3.Y;
                if (qVar4 == null) {
                    long j14 = androidx.compose.ui.graphics.t.h;
                    q qVar19 = new q(j14, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j14, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                    n0Var3.Y = qVar19;
                    qVar4 = qVar19;
                }
                i9 = i4 & (-64513);
                if (i5 != 0) {
                    m0Var2 = r.b;
                }
                if (i7 != 0) {
                    m0Var4 = m0Var2;
                    rVar6 = rVar5;
                    kVar3 = null;
                    z4 = true;
                    i10 = i9;
                    qVar5 = qVar4;
                } else {
                    i10 = i9;
                    kVar3 = kVar2;
                    qVar5 = qVar4;
                    m0Var4 = m0Var2;
                    rVar6 = rVar5;
                    z4 = true;
                }
            } else {
                if (i11 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                androidx.compose.foundation.layout.m0 m0Var19 = r.a;
                n0VarA = a3.a(androidx.compose.material3.tokens.b.b, rVar2);
                n0Var3 = (n0) rVar2.j(o0.a);
                qVar4 = n0Var3.Y;
                if (qVar4 == null) {
                    long j15 = androidx.compose.ui.graphics.t.h;
                    q qVar110 = new q(j15, o0.c(n0Var3, androidx.compose.material3.tokens.f.F), j15, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.K, o0.c(n0Var3, androidx.compose.material3.tokens.r.J)));
                    n0Var3.Y = qVar110;
                    qVar4 = qVar110;
                }
                i9 = i4 & (-64513);
                if (i5 != 0) {
                    m0Var2 = r.b;
                }
                if (i7 != 0) {
                    m0Var4 = m0Var2;
                    rVar6 = rVar5;
                    kVar3 = null;
                    z4 = true;
                    i10 = i9;
                    qVar5 = qVar4;
                } else {
                    i10 = i9;
                    kVar3 = kVar2;
                    qVar5 = qVar4;
                    m0Var4 = m0Var2;
                    rVar6 = rVar5;
                    z4 = true;
                }
            }
            rVar2.q();
            b(aVar2, rVar6, z4, n0VarA, qVar5, null, null, m0Var4, kVar3, qVar2, rVar2, i10 & 2147483646, 0);
            qVar3 = qVar5;
            m0Var3 = m0Var4;
            kVar2 = kVar3;
            n0Var2 = n0VarA;
            z3 = z4;
            rVar4 = rVar6;
        } else {
            rVar2.W();
            n0Var2 = n0Var;
            qVar3 = qVar;
            m0Var3 = m0Var2;
            rVar4 = rVar3;
            z3 = z;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.w
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2.h(aVar, rVar4, z3, n0Var2, qVar3, m0Var3, kVar2, qVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static a0 i(long j, androidx.compose.runtime.r rVar, int i) {
        long jB = o0.b(j, rVar);
        long j2 = androidx.compose.ui.graphics.t.i;
        long jB2 = androidx.compose.ui.graphics.t.b(0.38f, jB);
        a0 a0VarM = m((n0) rVar.j(o0.a));
        long j3 = j != 16 ? j : a0VarM.a;
        if (jB == 16) {
            jB = a0VarM.b;
        }
        long j4 = jB;
        if (j2 == 16) {
            j2 = a0VarM.c;
        }
        long j5 = j2;
        if (jB2 == 16) {
            jB2 = a0VarM.d;
        }
        return new a0(j3, j4, j5, jB2);
    }

    public static b0 j(int i, float f) {
        if ((i & 1) != 0) {
            f = androidx.compose.material3.tokens.k.b;
        }
        return new b0(f, androidx.compose.material3.tokens.k.i, androidx.compose.material3.tokens.k.g, androidx.compose.material3.tokens.k.h, androidx.compose.material3.tokens.k.f, androidx.compose.material3.tokens.k.d);
    }

    public static g3 k(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, androidx.compose.runtime.r rVar, int i) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13 = androidx.compose.ui.graphics.t.h;
        long jD = o0.d(androidx.compose.material3.tokens.x.p, rVar);
        long jD2 = o0.d(androidx.compose.material3.tokens.x.v, rVar);
        long jD3 = o0.d(androidx.compose.material3.tokens.x.x, rVar);
        if ((i & LibretroCore.SCREEN_WIDTH) != 0) {
            j9 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.b, o0.d(androidx.compose.material3.tokens.x.a, rVar)), ((n0) rVar.j(o0.a)).p);
        } else {
            j9 = j5;
        }
        if ((i & 512) != 0) {
            j10 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.f, o0.d(androidx.compose.material3.tokens.x.e, rVar)), ((n0) rVar.j(o0.a)).p);
        } else {
            j10 = j6;
        }
        long jB = androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.d, o0.d(androidx.compose.material3.tokens.x.c, rVar));
        androidx.compose.runtime.u2 u2Var = o0.a;
        long j14 = androidx.compose.ui.graphics.a0.j(jB, ((n0) rVar.j(u2Var)).p);
        if ((i & 4096) != 0) {
            j11 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.h, o0.d(androidx.compose.material3.tokens.x.g, rVar)), ((n0) rVar.j(u2Var)).p);
        } else {
            j11 = j7;
        }
        if ((i & 8192) != 0) {
            j12 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.f, o0.d(androidx.compose.material3.tokens.x.k, rVar)), ((n0) rVar.j(u2Var)).p);
        } else {
            j12 = j8;
        }
        return new g3(j, j2, j13, jD, j3, j4, jD2, jD3, j9, j10, j13, j14, j11, j12, androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.f, o0.d(androidx.compose.material3.tokens.x.l, rVar)), ((n0) rVar.j(u2Var)).p), androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.x.j, o0.d(androidx.compose.material3.tokens.x.i, rVar)), ((n0) rVar.j(u2Var)).p));
    }

    public static p2 l(long j, long j2, androidx.compose.runtime.r rVar) {
        long j3 = androidx.compose.ui.graphics.t.i;
        n0 n0Var = (n0) rVar.j(o0.a);
        p2 p2Var = n0Var.d0;
        if (p2Var == null) {
            p2 p2Var2 = new p2(o0.c(n0Var, androidx.compose.material3.tokens.t.d), o0.c(n0Var, androidx.compose.material3.tokens.t.f), androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, androidx.compose.material3.tokens.t.a)), androidx.compose.ui.graphics.t.b(0.38f, o0.c(n0Var, androidx.compose.material3.tokens.t.b)));
            n0Var.d0 = p2Var2;
            p2Var = p2Var2;
        }
        long j4 = j != 16 ? j : p2Var.a;
        long j5 = j2 != 16 ? j2 : p2Var.b;
        long j6 = j3 != 16 ? j3 : p2Var.c;
        if (j3 == 16) {
            j3 = p2Var.d;
        }
        return new p2(j4, j5, j6, j3);
    }

    public static a0 m(n0 n0Var) {
        a0 a0Var = n0Var.Z;
        if (a0Var != null) {
            return a0Var;
        }
        androidx.compose.material3.tokens.f fVar = androidx.compose.material3.tokens.k.a;
        a0 a0Var2 = new a0(o0.c(n0Var, fVar), o0.a(n0Var, o0.c(n0Var, fVar)), androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.k.e, o0.c(n0Var, androidx.compose.material3.tokens.k.c)), o0.c(n0Var, fVar)), androidx.compose.ui.graphics.t.b(0.38f, o0.a(n0Var, o0.c(n0Var, fVar))));
        n0Var.Z = a0Var2;
        return a0Var2;
    }

    public static t3 n(androidx.compose.runtime.r rVar) {
        return (t3) rVar.j(u3.a);
    }

    public static final androidx.compose.animation.core.k1 o(androidx.compose.material3.tokens.p pVar, androidx.compose.runtime.r rVar) {
        t1 t1Var = (t1) rVar.j(j1.a);
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 0) {
            t1Var.getClass();
            androidx.compose.animation.core.k1 k1Var = t1.b;
            k1Var.getClass();
            return k1Var;
        }
        if (iOrdinal == 1) {
            t1Var.getClass();
            androidx.compose.animation.core.k1 k1Var2 = t1.c;
            k1Var2.getClass();
            return k1Var2;
        }
        if (iOrdinal == 2) {
            t1Var.getClass();
            androidx.compose.animation.core.k1 k1Var3 = t1.d;
            k1Var3.getClass();
            return k1Var3;
        }
        if (iOrdinal == 3) {
            t1Var.getClass();
            androidx.compose.animation.core.k1 k1Var4 = t1.e;
            k1Var4.getClass();
            return k1Var4;
        }
        if (iOrdinal == 4) {
            t1Var.getClass();
            androidx.compose.animation.core.k1 k1Var5 = t1.f;
            k1Var5.getClass();
            return k1Var5;
        }
        if (iOrdinal != 5) {
            coil3.g.a();
            return null;
        }
        t1Var.getClass();
        androidx.compose.animation.core.k1 k1Var6 = t1.g;
        k1Var6.getClass();
        return k1Var6;
    }
}
