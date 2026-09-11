package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import androidx.media3.exoplayer.k1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements u, androidx.media3.extractor.p, androidx.media3.exoplayer.upstream.i, androidx.media3.exoplayer.upstream.l, u0 {
    public static final Map n0;
    public static final androidx.media3.common.r o0;
    public final t2 A;
    public final androidx.media3.exoplayer.drm.d B;
    public final androidx.media3.exoplayer.drm.d C;
    public final q0 D;
    public final c2 E;
    public final long F;
    public final long G;
    public final androidx.media3.exoplayer.upstream.n H;
    public final c2 I;
    public final androidx.media3.common.util.h J;
    public final h0 K;
    public final h0 L;
    public final Handler M;
    public t N;
    public androidx.media3.extractor.metadata.icy.b O;
    public k0[] P;
    public v0[] Q;
    public n0[] R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public com.google.firebase.messaging.o W;
    public androidx.media3.extractor.a0 X;
    public long Y;
    public boolean Z;
    public int a0;
    public final long b0 = Long.MIN_VALUE;
    public boolean c0;
    public boolean d0;
    public final Uri e;
    public boolean e0;
    public int f0;
    public boolean g0;
    public long h0;
    public long i0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final androidx.media3.datasource.h y;
    public final androidx.media3.exoplayer.drm.f z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        n0 = Collections.unmodifiableMap(map);
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.a = "icy";
        qVar.n = androidx.media3.common.i0.p("application/x-icy");
        o0 = new androidx.media3.common.r(qVar);
    }

    public o0(Uri uri, androidx.media3.datasource.h hVar, c2 c2Var, androidx.media3.exoplayer.drm.f fVar, androidx.media3.exoplayer.drm.d dVar, t2 t2Var, androidx.media3.exoplayer.drm.d dVar2, q0 q0Var, c2 c2Var2, int i, long j, androidx.media3.exoplayer.util.a aVar) {
        this.e = uri;
        this.y = hVar;
        this.z = fVar;
        this.C = dVar;
        this.A = t2Var;
        this.B = dVar2;
        this.D = q0Var;
        this.E = c2Var2;
        this.F = i;
        this.H = aVar != null ? new androidx.media3.exoplayer.upstream.n(aVar) : new androidx.media3.exoplayer.upstream.n("ProgressiveMediaPeriod");
        this.I = c2Var;
        this.G = j;
        this.J = new androidx.media3.common.util.h();
        this.K = new h0(this, 1);
        this.L = new h0(this, 2);
        this.M = androidx.media3.common.util.j0.q(null);
        this.R = new n0[0];
        this.Q = new v0[0];
        this.P = new k0[0];
        this.i0 = -9223372036854775807L;
        this.a0 = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        androidx.media3.common.h0 h0VarA;
        char c;
        long j = this.G;
        if (this.m0 || this.T || !this.S || this.X == null) {
            return;
        }
        char c2 = 0;
        for (v0 v0Var : this.Q) {
            if (v0Var.x() == null) {
                return;
            }
        }
        androidx.media3.common.util.h hVar = this.J;
        synchronized (hVar) {
            hVar.b = false;
        }
        int length = this.Q.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c3 = 1;
            if (i2 >= length) {
                break;
            }
            androidx.media3.common.r rVarX = this.Q[i2].x();
            rVarX.getClass();
            int i4 = androidx.media3.common.i0.i(rVarX.o);
            if (i4 == 1) {
                c = 3;
            } else if (i4 == 2) {
                c = 4;
            } else if (i4 != 3) {
                c = i4 != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i == 1) {
                c3 = 3;
            } else if (i == 2) {
                c3 = 4;
            } else if (i != 3) {
                c3 = i != 4 ? (char) 0 : (char) 2;
            }
            if (c > c3) {
                i3 = i2;
                i = i4;
            }
            i2++;
        }
        androidx.media3.common.w0[] w0VarArr = new androidx.media3.common.w0[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (i5 < length) {
            androidx.media3.common.r rVarX2 = this.Q[i5].x();
            rVarX2.getClass();
            String str = rVarX2.o;
            boolean zK = androidx.media3.common.i0.k(str);
            boolean z = (zK || androidx.media3.common.i0.o(str)) ? true : c2;
            zArr[i5] = z;
            char c4 = c2;
            this.U = (this.U ? 1 : 0) | (z ? 1 : 0);
            this.V = (j != -9223372036854775807L && length == 1 && androidx.media3.common.i0.m(str)) ? 1 : c4;
            androidx.media3.extractor.metadata.icy.b bVar = this.O;
            if (bVar != null) {
                int i6 = bVar.a;
                if (zK || this.R[i5].b) {
                    androidx.media3.common.h0 h0Var = rVarX2.l;
                    if (h0Var == null) {
                        androidx.media3.common.g0[] g0VarArr = new androidx.media3.common.g0[1];
                        g0VarArr[c4] = bVar;
                        h0VarA = new androidx.media3.common.h0(g0VarArr);
                    } else {
                        androidx.media3.common.g0[] g0VarArr2 = new androidx.media3.common.g0[1];
                        g0VarArr2[c4] = bVar;
                        h0VarA = h0Var.a(g0VarArr2);
                    }
                    androidx.media3.common.q qVarA = rVarX2.a();
                    qVarA.k = h0VarA;
                    rVarX2 = new androidx.media3.common.r(qVarA);
                }
                if (zK && rVarX2.h == -1 && rVarX2.i == -1 && i6 != -1) {
                    androidx.media3.common.q qVarA2 = rVarX2.a();
                    qVarA2.h = i6;
                    rVarX2 = new androidx.media3.common.r(qVarA2);
                }
            }
            int iA = this.z.a(rVarX2);
            androidx.media3.common.q qVarA3 = rVarX2.a();
            qVarA3.O = iA;
            androidx.media3.common.r rVar = new androidx.media3.common.r(qVarA3);
            if (i5 != i3) {
                androidx.media3.common.q qVarA4 = rVar.a();
                qVarA4.l = Integer.toString(i3);
                rVar = new androidx.media3.common.r(qVarA4);
            }
            w0VarArr[i5] = new androidx.media3.common.w0(Integer.toString(i5), rVar);
            this.e0 = rVar.u | this.e0;
            this.Q[i5].I(this.b0);
            i5++;
            c2 = c4;
        }
        this.W = new com.google.firebase.messaging.o(new i1(w0VarArr), zArr);
        if (this.V && this.Y == -9223372036854775807L) {
            this.Y = j;
            this.X = new i0(this, this.X);
        }
        this.D.u(this.Y, this.X, this.Z);
        this.T = true;
        t tVar = this.N;
        tVar.getClass();
        tVar.m(this);
    }

    public final void B(int i) {
        b();
        com.google.firebase.messaging.o oVar = this.W;
        boolean[] zArr = (boolean[]) oVar.B;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.r rVar = ((i1) oVar.y).a(i).d[0];
        this.B.b(androidx.media3.common.i0.i(rVar.o), rVar, 0, null, this.h0);
        zArr[i] = true;
    }

    public final void C(int i) {
        b();
        if (this.j0) {
            if ((!this.U || ((boolean[]) this.W.z)[i]) && !this.Q[i].z(false)) {
                this.i0 = 0L;
                this.j0 = false;
                this.d0 = true;
                this.h0 = 0L;
                this.k0 = 0;
                for (v0 v0Var : this.Q) {
                    v0Var.F(false);
                }
                t tVar = this.N;
                tVar.getClass();
                tVar.o(this);
            }
        }
    }

    public final androidx.media3.extractor.h0 D(n0 n0Var) {
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            if (n0Var.equals(this.R[i])) {
                return this.Q[i];
            }
        }
        if (this.S) {
            androidx.media3.common.util.c.t("ProgressiveMediaPeriod", "Extractor added new track (id=" + n0Var.a + ") after finishing tracks.");
            return new androidx.media3.extractor.m();
        }
        androidx.media3.exoplayer.drm.f fVar = this.z;
        fVar.getClass();
        v0 v0Var = new v0(this.E, fVar, this.C);
        k0 k0Var = new k0(v0Var);
        v0Var.f = this;
        int i2 = length + 1;
        n0[] n0VarArr = (n0[]) Arrays.copyOf(this.R, i2);
        n0VarArr[length] = n0Var;
        this.R = n0VarArr;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.Q, i2);
        v0VarArr[length] = v0Var;
        this.Q = v0VarArr;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.P, i2);
        k0VarArr[length] = k0Var;
        this.P = k0VarArr;
        return k0Var;
    }

    public final void E() {
        l0 l0Var = new l0(this, this.e, this.y, this.I, this, this.J);
        if (this.T) {
            com.google.android.material.motion.a.q(z());
            long j = this.b0;
            if (j == Long.MIN_VALUE) {
                j = this.Y;
            }
            if (j != -9223372036854775807L && this.i0 > j) {
                this.l0 = true;
                this.i0 = -9223372036854775807L;
                return;
            }
            androidx.media3.extractor.a0 a0Var = this.X;
            a0Var.getClass();
            long j2 = a0Var.e(this.i0).a.b;
            long j3 = this.i0;
            l0Var.C.a = j2;
            l0Var.F = j3;
            l0Var.E = true;
            l0Var.I = false;
            for (v0 v0Var : this.Q) {
                v0Var.t = this.i0;
            }
            this.i0 = -9223372036854775807L;
        }
        this.k0 = x();
        this.H.f(l0Var, this, this.A.f(this.a0));
    }

    public final boolean F() {
        return this.d0 || z();
    }

    @Override // androidx.media3.exoplayer.source.u0
    public final void a() {
        this.M.post(this.K);
    }

    public final void b() {
        com.google.android.material.motion.a.q(this.T);
        this.W.getClass();
        this.X.getClass();
    }

    @Override // androidx.media3.exoplayer.upstream.l
    public final void c() {
        for (v0 v0Var : this.Q) {
            v0Var.F(true);
            androidx.media3.exoplayer.dash.manifest.t tVar = v0Var.h;
            if (tVar != null) {
                tVar.O(v0Var.e);
                v0Var.h = null;
                v0Var.g = null;
            }
        }
        c2 c2Var = this.I;
        androidx.media3.extractor.n nVar = (androidx.media3.extractor.n) c2Var.z;
        if (nVar != null) {
            nVar.release();
            c2Var.z = null;
        }
        c2Var.A = null;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        if (this.l0) {
            return false;
        }
        androidx.media3.exoplayer.upstream.n nVar = this.H;
        if (nVar.c() || this.j0) {
            return false;
        }
        if (this.T && this.f0 == 0) {
            return false;
        }
        boolean zC = this.J.c();
        if (nVar.d()) {
            return zC;
        }
        E();
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        androidx.media3.exoplayer.upstream.h hVar;
        androidx.media3.extractor.a0 a0Var;
        l0 l0Var = (l0) kVar;
        androidx.media3.datasource.y yVar = l0Var.y;
        n nVar = new n(l0Var.G, yVar.z, yVar.A, j, j2, yVar.y);
        String str = androidx.media3.common.util.j0.a;
        this.A.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof androidx.media3.common.j0) || (cause instanceof FileNotFoundException) || (cause instanceof androidx.media3.datasource.q) || (cause instanceof androidx.media3.exoplayer.upstream.m) || ((cause instanceof androidx.media3.datasource.i) && ((androidx.media3.datasource.i) cause).e == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            hVar = androidx.media3.exoplayer.upstream.n.f;
        } else {
            int iX = x();
            int i2 = iX > this.k0 ? 1 : 0;
            if (this.g0 || !((a0Var = this.X) == null || a0Var.g() == -9223372036854775807L)) {
                this.k0 = iX;
            } else if (!this.T || F()) {
                this.d0 = this.T;
                this.h0 = 0L;
                this.k0 = 0;
                for (v0 v0Var : this.Q) {
                    v0Var.F(false);
                }
                l0Var.C.a = 0L;
                l0Var.F = 0L;
                l0Var.E = true;
                l0Var.I = false;
            } else {
                this.j0 = true;
                hVar = androidx.media3.exoplayer.upstream.n.e;
            }
            hVar = new androidx.media3.exoplayer.upstream.h(jMin, i2, false);
        }
        this.B.e(nVar, 1, -1, null, 0, null, l0Var.F, this.Y, iOException, !hVar.a());
        return hVar;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        return t();
    }

    @Override // androidx.media3.extractor.p
    public final void g(androidx.media3.extractor.a0 a0Var) {
        this.M.post(new androidx.activity.c(24, this, a0Var));
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() throws IOException {
        int iF = this.A.f(this.a0);
        androidx.media3.exoplayer.upstream.n nVar = this.H;
        IOException iOException = nVar.c;
        if (iOException != null) {
            throw iOException;
        }
        androidx.media3.exoplayer.upstream.j jVar = nVar.b;
        if (jVar != null) {
            if (iF == Integer.MIN_VALUE) {
                iF = jVar.e;
            }
            IOException iOException2 = jVar.B;
            if (iOException2 != null && jVar.C > iF) {
                throw iOException2;
            }
        }
        if (this.l0 && !this.T) {
            throw androidx.media3.common.j0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        b();
        if (!this.X.c()) {
            return 0L;
        }
        androidx.media3.extractor.z zVarE = this.X.e(j);
        return k1Var.a(j, zVarE.a.a, zVarE.b.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[LOOP:1: B:44:0x0092->B:45:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[LOOP:2: B:49:0x00a7->B:50:0x00a9, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x008f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00a0, please report this as an issue */
    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) {
        int i;
        b();
        boolean[] zArr = (boolean[]) this.W.z;
        if (!this.X.c()) {
            j = 0;
        }
        this.d0 = false;
        boolean z = true;
        boolean z2 = this.h0 == j;
        this.h0 = j;
        if (z()) {
            this.i0 = j;
            return j;
        }
        int i2 = this.a0;
        androidx.media3.exoplayer.upstream.n nVar = this.H;
        if (i2 == 7 || !(this.l0 || nVar.d())) {
            this.j0 = false;
            this.i0 = j;
            this.l0 = false;
            this.e0 = false;
            if (nVar.d()) {
                for (v0 v0Var : this.Q) {
                    v0Var.k();
                }
                nVar.a();
                return j;
            }
            nVar.c = null;
            for (v0 v0Var2 : this.Q) {
                v0Var2.F(false);
            }
        } else {
            int length = this.Q.length;
            for (int i3 = 0; i3 < length; i3++) {
                v0 v0Var3 = this.Q[i3];
                if (this.P[i3].d.get() == j0.e && (v0Var3.u() != 0 || !z2)) {
                    if (!(this.V ? v0Var3.G(v0Var3.q) : v0Var3.H(j, this.l0)) && (zArr[i3] || !this.U)) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                this.j0 = false;
                this.i0 = j;
                this.l0 = false;
                this.e0 = false;
                if (nVar.d()) {
                    while (i < r2) {
                        v0Var.k();
                    }
                    nVar.a();
                    return j;
                }
                nVar.c = null;
                while (i < r2) {
                    v0Var2.F(false);
                }
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) throws Throwable {
        if (this.V) {
            return;
        }
        b();
        if (z()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.W.A;
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i].j(j, zArr[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.trackselection.q qVar;
        b();
        com.google.firebase.messaging.o oVar = this.W;
        i1 i1Var = (i1) oVar.y;
        boolean[] zArr3 = (boolean[]) oVar.A;
        int i = this.f0;
        int i2 = 0;
        for (int i3 = 0; i3 < qVarArr.length; i3++) {
            w0 w0Var = w0VarArr[i3];
            if (w0Var != null && (qVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((m0) w0Var).e;
                com.google.android.material.motion.a.q(zArr3[i4]);
                this.f0--;
                zArr3[i4] = false;
                w0VarArr[i3] = null;
            }
        }
        boolean z = !this.c0 ? j == 0 || this.V : i != 0;
        for (int i5 = 0; i5 < qVarArr.length; i5++) {
            if (w0VarArr[i5] == null && (qVar = qVarArr[i5]) != null) {
                com.google.android.material.motion.a.q(qVar.length() == 1);
                com.google.android.material.motion.a.q(qVar.i(0) == 0);
                int iB = i1Var.b(qVar.c());
                com.google.android.material.motion.a.q(!zArr3[iB]);
                this.f0++;
                zArr3[iB] = true;
                this.e0 = qVar.n().u | this.e0;
                w0VarArr[i5] = new m0(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    v0 v0Var = this.Q[iB];
                    z = (v0Var.u() == 0 || v0Var.H(j, true)) ? false : true;
                }
            }
        }
        if (this.f0 == 0) {
            this.j0 = false;
            this.d0 = false;
            this.e0 = false;
            androidx.media3.exoplayer.upstream.n nVar = this.H;
            if (nVar.d()) {
                v0[] v0VarArr = this.Q;
                int length = v0VarArr.length;
                while (i2 < length) {
                    v0VarArr[i2].k();
                    i2++;
                }
                nVar.a();
            } else {
                this.l0 = false;
                for (v0 v0Var2 : this.Q) {
                    v0Var2.F(false);
                }
            }
        } else if (z) {
            j = j(j);
            while (i2 < w0VarArr.length) {
                if (w0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.c0 = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void m(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        l0 l0Var = (l0) kVar;
        androidx.media3.datasource.y yVar = l0Var.y;
        this.B.g(i == 0 ? new n(l0Var.G, j) : new n(l0Var.G, yVar.z, yVar.A, j, j2, yVar.y), 1, -1, null, 0, null, l0Var.F, this.Y, i);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        boolean z;
        if (this.l0 || !this.H.d()) {
            return false;
        }
        androidx.media3.common.util.h hVar = this.J;
        synchronized (hVar) {
            z = hVar.b;
        }
        return z;
    }

    @Override // androidx.media3.extractor.p
    public final void o() {
        this.S = true;
        this.M.post(this.K);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        if (this.e0) {
            this.e0 = false;
            return this.h0;
        }
        if (!this.d0) {
            return -9223372036854775807L;
        }
        if (!this.l0 && x() <= this.k0) {
            return -9223372036854775807L;
        }
        this.d0 = false;
        return this.h0;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.N = tVar;
        this.J.c();
        E();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        b();
        return (i1) this.W.y;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        l0 l0Var = (l0) kVar;
        if (this.Y == -9223372036854775807L && this.X != null) {
            long jY = y(true);
            long j3 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.Y = j3;
            this.D.u(j3, this.X, this.Z);
        }
        androidx.media3.datasource.y yVar = l0Var.y;
        n nVar = new n(l0Var.G, yVar.z, yVar.A, j, j2, yVar.y);
        this.A.getClass();
        this.B.d(nVar, 1, -1, null, 0, null, l0Var.F, this.Y);
        this.l0 = true;
        t tVar = this.N;
        tVar.getClass();
        tVar.o(this);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        long jY;
        boolean z;
        b();
        if (this.l0 || this.f0 == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.i0;
        }
        if (this.U) {
            int length = this.Q.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                com.google.firebase.messaging.o oVar = this.W;
                if (((boolean[]) oVar.z)[i] && ((boolean[]) oVar.A)[i]) {
                    v0 v0Var = this.Q[i];
                    synchronized (v0Var) {
                        z = v0Var.y;
                    }
                    if (!z) {
                        jY = Math.min(jY, this.Q[i].r());
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.h0 : jY;
    }

    @Override // androidx.media3.extractor.p
    public final androidx.media3.extractor.h0 u(int i, int i2) {
        return D(new n0(i, false));
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        if (this.f0 <= 0 || z()) {
            return;
        }
        int i = 0;
        if (this.b0 != Long.MIN_VALUE) {
            b();
            int i2 = 1;
            while (true) {
                v0[] v0VarArr = this.Q;
                if (i >= v0VarArr.length) {
                    break;
                }
                com.google.firebase.messaging.o oVar = this.W;
                if (((boolean[]) oVar.A)[i] && (((boolean[]) oVar.z)[i] || !this.U)) {
                    i2 &= v0VarArr[i].y() ? 1 : 0;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            this.l0 = true;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        l0 l0Var = (l0) kVar;
        androidx.media3.datasource.y yVar = l0Var.y;
        n nVar = new n(l0Var.G, yVar.z, yVar.A, j, j2, yVar.y);
        this.A.getClass();
        this.B.c(nVar, 1, -1, null, 0, null, l0Var.F, this.Y);
        if (z) {
            return;
        }
        for (v0 v0Var : this.Q) {
            v0Var.F(false);
        }
        if (this.f0 > 0) {
            t tVar = this.N;
            tVar.getClass();
            tVar.o(this);
        }
    }

    public final int x() {
        int i = 0;
        for (v0 v0Var : this.Q) {
            i += v0Var.q + v0Var.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long y(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.Q.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.Q[i].r());
            } else {
                com.google.firebase.messaging.o oVar = this.W;
                oVar.getClass();
                if (((boolean[]) oVar.A)[i]) {
                    jMax = Math.max(jMax, this.Q[i].r());
                }
            }
        }
        return jMax;
    }

    public final boolean z() {
        return this.i0 != -9223372036854775807L;
    }
}
