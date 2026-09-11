package okhttp3.internal.http;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import com.google.common.base.i;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.j0;
import okhttp3.r;
import okhttp3.t;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {
    public static final b a = new b();

    /* JADX WARN: Code duplicated, block: B:114:0x021e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // okhttp3.t
    public final g0 a(u uVar) throws Throwable {
        IOException iOException;
        f0 f0VarN;
        j0 j0Var;
        int i;
        g0 g0VarA;
        b1 b1Var = (b1) uVar.h;
        b1Var.getClass();
        m mVar = (m) b1Var.y;
        e eVar = (e) b1Var.A;
        b0 b0Var = (b0) uVar.i;
        e0 e0Var = b0Var.d;
        r rVar = b0Var.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        ?? r14 = 1;
        boolean z2 = i.q(b0Var.b) && e0Var != null;
        boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(rVar.b("Connection"));
        f0 f0Var = null;
        try {
            try {
                eVar.b(b0Var);
                if (z2) {
                    try {
                        if ("100-continue".equalsIgnoreCase(rVar.b("Expect"))) {
                            try {
                                eVar.f();
                                f0VarN = b1Var.n(true);
                            } catch (IOException e) {
                                b1Var.r(e);
                                throw e;
                            }
                        } else {
                            f0VarN = null;
                        }
                        if (f0VarN == null) {
                            try {
                                e0Var.getClass();
                                e0 e0Var2 = b0Var.d;
                                e0Var2.getClass();
                                long jA = e0Var2.a();
                                z zVar = new z(new okhttp3.internal.connection.e(b1Var, eVar.j(b0Var, jA), jA, false));
                                e0Var.d(zVar);
                                zVar.close();
                                r14 = "upgrade";
                            } catch (IOException e2) {
                                e = e2;
                                r14 = "upgrade";
                                f0Var = f0VarN;
                                if (e instanceof okhttp3.internal.http2.a) {
                                    throw e;
                                }
                                throw e;
                            }
                        } else {
                            r14 = "upgrade";
                            try {
                                mVar.h(b1Var, true, false, false, false, null);
                                if (!(b1Var.i().j != null)) {
                                    eVar.i().f();
                                }
                            } catch (IOException e3) {
                                e = e3;
                                f0Var = f0VarN;
                                if ((e instanceof okhttp3.internal.http2.a) || !b1Var.e) {
                                    throw e;
                                }
                                iOException = e;
                                f0VarN = f0Var;
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        r14 = "upgrade";
                        if (e instanceof okhttp3.internal.http2.a) {
                            throw e;
                        }
                        throw e;
                    }
                } else {
                    r14 = "upgrade";
                    mVar.h(b1Var, true, false, false, false, null);
                    f0VarN = null;
                }
                try {
                    eVar.a();
                    iOException = null;
                    ?? r15 = r14;
                    if (f0VarN == null) {
                        try {
                            r15 = r14;
                            f0VarN = b1Var.n(false);
                            f0VarN.getClass();
                        } catch (IOException e5) {
                            if (iOException == null) {
                                throw e5;
                            }
                            kotlin.a.a(iOException, e5);
                            throw iOException;
                        }
                    }
                    r15 = r14;
                    f0 f0Var2 = f0VarN;
                    f0Var2.a = b0Var;
                    f0Var2.e = b1Var.i().f;
                    f0Var2.l = jCurrentTimeMillis;
                    f0Var2.m = System.currentTimeMillis();
                    g0 g0VarA2 = f0Var2.a();
                    int i2 = g0VarA2.A;
                    while (true) {
                        j0Var = g0VarA2.D;
                        if (i2 != 100 && (102 > i2 || i2 >= 200)) {
                            break;
                        }
                        f0 f0VarN2 = b1Var.n(false);
                        f0VarN2.getClass();
                        f0VarN2.a = b0Var;
                        f0VarN2.e = b1Var.i().f;
                        f0VarN2.l = jCurrentTimeMillis;
                        f0VarN2.m = System.currentTimeMillis();
                        g0VarA2 = f0VarN2.a();
                        i2 = g0VarA2.A;
                    }
                    boolean z3 = i2 == 101;
                    if (z3) {
                        if (b1Var.i().j != null) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z3 && r15.equalsIgnoreCase(g0.g("Connection", g0VarA2))) {
                        z = true;
                    }
                    if (zEqualsIgnoreCase && z) {
                        f0 f0VarM = g0VarA2.m();
                        f0VarM.g = new okhttp3.internal.c(j0Var.w(), j0Var.m());
                        f0VarM.h = b1Var.s();
                        g0VarA = f0VarM.a();
                        i = i2;
                    } else {
                        try {
                            String strG = g0.g("Content-Type", g0VarA2);
                            long jH = eVar.h(g0VarA2);
                            i = i2;
                            g gVar = new g(strG, jH, new okio.b0(new okhttp3.internal.connection.f(b1Var, eVar.d(g0VarA2), jH, false)));
                            f0 f0VarM2 = g0VarA2.m();
                            f0VarM2.g = gVar;
                            f0VarM2.o = new a();
                            g0VarA = f0VarM2.a();
                        } catch (IOException e6) {
                            b1Var.r(e6);
                            throw e6;
                        }
                    }
                    b0 b0Var2 = g0VarA.e;
                    b0Var2.getClass();
                    if ("close".equalsIgnoreCase(b0Var2.c.b("Connection")) || "close".equalsIgnoreCase(g0.g("Connection", g0VarA))) {
                        eVar.i().f();
                    }
                    if ((i != 204 && i != 205) || g0VarA.D.m() <= 0) {
                        return g0VarA;
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + g0VarA.D.m());
                } catch (IOException e7) {
                    b1Var.r(e7);
                    throw e7;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            b1Var.r(e9);
            throw e9;
        }
    }
}
