package androidx.media3.datasource.okhttp;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.d0;
import androidx.media3.common.util.b;
import androidx.media3.datasource.c;
import androidx.media3.datasource.i;
import androidx.media3.datasource.l;
import androidx.media3.datasource.r;
import androidx.media3.datasource.t;
import androidx.media3.datasource.u;
import com.google.android.material.shape.a0;
import com.google.common.io.f;
import com.google.common.util.concurrent.y0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.internal.e;
import okhttp3.j0;
import okhttp3.s;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public final y B;
    public final b C;
    public final b D;
    public l E;
    public g0 F;
    public InputStream G;
    public boolean H;
    public long I;
    public long J;

    static {
        d0.a("media3.datasource.okhttp");
    }

    public a(y yVar, b bVar) {
        super(true);
        this.B = yVar;
        this.D = bVar;
        this.C = new b(3);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        if (this.H) {
            this.H = false;
            g();
            o();
        }
        this.F = null;
        this.E = null;
    }

    @Override // androidx.media3.datasource.h
    public final Map k() {
        g0 g0Var = this.F;
        return g0Var == null ? Collections.EMPTY_MAP : g0Var.C.e();
    }

    public final void o() {
        g0 g0Var = this.F;
        if (g0Var != null) {
            j0 j0Var = g0Var.D;
            j0Var.getClass();
            j0Var.close();
        }
        this.G = null;
    }

    public final void p(long j) throws r {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096);
                InputStream inputStream = this.G;
                String str = androidx.media3.common.util.j0.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new r(2008);
                }
                j -= (long) i;
                a(i);
            } catch (IOException e) {
                if (!(e instanceof r)) {
                    throw new r(2000);
                }
                throw ((r) e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws r {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.I;
            if (j != -1) {
                long j2 = j - this.J;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.G;
                    String str = androidx.media3.common.util.j0.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.J += (long) i3;
                        a(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.G;
                String str2 = androidx.media3.common.util.j0.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.J += (long) i3;
                    a(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = androidx.media3.common.util.j0.a;
            throw r.a(e, 2);
        }
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws r {
        s sVarC;
        long j;
        i iVar;
        okhttp3.d0 d0Var;
        boolean z;
        long j2;
        this.E = lVar;
        this.J = 0L;
        this.I = 0L;
        l();
        long j3 = lVar.f;
        int i = lVar.c;
        long j4 = lVar.g;
        String string = lVar.a.toString();
        string.getClass();
        try {
            a0 a0Var = new a0(1);
            a0Var.f(null, string);
            sVarC = a0Var.c();
        } catch (IllegalArgumentException unused) {
            sVarC = null;
        }
        if (sVarC == null) {
            throw new r("Malformed URL", 1004);
        }
        okhttp3.a0 a0Var2 = new okhttp3.a0();
        a0Var2.a = sVarC;
        HashMap map = new HashMap();
        b bVar = this.D;
        if (bVar != null) {
            map.putAll(bVar.w());
        }
        map.putAll(this.C.w());
        map.putAll(lVar.e);
        for (Map.Entry entry : map.entrySet()) {
            a0Var2.b((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j3, j4);
        if (strA != null) {
            a0Var2.a("Range", strA);
        }
        if ((lVar.i & 1) != 1) {
            a0Var2.a("Accept-Encoding", "identity");
        }
        byte[] bArr = lVar.d;
        if (bArr != null) {
            int i2 = e0.a;
            int length = bArr.length;
            j = 0;
            e.a(bArr.length, 0, length);
            d0Var = new okhttp3.d0(null, length, bArr);
            iVar = null;
        } else {
            j = 0;
            if (i == 2) {
                byte[] bArr2 = androidx.media3.common.util.j0.b;
                int i3 = e0.a;
                bArr2.getClass();
                int length2 = bArr2.length;
                e.a(bArr2.length, 0, length2);
                iVar = null;
                d0Var = new okhttp3.d0(null, length2, bArr2);
            } else {
                iVar = null;
                d0Var = null;
            }
        }
        a0Var2.c(l.b(i), d0Var);
        b0 b0Var = new b0(a0Var2);
        y yVar = this.B;
        yVar.getClass();
        m mVar = new m(yVar, b0Var, false);
        try {
            y0 y0Var = new y0();
            mVar.d(new com.google.firebase.platforminfo.c(y0Var));
            try {
                g0 g0Var = (g0) y0Var.get();
                this.F = g0Var;
                j0 j0Var = g0Var.D;
                j0Var.getClass();
                this.G = j0Var.a();
                int i4 = g0Var.A;
                if (g0Var.N) {
                    j0Var.w();
                    long j5 = (i4 != 200 || j3 == j) ? j : j3;
                    if (j4 != -1) {
                        this.I = j4;
                    } else {
                        long jM = j0Var.m();
                        this.I = jM != -1 ? jM - j5 : -1L;
                    }
                    this.H = true;
                    m(lVar);
                    try {
                        p(j5);
                        return this.I;
                    } catch (r e) {
                        o();
                        throw e;
                    }
                }
                if (i4 == 416) {
                    String strB = g0Var.C.b("Content-Range");
                    if (TextUtils.isEmpty(strB)) {
                        j2 = -1;
                        z = true;
                    } else {
                        Matcher matcher = u.a.matcher(strB);
                        z = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j2 = Long.parseLong(strGroup);
                        } else {
                            j2 = -1;
                        }
                    }
                    if (j3 == j2) {
                        this.H = z;
                        m(lVar);
                        return j4 != -1 ? j4 : j;
                    }
                }
                try {
                    InputStream inputStream = this.G;
                    inputStream.getClass();
                    f.b(inputStream);
                } catch (IOException unused2) {
                    String str = androidx.media3.common.util.j0.a;
                }
                TreeMap treeMapE = g0Var.C.e();
                o();
                throw new t(i4, i4 == 416 ? new i(2008) : iVar, treeMapE);
            } catch (InterruptedException unused3) {
                mVar.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw r.a(e3, 1);
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        g0 g0Var = this.F;
        if (g0Var != null) {
            return Uri.parse(g0Var.e.a.i);
        }
        l lVar = this.E;
        if (lVar != null) {
            return lVar.a;
        }
        return null;
    }
}
