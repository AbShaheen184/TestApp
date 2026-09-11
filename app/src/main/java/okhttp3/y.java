package okhttp3;

import com.appsalt.internal.n4;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final List G = okhttp3.internal.g.k(new z[]{z.HTTP_2, z.HTTP_1_1});
    public static final List H = okhttp3.internal.g.k(new l[]{l.e, l.g});
    public final int A;
    public final int B;
    public final long C;
    public final com.google.android.material.internal.b D;
    public final okhttp3.internal.concurrent.d E;
    public final com.google.android.material.internal.b F;
    public final com.google.firebase.messaging.o a;
    public final List b;
    public final List c;
    public final net.luminis.tls.engine.impl.c d;
    public final boolean e;
    public final boolean f;
    public final b g;
    public final boolean h;
    public final boolean i;
    public final n j;
    public final f k;
    public final o l;
    public final ProxySelector m;
    public final b n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final okhttp3.internal.tls.c t;
    public final i u;
    public final com.google.android.material.resources.b v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public y(x xVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = xVar.a;
        this.b = okhttp3.internal.g.j(xVar.c);
        this.c = okhttp3.internal.g.j(xVar.d);
        this.d = xVar.e;
        this.e = xVar.f;
        this.f = xVar.g;
        this.g = xVar.h;
        this.h = xVar.i;
        this.i = xVar.j;
        this.j = xVar.k;
        this.k = xVar.l;
        this.l = xVar.m;
        ProxySelector proxySelector = xVar.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = okhttp3.internal.proxy.a.a;
        }
        this.m = proxySelector;
        this.n = xVar.o;
        this.o = xVar.p;
        List list = xVar.s;
        this.r = list;
        this.s = xVar.t;
        this.t = xVar.u;
        this.w = xVar.x;
        this.x = xVar.y;
        this.y = xVar.z;
        this.z = xVar.A;
        this.A = xVar.B;
        this.B = xVar.C;
        this.C = xVar.D;
        com.google.android.material.internal.b bVar = xVar.E;
        this.D = bVar == null ? new com.google.android.material.internal.b(13, false) : bVar;
        okhttp3.internal.concurrent.d dVar = xVar.F;
        this.E = dVar == null ? okhttp3.internal.concurrent.d.l : dVar;
        com.google.android.material.internal.b bVar2 = xVar.b;
        if (bVar2 == null) {
            bVar2 = new com.google.android.material.internal.b(5);
            xVar.b = bVar2;
        }
        this.F = bVar2;
        if (list != null && list.isEmpty()) {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = i.c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.p = null;
                this.v = null;
                this.q = null;
                this.u = i.c;
                break;
            }
            if (((l) it.next()).a) {
                SSLSocketFactory sSLSocketFactory = xVar.q;
                if (sSLSocketFactory != null) {
                    this.p = sSLSocketFactory;
                    com.google.android.material.resources.b bVar3 = xVar.w;
                    bVar3.getClass();
                    this.v = bVar3;
                    X509TrustManager x509TrustManager = xVar.r;
                    x509TrustManager.getClass();
                    this.q = x509TrustManager;
                    i iVar = xVar.v;
                    iVar.getClass();
                    this.u = kotlin.jvm.internal.l.a(iVar.b, bVar3) ? iVar : new i(iVar.a, bVar3);
                    break;
                }
                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                okhttp3.internal.platform.e.a.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                trustManagers.getClass();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                        this.q = x509TrustManager2;
                        okhttp3.internal.platform.e eVar2 = okhttp3.internal.platform.e.a;
                        eVar2.getClass();
                        try {
                            SSLContext sSLContextK = eVar2.k();
                            sSLContextK.init(null, new TrustManager[]{x509TrustManager2}, null);
                            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
                            socketFactory.getClass();
                            this.p = socketFactory;
                            com.google.android.material.resources.b bVarC = okhttp3.internal.platform.e.a.c(x509TrustManager2);
                            this.v = bVarC;
                            i iVar2 = xVar.v;
                            iVar2.getClass();
                            this.u = kotlin.jvm.internal.l.a(iVar2.b, bVarC) ? iVar2 : new i(iVar2.a, bVarC);
                            break;
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS: " + e, e);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                string.getClass();
                net.luminis.tls.engine.impl.c.c("Unexpected default trust managers: ".concat(string));
                throw null;
            }
        }
        X509TrustManager x509TrustManager3 = this.q;
        com.google.android.material.resources.b bVar4 = this.v;
        SSLSocketFactory sSLSocketFactory2 = this.p;
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            net.luminis.tls.engine.impl.c.e(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            net.luminis.tls.engine.impl.c.e(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((l) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        net.luminis.tls.engine.impl.c.r("sslSocketFactory == null");
                        throw null;
                    }
                    if (bVar4 == null) {
                        net.luminis.tls.engine.impl.c.r("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    net.luminis.tls.engine.impl.c.r("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            throw null;
        }
        if (bVar4 != null) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            throw null;
        }
        if (kotlin.jvm.internal.l.a(this.u, i.c)) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Check failed.");
        throw null;
    }

    public final x a() {
        x xVar = new x();
        xVar.a = this.a;
        xVar.b = this.F;
        kotlin.collections.o.C(xVar.c, this.b);
        kotlin.collections.o.C(xVar.d, this.c);
        xVar.e = this.d;
        xVar.f = this.e;
        xVar.g = this.f;
        xVar.h = this.g;
        xVar.i = this.h;
        xVar.j = this.i;
        xVar.k = this.j;
        xVar.l = this.k;
        xVar.m = this.l;
        xVar.n = this.m;
        xVar.o = this.n;
        xVar.p = this.o;
        xVar.q = this.p;
        xVar.r = this.q;
        xVar.s = this.r;
        xVar.t = this.s;
        xVar.u = this.t;
        xVar.v = this.u;
        xVar.w = this.v;
        xVar.x = this.w;
        xVar.y = this.x;
        xVar.z = this.y;
        xVar.A = this.z;
        xVar.B = this.A;
        xVar.C = this.B;
        xVar.D = this.C;
        xVar.E = this.D;
        xVar.F = this.E;
        return xVar;
    }

    public final okhttp3.internal.ws.e b(b0 b0Var, n4 n4Var) {
        okhttp3.internal.ws.e eVar = new okhttp3.internal.ws.e(this.E, b0Var, n4Var, new Random(), this.A, this.C, this.B);
        if (b0Var.c.b("Sec-WebSocket-Extensions") != null) {
            okhttp3.internal.ws.e.c(eVar, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), 6);
            return eVar;
        }
        x xVarA = a();
        TimeZone timeZone = okhttp3.internal.g.a;
        xVarA.e = new net.luminis.tls.engine.impl.c(11);
        xVarA.b(okhttp3.internal.ws.e.x);
        y yVar = new y(xVarA);
        a0 a0VarA = b0Var.a();
        a0VarA.b("Upgrade", "websocket");
        a0VarA.b("Connection", "Upgrade");
        a0VarA.b("Sec-WebSocket-Key", eVar.g);
        a0VarA.b("Sec-WebSocket-Version", "13");
        a0VarA.b("Sec-WebSocket-Extensions", "permessage-deflate");
        b0 b0Var2 = new b0(a0VarA);
        okhttp3.internal.connection.m mVar = new okhttp3.internal.connection.m(yVar, b0Var2, true);
        eVar.h = mVar;
        mVar.d(new com.google.common.util.concurrent.g0(18, eVar, b0Var2, false));
        return eVar;
    }

    public y() {
        this(new x());
    }
}
