package androidx.media3.exoplayer.source.chunk;

import android.os.SystemClock;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import androidx.compose.foundation.gestures.y2;
import androidx.compose.foundation.gestures.z1;
import androidx.media3.common.i0;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.datasource.y;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.media3.exoplayer.dash.p;
import androidx.media3.exoplayer.dash.q;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.source.v0;
import androidx.media3.exoplayer.source.w0;
import androidx.media3.exoplayer.source.y0;
import androidx.media3.exoplayer.upstream.n;
import com.google.common.collect.h0;
import com.google.firebase.messaging.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements w0, y0, androidx.media3.exoplayer.upstream.i, androidx.media3.exoplayer.upstream.l {
    public final boolean[] A;
    public final androidx.media3.exoplayer.dash.m B;
    public final androidx.media3.exoplayer.dash.b C;
    public final androidx.media3.exoplayer.drm.d D;
    public final t2 E;
    public final n F;
    public final z1 G;
    public final ArrayList H;
    public final List I;
    public final v0 J;
    public final v0[] K;
    public final androidx.media3.common.util.b L;
    public f M;
    public r N;
    public androidx.media3.exoplayer.dash.b O;
    public long P;
    public long Q;
    public int R;
    public a S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int e;
    public final int[] y;
    public final r[] z;

    public h(int i, int[] iArr, r[] rVarArr, androidx.media3.exoplayer.dash.m mVar, androidx.media3.exoplayer.dash.b bVar, c2 c2Var, long j, androidx.media3.exoplayer.drm.f fVar, androidx.media3.exoplayer.drm.d dVar, t2 t2Var, androidx.media3.exoplayer.drm.d dVar2, boolean z, long j2, androidx.media3.exoplayer.util.a aVar) {
        this.e = i;
        this.y = iArr;
        this.z = rVarArr;
        this.B = mVar;
        this.C = bVar;
        this.D = dVar2;
        this.E = t2Var;
        this.F = aVar != null ? new n(aVar) : new n("ChunkSampleStream");
        this.G = new z1();
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.K = new v0[length];
        this.A = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        v0[] v0VarArr = new v0[i2];
        fVar.getClass();
        v0 v0Var = new v0(c2Var, fVar, dVar);
        this.J = v0Var;
        iArr2[0] = i;
        v0VarArr[0] = v0Var;
        int i3 = 0;
        while (i3 < length) {
            v0 v0Var2 = new v0(c2Var, null, null);
            this.K[i3] = v0Var2;
            int i4 = i3 + 1;
            v0VarArr[i4] = v0Var2;
            iArr2[i4] = this.y[i3];
            i3 = i4;
        }
        this.L = new androidx.media3.common.util.b(12, iArr2, v0VarArr);
        this.P = j;
        this.Q = j;
        this.T = z;
        if (!z || j2 == -9223372036854775807L) {
            return;
        }
        this.T = false;
        this.U = j2 < j;
    }

    public final boolean A() {
        return ((!this.T && !this.U) || this.W || this.F.c()) ? false : true;
    }

    public final void B() {
        int iC = C(this.J.u(), this.R - 1);
        while (true) {
            int i = this.R;
            if (i > iC) {
                return;
            }
            this.R = i + 1;
            a aVar = (a) this.H.get(i);
            r rVar = aVar.A;
            if (!rVar.equals(this.N)) {
                this.D.b(this.e, rVar, aVar.B, aVar.C, aVar.D);
            }
            this.N = rVar;
        }
    }

    public final int C(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.H;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void D(androidx.media3.exoplayer.dash.b bVar) {
        this.O = bVar;
        v0 v0Var = this.J;
        v0Var.k();
        t tVar = v0Var.h;
        if (tVar != null) {
            tVar.O(v0Var.e);
            v0Var.h = null;
            v0Var.g = null;
        }
        for (v0 v0Var2 : this.K) {
            v0Var2.k();
            t tVar2 = v0Var2.h;
            if (tVar2 != null) {
                tVar2.O(v0Var2.e);
                v0Var2.h = null;
                v0Var2.g = null;
            }
        }
        this.F.e(this);
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final boolean a() {
        return !z() && this.J.z(this.W);
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final void b() throws IOException {
        n nVar = this.F;
        nVar.b();
        this.J.B();
        if (nVar.d()) {
            return;
        }
        androidx.media3.exoplayer.dash.m mVar = this.B;
        androidx.media3.exoplayer.source.b bVar = mVar.m;
        if (bVar != null) {
            throw bVar;
        }
        mVar.a.b();
    }

    @Override // androidx.media3.exoplayer.upstream.l
    public final void c() {
        v0 v0Var = this.J;
        v0Var.F(true);
        t tVar = v0Var.h;
        if (tVar != null) {
            tVar.O(v0Var.e);
            v0Var.h = null;
            v0Var.g = null;
        }
        for (v0 v0Var2 : this.K) {
            v0Var2.F(true);
            t tVar2 = v0Var2.h;
            if (tVar2 != null) {
                tVar2.O(v0Var2.e);
                v0Var2.h = null;
                v0Var2.g = null;
            }
        }
        for (androidx.media3.exoplayer.dash.k kVar : this.B.i) {
            e eVar = kVar.a;
            if (eVar != null) {
                eVar.e.release();
            }
        }
        androidx.media3.exoplayer.dash.b bVar = this.O;
        if (bVar != null) {
            synchronized (bVar) {
                p pVar = (p) bVar.K.remove(this);
                if (pVar != null) {
                    v0 v0Var3 = pVar.a;
                    v0Var3.F(true);
                    t tVar3 = v0Var3.h;
                    if (tVar3 != null) {
                        tVar3.O(v0Var3.e);
                        v0Var3.h = null;
                        v0Var3.g = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:183:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:185:0x0406 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x040a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0412  */
    /* JADX WARN: Code duplicated, block: B:191:0x0417  */
    /* JADX WARN: Code duplicated, block: B:193:0x041f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0429 A[LOOP:0: B:194:0x0427->B:195:0x0429, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x044d A[LOOP:1: B:199:0x044a->B:201:0x044d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    /* JADX WARN: Code duplicated, block: B:205:0x0465  */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x041f, please report this as an issue */
    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(n0 n0Var) {
        long j;
        List list;
        z1 z1Var;
        long j2;
        boolean z;
        long j3;
        List list2;
        k kVar;
        androidx.media3.exoplayer.dash.k[] kVarArr;
        long jMax;
        n nVar;
        z1 z1Var2;
        long j4;
        boolean z2;
        long j5;
        long jK;
        Object iVar;
        long jK2;
        boolean z3;
        boolean z4;
        f fVar;
        boolean z5;
        androidx.media3.common.util.b bVar;
        a aVar;
        v0[] v0VarArr;
        int[] iArr;
        int i;
        long j6;
        long j7;
        int i2;
        if (this.W) {
            return false;
        }
        n nVar2 = this.F;
        if (nVar2.d() || nVar2.c()) {
            return false;
        }
        boolean z6 = z();
        if (z6) {
            list = Collections.EMPTY_LIST;
            j = this.P;
        } else {
            j = x().E;
            list = this.I;
        }
        List list3 = list;
        androidx.media3.exoplayer.dash.m mVar = this.B;
        androidx.media3.exoplayer.source.b bVar2 = mVar.m;
        z1 z1Var3 = this.G;
        if (bVar2 == null) {
            z1Var = z1Var3;
            long j8 = n0Var.a;
            j2 = -9223372036854775807L;
            long j9 = j - j8;
            long jQ = j0.Q(mVar.k.b(mVar.l).b) + j0.Q(mVar.k.a) + j;
            p pVar = mVar.h;
            if (pVar != null) {
                q qVar = pVar.e;
                androidx.media3.exoplayer.dash.manifest.c cVar = qVar.C;
                androidx.media3.exoplayer.dash.f fVar2 = qVar.y;
                z = z6;
                if (!cVar.d) {
                    j3 = j8;
                    z3 = false;
                } else if (qVar.E) {
                    j3 = j8;
                    z3 = true;
                } else {
                    j3 = j8;
                    Map.Entry entryCeilingEntry = qVar.B.ceilingEntry(Long.valueOf(cVar.h));
                    if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jQ) {
                        z3 = false;
                    } else {
                        long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                        androidx.media3.exoplayer.dash.i iVar2 = fVar2.a;
                        long j10 = iVar2.M;
                        if (j10 == -9223372036854775807L || j10 < jLongValue) {
                            iVar2.M = jLongValue;
                        }
                        z3 = true;
                    }
                    if (z3 && qVar.D) {
                        qVar.E = true;
                        qVar.D = false;
                        androidx.media3.exoplayer.dash.i iVar3 = fVar2.a;
                        iVar3.D.removeCallbacks(iVar3.w);
                        iVar3.z();
                    }
                }
                if (z3) {
                }
                z4 = z1Var2.e;
                fVar = (f) z1Var2.y;
                z1Var2.y = null;
                z1Var2.e = false;
                if (z4) {
                    this.P = j4;
                    this.W = true;
                    return true;
                }
                if (fVar == null) {
                    return false;
                }
                this.M = fVar;
                z5 = fVar instanceof a;
                bVar = this.L;
                if (z5) {
                    aVar = (a) fVar;
                    if (z) {
                        j6 = aVar.D;
                        j7 = this.P;
                        if (j6 < j7) {
                            this.J.t = j7;
                            for (v0 v0Var : this.K) {
                                v0Var.t = this.P;
                            }
                            this.U = this.T;
                        }
                        this.T = false;
                        this.P = -9223372036854775807L;
                    }
                    aVar.J = bVar;
                    v0VarArr = (v0[]) bVar.z;
                    iArr = new int[v0VarArr.length];
                    for (i = 0; i < v0VarArr.length; i++) {
                        v0 v0Var2 = v0VarArr[i];
                        iArr[i] = v0Var2.q + v0Var2.p;
                    }
                    aVar.K = iArr;
                    this.H.add(aVar);
                } else if (fVar instanceof j) {
                    ((j) fVar).H = bVar;
                }
                nVar.f(fVar, this, this.E.f(fVar.z));
                return true;
            }
            z = z6;
            j3 = j8;
            long jQ2 = j0.Q(j0.C(mVar.f));
            androidx.media3.exoplayer.dash.manifest.c cVar2 = mVar.k;
            long j11 = cVar2.a;
            long jQ3 = j11 == -9223372036854775807L ? -9223372036854775807L : jQ2 - j0.Q(j11 + cVar2.b(mVar.l).b);
            if (list3.isEmpty()) {
                list2 = list3;
                kVar = null;
            } else {
                int size = list3.size() - 1;
                list2 = list3;
                kVar = (k) list2.get(size);
            }
            int length = mVar.j.length();
            l[] lVarArr = new l[length];
            long j12 = jQ3;
            int i3 = 0;
            while (true) {
                kVarArr = mVar.i;
                if (i3 >= length) {
                    break;
                }
                androidx.media3.exoplayer.dash.k kVar2 = kVarArr[i3];
                androidx.media3.exoplayer.dash.j jVar = kVar2.d;
                long j13 = j9;
                int i4 = length;
                long j14 = kVar2.f;
                long j15 = kVar2.e;
                com.google.android.gms.common.internal.k kVar3 = l.c;
                if (jVar == null) {
                    lVarArr[i3] = kVar3;
                } else {
                    jVar.getClass();
                    long jM = jVar.m(j15, jQ2) + j14;
                    long jB = kVar2.b(jQ2);
                    if (kVar != null) {
                        jK2 = kVar.a();
                    } else {
                        androidx.media3.exoplayer.dash.j jVar2 = kVar2.d;
                        jVar2.getClass();
                        jK2 = j0.k(jVar2.s(j, j15) + j14, jM, jB);
                    }
                    long j16 = jK2;
                    if (j16 < jM) {
                        lVarArr[i3] = kVar3;
                    } else {
                        lVarArr[i3] = new androidx.media3.exoplayer.dash.l(mVar.b(i3), j16, jB);
                    }
                }
                i3++;
                length = i4;
                j9 = j13;
            }
            long j17 = j9;
            long j18 = 0;
            if (!mVar.k.d || kVarArr[0].c() == 0) {
                jMax = -9223372036854775807L;
            } else {
                long jD = kVarArr[0].d(kVarArr[0].b(jQ2));
                androidx.media3.exoplayer.dash.manifest.c cVar3 = mVar.k;
                long j19 = cVar3.a;
                long jMin = Math.min(j19 == -9223372036854775807L ? -9223372036854775807L : jQ2 - j0.Q(j19 + cVar3.b(mVar.l).b), jD) - j3;
                j18 = 0;
                jMax = Math.max(0L, jMin);
            }
            nVar = nVar2;
            z1Var2 = z1Var;
            long j20 = j18;
            long j21 = j3;
            j4 = -9223372036854775807L;
            mVar.j.l(j21, j17, jMax, list2, lVarArr);
            int iD = mVar.j.d();
            SystemClock.elapsedRealtime();
            androidx.media3.exoplayer.dash.k kVarB = mVar.b(iD);
            long j22 = kVarB.e;
            long j23 = kVarB.f;
            androidx.media3.exoplayer.dash.j jVar3 = kVarB.d;
            androidx.media3.exoplayer.dash.manifest.b bVar3 = kVarB.c;
            e eVar = kVarB.a;
            androidx.media3.exoplayer.dash.manifest.m mVar2 = kVarB.b;
            if (eVar != null) {
                androidx.media3.exoplayer.dash.manifest.j jVar4 = eVar.G == null ? mVar2.B : null;
                androidx.media3.exoplayer.dash.manifest.j jVarD = jVar3 == null ? mVar2.d() : null;
                if (jVar4 != null || jVarD != null) {
                    androidx.media3.datasource.h hVar = mVar.e;
                    r rVarN = mVar.j.n();
                    int iO = mVar.j.o();
                    Object objR = mVar.j.r();
                    if (jVar4 != null) {
                        androidx.media3.exoplayer.dash.manifest.j jVarA = jVar4.a(jVarD, bVar3.a);
                        if (jVarA != null) {
                            jVar4 = jVarA;
                        }
                    } else {
                        jVarD.getClass();
                        jVar4 = jVarD;
                    }
                    z1Var2.y = new j(hVar, _COROUTINE.b.h(mVar2, bVar3.a, jVar4, 0), rVarN, iO, objR, kVarB.a);
                }
                z4 = z1Var2.e;
                fVar = (f) z1Var2.y;
                z1Var2.y = null;
                z1Var2.e = false;
                if (z4) {
                    this.P = j4;
                    this.W = true;
                    return true;
                }
                if (fVar == null) {
                    return false;
                }
                this.M = fVar;
                z5 = fVar instanceof a;
                bVar = this.L;
                if (z5) {
                    aVar = (a) fVar;
                    if (z) {
                        j6 = aVar.D;
                        j7 = this.P;
                        if (j6 < j7) {
                            this.J.t = j7;
                            while (i2 < r5) {
                                v0Var.t = this.P;
                            }
                            this.U = this.T;
                        }
                        this.T = false;
                        this.P = -9223372036854775807L;
                    }
                    aVar.J = bVar;
                    v0VarArr = (v0[]) bVar.z;
                    iArr = new int[v0VarArr.length];
                    while (i < v0VarArr.length) {
                        v0 v0Var3 = v0VarArr[i];
                        iArr[i] = v0Var3.q + v0Var3.p;
                    }
                    aVar.K = iArr;
                    this.H.add(aVar);
                } else if (fVar instanceof j) {
                    ((j) fVar).H = bVar;
                }
                nVar.f(fVar, this, this.E.f(fVar.z));
                return true;
            }
            list2 = list2;
            androidx.media3.exoplayer.dash.manifest.c cVar4 = mVar.k;
            boolean z7 = cVar4.d && mVar.l == cVar4.m.size() + (-1);
            boolean z8 = (z7 && j22 == -9223372036854775807L) ? false : true;
            if (kVarB.c() == j20) {
                z1Var2.e = z8;
            } else {
                jVar3.getClass();
                boolean z9 = z8;
                long jM2 = jVar3.m(j22, jQ2) + j23;
                long jB2 = kVarB.b(jQ2);
                if (z7) {
                    long jD2 = kVarB.d(jB2);
                    z2 = z9 & ((jD2 - kVarB.e(jB2)) + jD2 >= j22);
                } else {
                    z2 = z9;
                }
                if (kVar != null) {
                    jK = kVar.a();
                    j5 = jB2;
                } else {
                    jVar3.getClass();
                    j5 = jB2;
                    jK = j0.k(jVar3.s(j, j22) + j23, jM2, j5);
                }
                long j24 = jK;
                if (j24 < jM2) {
                    mVar.m = new androidx.media3.exoplayer.source.b();
                } else if (j24 <= j5) {
                    long j25 = j;
                    if (mVar.n && j24 >= j5) {
                        z1Var2.e = z2;
                    } else if (!z2 || kVarB.e(j24) < j22) {
                        int iMin = (int) Math.min(mVar.g, (j5 - j24) + 1);
                        if (j22 != -9223372036854775807L) {
                            while (iMin > 1 && kVarB.e((((long) iMin) + j24) - 1) >= j22) {
                                iMin--;
                            }
                        }
                        long j26 = list2.isEmpty() ? j25 : -9223372036854775807L;
                        androidx.media3.datasource.h hVar2 = mVar.e;
                        int i5 = mVar.d;
                        r rVarN2 = mVar.j.n();
                        int iO2 = mVar.j.o();
                        Object objR2 = mVar.j.r();
                        long jE = kVarB.e(j24);
                        jVar3.getClass();
                        androidx.media3.exoplayer.dash.manifest.j jVarQ = jVar3.q(j24 - j23);
                        if (eVar == null) {
                            iVar = new m(hVar2, _COROUTINE.b.h(mVar2, bVar3.a, jVarQ, kVarB.f(j24, j12) ? 0 : 8), rVarN2, iO2, objR2, jE, kVarB.d(j24), j24, i5, rVarN2);
                        } else {
                            int i6 = 1;
                            int i7 = 1;
                            while (true) {
                                rVarN2 = rVarN2;
                                if (i6 >= iMin) {
                                    break;
                                }
                                jVar3.getClass();
                                androidx.media3.exoplayer.dash.manifest.j jVarA2 = jVarQ.a(jVar3.q((j24 + ((long) i6)) - j23), bVar3.a);
                                if (jVarA2 == null) {
                                    break;
                                }
                                i7++;
                                i6++;
                                jVarQ = jVarA2;
                            }
                            long j27 = (j24 + ((long) i7)) - 1;
                            long jD3 = kVarB.d(j27);
                            long j28 = (j22 == -9223372036854775807L || j22 > jD3) ? -9223372036854775807L : j22;
                            androidx.media3.datasource.l lVarH = _COROUTINE.b.h(mVar2, bVar3.a, jVarQ, kVarB.f(j27, j12) ? 0 : 8);
                            long j29 = -mVar2.z;
                            if (i0.m(rVarN2.o)) {
                                j29 += jE;
                            }
                            iVar = new i(hVar2, lVarH, rVarN2, iO2, objR2, jE, jD3, j26, j28, j24, i7, j29, kVarB.a);
                        }
                        z1Var2.y = iVar;
                    } else {
                        z1Var2.e = true;
                    }
                } else {
                    z1Var2.e = z2;
                }
            }
            z4 = z1Var2.e;
            fVar = (f) z1Var2.y;
            z1Var2.y = null;
            z1Var2.e = false;
            if (z4) {
                this.P = j4;
                this.W = true;
                return true;
            }
            if (fVar == null) {
                return false;
            }
            this.M = fVar;
            z5 = fVar instanceof a;
            bVar = this.L;
            if (z5) {
                aVar = (a) fVar;
                if (z) {
                    j6 = aVar.D;
                    j7 = this.P;
                    if (j6 < j7) {
                        this.J.t = j7;
                        while (i2 < r5) {
                            v0Var.t = this.P;
                        }
                        this.U = this.T;
                    }
                    this.T = false;
                    this.P = -9223372036854775807L;
                }
                aVar.J = bVar;
                v0VarArr = (v0[]) bVar.z;
                iArr = new int[v0VarArr.length];
                while (i < v0VarArr.length) {
                    v0 v0Var4 = v0VarArr[i];
                    iArr[i] = v0Var4.q + v0Var4.p;
                }
                aVar.K = iArr;
                this.H.add(aVar);
            } else if (fVar instanceof j) {
                ((j) fVar).H = bVar;
            }
            nVar.f(fVar, this, this.E.f(fVar.z));
            return true;
        }
        z = z6;
        z1Var = z1Var3;
        j2 = -9223372036854775807L;
        nVar = nVar2;
        z1Var2 = z1Var;
        j4 = j2;
        z4 = z1Var2.e;
        fVar = (f) z1Var2.y;
        z1Var2.y = null;
        z1Var2.e = false;
        if (z4) {
            this.P = j4;
            this.W = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.M = fVar;
        z5 = fVar instanceof a;
        bVar = this.L;
        if (z5) {
            aVar = (a) fVar;
            if (z) {
                j6 = aVar.D;
                j7 = this.P;
                if (j6 < j7) {
                    this.J.t = j7;
                    while (i2 < r5) {
                        v0Var.t = this.P;
                    }
                    this.U = this.T;
                }
                this.T = false;
                this.P = -9223372036854775807L;
            }
            aVar.J = bVar;
            v0VarArr = (v0[]) bVar.z;
            iArr = new int[v0VarArr.length];
            while (i < v0VarArr.length) {
                v0 v0Var5 = v0VarArr[i];
                iArr[i] = v0Var5.q + v0Var5.p;
            }
            aVar.K = iArr;
            this.H.add(aVar);
        } else if (fVar instanceof j) {
            ((j) fVar).H = bVar;
        }
        nVar.f(fVar, this, this.E.f(fVar.z));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023a  */
    /* JADX WARN: Code duplicated, block: B:101:0x023c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:106:0x024d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0254  */
    /* JADX WARN: Code duplicated, block: B:109:0x0257  */
    /* JADX WARN: Code duplicated, block: B:111:0x0262  */
    /* JADX WARN: Code duplicated, block: B:112:0x026a  */
    /* JADX WARN: Code duplicated, block: B:115:0x028c  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x015c A[LOOP:1: B:62:0x0156->B:64:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0186 A[LOOP:2: B:66:0x0180->B:68:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0207  */
    /* JADX WARN: Code duplicated, block: B:91:0x0215  */
    /* JADX WARN: Code duplicated, block: B:96:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0232  */
    /* JADX WARN: Code duplicated, block: B:98:0x0234  */
    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        androidx.media3.exoplayer.dash.manifest.b bVar;
        androidx.media3.exoplayer.dash.manifest.b bVarF;
        androidx.media3.exoplayer.trackselection.q qVar;
        h0 h0Var;
        long jElapsedRealtime;
        t2 t2Var;
        int length;
        ArrayList arrayList;
        androidx.media3.exoplayer.source.n nVar;
        int i2;
        int i3;
        HashSet hashSet;
        int i4;
        androidx.media3.exoplayer.upstream.g gVar;
        HashSet hashSet2;
        ArrayList arrayListH;
        boolean z4;
        int i5;
        androidx.media3.exoplayer.upstream.h hVarE;
        long j3;
        int i6;
        boolean z5;
        long jElapsedRealtime2;
        String str;
        HashMap map;
        long jMax;
        int i7;
        boolean zP;
        Integer numValueOf;
        HashMap map2;
        androidx.media3.exoplayer.upstream.h hVar;
        boolean zA;
        long jG;
        boolean z6;
        f fVar = (f) kVar;
        y yVar = fVar.F;
        r rVar = fVar.A;
        long j4 = fVar.D;
        long j5 = yVar.y;
        boolean z7 = fVar instanceof a;
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size() - 1;
        if (j5 != 0 && z7 && y(size)) {
            z = false;
            z2 = false;
        } else {
            z = true;
            z2 = false;
        }
        androidx.media3.datasource.l lVar = fVar.y;
        y yVar2 = fVar.F;
        androidx.media3.exoplayer.source.n nVar2 = new androidx.media3.exoplayer.source.n(lVar, yVar2.z, yVar2.A, j, j2, j5);
        j0.d0(j4);
        j0.d0(fVar.E);
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar2 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iOException, i, 3);
        androidx.media3.exoplayer.dash.m mVar = this.B;
        androidx.media3.exoplayer.dash.k[] kVarArr = mVar.i;
        o oVar = mVar.b;
        t2 t2Var2 = this.E;
        if (z) {
            z3 = z7;
            p pVar = mVar.h;
            if (pVar != null) {
                long j6 = pVar.d;
                boolean z8 = j6 != -9223372036854775807L && j6 < j4;
                q qVar2 = pVar.e;
                if (qVar2.C.d) {
                    if (!qVar2.E) {
                        if (z8) {
                            if (qVar2.D) {
                                qVar2.E = true;
                                qVar2.D = false;
                                androidx.media3.exoplayer.dash.i iVar = qVar2.y.a;
                                iVar.D.removeCallbacks(iVar.w);
                                iVar.z();
                            }
                        } else if (mVar.k.d && (fVar instanceof k) && (iOException instanceof androidx.media3.datasource.t) && ((androidx.media3.datasource.t) iOException).z == 404) {
                            androidx.media3.exoplayer.dash.k kVar2 = kVarArr[mVar.j.b(rVar)];
                            long jC = kVar2.c();
                            if (jC == -1 || jC == 0) {
                                androidx.media3.exoplayer.dash.k kVar3 = kVarArr[mVar.j.b(rVar)];
                                androidx.media3.exoplayer.dash.manifest.m mVar2 = kVar3.b;
                                bVar = kVar3.c;
                                bVarF = oVar.F(mVar2.y);
                                if (bVarF != null) {
                                }
                                qVar = mVar.j;
                                h0Var = kVar3.b.y;
                                boolean z9 = z;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                t2Var = t2Var2;
                                length = qVar.length();
                                arrayList = arrayList2;
                                nVar = nVar2;
                                i3 = 0;
                                for (i2 = 0; i2 < length; i2++) {
                                    if (qVar.a(i2, jElapsedRealtime)) {
                                        i3++;
                                    }
                                }
                                hashSet = new HashSet();
                                for (i4 = 0; i4 < h0Var.size(); i4++) {
                                    hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                                }
                                int size2 = hashSet.size();
                                hashSet2 = new HashSet();
                                arrayListH = oVar.h(h0Var);
                                z4 = z9;
                                for (i5 = 0; i5 < arrayListH.size(); i5++) {
                                    hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                                }
                                gVar = new androidx.media3.exoplayer.upstream.g(size2, size2 - hashSet2.size(), length, i3);
                                if (gVar.a(2)) {
                                    t2Var.getClass();
                                    hVarE = t2.e(gVar, lVar2);
                                    if (hVarE != null) {
                                        j3 = hVarE.b;
                                        i6 = hVarE.a;
                                        if (gVar.a(i6)) {
                                            if (i6 == 2) {
                                                androidx.media3.exoplayer.trackselection.q qVar3 = mVar.j;
                                                zP = qVar3.p(qVar3.b(rVar), j3);
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                                if (i6 == 1) {
                                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                                    str = bVar.b;
                                                    map = (HashMap) oVar.y;
                                                    if (map.containsKey(str)) {
                                                        Long l = (Long) map.get(str);
                                                        String str2 = j0.a;
                                                        jMax = Math.max(jElapsedRealtime2, l.longValue());
                                                    } else {
                                                        jMax = jElapsedRealtime2;
                                                    }
                                                    map.put(str, Long.valueOf(jMax));
                                                    i7 = bVar.c;
                                                    if (i7 != Integer.MIN_VALUE) {
                                                        numValueOf = Integer.valueOf(i7);
                                                        map2 = (HashMap) oVar.z;
                                                        if (map2.containsKey(numValueOf)) {
                                                            Long l2 = (Long) map2.get(numValueOf);
                                                            String str3 = j0.a;
                                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                                                        }
                                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                    }
                                                    zP = true;
                                                }
                                            }
                                        }
                                        zP = false;
                                    }
                                } else {
                                    t2Var.getClass();
                                    hVarE = t2.e(gVar, lVar2);
                                    if (hVarE != null) {
                                        j3 = hVarE.b;
                                        i6 = hVarE.a;
                                        if (gVar.a(i6)) {
                                            if (i6 == 2) {
                                                androidx.media3.exoplayer.trackselection.q qVar4 = mVar.j;
                                                zP = qVar4.p(qVar4.b(rVar), j3);
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                                if (i6 == 1) {
                                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                                    str = bVar.b;
                                                    map = (HashMap) oVar.y;
                                                    if (map.containsKey(str)) {
                                                        Long l3 = (Long) map.get(str);
                                                        String str4 = j0.a;
                                                        jMax = Math.max(jElapsedRealtime2, l3.longValue());
                                                    } else {
                                                        jMax = jElapsedRealtime2;
                                                    }
                                                    map.put(str, Long.valueOf(jMax));
                                                    i7 = bVar.c;
                                                    if (i7 != Integer.MIN_VALUE) {
                                                        numValueOf = Integer.valueOf(i7);
                                                        map2 = (HashMap) oVar.z;
                                                        if (map2.containsKey(numValueOf)) {
                                                            Long l4 = (Long) map2.get(numValueOf);
                                                            String str5 = j0.a;
                                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l4.longValue());
                                                        }
                                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                    }
                                                    zP = true;
                                                }
                                            }
                                        }
                                        zP = false;
                                    }
                                }
                            } else {
                                androidx.media3.exoplayer.dash.j jVar = kVar2.d;
                                jVar.getClass();
                                if (((k) fVar).a() > ((jVar.y() + kVar2.f) + jC) - 1) {
                                    mVar.n = true;
                                } else {
                                    androidx.media3.exoplayer.dash.k kVar4 = kVarArr[mVar.j.b(rVar)];
                                    androidx.media3.exoplayer.dash.manifest.m mVar3 = kVar4.b;
                                    bVar = kVar4.c;
                                    bVarF = oVar.F(mVar3.y);
                                    if (bVarF != null) {
                                    }
                                    qVar = mVar.j;
                                    h0Var = kVar4.b.y;
                                    boolean z10 = z;
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                    t2Var = t2Var2;
                                    length = qVar.length();
                                    arrayList = arrayList2;
                                    nVar = nVar2;
                                    i3 = 0;
                                    while (i2 < length) {
                                        if (qVar.a(i2, jElapsedRealtime)) {
                                            i3++;
                                        }
                                    }
                                    hashSet = new HashSet();
                                    while (i4 < h0Var.size()) {
                                        hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                                    }
                                    int size3 = hashSet.size();
                                    hashSet2 = new HashSet();
                                    arrayListH = oVar.h(h0Var);
                                    z4 = z10;
                                    while (i5 < arrayListH.size()) {
                                        hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                                    }
                                    gVar = new androidx.media3.exoplayer.upstream.g(size3, size3 - hashSet2.size(), length, i3);
                                    if (gVar.a(2)) {
                                        t2Var.getClass();
                                        hVarE = t2.e(gVar, lVar2);
                                        if (hVarE != null) {
                                            j3 = hVarE.b;
                                            i6 = hVarE.a;
                                            if (gVar.a(i6)) {
                                                if (i6 == 2) {
                                                    androidx.media3.exoplayer.trackselection.q qVar5 = mVar.j;
                                                    zP = qVar5.p(qVar5.b(rVar), j3);
                                                    z5 = true;
                                                } else {
                                                    z5 = true;
                                                    if (i6 == 1) {
                                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                                        str = bVar.b;
                                                        map = (HashMap) oVar.y;
                                                        if (map.containsKey(str)) {
                                                            Long l5 = (Long) map.get(str);
                                                            String str6 = j0.a;
                                                            jMax = Math.max(jElapsedRealtime2, l5.longValue());
                                                        } else {
                                                            jMax = jElapsedRealtime2;
                                                        }
                                                        map.put(str, Long.valueOf(jMax));
                                                        i7 = bVar.c;
                                                        if (i7 != Integer.MIN_VALUE) {
                                                            numValueOf = Integer.valueOf(i7);
                                                            map2 = (HashMap) oVar.z;
                                                            if (map2.containsKey(numValueOf)) {
                                                                Long l6 = (Long) map2.get(numValueOf);
                                                                String str7 = j0.a;
                                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l6.longValue());
                                                            }
                                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                        }
                                                        zP = true;
                                                    }
                                                }
                                            }
                                            zP = false;
                                        }
                                    } else {
                                        t2Var.getClass();
                                        hVarE = t2.e(gVar, lVar2);
                                        if (hVarE != null) {
                                            j3 = hVarE.b;
                                            i6 = hVarE.a;
                                            if (gVar.a(i6)) {
                                                if (i6 == 2) {
                                                    androidx.media3.exoplayer.trackselection.q qVar6 = mVar.j;
                                                    zP = qVar6.p(qVar6.b(rVar), j3);
                                                    z5 = true;
                                                } else {
                                                    z5 = true;
                                                    if (i6 == 1) {
                                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                                        str = bVar.b;
                                                        map = (HashMap) oVar.y;
                                                        if (map.containsKey(str)) {
                                                            Long l7 = (Long) map.get(str);
                                                            String str8 = j0.a;
                                                            jMax = Math.max(jElapsedRealtime2, l7.longValue());
                                                        } else {
                                                            jMax = jElapsedRealtime2;
                                                        }
                                                        map.put(str, Long.valueOf(jMax));
                                                        i7 = bVar.c;
                                                        if (i7 != Integer.MIN_VALUE) {
                                                            numValueOf = Integer.valueOf(i7);
                                                            map2 = (HashMap) oVar.z;
                                                            if (map2.containsKey(numValueOf)) {
                                                                Long l8 = (Long) map2.get(numValueOf);
                                                                String str9 = j0.a;
                                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l8.longValue());
                                                            }
                                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                        }
                                                        zP = true;
                                                    }
                                                }
                                            }
                                            zP = false;
                                        }
                                    }
                                }
                            }
                        } else {
                            androidx.media3.exoplayer.dash.k kVar5 = kVarArr[mVar.j.b(rVar)];
                            androidx.media3.exoplayer.dash.manifest.m mVar4 = kVar5.b;
                            bVar = kVar5.c;
                            bVarF = oVar.F(mVar4.y);
                            if (bVarF != null || bVar.equals(bVarF)) {
                                qVar = mVar.j;
                                h0Var = kVar5.b.y;
                                boolean z11 = z;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                t2Var = t2Var2;
                                length = qVar.length();
                                arrayList = arrayList2;
                                nVar = nVar2;
                                i3 = 0;
                                while (i2 < length) {
                                    if (qVar.a(i2, jElapsedRealtime)) {
                                        i3++;
                                    }
                                }
                                hashSet = new HashSet();
                                while (i4 < h0Var.size()) {
                                    hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                                }
                                int size4 = hashSet.size();
                                hashSet2 = new HashSet();
                                arrayListH = oVar.h(h0Var);
                                z4 = z11;
                                while (i5 < arrayListH.size()) {
                                    hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                                }
                                gVar = new androidx.media3.exoplayer.upstream.g(size4, size4 - hashSet2.size(), length, i3);
                                if (gVar.a(2) || gVar.a(1)) {
                                    t2Var.getClass();
                                    hVarE = t2.e(gVar, lVar2);
                                    if (hVarE != null) {
                                        j3 = hVarE.b;
                                        i6 = hVarE.a;
                                        if (gVar.a(i6)) {
                                            if (i6 == 2) {
                                                androidx.media3.exoplayer.trackselection.q qVar7 = mVar.j;
                                                zP = qVar7.p(qVar7.b(rVar), j3);
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                                if (i6 == 1) {
                                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                                    str = bVar.b;
                                                    map = (HashMap) oVar.y;
                                                    if (map.containsKey(str)) {
                                                        Long l9 = (Long) map.get(str);
                                                        String str10 = j0.a;
                                                        jMax = Math.max(jElapsedRealtime2, l9.longValue());
                                                    } else {
                                                        jMax = jElapsedRealtime2;
                                                    }
                                                    map.put(str, Long.valueOf(jMax));
                                                    i7 = bVar.c;
                                                    if (i7 != Integer.MIN_VALUE) {
                                                        numValueOf = Integer.valueOf(i7);
                                                        map2 = (HashMap) oVar.z;
                                                        if (map2.containsKey(numValueOf)) {
                                                            Long l10 = (Long) map2.get(numValueOf);
                                                            String str11 = j0.a;
                                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l10.longValue());
                                                        }
                                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                    }
                                                    zP = true;
                                                }
                                            }
                                        }
                                        zP = false;
                                    }
                                }
                            }
                        }
                    }
                    t2Var = t2Var2;
                    arrayList = arrayList2;
                    z4 = z;
                    nVar = nVar2;
                    z5 = true;
                    zP = true;
                } else if (mVar.k.d) {
                    androidx.media3.exoplayer.dash.k kVar6 = kVarArr[mVar.j.b(rVar)];
                    androidx.media3.exoplayer.dash.manifest.m mVar5 = kVar6.b;
                    bVar = kVar6.c;
                    bVarF = oVar.F(mVar5.y);
                    if (bVarF != null) {
                    }
                    qVar = mVar.j;
                    h0Var = kVar6.b.y;
                    boolean z12 = z;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    t2Var = t2Var2;
                    length = qVar.length();
                    arrayList = arrayList2;
                    nVar = nVar2;
                    i3 = 0;
                    while (i2 < length) {
                        if (qVar.a(i2, jElapsedRealtime)) {
                            i3++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i4 < h0Var.size()) {
                        hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                    }
                    int size5 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListH = oVar.h(h0Var);
                    z4 = z12;
                    while (i5 < arrayListH.size()) {
                        hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                    }
                    gVar = new androidx.media3.exoplayer.upstream.g(size5, size5 - hashSet2.size(), length, i3);
                    if (gVar.a(2)) {
                        t2Var.getClass();
                        hVarE = t2.e(gVar, lVar2);
                        if (hVarE != null) {
                            j3 = hVarE.b;
                            i6 = hVarE.a;
                            if (gVar.a(i6)) {
                                if (i6 == 2) {
                                    androidx.media3.exoplayer.trackselection.q qVar8 = mVar.j;
                                    zP = qVar8.p(qVar8.b(rVar), j3);
                                    z5 = true;
                                } else {
                                    z5 = true;
                                    if (i6 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                        str = bVar.b;
                                        map = (HashMap) oVar.y;
                                        if (map.containsKey(str)) {
                                            Long l11 = (Long) map.get(str);
                                            String str12 = j0.a;
                                            jMax = Math.max(jElapsedRealtime2, l11.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i7 = bVar.c;
                                        if (i7 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i7);
                                            map2 = (HashMap) oVar.z;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l12 = (Long) map2.get(numValueOf);
                                                String str13 = j0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l12.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zP = true;
                                    }
                                }
                            }
                            zP = false;
                        }
                    } else {
                        t2Var.getClass();
                        hVarE = t2.e(gVar, lVar2);
                        if (hVarE != null) {
                            j3 = hVarE.b;
                            i6 = hVarE.a;
                            if (gVar.a(i6)) {
                                if (i6 == 2) {
                                    androidx.media3.exoplayer.trackselection.q qVar9 = mVar.j;
                                    zP = qVar9.p(qVar9.b(rVar), j3);
                                    z5 = true;
                                } else {
                                    z5 = true;
                                    if (i6 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                        str = bVar.b;
                                        map = (HashMap) oVar.y;
                                        if (map.containsKey(str)) {
                                            Long l13 = (Long) map.get(str);
                                            String str14 = j0.a;
                                            jMax = Math.max(jElapsedRealtime2, l13.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i7 = bVar.c;
                                        if (i7 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i7);
                                            map2 = (HashMap) oVar.z;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l14 = (Long) map2.get(numValueOf);
                                                String str15 = j0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l14.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zP = true;
                                    }
                                }
                            }
                            zP = false;
                        }
                    }
                } else {
                    androidx.media3.exoplayer.dash.k kVar7 = kVarArr[mVar.j.b(rVar)];
                    androidx.media3.exoplayer.dash.manifest.m mVar6 = kVar7.b;
                    bVar = kVar7.c;
                    bVarF = oVar.F(mVar6.y);
                    if (bVarF != null) {
                    }
                    qVar = mVar.j;
                    h0Var = kVar7.b.y;
                    boolean z13 = z;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    t2Var = t2Var2;
                    length = qVar.length();
                    arrayList = arrayList2;
                    nVar = nVar2;
                    i3 = 0;
                    while (i2 < length) {
                        if (qVar.a(i2, jElapsedRealtime)) {
                            i3++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i4 < h0Var.size()) {
                        hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                    }
                    int size6 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListH = oVar.h(h0Var);
                    z4 = z13;
                    while (i5 < arrayListH.size()) {
                        hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                    }
                    gVar = new androidx.media3.exoplayer.upstream.g(size6, size6 - hashSet2.size(), length, i3);
                    if (gVar.a(2)) {
                        t2Var.getClass();
                        hVarE = t2.e(gVar, lVar2);
                        if (hVarE != null) {
                            j3 = hVarE.b;
                            i6 = hVarE.a;
                            if (gVar.a(i6)) {
                                if (i6 == 2) {
                                    androidx.media3.exoplayer.trackselection.q qVar10 = mVar.j;
                                    zP = qVar10.p(qVar10.b(rVar), j3);
                                    z5 = true;
                                } else {
                                    z5 = true;
                                    if (i6 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                        str = bVar.b;
                                        map = (HashMap) oVar.y;
                                        if (map.containsKey(str)) {
                                            Long l15 = (Long) map.get(str);
                                            String str16 = j0.a;
                                            jMax = Math.max(jElapsedRealtime2, l15.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i7 = bVar.c;
                                        if (i7 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i7);
                                            map2 = (HashMap) oVar.z;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l16 = (Long) map2.get(numValueOf);
                                                String str17 = j0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l16.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zP = true;
                                    }
                                }
                            }
                            zP = false;
                        }
                    } else {
                        t2Var.getClass();
                        hVarE = t2.e(gVar, lVar2);
                        if (hVarE != null) {
                            j3 = hVarE.b;
                            i6 = hVarE.a;
                            if (gVar.a(i6)) {
                                if (i6 == 2) {
                                    androidx.media3.exoplayer.trackselection.q qVar11 = mVar.j;
                                    zP = qVar11.p(qVar11.b(rVar), j3);
                                    z5 = true;
                                } else {
                                    z5 = true;
                                    if (i6 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                        str = bVar.b;
                                        map = (HashMap) oVar.y;
                                        if (map.containsKey(str)) {
                                            Long l17 = (Long) map.get(str);
                                            String str18 = j0.a;
                                            jMax = Math.max(jElapsedRealtime2, l17.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i7 = bVar.c;
                                        if (i7 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i7);
                                            map2 = (HashMap) oVar.z;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l18 = (Long) map2.get(numValueOf);
                                                String str19 = j0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l18.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zP = true;
                                    }
                                }
                            }
                            zP = false;
                        }
                    }
                }
            } else if (mVar.k.d) {
                androidx.media3.exoplayer.dash.k kVar8 = kVarArr[mVar.j.b(rVar)];
                androidx.media3.exoplayer.dash.manifest.m mVar7 = kVar8.b;
                bVar = kVar8.c;
                bVarF = oVar.F(mVar7.y);
                if (bVarF != null) {
                }
                qVar = mVar.j;
                h0Var = kVar8.b.y;
                boolean z14 = z;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                t2Var = t2Var2;
                length = qVar.length();
                arrayList = arrayList2;
                nVar = nVar2;
                i3 = 0;
                while (i2 < length) {
                    if (qVar.a(i2, jElapsedRealtime)) {
                        i3++;
                    }
                }
                hashSet = new HashSet();
                while (i4 < h0Var.size()) {
                    hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                }
                int size7 = hashSet.size();
                hashSet2 = new HashSet();
                arrayListH = oVar.h(h0Var);
                z4 = z14;
                while (i5 < arrayListH.size()) {
                    hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                }
                gVar = new androidx.media3.exoplayer.upstream.g(size7, size7 - hashSet2.size(), length, i3);
                if (gVar.a(2)) {
                    t2Var.getClass();
                    hVarE = t2.e(gVar, lVar2);
                    if (hVarE != null) {
                        j3 = hVarE.b;
                        i6 = hVarE.a;
                        if (gVar.a(i6)) {
                            if (i6 == 2) {
                                androidx.media3.exoplayer.trackselection.q qVar12 = mVar.j;
                                zP = qVar12.p(qVar12.b(rVar), j3);
                                z5 = true;
                            } else {
                                z5 = true;
                                if (i6 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                    str = bVar.b;
                                    map = (HashMap) oVar.y;
                                    if (map.containsKey(str)) {
                                        Long l19 = (Long) map.get(str);
                                        String str110 = j0.a;
                                        jMax = Math.max(jElapsedRealtime2, l19.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i7 = bVar.c;
                                    if (i7 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i7);
                                        map2 = (HashMap) oVar.z;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l110 = (Long) map2.get(numValueOf);
                                            String str111 = j0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l110.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zP = true;
                                }
                            }
                        }
                        zP = false;
                    }
                } else {
                    t2Var.getClass();
                    hVarE = t2.e(gVar, lVar2);
                    if (hVarE != null) {
                        j3 = hVarE.b;
                        i6 = hVarE.a;
                        if (gVar.a(i6)) {
                            if (i6 == 2) {
                                androidx.media3.exoplayer.trackselection.q qVar13 = mVar.j;
                                zP = qVar13.p(qVar13.b(rVar), j3);
                                z5 = true;
                            } else {
                                z5 = true;
                                if (i6 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                    str = bVar.b;
                                    map = (HashMap) oVar.y;
                                    if (map.containsKey(str)) {
                                        Long l111 = (Long) map.get(str);
                                        String str112 = j0.a;
                                        jMax = Math.max(jElapsedRealtime2, l111.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i7 = bVar.c;
                                    if (i7 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i7);
                                        map2 = (HashMap) oVar.z;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l112 = (Long) map2.get(numValueOf);
                                            String str113 = j0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l112.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zP = true;
                                }
                            }
                        }
                        zP = false;
                    }
                }
            } else {
                androidx.media3.exoplayer.dash.k kVar9 = kVarArr[mVar.j.b(rVar)];
                androidx.media3.exoplayer.dash.manifest.m mVar8 = kVar9.b;
                bVar = kVar9.c;
                bVarF = oVar.F(mVar8.y);
                if (bVarF != null) {
                }
                qVar = mVar.j;
                h0Var = kVar9.b.y;
                boolean z15 = z;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                t2Var = t2Var2;
                length = qVar.length();
                arrayList = arrayList2;
                nVar = nVar2;
                i3 = 0;
                while (i2 < length) {
                    if (qVar.a(i2, jElapsedRealtime)) {
                        i3++;
                    }
                }
                hashSet = new HashSet();
                while (i4 < h0Var.size()) {
                    hashSet.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) h0Var.get(i4)).c));
                }
                int size8 = hashSet.size();
                hashSet2 = new HashSet();
                arrayListH = oVar.h(h0Var);
                z4 = z15;
                while (i5 < arrayListH.size()) {
                    hashSet2.add(Integer.valueOf(((androidx.media3.exoplayer.dash.manifest.b) arrayListH.get(i5)).c));
                }
                gVar = new androidx.media3.exoplayer.upstream.g(size8, size8 - hashSet2.size(), length, i3);
                if (gVar.a(2)) {
                    t2Var.getClass();
                    hVarE = t2.e(gVar, lVar2);
                    if (hVarE != null) {
                        j3 = hVarE.b;
                        i6 = hVarE.a;
                        if (gVar.a(i6)) {
                            if (i6 == 2) {
                                androidx.media3.exoplayer.trackselection.q qVar14 = mVar.j;
                                zP = qVar14.p(qVar14.b(rVar), j3);
                                z5 = true;
                            } else {
                                z5 = true;
                                if (i6 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                    str = bVar.b;
                                    map = (HashMap) oVar.y;
                                    if (map.containsKey(str)) {
                                        Long l113 = (Long) map.get(str);
                                        String str114 = j0.a;
                                        jMax = Math.max(jElapsedRealtime2, l113.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i7 = bVar.c;
                                    if (i7 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i7);
                                        map2 = (HashMap) oVar.z;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l114 = (Long) map2.get(numValueOf);
                                            String str115 = j0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l114.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zP = true;
                                }
                            }
                        }
                        zP = false;
                    }
                } else {
                    t2Var.getClass();
                    hVarE = t2.e(gVar, lVar2);
                    if (hVarE != null) {
                        j3 = hVarE.b;
                        i6 = hVarE.a;
                        if (gVar.a(i6)) {
                            if (i6 == 2) {
                                androidx.media3.exoplayer.trackselection.q qVar15 = mVar.j;
                                zP = qVar15.p(qVar15.b(rVar), j3);
                                z5 = true;
                            } else {
                                z5 = true;
                                if (i6 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                                    str = bVar.b;
                                    map = (HashMap) oVar.y;
                                    if (map.containsKey(str)) {
                                        Long l115 = (Long) map.get(str);
                                        String str116 = j0.a;
                                        jMax = Math.max(jElapsedRealtime2, l115.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i7 = bVar.c;
                                    if (i7 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i7);
                                        map2 = (HashMap) oVar.z;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l116 = (Long) map2.get(numValueOf);
                                            String str117 = j0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l116.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zP = true;
                                }
                            }
                        }
                        zP = false;
                    }
                }
            }
            if (!zP) {
                hVar = null;
            } else if (z4) {
                if (z3) {
                    if (u(size) == fVar) {
                        z6 = z5;
                    } else {
                        z6 = false;
                    }
                    com.google.android.material.motion.a.q(z6);
                    if (arrayList.isEmpty()) {
                        this.P = this.Q;
                    }
                }
                hVar = n.e;
            } else {
                androidx.media3.common.util.c.t("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                hVar = null;
            }
            if (hVar == null) {
                t2Var.getClass();
                jG = t2.g(lVar2);
                if (jG != -9223372036854775807L) {
                    hVar = new androidx.media3.exoplayer.upstream.h(jG, 0, false);
                } else {
                    hVar = n.f;
                }
            }
            androidx.media3.exoplayer.upstream.h hVar2 = hVar;
            zA = hVar2.a();
            this.D.e(nVar, fVar.z, this.e, fVar.A, fVar.B, fVar.C, fVar.D, fVar.E, iOException, !zA);
            if (!zA) {
                this.M = null;
                t2Var.getClass();
                this.C.o(this);
            }
            return hVar2;
        }
        z3 = z7;
        t2Var = t2Var2;
        arrayList = arrayList2;
        z4 = z;
        nVar = nVar2;
        z5 = true;
        zP = false;
        if (!zP) {
            hVar = null;
        } else if (z4) {
            if (z3) {
                if (u(size) == fVar) {
                    z6 = z5;
                } else {
                    z6 = false;
                }
                com.google.android.material.motion.a.q(z6);
                if (arrayList.isEmpty()) {
                    this.P = this.Q;
                }
            }
            hVar = n.e;
        } else {
            androidx.media3.common.util.c.t("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            hVar = null;
        }
        if (hVar == null) {
            t2Var.getClass();
            jG = t2.g(lVar2);
            if (jG != -9223372036854775807L) {
                hVar = new androidx.media3.exoplayer.upstream.h(jG, 0, false);
            } else {
                hVar = n.f;
            }
        }
        androidx.media3.exoplayer.upstream.h hVar3 = hVar;
        zA = hVar3.a();
        this.D.e(nVar, fVar.z, this.e, fVar.A, fVar.B, fVar.C, fVar.D, fVar.E, iOException, !zA);
        if (!zA) {
            this.M = null;
            t2Var.getClass();
            this.C.o(this);
        }
        return hVar3;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        if (z()) {
            return this.P;
        }
        if (this.W) {
            return Long.MIN_VALUE;
        }
        return x().E;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int g(long j) {
        if (z() || A() || this.V) {
            return 0;
        }
        boolean z = this.W;
        v0 v0Var = this.J;
        int iW = v0Var.w(j, z);
        a aVar = this.S;
        if (aVar != null) {
            iW = Math.min(iW, aVar.d(0) - v0Var.u());
        }
        v0Var.J(iW);
        B();
        return iW;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void m(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        androidx.media3.exoplayer.source.n nVar;
        f fVar = (f) kVar;
        if (i == 0) {
            long j3 = fVar.e;
            nVar = new androidx.media3.exoplayer.source.n(fVar.y, j);
        } else {
            long j4 = fVar.e;
            androidx.media3.datasource.l lVar = fVar.y;
            y yVar = fVar.F;
            nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        }
        this.D.g(nVar, fVar.z, this.e, fVar.A, fVar.B, fVar.C, fVar.D, fVar.E, i);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.F.d();
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int o(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i) {
        if (z() || A() || this.V) {
            return -3;
        }
        a aVar = this.S;
        v0 v0Var = this.J;
        if (aVar != null && aVar.d(0) <= v0Var.u()) {
            return -3;
        }
        B();
        return v0Var.E(bVar, eVar, i, this.W);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        f fVar = (f) kVar;
        this.M = null;
        androidx.media3.exoplayer.dash.m mVar = this.B;
        androidx.media3.exoplayer.dash.k[] kVarArr = mVar.i;
        if (fVar instanceof j) {
            int iB = mVar.j.b(((j) fVar).A);
            androidx.media3.exoplayer.dash.k kVar2 = kVarArr[iB];
            if (kVar2.d == null) {
                e eVar = kVar2.a;
                eVar.getClass();
                androidx.media3.extractor.j jVarA = eVar.a();
                if (jVarA != null) {
                    androidx.media3.exoplayer.dash.manifest.m mVar2 = kVar2.b;
                    kVarArr[iB] = new androidx.media3.exoplayer.dash.k(kVar2.e, mVar2, kVar2.c, kVar2.a, kVar2.f, new y2(jVarA, mVar2.z, 1));
                }
            }
        }
        p pVar = mVar.h;
        if (pVar != null) {
            long j3 = pVar.d;
            if (j3 == -9223372036854775807L || fVar.E > j3) {
                pVar.d = fVar.E;
            }
            pVar.e.D = true;
        }
        long j4 = fVar.e;
        androidx.media3.datasource.l lVar = fVar.y;
        y yVar = fVar.F;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        this.E.getClass();
        this.D.d(nVar, fVar.z, this.e, fVar.A, fVar.B, fVar.C, fVar.D, fVar.E);
        this.C.o(this);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        if (this.W) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.P;
        }
        long jMax = this.Q;
        a aVarX = x();
        if (!aVarX.b()) {
            ArrayList arrayList = this.H;
            aVarX = arrayList.size() > 1 ? (a) androidx.privacysandbox.ads.adservices.java.internal.a.j(2, arrayList) : null;
        }
        if (aVarX != null) {
            jMax = Math.max(jMax, aVarX.E);
        }
        return Math.max(jMax, this.J.r());
    }

    public final a u(int i) {
        ArrayList arrayList = this.H;
        a aVar = (a) arrayList.get(i);
        j0.V(arrayList, i, arrayList.size());
        this.R = Math.max(this.R, arrayList.size());
        int i2 = 0;
        this.J.n(aVar.d(0));
        while (true) {
            v0[] v0VarArr = this.K;
            if (i2 >= v0VarArr.length) {
                return aVar;
            }
            v0 v0Var = v0VarArr[i2];
            i2++;
            v0Var.n(aVar.d(i2));
        }
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        n nVar = this.F;
        if (nVar.c() || z()) {
            return;
        }
        boolean zD = nVar.d();
        List list = this.I;
        androidx.media3.exoplayer.dash.m mVar = this.B;
        ArrayList arrayList = this.H;
        if (zD) {
            f fVar = this.M;
            fVar.getClass();
            boolean z = fVar instanceof a;
            if (z && y(arrayList.size() - 1)) {
                return;
            }
            if (mVar.m == null ? mVar.j.e(j, fVar, list) : false) {
                nVar.a();
                if (z) {
                    this.S = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (mVar.m != null || mVar.j.length() < 2) ? list.size() : mVar.j.j(j, list);
        if (size < arrayList.size()) {
            com.google.android.material.motion.a.q(!nVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!y(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size != -1) {
                long j2 = x().E;
                a aVarU = u(size);
                if (arrayList.isEmpty()) {
                    this.P = this.Q;
                }
                this.W = false;
                this.D.h(aVarU.D, j2, this.e);
            }
        }
        if (this.J.y()) {
            this.W = true;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        f fVar = (f) kVar;
        this.M = null;
        this.S = null;
        long j3 = fVar.e;
        androidx.media3.datasource.l lVar = fVar.y;
        y yVar = fVar.F;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        this.E.getClass();
        this.D.c(nVar, fVar.z, this.e, fVar.A, fVar.B, fVar.C, fVar.D, fVar.E);
        if (z) {
            return;
        }
        if (z()) {
            this.J.F(false);
            for (v0 v0Var : this.K) {
                v0Var.F(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.H;
            u(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.P = this.Q;
            }
        }
        this.C.o(this);
    }

    public final a x() {
        return (a) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, this.H);
    }

    public final boolean y(int i) {
        int iU;
        a aVar = (a) this.H.get(i);
        if (this.J.u() > aVar.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            v0[] v0VarArr = this.K;
            if (i2 >= v0VarArr.length) {
                return false;
            }
            iU = v0VarArr[i2].u();
            i2++;
        } while (iU <= aVar.d(i2));
        return true;
    }

    public final boolean z() {
        return this.P != -9223372036854775807L;
    }
}
