package okhttp3.internal.http1;

import androidx.appcompat.widget.x;
import androidx.compose.foundation.gestures.y2;
import com.caverock.androidsvg.m;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.g;
import okhttp3.r;
import okhttp3.s;
import okhttp3.y;
import okio.b0;
import okio.h;
import okio.h0;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements okhttp3.internal.http.e {
    public static final r f;
    public final y a;
    public final okhttp3.internal.http.d b;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c c;
    public int d;
    public final y2 e;

    static {
        r rVar = r.y;
        f = com.google.android.material.resources.b.q("OkHttp-Response-Body", "Truncated");
    }

    public f(y yVar, okhttp3.internal.http.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        cVar.getClass();
        this.a = yVar;
        this.b = dVar;
        this.c = cVar;
        this.e = new y2((b0) cVar.z);
    }

    @Override // okhttp3.internal.http.e
    public final void a() {
        ((z) this.c.A).flush();
    }

    @Override // okhttp3.internal.http.e
    public final void b(okhttp3.b0 b0Var) {
        b0Var.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(b0Var.b);
        sb.append(' ');
        s sVar = b0Var.a;
        if (sVar.f() || type != Proxy.Type.HTTP) {
            String strB = sVar.b();
            String strD = sVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(sVar);
        }
        sb.append(" HTTP/1.1");
        l(b0Var.c, sb.toString());
    }

    @Override // okhttp3.internal.http.e
    public final boolean c() {
        return this.d == 6;
    }

    @Override // okhttp3.internal.http.e
    public final void cancel() {
        this.b.cancel();
    }

    @Override // okhttp3.internal.http.e
    public final h0 d(g0 g0Var) {
        okhttp3.b0 b0Var = g0Var.e;
        if (!okhttp3.internal.http.f.a(g0Var)) {
            return k(b0Var.a, 0L);
        }
        if ("chunked".equalsIgnoreCase(g0.g("Transfer-Encoding", g0Var))) {
            s sVar = b0Var.a;
            if (this.d == 4) {
                this.d = 5;
                return new c(this, sVar);
            }
            net.luminis.tls.engine.impl.c.b(this.d, "state: ");
            return null;
        }
        long jE = g.e(g0Var);
        if (jE != -1) {
            return k(b0Var.a, jE);
        }
        s sVar2 = b0Var.a;
        if (this.d != 4) {
            net.luminis.tls.engine.impl.c.b(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.f();
        sVar2.getClass();
        return new e(this, sVar2);
    }

    @Override // okhttp3.internal.http.e
    public final f0 e(boolean z) throws IOException {
        y2 y2Var = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            net.luminis.tls.engine.impl.c.b(this.d, "state: ");
            return null;
        }
        try {
            String strS = ((h) y2Var.z).s(y2Var.y);
            y2Var.y -= (long) strS.length();
            x xVarA = com.google.android.material.motion.a.A(strS);
            int i2 = xVarA.y;
            f0 f0Var = new f0();
            f0Var.b = (okhttp3.z) xVarA.z;
            f0Var.c = i2;
            f0Var.d = (String) xVarA.A;
            m mVar = new m(1);
            while (true) {
                String strS2 = ((h) y2Var.z).s(y2Var.y);
                y2Var.y -= (long) strS2.length();
                if (strS2.length() == 0) {
                    break;
                }
                mVar.d(strS2);
            }
            f0Var.f = mVar.f().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return f0Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return f0Var;
            }
            this.d = 3;
            return f0Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.h()), e);
        }
    }

    @Override // okhttp3.internal.http.e
    public final void f() {
        ((z) this.c.A).flush();
    }

    @Override // okhttp3.internal.http.e
    public final okio.g0 g() {
        return this.c;
    }

    @Override // okhttp3.internal.http.e
    public final long h(g0 g0Var) {
        if (!okhttp3.internal.http.f.a(g0Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(g0.g("Transfer-Encoding", g0Var))) {
            return -1L;
        }
        return g.e(g0Var);
    }

    @Override // okhttp3.internal.http.e
    public final okhttp3.internal.http.d i() {
        return this.b;
    }

    @Override // okhttp3.internal.http.e
    public final okio.f0 j(okhttp3.b0 b0Var, long j) {
        b0Var.getClass();
        if ("chunked".equalsIgnoreCase(b0Var.c.b("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new b(this);
            }
            net.luminis.tls.engine.impl.c.b(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            net.luminis.tls.engine.impl.c.r("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new coil3.disk.e(this);
        }
        net.luminis.tls.engine.impl.c.b(this.d, "state: ");
        return null;
    }

    public final d k(s sVar, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new d(this, sVar, j);
        }
        net.luminis.tls.engine.impl.c.b(this.d, "state: ");
        return null;
    }

    public final void l(r rVar, String str) {
        rVar.getClass();
        if (this.d != 0) {
            net.luminis.tls.engine.impl.c.b(this.d, "state: ");
            return;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = this.c;
        z zVar = (z) cVar.A;
        zVar.x(str);
        zVar.x("\r\n");
        int size = rVar.size();
        int i = 0;
        while (true) {
            z zVar2 = (z) cVar.A;
            if (i >= size) {
                zVar2.x("\r\n");
                this.d = 1;
                return;
            } else {
                zVar2.x(rVar.c(i));
                zVar2.x(": ");
                zVar2.x(rVar.f(i));
                zVar2.x("\r\n");
                i++;
            }
        }
    }
}
