package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.appcompat.widget.c2;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class v0 implements androidx.media3.extractor.h0 {
    public boolean B;
    public androidx.media3.common.r C;
    public androidx.media3.common.r D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final s0 a;
    public final androidx.media3.exoplayer.drm.f d;
    public final androidx.media3.exoplayer.drm.d e;
    public Object f;
    public androidx.media3.common.r g;
    public androidx.media3.exoplayer.dash.manifest.t h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean y;
    public final androidx.media3.exoplayer.image.f b = new androidx.media3.exoplayer.image.f(1);
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public androidx.media3.extractor.g0[] o = new androidx.media3.extractor.g0[1000];
    public final androidx.appcompat.widget.x c = new androidx.appcompat.widget.x(new androidx.media3.exoplayer.hls.playlist.a(1));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    public v0(c2 c2Var, androidx.media3.exoplayer.drm.f fVar, androidx.media3.exoplayer.drm.d dVar) {
        this.d = fVar;
        this.e = dVar;
        this.a = new s0(c2Var);
    }

    public final boolean A(int i) {
        androidx.media3.exoplayer.dash.manifest.t tVar = this.h;
        if (tVar == null || tVar.M() == 4) {
            return true;
        }
        if ((this.m[i] & 1073741824) != 0) {
            return false;
        }
        this.h.getClass();
        return false;
    }

    public final void B() {
        androidx.media3.exoplayer.dash.manifest.t tVar = this.h;
        if (tVar == null || tVar.M() != 1) {
            return;
        }
        androidx.media3.exoplayer.drm.b bVarK = this.h.K();
        bVarK.getClass();
        throw bVarK;
    }

    public final void C(androidx.media3.common.r rVar, androidx.media3.common.util.b bVar) {
        androidx.media3.common.r rVar2;
        androidx.media3.common.r rVar3 = this.g;
        boolean z = rVar3 == null;
        androidx.media3.common.m mVar = rVar3 == null ? null : rVar3.s;
        this.g = rVar;
        androidx.media3.common.m mVar2 = rVar.s;
        androidx.media3.exoplayer.drm.f fVar = this.d;
        if (fVar != null) {
            int iA = fVar.a(rVar);
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.O = iA;
            rVar2 = new androidx.media3.common.r(qVarA);
        } else {
            rVar2 = rVar;
        }
        bVar.z = rVar2;
        bVar.y = this.h;
        if (fVar == null) {
            return;
        }
        if (z || !Objects.equals(mVar, mVar2)) {
            androidx.media3.exoplayer.dash.manifest.t tVar = this.h;
            fVar.getClass();
            androidx.media3.exoplayer.dash.manifest.t tVar2 = rVar.s == null ? null : new androidx.media3.exoplayer.dash.manifest.t(new androidx.media3.exoplayer.drm.b(new androidx.media3.exoplayer.drm.i(), 6001), 1);
            this.h = tVar2;
            bVar.y = tVar2;
            if (tVar != null) {
                tVar.getClass();
            }
        }
    }

    public final synchronized long D() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[v(this.s)] : this.E;
    }

    public final int E(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        androidx.media3.exoplayer.image.f fVar = this.b;
        synchronized (this) {
            eVar.C = false;
            int iU = u();
            int i3 = this.x;
            boolean z3 = i3 != -1 && iU >= i3;
            i2 = -5;
            if ((this.s != this.p) && !z3) {
                androidx.media3.common.r rVar = ((t0) this.c.j(iU)).a;
                if (z2 || rVar != this.g) {
                    C(rVar, bVar);
                } else {
                    int iV = v(this.s);
                    if (A(iV)) {
                        eVar.y = this.m[iV];
                        if (this.s == this.p - 1 && (z || this.y)) {
                            eVar.a(536870912);
                        }
                        eVar.D = this.n[iV];
                        fVar.b = this.l[iV];
                        fVar.c = this.k[iV];
                        fVar.d = this.o[iV];
                        i2 = -4;
                    } else {
                        eVar.C = true;
                        i2 = -3;
                    }
                }
            } else if (z || this.y || z3) {
                eVar.y = 4;
                eVar.D = Long.MIN_VALUE;
                i2 = -4;
            } else {
                androidx.media3.common.r rVar2 = this.D;
                if (rVar2 == null || (!z2 && rVar2 == this.g)) {
                    i2 = -3;
                } else {
                    C(rVar2, bVar);
                }
            }
        }
        if (i2 == -4 && !eVar.g(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                s0 s0Var = this.a;
                androidx.media3.exoplayer.image.f fVar2 = this.b;
                if (z4) {
                    s0.e(s0Var.e, eVar, fVar2, s0Var.c);
                } else {
                    s0Var.e = s0.e(s0Var.e, eVar, fVar2, s0Var.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void F(boolean z) {
        s0 s0Var = this.a;
        r0 r0Var = s0Var.d;
        if (((androidx.media3.exoplayer.upstream.a) r0Var.z) != null) {
            c2 c2Var = s0Var.a;
            synchronized (c2Var) {
                ((androidx.media3.exoplayer.g) c2Var.A).c.b(r0Var);
                r0 r0Var2 = r0Var;
                while (r0Var2 != null) {
                    androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var2.z;
                    aVar.getClass();
                    c2Var.V(aVar);
                    r0Var2 = (r0) r0Var2.A;
                    if (r0Var2 == null || ((androidx.media3.exoplayer.upstream.a) r0Var2.z) == null) {
                        r0Var2 = null;
                    }
                }
            }
            r0Var.z = null;
            r0Var.A = null;
        }
        r0 r0Var3 = s0Var.d;
        int i = s0Var.b;
        com.google.android.material.motion.a.q(((androidx.media3.exoplayer.upstream.a) r0Var3.z) == null);
        r0Var3.e = 0L;
        r0Var3.y = i;
        r0 r0Var4 = s0Var.d;
        s0Var.e = r0Var4;
        s0Var.f = r0Var4;
        s0Var.g = 0L;
        c2 c2Var2 = s0Var.a;
        synchronized (c2Var2) {
            ((androidx.media3.exoplayer.g) c2Var2.A).c.d();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.z = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.y = false;
        androidx.appcompat.widget.x xVar = this.c;
        SparseArray sparseArray = (SparseArray) xVar.z;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((androidx.media3.exoplayer.hls.playlist.a) xVar.A).accept(sparseArray.valueAt(i2));
        }
        xVar.y = -1;
        sparseArray.clear();
        if (z) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized boolean G(int i) {
        synchronized (this) {
            this.s = 0;
            s0 s0Var = this.a;
            s0Var.e = s0Var.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean H(long j, boolean z) throws Throwable {
        Throwable th;
        long j2;
        v0 v0Var;
        int iP;
        try {
            try {
                synchronized (this) {
                    try {
                        this.s = 0;
                        s0 s0Var = this.a;
                        s0Var.e = s0Var.d;
                        int iV = v(0);
                        long j3 = this.u;
                        long jMin = this.w;
                        if (j3 != Long.MIN_VALUE) {
                            try {
                                jMin = Math.min(jMin, j3);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        int i = this.s;
                        int i2 = this.p;
                        if (!(i != i2) || j < this.n[iV] || (j > jMin && !z)) {
                            return false;
                        }
                        if (this.F) {
                            j2 = j;
                            iP = o(iV, j2, i2 - i, z);
                            v0Var = this;
                        } else {
                            j2 = j;
                            v0Var = this;
                            iP = v0Var.p(iV, j2, i2 - i, true);
                        }
                        if (iP == -1) {
                            return false;
                        }
                        v0Var.t = j2;
                        v0Var.s += iP;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                th = th;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
        }
    }

    public final synchronized void I(long j) throws Throwable {
        Throwable th;
        v0 v0Var;
        long j2;
        int iO;
        try {
            try {
                if (j == this.u) {
                    return;
                }
                int i = -1;
                if (j != Long.MIN_VALUE) {
                    if (j <= this.w) {
                        v0Var = this;
                        j2 = j;
                        iO = v0Var.o(this.r, j2, this.p, false);
                    } else {
                        v0Var = this;
                        j2 = j;
                        iO = -1;
                    }
                    if (iO != -1) {
                        i = v0Var.q + iO;
                    }
                    v0Var.x = i;
                    v0Var.u = j2;
                    return;
                }
                try {
                    this.x = -1;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void J(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        com.google.android.material.motion.a.f(z);
        this.s += i;
    }

    @Override // androidx.media3.extractor.h0
    public final void b(androidx.media3.common.util.w wVar, int i, int i2) {
        while (true) {
            s0 s0Var = this.a;
            if (i <= 0) {
                s0Var.getClass();
                return;
            }
            int iB = s0Var.b(i);
            r0 r0Var = s0Var.f;
            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
            wVar.k(aVar.a, ((int) (s0Var.g - r0Var.e)) + aVar.b, iB);
            i -= iB;
            long j = s0Var.g + ((long) iB);
            s0Var.g = j;
            r0 r0Var2 = s0Var.f;
            if (j == r0Var2.y) {
                s0Var.f = (r0) r0Var2.A;
            }
        }
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) throws EOFException {
        s0 s0Var = this.a;
        int iB = s0Var.b(i);
        r0 r0Var = s0Var.f;
        androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var.z;
        int i2 = iVar.read(aVar.a, ((int) (s0Var.g - r0Var.e)) + aVar.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = s0Var.g + ((long) i2);
        s0Var.g = j;
        r0 r0Var2 = s0Var.f;
        if (j == r0Var2.y) {
            s0Var.f = (r0) r0Var2.A;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:21:0x0069, B:25:0x0072, B:18:0x0059), top: B:35:0x000a }] */
    /* JADX WARN: Type inference failed for: r6v26, types: [androidx.media3.exoplayer.source.u0, java.lang.Object] */
    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
        androidx.media3.common.r rVarQ = q(rVar);
        boolean z = false;
        this.B = false;
        this.C = rVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(rVarQ, this.D)) {
                    if (((SparseArray) this.c.z).size() == 0) {
                        this.D = rVarQ;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.c.z;
                        if (((t0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(rVarQ)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.z;
                            this.D = ((t0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        } else {
                            this.D = rVarQ;
                        }
                    }
                    boolean z2 = this.F;
                    androidx.media3.common.r rVar2 = this.D;
                    String str = rVar2.o;
                    this.F = z2 & (androidx.media3.common.i0.i(str) == 1 && androidx.media3.common.i0.a(str, rVar2.k));
                    this.G = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r6 = this.f;
        if (r6 == 0 || !z) {
            return;
        }
        r6.a();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0170 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:70:0x00c9, B:74:0x00d1, B:75:0x00d8, B:80:0x0109, B:103:0x0183, B:105:0x018c, B:82:0x0124, B:84:0x012d, B:86:0x0135, B:88:0x0149, B:92:0x0152, B:93:0x0157, B:95:0x015d, B:99:0x016b, B:101:0x0170, B:102:0x0180, B:85:0x0133), top: B:111:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0124 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:70:0x00c9, B:74:0x00d1, B:75:0x00d8, B:80:0x0109, B:103:0x0183, B:105:0x018c, B:82:0x0124, B:84:0x012d, B:86:0x0135, B:88:0x0149, B:92:0x0152, B:93:0x0157, B:95:0x015d, B:99:0x016b, B:101:0x0170, B:102:0x0180, B:85:0x0133), top: B:111:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:84:0x012d A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:70:0x00c9, B:74:0x00d1, B:75:0x00d8, B:80:0x0109, B:103:0x0183, B:105:0x018c, B:82:0x0124, B:84:0x012d, B:86:0x0135, B:88:0x0149, B:92:0x0152, B:93:0x0157, B:95:0x015d, B:99:0x016b, B:101:0x0170, B:102:0x0180, B:85:0x0133), top: B:111:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0133 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:70:0x00c9, B:74:0x00d1, B:75:0x00d8, B:80:0x0109, B:103:0x0183, B:105:0x018c, B:82:0x0124, B:84:0x012d, B:86:0x0135, B:88:0x0149, B:92:0x0152, B:93:0x0157, B:95:0x015d, B:99:0x016b, B:101:0x0170, B:102:0x0180, B:85:0x0133), top: B:111:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0149 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:70:0x00c9, B:74:0x00d1, B:75:0x00d8, B:80:0x0109, B:103:0x0183, B:105:0x018c, B:82:0x0124, B:84:0x012d, B:86:0x0135, B:88:0x0149, B:92:0x0152, B:93:0x0157, B:95:0x015d, B:99:0x016b, B:101:0x0170, B:102:0x0180, B:85:0x0133), top: B:111:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX WARN: Code duplicated, block: B:95:0x015d A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:70:0x00c9, B:74:0x00d1, B:75:0x00d8, B:80:0x0109, B:103:0x0183, B:105:0x018c, B:82:0x0124, B:84:0x012d, B:86:0x0135, B:88:0x0149, B:92:0x0152, B:93:0x0157, B:95:0x015d, B:99:0x016b, B:101:0x0170, B:102:0x0180, B:85:0x0133), top: B:111:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0168  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    @Override // androidx.media3.extractor.h0
    public void g(long j, int i, int i2, int i3, androidx.media3.extractor.g0 g0Var) {
        androidx.media3.exoplayer.drm.f fVar;
        androidx.media3.exoplayer.drm.g gVar;
        androidx.appcompat.widget.x xVar;
        int i4;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.B) {
            androidx.media3.common.r rVar = this.C;
            rVar.getClass();
            e(rVar);
        }
        int i5 = i & 1;
        boolean z4 = i5 != 0;
        if (this.z) {
            if (!z4) {
                return;
            } else {
                this.z = false;
            }
        }
        long j2 = j + this.H;
        if (this.F) {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.G) {
                    androidx.media3.common.util.c.t("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i |= 1;
            }
        }
        if (this.I) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z3 = j2 > this.v;
                } else if (s() >= j2) {
                    z3 = false;
                } else {
                    m(this.q + h(j2));
                    z3 = true;
                }
            }
            if (!z3) {
                return;
            } else {
                this.I = false;
            }
        }
        long j3 = (this.a.g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i6 = this.p;
                if (i6 > 0) {
                    int iV = v(i6 - 1);
                    com.google.android.material.motion.a.f(this.k[iV] + ((long) this.l[iV]) <= j3);
                }
                this.y = (536870912 & i) != 0;
                this.w = Math.max(this.w, j2);
                long j4 = this.u;
                if (j4 != Long.MIN_VALUE && this.x == -1 && j2 >= j4) {
                    this.x = this.q + this.p;
                }
                int iV2 = v(this.p);
                this.n[iV2] = j2;
                this.k[iV2] = j3;
                this.l[iV2] = i2;
                this.m[iV2] = i;
                this.o[iV2] = g0Var;
                this.j[iV2] = this.E;
                if (((SparseArray) this.c.z).size() == 0) {
                    androidx.media3.common.r rVar2 = this.D;
                    rVar2.getClass();
                    fVar = this.d;
                    if (fVar != null) {
                        fVar.getClass();
                        gVar = androidx.media3.exoplayer.drm.g.a;
                    } else {
                        gVar = androidx.media3.exoplayer.drm.g.a;
                    }
                    xVar = this.c;
                    i4 = this.q + this.p;
                    t0 t0Var = new t0(rVar2, gVar);
                    sparseArray = (SparseArray) xVar.z;
                    if (xVar.y == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.google.android.material.motion.a.q(z2);
                        xVar.y = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        com.google.android.material.motion.a.f(z);
                        if (iKeyAt == i4) {
                            ((androidx.media3.exoplayer.hls.playlist.a) xVar.A).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, t0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.c.z;
                    if (!((t0) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.D)) {
                        androidx.media3.common.r rVar3 = this.D;
                        rVar3.getClass();
                        fVar = this.d;
                        if (fVar != null) {
                            fVar.getClass();
                            gVar = androidx.media3.exoplayer.drm.g.a;
                        } else {
                            gVar = androidx.media3.exoplayer.drm.g.a;
                        }
                        xVar = this.c;
                        i4 = this.q + this.p;
                        t0 t0Var2 = new t0(rVar3, gVar);
                        sparseArray = (SparseArray) xVar.z;
                        if (xVar.y == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.google.android.material.motion.a.q(z2);
                            xVar.y = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i4 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            com.google.android.material.motion.a.f(z);
                            if (iKeyAt == i4) {
                                ((androidx.media3.exoplayer.hls.playlist.a) xVar.A).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i4, t0Var2);
                    }
                }
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    androidx.media3.extractor.g0[] g0VarArr = new androidx.media3.extractor.g0[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, g0VarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, g0VarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = g0VarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int h(long j) {
        int i = this.p;
        int iV = v(i - 1);
        while (i > this.s && this.n[iV] >= j) {
            i--;
            iV--;
            if (iV == -1) {
                iV = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.v = Math.max(this.v, t(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        androidx.appcompat.widget.x xVar = this.c;
        SparseArray sparseArray = (SparseArray) xVar.z;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((androidx.media3.exoplayer.hls.playlist.a) xVar.A).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = xVar.y;
            if (i8 > 0) {
                xVar.y = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void j(long j, boolean z) throws Throwable {
        Throwable th;
        s0 s0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long jI = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iP = p(i2, j, i, false);
                            if (iP != -1) {
                                jI = i(iP);
                            }
                        }
                    }
                    s0Var.a(jI);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void k() {
        long jI;
        s0 s0Var = this.a;
        synchronized (this) {
            int i = this.p;
            jI = i == 0 ? -1L : i(i);
        }
        s0Var.a(jI);
    }

    public final void l(long j) {
        if (this.p == 0) {
            return;
        }
        com.google.android.material.motion.a.f(j > s());
        n(this.q + h(j));
    }

    public final long m(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        com.google.android.material.motion.a.f(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.w = Math.max(this.v, t(i5));
        if (i4 == 0 && this.y) {
            z = true;
        }
        this.y = z;
        int i6 = this.x;
        if (i6 != -1 && i < i6) {
            this.x = -1;
        }
        androidx.appcompat.widget.x xVar = this.c;
        SparseArray sparseArray = (SparseArray) xVar.z;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((androidx.media3.exoplayer.hls.playlist.a) xVar.A).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        xVar.y = sparseArray.size() > 0 ? Math.min(xVar.y, sparseArray.size() - 1) : -1;
        int i7 = this.p;
        if (i7 == 0) {
            return 0L;
        }
        int iV = v(i7 - 1);
        return this.k[iV] + ((long) this.l[iV]);
    }

    public final void n(int i) {
        r0 r0Var;
        s0 s0Var = this.a;
        long jM = m(i);
        int i2 = s0Var.b;
        com.google.android.material.motion.a.f(jM <= s0Var.g);
        s0Var.g = jM;
        if (jM != 0) {
            r0 r0Var2 = s0Var.d;
            if (jM != r0Var2.e) {
                while (true) {
                    long j = s0Var.g;
                    long j2 = r0Var2.y;
                    r0Var = (r0) r0Var2.A;
                    if (j <= j2) {
                        break;
                    } else {
                        r0Var2 = r0Var;
                    }
                }
                r0Var.getClass();
                if (((androidx.media3.exoplayer.upstream.a) r0Var.z) != null) {
                    c2 c2Var = s0Var.a;
                    synchronized (c2Var) {
                        ((androidx.media3.exoplayer.g) c2Var.A).c.b(r0Var);
                        r0 r0Var3 = r0Var;
                        while (r0Var3 != null) {
                            androidx.media3.exoplayer.upstream.a aVar = (androidx.media3.exoplayer.upstream.a) r0Var3.z;
                            aVar.getClass();
                            c2Var.V(aVar);
                            r0Var3 = (r0) r0Var3.A;
                            if (r0Var3 == null || ((androidx.media3.exoplayer.upstream.a) r0Var3.z) == null) {
                                r0Var3 = null;
                            }
                        }
                    }
                    r0Var.z = null;
                    r0Var.A = null;
                }
                r0 r0Var4 = new r0(r0Var2.y, i2);
                r0Var2.A = r0Var4;
                if (s0Var.g == r0Var2.y) {
                    r0Var2 = r0Var4;
                }
                s0Var.f = r0Var2;
                if (s0Var.e == r0Var) {
                    s0Var.e = r0Var4;
                    return;
                }
                return;
            }
        }
        r0 r0Var5 = s0Var.d;
        if (((androidx.media3.exoplayer.upstream.a) r0Var5.z) != null) {
            c2 c2Var2 = s0Var.a;
            synchronized (c2Var2) {
                ((androidx.media3.exoplayer.g) c2Var2.A).c.b(r0Var5);
                r0 r0Var6 = r0Var5;
                while (r0Var6 != null) {
                    androidx.media3.exoplayer.upstream.a aVar2 = (androidx.media3.exoplayer.upstream.a) r0Var6.z;
                    aVar2.getClass();
                    c2Var2.V(aVar2);
                    r0Var6 = (r0) r0Var6.A;
                    if (r0Var6 == null || ((androidx.media3.exoplayer.upstream.a) r0Var6.z) == null) {
                        r0Var6 = null;
                    }
                }
            }
            r0Var5.z = null;
            r0Var5.A = null;
        }
        r0 r0Var7 = new r0(s0Var.g, i2);
        s0Var.d = r0Var7;
        s0Var.e = r0Var7;
        s0Var.f = r0Var7;
    }

    public final int o(int i, long j, int i2, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int p(int i, long j, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public androidx.media3.common.r q(androidx.media3.common.r rVar) {
        if (this.H == 0 || rVar.t == Long.MAX_VALUE) {
            return rVar;
        }
        androidx.media3.common.q qVarA = rVar.a();
        qVarA.s = rVar.t + this.H;
        return new androidx.media3.common.r(qVarA);
    }

    public final synchronized long r() {
        return this.w;
    }

    public final synchronized long s() {
        return Math.max(this.v, t(this.s));
    }

    public final long t(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iV = v(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iV]);
            if ((this.m[iV] & 1) != 0) {
                return jMax;
            }
            iV--;
            if (iV == -1) {
                iV = this.i - 1;
            }
        }
        return jMax;
    }

    public final int u() {
        return this.q + this.s;
    }

    public final int v(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int w(long j, boolean z) {
        try {
            try {
                int iV = v(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iV]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int iP = p(iV, j, i2 - i, true);
                if (iP == -1) {
                    return 0;
                }
                return iP;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized androidx.media3.common.r x() {
        return this.A ? null : this.D;
    }

    public final synchronized boolean y() {
        return this.x != -1;
    }

    public final synchronized boolean z(boolean z) {
        androidx.media3.common.r rVar;
        int iU = u();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && iU >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (((t0) this.c.j(iU)).a != this.g) {
                return true;
            }
            return A(v(this.s));
        }
        if (!z && !this.y && ((rVar = this.D) == null || rVar == this.g)) {
            z2 = false;
        }
        return z2;
    }
}
