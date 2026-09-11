package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.appcompat.widget.c2;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements androidx.media3.exoplayer.upstream.k {
    public final o0 A;
    public final androidx.media3.common.util.h B;
    public volatile boolean D;
    public long F;
    public androidx.media3.datasource.l G;
    public androidx.media3.extractor.h0 H;
    public boolean I;
    public final /* synthetic */ o0 J;
    public final Uri e;
    public final androidx.media3.datasource.y y;
    public final c2 z;
    public final androidx.media3.extractor.r C = new androidx.media3.extractor.r();
    public boolean E = true;

    public l0(o0 o0Var, Uri uri, androidx.media3.datasource.h hVar, c2 c2Var, o0 o0Var2, androidx.media3.common.util.h hVar2) {
        this.J = o0Var;
        this.e = uri;
        this.y = new androidx.media3.datasource.y(hVar);
        this.z = c2Var;
        this.A = o0Var2;
        this.B = hVar2;
        n.b.getAndIncrement();
        this.G = a(null, 0L);
    }

    public final androidx.media3.datasource.l a(String str, long j) {
        Map mapE = o0.n0;
        if (str != null && !str.startsWith("W/")) {
            androidx.appcompat.widget.x xVarA = com.google.common.collect.f1.a();
            xVarA.r(mapE.entrySet());
            xVarA.q("If-Range", str);
            mapE = xVarA.e(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.e;
        com.google.android.material.motion.a.m(uri, "The uri must be set.");
        return new androidx.media3.datasource.l(uri, 0L, 1, null, mapE, j, -1L, null, 6);
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void c() {
        androidx.media3.datasource.h mVar;
        androidx.media3.extractor.n nVar;
        int i;
        int iC = 0;
        String str = null;
        while (iC == 0 && !this.D) {
            try {
                long j = this.C.a;
                androidx.media3.datasource.l lVarA = a(str, j);
                this.G = lVarA;
                long jT = this.y.t(lVarA);
                if (this.D) {
                    if (iC != 1 && this.z.B() != -1) {
                        this.C.a = this.z.B();
                    }
                    org.jsoup.helper.n.f(this.y);
                    return;
                }
                List list = (List) this.y.e.k().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jT != -1) {
                    jT += j;
                    o0 o0Var = this.J;
                    o0Var.M.post(new h0(o0Var, 0));
                }
                long j2 = jT;
                this.J.O = androidx.media3.extractor.metadata.icy.b.d(this.y.e.k());
                androidx.media3.datasource.y yVar = this.y;
                androidx.media3.extractor.metadata.icy.b bVar = this.J.O;
                if (bVar == null || (i = bVar.f) == -1) {
                    mVar = yVar;
                } else {
                    mVar = new m(yVar, i, this);
                    androidx.media3.extractor.h0 h0VarD = this.J.D(new n0(0, true));
                    this.H = h0VarD;
                    h0VarD.e(o0.o0);
                }
                this.z.N(mVar, this.e, this.y.e.k(), j, j2, this.A);
                if (this.J.O != null && (nVar = (androidx.media3.extractor.n) this.z.z) != null && (nVar instanceof androidx.media3.extractor.mp3.d)) {
                    ((androidx.media3.extractor.mp3.d) nVar).s = true;
                }
                if (this.E) {
                    c2 c2Var = this.z;
                    long j3 = this.F;
                    androidx.media3.extractor.n nVar2 = (androidx.media3.extractor.n) c2Var.z;
                    nVar2.getClass();
                    nVar2.b(j, j3);
                    this.E = false;
                }
                while (iC == 0 && !this.D) {
                    try {
                        androidx.media3.common.util.h hVar = this.B;
                        synchronized (hVar) {
                            while (!hVar.b) {
                                try {
                                    hVar.a.getClass();
                                    hVar.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        c2 c2Var2 = this.z;
                        androidx.media3.extractor.r rVar = this.C;
                        androidx.media3.extractor.n nVar3 = (androidx.media3.extractor.n) c2Var2.z;
                        nVar3.getClass();
                        androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) c2Var2.A;
                        kVar.getClass();
                        iC = nVar3.c(kVar, rVar);
                        long jB = this.z.B();
                        if (jB > this.J.F + j) {
                            androidx.media3.common.util.h hVar2 = this.B;
                            synchronized (hVar2) {
                                hVar2.b = false;
                            }
                            o0 o0Var2 = this.J;
                            o0Var2.M.post(o0Var2.L);
                            j = jB;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iC == 1) {
                    iC = 0;
                } else if (this.z.B() != -1) {
                    this.C.a = this.z.B();
                }
                org.jsoup.helper.n.f(this.y);
            } catch (Throwable th2) {
                if (iC != 1 && this.z.B() != -1) {
                    this.C.a = this.z.B();
                }
                org.jsoup.helper.n.f(this.y);
                throw th2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void e() {
        this.D = true;
    }
}
