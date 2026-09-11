package okhttp3.internal.connection;

import androidx.compose.foundation.gestures.w0;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.u;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.j0;
import okhttp3.k0;
import okhttp3.m0;
import okhttp3.s;
import okhttp3.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final okhttp3.internal.concurrent.d a;
    public final androidx.compose.ui.graphics.vector.a b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final okhttp3.a j;
    public final com.google.android.material.internal.b k;
    public final m l;
    public final boolean m;
    public w0 n;
    public coil3.intercept.i o;
    public k0 p;
    public final kotlin.collections.k q;

    public o(okhttp3.internal.concurrent.d dVar, androidx.compose.ui.graphics.vector.a aVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, okhttp3.a aVar2, com.google.android.material.internal.b bVar, m mVar, b0 b0Var) {
        dVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = dVar;
        this.b = aVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = aVar2;
        this.k = bVar;
        this.l = mVar;
        this.m = !kotlin.jvm.internal.l.a(b0Var.b, "GET");
        this.q = new kotlin.collections.k();
    }

    public final boolean a(n nVar) {
        coil3.intercept.i iVar;
        k0 k0Var;
        if (this.q.isEmpty() && this.p == null) {
            if (nVar != null) {
                synchronized (nVar) {
                    k0Var = null;
                    if (nVar.m == 0 && nVar.k && okhttp3.internal.g.a(nVar.c.a.h, this.j.h)) {
                        k0Var = nVar.c;
                    }
                }
                if (k0Var != null) {
                    this.p = k0Var;
                    return true;
                }
            }
            w0 w0Var = this.n;
            if ((w0Var == null || w0Var.a >= w0Var.b.size()) && (iVar = this.o) != null) {
                return iVar.b();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, java.util.List] */
    public final r b() {
        Socket socketJ;
        p pVar;
        c cVarC;
        String hostAddress;
        int port;
        List listC;
        boolean zContains;
        List listK;
        n nVar = this.l.F;
        if (nVar == null) {
            pVar = null;
        } else {
            boolean zG = nVar.g(this.m);
            synchronized (nVar) {
                boolean z = nVar.k;
                try {
                    if (!zG) {
                        nVar.k = true;
                        socketJ = this.l.j();
                    } else if (!z) {
                        s sVar = nVar.c.a.h;
                        sVar.getClass();
                        s sVar2 = this.j.h;
                        socketJ = !(sVar.e == sVar2.e && kotlin.jvm.internal.l.a(sVar.d, sVar2.d)) ? this.l.j() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l.F == null) {
                if (socketJ != null) {
                    okhttp3.internal.g.c(socketJ);
                }
                pVar = null;
            } else {
                if (socketJ != null) {
                    net.luminis.tls.engine.impl.c.r("Check failed.");
                    return null;
                }
                pVar = new p(nVar);
            }
        }
        if (pVar != null) {
            return pVar;
        }
        p pVarD = d(null, null);
        if (pVarD != null) {
            return pVarD;
        }
        if (!this.q.isEmpty()) {
            return (r) this.q.removeFirst();
        }
        k0 k0Var = this.p;
        if (k0Var != null) {
            this.p = null;
            cVarC = c(k0Var, null);
        } else {
            w0 w0Var = this.n;
            if (w0Var == null || w0Var.a >= w0Var.b.size()) {
                coil3.intercept.i iVar = this.o;
                if (iVar == null) {
                    okhttp3.a aVar = this.j;
                    com.google.android.material.internal.b bVar = this.k;
                    boolean z2 = this.i;
                    bVar.getClass();
                    iVar = new coil3.intercept.i();
                    iVar.d = aVar;
                    iVar.e = bVar;
                    iVar.a = z2;
                    u uVar = u.e;
                    iVar.b = uVar;
                    iVar.f = uVar;
                    iVar.g = new ArrayList();
                    s sVar3 = aVar.h;
                    sVar3.getClass();
                    URI uriI = sVar3.i();
                    if (uriI.getHost() == null) {
                        listK = okhttp3.internal.g.k(new Proxy[]{Proxy.NO_PROXY});
                    } else {
                        List<Proxy> listSelect = aVar.g.select(uriI);
                        listK = (listSelect == null || listSelect.isEmpty()) ? okhttp3.internal.g.k(new Proxy[]{Proxy.NO_PROXY}) : okhttp3.internal.g.j(listSelect);
                    }
                    iVar.b = listK;
                    iVar.c = 0;
                    this.o = iVar;
                }
                if (!iVar.b()) {
                    net.luminis.tls.engine.impl.c.t("exhausted all routes");
                    return null;
                }
                if (!iVar.b()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (iVar.c < ((List) iVar.b).size()) {
                    okhttp3.a aVar2 = (okhttp3.a) iVar.d;
                    if (iVar.c >= ((List) iVar.b).size()) {
                        throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) iVar.b));
                    }
                    List list = (List) iVar.b;
                    int i = iVar.c;
                    iVar.c = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    iVar.f = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        s sVar4 = aVar2.h;
                        hostAddress = sVar4.d;
                        port = sVar4.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            net.luminis.tls.engine.impl.c.n(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        kotlin.text.i iVar2 = okhttp3.internal.d.a;
                        hostAddress.getClass();
                        if (okhttp3.internal.d.a.e(hostAddress)) {
                            listC = com.google.common.base.c.p(InetAddress.getByName(hostAddress));
                        } else {
                            List listF = aVar2.a.f(hostAddress);
                            if (listF.isEmpty()) {
                                throw new UnknownHostException(aVar2.a + " returned no addresses for " + hostAddress);
                            }
                            listC = listF;
                        }
                        if (iVar.a && listC.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listC) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = okhttp3.internal.e.a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        bVarH.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        bVarH.add(it2.next());
                                    }
                                }
                                listC = com.google.common.base.c.c(bVarH);
                            }
                        }
                        Iterator it3 = listC.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = iVar.f.iterator();
                    while (it4.hasNext()) {
                        k0 k0Var2 = new k0((okhttp3.a) iVar.d, proxy, (InetSocketAddress) it4.next());
                        com.google.android.material.internal.b bVar2 = (com.google.android.material.internal.b) iVar.e;
                        synchronized (bVar2) {
                            zContains = ((LinkedHashSet) bVar2.e).contains(k0Var2);
                        }
                        if (zContains) {
                            ((ArrayList) iVar.g).add(k0Var2);
                        } else {
                            arrayList.add(k0Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    kotlin.collections.o.C(arrayList, (ArrayList) iVar.g);
                    ((ArrayList) iVar.g).clear();
                }
                w0 w0Var2 = new w0();
                w0Var2.b = arrayList;
                this.n = w0Var2;
                if (this.l.N) {
                    net.luminis.tls.engine.impl.c.t("Canceled");
                    return null;
                }
                if (w0Var2.a >= arrayList.size()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                int i2 = w0Var2.a;
                w0Var2.a = i2 + 1;
                cVarC = c((k0) arrayList.get(i2), arrayList);
            } else {
                int i3 = w0Var.a;
                ArrayList arrayList5 = w0Var.b;
                if (i3 >= arrayList5.size()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                int i4 = w0Var.a;
                w0Var.a = i4 + 1;
                cVarC = c((k0) arrayList5.get(i4), null);
            }
        }
        p pVarD2 = d(cVarC, cVarC.l);
        return pVarD2 != null ? pVarD2 : cVarC;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    public final c c(k0 k0Var, ArrayList arrayList) throws UnknownServiceException {
        b0 b0Var;
        z zVar = z.H2_PRIOR_KNOWLEDGE;
        k0Var.getClass();
        okhttp3.a aVar = k0Var.a;
        if (aVar.c == null) {
            if (!aVar.j.contains(okhttp3.l.g)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = k0Var.a.h.d;
            okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
            if (!okhttp3.internal.platform.e.a.h(str)) {
                throw new UnknownServiceException(androidx.privacysandbox.ads.adservices.java.internal.a.q("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(zVar)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (k0Var.b.type() != Proxy.Type.HTTP) {
            b0Var = null;
        } else {
            okhttp3.a aVar2 = k0Var.a;
            if (aVar2.c != null || aVar2.i.contains(zVar)) {
                a0 a0Var = new a0();
                s sVar = k0Var.a.h;
                sVar.getClass();
                a0Var.a = sVar;
                a0Var.c("CONNECT", null);
                okhttp3.a aVar3 = k0Var.a;
                a0Var.b("Host", okhttp3.internal.g.i(aVar3.h, true));
                a0Var.b("Proxy-Connection", "Keep-Alive");
                a0Var.b("User-Agent", "okhttp/5.3.2");
                b0Var = new b0(a0Var);
                i0 i0Var = j0.y;
                okhttp3.b bVar = m0.w;
                com.caverock.androidsvg.m mVar = new com.caverock.androidsvg.m(1);
                z zVar2 = z.HTTP_1_1;
                com.google.android.material.textfield.p.n("Proxy-Authenticate");
                com.google.android.material.textfield.p.o("OkHttp-Preemptive", "Proxy-Authenticate");
                mVar.h("Proxy-Authenticate");
                com.google.android.material.textfield.p.f(mVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                new g0(b0Var, zVar2, "Preemptive Authenticate", 407, null, mVar.f(), i0Var, null, null, null, null, -1L, -1L, null, bVar);
                aVar3.f.getClass();
            } else {
                b0Var = null;
            }
        }
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, k0Var, arrayList, b0Var, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    public final p d(c cVar, List list) {
        n nVar;
        boolean z;
        Socket socketJ;
        androidx.compose.ui.graphics.vector.a aVar = this.b;
        boolean z2 = this.m;
        okhttp3.a aVar2 = this.j;
        m mVar = this.l;
        boolean z3 = cVar != null && cVar.a();
        aVar.getClass();
        Iterator it = ((ConcurrentLinkedQueue) aVar.e).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                nVar = null;
                break;
            }
            nVar = (n) it.next();
            nVar.getClass();
            synchronized (nVar) {
                if (z3) {
                    try {
                        if (!(nVar.j != null)) {
                            z = false;
                        } else if (nVar.e(aVar2, list)) {
                            mVar.b(nVar);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (nVar.e(aVar2, list)) {
                    z = false;
                } else {
                    mVar.b(nVar);
                    z = true;
                }
            }
            if (z) {
                if (nVar.g(z2)) {
                    break;
                }
                synchronized (nVar) {
                    nVar.k = true;
                    socketJ = mVar.j();
                }
                if (socketJ != null) {
                    okhttp3.internal.g.c(socketJ);
                }
            }
        }
        if (nVar == null) {
            return null;
        }
        if (cVar != null) {
            this.p = cVar.k;
            Socket socket = cVar.r;
            if (socket != null) {
                okhttp3.internal.g.c(socket);
            }
        }
        return new p(nVar);
    }
}
