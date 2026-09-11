package androidx.media3.extractor.mp3;

import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.m;
import androidx.media3.extractor.metadata.id3.l;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.v;
import androidx.media3.extractor.y;
import java.io.EOFException;
import java.math.RoundingMode;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {
    public final long a;
    public final w b;
    public final y c;
    public final v d;
    public final androidx.media3.exoplayer.hls.c e;
    public final m f;
    public p g;
    public h0 h;
    public h0 i;
    public int j;
    public androidx.media3.common.h0 k;
    public androidx.media3.common.h0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public h r;
    public boolean s;
    public boolean t;
    public long u;

    public d(long j) {
        this.a = j;
        this.b = new w(10);
        this.c = new y();
        this.d = new v();
        this.m = -9223372036854775807L;
        this.e = new androidx.media3.exoplayer.hls.c(4);
        m mVar = new m();
        this.f = mVar;
        this.i = mVar;
        this.p = -1L;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return h(oVar, true);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        if (this.r instanceof b) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251  */
    /* JADX WARN: Code duplicated, block: B:108:0x0264  */
    /* JADX WARN: Code duplicated, block: B:110:0x026c  */
    /* JADX WARN: Code duplicated, block: B:114:0x027c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x0286  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x028a  */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:146:0x032b  */
    /* JADX WARN: Code duplicated, block: B:147:0x032f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0336  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0344  */
    /* JADX WARN: Code duplicated, block: B:154:0x0353  */
    /* JADX WARN: Code duplicated, block: B:157:0x0358 A[LOOP:0: B:148:0x0334->B:157:0x0358, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x0362  */
    /* JADX WARN: Code duplicated, block: B:164:0x036a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0378  */
    /* JADX WARN: Code duplicated, block: B:169:0x038c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0391 A[LOOP:1: B:163:0x0368->B:172:0x0391, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x039a  */
    /* JADX WARN: Code duplicated, block: B:177:0x039e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03bf A[LOOP:2: B:179:0x03bd->B:180:0x03bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:187:0x0401  */
    /* JADX WARN: Code duplicated, block: B:188:0x0404 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0407  */
    /* JADX WARN: Code duplicated, block: B:192:0x040b  */
    /* JADX WARN: Code duplicated, block: B:193:0x043c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0461 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0463  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:204:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04da  */
    /* JADX WARN: Code duplicated, block: B:211:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x055d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0568  */
    /* JADX WARN: Code duplicated, block: B:234:0x056b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0573  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:249:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x035d A[EDGE_INSN: B:250:0x035d->B:159:0x035d BREAK  A[LOOP:0: B:148:0x0334->B:157:0x0358], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0396 A[EDGE_INSN: B:252:0x0396->B:174:0x0396 BREAK  A[LOOP:1: B:163:0x0368->B:172:0x0391], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb A[LOOP:4: B:77:0x01b9->B:78:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01df  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0209  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0237  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws Throwable {
        y yVar;
        Throwable th;
        int i;
        long j;
        h hVar;
        w wVar;
        boolean z;
        long j2;
        long j3;
        long position;
        long j4;
        ?? r4;
        int iA;
        int i2;
        int iM;
        w wVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2;
        v vVar;
        y yVar2;
        int i7;
        int iM3;
        int iD;
        long jMin;
        long[] jArr;
        f fVar;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        f fVar2;
        androidx.media3.common.h0 h0Var;
        long position2;
        long length;
        long jW;
        long j6;
        long j7;
        h aVar;
        long length2;
        long jW2;
        float fIntBitsToFloat;
        e eVarA;
        e eVarA2;
        int i14;
        long[] jArr2;
        int i15;
        androidx.media3.common.h0 h0Var2;
        long position3;
        g0[] g0VarArr;
        int length3;
        int i16;
        g0 g0Var;
        l lVar;
        int[] iArr;
        g0[] g0VarArr2;
        int length4;
        int i17;
        g0 g0Var2;
        androidx.media3.extractor.metadata.id3.n nVar;
        char c;
        long jQ;
        int length5;
        long[] jArr3;
        long[] jArr4;
        long j8;
        int i18;
        c cVar;
        g0 g0Var3;
        g0 g0Var4;
        boolean z2;
        h gVar;
        boolean z3;
        androidx.media3.common.h0 h0VarB;
        androidx.media3.common.h0 h0Var3;
        q qVar;
        long length6;
        long position4;
        long j9;
        long j10;
        int iM4;
        long jW3;
        int iG;
        int iG2;
        int iG3;
        long[] jArr5;
        long[] jArr6;
        y yVar3;
        long j11;
        int i19;
        long j12;
        long jMax;
        y yVar4;
        int iZ;
        this.h.getClass();
        String str = j0.a;
        int i20 = this.j;
        int i21 = 0;
        y yVar5 = this.c;
        if (i20 == 0) {
            try {
                h(oVar, false);
                hVar = this.r;
                wVar = this.b;
                if (hVar == null) {
                    wVar2 = new w(yVar5.b);
                    th = null;
                    oVar.x(wVar2.a, 0, yVar5.b);
                    i3 = yVar5.a & 1;
                    i4 = yVar5.d;
                    i5 = 21;
                    j = 1000000;
                    if (i3 != 0) {
                        if (i4 != 1) {
                            i6 = 36;
                        }
                        j2 = -9223372036854775807L;
                        if (wVar2.c >= i6 + 4) {
                            wVar2.M(i6);
                            iM2 = wVar2.m();
                            if (iM2 != 1483304551 && iM2 != 1231971951) {
                                if (wVar2.c >= 40) {
                                    wVar2.M(36);
                                    if (wVar2.m() == 1447187017) {
                                        iM2 = 1447187017;
                                    } else {
                                        iM2 = 0;
                                    }
                                } else {
                                    iM2 = 0;
                                }
                            }
                        } else if (wVar2.c >= 40) {
                            wVar2.M(36);
                            if (wVar2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                        vVar = this.d;
                        if (iM2 == 1231971951) {
                            yVar2 = yVar5;
                            i7 = 0;
                            iM3 = wVar2.m();
                            if ((iM3 & 1) != 0) {
                                iD = wVar2.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jMin = wVar2.B();
                            } else {
                                jMin = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i15 = 0;
                                for (i14 = 100; i15 < i14; i14 = 100) {
                                    jArr2[i15] = wVar2.z();
                                    i15++;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iM3 & 8) != 0) {
                                wVar2.N(4);
                            }
                            if (wVar2.a() >= 24) {
                                wVar2.N(11);
                                fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                                int iG4 = wVar2.G();
                                int iG5 = wVar2.G();
                                eVarA = e.a(iG4);
                                eVarA2 = e.a(iG5);
                                if (fIntBitsToFloat > 0.0f && eVarA == null && eVarA2 == null) {
                                    fVar = null;
                                } else {
                                    fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                                }
                                wVar2.N(2);
                                int iC = wVar2.C();
                                i9 = (16773120 & iC) >> 12;
                                i8 = iC & 4095;
                            } else {
                                fVar = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iD;
                            i10 = yVar2.b;
                            i11 = yVar2.c;
                            i12 = yVar2.e;
                            i13 = yVar2.f;
                            fVar2 = fVar;
                            if ((vVar.a != -1 || vVar.b == -1) && i9 != -1 && i8 != -1) {
                                vVar.a = i9;
                                vVar.b = i8;
                            }
                            if (fVar2 != null) {
                                h0Var = new androidx.media3.common.h0(fVar2);
                            } else {
                                h0Var = null;
                            }
                            this.l = h0Var;
                            position2 = oVar.getPosition();
                            oVar.r(yVar2.b);
                            if (iM2 == 1483304551) {
                                length2 = oVar.getLength();
                                if (j5 != -1 || j5 == 0) {
                                    jW2 = -9223372036854775807L;
                                } else {
                                    jW2 = j0.W(i11, (j5 * ((long) i13)) - 1);
                                }
                                if (jW2 == -9223372036854775807L) {
                                    aVar = null;
                                } else {
                                    if (jMin != -1 && length2 != -1 && position2 + jMin != length2) {
                                        long j13 = length2 - position2;
                                        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j13, "Data size mismatch between stream (", ") and Xing frame (");
                                        sbM.append(jMin);
                                        sbM.append("), using smaller value.");
                                        androidx.media3.common.util.c.k("XingSeeker", sbM.toString());
                                        jMin = Math.min(jMin, j13);
                                    }
                                    aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                                }
                            } else {
                                length = oVar.getLength();
                                jW = (j5 != -1 || j5 == 0) ? -9223372036854775807L : j0.W(i11, (((long) i13) * j5) - 1);
                                if (jW != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        long j14 = position2 + jMin;
                                        j6 = jMin - ((long) i10);
                                        j7 = j14;
                                    } else if (length != -1) {
                                        j6 = (length - position2) - ((long) i10);
                                        j7 = length;
                                    } else {
                                        aVar = null;
                                    }
                                    long j15 = j6;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j15, 8000000L, jW, roundingMode)), a0.c(com.google.common.base.b.f(j15, j5, roundingMode)), false, true);
                                } else {
                                    aVar = null;
                                }
                            }
                        } else if (iM2 != 1447187017) {
                            length6 = oVar.getLength();
                            position4 = oVar.getPosition();
                            wVar2.N(6);
                            int iM5 = wVar2.m();
                            i7 = 0;
                            j9 = position4 + ((long) yVar5.b);
                            j10 = j9 + ((long) iM5);
                            iM4 = wVar2.m();
                            if (iM4 <= 0) {
                                jW3 = j0.W(yVar5.c, (((long) iM4) * ((long) yVar5.f)) - 1);
                                iG = wVar2.G();
                                iG2 = wVar2.G();
                                iG3 = wVar2.G();
                                wVar2.N(2);
                                jArr5 = new long[iG];
                                jArr6 = new long[iG];
                                yVar3 = yVar5;
                                j11 = position4 + ((long) yVar5.b);
                                i19 = 0;
                                while (true) {
                                    if (i19 < iG) {
                                        long[] jArr7 = jArr5;
                                        long[] jArr8 = jArr6;
                                        y yVar6 = yVar3;
                                        if (length6 != -1 || length6 == j10) {
                                            j12 = j10;
                                        } else {
                                            StringBuilder sbM2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(length6, "VBRI data size mismatch: ", ", ");
                                            j12 = j10;
                                            sbM2.append(j12);
                                            androidx.media3.common.util.c.t("VbriSeeker", sbM2.toString());
                                        }
                                        if (j12 != j11) {
                                            StringBuilder sbM3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                            sbM3.append(j11);
                                            sbM3.append("\nSeeking will be inaccurate.");
                                            androidx.media3.common.util.c.t("VbriSeeker", sbM3.toString());
                                            jMax = Math.max(j12, j11);
                                        } else {
                                            jMax = j12;
                                        }
                                        yVar2 = yVar6;
                                        aVar = new i(jArr7, jArr8, jW3, j9, jMax, yVar2.e);
                                        break;
                                    }
                                    long[] jArr9 = jArr6;
                                    yVar4 = yVar3;
                                    int i22 = i19;
                                    long[] jArr10 = jArr5;
                                    jArr10[i22] = (((long) i19) * jW3) / ((long) iG);
                                    jArr9[i22] = j11;
                                    if (iG3 != 1) {
                                        iZ = wVar2.z();
                                    } else if (iG3 != 2) {
                                        iZ = wVar2.G();
                                    } else if (iG3 != 3) {
                                        iZ = wVar2.C();
                                    } else {
                                        if (iG3 != 4) {
                                            aVar = null;
                                            yVar2 = yVar4;
                                            break;
                                        }
                                        iZ = wVar2.D();
                                    }
                                    j11 += ((long) iZ) * ((long) iG2);
                                    i19 = i22 + 1;
                                    jArr6 = jArr9;
                                    yVar3 = yVar4;
                                    jArr5 = jArr10;
                                }
                            } else {
                                aVar = null;
                                yVar2 = yVar5;
                            }
                            oVar.r(yVar2.b);
                        } else if (iM2 != 1483304551) {
                            oVar.n();
                            aVar = null;
                            yVar2 = yVar5;
                            i7 = 0;
                        } else {
                            yVar2 = yVar5;
                            i7 = 0;
                            iM3 = wVar2.m();
                            if ((iM3 & 1) != 0) {
                                iD = wVar2.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jMin = wVar2.B();
                            } else {
                                jMin = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i15 = 0;
                                while (i15 < i14) {
                                    jArr2[i15] = wVar2.z();
                                    i15++;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iM3 & 8) != 0) {
                                wVar2.N(4);
                            }
                            if (wVar2.a() >= 24) {
                                wVar2.N(11);
                                fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                                int iG6 = wVar2.G();
                                int iG7 = wVar2.G();
                                eVarA = e.a(iG6);
                                eVarA2 = e.a(iG7);
                                if (fIntBitsToFloat > 0.0f) {
                                    fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                                } else {
                                    fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                                }
                                wVar2.N(2);
                                int iC2 = wVar2.C();
                                i9 = (16773120 & iC2) >> 12;
                                i8 = iC2 & 4095;
                            } else {
                                fVar = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iD;
                            i10 = yVar2.b;
                            i11 = yVar2.c;
                            i12 = yVar2.e;
                            i13 = yVar2.f;
                            fVar2 = fVar;
                            if (vVar.a != -1) {
                                vVar.a = i9;
                                vVar.b = i8;
                            } else {
                                vVar.a = i9;
                                vVar.b = i8;
                            }
                            if (fVar2 != null) {
                                h0Var = new androidx.media3.common.h0(fVar2);
                            } else {
                                h0Var = null;
                            }
                            this.l = h0Var;
                            position2 = oVar.getPosition();
                            oVar.r(yVar2.b);
                            if (iM2 == 1483304551) {
                                length2 = oVar.getLength();
                                if (j5 != -1) {
                                    jW2 = -9223372036854775807L;
                                } else {
                                    jW2 = -9223372036854775807L;
                                }
                                if (jW2 == -9223372036854775807L) {
                                    aVar = null;
                                } else {
                                    if (jMin != -1) {
                                        long j16 = length2 - position2;
                                        StringBuilder sbM4 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j16, "Data size mismatch between stream (", ") and Xing frame (");
                                        sbM4.append(jMin);
                                        sbM4.append("), using smaller value.");
                                        androidx.media3.common.util.c.k("XingSeeker", sbM4.toString());
                                        jMin = Math.min(jMin, j16);
                                    }
                                    aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                                }
                            } else {
                                length = oVar.getLength();
                                if (j5 != -1) {
                                }
                                if (jW != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        long j17 = position2 + jMin;
                                        j6 = jMin - ((long) i10);
                                        j7 = j17;
                                    } else if (length != -1) {
                                        j6 = (length - position2) - ((long) i10);
                                        j7 = length;
                                    } else {
                                        aVar = null;
                                    }
                                    long j18 = j6;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j18, 8000000L, jW, roundingMode2)), a0.c(com.google.common.base.b.f(j18, j5, roundingMode2)), false, true);
                                } else {
                                    aVar = null;
                                }
                            }
                        }
                        h0Var2 = this.k;
                        position3 = oVar.getPosition();
                        if (h0Var2 == null) {
                            cVar = null;
                        } else {
                            g0VarArr = h0Var2.a;
                            length3 = g0VarArr.length;
                            i16 = i7;
                            while (true) {
                                if (i16 < length3) {
                                    g0Var = null;
                                    break;
                                }
                                g0Var4 = g0VarArr[i16];
                                if (l.class.isAssignableFrom(g0Var4.getClass())) {
                                    g0Var = (g0) l.class.cast(g0Var4);
                                    if (!com.google.common.base.o.e.mo13apply(g0Var)) {
                                        g0Var = null;
                                    }
                                } else {
                                    g0Var = null;
                                }
                                if (g0Var != null) {
                                    break;
                                }
                                i16++;
                            }
                            lVar = (l) g0Var;
                            if (lVar == null) {
                                cVar = null;
                            } else {
                                iArr = lVar.e;
                                g0VarArr2 = h0Var2.a;
                                length4 = g0VarArr2.length;
                                i17 = 0;
                                while (true) {
                                    if (i17 < length4) {
                                        g0Var2 = null;
                                        break;
                                    }
                                    g0Var3 = g0VarArr2[i17];
                                    if (androidx.media3.extractor.metadata.id3.n.class.isAssignableFrom(g0Var3.getClass())) {
                                        g0Var2 = (g0) androidx.media3.extractor.metadata.id3.n.class.cast(g0Var3);
                                        if (!((androidx.media3.extractor.metadata.id3.n) g0Var2).a.equals("TLEN")) {
                                            g0Var2 = null;
                                        }
                                    } else {
                                        g0Var2 = null;
                                    }
                                    if (g0Var2 != null) {
                                        break;
                                    }
                                    i17++;
                                }
                                nVar = (androidx.media3.extractor.metadata.id3.n) g0Var2;
                                if (nVar == null) {
                                    jQ = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    jQ = j0.Q(Long.parseLong((String) nVar.c.get(0)));
                                }
                                length5 = iArr.length;
                                int i23 = length5 + 1;
                                jArr3 = new long[i23];
                                jArr4 = new long[i23];
                                jArr3[c] = position3;
                                jArr4[c] = 0;
                                j8 = 0;
                                i18 = 1;
                                while (i18 <= length5) {
                                    int i24 = i18 - 1;
                                    long j19 = position3 + ((long) (lVar.c + iArr[i24]));
                                    j8 += (long) (lVar.d + lVar.f[i24]);
                                    jArr3[i18] = j19;
                                    jArr4[i18] = j8;
                                    i18++;
                                    length5 = length5;
                                    position3 = j19;
                                }
                                cVar = new c(jQ, jArr3, jArr4);
                            }
                        }
                        if (this.s) {
                            gVar = new g(-9223372036854775807L);
                            wVar = wVar;
                            vVar = vVar;
                            yVar = yVar2;
                            z3 = true;
                            i21 = 0;
                        } else {
                            j2 = -9223372036854775807L;
                            if (cVar != null) {
                                aVar = cVar;
                            } else if (aVar == null) {
                                aVar = null;
                            }
                            if (aVar == null) {
                                int i25 = i7;
                                oVar.x(wVar.a, i25, 4);
                                wVar.M(i25);
                                yVar2.a(wVar.m());
                                yVar = yVar2;
                                z2 = true;
                                i21 = 0;
                                aVar = new a(oVar.getLength(), oVar.getPosition(), yVar2.e, yVar2.b, false, true);
                            } else {
                                yVar = yVar2;
                                z2 = true;
                                i21 = 0;
                            }
                            aVar.c();
                            aVar.c();
                            this.h.d(aVar.g());
                            gVar = aVar;
                            z3 = z2;
                        }
                        this.r = gVar;
                        this.g.g(gVar);
                        h0VarB = this.k;
                        h0Var3 = this.l;
                        if (h0VarB != null) {
                            if (h0Var3 != null) {
                                h0VarB = h0VarB.b(h0Var3);
                            }
                            h0Var3 = h0VarB;
                        }
                        qVar = new q();
                        qVar.m = i0.p("audio/mpeg");
                        qVar.n = i0.p((String) yVar.g);
                        qVar.o = 4096;
                        qVar.F = yVar.d;
                        qVar.G = yVar.c;
                        qVar.I = vVar.a;
                        qVar.J = vVar.b;
                        qVar.k = h0Var3;
                        if (this.r.f() != -2147483647) {
                            qVar.h = this.r.f();
                        }
                        this.i.e(new androidx.media3.common.r(qVar));
                        this.o = oVar.getPosition();
                        j3 = 0;
                        r4 = z3;
                    } else if (i4 == 1) {
                        i5 = 13;
                    }
                    i6 = i5;
                    j2 = -9223372036854775807L;
                    if (wVar2.c >= i6 + 4) {
                        wVar2.M(i6);
                        iM2 = wVar2.m();
                        if (iM2 != 1483304551) {
                            if (wVar2.c >= 40) {
                                wVar2.M(36);
                                if (wVar2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (wVar2.c >= 40) {
                        wVar2.M(36);
                        if (wVar2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    vVar = this.d;
                    if (iM2 == 1231971951) {
                        yVar2 = yVar5;
                        i7 = 0;
                        iM3 = wVar2.m();
                        if ((iM3 & 1) != 0) {
                            iD = wVar2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = wVar2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = wVar2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            wVar2.N(4);
                        }
                        if (wVar2.a() >= 24) {
                            wVar2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                            int iG8 = wVar2.G();
                            int iG9 = wVar2.G();
                            eVarA = e.a(iG8);
                            eVarA2 = e.a(iG9);
                            if (fIntBitsToFloat > 0.0f) {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            } else {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            }
                            wVar2.N(2);
                            int iC3 = wVar2.C();
                            i9 = (16773120 & iC3) >> 12;
                            i8 = iC3 & 4095;
                        } else {
                            fVar = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = yVar2.b;
                        i11 = yVar2.c;
                        i12 = yVar2.e;
                        i13 = yVar2.f;
                        fVar2 = fVar;
                        if (vVar.a != -1) {
                            vVar.a = i9;
                            vVar.b = i8;
                        } else {
                            vVar.a = i9;
                            vVar.b = i8;
                        }
                        if (fVar2 != null) {
                            h0Var = new androidx.media3.common.h0(fVar2);
                        } else {
                            h0Var = null;
                        }
                        this.l = h0Var;
                        position2 = oVar.getPosition();
                        oVar.r(yVar2.b);
                        if (iM2 == 1483304551) {
                            length2 = oVar.getLength();
                            if (j5 != -1) {
                                jW2 = -9223372036854775807L;
                            } else {
                                jW2 = -9223372036854775807L;
                            }
                            if (jW2 == -9223372036854775807L) {
                                aVar = null;
                            } else {
                                if (jMin != -1) {
                                    long j110 = length2 - position2;
                                    StringBuilder sbM5 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j110, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbM5.append(jMin);
                                    sbM5.append("), using smaller value.");
                                    androidx.media3.common.util.c.k("XingSeeker", sbM5.toString());
                                    jMin = Math.min(jMin, j110);
                                }
                                aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                            }
                        } else {
                            length = oVar.getLength();
                            if (j5 != -1) {
                            }
                            if (jW != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j111 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j111;
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    aVar = null;
                                }
                                long j112 = j6;
                                RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j112, 8000000L, jW, roundingMode3)), a0.c(com.google.common.base.b.f(j112, j5, roundingMode3)), false, true);
                            } else {
                                aVar = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length6 = oVar.getLength();
                        position4 = oVar.getPosition();
                        wVar2.N(6);
                        int iM6 = wVar2.m();
                        i7 = 0;
                        j9 = position4 + ((long) yVar5.b);
                        j10 = j9 + ((long) iM6);
                        iM4 = wVar2.m();
                        if (iM4 <= 0) {
                            jW3 = j0.W(yVar5.c, (((long) iM4) * ((long) yVar5.f)) - 1);
                            iG = wVar2.G();
                            iG2 = wVar2.G();
                            iG3 = wVar2.G();
                            wVar2.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            yVar3 = yVar5;
                            j11 = position4 + ((long) yVar5.b);
                            i19 = 0;
                            while (true) {
                                if (i19 < iG) {
                                    long[] jArr11 = jArr5;
                                    long[] jArr12 = jArr6;
                                    y yVar7 = yVar3;
                                    if (length6 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        StringBuilder sbM6 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbM6.append(j11);
                                        sbM6.append("\nSeeking will be inaccurate.");
                                        androidx.media3.common.util.c.t("VbriSeeker", sbM6.toString());
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    yVar2 = yVar7;
                                    aVar = new i(jArr11, jArr12, jW3, j9, jMax, yVar2.e);
                                    break;
                                }
                                long[] jArr13 = jArr6;
                                yVar4 = yVar3;
                                int i26 = i19;
                                long[] jArr14 = jArr5;
                                jArr14[i26] = (((long) i19) * jW3) / ((long) iG);
                                jArr13[i26] = j11;
                                if (iG3 != 1) {
                                    iZ = wVar2.z();
                                } else if (iG3 != 2) {
                                    iZ = wVar2.G();
                                } else if (iG3 != 3) {
                                    iZ = wVar2.C();
                                } else {
                                    if (iG3 != 4) {
                                        aVar = null;
                                        yVar2 = yVar4;
                                        break;
                                    }
                                    iZ = wVar2.D();
                                }
                                j11 += ((long) iZ) * ((long) iG2);
                                i19 = i26 + 1;
                                jArr6 = jArr13;
                                yVar3 = yVar4;
                                jArr5 = jArr14;
                            }
                        } else {
                            aVar = null;
                            yVar2 = yVar5;
                        }
                        oVar.r(yVar2.b);
                    } else if (iM2 != 1483304551) {
                        oVar.n();
                        aVar = null;
                        yVar2 = yVar5;
                        i7 = 0;
                    } else {
                        yVar2 = yVar5;
                        i7 = 0;
                        iM3 = wVar2.m();
                        if ((iM3 & 1) != 0) {
                            iD = wVar2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = wVar2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = wVar2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            wVar2.N(4);
                        }
                        if (wVar2.a() >= 24) {
                            wVar2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                            int iG10 = wVar2.G();
                            int iG11 = wVar2.G();
                            eVarA = e.a(iG10);
                            eVarA2 = e.a(iG11);
                            if (fIntBitsToFloat > 0.0f) {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            } else {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            }
                            wVar2.N(2);
                            int iC4 = wVar2.C();
                            i9 = (16773120 & iC4) >> 12;
                            i8 = iC4 & 4095;
                        } else {
                            fVar = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = yVar2.b;
                        i11 = yVar2.c;
                        i12 = yVar2.e;
                        i13 = yVar2.f;
                        fVar2 = fVar;
                        if (vVar.a != -1) {
                            vVar.a = i9;
                            vVar.b = i8;
                        } else {
                            vVar.a = i9;
                            vVar.b = i8;
                        }
                        if (fVar2 != null) {
                            h0Var = new androidx.media3.common.h0(fVar2);
                        } else {
                            h0Var = null;
                        }
                        this.l = h0Var;
                        position2 = oVar.getPosition();
                        oVar.r(yVar2.b);
                        if (iM2 == 1483304551) {
                            length2 = oVar.getLength();
                            if (j5 != -1) {
                                jW2 = -9223372036854775807L;
                            } else {
                                jW2 = -9223372036854775807L;
                            }
                            if (jW2 == -9223372036854775807L) {
                                aVar = null;
                            } else {
                                if (jMin != -1) {
                                    long j113 = length2 - position2;
                                    StringBuilder sbM7 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j113, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbM7.append(jMin);
                                    sbM7.append("), using smaller value.");
                                    androidx.media3.common.util.c.k("XingSeeker", sbM7.toString());
                                    jMin = Math.min(jMin, j113);
                                }
                                aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                            }
                        } else {
                            length = oVar.getLength();
                            if (j5 != -1) {
                            }
                            if (jW != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j114 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j114;
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    aVar = null;
                                }
                                long j115 = j6;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j115, 8000000L, jW, roundingMode4)), a0.c(com.google.common.base.b.f(j115, j5, roundingMode4)), false, true);
                            } else {
                                aVar = null;
                            }
                        }
                    }
                    h0Var2 = this.k;
                    position3 = oVar.getPosition();
                    if (h0Var2 == null) {
                        cVar = null;
                    } else {
                        g0VarArr = h0Var2.a;
                        length3 = g0VarArr.length;
                        i16 = i7;
                        while (true) {
                            if (i16 < length3) {
                                g0Var = null;
                                break;
                            }
                            g0Var4 = g0VarArr[i16];
                            if (l.class.isAssignableFrom(g0Var4.getClass())) {
                                g0Var = (g0) l.class.cast(g0Var4);
                                if (!com.google.common.base.o.e.mo13apply(g0Var)) {
                                    g0Var = null;
                                }
                            } else {
                                g0Var = null;
                            }
                            if (g0Var != null) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        lVar = (l) g0Var;
                        if (lVar == null) {
                            cVar = null;
                        } else {
                            iArr = lVar.e;
                            g0VarArr2 = h0Var2.a;
                            length4 = g0VarArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length4) {
                                    g0Var2 = null;
                                    break;
                                }
                                g0Var3 = g0VarArr2[i17];
                                if (androidx.media3.extractor.metadata.id3.n.class.isAssignableFrom(g0Var3.getClass())) {
                                    g0Var2 = (g0) androidx.media3.extractor.metadata.id3.n.class.cast(g0Var3);
                                    if (!((androidx.media3.extractor.metadata.id3.n) g0Var2).a.equals("TLEN")) {
                                        g0Var2 = null;
                                    }
                                } else {
                                    g0Var2 = null;
                                }
                                if (g0Var2 != null) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            nVar = (androidx.media3.extractor.metadata.id3.n) g0Var2;
                            if (nVar == null) {
                                jQ = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jQ = j0.Q(Long.parseLong((String) nVar.c.get(0)));
                            }
                            length5 = iArr.length;
                            int i27 = length5 + 1;
                            jArr3 = new long[i27];
                            jArr4 = new long[i27];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i18 = 1;
                            while (i18 <= length5) {
                                int i28 = i18 - 1;
                                long j116 = position3 + ((long) (lVar.c + iArr[i28]));
                                j8 += (long) (lVar.d + lVar.f[i28]);
                                jArr3[i18] = j116;
                                jArr4[i18] = j8;
                                i18++;
                                length5 = length5;
                                position3 = j116;
                            }
                            cVar = new c(jQ, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        gVar = new g(-9223372036854775807L);
                        wVar = wVar;
                        vVar = vVar;
                        yVar = yVar2;
                        z3 = true;
                        i21 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (cVar != null) {
                            aVar = cVar;
                        } else if (aVar == null) {
                            aVar = null;
                        }
                        if (aVar == null) {
                            int i29 = i7;
                            oVar.x(wVar.a, i29, 4);
                            wVar.M(i29);
                            yVar2.a(wVar.m());
                            yVar = yVar2;
                            z2 = true;
                            i21 = 0;
                            aVar = new a(oVar.getLength(), oVar.getPosition(), yVar2.e, yVar2.b, false, true);
                        } else {
                            yVar = yVar2;
                            z2 = true;
                            i21 = 0;
                        }
                        aVar.c();
                        aVar.c();
                        this.h.d(aVar.g());
                        gVar = aVar;
                        z3 = z2;
                    }
                    this.r = gVar;
                    this.g.g(gVar);
                    h0VarB = this.k;
                    h0Var3 = this.l;
                    if (h0VarB != null) {
                        if (h0Var3 != null) {
                            h0VarB = h0VarB.b(h0Var3);
                        }
                        h0Var3 = h0VarB;
                    }
                    qVar = new q();
                    qVar.m = i0.p("audio/mpeg");
                    qVar.n = i0.p((String) yVar.g);
                    qVar.o = 4096;
                    qVar.F = yVar.d;
                    qVar.G = yVar.c;
                    qVar.I = vVar.a;
                    qVar.J = vVar.b;
                    qVar.k = h0Var3;
                    if (this.r.f() != -2147483647) {
                        qVar.h = this.r.f();
                    }
                    this.i.e(new androidx.media3.common.r(qVar));
                    this.o = oVar.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else {
                    yVar = yVar5;
                    wVar = wVar;
                    z = true;
                    th = null;
                    j = 1000000;
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    if (this.o != 0) {
                        position = oVar.getPosition();
                        j4 = this.o;
                        if (position < j4) {
                            r4 = z;
                            r4 = z;
                            oVar.r((int) (j4 - position));
                            r4 = z;
                        }
                    }
                }
                r4 = z;
                r4 = z;
                r4 = z;
                if (this.q == 0) {
                    oVar.n();
                    if (g(oVar)) {
                        i = -1;
                        i21 = -1;
                    } else {
                        wVar.M(i21);
                        iM = wVar.m();
                        if (((-128000) & iM) == (((long) this.j) & (-128000)) || androidx.media3.extractor.b.h(iM) == -1) {
                            oVar.r(r4);
                            this.j = i21;
                        } else {
                            yVar.a(iM);
                            if (this.m == j2) {
                                this.m = this.r.a(oVar.getPosition());
                                long j20 = this.a;
                                if (j20 != j2) {
                                    this.m = (j20 - this.r.a(j3)) + this.m;
                                }
                            }
                            this.q = yVar.b;
                            this.p = oVar.getPosition() + ((long) yVar.b);
                            if (this.r instanceof b) {
                                long j21 = ((this.n + ((long) yVar.f)) * j) / ((long) yVar.c);
                                throw th;
                            }
                            iA = this.i.a(oVar, this.q, r4);
                            if (iA == -1) {
                                i = -1;
                                i21 = -1;
                            } else {
                                i2 = this.q - iA;
                                this.q = i2;
                                if (i2 <= 0) {
                                    this.i.g(this.m + ((this.n * j) / ((long) yVar.c)), 1, yVar.b, 0, null);
                                    this.n += (long) yVar.f;
                                    this.q = i21;
                                }
                            }
                        }
                        i = -1;
                    }
                } else {
                    iA = this.i.a(oVar, this.q, r4);
                    if (iA == -1) {
                        i = -1;
                        i21 = -1;
                    } else {
                        i2 = this.q - iA;
                        this.q = i2;
                        if (i2 <= 0) {
                            this.i.g(this.m + ((this.n * j) / ((long) yVar.c)), 1, yVar.b, 0, null);
                            this.n += (long) yVar.f;
                            this.q = i21;
                        }
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                yVar = yVar5;
                th = null;
                i = -1;
                i21 = -1;
                j = 1000000;
            }
        } else {
            hVar = this.r;
            wVar = this.b;
            if (hVar == null) {
                wVar2 = new w(yVar5.b);
                th = null;
                oVar.x(wVar2.a, 0, yVar5.b);
                i3 = yVar5.a & 1;
                i4 = yVar5.d;
                i5 = 21;
                j = 1000000;
                if (i3 != 0) {
                    if (i4 != 1) {
                        i6 = 36;
                    }
                    j2 = -9223372036854775807L;
                    if (wVar2.c >= i6 + 4) {
                        wVar2.M(i6);
                        iM2 = wVar2.m();
                        if (iM2 != 1483304551) {
                            if (wVar2.c >= 40) {
                                wVar2.M(36);
                                if (wVar2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (wVar2.c >= 40) {
                        wVar2.M(36);
                        if (wVar2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    vVar = this.d;
                    if (iM2 == 1231971951) {
                        yVar2 = yVar5;
                        i7 = 0;
                        iM3 = wVar2.m();
                        if ((iM3 & 1) != 0) {
                            iD = wVar2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = wVar2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = wVar2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            wVar2.N(4);
                        }
                        if (wVar2.a() >= 24) {
                            wVar2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                            int iG12 = wVar2.G();
                            int iG13 = wVar2.G();
                            eVarA = e.a(iG12);
                            eVarA2 = e.a(iG13);
                            if (fIntBitsToFloat > 0.0f) {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            } else {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            }
                            wVar2.N(2);
                            int iC5 = wVar2.C();
                            i9 = (16773120 & iC5) >> 12;
                            i8 = iC5 & 4095;
                        } else {
                            fVar = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = yVar2.b;
                        i11 = yVar2.c;
                        i12 = yVar2.e;
                        i13 = yVar2.f;
                        fVar2 = fVar;
                        if (vVar.a != -1) {
                            vVar.a = i9;
                            vVar.b = i8;
                        } else {
                            vVar.a = i9;
                            vVar.b = i8;
                        }
                        if (fVar2 != null) {
                            h0Var = new androidx.media3.common.h0(fVar2);
                        } else {
                            h0Var = null;
                        }
                        this.l = h0Var;
                        position2 = oVar.getPosition();
                        oVar.r(yVar2.b);
                        if (iM2 == 1483304551) {
                            length2 = oVar.getLength();
                            if (j5 != -1) {
                                jW2 = -9223372036854775807L;
                            } else {
                                jW2 = -9223372036854775807L;
                            }
                            if (jW2 == -9223372036854775807L) {
                                aVar = null;
                            } else {
                                if (jMin != -1) {
                                    long j117 = length2 - position2;
                                    StringBuilder sbM8 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j117, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbM8.append(jMin);
                                    sbM8.append("), using smaller value.");
                                    androidx.media3.common.util.c.k("XingSeeker", sbM8.toString());
                                    jMin = Math.min(jMin, j117);
                                }
                                aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                            }
                        } else {
                            length = oVar.getLength();
                            if (j5 != -1) {
                            }
                            if (jW != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j118 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j118;
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    aVar = null;
                                }
                                long j119 = j6;
                                RoundingMode roundingMode5 = RoundingMode.HALF_UP;
                                aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j119, 8000000L, jW, roundingMode5)), a0.c(com.google.common.base.b.f(j119, j5, roundingMode5)), false, true);
                            } else {
                                aVar = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length6 = oVar.getLength();
                        position4 = oVar.getPosition();
                        wVar2.N(6);
                        int iM7 = wVar2.m();
                        i7 = 0;
                        j9 = position4 + ((long) yVar5.b);
                        j10 = j9 + ((long) iM7);
                        iM4 = wVar2.m();
                        if (iM4 <= 0) {
                            jW3 = j0.W(yVar5.c, (((long) iM4) * ((long) yVar5.f)) - 1);
                            iG = wVar2.G();
                            iG2 = wVar2.G();
                            iG3 = wVar2.G();
                            wVar2.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            yVar3 = yVar5;
                            j11 = position4 + ((long) yVar5.b);
                            i19 = 0;
                            while (true) {
                                if (i19 < iG) {
                                    long[] jArr15 = jArr5;
                                    long[] jArr16 = jArr6;
                                    y yVar8 = yVar3;
                                    if (length6 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        StringBuilder sbM9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbM9.append(j11);
                                        sbM9.append("\nSeeking will be inaccurate.");
                                        androidx.media3.common.util.c.t("VbriSeeker", sbM9.toString());
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    yVar2 = yVar8;
                                    aVar = new i(jArr15, jArr16, jW3, j9, jMax, yVar2.e);
                                    break;
                                }
                                long[] jArr17 = jArr6;
                                yVar4 = yVar3;
                                int i210 = i19;
                                long[] jArr18 = jArr5;
                                jArr18[i210] = (((long) i19) * jW3) / ((long) iG);
                                jArr17[i210] = j11;
                                if (iG3 != 1) {
                                    iZ = wVar2.z();
                                } else if (iG3 != 2) {
                                    iZ = wVar2.G();
                                } else if (iG3 != 3) {
                                    iZ = wVar2.C();
                                } else {
                                    if (iG3 != 4) {
                                        aVar = null;
                                        yVar2 = yVar4;
                                        break;
                                    }
                                    iZ = wVar2.D();
                                }
                                j11 += ((long) iZ) * ((long) iG2);
                                i19 = i210 + 1;
                                jArr6 = jArr17;
                                yVar3 = yVar4;
                                jArr5 = jArr18;
                            }
                        } else {
                            aVar = null;
                            yVar2 = yVar5;
                        }
                        oVar.r(yVar2.b);
                    } else if (iM2 != 1483304551) {
                        oVar.n();
                        aVar = null;
                        yVar2 = yVar5;
                        i7 = 0;
                    } else {
                        yVar2 = yVar5;
                        i7 = 0;
                        iM3 = wVar2.m();
                        if ((iM3 & 1) != 0) {
                            iD = wVar2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = wVar2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = wVar2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            wVar2.N(4);
                        }
                        if (wVar2.a() >= 24) {
                            wVar2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                            int iG14 = wVar2.G();
                            int iG15 = wVar2.G();
                            eVarA = e.a(iG14);
                            eVarA2 = e.a(iG15);
                            if (fIntBitsToFloat > 0.0f) {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            } else {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            }
                            wVar2.N(2);
                            int iC6 = wVar2.C();
                            i9 = (16773120 & iC6) >> 12;
                            i8 = iC6 & 4095;
                        } else {
                            fVar = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = yVar2.b;
                        i11 = yVar2.c;
                        i12 = yVar2.e;
                        i13 = yVar2.f;
                        fVar2 = fVar;
                        if (vVar.a != -1) {
                            vVar.a = i9;
                            vVar.b = i8;
                        } else {
                            vVar.a = i9;
                            vVar.b = i8;
                        }
                        if (fVar2 != null) {
                            h0Var = new androidx.media3.common.h0(fVar2);
                        } else {
                            h0Var = null;
                        }
                        this.l = h0Var;
                        position2 = oVar.getPosition();
                        oVar.r(yVar2.b);
                        if (iM2 == 1483304551) {
                            length2 = oVar.getLength();
                            if (j5 != -1) {
                                jW2 = -9223372036854775807L;
                            } else {
                                jW2 = -9223372036854775807L;
                            }
                            if (jW2 == -9223372036854775807L) {
                                aVar = null;
                            } else {
                                if (jMin != -1) {
                                    long j1110 = length2 - position2;
                                    StringBuilder sbM10 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j1110, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbM10.append(jMin);
                                    sbM10.append("), using smaller value.");
                                    androidx.media3.common.util.c.k("XingSeeker", sbM10.toString());
                                    jMin = Math.min(jMin, j1110);
                                }
                                aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                            }
                        } else {
                            length = oVar.getLength();
                            if (j5 != -1) {
                            }
                            if (jW != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j1111 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j1111;
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    aVar = null;
                                }
                                long j1112 = j6;
                                RoundingMode roundingMode6 = RoundingMode.HALF_UP;
                                aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j1112, 8000000L, jW, roundingMode6)), a0.c(com.google.common.base.b.f(j1112, j5, roundingMode6)), false, true);
                            } else {
                                aVar = null;
                            }
                        }
                    }
                    h0Var2 = this.k;
                    position3 = oVar.getPosition();
                    if (h0Var2 == null) {
                        cVar = null;
                    } else {
                        g0VarArr = h0Var2.a;
                        length3 = g0VarArr.length;
                        i16 = i7;
                        while (true) {
                            if (i16 < length3) {
                                g0Var = null;
                                break;
                            }
                            g0Var4 = g0VarArr[i16];
                            if (l.class.isAssignableFrom(g0Var4.getClass())) {
                                g0Var = (g0) l.class.cast(g0Var4);
                                if (!com.google.common.base.o.e.mo13apply(g0Var)) {
                                    g0Var = null;
                                }
                            } else {
                                g0Var = null;
                            }
                            if (g0Var != null) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        lVar = (l) g0Var;
                        if (lVar == null) {
                            cVar = null;
                        } else {
                            iArr = lVar.e;
                            g0VarArr2 = h0Var2.a;
                            length4 = g0VarArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length4) {
                                    g0Var2 = null;
                                    break;
                                }
                                g0Var3 = g0VarArr2[i17];
                                if (androidx.media3.extractor.metadata.id3.n.class.isAssignableFrom(g0Var3.getClass())) {
                                    g0Var2 = (g0) androidx.media3.extractor.metadata.id3.n.class.cast(g0Var3);
                                    if (!((androidx.media3.extractor.metadata.id3.n) g0Var2).a.equals("TLEN")) {
                                        g0Var2 = null;
                                    }
                                } else {
                                    g0Var2 = null;
                                }
                                if (g0Var2 != null) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            nVar = (androidx.media3.extractor.metadata.id3.n) g0Var2;
                            if (nVar == null) {
                                jQ = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jQ = j0.Q(Long.parseLong((String) nVar.c.get(0)));
                            }
                            length5 = iArr.length;
                            int i211 = length5 + 1;
                            jArr3 = new long[i211];
                            jArr4 = new long[i211];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i18 = 1;
                            while (i18 <= length5) {
                                int i212 = i18 - 1;
                                long j1113 = position3 + ((long) (lVar.c + iArr[i212]));
                                j8 += (long) (lVar.d + lVar.f[i212]);
                                jArr3[i18] = j1113;
                                jArr4[i18] = j8;
                                i18++;
                                length5 = length5;
                                position3 = j1113;
                            }
                            cVar = new c(jQ, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        gVar = new g(-9223372036854775807L);
                        wVar = wVar;
                        vVar = vVar;
                        yVar = yVar2;
                        z3 = true;
                        i21 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (cVar != null) {
                            aVar = cVar;
                        } else if (aVar == null) {
                            aVar = null;
                        }
                        if (aVar == null) {
                            int i213 = i7;
                            oVar.x(wVar.a, i213, 4);
                            wVar.M(i213);
                            yVar2.a(wVar.m());
                            yVar = yVar2;
                            z2 = true;
                            i21 = 0;
                            aVar = new a(oVar.getLength(), oVar.getPosition(), yVar2.e, yVar2.b, false, true);
                        } else {
                            yVar = yVar2;
                            z2 = true;
                            i21 = 0;
                        }
                        aVar.c();
                        aVar.c();
                        this.h.d(aVar.g());
                        gVar = aVar;
                        z3 = z2;
                    }
                    this.r = gVar;
                    this.g.g(gVar);
                    h0VarB = this.k;
                    h0Var3 = this.l;
                    if (h0VarB != null) {
                        if (h0Var3 != null) {
                            h0VarB = h0VarB.b(h0Var3);
                        }
                        h0Var3 = h0VarB;
                    }
                    qVar = new q();
                    qVar.m = i0.p("audio/mpeg");
                    qVar.n = i0.p((String) yVar.g);
                    qVar.o = 4096;
                    qVar.F = yVar.d;
                    qVar.G = yVar.c;
                    qVar.I = vVar.a;
                    qVar.J = vVar.b;
                    qVar.k = h0Var3;
                    if (this.r.f() != -2147483647) {
                        qVar.h = this.r.f();
                    }
                    this.i.e(new androidx.media3.common.r(qVar));
                    this.o = oVar.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else if (i4 == 1) {
                    i5 = 13;
                }
                i6 = i5;
                j2 = -9223372036854775807L;
                if (wVar2.c >= i6 + 4) {
                    wVar2.M(i6);
                    iM2 = wVar2.m();
                    if (iM2 != 1483304551) {
                        if (wVar2.c >= 40) {
                            wVar2.M(36);
                            if (wVar2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (wVar2.c >= 40) {
                    wVar2.M(36);
                    if (wVar2.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                vVar = this.d;
                if (iM2 == 1231971951) {
                    yVar2 = yVar5;
                    i7 = 0;
                    iM3 = wVar2.m();
                    if ((iM3 & 1) != 0) {
                        iD = wVar2.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jMin = wVar2.B();
                    } else {
                        jMin = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        i15 = 0;
                        while (i15 < i14) {
                            jArr2[i15] = wVar2.z();
                            i15++;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        wVar2.N(4);
                    }
                    if (wVar2.a() >= 24) {
                        wVar2.N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                        int iG16 = wVar2.G();
                        int iG17 = wVar2.G();
                        eVarA = e.a(iG16);
                        eVarA2 = e.a(iG17);
                        if (fIntBitsToFloat > 0.0f) {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        } else {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        }
                        wVar2.N(2);
                        int iC7 = wVar2.C();
                        i9 = (16773120 & iC7) >> 12;
                        i8 = iC7 & 4095;
                    } else {
                        fVar = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iD;
                    i10 = yVar2.b;
                    i11 = yVar2.c;
                    i12 = yVar2.e;
                    i13 = yVar2.f;
                    fVar2 = fVar;
                    if (vVar.a != -1) {
                        vVar.a = i9;
                        vVar.b = i8;
                    } else {
                        vVar.a = i9;
                        vVar.b = i8;
                    }
                    if (fVar2 != null) {
                        h0Var = new androidx.media3.common.h0(fVar2);
                    } else {
                        h0Var = null;
                    }
                    this.l = h0Var;
                    position2 = oVar.getPosition();
                    oVar.r(yVar2.b);
                    if (iM2 == 1483304551) {
                        length2 = oVar.getLength();
                        if (j5 != -1) {
                            jW2 = -9223372036854775807L;
                        } else {
                            jW2 = -9223372036854775807L;
                        }
                        if (jW2 == -9223372036854775807L) {
                            aVar = null;
                        } else {
                            if (jMin != -1) {
                                long j1114 = length2 - position2;
                                StringBuilder sbM11 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j1114, "Data size mismatch between stream (", ") and Xing frame (");
                                sbM11.append(jMin);
                                sbM11.append("), using smaller value.");
                                androidx.media3.common.util.c.k("XingSeeker", sbM11.toString());
                                jMin = Math.min(jMin, j1114);
                            }
                            aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                        }
                    } else {
                        length = oVar.getLength();
                        if (j5 != -1) {
                        }
                        if (jW != -9223372036854775807L) {
                            if (jMin != -1) {
                                long j1115 = position2 + jMin;
                                j6 = jMin - ((long) i10);
                                j7 = j1115;
                            } else if (length != -1) {
                                j6 = (length - position2) - ((long) i10);
                                j7 = length;
                            } else {
                                aVar = null;
                            }
                            long j1116 = j6;
                            RoundingMode roundingMode7 = RoundingMode.HALF_UP;
                            aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j1116, 8000000L, jW, roundingMode7)), a0.c(com.google.common.base.b.f(j1116, j5, roundingMode7)), false, true);
                        } else {
                            aVar = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    length6 = oVar.getLength();
                    position4 = oVar.getPosition();
                    wVar2.N(6);
                    int iM8 = wVar2.m();
                    i7 = 0;
                    j9 = position4 + ((long) yVar5.b);
                    j10 = j9 + ((long) iM8);
                    iM4 = wVar2.m();
                    if (iM4 <= 0) {
                        jW3 = j0.W(yVar5.c, (((long) iM4) * ((long) yVar5.f)) - 1);
                        iG = wVar2.G();
                        iG2 = wVar2.G();
                        iG3 = wVar2.G();
                        wVar2.N(2);
                        jArr5 = new long[iG];
                        jArr6 = new long[iG];
                        yVar3 = yVar5;
                        j11 = position4 + ((long) yVar5.b);
                        i19 = 0;
                        while (true) {
                            if (i19 < iG) {
                                long[] jArr19 = jArr5;
                                long[] jArr110 = jArr6;
                                y yVar9 = yVar3;
                                if (length6 != -1) {
                                    j12 = j10;
                                } else {
                                    j12 = j10;
                                }
                                if (j12 != j11) {
                                    StringBuilder sbM12 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbM12.append(j11);
                                    sbM12.append("\nSeeking will be inaccurate.");
                                    androidx.media3.common.util.c.t("VbriSeeker", sbM12.toString());
                                    jMax = Math.max(j12, j11);
                                } else {
                                    jMax = j12;
                                }
                                yVar2 = yVar9;
                                aVar = new i(jArr19, jArr110, jW3, j9, jMax, yVar2.e);
                                break;
                            }
                            long[] jArr111 = jArr6;
                            yVar4 = yVar3;
                            int i214 = i19;
                            long[] jArr112 = jArr5;
                            jArr112[i214] = (((long) i19) * jW3) / ((long) iG);
                            jArr111[i214] = j11;
                            if (iG3 != 1) {
                                iZ = wVar2.z();
                            } else if (iG3 != 2) {
                                iZ = wVar2.G();
                            } else if (iG3 != 3) {
                                iZ = wVar2.C();
                            } else {
                                if (iG3 != 4) {
                                    aVar = null;
                                    yVar2 = yVar4;
                                    break;
                                }
                                iZ = wVar2.D();
                            }
                            j11 += ((long) iZ) * ((long) iG2);
                            i19 = i214 + 1;
                            jArr6 = jArr111;
                            yVar3 = yVar4;
                            jArr5 = jArr112;
                        }
                    } else {
                        aVar = null;
                        yVar2 = yVar5;
                    }
                    oVar.r(yVar2.b);
                } else if (iM2 != 1483304551) {
                    oVar.n();
                    aVar = null;
                    yVar2 = yVar5;
                    i7 = 0;
                } else {
                    yVar2 = yVar5;
                    i7 = 0;
                    iM3 = wVar2.m();
                    if ((iM3 & 1) != 0) {
                        iD = wVar2.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jMin = wVar2.B();
                    } else {
                        jMin = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        i15 = 0;
                        while (i15 < i14) {
                            jArr2[i15] = wVar2.z();
                            i15++;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        wVar2.N(4);
                    }
                    if (wVar2.a() >= 24) {
                        wVar2.N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(wVar2.m());
                        int iG18 = wVar2.G();
                        int iG19 = wVar2.G();
                        eVarA = e.a(iG18);
                        eVarA2 = e.a(iG19);
                        if (fIntBitsToFloat > 0.0f) {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        } else {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        }
                        wVar2.N(2);
                        int iC8 = wVar2.C();
                        i9 = (16773120 & iC8) >> 12;
                        i8 = iC8 & 4095;
                    } else {
                        fVar = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iD;
                    i10 = yVar2.b;
                    i11 = yVar2.c;
                    i12 = yVar2.e;
                    i13 = yVar2.f;
                    fVar2 = fVar;
                    if (vVar.a != -1) {
                        vVar.a = i9;
                        vVar.b = i8;
                    } else {
                        vVar.a = i9;
                        vVar.b = i8;
                    }
                    if (fVar2 != null) {
                        h0Var = new androidx.media3.common.h0(fVar2);
                    } else {
                        h0Var = null;
                    }
                    this.l = h0Var;
                    position2 = oVar.getPosition();
                    oVar.r(yVar2.b);
                    if (iM2 == 1483304551) {
                        length2 = oVar.getLength();
                        if (j5 != -1) {
                            jW2 = -9223372036854775807L;
                        } else {
                            jW2 = -9223372036854775807L;
                        }
                        if (jW2 == -9223372036854775807L) {
                            aVar = null;
                        } else {
                            if (jMin != -1) {
                                long j1117 = length2 - position2;
                                StringBuilder sbM13 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j1117, "Data size mismatch between stream (", ") and Xing frame (");
                                sbM13.append(jMin);
                                sbM13.append("), using smaller value.");
                                androidx.media3.common.util.c.k("XingSeeker", sbM13.toString());
                                jMin = Math.min(jMin, j1117);
                            }
                            aVar = new j(position2, i10, jW2, i12, jMin, jArr);
                        }
                    } else {
                        length = oVar.getLength();
                        if (j5 != -1) {
                        }
                        if (jW != -9223372036854775807L) {
                            if (jMin != -1) {
                                long j1118 = position2 + jMin;
                                j6 = jMin - ((long) i10);
                                j7 = j1118;
                            } else if (length != -1) {
                                j6 = (length - position2) - ((long) i10);
                                j7 = length;
                            } else {
                                aVar = null;
                            }
                            long j1119 = j6;
                            RoundingMode roundingMode8 = RoundingMode.HALF_UP;
                            aVar = new a(j7, position2 + ((long) i10), a0.c(j0.Y(j1119, 8000000L, jW, roundingMode8)), a0.c(com.google.common.base.b.f(j1119, j5, roundingMode8)), false, true);
                        } else {
                            aVar = null;
                        }
                    }
                }
                h0Var2 = this.k;
                position3 = oVar.getPosition();
                if (h0Var2 == null) {
                    cVar = null;
                } else {
                    g0VarArr = h0Var2.a;
                    length3 = g0VarArr.length;
                    i16 = i7;
                    while (true) {
                        if (i16 < length3) {
                            g0Var = null;
                            break;
                        }
                        g0Var4 = g0VarArr[i16];
                        if (l.class.isAssignableFrom(g0Var4.getClass())) {
                            g0Var = (g0) l.class.cast(g0Var4);
                            if (!com.google.common.base.o.e.mo13apply(g0Var)) {
                                g0Var = null;
                            }
                        } else {
                            g0Var = null;
                        }
                        if (g0Var != null) {
                            break;
                            break;
                        }
                        i16++;
                    }
                    lVar = (l) g0Var;
                    if (lVar == null) {
                        cVar = null;
                    } else {
                        iArr = lVar.e;
                        g0VarArr2 = h0Var2.a;
                        length4 = g0VarArr2.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length4) {
                                g0Var2 = null;
                                break;
                            }
                            g0Var3 = g0VarArr2[i17];
                            if (androidx.media3.extractor.metadata.id3.n.class.isAssignableFrom(g0Var3.getClass())) {
                                g0Var2 = (g0) androidx.media3.extractor.metadata.id3.n.class.cast(g0Var3);
                                if (!((androidx.media3.extractor.metadata.id3.n) g0Var2).a.equals("TLEN")) {
                                    g0Var2 = null;
                                }
                            } else {
                                g0Var2 = null;
                            }
                            if (g0Var2 != null) {
                                break;
                                break;
                            }
                            i17++;
                        }
                        nVar = (androidx.media3.extractor.metadata.id3.n) g0Var2;
                        if (nVar == null) {
                            jQ = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jQ = j0.Q(Long.parseLong((String) nVar.c.get(0)));
                        }
                        length5 = iArr.length;
                        int i215 = length5 + 1;
                        jArr3 = new long[i215];
                        jArr4 = new long[i215];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        j8 = 0;
                        i18 = 1;
                        while (i18 <= length5) {
                            int i216 = i18 - 1;
                            long j11110 = position3 + ((long) (lVar.c + iArr[i216]));
                            j8 += (long) (lVar.d + lVar.f[i216]);
                            jArr3[i18] = j11110;
                            jArr4[i18] = j8;
                            i18++;
                            length5 = length5;
                            position3 = j11110;
                        }
                        cVar = new c(jQ, jArr3, jArr4);
                    }
                }
                if (this.s) {
                    gVar = new g(-9223372036854775807L);
                    wVar = wVar;
                    vVar = vVar;
                    yVar = yVar2;
                    z3 = true;
                    i21 = 0;
                } else {
                    j2 = -9223372036854775807L;
                    if (cVar != null) {
                        aVar = cVar;
                    } else if (aVar == null) {
                        aVar = null;
                    }
                    if (aVar == null) {
                        int i217 = i7;
                        oVar.x(wVar.a, i217, 4);
                        wVar.M(i217);
                        yVar2.a(wVar.m());
                        yVar = yVar2;
                        z2 = true;
                        i21 = 0;
                        aVar = new a(oVar.getLength(), oVar.getPosition(), yVar2.e, yVar2.b, false, true);
                    } else {
                        yVar = yVar2;
                        z2 = true;
                        i21 = 0;
                    }
                    aVar.c();
                    aVar.c();
                    this.h.d(aVar.g());
                    gVar = aVar;
                    z3 = z2;
                }
                this.r = gVar;
                this.g.g(gVar);
                h0VarB = this.k;
                h0Var3 = this.l;
                if (h0VarB != null) {
                    if (h0Var3 != null) {
                        h0VarB = h0VarB.b(h0Var3);
                    }
                    h0Var3 = h0VarB;
                }
                qVar = new q();
                qVar.m = i0.p("audio/mpeg");
                qVar.n = i0.p((String) yVar.g);
                qVar.o = 4096;
                qVar.F = yVar.d;
                qVar.G = yVar.c;
                qVar.I = vVar.a;
                qVar.J = vVar.b;
                qVar.k = h0Var3;
                if (this.r.f() != -2147483647) {
                    qVar.h = this.r.f();
                }
                this.i.e(new androidx.media3.common.r(qVar));
                this.o = oVar.getPosition();
                j3 = 0;
                r4 = z3;
            } else {
                yVar = yVar5;
                wVar = wVar;
                z = true;
                th = null;
                j = 1000000;
                j2 = -9223372036854775807L;
                j3 = 0;
                if (this.o != 0) {
                    position = oVar.getPosition();
                    j4 = this.o;
                    if (position < j4) {
                        r4 = z;
                        r4 = z;
                        oVar.r((int) (j4 - position));
                        r4 = z;
                    }
                }
            }
            r4 = z;
            r4 = z;
            r4 = z;
            if (this.q == 0) {
                oVar.n();
                if (g(oVar)) {
                    i = -1;
                    i21 = -1;
                } else {
                    wVar.M(i21);
                    iM = wVar.m();
                    if (((-128000) & iM) == (((long) this.j) & (-128000))) {
                    }
                    oVar.r(r4);
                    this.j = i21;
                    i = -1;
                }
            } else {
                iA = this.i.a(oVar, this.q, r4);
                if (iA == -1) {
                    i = -1;
                    i21 = -1;
                } else {
                    i2 = this.q - iA;
                    this.q = i2;
                    if (i2 <= 0) {
                        this.i.g(this.m + ((this.n * j) / ((long) yVar.c)), 1, yVar.b, 0, null);
                        this.n += (long) yVar.f;
                        this.q = i21;
                    }
                    i = -1;
                }
            }
        }
        if (i21 == i) {
            h hVar2 = this.r;
            if (hVar2 instanceof b) {
                if (hVar2.g() != ((this.n * j) / ((long) yVar.c)) + this.m) {
                    ((b) this.r).getClass();
                    throw th;
                }
            }
        }
        return i21;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.g = pVar;
        h0 h0VarU = pVar.u(0, 1);
        this.h = h0VarU;
        this.i = h0VarU;
        this.g.o();
    }

    public final void f() {
        h hVar = this.r;
        if ((hVar instanceof a) && ((a) hVar).c()) {
            long j = this.p;
            if (j == -1 || j == this.r.b()) {
                return;
            }
            a aVar = (a) this.r;
            this.r = new a(this.p, aVar.i, aVar.j, aVar.k, aVar.l, false);
            p pVar = this.g;
            pVar.getClass();
            pVar.g(this.r);
            h0 h0Var = this.h;
            h0Var.getClass();
            h0Var.d(this.r.g());
        }
    }

    public final boolean g(o oVar) {
        h hVar = this.r;
        if (hVar != null) {
            long jB = hVar.b();
            if (jB == -1 || oVar.f() <= jB - 4) {
            }
            return true;
        }
        try {
            return !oVar.e(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean h(o oVar, boolean z) throws EOFException {
        int iF;
        int i;
        int iH;
        oVar.n();
        if (oVar.getPosition() == 0) {
            androidx.media3.common.h0 h0VarC = this.e.C(oVar, null, 131072);
            this.k = h0VarC;
            if (h0VarC != null) {
                this.d.b(h0VarC);
            }
            iF = (int) oVar.f();
            if (!z) {
                oVar.r(iF);
            }
            i = 0;
        } else {
            iF = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (g(oVar)) {
                if (i2 > 0) {
                    break;
                }
                f();
                throw new EOFException();
            }
            w wVar = this.b;
            wVar.M(0);
            int iM = wVar.m();
            if ((i == 0 || ((-128000) & iM) == (((long) i) & (-128000))) && (iH = androidx.media3.extractor.b.h(iM)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.c.a(iM);
                    i = iM;
                }
                oVar.h(iH - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    f();
                    throw new EOFException();
                }
                if (z) {
                    oVar.n();
                    oVar.h(iF + i4);
                } else {
                    oVar.r(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            oVar.r(iF + i3);
        } else {
            oVar.n();
        }
        this.j = i;
        return true;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }

    public d(int i) {
        this(-9223372036854775807L);
    }
}
