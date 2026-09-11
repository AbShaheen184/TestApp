package okhttp3.internal.cache;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import com.caverock.androidsvg.m;
import com.google.android.gms.measurement.internal.f1;
import com.google.android.material.shape.c0;
import com.google.android.material.textfield.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.l;
import kotlin.text.k;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.internal.connection.o;
import okhttp3.j0;
import okhttp3.k0;
import okhttp3.m0;
import okhttp3.n;
import okhttp3.q;
import okhttp3.r;
import okhttp3.s;
import okhttp3.t;
import okhttp3.y;
import okhttp3.z;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public b(n nVar) {
        nVar.getClass();
        this.b = nVar;
    }

    public static int d(g0 g0Var, int i) {
        String strG = g0.g("Retry-After", g0Var);
        if (strG == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strG).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strG);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0593  */
    /* JADX WARN: Code duplicated, block: B:243:0x059d  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:247:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:253:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:256:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:258:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:260:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:268:0x060b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x060d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0611 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x0613  */
    /* JADX WARN: Code duplicated, block: B:272:0x0617 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0619  */
    /* JADX WARN: Code duplicated, block: B:275:0x0642  */
    /* JADX WARN: Code duplicated, block: B:285:0x0677  */
    /* JADX WARN: Code duplicated, block: B:351:0x0826  */
    /* JADX WARN: Code duplicated, block: B:352:0x082b  */
    /* JADX WARN: Code duplicated, block: B:355:0x0848  */
    /* JADX WARN: Code duplicated, block: B:362:0x0872  */
    /* JADX WARN: Code duplicated, block: B:381:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:382:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:410:0x0907 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.t
    public final g0 a(u uVar) throws Throwable {
        g0 g0Var;
        int iP;
        long j;
        long time;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        com.google.common.util.concurrent.g0 g0Var2;
        String str4;
        long jMax;
        long j2;
        long time2;
        String string;
        int i;
        int i2;
        long j3;
        long millis;
        long millis2;
        String str5;
        String str6;
        long j4;
        f0 f0VarM;
        int i3;
        g0 g0Var3;
        g0 g0VarZ;
        g0 g0VarA;
        androidx.compose.material.ripple.g gVar;
        g0 g0VarA2;
        b1 b1VarM;
        b1 b1VarM2;
        g0 g0Var4;
        boolean z;
        j0 j0Var;
        g0 g0Var5;
        b0 b0Var;
        List list;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        okhttp3.internal.tls.c cVar;
        okhttp3.i iVar;
        switch (this.a) {
            case 0:
                okhttp3.f fVar = (okhttp3.f) this.b;
                if (fVar != null) {
                    b0 b0Var2 = (b0) uVar.i;
                    b0Var2.getClass();
                    s sVar = b0Var2.a;
                    try {
                        e eVarW = fVar.e.w(com.google.common.base.c.o(sVar));
                        if (eVarW == null) {
                            g0Var4 = null;
                        } else {
                            try {
                                okhttp3.d dVar = new okhttp3.d((h0) eVarW.z.get(0));
                                String str7 = dVar.c;
                                r rVar = dVar.b;
                                s sVar2 = dVar.a;
                                r rVar2 = dVar.g;
                                String strB = rVar2.b("Content-Type");
                                String strB2 = rVar2.b("Content-Length");
                                sVar2.getClass();
                                rVar.getClass();
                                str7.getClass();
                                a0 a0Var = new a0();
                                a0Var.a = sVar2;
                                a0Var.c = rVar.d();
                                a0Var.c(!str7.equals("\u0000") ? str7 : "GET", null);
                                b0 b0Var3 = new b0(a0Var);
                                i0 i0Var = j0.y;
                                okhttp3.b bVar = m0.w;
                                new ArrayList(20);
                                z zVar = dVar.d;
                                zVar.getClass();
                                int i4 = dVar.e;
                                String str8 = dVar.f;
                                str8.getClass();
                                m mVarD = rVar2.d();
                                okhttp3.c cVar2 = new okhttp3.c(eVarW, strB, strB2);
                                q qVar = dVar.h;
                                long j5 = dVar.i;
                                long j6 = dVar.j;
                                if (i4 < 0) {
                                    net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.l(i4, "code < 0: "));
                                    return null;
                                }
                                r rVarF = mVarD.f();
                                g0Var4 = new g0(b0Var3, zVar, str8, i4, qVar, rVarF, cVar2, null, null, null, null, j5, j6, null, bVar);
                                if (sVar2.equals(sVar) && str7.equals(b0Var2.b)) {
                                    Set setX = com.google.common.base.c.x(rVarF);
                                    if (!(setX instanceof Collection) || !setX.isEmpty()) {
                                        Iterator it = setX.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                String str9 = (String) it.next();
                                                if (!rVar.h(str9).equals(b0Var2.c.h(str9))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                okhttp3.internal.e.b(g0Var4.D);
                                g0Var4 = null;
                            } catch (IOException unused) {
                                okhttp3.internal.e.b(eVarW);
                            }
                        }
                    } catch (IOException unused2) {
                    }
                    g0Var = g0Var4;
                } else {
                    g0Var = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                b0 b0Var4 = (b0) uVar.i;
                b0Var4.getClass();
                if (g0Var != null) {
                    j = g0Var.I;
                    time = g0Var.J;
                    r rVar3 = g0Var.C;
                    int size = rVar3.size();
                    int i5 = 0;
                    iP = -1;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    while (i5 < size) {
                        String strC = rVar3.c(i5);
                        long j7 = jCurrentTimeMillis;
                        String strF = rVar3.f(i5);
                        if (strC.equalsIgnoreCase("Date")) {
                            str3 = strF;
                            dateA3 = okhttp3.internal.http.c.a(strF);
                        } else if (strC.equalsIgnoreCase("Expires")) {
                            dateA = okhttp3.internal.http.c.a(strF);
                        } else if (strC.equalsIgnoreCase("Last-Modified")) {
                            str2 = strF;
                            dateA2 = okhttp3.internal.http.c.a(strF);
                        } else if (strC.equalsIgnoreCase("ETag")) {
                            str = strF;
                        } else if (strC.equalsIgnoreCase("Age")) {
                            iP = okhttp3.internal.e.p(-1, strF);
                        }
                        i5++;
                        jCurrentTimeMillis = j7;
                    }
                } else {
                    iP = -1;
                    j = 0;
                    time = 0;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                long j8 = jCurrentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i6 = 17;
                if (g0Var == null) {
                    g0Var2 = new com.google.common.util.concurrent.g0(i6, b0Var4, null, false);
                } else {
                    boolean z3 = false;
                    s sVar3 = b0Var4.a;
                    r rVar4 = b0Var4.c;
                    if (sVar3.f() && g0Var.B == null) {
                        g0Var2 = new com.google.common.util.concurrent.g0(17, b0Var4, null, z3);
                    } else {
                        long time3 = j;
                        Object obj = null;
                        int i7 = 17;
                        if (com.google.common.base.c.m(g0Var, b0Var4)) {
                            okhttp3.g gVarY = b0Var4.f;
                            if (gVarY == null) {
                                int i8 = okhttp3.g.n;
                                gVarY = kotlin.collections.a0.y(b0Var4.c);
                                b0Var4.f = gVarY;
                            }
                            if (!gVarY.a && rVar4.b("If-Modified-Since") == null && rVar4.b("If-None-Match") == null) {
                                okhttp3.g gVarA = g0Var.a();
                                if (dateA3 != null) {
                                    str4 = "If-None-Match";
                                    jMax = Math.max(0L, time - dateA3.getTime());
                                } else {
                                    str4 = "If-None-Match";
                                    jMax = 0;
                                }
                                if (iP != -1) {
                                    jMax = Math.max(jMax, timeUnit.toMillis(iP));
                                }
                                long jMax2 = jMax + Math.max(0L, time - time3) + Math.max(0L, j8 - time);
                                int i9 = g0Var.a().c;
                                if (i9 != -1) {
                                    time2 = timeUnit.toMillis(i9);
                                } else {
                                    if (dateA != null) {
                                        if (dateA3 != null) {
                                            time = dateA3.getTime();
                                        }
                                        time2 = dateA.getTime() - time;
                                        if (time2 <= 0) {
                                            time2 = 0;
                                        }
                                    } else if (dateA2 == null) {
                                        j2 = 0;
                                        time2 = j2;
                                    } else {
                                        List list2 = g0Var.e.a.g;
                                        if (list2 == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            okhttp3.b.b(list2, sb);
                                            string = sb.toString();
                                        }
                                        if (string == null) {
                                            if (dateA3 != null) {
                                                time3 = dateA3.getTime();
                                            }
                                            long time4 = time3 - dateA2.getTime();
                                            j2 = 0;
                                            if (time4 > 0) {
                                                time2 = time4 / ((long) 10);
                                            }
                                        } else {
                                            j2 = 0;
                                        }
                                        time2 = j2;
                                    }
                                    i = gVarY.c;
                                    if (i != -1) {
                                        time2 = Math.min(time2, timeUnit.toMillis(i));
                                    }
                                    i2 = gVarY.i;
                                    j3 = time2;
                                    if (i2 != -1) {
                                        millis = timeUnit.toMillis(i2);
                                    } else {
                                        millis = j2;
                                    }
                                    if (!gVarA.g || (i3 = gVarY.h) == -1) {
                                        millis2 = j2;
                                    } else {
                                        millis2 = timeUnit.toMillis(i3);
                                    }
                                    if (gVarA.a) {
                                        if (str != null) {
                                            str5 = str4;
                                            str6 = str;
                                        } else if (dateA2 != null) {
                                            str5 = "If-Modified-Since";
                                            str6 = str2;
                                        } else if (dateA3 != null) {
                                            str5 = r4;
                                            str6 = str3;
                                        } else {
                                            g0Var2 = new com.google.common.util.concurrent.g0(17, b0Var4, null, false);
                                        }
                                        m mVarD2 = rVar4.d();
                                        str6.getClass();
                                        p.f(mVarD2, str5, str6);
                                        a0 a0VarA = b0Var4.a();
                                        a0VarA.c = mVarD2.f().d();
                                        g0Var2 = new com.google.common.util.concurrent.g0(17, new b0(a0VarA), g0Var, false);
                                    } else {
                                        j4 = jMax2 + millis;
                                        if (j4 < j3 + millis2) {
                                            f0VarM = g0Var.m();
                                            if (j4 >= j3) {
                                                f0VarM.f.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (jMax2 > 86400000 && g0Var.a().c == -1 && dateA == null) {
                                                f0VarM.f.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            g0Var2 = new com.google.common.util.concurrent.g0(17, null, f0VarM.a(), false);
                                        } else {
                                            if (str != null) {
                                                str5 = str4;
                                                str6 = str;
                                            } else if (dateA2 != null) {
                                                str5 = "If-Modified-Since";
                                                str6 = str2;
                                            } else if (dateA3 != null) {
                                                str5 = r4;
                                                str6 = str3;
                                            } else {
                                                g0Var2 = new com.google.common.util.concurrent.g0(17, b0Var4, null, false);
                                            }
                                            m mVarD3 = rVar4.d();
                                            str6.getClass();
                                            p.f(mVarD3, str5, str6);
                                            a0 a0VarA2 = b0Var4.a();
                                            a0VarA2.c = mVarD3.f().d();
                                            g0Var2 = new com.google.common.util.concurrent.g0(17, new b0(a0VarA2), g0Var, false);
                                        }
                                    }
                                }
                                j2 = 0;
                                i = gVarY.c;
                                if (i != -1) {
                                    time2 = Math.min(time2, timeUnit.toMillis(i));
                                }
                                i2 = gVarY.i;
                                j3 = time2;
                                if (i2 != -1) {
                                    millis = timeUnit.toMillis(i2);
                                } else {
                                    millis = j2;
                                }
                                if (gVarA.g) {
                                    millis2 = j2;
                                } else {
                                    millis2 = j2;
                                }
                                if (gVarA.a) {
                                    j4 = jMax2 + millis;
                                    if (j4 < j3 + millis2) {
                                        f0VarM = g0Var.m();
                                        if (j4 >= j3) {
                                            f0VarM.f.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (jMax2 > 86400000) {
                                            f0VarM.f.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        g0Var2 = new com.google.common.util.concurrent.g0(17, null, f0VarM.a(), false);
                                    } else {
                                        if (str != null) {
                                            str5 = str4;
                                            str6 = str;
                                        } else if (dateA2 != null) {
                                            str5 = "If-Modified-Since";
                                            str6 = str2;
                                        } else if (dateA3 != null) {
                                            str5 = r4;
                                            str6 = str3;
                                        } else {
                                            g0Var2 = new com.google.common.util.concurrent.g0(17, b0Var4, null, false);
                                        }
                                        m mVarD4 = rVar4.d();
                                        str6.getClass();
                                        p.f(mVarD4, str5, str6);
                                        a0 a0VarA3 = b0Var4.a();
                                        a0VarA3.c = mVarD4.f().d();
                                        g0Var2 = new com.google.common.util.concurrent.g0(17, new b0(a0VarA3), g0Var, false);
                                    }
                                } else {
                                    if (str != null) {
                                        str5 = str4;
                                        str6 = str;
                                    } else if (dateA2 != null) {
                                        str5 = "If-Modified-Since";
                                        str6 = str2;
                                    } else if (dateA3 != null) {
                                        str5 = r4;
                                        str6 = str3;
                                    } else {
                                        g0Var2 = new com.google.common.util.concurrent.g0(17, b0Var4, null, false);
                                    }
                                    m mVarD5 = rVar4.d();
                                    str6.getClass();
                                    p.f(mVarD5, str5, str6);
                                    a0 a0VarA4 = b0Var4.a();
                                    a0VarA4.c = mVarD5.f().d();
                                    g0Var2 = new com.google.common.util.concurrent.g0(17, new b0(a0VarA4), g0Var, false);
                                }
                            } else {
                                g0Var2 = new com.google.common.util.concurrent.g0(17, b0Var4, null, false);
                            }
                        } else {
                            g0Var2 = new com.google.common.util.concurrent.g0(i7, b0Var4, obj, z3);
                        }
                    }
                }
                if (((b0) g0Var2.y) == null) {
                    g0Var3 = null;
                } else {
                    okhttp3.g gVarY2 = b0Var4.f;
                    if (gVarY2 == null) {
                        int i10 = okhttp3.g.n;
                        gVarY2 = kotlin.collections.a0.y(b0Var4.c);
                        b0Var4.f = gVarY2;
                    }
                    if (gVarY2.j) {
                        g0Var3 = null;
                        g0Var2 = new com.google.common.util.concurrent.g0(17, g0Var3, g0Var3, false);
                    } else {
                        g0Var3 = null;
                    }
                }
                b0 b0Var5 = (b0) g0Var2.y;
                g0 g0Var6 = (g0) g0Var2.z;
                okhttp3.f fVar2 = (okhttp3.f) this.b;
                if (fVar2 != null) {
                    synchronized (fVar2) {
                    }
                }
                if (g0Var != null && g0Var6 == null) {
                    okhttp3.internal.e.b(g0Var.D);
                }
                if (b0Var5 == null && g0Var6 == null) {
                    i0 i0Var2 = j0.y;
                    okhttp3.b bVar2 = m0.w;
                    ArrayList arrayList = new ArrayList(20);
                    b0 b0Var6 = (b0) uVar.i;
                    b0Var6.getClass();
                    return new g0(b0Var6, z.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new r((String[]) arrayList.toArray(new String[0])), i0Var2, null, null, null, null, -1L, System.currentTimeMillis(), null, bVar2);
                }
                if (b0Var5 == null) {
                    g0Var6.getClass();
                    f0 f0VarM2 = g0Var6.m();
                    g0 g0VarZ2 = com.google.android.material.sidesheet.b.z(g0Var6);
                    f0.b("cacheResponse", g0VarZ2);
                    f0VarM2.j = g0VarZ2;
                    return f0VarM2.a();
                }
                try {
                    g0 g0VarF = uVar.f(b0Var5);
                    if (g0Var6 == null) {
                        f0 f0VarM3 = g0VarF.m();
                        if (g0Var6 != null) {
                            g0VarZ = com.google.android.material.sidesheet.b.z(g0Var6);
                        } else {
                            g0VarZ = g0Var3;
                        }
                        f0.b("cacheResponse", g0VarZ);
                        f0VarM3.j = g0VarZ;
                        g0 g0VarZ3 = com.google.android.material.sidesheet.b.z(g0VarF);
                        f0.b("networkResponse", g0VarZ3);
                        f0VarM3.i = g0VarZ3;
                        g0VarA = f0VarM3.a();
                        if (((okhttp3.f) this.b) != null) {
                            if (!okhttp3.internal.http.f.a(g0VarA) && com.google.common.base.c.m(g0VarA, b0Var5)) {
                                okhttp3.f fVar3 = (okhttp3.f) this.b;
                                f0 f0VarM4 = g0VarA.m();
                                f0VarM4.a = b0Var5;
                                g0 g0VarA3 = f0VarM4.a();
                                fVar3.getClass();
                                b0 b0Var7 = g0VarA3.e;
                                String str10 = b0Var7.b;
                                try {
                                    if (com.google.common.base.i.l(str10)) {
                                        fVar3.g(b0Var7);
                                    } else {
                                        if (str10.equals("GET") && !com.google.common.base.c.x(g0VarA3.C).contains("*")) {
                                            okhttp3.d dVar2 = new okhttp3.d(g0VarA3);
                                            try {
                                                h hVar = fVar3.e;
                                                String strO = com.google.common.base.c.o(b0Var7.a);
                                                kotlin.text.i iVar2 = h.Q;
                                                b1VarM = hVar.m(strO, -1L);
                                                if (b1VarM == 0) {
                                                    gVar = g0Var3;
                                                } else {
                                                    try {
                                                        dVar2.c(b1VarM);
                                                        androidx.compose.material.ripple.g gVar2 = new androidx.compose.material.ripple.g();
                                                        gVar2.e = fVar3;
                                                        gVar2.b = b1VarM;
                                                        okio.f0 f0VarL = b1VarM.l(1);
                                                        gVar2.c = f0VarL;
                                                        gVar2.d = new okhttp3.e(fVar3, gVar2, f0VarL);
                                                        gVar = gVar2;
                                                    } catch (IOException unused3) {
                                                        if (b1VarM != 0) {
                                                            b1VarM.a();
                                                        }
                                                        gVar = g0Var3;
                                                    }
                                                }
                                            } catch (IOException unused4) {
                                                b1VarM = g0Var3;
                                            }
                                        } else {
                                            gVar = g0Var3;
                                        }
                                        if (gVar != 0) {
                                            a aVar = new a(g0VarA.D.P(), gVar, okio.b.b((okhttp3.e) gVar.d));
                                            String strG = g0.g("Content-Type", g0VarA);
                                            long jM = g0VarA.D.m();
                                            f0 f0VarM5 = g0VarA.m();
                                            f0VarM5.g = new okhttp3.internal.http.g(strG, jM, new okio.b0(aVar));
                                            g0VarA2 = f0VarM5.a();
                                        }
                                    }
                                    break;
                                } catch (IOException unused5) {
                                }
                                gVar = g0Var3;
                                if (gVar != 0) {
                                    a aVar2 = new a(g0VarA.D.P(), gVar, okio.b.b((okhttp3.e) gVar.d));
                                    String strG2 = g0.g("Content-Type", g0VarA);
                                    long jM2 = g0VarA.D.m();
                                    f0 f0VarM6 = g0VarA.m();
                                    f0VarM6.g = new okhttp3.internal.http.g(strG2, jM2, new okio.b0(aVar2));
                                    g0VarA2 = f0VarM6.a();
                                }
                            } else if (com.google.common.base.i.l(b0Var5.b)) {
                                try {
                                    ((okhttp3.f) this.b).g(b0Var5);
                                    break;
                                } catch (IOException unused6) {
                                }
                            }
                        }
                        return g0VarA;
                    }
                    if (g0VarF.A != 304) {
                        okhttp3.internal.e.b(g0Var6.D);
                        f0 f0VarM7 = g0VarF.m();
                        if (g0Var6 != null) {
                            g0VarZ = com.google.android.material.sidesheet.b.z(g0Var6);
                        } else {
                            g0VarZ = g0Var3;
                        }
                        f0.b("cacheResponse", g0VarZ);
                        f0VarM7.j = g0VarZ;
                        g0 g0VarZ4 = com.google.android.material.sidesheet.b.z(g0VarF);
                        f0.b("networkResponse", g0VarZ4);
                        f0VarM7.i = g0VarZ4;
                        g0VarA = f0VarM7.a();
                        if (((okhttp3.f) this.b) != null) {
                            if (!okhttp3.internal.http.f.a(g0VarA)) {
                                if (com.google.common.base.i.l(b0Var5.b)) {
                                    ((okhttp3.f) this.b).g(b0Var5);
                                }
                            } else if (com.google.common.base.i.l(b0Var5.b)) {
                                ((okhttp3.f) this.b).g(b0Var5);
                            }
                            break;
                        }
                        return g0VarA;
                    }
                    f0 f0VarM8 = g0Var6.m();
                    r rVar5 = g0Var6.C;
                    r rVar6 = g0VarF.C;
                    ArrayList arrayList2 = new ArrayList(20);
                    int size2 = rVar5.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        String strC2 = rVar5.c(i11);
                        String strF2 = rVar5.f(i11);
                        if ((!"Warning".equalsIgnoreCase(strC2) || !kotlin.text.r.O(strF2, "1", false)) && ("Content-Length".equalsIgnoreCase(strC2) || "Content-Encoding".equalsIgnoreCase(strC2) || "Content-Type".equalsIgnoreCase(strC2) || !com.google.common.base.b.o(strC2) || rVar6.b(strC2) == null)) {
                            arrayList2.add(strC2);
                            arrayList2.add(k.A0(strF2).toString());
                        }
                    }
                    int size3 = rVar6.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        String strC3 = rVar6.c(i12);
                        if (!"Content-Length".equalsIgnoreCase(strC3) && !"Content-Encoding".equalsIgnoreCase(strC3) && !"Content-Type".equalsIgnoreCase(strC3) && com.google.common.base.b.o(strC3)) {
                            String strF3 = rVar6.f(i12);
                            arrayList2.add(strC3);
                            arrayList2.add(k.A0(strF3).toString());
                        }
                    }
                    f0VarM8.f = new r((String[]) arrayList2.toArray(new String[0])).d();
                    f0VarM8.l = g0VarF.I;
                    f0VarM8.m = g0VarF.J;
                    g0 g0VarZ5 = com.google.android.material.sidesheet.b.z(g0Var6);
                    f0.b("cacheResponse", g0VarZ5);
                    f0VarM8.j = g0VarZ5;
                    g0 g0VarZ6 = com.google.android.material.sidesheet.b.z(g0VarF);
                    f0.b("networkResponse", g0VarZ6);
                    f0VarM8.i = g0VarZ6;
                    g0VarA2 = f0VarM8.a();
                    g0VarF.D.close();
                    okhttp3.f fVar4 = (okhttp3.f) this.b;
                    fVar4.getClass();
                    synchronized (fVar4) {
                    }
                    ((okhttp3.f) this.b).getClass();
                    okhttp3.d dVar3 = new okhttp3.d(g0VarA2);
                    j0 j0Var2 = g0Var6.D;
                    j0Var2.getClass();
                    e eVar = ((okhttp3.c) j0Var2).z;
                    try {
                        b1VarM2 = eVar.A.m(eVar.e, eVar.y);
                        if (b1VarM2 != 0) {
                            try {
                                dVar3.c(b1VarM2);
                                b1VarM2.c();
                                break;
                            } catch (IOException unused7) {
                                if (b1VarM2 != 0) {
                                    try {
                                        b1VarM2.a();
                                        break;
                                    } catch (IOException unused8) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused9) {
                        b1VarM2 = g0Var3;
                    }
                    return g0VarA2;
                } catch (Throwable th) {
                    if (g0Var != null) {
                        okhttp3.internal.e.b(g0Var.D);
                    }
                    throw th;
                }
            case 1:
                n nVar = (n) this.b;
                b0 b0Var8 = (b0) uVar.i;
                a0 a0VarA5 = b0Var8.a();
                s sVar4 = b0Var8.a;
                r rVar7 = b0Var8.c;
                e0 e0Var = b0Var8.d;
                if (e0Var != null) {
                    okhttp3.u uVarB = e0Var.b();
                    if (uVarB != null) {
                        a0VarA5.b("Content-Type", uVarB.a);
                    }
                    long jA = e0Var.a();
                    if (jA != -1) {
                        a0VarA5.b("Content-Length", String.valueOf(jA));
                        a0VarA5.c.h("Transfer-Encoding");
                    } else {
                        a0VarA5.b("Transfer-Encoding", "chunked");
                        a0VarA5.c.h("Content-Length");
                    }
                }
                if (rVar7.b("Host") == null) {
                    a0VarA5.b("Host", okhttp3.internal.g.i(sVar4, false));
                }
                if (rVar7.b("Connection") == null) {
                    a0VarA5.b("Connection", "Keep-Alive");
                }
                if (rVar7.b("Accept-Encoding") == null && rVar7.b("Range") == null) {
                    a0VarA5.b("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                List listH = nVar.h(sVar4);
                if (!listH.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = 0;
                    for (Object obj2 : listH) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        okhttp3.m mVar = (okhttp3.m) obj2;
                        if (i13 > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(mVar.a);
                        sb2.append('=');
                        sb2.append(mVar.b);
                        i13 = i14;
                    }
                    a0VarA5.b("Cookie", sb2.toString());
                }
                if (rVar7.b("User-Agent") == null) {
                    a0VarA5.b("User-Agent", "okhttp/5.3.2");
                }
                b0 b0Var9 = new b0(a0VarA5);
                g0 g0VarF2 = uVar.f(b0Var9);
                r rVar8 = g0VarF2.C;
                okhttp3.internal.http.f.b(nVar, b0Var9.a, rVar8);
                f0 f0VarM9 = g0VarF2.m();
                f0VarM9.a = b0Var9;
                if (z && "gzip".equalsIgnoreCase(g0.g("Content-Encoding", g0VarF2)) && okhttp3.internal.http.f.a(g0VarF2) && (j0Var = g0VarF2.D) != null) {
                    okio.p pVar = new okio.p(j0Var.P());
                    m mVarD6 = rVar8.d();
                    mVarD6.h("Content-Encoding");
                    mVarD6.h("Content-Length");
                    f0VarM9.f = mVarD6.f().d();
                    f0VarM9.g = new okhttp3.internal.http.g(g0.g("Content-Type", g0VarF2), -1L, new okio.b0(pVar));
                }
                return f0VarM9.a();
            default:
                b0 b0Var10 = (b0) uVar.i;
                okhttp3.internal.connection.m mVar2 = (okhttp3.internal.connection.m) uVar.g;
                List listW = kotlin.collections.u.e;
                g0 g0Var7 = null;
                int i15 = 0;
                b0 b0Var11 = b0Var10;
                boolean z4 = true;
                while (true) {
                    b0Var11.getClass();
                    if (mVar2.H == null) {
                        synchronized (mVar2) {
                            try {
                                try {
                                    if (mVar2.J) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (mVar2.I || mVar2.L || mVar2.K) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                mVar2 = mVar2;
                            }
                            throw th;
                        }
                        if (z4) {
                            List list3 = listW;
                            y yVar = mVar2.e;
                            okhttp3.internal.concurrent.d dVar4 = yVar.E;
                            androidx.compose.ui.graphics.vector.a aVar3 = mVar2.A;
                            int i16 = yVar.y;
                            int i17 = yVar.z;
                            int i18 = uVar.c;
                            int i19 = uVar.d;
                            g0Var5 = null;
                            int i20 = yVar.A;
                            boolean z5 = yVar.e;
                            boolean z6 = yVar.f;
                            s sVar5 = b0Var11.a;
                            sVar5.getClass();
                            b0 b0Var12 = b0Var11;
                            if (sVar5.f()) {
                                SSLSocketFactory sSLSocketFactory2 = yVar.p;
                                if (sSLSocketFactory2 != null) {
                                    okhttp3.internal.tls.c cVar3 = yVar.t;
                                    iVar = yVar.u;
                                    sSLSocketFactory = sSLSocketFactory2;
                                    cVar = cVar3;
                                } else {
                                    net.luminis.tls.engine.impl.c.r("CLEARTEXT-only client");
                                }
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                iVar = null;
                            }
                            okhttp3.internal.connection.m mVar3 = mVar2;
                            list = list3;
                            o oVar = new o(dVar4, aVar3, i16, i17, i18, i19, i20, z5, z6, new okhttp3.a(sVar5.d, sVar5.e, yVar.l, yVar.o, sSLSocketFactory, cVar, iVar, yVar.n, yVar.s, yVar.r, yVar.m), mVar2.e.D, mVar3, b0Var12);
                            mVar2 = mVar3;
                            b0Var = b0Var12;
                            y yVar2 = mVar2.e;
                            mVar2.E = yVar2.f ? new f1(oVar, yVar2.E) : new c0(oVar);
                        } else {
                            mVar2 = mVar2;
                            b0Var = b0Var11;
                            list = listW;
                            g0Var5 = null;
                        }
                        try {
                            if (mVar2.N) {
                                throw new IOException("Canceled");
                            }
                            try {
                                f0 f0VarM10 = uVar.f(b0Var).m();
                                f0VarM10.a = b0Var;
                                f0VarM10.k = g0Var7 != null ? com.google.android.material.sidesheet.b.z(g0Var7) : g0Var5;
                                g0 g0VarA4 = f0VarM10.a();
                                b0 b0VarB = b(g0VarA4, mVar2.H);
                                if (b0VarB == null) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    e0 e0Var2 = b0VarB.d;
                                    if (e0Var2 == null || !e0Var2.c()) {
                                        okhttp3.internal.e.b(g0VarA4.D);
                                        int i21 = i15 + 1;
                                        if (i21 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i21);
                                        }
                                        mVar2.f(true);
                                        g0Var7 = g0VarA4;
                                        listW = list;
                                        i15 = i21;
                                        z4 = true;
                                        b0Var11 = b0VarB;
                                    }
                                }
                                mVar2.f(z2);
                                return g0VarA4;
                            } catch (IOException e) {
                                if (!c(e, mVar2, b0Var)) {
                                    byte[] bArr = okhttp3.internal.e.a;
                                    list.getClass();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        kotlin.a.a(e, (Exception) it2.next());
                                    }
                                    throw e;
                                }
                                listW = kotlin.collections.o.W(list, e);
                                mVar2.f(true);
                                b0Var11 = b0Var;
                                z4 = false;
                            }
                        } catch (Throwable th4) {
                            mVar2.f(true);
                            throw th4;
                        }
                    } else {
                        g0Var5 = null;
                        net.luminis.tls.engine.impl.c.r("Check failed.");
                    }
                }
                return g0Var5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    public b0 b(g0 g0Var, b1 b1Var) throws ProtocolException {
        y yVar;
        String strG;
        b0 b0Var;
        com.google.android.material.shape.a0 a0Var;
        s sVarC;
        a0 a0VarA;
        boolean z;
        e0 e0Var;
        g0 g0Var2;
        k0 k0Var = b1Var != null ? b1Var.i().c : null;
        int i = g0Var.A;
        b0 b0Var2 = g0Var.e;
        String str = b0Var2.b;
        if (i == 307 || i == 308) {
            yVar = (y) this.b;
            if (yVar.h) {
                strG = g0.g("Location", g0Var);
                b0Var = g0Var.e;
                if (strG != null) {
                    s sVar = b0Var.a;
                    sVar.getClass();
                    try {
                        a0Var = new com.google.android.material.shape.a0(1);
                        a0Var.f(sVar, strG);
                    } catch (IllegalArgumentException unused) {
                        a0Var = null;
                    }
                    if (a0Var != null) {
                        sVarC = a0Var.c();
                    } else {
                        sVarC = null;
                    }
                    if (sVarC != null && (l.a(sVarC.a, b0Var.a.a) || yVar.i)) {
                        a0VarA = b0Var.a();
                        if (com.google.common.base.i.q(str)) {
                            int i2 = g0Var.A;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                a0VarA.c(str, z ? b0Var.d : null);
                            } else {
                                a0VarA.c("GET", null);
                            }
                            if (!z) {
                                a0VarA.c.h("Transfer-Encoding");
                                a0VarA.c.h("Content-Length");
                                a0VarA.c.h("Content-Type");
                            }
                        }
                        if (!okhttp3.internal.g.a(b0Var.a, sVarC)) {
                            a0VarA.c.h("Authorization");
                        }
                        a0VarA.a = sVarC;
                        return new b0(a0VarA);
                    }
                }
            }
        } else {
            if (i == 401) {
                ((y) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                e0 e0Var2 = b0Var2.d;
                if ((e0Var2 == null || !e0Var2.c()) && b1Var != null && !l.a(((okhttp3.internal.connection.g) b1Var.z).c().j.h.d, ((okhttp3.internal.http.e) b1Var.A).i().h().a.h.d)) {
                    okhttp3.internal.connection.n nVarI = b1Var.i();
                    synchronized (nVarI) {
                        nVarI.l = true;
                    }
                    return g0Var.e;
                }
            } else if (i == 503) {
                g0 g0Var3 = g0Var.H;
                if ((g0Var3 == null || g0Var3.A != 503) && d(g0Var, Integer.MAX_VALUE) == 0) {
                    return g0Var.e;
                }
            } else {
                if (i == 407) {
                    k0Var.getClass();
                    if (k0Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((y) this.b).n.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            yVar = (y) this.b;
                            if (yVar.h) {
                                strG = g0.g("Location", g0Var);
                                b0Var = g0Var.e;
                                if (strG != null) {
                                    s sVar2 = b0Var.a;
                                    sVar2.getClass();
                                    a0Var = new com.google.android.material.shape.a0(1);
                                    a0Var.f(sVar2, strG);
                                    if (a0Var != null) {
                                        sVarC = a0Var.c();
                                    } else {
                                        sVarC = null;
                                    }
                                    if (sVarC != null) {
                                        a0VarA = b0Var.a();
                                        if (com.google.common.base.i.q(str)) {
                                            int i3 = g0Var.A;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                a0VarA.c(str, z ? b0Var.d : null);
                                            } else {
                                                a0VarA.c(str, z ? b0Var.d : null);
                                            }
                                            if (!z) {
                                                a0VarA.c.h("Transfer-Encoding");
                                                a0VarA.c.h("Content-Length");
                                                a0VarA.c.h("Content-Type");
                                            }
                                        }
                                        if (!okhttp3.internal.g.a(b0Var.a, sVarC)) {
                                            a0VarA.c.h("Authorization");
                                        }
                                        a0VarA.a = sVarC;
                                        return new b0(a0VarA);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((y) this.b).e && (((e0Var = b0Var2.d) == null || !e0Var.c()) && (((g0Var2 = g0Var.H) == null || g0Var2.A != 408) && d(g0Var, 0) <= 0))) {
                    return g0Var.e;
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, okhttp3.internal.connection.m mVar, b0 b0Var) {
        e0 e0Var;
        boolean z = iOException instanceof okhttp3.internal.http2.a;
        if (!((y) this.b).e) {
            return false;
        }
        if ((!z && (((e0Var = b0Var.d) != null && e0Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        b1 b1Var = mVar.O;
        if (b1Var == null || !b1Var.e) {
            return false;
        }
        okhttp3.internal.connection.g gVar = mVar.E;
        gVar.getClass();
        o oVarC = gVar.c();
        b1 b1Var2 = mVar.O;
        return oVarC.a(b1Var2 != null ? b1Var2.i() : null);
    }

    public b(okhttp3.f fVar) {
        this.b = fVar;
    }

    public b(y yVar) {
        yVar.getClass();
        this.b = yVar;
    }
}
