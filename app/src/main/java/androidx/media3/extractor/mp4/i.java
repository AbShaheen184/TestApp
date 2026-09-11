package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.activity.y;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.v;
import com.app.mlounge.emulator.LibretroCore;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.media3.extractor.n {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.r P;
    public long A;
    public long B;
    public h C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public androidx.media3.extractor.p I;
    public h0[] J;
    public h0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final androidx.media3.extractor.text.j a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final w i;
    public final androidx.media3.common.util.h0 j;
    public final androidx.appcompat.widget.o o;
    public final h0 p;
    public final androidx.collection.internal.b q;
    public a1 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public w w;
    public long x;
    public int y;
    public long z;
    public final androidx.media3.common.util.b k = new androidx.media3.common.util.b(17);
    public final w l = new w(16);
    public final w e = new w(androidx.media3.container.r.a);
    public final w f = new w(6);
    public final w g = new w();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = i0.p("application/x-emsg");
        P = new androidx.media3.common.r(qVar);
    }

    public i(androidx.media3.extractor.text.j jVar, int i, androidx.media3.common.util.h0 h0Var, List list, androidx.media3.exoplayer.dash.p pVar) {
        this.a = jVar;
        this.b = i;
        this.j = h0Var;
        this.c = Collections.unmodifiableList(list);
        this.p = pVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new w(bArr);
        e0 e0Var = com.google.common.collect.h0.y;
        this.r = a1.B;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = androidx.media3.extractor.p.f;
        this.J = new h0[0];
        this.K = new h0[0];
        this.o = new androidx.appcompat.widget.o(new y(this, 20));
        this.q = new androidx.collection.internal.b(2);
        this.N = -1L;
    }

    public static int f(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    public static androidx.media3.common.m h(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            androidx.media3.container.e eVar = (androidx.media3.container.e) list.get(i);
            if (eVar.y == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.z.a;
                androidx.media3.exoplayer.dash.manifest.t tVarH = q.h(bArr);
                UUID uuid = tVarH == null ? null : (UUID) tVarH.y;
                if (uuid == null) {
                    androidx.media3.common.util.c.t("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new androidx.media3.common.l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new androidx.media3.common.m(null, false, (androidx.media3.common.l[]) arrayList.toArray(new androidx.media3.common.l[0]));
    }

    public static void i(w wVar, int i, t tVar) throws j0 {
        wVar.M(i + 8);
        int iM = wVar.m();
        byte[] bArr = e.a;
        if ((iM & 1) != 0) {
            throw j0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iD = wVar.D();
        if (iD == 0) {
            Arrays.fill(tVar.l, 0, tVar.e, false);
            return;
        }
        int i2 = tVar.e;
        w wVar2 = tVar.n;
        if (iD != i2) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Senc sample count ", iD, " is different from fragment sample count");
            sbV.append(tVar.e);
            throw j0.a(null, sbV.toString());
        }
        Arrays.fill(tVar.l, 0, iD, z);
        wVar2.J(wVar.a());
        tVar.k = true;
        tVar.o = true;
        wVar.k(wVar2.a, 0, wVar2.c);
        wVar2.M(0);
        tVar.o = false;
    }

    public static Pair j(long j, w wVar) throws j0 {
        long jF;
        long jF2;
        w wVar2 = wVar;
        wVar2.M(8);
        int iE = e.e(wVar2.m());
        wVar2.N(4);
        long jB = wVar2.B();
        if (iE == 0) {
            jF = wVar2.B();
            jF2 = wVar2.B();
        } else {
            jF = wVar2.F();
            jF2 = wVar2.F();
        }
        long j2 = jF2 + j;
        String str = androidx.media3.common.util.j0.a;
        long jY = androidx.media3.common.util.j0.Y(jF, 1000000L, jB, RoundingMode.DOWN);
        wVar2.N(2);
        int iG = wVar2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j3 = j2;
        long j4 = jY;
        int i = 0;
        while (i < iG) {
            int iM = wVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw j0.a(null, "Unhandled indirect reference");
            }
            long jB2 = wVar2.B();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jY2 = androidx.media3.common.util.j0.Y(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i] = jY2 - jArr5[i];
            wVar2.N(4);
            j3 += (long) iArr[i];
            i++;
            iG = iG;
            wVar2 = wVar;
            j4 = jY2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jY), new androidx.media3.extractor.j(iArr, jArr, jArr2, jArr3));
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        a1 a1VarS;
        androidx.media3.extractor.e0 e0VarK = q.k(oVar, true, false);
        if (e0VarK != null) {
            a1VarS = com.google.common.collect.h0.s(e0VarK);
        } else {
            e0 e0Var = com.google.common.collect.h0.y;
            a1VarS = a1.B;
        }
        this.r = a1VarS;
        return e0VarK == null;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((h) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:121:0x0247  */
    /* JADX WARN: Code duplicated, block: B:145:0x0294  */
    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) throws j0 {
        androidx.appcompat.widget.o oVar2;
        w wVar;
        ArrayDeque arrayDeque;
        int i;
        androidx.media3.common.util.h0 h0Var;
        h hVar;
        boolean z;
        int i2;
        h hVar2;
        int i3;
        int iA;
        int i4;
        boolean z2;
        String strD;
        int i5;
        int i6;
        String strU;
        String strU2;
        long j;
        long jA;
        long jY;
        long jB;
        int i7;
        while (true) {
            int i8 = this.s;
            ArrayDeque arrayDeque2 = this.m;
            oVar2 = this.o;
            wVar = this.i;
            androidx.collection.internal.b bVar = this.q;
            SparseArray sparseArray = this.d;
            boolean z3 = true;
            if (i8 != 0) {
                arrayDeque = this.n;
                i = this.b;
                h0Var = this.j;
                if (i8 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i8 != 2) {
                        hVar = this.C;
                        if (hVar != null) {
                            z = true;
                            i2 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i9 = 0;
                        h hVar3 = null;
                        while (i9 < size) {
                            h hVar4 = (h) sparseArray.valueAt(i9);
                            boolean z4 = z3;
                            boolean z5 = hVar4.m;
                            t tVar = hVar4.b;
                            if (z5) {
                                i6 = size;
                            } else {
                                i6 = size;
                                if (hVar4.f != hVar4.d.b) {
                                }
                                i9++;
                                z3 = z4;
                                size = i6;
                            }
                            if (!z5 || hVar4.h != tVar.d) {
                                long j3 = !z5 ? hVar4.d.c[hVar4.f] : tVar.f[hVar4.h];
                                if (j3 < j2) {
                                    hVar3 = hVar4;
                                    j2 = j3;
                                }
                            }
                            i9++;
                            z3 = z4;
                            size = i6;
                        }
                        z = z3;
                        i2 = 8;
                        if (hVar3 != null) {
                            int position = (int) ((!hVar3.m ? hVar3.d.c[hVar3.f] : hVar3.b.f[hVar3.h]) - oVar.getPosition());
                            if (position < 0) {
                                androidx.media3.common.util.c.t("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            oVar.r(position);
                            this.C = hVar3;
                            hVar = hVar3;
                            break;
                        }
                        int position2 = (int) (this.x - oVar.getPosition());
                        if (position2 < 0) {
                            throw j0.a(null, "Offset to end of mdat was negative.");
                        }
                        oVar.r(position2);
                        g();
                    } else {
                        int size2 = sparseArray.size();
                        h hVar5 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            t tVar2 = ((h) sparseArray.valueAt(i10)).b;
                            if (tVar2.o) {
                                long j4 = tVar2.c;
                                if (j4 < j2) {
                                    hVar5 = (h) sparseArray.valueAt(i10);
                                    j2 = j4;
                                }
                            }
                        }
                        if (hVar5 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j2 - oVar.getPosition());
                            if (position3 < 0) {
                                throw j0.a(null, "Offset to encryption data was negative.");
                            }
                            oVar.r(position3);
                            t tVar3 = hVar5.b;
                            w wVar2 = tVar3.n;
                            oVar.readFully(wVar2.a, 0, wVar2.c);
                            wVar2.M(0);
                            tVar3.o = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.u - ((long) this.v));
                    w wVar3 = this.w;
                    if (wVar3 != null) {
                        oVar.readFully(wVar3.a, 8, i11);
                        int i12 = this.t;
                        androidx.media3.container.e eVar = new androidx.media3.container.e(i12, wVar3);
                        if (!arrayDeque2.isEmpty()) {
                            ((androidx.media3.container.d) arrayDeque2.peek()).A.add(eVar);
                        } else if (i12 == 1936286840) {
                            Pair pairJ = j(oVar.getPosition(), wVar3);
                            bVar.a((androidx.media3.extractor.j) pairJ.second);
                            LinkedHashMap linkedHashMap = bVar.a;
                            this.B = ((Long) pairJ.first).longValue();
                            if (this.M) {
                                i7 = 1;
                            } else {
                                i7 = 1;
                                this.I.g(linkedHashMap.size() == 1 ? (a0) pairJ.second : bVar.e());
                                this.L = true;
                            }
                            if ((i & LibretroCore.SCREEN_WIDTH) != 0 && !this.M && linkedHashMap.size() > i7) {
                                this.N = oVar.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.J.length != 0) {
                            wVar3.M(8);
                            int iE = e.e(wVar3.m());
                            long j5 = -9223372036854775807L;
                            if (iE == 0) {
                                strU = wVar3.u();
                                strU.getClass();
                                strU2 = wVar3.u();
                                strU2.getClass();
                                long jB2 = wVar3.B();
                                long jB3 = wVar3.B();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jY2 = androidx.media3.common.util.j0.Y(jB3, 1000000L, jB2, roundingMode);
                                long j6 = this.B;
                                long j7 = j6 != -9223372036854775807L ? j6 + jY2 : -9223372036854775807L;
                                j = jY2;
                                jA = j7;
                                jY = androidx.media3.common.util.j0.Y(wVar3.B(), 1000L, jB2, roundingMode);
                                jB = wVar3.B();
                            } else if (iE != 1) {
                                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Skipping unsupported emsg version: ", iE, "FragmentedMp4Extractor");
                            } else {
                                long jB4 = wVar3.B();
                                long jF = wVar3.F();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jA = androidx.media3.common.util.j0.Y(jF, 1000000L, jB4, roundingMode2);
                                long jY3 = androidx.media3.common.util.j0.Y(wVar3.B(), 1000L, jB4, roundingMode2);
                                long jB5 = wVar3.B();
                                strU = wVar3.u();
                                strU.getClass();
                                strU2 = wVar3.u();
                                strU2.getClass();
                                jY = jY3;
                                jB = jB5;
                                j = -9223372036854775807L;
                            }
                            String str = strU;
                            String str2 = strU2;
                            byte[] bArr = new byte[wVar3.a()];
                            wVar3.k(bArr, 0, wVar3.a());
                            w wVar4 = new w(this.k.r(new androidx.media3.extractor.metadata.emsg.a(str, str2, jY, jB, bArr)));
                            int iA2 = wVar4.a();
                            h0[] h0VarArr = this.J;
                            int length = h0VarArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                h0 h0Var2 = h0VarArr[i13];
                                wVar4.M(0);
                                h0Var2.f(iA2, wVar4);
                                i13++;
                                j5 = j5;
                            }
                            if (jA == j5) {
                                arrayDeque.addLast(new g(j, iA2, true));
                                this.y += iA2;
                            } else if (!arrayDeque.isEmpty()) {
                                arrayDeque.addLast(new g(jA, iA2, false));
                                this.y += iA2;
                            } else if (h0Var == null || h0Var.e()) {
                                if (h0Var != null) {
                                    jA = h0Var.a(jA);
                                }
                                long j8 = jA;
                                for (h0 h0Var3 : this.J) {
                                    h0Var3.g(j8, 1, iA2, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new g(jA, iA2, false));
                                this.y += iA2;
                            }
                        }
                    } else {
                        oVar.r(i11);
                    }
                    k(oVar.getPosition());
                }
            } else {
                int i14 = this.v;
                w wVar5 = this.l;
                if (i14 == 0) {
                    if (!oVar.b(wVar5.a, 0, 8, true)) {
                        long j9 = this.N;
                        if (j9 == -1) {
                            oVar2.c(0);
                            return -1;
                        }
                        rVar.a = j9;
                        this.N = -1L;
                        this.I.g(bVar.e());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    wVar5.M(0);
                    this.u = wVar5.B();
                    this.t = wVar5.m();
                }
                long j10 = this.u;
                if (j10 == 1) {
                    oVar.readFully(wVar5.a, 8, 8);
                    this.v += 8;
                    this.u = wVar5.F();
                } else if (j10 == 0) {
                    long length2 = oVar.getLength();
                    if (length2 == -1 && !arrayDeque2.isEmpty()) {
                        length2 = ((androidx.media3.container.d) arrayDeque2.peek()).z;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - oVar.getPosition()) + ((long) this.v);
                    }
                }
                long j11 = this.u;
                int i15 = this.v;
                long j12 = i15;
                if (j11 < j12) {
                    if (this.t != 1718773093 || i15 != 8) {
                        throw j0.c("Atom size less than header length (unsupported).");
                    }
                    this.u = j12;
                }
                if (this.N != -1) {
                    int i16 = this.t;
                    long j13 = this.u;
                    if (i16 == 1936286840) {
                        wVar.J((int) j13);
                        System.arraycopy(wVar5.a, 0, wVar.a, 0, 8);
                        oVar.readFully(wVar.a, 8, (int) (this.u - ((long) this.v)));
                        bVar.a((androidx.media3.extractor.j) j(oVar.f(), wVar).second);
                    } else {
                        oVar.d((int) (j13 - j12), true);
                    }
                    g();
                } else {
                    long position4 = oVar.getPosition() - ((long) this.v);
                    int i17 = this.t;
                    if ((i17 == 1836019558 || i17 == 1835295092) && !this.L) {
                        this.I.g(new androidx.media3.extractor.s(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            t tVar4 = ((h) sparseArray.valueAt(i18)).b;
                            tVar4.getClass();
                            tVar4.c = position4;
                            tVar4.b = position4;
                        }
                    }
                    int i19 = this.t;
                    if (i19 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i19 == 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1836019558 || i19 == 1953653094 || i19 == 1836475768 || i19 == 1701082227 || i19 == 1835365473) {
                        long position5 = oVar.getPosition();
                        long j14 = this.u;
                        long j15 = (position5 + j14) - 8;
                        if (j14 != this.v && this.t == 1835365473) {
                            wVar.J(8);
                            oVar.x(wVar.a, 0, 8);
                            e.a(wVar);
                            oVar.r(wVar.b);
                            oVar.n();
                        }
                        arrayDeque2.push(new androidx.media3.container.d(this.t, j15));
                        if (this.u == this.v) {
                            k(j15);
                        } else {
                            g();
                        }
                    } else if (i19 == 1751411826 || i19 == 1835296868 || i19 == 1836476516 || i19 == 1936286840 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1668576371 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1937011571 || i19 == 1952867444 || i19 == 1952868452 || i19 == 1953196132 || i19 == 1953654136 || i19 == 1953658222 || i19 == 1886614376 || i19 == 1935763834 || i19 == 1935763823 || i19 == 1936027235 || i19 == 1970628964 || i19 == 1935828848 || i19 == 1936158820 || i19 == 1701606260 || i19 == 1835362404 || i19 == 1701671783 || i19 == 1969517665 || i19 == 1801812339 || i19 == 1768715124) {
                        if (this.v != 8) {
                            throw j0.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw j0.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        w wVar6 = new w((int) this.u);
                        System.arraycopy(wVar5.a, 0, wVar6.a, 0, 8);
                        this.w = wVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw j0.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.w = null;
                        this.s = 1;
                    }
                }
            }
        }
        h0 h0Var4 = hVar.a;
        t tVar5 = hVar.b;
        if (this.s == 3) {
            this.D = !hVar.m ? hVar.d.d[hVar.f] : tVar5.h[hVar.f];
            androidx.media3.common.r rVar2 = hVar.d.a.g;
            this.G = !((!Objects.equals(rVar2.o, "video/avc") ? !(!Objects.equals(rVar2.o, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? false : z);
            if (hVar.f < hVar.i) {
                oVar.r(this.D);
                s sVarB = hVar.b();
                if (sVarB != null) {
                    w wVar7 = tVar5.n;
                    int i20 = sVarB.d;
                    if (i20 != 0) {
                        wVar7.N(i20);
                    }
                    int i21 = hVar.f;
                    if (tVar5.k && tVar5.l[i21]) {
                        wVar7.N(wVar7.G() * 6);
                    }
                }
                if (!hVar.c()) {
                    this.C = null;
                }
                this.s = 3;
                return 0;
            }
            if (hVar.d.a.h == z) {
                this.D -= 8;
                oVar.r(i2);
            }
            boolean zEquals = "audio/ac4".equals(hVar.d.a.g.o);
            int i22 = this.D;
            if (zEquals) {
                this.E = hVar.d(i22, 7);
                androidx.media3.extractor.b.f(this.D, wVar);
                h0Var4.f(7, wVar);
                this.E += 7;
                i5 = 0;
            } else {
                i5 = 0;
                this.E = hVar.d(i22, 0);
            }
            this.D += this.E;
            this.s = 4;
            this.F = i5;
        }
        u uVar = hVar.d;
        r rVar3 = uVar.a;
        long jA2 = !hVar.m ? uVar.f[hVar.f] : tVar5.i[hVar.f];
        if (h0Var != null) {
            jA2 = h0Var.a(jA2);
        }
        int i23 = rVar3.k;
        androidx.media3.common.r rVar4 = rVar3.g;
        if (i23 == 0) {
            hVar2 = hVar;
            while (true) {
                int i24 = this.E;
                int i25 = this.D;
                if (i24 >= i25) {
                    break;
                }
                this.E += h0Var4.a(oVar, i25 - i24, false);
            }
        } else {
            w wVar8 = this.f;
            byte[] bArr2 = wVar8.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[r13] = 0;
            int i26 = 4 - i23;
            hVar2 = hVar;
            while (true) {
                i23 = i23;
                if (this.E < this.D) {
                    int i27 = this.F;
                    if (i27 == 0) {
                        if (this.K.length > 0 || !this.G) {
                            int iG = androidx.media3.container.r.g(rVar4);
                            if (i23 + iG <= this.D - this.E) {
                                i4 = iG;
                            } else {
                                i4 = 0;
                            }
                        } else {
                            i4 = 0;
                        }
                        oVar.readFully(bArr2, i26, i23 + i4);
                        wVar8.M(0);
                        int iM = wVar8.m();
                        if (iM < 0) {
                            throw j0.a(null, "Invalid NAL length");
                        }
                        this.F = iM - i4;
                        w wVar9 = this.e;
                        i3 = i26;
                        wVar9.M(0);
                        h0Var4.f(4, wVar9);
                        this.E += 4;
                        this.D += i3;
                        if (this.K.length <= 0 || i4 <= 0 || (strD = androidx.media3.container.r.d(rVar4)) == null) {
                            z2 = false;
                        } else {
                            switch (strD) {
                                case "video/hevc":
                                    if (((bArr2[4] & 126) >> 1) != 39) {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                case "video/avc":
                                    if ((bArr2[4] & 31) != 6) {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                case "video/vvc":
                                    if (((bArr2[5] & 248) >> 3) != 23) {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                default:
                                    z2 = false;
                                    break;
                            }
                            z2 = true;
                        }
                        this.H = z2;
                        h0Var4.f(i4, wVar8);
                        this.E += i4;
                        if (i4 > 0 && !this.G && androidx.media3.container.r.f(bArr2, i4, rVar4)) {
                            this.G = true;
                        }
                    } else {
                        i3 = i26;
                        if (this.H) {
                            w wVar10 = this.g;
                            wVar10.J(i27);
                            oVar.readFully(wVar10.a, 0, this.F);
                            h0Var4.f(this.F, wVar10);
                            int i28 = this.F;
                            int iP = androidx.media3.container.r.p(wVar10.a, wVar10.c);
                            wVar10.M(0);
                            wVar10.L(iP);
                            int i29 = rVar4.q;
                            if (i29 == -1) {
                                if (oVar2.a != 0) {
                                    oVar2.l(0);
                                }
                            } else if (oVar2.a != i29) {
                                oVar2.l(i29);
                            }
                            oVar2.a(jA2, wVar10);
                            if ((hVar2.a() & 4) != 0) {
                                oVar2.c(0);
                            }
                            iA = i28;
                        } else {
                            iA = h0Var4.a(oVar, i27, false);
                        }
                        this.E += iA;
                        this.F -= iA;
                        wVar8 = wVar8;
                    }
                    i26 = i3;
                }
            }
        }
        int iA3 = hVar2.a();
        if (!this.G) {
            iA3 |= 67108864;
        }
        int i30 = iA3;
        s sVarB2 = hVar2.b();
        long j16 = jA2;
        h0Var4.g(j16, i30, this.D, 0, sVarB2 != null ? sVarB2.c : null);
        while (!arrayDeque.isEmpty()) {
            g gVar = (g) arrayDeque.removeFirst();
            this.y -= gVar.c;
            long jA3 = gVar.a;
            if (gVar.b) {
                jA3 += j16;
            }
            if (h0Var != null) {
                jA3 = h0Var.a(jA3);
            }
            long j17 = jA3;
            for (h0 h0Var5 : this.J) {
                h0Var5.g(j17, 1, gVar.c, this.y, null);
            }
        }
        if (!hVar2.c()) {
            this.C = null;
        }
        this.s = 3;
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            pVar = new b1(pVar, this.a);
        }
        this.I = pVar;
        g();
        h0[] h0VarArr = new h0[2];
        this.J = h0VarArr;
        int i3 = 0;
        h0 h0Var = this.p;
        if (h0Var != null) {
            h0VarArr[0] = h0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            h0VarArr[i] = this.I.u(100, 5);
            i4 = Token.ASSIGN_LOGICAL_OR;
            i++;
        }
        h0[] h0VarArr2 = (h0[]) androidx.media3.common.util.j0.S(i, this.J);
        this.J = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.e(P);
        }
        List list = this.c;
        this.K = new h0[list.size()];
        while (i3 < this.K.length) {
            h0 h0VarU = this.I.u(i4, 3);
            h0VarU.e((androidx.media3.common.r) list.get(i3));
            this.K[i3] = h0VarU;
            i3++;
            i4++;
        }
    }

    @Override // androidx.media3.extractor.n
    public final List e() {
        return this.r;
    }

    public final void g() {
        this.s = 0;
        this.v = 0;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x066d  */
    public final void k(long j) throws j0 {
        androidx.media3.common.h0 h0Var;
        int i;
        long j2;
        f fVar;
        int i2;
        f fVar2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((androidx.media3.container.d) arrayDeque.peek()).z != j) {
                break;
            }
            androidx.media3.container.d dVar = (androidx.media3.container.d) arrayDeque.pop();
            int i8 = dVar.y;
            ArrayList arrayList4 = dVar.B;
            ArrayList arrayList5 = dVar.A;
            int i9 = this.b;
            int i10 = 12;
            SparseArray sparseArray = this.d;
            if (i8 == 1836019574) {
                androidx.media3.common.m mVarH = h(arrayList5);
                androidx.media3.container.d dVarO = dVar.o(1836475768);
                dVarO.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = dVarO.A;
                int size = arrayList6.size();
                int i11 = 0;
                long jB = -9223372036854775807L;
                while (i11 < size) {
                    androidx.media3.container.e eVar = (androidx.media3.container.e) arrayList6.get(i11);
                    int i12 = eVar.y;
                    w wVar = eVar.z;
                    if (i12 == 1953654136) {
                        wVar.M(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(wVar.m()), new f(wVar.m() - 1, wVar.m(), wVar.m(), wVar.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (f) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i12 == 1835362404) {
                            wVar.M(8);
                            jB = e.e(wVar.m()) == 0 ? wVar.B() : wVar.F();
                        }
                    }
                    i11++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i13 = 0;
                androidx.media3.container.d dVarO2 = dVar.o(1835365473);
                androidx.media3.common.h0 h0VarF = dVarO2 != null ? e.f(dVarO2) : null;
                v vVar = new v();
                androidx.media3.container.e eVarP = dVar.p(1969517665);
                if (eVarP != null) {
                    androidx.media3.common.h0 h0VarK = e.k(eVarP);
                    vVar.b(h0VarK);
                    h0Var = h0VarK;
                } else {
                    h0Var = null;
                }
                androidx.media3.container.e eVarP2 = dVar.p(1836476516);
                eVarP2.getClass();
                androidx.media3.common.h0 h0Var2 = new androidx.media3.common.h0(e.g(eVarP2.z));
                ArrayList arrayListJ = e.j(dVar, vVar, jB, mVarH, (i9 & 16) != 0, false, new androidx.media3.common.p(this), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strB = q.b(arrayListJ);
                    int i14 = 0;
                    while (i14 < size2) {
                        u uVar = (u) arrayListJ.get(i14);
                        r rVar = uVar.a;
                        androidx.media3.extractor.p pVar = this.I;
                        int i15 = rVar.b;
                        int i16 = rVar.a;
                        String str = strB;
                        androidx.media3.common.r rVar2 = rVar.g;
                        long j3 = rVar.e;
                        h0 h0VarU = pVar.u(i14, i15);
                        h0VarU.d(j3);
                        int i17 = i14;
                        androidx.media3.common.q qVarA = rVar2.a();
                        ArrayList arrayList7 = arrayListJ;
                        qVarA.m = i0.p(str);
                        if (i15 == 1) {
                            int i18 = vVar.a;
                            i = size2;
                            j2 = j3;
                            if (i18 != -1 && (i2 = vVar.b) != -1) {
                                qVarA.I = i18;
                                qVarA.J = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        q.j(i15, h0VarF, qVarA, rVar2.l, h0Var, h0Var2);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(i13);
                        } else {
                            fVar = (f) sparseArray2.get(i16);
                            fVar.getClass();
                        }
                        sparseArray.put(i16, new h(h0VarU, uVar, fVar, new androidx.media3.common.r(qVarA)));
                        this.A = Math.max(this.A, j2);
                        i14 = i17 + 1;
                        strB = str;
                        arrayListJ = arrayList7;
                        size2 = i;
                        i13 = 0;
                    }
                    this.I.o();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    com.google.android.material.motion.a.q(sparseArray.size() == size2);
                    int i19 = 0;
                    while (i19 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        u uVar2 = (u) arrayList9.get(i19);
                        r rVar3 = uVar2.a;
                        h hVar = (h) sparseArray.get(rVar3.a);
                        int i20 = rVar3.a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i20);
                            fVar2.getClass();
                        }
                        hVar.d = uVar2;
                        hVar.e = fVar2;
                        hVar.a.e(hVar.j);
                        hVar.e();
                        i19++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i8 == 1836019558) {
                int size3 = arrayList4.size();
                int i21 = 0;
                while (i21 < size3) {
                    androidx.media3.container.d dVar2 = (androidx.media3.container.d) arrayList4.get(i21);
                    if (dVar2.y == 1953653094) {
                        androidx.media3.container.e eVarP3 = dVar2.p(1952868452);
                        ArrayList arrayList10 = dVar2.A;
                        eVarP3.getClass();
                        w wVar2 = eVarP3.z;
                        wVar2.M(8);
                        int iM = wVar2.m();
                        byte[] bArr2 = e.a;
                        h hVar2 = (h) sparseArray.get(wVar2.m());
                        if (hVar2 == null) {
                            size3 = size3;
                            hVar2 = null;
                        } else {
                            t tVar = hVar2.b;
                            if ((iM & 1) != 0) {
                                long jF = wVar2.F();
                                tVar.b = jF;
                                tVar.c = jF;
                            }
                            f fVar3 = hVar2.e;
                            tVar.a = new f((iM & 2) != 0 ? wVar2.m() - 1 : fVar3.a, (iM & 8) != 0 ? wVar2.m() : fVar3.b, (iM & 16) != 0 ? wVar2.m() : fVar3.c, (iM & 32) != 0 ? wVar2.m() : fVar3.d);
                        }
                        if (hVar2 != null) {
                            t tVar2 = hVar2.b;
                            long j4 = tVar2.p;
                            boolean z3 = tVar2.q;
                            hVar2.e();
                            hVar2.m = true;
                            androidx.media3.container.e eVarP4 = dVar2.p(1952867444);
                            if (eVarP4 == null || (i9 & 2) != 0) {
                                tVar2.p = j4;
                                tVar2.q = z3;
                            } else {
                                w wVar3 = eVarP4.z;
                                wVar3.M(8);
                                tVar2.p = e.e(wVar3.m()) == 1 ? wVar3.F() : wVar3.B();
                                tVar2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i22 >= size4) {
                                    break;
                                }
                                androidx.media3.container.e eVar2 = (androidx.media3.container.e) arrayList10.get(i22);
                                int i25 = i21;
                                if (eVar2.y == 1953658222) {
                                    w wVar4 = eVar2.z;
                                    wVar4.M(12);
                                    int iD = wVar4.D();
                                    if (iD > 0) {
                                        i24 += iD;
                                        i23++;
                                    }
                                }
                                i22++;
                                i21 = i25;
                            }
                            i3 = i21;
                            hVar2.h = 0;
                            hVar2.g = 0;
                            hVar2.f = 0;
                            tVar2.d = i23;
                            tVar2.e = i24;
                            if (tVar2.g.length < i23) {
                                tVar2.f = new long[i23];
                                tVar2.g = new int[i23];
                            }
                            if (tVar2.h.length < i24) {
                                int i26 = (i24 * Token.IF) / 100;
                                tVar2.h = new int[i26];
                                tVar2.i = new long[i26];
                                tVar2.j = new boolean[i26];
                                tVar2.l = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i27 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i4 = i9;
                                    r rVar4 = hVar2.d.a;
                                    f fVar4 = tVar2.a;
                                    fVar4.getClass();
                                    s sVar = rVar4.l[fVar4.a];
                                    androidx.media3.container.e eVarP5 = dVar2.p(1935763834);
                                    if (eVarP5 != null) {
                                        sVar.getClass();
                                        w wVar5 = eVarP5.z;
                                        int i30 = sVar.d;
                                        wVar5.M(8);
                                        int iM2 = wVar5.m();
                                        byte[] bArr3 = e.a;
                                        if ((iM2 & 1) == 1) {
                                            wVar5.N(8);
                                        }
                                        int iZ = wVar5.z();
                                        int iD2 = wVar5.D();
                                        if (iD2 > tVar2.e) {
                                            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Saiz sample count ", iD2, " is greater than fragment sample count");
                                            sbV.append(tVar2.e);
                                            throw j0.a(null, sbV.toString());
                                        }
                                        if (iZ == 0) {
                                            boolean[] zArr = tVar2.l;
                                            i6 = 0;
                                            for (int i31 = 0; i31 < iD2; i31++) {
                                                int iZ2 = wVar5.z();
                                                i6 += iZ2;
                                                zArr[i31] = iZ2 > i30;
                                            }
                                            z = false;
                                        } else {
                                            boolean z4 = iZ > i30;
                                            i6 = iZ * iD2;
                                            z = false;
                                            Arrays.fill(tVar2.l, 0, iD2, z4);
                                        }
                                        Arrays.fill(tVar2.l, iD2, tVar2.e, z);
                                        if (i6 > 0) {
                                            tVar2.n.J(i6);
                                            tVar2.k = true;
                                            tVar2.o = true;
                                        }
                                    }
                                    androidx.media3.container.e eVarP6 = dVar2.p(1935763823);
                                    if (eVarP6 != null) {
                                        w wVar6 = eVarP6.z;
                                        wVar6.M(8);
                                        int iM3 = wVar6.m();
                                        byte[] bArr4 = e.a;
                                        if ((iM3 & 1) == 1) {
                                            wVar6.N(8);
                                        }
                                        int iD3 = wVar6.D();
                                        if (iD3 != 1) {
                                            throw j0.a(null, "Unexpected saio entry count: " + iD3);
                                        }
                                        tVar2.c += e.e(iM3) == 0 ? wVar6.B() : wVar6.F();
                                    }
                                    androidx.media3.container.e eVarP7 = dVar2.p(1936027235);
                                    if (eVarP7 != null) {
                                        i(eVarP7.z, 0, tVar2);
                                    }
                                    String str2 = sVar != null ? sVar.b : null;
                                    w wVar7 = null;
                                    w wVar8 = null;
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        androidx.media3.container.e eVar3 = (androidx.media3.container.e) arrayList10.get(i32);
                                        w wVar9 = eVar3.z;
                                        int i33 = eVar3.y;
                                        if (i33 == 1935828848) {
                                            wVar9.M(12);
                                            if (wVar9.m() == 1936025959) {
                                                wVar7 = wVar9;
                                            }
                                        } else if (i33 == 1936158820) {
                                            wVar9.M(12);
                                            if (wVar9.m() == 1936025959) {
                                                wVar8 = wVar9;
                                            }
                                        }
                                    }
                                    if (wVar7 != null && wVar8 != null) {
                                        wVar7.M(8);
                                        int iE = e.e(wVar7.m());
                                        wVar7.N(4);
                                        if (iE == 1) {
                                            wVar7.N(4);
                                        }
                                        if (wVar7.m() != 1) {
                                            throw j0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        wVar8.M(8);
                                        int iE2 = e.e(wVar8.m());
                                        wVar8.N(4);
                                        if (iE2 == 1) {
                                            if (wVar8.B() == 0) {
                                                throw j0.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE2 >= 2) {
                                            wVar8.N(4);
                                        }
                                        if (wVar8.B() != 1) {
                                            throw j0.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        wVar8.N(1);
                                        int iZ3 = wVar8.z();
                                        int i34 = (iZ3 & 240) >> 4;
                                        int i35 = iZ3 & 15;
                                        boolean z5 = wVar8.z() == 1;
                                        if (z5) {
                                            int iZ4 = wVar8.z();
                                            byte[] bArr5 = new byte[16];
                                            wVar8.k(bArr5, 0, 16);
                                            if (iZ4 == 0) {
                                                int iZ5 = wVar8.z();
                                                byte[] bArr6 = new byte[iZ5];
                                                wVar8.k(bArr6, 0, iZ5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            tVar2.k = true;
                                            tVar2.m = new s(z5, str2, iZ4, bArr5, i34, i35, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i36 = 0; i36 < size5; i36++) {
                                        androidx.media3.container.e eVar4 = (androidx.media3.container.e) arrayList10.get(i36);
                                        if (eVar4.y == 1970628964) {
                                            w wVar10 = eVar4.z;
                                            wVar10.M(8);
                                            byte[] bArr7 = this.h;
                                            wVar10.k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, O)) {
                                                i(wVar10, 16, tVar2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                androidx.media3.container.e eVar5 = (androidx.media3.container.e) arrayList10.get(i27);
                                if (eVar5.y == i5) {
                                    int i37 = i28 + 1;
                                    w wVar11 = eVar5.z;
                                    wVar11.M(8);
                                    int iM4 = wVar11.m();
                                    byte[] bArr8 = e.a;
                                    r rVar5 = hVar2.d.a;
                                    f fVar5 = tVar2.a;
                                    String str3 = androidx.media3.common.util.j0.a;
                                    tVar2.g[i28] = wVar11.D();
                                    long[] jArr = tVar2.f;
                                    i7 = i9;
                                    long j6 = tVar2.b;
                                    jArr[i28] = j6;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i28] = j6 + ((long) wVar11.m());
                                    }
                                    boolean z6 = (iM4 & 4) != 0;
                                    int iM5 = fVar5.d;
                                    if (z6) {
                                        iM5 = wVar11.m();
                                    }
                                    boolean z7 = (iM4 & LibretroCore.SCREEN_WIDTH) != 0;
                                    boolean z8 = z6;
                                    boolean z9 = (iM4 & 512) != 0;
                                    boolean z10 = (iM4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
                                    boolean z11 = (iM4 & 2048) != 0;
                                    boolean z12 = z10;
                                    long[] jArr2 = rVar5.i;
                                    int i38 = iM5;
                                    long[] jArr3 = rVar5.j;
                                    if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                        z2 = z7;
                                    } else {
                                        long j7 = jArr2[0];
                                        if (j7 == 0) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            long j8 = rVar5.d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (androidx.media3.common.util.j0.Y(j7, 1000000L, j8, roundingMode) + androidx.media3.common.util.j0.Y(jArr3[0], 1000000L, rVar5.c, roundingMode) >= rVar5.e) {
                                            }
                                        }
                                        j5 = jArr3[0];
                                    }
                                    int[] iArr = tVar2.h;
                                    long[] jArr4 = tVar2.i;
                                    boolean z13 = z2;
                                    boolean[] zArr2 = tVar2.j;
                                    boolean z14 = rVar5.b == 2 && (i7 & 1) != 0;
                                    int i39 = tVar2.g[i28] + i29;
                                    int i40 = i29;
                                    long j9 = rVar5.c;
                                    boolean z15 = z11;
                                    long j10 = tVar2.p;
                                    int i41 = i40;
                                    while (i41 < i39) {
                                        int iM6 = z13 ? wVar11.m() : fVar5.b;
                                        boolean z16 = z15;
                                        if (iM6 < 0) {
                                            throw j0.a(null, "Unexpected negative value: " + iM6);
                                        }
                                        int iM7 = z9 ? wVar11.m() : fVar5.c;
                                        if (iM7 < 0) {
                                            throw j0.a(null, "Unexpected negative value: " + iM7);
                                        }
                                        int iM8 = z12 ? wVar11.m() : (i41 == 0 && z8) ? i38 : fVar5.d;
                                        int i42 = i39;
                                        long[] jArr5 = jArr4;
                                        long jY = androidx.media3.common.util.j0.Y((((long) (z16 ? wVar11.m() : 0)) + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                        jArr5[i41] = jY;
                                        if (!tVar2.q) {
                                            jArr5[i41] = jY + hVar2.d.i;
                                        }
                                        iArr[i41] = iM7;
                                        zArr2[i41] = ((iM8 >> 16) & 1) == 0 && (!z14 || i41 == 0);
                                        j10 += (long) iM6;
                                        i41++;
                                        z15 = z16;
                                        z14 = z14;
                                        jArr4 = jArr5;
                                        i39 = i42;
                                    }
                                    tVar2.p = j10;
                                    i28 = i37;
                                    i29 = i39;
                                } else {
                                    i7 = i9;
                                }
                                i27++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i9 = i7;
                                size4 = size4;
                                i5 = 1953658222;
                            }
                        } else {
                            i3 = i21;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i4 = i9;
                        }
                    } else {
                        size3 = size3;
                        i3 = i21;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i4 = i9;
                    }
                    i21 = i3 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i9 = i4;
                }
                androidx.media3.common.m mVarH2 = h(arrayList5);
                if (mVarH2 != null) {
                    int size6 = sparseArray.size();
                    for (int i43 = 0; i43 < size6; i43++) {
                        h hVar3 = (h) sparseArray.valueAt(i43);
                        r rVar6 = hVar3.d.a;
                        f fVar6 = hVar3.b.a;
                        String str4 = androidx.media3.common.util.j0.a;
                        s sVar2 = rVar6.l[fVar6.a];
                        androidx.media3.common.m mVarA = mVarH2.a(sVar2 != null ? sVar2.b : null);
                        androidx.media3.common.q qVarA2 = hVar3.j.a();
                        qVarA2.r = mVarA;
                        hVar3.a.e(new androidx.media3.common.r(qVarA2));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i44 = 0; i44 < size7; i44++) {
                        h hVar4 = (h) sparseArray.valueAt(i44);
                        long j11 = this.z;
                        int i45 = hVar4.f;
                        while (true) {
                            t tVar3 = hVar4.b;
                            if (i45 >= tVar3.e || tVar3.i[i45] > j11) {
                                break;
                            }
                            if (tVar3.j[i45]) {
                                hVar4.i = i45;
                            }
                            i45++;
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((androidx.media3.container.d) arrayDeque.peek()).B.add(dVar);
            }
        }
        g();
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
