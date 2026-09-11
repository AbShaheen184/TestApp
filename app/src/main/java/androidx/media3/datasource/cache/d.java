package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.util.j0;
import androidx.media3.datasource.v;
import androidx.media3.datasource.z;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.media3.datasource.h {
    public final androidx.media3.datasource.h A;
    public final boolean B = false;
    public final boolean C;
    public final boolean D;
    public Uri E;
    public androidx.media3.datasource.l F;
    public androidx.media3.datasource.l G;
    public androidx.media3.datasource.h H;
    public long I;
    public long J;
    public long K;
    public o L;
    public boolean M;
    public boolean N;
    public long O;
    public final n e;
    public final androidx.media3.datasource.h y;
    public final z z;

    public d(n nVar, androidx.media3.datasource.h hVar, androidx.media3.datasource.h hVar2, c cVar, int i) {
        this.e = nVar;
        this.y = hVar2;
        this.C = (i & 2) != 0;
        this.D = false;
        if (hVar != null) {
            this.A = hVar;
            this.z = cVar != null ? new z(hVar, cVar) : null;
        } else {
            this.A = v.e;
            this.z = null;
        }
    }

    public final void a() {
        n nVar = this.e;
        androidx.media3.datasource.h hVar = this.H;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
        } finally {
            this.G = null;
            this.H = null;
            o oVar = this.L;
            if (oVar != null) {
                nVar.i(oVar);
                this.L = null;
            }
        }
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        this.y.c(fVar);
        this.A.c(fVar);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        this.F = null;
        this.E = null;
        this.J = 0L;
        try {
            a();
        } catch (Throwable th) {
            if (this.H == this.y || (th instanceof a)) {
                this.M = true;
            }
            throw th;
        }
    }

    public final void g(androidx.media3.datasource.l lVar, boolean z) throws InterruptedIOException {
        o oVarL;
        androidx.media3.datasource.l lVarA;
        androidx.media3.datasource.h hVar;
        String str = lVar.h;
        String str2 = j0.a;
        if (this.N) {
            oVarL = null;
        } else {
            boolean z2 = this.B;
            n nVar = this.e;
            long j = this.J;
            if (z2) {
                try {
                    long j2 = this.K;
                    synchronized (nVar) {
                        nVar.d();
                        while (true) {
                            oVarL = nVar.l(j, j2, str);
                            if (oVarL != null) {
                                break;
                            } else {
                                nVar.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                oVarL = nVar.l(j, this.K, str);
            }
        }
        if (oVarL == null) {
            hVar = this.A;
            androidx.media3.datasource.k kVarA = lVar.a();
            kVarA.f = this.J;
            kVarA.g = this.K;
            lVarA = kVarA.a();
        } else if (oVarL.A) {
            Uri uriFromFile = Uri.fromFile(oVarL.B);
            long j3 = oVarL.y;
            long j4 = this.J - j3;
            long jMin = oVarL.z - j4;
            long j5 = this.K;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            androidx.media3.datasource.k kVarA2 = lVar.a();
            kVarA2.a = uriFromFile;
            kVarA2.b = j3;
            kVarA2.f = j4;
            kVarA2.g = jMin;
            lVarA = kVarA2.a();
            hVar = this.y;
        } else {
            long jMin2 = oVarL.z;
            long j6 = this.K;
            if (jMin2 == -1) {
                jMin2 = j6;
            } else if (j6 != -1) {
                jMin2 = Math.min(jMin2, j6);
            }
            androidx.media3.datasource.k kVarA3 = lVar.a();
            kVarA3.f = this.J;
            kVarA3.g = jMin2;
            lVarA = kVarA3.a();
            hVar = this.z;
            if (hVar == null) {
                hVar = this.A;
                this.e.i(oVarL);
                oVarL = null;
            }
        }
        this.O = (this.N || hVar != this.A) ? Long.MAX_VALUE : this.J + 102400;
        if (z) {
            com.google.android.material.motion.a.q(this.H == this.A);
            if (hVar == this.A) {
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                if (!oVarL.A) {
                    this.e.i(oVarL);
                }
                throw th;
            }
        }
        if (oVarL != null && !oVarL.A) {
            this.L = oVarL;
        }
        this.H = hVar;
        this.G = lVarA;
        this.I = 0L;
        long jT = hVar.t(lVarA);
        androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(4);
        if (lVarA.g == -1 && jT != -1) {
            this.K = jT;
            bVar.n(Long.valueOf(this.J + jT), "exo_len");
        }
        if (!(this.H == this.y)) {
            Uri uriV = hVar.v();
            this.E = uriV;
            Uri uri = lVar.a.equals(uriV) ? null : this.E;
            if (uri == null) {
                ((ArrayList) bVar.z).add("exo_redir");
                ((HashMap) bVar.y).remove("exo_redir");
            } else {
                bVar.n(uri.toString(), "exo_redir");
            }
        }
        if (this.H == this.z) {
            this.e.c(str, bVar);
        }
    }

    @Override // androidx.media3.datasource.h
    public final Map k() {
        return !(this.H == this.y) ? this.A.k() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        androidx.media3.datasource.h hVar = this.y;
        if (i2 == 0) {
            return 0;
        }
        if (this.K == 0) {
            return -1;
        }
        androidx.media3.datasource.l lVar = this.F;
        lVar.getClass();
        androidx.media3.datasource.l lVar2 = this.G;
        lVar2.getClass();
        try {
            if (this.J >= this.O) {
                g(lVar, true);
            }
            androidx.media3.datasource.h hVar2 = this.H;
            hVar2.getClass();
            int i4 = hVar2.read(bArr, i, i2);
            androidx.media3.datasource.h hVar3 = this.H;
            if (i4 != -1) {
                long j2 = i4;
                this.J += j2;
                this.I += j2;
                long j3 = this.K;
                if (j3 == -1) {
                    return i4;
                }
                this.K = j3 - j2;
                return i4;
            }
            if (!(hVar3 == hVar)) {
                j = -1;
                long j4 = lVar2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.I < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = lVar.h;
                String str2 = j0.a;
                this.K = 0L;
                if (!(hVar3 == this.z)) {
                    return i3;
                }
                androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(4);
                bVar.n(Long.valueOf(this.J), "exo_len");
                this.e.c(str, bVar);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.K;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            a();
            g(lVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.H == hVar || (th instanceof a)) {
                this.M = true;
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.h
    public final long t(androidx.media3.datasource.l lVar) {
        long j;
        n nVar = this.e;
        try {
            String string = lVar.h;
            long j2 = lVar.f;
            long j3 = lVar.g;
            if (string == null) {
                string = lVar.a.toString();
            }
            androidx.media3.datasource.k kVarA = lVar.a();
            kVarA.h = string;
            androidx.media3.datasource.l lVarA = kVarA.a();
            this.F = lVarA;
            Uri uri = lVarA.a;
            byte[] bArr = (byte[]) nVar.f(string).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.E = uri;
            this.J = j2;
            boolean z = (this.C && this.M) || (this.D && j3 == -1);
            this.N = z;
            if (z) {
                this.K = -1L;
                j = -1;
            } else {
                j = -1;
                long jA = h.a(nVar.f(string));
                this.K = jA;
                if (jA != -1) {
                    long j4 = jA - j2;
                    this.K = j4;
                    if (j4 < 0) {
                        throw new androidx.media3.datasource.i(2008);
                    }
                }
            }
            if (j3 != j) {
                long j5 = this.K;
                this.K = j5 == j ? j3 : Math.min(j5, j3);
            }
            long j6 = this.K;
            if (j6 > 0 || j6 == j) {
                g(lVarA, false);
            }
            return j3 != j ? j3 : this.K;
        } catch (Throwable th) {
            if (this.H == this.y || (th instanceof a)) {
                this.M = true;
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.E;
    }
}
