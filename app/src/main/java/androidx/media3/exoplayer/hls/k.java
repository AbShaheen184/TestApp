package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.util.h0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.ts.c0;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.media3.exoplayer.source.chunk.k {
    public static final AtomicInteger j0 = new AtomicInteger();
    public final int H;
    public final int I;
    public final Uri J;
    public final boolean K;
    public final int L;
    public final androidx.media3.datasource.h M;
    public final androidx.media3.datasource.l N;
    public final b O;
    public final boolean P;
    public final boolean Q;
    public final h0 R;
    public final d S;
    public final List T;
    public final androidx.media3.common.m U;
    public final androidx.media3.extractor.metadata.id3.h V;
    public final w W;
    public final boolean X;
    public final boolean Y;
    public b Z;
    public r a0;
    public int b0;
    public boolean c0;
    public volatile boolean d0;
    public boolean e0;
    public com.google.common.collect.h0 f0;
    public boolean g0;
    public long h0;
    public boolean i0;

    public k(d dVar, androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, androidx.media3.common.r rVar, boolean z, androidx.media3.datasource.h hVar2, androidx.media3.datasource.l lVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, h0 h0Var, androidx.media3.common.m mVar, b bVar, androidx.media3.extractor.metadata.id3.h hVar3, w wVar, boolean z6, boolean z7, androidx.media3.exoplayer.analytics.k kVar) {
        super(hVar, lVar, rVar, i, obj, j, j2, j3);
        this.X = z;
        this.L = i2;
        this.h0 = z3 ? j2 - j : -9223372036854775807L;
        this.I = i3;
        this.N = lVar2;
        this.M = hVar2;
        this.c0 = lVar2 != null;
        this.Y = z2;
        this.J = uri;
        this.P = z5;
        this.R = h0Var;
        this.Q = z4;
        this.S = dVar;
        this.T = list;
        this.U = mVar;
        this.O = bVar;
        this.V = hVar3;
        this.W = wVar;
        this.i0 = z6;
        this.K = z7;
        e0 e0Var = com.google.common.collect.h0.y;
        this.f0 = a1.B;
        this.H = j0.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (com.google.common.base.b.w(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.k
    public final boolean b() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void c() {
        b bVar;
        this.a0.getClass();
        if (this.Z == null && (bVar = this.O) != null) {
            androidx.media3.extractor.n nVar = bVar.a;
            if ((nVar instanceof c0) || (nVar instanceof androidx.media3.extractor.mp4.i)) {
                this.Z = bVar;
                this.c0 = false;
            }
        }
        androidx.media3.datasource.l lVar = this.N;
        androidx.media3.datasource.h hVar = this.M;
        if (this.c0) {
            hVar.getClass();
            lVar.getClass();
            d(hVar, lVar, this.Y, false);
            this.b0 = 0;
            this.c0 = false;
        }
        if (this.d0) {
            return;
        }
        if (!this.Q) {
            d(this.F, this.y, this.X, true);
        }
        this.e0 = !this.d0;
    }

    public final void d(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, boolean z, boolean z2) {
        androidx.media3.datasource.l lVarC;
        boolean z3;
        long j;
        int i = this.b0;
        if (z) {
            z3 = i != 0;
            lVarC = lVar;
        } else {
            lVarC = lVar.c(i);
            z3 = false;
        }
        try {
            androidx.media3.extractor.k kVarI = i(hVar, lVarC, z2);
            if (z3) {
                kVarI.d(this.b0, false);
            }
            while (!this.d0 && this.Z.a.c(kVarI, b.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.A.f & 16384) == 0) {
                            throw e;
                        }
                        this.Z.a.b(0L, 0L);
                        j = kVarI.A;
                    }
                } catch (Throwable th) {
                    this.b0 = (int) (kVarI.A - lVar.f);
                    throw th;
                }
            }
            j = kVarI.A;
            this.b0 = (int) (j - lVar.f);
            org.jsoup.helper.n.f(hVar);
        } catch (Throwable th2) {
            org.jsoup.helper.n.f(hVar);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void e() {
        this.d0 = true;
    }

    public final int g(int i) {
        com.google.android.material.motion.a.q(!this.i0);
        if (i >= this.f0.size()) {
            return 0;
        }
        return ((Integer) this.f0.get(i)).intValue();
    }

    public final boolean h() {
        return this.h0 != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[PHI: r16
  0x0080: PHI (r16v1 long) = (r16v0 long), (r16v3 long), (r16v3 long) binds: [B:40:0x00d0, B:22:0x007e, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    public final androidx.media3.extractor.k i(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, boolean z) throws IOException {
        int i;
        long j;
        long jT;
        b bVar;
        h0 h0Var;
        androidx.media3.extractor.n aVar;
        boolean zA;
        androidx.media3.extractor.text.j jVar;
        int i2;
        androidx.media3.extractor.n iVar;
        List listSingletonList;
        int i3;
        androidx.media3.extractor.n dVar;
        g0 g0Var;
        long jT2 = hVar.t(lVar);
        long j2 = this.D;
        h0 h0Var2 = this.R;
        if (z) {
            try {
                h0Var2.g(j2, this.P);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(hVar, lVar.f, jT2);
        if (this.Z == null) {
            w wVar = this.W;
            kVar.C = 0;
            try {
                wVar.J(10);
                kVar.e(wVar.a, 0, 10, false);
                if (wVar.C() != 4801587) {
                    jT = -9223372036854775807L;
                    j = -9223372036854775807L;
                } else {
                    wVar.N(3);
                    int iY = wVar.y();
                    int i4 = iY + 10;
                    byte[] bArr = wVar.a;
                    j = -9223372036854775807L;
                    if (i4 > bArr.length) {
                        wVar.J(i4);
                        System.arraycopy(bArr, 0, wVar.a, 0, 10);
                    }
                    kVar.e(wVar.a, 10, iY, false);
                    androidx.media3.common.h0 h0VarG = this.V.G(wVar.a, iY);
                    if (h0VarG == null) {
                        jT = j;
                    } else {
                        g0[] g0VarArr = h0VarG.a;
                        int length = g0VarArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                g0Var = null;
                                break;
                            }
                            g0 g0Var2 = g0VarArr[i5];
                            if (androidx.media3.extractor.metadata.id3.m.class.isAssignableFrom(g0Var2.getClass())) {
                                g0Var = (g0) androidx.media3.extractor.metadata.id3.m.class.cast(g0Var2);
                                if (!((androidx.media3.extractor.metadata.id3.m) g0Var).b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    g0Var = null;
                                }
                            } else {
                                g0Var = null;
                            }
                            if (g0Var != null) {
                                break;
                            }
                            i5++;
                        }
                        androidx.media3.extractor.metadata.id3.m mVar = (androidx.media3.extractor.metadata.id3.m) g0Var;
                        if (mVar == null) {
                            jT = j;
                        } else {
                            System.arraycopy(mVar.c, 0, wVar.a, 0, 8);
                            wVar.M(0);
                            wVar.L(8);
                            jT = wVar.t() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                j = -9223372036854775807L;
            }
            kVar.C = 0;
            b bVar2 = this.O;
            if (bVar2 == null) {
                Uri uri = lVar.a;
                Map mapK = hVar.k();
                d dVar2 = this.S;
                dVar2.getClass();
                androidx.media3.common.r rVar = this.A;
                int iV = t1.v(rVar.o);
                List list = (List) mapK.get("Content-Type");
                int iV2 = t1.v((list == null || list.isEmpty()) ? null : (String) list.get(0));
                int iW = t1.w(uri);
                ArrayList arrayList = new ArrayList(7);
                d.a(iV, arrayList);
                d.a(iV2, arrayList);
                d.a(iW, arrayList);
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    d.a(d.d[i6], arrayList);
                    i6++;
                }
                kVar.C = 0;
                int i8 = 0;
                androidx.media3.extractor.n nVar = null;
                while (true) {
                    int size = arrayList.size();
                    h0 h0Var3 = this.R;
                    if (i8 >= size) {
                        j2 = j2;
                        i = 0;
                        nVar.getClass();
                        bVar = new b(nVar, rVar, h0Var3, dVar2.a, dVar2.b);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                    int i9 = i8;
                    if (iIntValue == 0) {
                        h0Var = h0Var3;
                        j2 = j2;
                        arrayList = arrayList;
                        aVar = new androidx.media3.extractor.ts.a();
                    } else if (iIntValue == 1) {
                        h0Var = h0Var3;
                        j2 = j2;
                        arrayList = arrayList;
                        aVar = new androidx.media3.extractor.ts.c();
                    } else if (iIntValue == 2) {
                        h0Var = h0Var3;
                        j2 = j2;
                        arrayList = arrayList;
                        aVar = new androidx.media3.extractor.ts.d(0);
                    } else if (iIntValue != 7) {
                        List list2 = this.T;
                        com.google.android.material.shape.g gVar = androidx.media3.extractor.text.j.g;
                        if (iIntValue == 8) {
                            com.google.android.gms.common.internal.k kVar2 = dVar2.a;
                            boolean z2 = dVar2.b;
                            int i10 = dVar2.c;
                            if (z2) {
                                jVar = kVar2;
                                i2 = 4;
                            } else {
                                i2 = 36;
                                jVar = gVar;
                            }
                            iVar = new androidx.media3.extractor.mp4.i(jVar, i2 | androidx.media3.extractor.mp4.i.f(i10), h0Var3, list2 != null ? list2 : a1.B, null);
                            h0Var = h0Var3;
                        } else if (iIntValue == 11) {
                            com.google.android.gms.common.internal.k kVar3 = dVar2.a;
                            boolean z3 = dVar2.b;
                            if (list2 != null) {
                                i3 = 48;
                                listSingletonList = list2;
                            } else {
                                androidx.media3.common.q qVar = new androidx.media3.common.q();
                                qVar.n = i0.p("application/cea-608");
                                listSingletonList = Collections.singletonList(new androidx.media3.common.r(qVar));
                                i3 = 16;
                            }
                            String str = rVar.k;
                            h0Var = h0Var3;
                            if (!TextUtils.isEmpty(str)) {
                                if (i0.c(str, "audio/mp4a-latm") == null) {
                                    i3 |= 2;
                                }
                                if (i0.c(str, "video/avc") == null) {
                                    i3 |= 4;
                                }
                            }
                            iVar = new c0(2, !z3 ? 1 : 0, !z3 ? gVar : kVar3, h0Var, new androidx.compose.foundation.lazy.grid.t(i3, listSingletonList));
                        } else if (iIntValue != 13) {
                            h0Var = h0Var3;
                            j2 = j2;
                            arrayList = arrayList;
                            aVar = null;
                        } else {
                            j2 = j2;
                            arrayList = arrayList;
                            aVar = new u(rVar.d, h0Var3, dVar2.a, dVar2.b);
                            h0Var = h0Var3;
                        }
                        aVar = iVar;
                    } else {
                        h0Var = h0Var3;
                        j2 = j2;
                        arrayList = arrayList;
                        aVar = new androidx.media3.extractor.mp3.d(0L);
                    }
                    aVar.getClass();
                    try {
                        zA = aVar.a(kVar);
                        i = 0;
                        kVar.C = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        kVar.C = 0;
                        zA = false;
                    } catch (Throwable th) {
                        kVar.C = 0;
                        throw th;
                    }
                    if (zA) {
                        bVar = new b(aVar, rVar, h0Var, dVar2.a, dVar2.b);
                        break;
                    }
                    androidx.media3.common.r rVar2 = rVar;
                    if (nVar == null && (iIntValue == iV || iIntValue == iV2 || iIntValue == iW || iIntValue == 11)) {
                        nVar = aVar;
                    }
                    i8 = i9 + 1;
                    rVar = rVar2;
                    arrayList = arrayList;
                    j2 = j2;
                }
            } else {
                com.google.android.gms.common.internal.k kVar4 = bVar2.d;
                androidx.media3.extractor.n nVar2 = bVar2.a;
                com.google.android.material.motion.a.q(!((nVar2 instanceof c0) || (nVar2 instanceof androidx.media3.extractor.mp4.i)));
                if (nVar2 instanceof u) {
                    dVar = new u(bVar2.b.d, bVar2.c, kVar4, bVar2.e);
                } else if (nVar2 instanceof androidx.media3.extractor.ts.d) {
                    dVar = new androidx.media3.extractor.ts.d(0);
                } else if (nVar2 instanceof androidx.media3.extractor.ts.a) {
                    dVar = new androidx.media3.extractor.ts.a();
                } else if (nVar2 instanceof androidx.media3.extractor.ts.c) {
                    dVar = new androidx.media3.extractor.ts.c();
                } else {
                    if (!(nVar2 instanceof androidx.media3.extractor.mp3.d)) {
                        net.luminis.tls.engine.impl.c.r("Unexpected extractor type for recreation: ".concat(nVar2.getClass().getSimpleName()));
                        return null;
                    }
                    dVar = new androidx.media3.extractor.mp3.d(0);
                }
                bVar = new b(dVar, bVar2.b, bVar2.c, kVar4, bVar2.e);
                j2 = j2;
                i = 0;
            }
            b bVar3 = bVar;
            this.Z = bVar3;
            androidx.media3.extractor.n nVar3 = bVar3.a;
            int i11 = ((nVar3 instanceof androidx.media3.extractor.ts.d) || (nVar3 instanceof androidx.media3.extractor.ts.a) || (nVar3 instanceof androidx.media3.extractor.ts.c) || (nVar3 instanceof androidx.media3.extractor.mp3.d)) ? 1 : i;
            r rVar3 = this.a0;
            if (i11 != 0) {
                long jB = jT != j ? h0Var2.b(jT) : j2;
                if (rVar3.t0 != jB) {
                    rVar3.t0 = jB;
                    q[] qVarArr = rVar3.S;
                    int length2 = qVarArr.length;
                    for (int i12 = i; i12 < length2; i12++) {
                        q qVar2 = qVarArr[i12];
                        if (qVar2.H != jB) {
                            qVar2.H = jB;
                            qVar2.B = true;
                        }
                    }
                }
            } else if (rVar3.t0 != 0) {
                rVar3.t0 = 0L;
                q[] qVarArr2 = rVar3.S;
                int length3 = qVarArr2.length;
                for (int i13 = i; i13 < length3; i13++) {
                    q qVar3 = qVarArr2[i13];
                    if (qVar3.H != 0) {
                        qVar3.H = 0L;
                        qVar3.B = true;
                    }
                }
            }
            this.a0.U.clear();
            this.Z.a.d(this.a0);
        } else {
            i = 0;
        }
        r rVar4 = this.a0;
        androidx.media3.common.m mVar2 = rVar4.u0;
        androidx.media3.common.m mVar3 = this.U;
        if (!Objects.equals(mVar2, mVar3)) {
            rVar4.u0 = mVar3;
            int i14 = i;
            while (true) {
                q[] qVarArr3 = rVar4.S;
                if (i14 >= qVarArr3.length) {
                    break;
                }
                if (rVar4.l0[i14]) {
                    q qVar4 = qVarArr3[i14];
                    qVar4.K = mVar3;
                    qVar4.B = true;
                }
                i14++;
            }
        }
        return kVar;
    }
}
