package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.util.SparseArray;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.hls.playlist.v;
import androidx.media3.exoplayer.hls.playlist.x;
import androidx.media3.exoplayer.k1;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.source.i1;
import androidx.media3.exoplayer.source.w0;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements androidx.media3.exoplayer.source.u, v {
    public final androidx.media3.exoplayer.upstream.f A;
    public final androidx.media3.exoplayer.drm.f B;
    public final androidx.media3.exoplayer.drm.d C;
    public final t2 D;
    public final androidx.media3.exoplayer.drm.d E;
    public final c2 F;
    public final IdentityHashMap G;
    public final androidx.media3.exoplayer.dash.manifest.t H;
    public final com.google.android.material.shape.g I;
    public final boolean J;
    public final int K;
    public final androidx.media3.exoplayer.analytics.k L;
    public final c M = new c(this);
    public androidx.media3.exoplayer.source.t N;
    public int O;
    public i1 P;
    public r[] Q;
    public r[] R;
    public int S;
    public androidx.media3.exoplayer.source.j T;
    public final long U;
    public final d e;
    public final androidx.media3.exoplayer.hls.playlist.e y;
    public final c z;

    public l(d dVar, androidx.media3.exoplayer.hls.playlist.e eVar, c cVar, androidx.media3.exoplayer.upstream.f fVar, androidx.media3.exoplayer.drm.f fVar2, androidx.media3.exoplayer.drm.d dVar2, t2 t2Var, androidx.media3.exoplayer.drm.d dVar3, c2 c2Var, com.google.android.material.shape.g gVar, boolean z, int i, androidx.media3.exoplayer.analytics.k kVar) {
        this.e = dVar;
        this.y = eVar;
        this.z = cVar;
        this.A = fVar;
        this.B = fVar2;
        this.C = dVar2;
        this.D = t2Var;
        this.E = dVar3;
        this.F = c2Var;
        this.I = gVar;
        this.J = z;
        this.K = i;
        this.L = kVar;
        gVar.getClass();
        e0 e0Var = h0.y;
        a1 a1Var = a1.B;
        this.T = new androidx.media3.exoplayer.source.j(a1Var, a1Var);
        this.G = new IdentityHashMap();
        this.H = new androidx.media3.exoplayer.dash.manifest.t(3);
        this.Q = new r[0];
        this.R = new r[0];
        this.U = Long.MIN_VALUE;
    }

    public static androidx.media3.common.r e(androidx.media3.common.r rVar, androidx.media3.common.r rVar2, boolean z) {
        androidx.media3.common.h0 h0Var;
        int i;
        String str;
        String str2;
        h0 h0Var2;
        int i2;
        int i3;
        String str3;
        e0 e0Var = h0.y;
        a1 a1Var = a1.B;
        if (rVar2 != null) {
            str2 = rVar2.k;
            h0Var = rVar2.l;
            i2 = rVar2.G;
            i = rVar2.e;
            i3 = rVar2.f;
            str = rVar2.d;
            str3 = rVar2.b;
            h0Var2 = rVar2.c;
        } else {
            String strW = j0.w(1, rVar.k);
            h0Var = rVar.l;
            if (z) {
                i2 = rVar.G;
                i = rVar.e;
                i3 = rVar.f;
                str = rVar.d;
                str3 = rVar.b;
                str2 = strW;
                h0Var2 = rVar.c;
            } else {
                i = 0;
                str = null;
                str2 = strW;
                h0Var2 = a1Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strE = i0.e(str2);
        int i4 = z ? rVar.h : -1;
        int i5 = z ? rVar.i : -1;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.a = rVar.a;
        qVar.b = str3;
        qVar.c = h0.o(h0Var2);
        qVar.m = i0.p(rVar.n);
        qVar.n = i0.p(strE);
        qVar.j = str2;
        qVar.k = h0Var;
        qVar.h = i4;
        qVar.i = i5;
        qVar.F = i2;
        qVar.e = i;
        qVar.f = i3;
        qVar.d = str;
        return new androidx.media3.common.r(qVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.v
    public final void a() {
        for (r rVar : this.Q) {
            androidx.media3.exoplayer.upstream.n nVar = rVar.G;
            j jVar = rVar.A;
            ArrayList arrayList = rVar.K;
            if (!arrayList.isEmpty()) {
                k kVar = (k) com.google.common.collect.q.k(arrayList);
                int iC = jVar.c(kVar);
                int i = kVar.L;
                if (iC == 1) {
                    if (!kVar.h()) {
                        com.google.android.material.motion.a.q(i != -1);
                        androidx.media3.exoplayer.hls.playlist.n nVarB = jVar.g.b(false, kVar.J);
                        nVarB.getClass();
                        h0 h0Var = nVarB.r;
                        int i2 = (int) (kVar.G - nVarB.k);
                        kVar.h0 = i2 < 0 ? 0L : ((androidx.media3.exoplayer.hls.playlist.i) (i2 < h0Var.size() ? ((androidx.media3.exoplayer.hls.playlist.k) h0Var.get(i2)).J : nVarB.s).get(i)).z;
                    }
                } else if (iC == 0) {
                    rVar.O.post(new androidx.activity.c(19, rVar, kVar));
                } else if (iC == 2 && !rVar.q0 && nVar.d()) {
                    nVar.a();
                }
            }
        }
        this.N.o(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.v
    public final boolean b(Uri uri, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        int i;
        boolean zC;
        androidx.media3.exoplayer.upstream.h hVarE;
        int iU;
        r[] rVarArr = this.Q;
        int length = rVarArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            r rVar = rVarArr[i2];
            j jVar = rVar.A;
            x[] xVarArr = jVar.e;
            androidx.media3.exoplayer.hls.playlist.e eVar = jVar.g;
            int length2 = xVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    x xVar = xVarArr[i3];
                    androidx.media3.exoplayer.hls.playlist.d dVar = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uri);
                    if (xVar.equals(dVar != null ? dVar.a : null)) {
                        if (z) {
                            hVarE = null;
                        } else {
                            androidx.media3.exoplayer.upstream.g gVarA = jVar.a(uri);
                            rVar.F.getClass();
                            hVarE = t2.e(gVarA, lVar);
                        }
                        jVar.o = uri;
                        if (hVarE != null) {
                            int i4 = hVarE.a;
                            i = i2;
                            long j = hVarE.b;
                            if (i4 == 1) {
                                androidx.media3.exoplayer.hls.playlist.d dVar2 = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uri);
                                if (dVar2 != null) {
                                    zC = androidx.media3.exoplayer.hls.playlist.d.c(dVar2, uri, j);
                                }
                            } else {
                                if (i4 != 2) {
                                    net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(i4, "Invalid fallback selection type: "));
                                    return false;
                                }
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= xVarArr.length) {
                                        i5 = -1;
                                        break;
                                    }
                                    x xVar2 = xVarArr[i5];
                                    androidx.media3.exoplayer.hls.playlist.d dVar3 = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uri);
                                    if (xVar2.equals(dVar3 != null ? dVar3.a : null)) {
                                        break;
                                    }
                                    i5++;
                                }
                                if (i5 != -1 && (iU = jVar.r.u(i5)) != -1 && jVar.r.p(iU, j)) {
                                    androidx.media3.exoplayer.hls.playlist.d dVar4 = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uri);
                                    if (dVar4 != null ? androidx.media3.exoplayer.hls.playlist.d.c(dVar4, uri, j) : false) {
                                        zC = true;
                                    }
                                }
                            }
                            z2 |= zC;
                            i2 = i + 1;
                        }
                        zC = false;
                        z2 |= zC;
                        i2 = i + 1;
                    } else {
                        i3++;
                    }
                }
                i = i2;
                zC = false;
                z2 |= zC;
                i2 = i + 1;
            }
        }
        this.N.o(this);
        return z2;
    }

    public final r c(String str, int i, x[] xVarArr, androidx.media3.common.r[] rVarArr, androidx.media3.common.r rVar, List list, Map map, long j) throws Throwable {
        r rVar2 = new r(str, i, this.M, new j(this.e, this.y, xVarArr, rVarArr, this.z, this.A, this.H, list, this.L), map, this.F, j, rVar, this.B, this.C, this.D, this.E, this.K, null);
        long j2 = this.U;
        rVar2.r0 = j2;
        if (rVar2.Z) {
            for (q qVar : rVar2.S) {
                qVar.I(j2);
            }
        }
        return rVar2;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(n0 n0Var) {
        if (this.P != null) {
            return this.T.d(n0Var);
        }
        for (r rVar : this.Q) {
            if (!rVar.a0) {
                m0 m0Var = new m0();
                m0Var.a = rVar.m0;
                rVar.d(new n0(m0Var));
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        return this.T.f();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() throws IOException {
        for (r rVar : this.Q) {
            rVar.G();
            if (rVar.q0 && !rVar.a0) {
                throw androidx.media3.common.j0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        for (r rVar : this.R) {
            if (rVar.X == 2) {
                j jVar = rVar.A;
                androidx.media3.exoplayer.hls.playlist.e eVar = jVar.g;
                int iD = jVar.r.d();
                x[] xVarArr = jVar.e;
                androidx.media3.exoplayer.hls.playlist.n nVarB = (iD >= xVarArr.length || iD == -1) ? null : eVar.b(true, xVarArr[jVar.r.m()].c());
                if (nVarB == null) {
                    break;
                }
                h0 h0Var = nVarB.r;
                if (h0Var.isEmpty()) {
                    break;
                }
                long j2 = nVarB.h - eVar.P;
                long j3 = j - j2;
                int iD2 = j0.d(h0Var, Long.valueOf(j3), true);
                long j4 = ((androidx.media3.exoplayer.hls.playlist.k) h0Var.get(iD2)).B;
                return k1Var.a(j3, j4, (!nVarB.c || iD2 == h0Var.size() - 1) ? j4 : ((androidx.media3.exoplayer.hls.playlist.k) h0Var.get(iD2 + 1)).B) + j2;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) throws Throwable {
        r[] rVarArr = this.R;
        if (rVarArr.length > 0) {
            boolean zJ = rVarArr[0].J(j, false);
            int i = 1;
            while (true) {
                r[] rVarArr2 = this.R;
                if (i >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i].J(j, zJ);
                i++;
            }
            if (zJ) {
                ((SparseArray) this.H.y).clear();
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) throws Throwable {
        for (r rVar : this.R) {
            if (rVar.Z && !rVar.E()) {
                int length = rVar.S.length;
                for (int i = 0; i < length; i++) {
                    rVar.S[i].j(j, rVar.k0[i]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x02af  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:160:0x031e  */
    /* JADX WARN: Code duplicated, block: B:199:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) throws Throwable {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z;
        j jVar;
        int i;
        int i2;
        Object[] objArr2;
        int i3;
        int[] iArr2;
        r[] rVarArr;
        r rVar;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        int i4;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        ?? r30;
        int[] iArr3 = new int[qVarArr.length];
        int[] iArr4 = new int[qVarArr.length];
        int i7 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.G;
            if (i7 >= length) {
                break;
            }
            w0 w0Var = w0VarArr[i7];
            iArr3[i7] = w0Var == null ? -1 : ((Integer) identityHashMap.get(w0Var)).intValue();
            iArr4[i7] = -1;
            androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i7];
            if (qVar != null) {
                androidx.media3.common.w0 w0VarC = qVar.c();
                int i8 = 0;
                while (true) {
                    r[] rVarArr2 = this.Q;
                    if (i8 >= rVarArr2.length) {
                        break;
                    }
                    r rVar2 = rVarArr2[i8];
                    rVar2.b();
                    if (rVar2.f0.b(w0VarC) != -1) {
                        iArr4[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        int length3 = qVarArr.length;
        w0[] w0VarArr2 = new w0[length3];
        int length4 = qVarArr.length;
        androidx.media3.exoplayer.trackselection.q[] qVarArr2 = new androidx.media3.exoplayer.trackselection.q[length4];
        boolean z4 = false;
        r[] rVarArr3 = new r[this.Q.length];
        int i9 = length3;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        Object[] objArr6 = new w0[length2];
        Object[] objArr7 = w0VarArr2;
        while (i10 < this.Q.length) {
            int i12 = length2;
            ?? r7 = z4;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r7 >= qVarArr.length) {
                    break;
                }
                objArr7[r7] = iArr3[r7] == i10 ? w0VarArr[r7] : null;
                qVarArr2[r7] = iArr4[r7] == i10 ? qVarArr[r7] : null;
                objArr8 = objArr;
                r7++;
            }
            r rVar3 = this.Q[i10];
            androidx.media3.exoplayer.upstream.n nVar = rVar3.G;
            int i13 = i10;
            j jVar2 = rVar3.A;
            x[] xVarArr = jVar2.e;
            androidx.media3.exoplayer.hls.playlist.e eVar = jVar2.g;
            ArrayList arrayList = rVar3.K;
            rVar3.b();
            int i14 = rVar3.b0;
            Object[] objArr9 = objArr7;
            ?? r8 = z4;
            while (r8 < length4) {
                n nVar2 = (n) objArr9[r8];
                if (nVar2 == null || (qVarArr2[r8] != null && zArr[r8])) {
                    r30 = r8;
                } else {
                    r30 = r8;
                    rVar3.b0--;
                    if (nVar2.z != -1) {
                        r rVar4 = nVar2.y;
                        int i15 = nVar2.e;
                        rVar4.b();
                        rVar4.h0.getClass();
                        int i16 = rVar4.h0[i15];
                        if (i16 >= 0) {
                            com.google.android.material.motion.a.q(rVar4.k0[i16]);
                            rVar4.k0[i16] = z4;
                        }
                        nVar2.z = -1;
                    }
                    objArr9[r30 == true ? 1 : 0] = null;
                }
                qVarArr2 = qVarArr2;
                r8 = r30 + 1;
            }
            androidx.media3.exoplayer.trackselection.q[] qVarArr3 = qVarArr2;
            boolean z6 = true;
            if (z5) {
                iArr = iArr3;
                z = true;
            } else {
                if (rVar3.p0) {
                    if (i14 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z = true;
                } else {
                    iArr = iArr3;
                    if (j != rVar3.m0) {
                        z = true;
                    }
                }
                z = z4;
            }
            androidx.media3.exoplayer.trackselection.q qVar2 = jVar2.r;
            boolean z7 = z;
            androidx.media3.exoplayer.trackselection.q qVar3 = qVar2;
            ?? r9 = z4;
            while (r9 < length4) {
                ?? r31 = r9;
                androidx.media3.exoplayer.trackselection.q qVar4 = qVarArr3[r31 == true ? 1 : 0];
                if (qVar4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z8 = z7;
                    int iB = rVar3.f0.b(qVar4.c());
                    if (iB == rVar3.i0) {
                        Uri uriC = xVarArr[jVar2.r.m()].c();
                        androidx.media3.exoplayer.hls.playlist.d dVar = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uriC);
                        if (dVar != null) {
                            androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uriC, uriC);
                            cVar.getClass();
                            cVar.I = z4;
                        }
                        jVar2.r = qVar4;
                        qVar3 = qVar4;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        rVar3.b0++;
                        n nVar3 = new n(rVar3, iB);
                        objArr9[r31 == true ? 1 : 0] = nVar3;
                        zArr2[r31 == true ? 1 : 0] = z6;
                        if (rVar3.h0 != null) {
                            nVar3.c();
                            int i17 = rVar3.h0[iB];
                            if (z8 || i17 < 0) {
                                z7 = z8;
                            } else {
                                q qVar5 = rVar3.S[i17];
                                z7 = (qVar5.u() == 0 || qVar5.H(j, z6)) ? false : true;
                            }
                        } else {
                            z7 = z8;
                        }
                    } else {
                        z7 = z8;
                    }
                }
                length4 = i6;
                z4 = false;
                z6 = true;
                r9 = (r31 == true ? 1 : 0) + 1;
            }
            int i18 = length4;
            boolean z9 = z7;
            if (rVar3.b0 == 0) {
                Uri uriC2 = xVarArr[jVar2.r.m()].c();
                androidx.media3.exoplayer.hls.playlist.d dVar2 = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uriC2);
                if (dVar2 != null) {
                    androidx.media3.exoplayer.hls.playlist.c cVar2 = (androidx.media3.exoplayer.hls.playlist.c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar2.b, uriC2, uriC2);
                    cVar2.getClass();
                    cVar2.I = false;
                }
                jVar2.n = null;
                rVar3.d0 = null;
                rVar3.o0 = true;
                arrayList.clear();
                if (nVar.d()) {
                    if (rVar3.Z) {
                        for (q qVar6 : rVar3.S) {
                            qVar6.k();
                        }
                    }
                    nVar.a();
                } else {
                    rVar3.I();
                }
                jVar = jVar2;
                i4 = i9;
                i2 = i12;
                objArr3 = objArr;
                i3 = i13;
                z3 = z9;
                iArr2 = iArr4;
                rVarArr = rVarArr3;
                rVar = rVar3;
            } else {
                boolean z10 = true;
                if (arrayList.isEmpty() || Objects.equals(qVar3, qVar2)) {
                    jVar = jVar2;
                    i = i9;
                    i2 = i12;
                    objArr2 = objArr;
                    i3 = i13;
                    iArr2 = iArr4;
                    rVarArr = rVarArr3;
                    rVar = rVar3;
                } else {
                    if (rVar3.p0) {
                        jVar = jVar2;
                        i = i9;
                        i2 = i12;
                        objArr4 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        rVarArr = rVarArr3;
                        rVar = rVar3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        k kVarC = rVar3.C();
                        long j3 = j2;
                        androidx.media3.exoplayer.source.chunk.l[] lVarArrB = jVar2.b(kVarC, j);
                        jVar = jVar2;
                        List list = rVar3.L;
                        i = i9;
                        i2 = i12;
                        Object[] objArr10 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        rVarArr = rVarArr3;
                        rVar = rVar3;
                        androidx.media3.exoplayer.trackselection.q qVar7 = qVar3;
                        qVar7.l(j, j3, -9223372036854775807L, list, lVarArrB);
                        if (qVar7.m() != jVar.h.a(kVarC.A)) {
                            z10 = true;
                            objArr4 = objArr10;
                        } else {
                            z10 = true;
                            objArr2 = objArr10;
                        }
                    }
                    rVar.o0 = z10;
                    z2 = z10;
                    z3 = z2;
                    objArr3 = objArr4;
                    if (z3) {
                        rVar.J(j, z2);
                        i4 = i;
                        i5 = 0;
                        while (i5 < i4) {
                            if (objArr9[i5] != null) {
                                zArr2[i5] = z10;
                            }
                            i5++;
                            z10 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z5;
                z3 = z9;
                objArr3 = objArr2;
                if (z3) {
                    rVar.J(j, z2);
                    i4 = i;
                    i5 = 0;
                    while (i5 < i4) {
                        if (objArr9[i5] != null) {
                            zArr2[i5] = z10;
                        }
                        i5++;
                        z10 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList arrayList2 = rVar.P;
            arrayList2.clear();
            for (int i19 = 0; i19 < i4; i19++) {
                Object obj = objArr9[i19];
                if (obj != null) {
                    arrayList2.add((n) obj);
                }
            }
            rVar.p0 = true;
            int i20 = 0;
            boolean z11 = false;
            Object[] objArr11 = objArr3;
            while (i20 < qVarArr.length) {
                Object obj2 = objArr9[i20];
                int i21 = i3;
                if (iArr2[i20] == i21) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i20] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i21));
                    z11 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i20] == i21) {
                        com.google.android.material.motion.a.q(obj2 == null);
                    }
                }
                i20++;
                objArr11 = objArr5;
                i3 = i21;
            }
            Object[] objArr12 = objArr11;
            int i22 = i3;
            int i23 = i11;
            if (z11) {
                rVarArr[i23] = rVar;
                i11 = i23 + 1;
                if (i23 == 0) {
                    jVar.l = true;
                    if (z3) {
                        ((SparseArray) this.H.y).clear();
                        z5 = true;
                    } else {
                        r[] rVarArr4 = this.R;
                        if (rVarArr4.length == 0 || rVar != rVarArr4[0]) {
                            ((SparseArray) this.H.y).clear();
                            z5 = true;
                        }
                    }
                } else {
                    jVar.l = i22 < this.S;
                }
            }
            i10 = i22 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            rVarArr3 = rVarArr;
            objArr7 = objArr9;
            qVarArr2 = qVarArr3;
            length2 = i2;
            z4 = false;
            i9 = i4;
            objArr6 = objArr12;
            length4 = i18;
        }
        boolean z12 = z4;
        System.arraycopy(objArr6, z12 ? 1 : 0, w0VarArr, z12 ? 1 : 0, length2);
        r[] rVarArr5 = (r[]) j0.S(i11, rVarArr3);
        this.R = rVarArr5;
        a1 a1VarP = h0.p(rVarArr5);
        AbstractList abstractListW = com.google.common.collect.q.w(a1VarP, new androidx.media3.common.p(4));
        this.I.getClass();
        this.T = new androidx.media3.exoplayer.source.j(a1VarP, abstractListW);
        return j;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.T.n();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(androidx.media3.exoplayer.source.t tVar, long j) throws Throwable {
        String str;
        boolean z;
        Map map;
        h0 h0Var;
        d dVar;
        r[] rVarArr;
        HashSet hashSet;
        int i;
        ArrayList arrayList;
        HashSet hashSet2;
        ArrayList arrayList2;
        Map map2;
        ArrayList arrayList3;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.N = tVar;
        androidx.media3.exoplayer.hls.playlist.e eVar = this.y;
        eVar.getClass();
        eVar.B.add(this);
        androidx.media3.exoplayer.hls.playlist.q qVar = eVar.G;
        qVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        h0 h0VarC = eVar.c(0);
        h0VarC.getClass();
        h0 h0VarC2 = eVar.c(2);
        h0VarC2.getClass();
        h0 h0VarC3 = eVar.c(3);
        h0VarC3.getClass();
        boolean zIsEmpty = h0VarC.isEmpty();
        this.O = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        d dVar2 = this.e;
        boolean z4 = this.J;
        if (zIsEmpty) {
            str = "ID3";
            z = z4;
            map = map3;
            h0Var = h0VarC3;
            dVar = dVar2;
        } else {
            androidx.media3.common.r rVar = qVar.h;
            List list2 = qVar.i;
            int size = h0VarC.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < h0VarC.size(); i6++) {
                androidx.media3.common.r rVar2 = ((x) h0VarC.get(i6)).a.a;
                int i7 = rVar2.w;
                String str2 = rVar2.k;
                if (i7 > 0 || j0.w(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (j0.w(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            x[] xVarArr = new x[i3];
            androidx.media3.common.r[] rVarArr2 = new androidx.media3.common.r[i3];
            int[] iArr2 = new int[i3];
            int i11 = 0;
            boolean z5 = z2;
            int i12 = 0;
            while (i12 < h0VarC.size()) {
                if (z5) {
                    list = list2;
                    if (iArr[i12] == 2) {
                    }
                    i12++;
                    list2 = list;
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i12] != 1) {
                    x xVar = (x) h0VarC.get(i12);
                    xVarArr[i11] = xVar;
                    rVarArr2[i11] = xVar.a.a;
                    iArr2[i11] = i12;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = rVarArr2[0].k;
            int iV = j0.v(2, str3);
            int i13 = 1;
            int iV2 = j0.v(1, str3);
            boolean z6 = (iV2 == 1 || (iV2 == 0 && h0VarC2.isEmpty())) && iV <= 1 && iV2 + iV > 0;
            if (z5 || iV2 <= 0) {
                i13 = 0;
            }
            h0Var = h0VarC3;
            dVar = dVar2;
            z = z4;
            r rVarC = c("main", i13, xVarArr, rVarArr2, rVar, list3, map3, j);
            arrayList4.add(rVarC);
            arrayList5.add(iArr2);
            if (z && z6) {
                ArrayList arrayList6 = new ArrayList();
                if (iV > 0) {
                    androidx.media3.common.r[] rVarArr3 = new androidx.media3.common.r[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        androidx.media3.common.r rVar3 = rVarArr2[i14];
                        androidx.media3.common.r[] rVarArr4 = rVarArr2;
                        String strW = j0.w(2, rVar3.k);
                        String strE = i0.e(strW);
                        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                        qVar2.a = rVar3.a;
                        qVar2.b = rVar3.b;
                        qVar2.c = h0.o(rVar3.c);
                        qVar2.m = i0.p(rVar3.n);
                        qVar2.n = i0.p(strE);
                        qVar2.j = strW;
                        qVar2.k = rVar3.l;
                        qVar2.h = rVar3.h;
                        qVar2.i = rVar3.i;
                        qVar2.u = rVar3.v;
                        qVar2.v = rVar3.w;
                        qVar2.y = rVar3.z;
                        qVar2.e = rVar3.e;
                        qVar2.f = rVar3.f;
                        qVar2.D = rVar3.E;
                        rVarArr3[i14] = new androidx.media3.common.r(qVar2);
                        i14++;
                        rVarArr2 = rVarArr4;
                        map3 = map3;
                    }
                    androidx.media3.common.r[] rVarArr5 = rVarArr2;
                    map = map3;
                    arrayList6.add(new androidx.media3.common.w0("main", rVarArr3));
                    if (iV2 > 0 && (rVar != null || h0VarC2.isEmpty())) {
                        androidx.media3.common.q qVarA = e(rVarArr5[0], rVar, false).a();
                        qVarA.l = "main";
                        arrayList6.add(new androidx.media3.common.w0("main:audio", new androidx.media3.common.r(qVarA)));
                    }
                    if (list3 != null) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            String strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(i15, "main:cc:");
                            androidx.media3.common.q qVarA2 = dVar.b((androidx.media3.common.r) list3.get(i15)).a();
                            qVarA2.l = "main";
                            arrayList6.add(new androidx.media3.common.w0(strL, new androidx.media3.common.r(qVarA2)));
                        }
                    }
                } else {
                    map = map3;
                    androidx.media3.common.r[] rVarArr6 = new androidx.media3.common.r[i3];
                    for (int i16 = 0; i16 < i3; i16++) {
                        rVarArr6[i16] = e(rVarArr2[i16], rVar, true);
                    }
                    arrayList6.add(new androidx.media3.common.w0("main", rVarArr6));
                }
                androidx.media3.common.q qVar3 = new androidx.media3.common.q();
                str = "ID3";
                qVar3.a = str;
                qVar3.n = i0.p("application/id3");
                qVar3.l = "main";
                androidx.media3.common.w0 w0Var = new androidx.media3.common.w0("main:id3", new androidx.media3.common.r(qVar3));
                arrayList6.add(w0Var);
                rVarC.H((androidx.media3.common.w0[]) arrayList6.toArray(new androidx.media3.common.w0[0]), arrayList6.indexOf(w0Var));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList7 = new ArrayList(h0VarC2.size());
        ArrayList arrayList8 = new ArrayList(h0VarC2.size());
        ArrayList arrayList9 = new ArrayList(h0VarC2.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < h0VarC2.size()) {
            String str4 = ((x) h0VarC2.get(i17)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                boolean z7 = true;
                for (int i18 = 0; i18 < h0VarC2.size(); i18++) {
                    if (str4.equals(((x) h0VarC2.get(i18)).a.c)) {
                        x xVar2 = (x) h0VarC2.get(i18);
                        androidx.media3.common.r rVar4 = xVar2.a.a;
                        arrayList9.add(Integer.valueOf(i18));
                        arrayList7.add(xVar2);
                        arrayList8.add(rVar4);
                        z7 &= j0.v(1, rVar4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                String str5 = j0.a;
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
                r rVarC2 = c(strConcat, 1, (x[]) arrayList7.toArray(new x[0]), (androidx.media3.common.r[]) arrayList8.toArray(new androidx.media3.common.r[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList5.add(a0.F(arrayList));
                arrayList4.add(rVarC2);
                if (z && z7) {
                    String strConcat2 = strConcat.concat(":id3");
                    androidx.media3.common.q qVar4 = new androidx.media3.common.q();
                    qVar4.a = str;
                    qVar4.n = i0.p("application/id3");
                    qVar4.l = strConcat;
                    rVarC2.H(new androidx.media3.common.w0[]{new androidx.media3.common.w0(strConcat, (androidx.media3.common.r[]) arrayList3.toArray(new androidx.media3.common.r[0])), new androidx.media3.common.w0(strConcat2, new androidx.media3.common.r(qVar4))}, 1);
                }
            } else {
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
            }
            i17 = i2 + 1;
            map = map2;
            arrayList8 = arrayList3;
            arrayList7 = arrayList2;
            arrayList9 = arrayList;
            hashSet3 = hashSet2;
        }
        Map map4 = map;
        this.S = arrayList4.size();
        ArrayList arrayList10 = new ArrayList(h0Var.size());
        ArrayList arrayList11 = new ArrayList(h0Var.size());
        ArrayList arrayList12 = new ArrayList(h0Var.size());
        HashSet hashSet4 = new HashSet();
        int i19 = 0;
        while (i19 < h0Var.size()) {
            h0Var = h0Var;
            String str6 = ((x) h0Var.get(i19)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList10.clear();
                arrayList11.clear();
                arrayList12.clear();
                for (int i20 = 0; i20 < h0Var.size(); i20++) {
                    if (str6.equals(((x) h0Var.get(i20)).a.c)) {
                        x xVar3 = (x) h0Var.get(i20);
                        arrayList12.add(Integer.valueOf(i20));
                        arrayList10.add(xVar3);
                        arrayList11.add(xVar3.a.a);
                    }
                }
                String strConcat3 = "subtitle:".concat(str6);
                androidx.media3.common.r[] rVarArr7 = (androidx.media3.common.r[]) arrayList11.toArray(new androidx.media3.common.r[0]);
                String str7 = j0.a;
                x[] xVarArr2 = (x[]) arrayList10.toArray(new x[0]);
                e0 e0Var = h0.y;
                hashSet = hashSet4;
                i = i19;
                r rVarC3 = c(strConcat3, 3, xVarArr2, rVarArr7, null, a1.B, map4, j);
                arrayList5.add(a0.F(arrayList12));
                arrayList4.add(rVarC3);
                int length = rVarArr7.length;
                androidx.media3.common.r[] rVarArr8 = new androidx.media3.common.r[length];
                for (int i21 = 0; i21 < length; i21++) {
                    rVarArr8[i21] = dVar.b(rVarArr7[i21]);
                }
                rVarC3.H(new androidx.media3.common.w0[]{new androidx.media3.common.w0(strConcat3, rVarArr8)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i19;
            }
            i19 = i + 1;
            hashSet4 = hashSet;
        }
        this.Q = (r[]) arrayList4.toArray(new r[0]);
        this.O = this.Q.length;
        int i22 = 0;
        while (true) {
            int i23 = this.S;
            rVarArr = this.Q;
            if (i22 >= i23) {
                break;
            }
            rVarArr[i22].A.l = true;
            i22++;
        }
        for (r rVar5 : rVarArr) {
            if (!rVar5.a0) {
                m0 m0Var = new m0();
                m0Var.a = rVar5.m0;
                rVar5.d(new n0(m0Var));
            }
        }
        this.R = this.Q;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        i1 i1Var = this.P;
        i1Var.getClass();
        return i1Var;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        return this.T.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        this.T.v(j);
    }
}
