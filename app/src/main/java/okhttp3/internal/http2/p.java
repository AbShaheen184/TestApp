package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.f0;
import okhttp3.g0;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements okhttp3.internal.http.e {
    public static final List g = okhttp3.internal.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = okhttp3.internal.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final okhttp3.internal.connection.n a;
    public final androidx.compose.foundation.lazy.grid.u b;
    public final o c;
    public volatile w d;
    public final okhttp3.z e;
    public volatile boolean f;

    public p(okhttp3.y yVar, okhttp3.internal.connection.n nVar, androidx.compose.foundation.lazy.grid.u uVar, o oVar) {
        yVar.getClass();
        oVar.getClass();
        this.a = nVar;
        this.b = uVar;
        this.c = oVar;
        List list = yVar.s;
        okhttp3.z zVar = okhttp3.z.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(zVar) ? zVar : okhttp3.z.HTTP_2;
    }

    @Override // okhttp3.internal.http.e
    public final void a() {
        w wVar = this.d;
        wVar.getClass();
        wVar.F.close();
    }

    @Override // okhttp3.internal.http.e
    public final void b(okhttp3.b0 b0Var) throws IOException {
        int i;
        w wVar;
        boolean z;
        b0Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = b0Var.d != null;
        okhttp3.r rVar = b0Var.c;
        ArrayList arrayList = new ArrayList(rVar.size() + 4);
        arrayList.add(new d(d.f, b0Var.b));
        okio.i iVar = d.g;
        okhttp3.s sVar = b0Var.a;
        sVar.getClass();
        String strB = sVar.b();
        String strD = sVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(iVar, strB));
        String strB2 = rVar.b("Host");
        if (strB2 != null) {
            arrayList.add(new d(d.i, strB2));
        }
        arrayList.add(new d(d.h, sVar.a));
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = rVar.c(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strC.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && rVar.f(i2).equals("trailers"))) {
                arrayList.add(new d(lowerCase, rVar.f(i2)));
            }
        }
        o oVar = this.c;
        oVar.getClass();
        boolean z3 = !z2;
        synchronized (oVar.U) {
            synchronized (oVar) {
                try {
                    if (oVar.B > 1073741823) {
                        oVar.w(b.REFUSED_STREAM);
                    }
                    if (oVar.C) {
                        throw new a();
                    }
                    i = oVar.B;
                    oVar.B = i + 2;
                    wVar = new w(i, oVar, z3, false, null);
                    z = !z2 || oVar.R >= oVar.S || wVar.A >= wVar.B;
                    if (wVar.j()) {
                        oVar.y.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.U.z(z3, i, arrayList);
        }
        if (z) {
            oVar.U.flush();
        }
        this.d = wVar;
        boolean z4 = this.f;
        w wVar2 = this.d;
        if (z4) {
            wVar2.getClass();
            wVar2.g(b.CANCEL);
            net.luminis.tls.engine.impl.c.t("Canceled");
            return;
        }
        wVar2.getClass();
        v vVar = wVar2.G;
        long j = this.b.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar.g(j, timeUnit);
        w wVar3 = this.d;
        wVar3.getClass();
        wVar3.H.g(this.b.e, timeUnit);
    }

    @Override // okhttp3.internal.http.e
    public final boolean c() {
        boolean z;
        w wVar = this.d;
        if (wVar != null) {
            synchronized (wVar) {
                u uVar = wVar.E;
                z = uVar.y && uVar.A.X();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.internal.http.e
    public final void cancel() {
        this.f = true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.g(b.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.e
    public final h0 d(g0 g0Var) {
        w wVar = this.d;
        wVar.getClass();
        return wVar.E;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    @Override // okhttp3.internal.http.e
    public final f0 e(boolean z) throws IOException {
        okhttp3.r rVar;
        boolean z2;
        w wVar = this.d;
        if (wVar == null) {
            net.luminis.tls.engine.impl.c.t("stream wasn't created");
            return null;
        }
        synchronized (wVar) {
            while (true) {
                if (!wVar.C.isEmpty() || wVar.h() != null) {
                    break;
                }
                if (!z) {
                    wVar.y.getClass();
                    t tVar = wVar.F;
                    z2 = tVar.z || tVar.e;
                }
                if (z2) {
                    wVar.G.i();
                }
                try {
                    try {
                        wVar.wait();
                        if (z2) {
                            wVar.G.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        wVar.G.m();
                    }
                    throw th;
                }
            }
            if (wVar.C.isEmpty()) {
                IOException iOException = wVar.J;
                if (iOException != null) {
                    throw iOException;
                }
                b bVarH = wVar.h();
                bVarH.getClass();
                throw new b0(bVarH);
            }
            Object objRemoveFirst = wVar.C.removeFirst();
            objRemoveFirst.getClass();
            rVar = (okhttp3.r) objRemoveFirst;
        }
        okhttp3.z zVar = this.e;
        zVar.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = rVar.size();
        androidx.appcompat.widget.x xVarA = null;
        for (int i = 0; i < size; i++) {
            String strC = rVar.c(i);
            String strF = rVar.f(i);
            if (strC.equals(":status")) {
                xVarA = com.google.android.material.motion.a.A("HTTP/1.1 ".concat(strF));
            } else if (!h.contains(strC)) {
                arrayList.add(strC);
                arrayList.add(kotlin.text.k.A0(strF).toString());
            }
        }
        if (xVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        f0 f0Var = new f0();
        f0Var.b = zVar;
        f0Var.c = xVarA.y;
        f0Var.d = (String) xVarA.A;
        f0Var.f = new okhttp3.r((String[]) arrayList.toArray(new String[0])).d();
        if (z && f0Var.c == 100) {
            return null;
        }
        return f0Var;
    }

    @Override // okhttp3.internal.http.e
    public final void f() {
        this.c.flush();
    }

    @Override // okhttp3.internal.http.e
    public final okio.g0 g() {
        w wVar = this.d;
        wVar.getClass();
        return wVar;
    }

    @Override // okhttp3.internal.http.e
    public final long h(g0 g0Var) {
        if (okhttp3.internal.http.f.a(g0Var)) {
            return okhttp3.internal.g.e(g0Var);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.e
    public final okhttp3.internal.http.d i() {
        return this.a;
    }

    @Override // okhttp3.internal.http.e
    public final okio.f0 j(okhttp3.b0 b0Var, long j) {
        b0Var.getClass();
        w wVar = this.d;
        wVar.getClass();
        return wVar.F;
    }
}
