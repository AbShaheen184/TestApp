package okhttp3.internal.connection;

import com.google.android.gms.measurement.internal.e0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.b0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.k0;
import okhttp3.s;
import okhttp3.z;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r, okhttp3.internal.http.d {
    public final okhttp3.internal.concurrent.d a;
    public final androidx.compose.ui.graphics.vector.a b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final m i;
    public final o j;
    public final k0 k;
    public final List l;
    public final b0 m;
    public final int n;
    public final boolean o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public okhttp3.q s;
    public z t;
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.c u;
    public n v;

    public c(okhttp3.internal.concurrent.d dVar, androidx.compose.ui.graphics.vector.a aVar, int i, int i2, int i3, int i4, int i5, boolean z, m mVar, o oVar, k0 k0Var, List list, b0 b0Var, int i6, boolean z2) {
        dVar.getClass();
        aVar.getClass();
        k0Var.getClass();
        this.a = dVar;
        this.b = aVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = mVar;
        this.j = oVar;
        this.k = k0Var;
        this.l = list;
        this.m = b0Var;
        this.n = i6;
        this.o = z2;
    }

    @Override // okhttp3.internal.connection.r
    public final boolean a() {
        return this.t != null;
    }

    @Override // okhttp3.internal.connection.r
    public final r b() {
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // okhttp3.internal.connection.r, okhttp3.internal.http.d
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            okhttp3.internal.g.c(socket);
        }
    }

    @Override // okhttp3.internal.connection.r
    public final n d() {
        com.google.android.material.internal.b bVar = this.i.e.D;
        k0 k0Var = this.k;
        synchronized (bVar) {
            k0Var.getClass();
            ((LinkedHashSet) bVar.e).remove(k0Var);
        }
        n nVar = this.v;
        nVar.getClass();
        this.k.getClass();
        p pVarD = this.j.d(this, this.l);
        if (pVarD != null) {
            return pVarD.a;
        }
        synchronized (nVar) {
            androidx.compose.ui.graphics.vector.a aVar = this.b;
            aVar.getClass();
            TimeZone timeZone = okhttp3.internal.g.a;
            ((ConcurrentLinkedQueue) aVar.e).add(nVar);
            ((okhttp3.internal.concurrent.c) aVar.c).d((okhttp3.internal.cache.f) aVar.d, 0L);
            this.i.b(nVar);
        }
        return nVar;
    }

    @Override // okhttp3.internal.connection.r
    public final q e() {
        Socket socket;
        Socket socket2;
        androidx.compose.ui.graphics.vector.a aVar = this.b;
        k0 k0Var = this.k;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i.P;
        if (this.q != null) {
            net.luminis.tls.engine.impl.c.r("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                k0Var.c.getClass();
                aVar.getClass();
                i();
                z = true;
                q qVar = new q(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return qVar;
            } catch (IOException e) {
                okhttp3.a aVar2 = k0Var.a;
                if (k0Var.b.type() != Proxy.Type.DIRECT) {
                    okhttp3.a aVar3 = k0Var.a;
                    aVar3.g.connectFailed(aVar3.h.i(), k0Var.b.address(), e);
                }
                k0Var.c.getClass();
                aVar.getClass();
                q qVar2 = new q(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.q) != null) {
                    okhttp3.internal.g.c(socket2);
                }
                return qVar2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.q) != null) {
                okhttp3.internal.g.c(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    @Override // okhttp3.internal.connection.r
    public final q g() throws Throwable {
        c cVar;
        boolean z;
        boolean z2;
        Socket socket;
        c cVar2;
        androidx.compose.ui.graphics.vector.a aVar = this.b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i.P;
        Socket socket2 = this.q;
        if (socket2 == null) {
            net.luminis.tls.engine.impl.c.o("TCP not connected");
            return null;
        }
        if (a()) {
            net.luminis.tls.engine.impl.c.r("already connected");
            return null;
        }
        k0 k0Var = this.k;
        okhttp3.a aVar2 = k0Var.a;
        InetSocketAddress inetSocketAddress = k0Var.c;
        okhttp3.a aVar3 = k0Var.a;
        List list = aVar2.j;
        copyOnWriteArrayList.add(this);
        c cVar3 = null;
        try {
            try {
                if (this.m != null) {
                    q qVarK = k();
                    if (qVarK.c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket3 = this.r;
                        if (socket3 != null) {
                            okhttp3.internal.g.c(socket3);
                        }
                        okhttp3.internal.g.c(socket2);
                        return qVarK;
                    }
                }
                if (aVar3.c != null) {
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar4 = this.u;
                    if (cVar4 == null) {
                        kotlin.jvm.internal.l.f("socket");
                        throw null;
                    }
                    if (((okio.b0) cVar4.z).y.X()) {
                        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar5 = this.u;
                        if (cVar5 == null) {
                            kotlin.jvm.internal.l.f("socket");
                            throw null;
                        }
                        if (((okio.z) cVar5.A).y.X()) {
                            SSLSocketFactory sSLSocketFactory = aVar3.c;
                            s sVar = aVar3.h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, sVar.d, sVar.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            c cVarM = m(list, sSLSocket);
                            okhttp3.l lVar = (okhttp3.l) list.get(cVarM.n);
                            c cVarL = cVarM.l(list, sSLSocket);
                            try {
                                lVar.a(sSLSocket, cVarM.o);
                                j(sSLSocket, lVar);
                                cVar2 = cVarL;
                            } catch (IOException e) {
                                e = e;
                                cVar = null;
                                z2 = false;
                                cVar3 = cVarL;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket2;
                List list2 = aVar3.i;
                z zVar = z.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(zVar)) {
                    zVar = z.HTTP_1_1;
                }
                this.t = zVar;
                cVar2 = null;
                try {
                    try {
                        okhttp3.internal.concurrent.d dVar = this.a;
                        try {
                            androidx.compose.ui.graphics.vector.a aVar4 = this.b;
                            k0 k0Var2 = this.k;
                            Socket socket4 = this.r;
                            socket4.getClass();
                            try {
                                okhttp3.q qVar = this.s;
                                z zVar2 = this.t;
                                zVar2.getClass();
                                try {
                                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar6 = this.u;
                                    try {
                                        if (cVar6 == null) {
                                            kotlin.jvm.internal.l.f("socket");
                                            throw null;
                                        }
                                        int i = this.g;
                                        aVar.getClass();
                                        cVar = null;
                                        n nVar = new n(dVar, aVar4, k0Var2, socket2, socket4, qVar, zVar2, cVar6, i);
                                        this.v = nVar;
                                        nVar.i();
                                        inetSocketAddress.getClass();
                                        try {
                                            q qVar2 = new q(this, (Throwable) null, 6);
                                            copyOnWriteArrayList.remove(this);
                                            return qVar2;
                                        } catch (IOException e2) {
                                            e = e2;
                                            cVar3 = cVar2;
                                            z2 = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = true;
                                            copyOnWriteArrayList.remove(this);
                                            if (!z) {
                                                socket = this.r;
                                                if (socket != null) {
                                                    okhttp3.internal.g.c(socket);
                                                }
                                                okhttp3.internal.g.c(socket2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        cVar3 = cVar2;
                                        z2 = false;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    cVar = null;
                                }
                            } catch (IOException e5) {
                                e = e5;
                                cVar = null;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            cVar = null;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        cVar = null;
                    }
                } catch (IOException e8) {
                    e = e8;
                    cVar = null;
                }
                cVar3 = cVar2;
            } catch (IOException e9) {
                e = e9;
                cVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        z2 = false;
        try {
            inetSocketAddress.getClass();
            aVar.getClass();
            if (!this.h || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
                cVar3 = cVar;
            }
            q qVar3 = new q(this, cVar3, e);
            copyOnWriteArrayList.remove(this);
            if (!z2) {
                Socket socket5 = this.r;
                if (socket5 != null) {
                    okhttp3.internal.g.c(socket5);
                }
                okhttp3.internal.g.c(socket2);
            }
            return qVar3;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            copyOnWriteArrayList.remove(this);
            if (!z) {
                socket = this.r;
                if (socket != null) {
                    okhttp3.internal.g.c(socket);
                }
                okhttp3.internal.g.c(socket2);
            }
            throw th;
        }
    }

    @Override // okhttp3.internal.http.d
    public final k0 h() {
        return this.k;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.k.b.type();
        int i = type == null ? -1 : b.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.k.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.k.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            net.luminis.tls.engine.impl.c.t("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
            okhttp3.internal.platform.e.a.e(socketCreateSocket, this.k.c, this.e);
            try {
                this.u = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(new com.google.firebase.messaging.o(socketCreateSocket));
            } catch (NullPointerException e) {
                if (kotlin.jvm.internal.l.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, okhttp3.l lVar) {
        z zVarI;
        okhttp3.a aVar = this.k.a;
        try {
            if (lVar.b) {
                okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
                okhttp3.internal.platform.e.a.d(sSLSocket, aVar.h.d, aVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            okhttp3.q qVarU = com.google.android.material.motion.a.u(session);
            HostnameVerifier hostnameVerifier = aVar.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(aVar.h.d, session)) {
                okhttp3.i iVar = aVar.e;
                iVar.getClass();
                this.s = new okhttp3.q(qVarU.a, qVarU.b, qVarU.c, new androidx.compose.foundation.gestures.g(19, iVar, qVarU, aVar));
                aVar.h.d.getClass();
                Iterator it = iVar.a.iterator();
                String strF = null;
                if (it.hasNext()) {
                    androidx.privacysandbox.ads.adservices.java.internal.a.C(it.next());
                    throw null;
                }
                if (lVar.b) {
                    okhttp3.internal.platform.e eVar2 = okhttp3.internal.platform.e.a;
                    strF = okhttp3.internal.platform.e.a.f(sSLSocket);
                }
                this.r = sSLSocket;
                this.u = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(new com.google.firebase.messaging.o(sSLSocket));
                if (strF != null) {
                    z.y.getClass();
                    zVarI = okhttp3.b.i(strF);
                } else {
                    zVarI = z.HTTP_1_1;
                }
                this.t = zVarI;
                okhttp3.internal.platform.e eVar3 = okhttp3.internal.platform.e.a;
                okhttp3.internal.platform.e.a.getClass();
                return;
            }
            List listA = qVarU.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(aVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            okhttp3.i iVar2 = okhttp3.i.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            okio.i iVar3 = okio.i.A;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(e0.i(encoded).e("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(kotlin.collections.o.X(okhttp3.internal.tls.c.a(x509Certificate, 7), okhttp3.internal.tls.c.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(kotlin.text.l.E(sb.toString()));
        } catch (Throwable th) {
            okhttp3.internal.platform.e eVar4 = okhttp3.internal.platform.e.a;
            okhttp3.internal.platform.e.a.getClass();
            okhttp3.internal.g.c(sSLSocket);
            throw th;
        }
    }

    public final q k() throws IOException {
        b0 b0Var = this.m;
        b0Var.getClass();
        k0 k0Var = this.k;
        String str = "CONNECT " + okhttp3.internal.g.i(k0Var.a.h, true) + " HTTP/1.1";
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = this.u;
        if (cVar == null) {
            kotlin.jvm.internal.l.f("socket");
            throw null;
        }
        okhttp3.internal.http1.f fVar = new okhttp3.internal.http1.f(null, this, cVar);
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = this.u;
        if (cVar2 == null) {
            kotlin.jvm.internal.l.f("socket");
            throw null;
        }
        j0 j0VarE = ((okio.b0) cVar2.z).e.e();
        long j = this.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0VarE.g(j, timeUnit);
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar3 = this.u;
        if (cVar3 == null) {
            kotlin.jvm.internal.l.f("socket");
            throw null;
        }
        ((okio.z) cVar3.A).e.e().g(this.d, timeUnit);
        fVar.l(b0Var.c, str);
        fVar.a();
        f0 f0VarE = fVar.e(false);
        f0VarE.getClass();
        f0VarE.a = b0Var;
        g0 g0VarA = f0VarE.a();
        int i = g0VarA.A;
        long jE = okhttp3.internal.g.e(g0VarA);
        if (jE != -1) {
            okhttp3.internal.http1.d dVarK = fVar.k(g0VarA.e.a, jE);
            okhttp3.internal.g.g(dVarK, Integer.MAX_VALUE);
            dVarK.close();
        }
        if (i == 200) {
            return new q(this, (Throwable) null, 6);
        }
        if (i != 407) {
            net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        k0Var.a.f.getClass();
        net.luminis.tls.engine.impl.c.t("Failed to authenticate with proxy");
        return null;
    }

    public final c l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            okhttp3.l lVar = (okhttp3.l) list.get(i2);
            lVar.getClass();
            if (lVar.a && (((strArr = lVar.d) == null || okhttp3.internal.e.h(strArr, sSLSocket.getEnabledProtocols(), kotlin.comparisons.a.y)) && ((strArr2 = lVar.c) == null || okhttp3.internal.e.h(strArr2, sSLSocket.getEnabledCipherSuites(), okhttp3.k.c)))) {
                return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, i2, i != -1);
            }
        }
        return null;
    }

    public final c m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.n != -1) {
            return this;
        }
        c cVarL = l(list, sSLSocket);
        if (cVarL != null) {
            return cVarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.http.d
    public final void f() {
    }

    @Override // okhttp3.internal.http.d
    public final void c(m mVar, IOException iOException) {
    }
}
