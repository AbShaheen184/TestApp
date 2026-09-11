package net.luminis.quic.impl;

import com.appsalt.internal.x0;
import com.google.android.material.shape.c0;
import com.google.common.util.concurrent.g0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements net.luminis.quic.packet.e {
    public final net.luminis.quic.crypto.d B;
    public d F;
    public net.luminis.quic.recovery.g I;
    public volatile net.luminis.quic.stream.b K;
    public volatile int L;
    public final net.luminis.quic.util.a M;
    public final ScheduledExecutorService N;
    public final String O;
    public final int P;
    public final net.luminis.tls.engine.impl.a Q;
    public final DatagramSocket R;
    public final InetAddress S;
    public final net.luminis.quic.send.k T;
    public final net.luminis.quic.receive.b U;
    public volatile net.luminis.quic.packet.a V;
    public final net.luminis.quic.stream.n W;
    public volatile m X;
    public final net.luminis.quic.cid.b Y;
    public final n Z;
    public final long a0;
    public final a b0;
    public volatile byte[] c0;
    public final CountDownLatch d0;
    public final o e;
    public volatile m e0;
    public androidx.compose.foundation.lazy.grid.l f0;
    public final String g0;
    public final List h0;
    public boolean i0;
    public final List j0;
    public final c0 k0;
    public volatile Thread l0;
    public volatile String m0;
    public volatile net.luminis.tls.handshake.d n0;
    public volatile boolean o0;
    public volatile int p0;
    public final int y;
    public final net.luminis.quic.log.a z;
    public int A = 1;
    public volatile int C = 1;
    public final Object D = new Object();
    public final CopyOnWriteArrayList E = new CopyOnWriteArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public volatile int J = 3;

    public i(InetAddress inetAddress, String str, int i, String str2, long j, a aVar, n nVar, net.luminis.quic.log.a aVar2, List list) {
        long[] jArr = new long[androidx.constraintlayout.core.g.f(3).length];
        o oVar = new o(nVar);
        this.e = oVar;
        this.y = 1;
        this.z = aVar2;
        new k(new k(this, new k(this, this, this.z), 2));
        this.B = new net.luminis.quic.crypto.d(oVar, aVar2);
        this.L = 1;
        net.luminis.quic.util.a aVar3 = new net.luminis.quic.util.a();
        aVar3.a = 1;
        aVar3.b = 0;
        this.M = aVar3;
        this.N = Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.a("scheduler", 1));
        this.d0 = new CountDownLatch(1);
        this.h0 = Collections.synchronizedList(new ArrayList());
        this.p0 = 1;
        this.o0 = false;
        this.g0 = str2;
        this.a0 = j;
        this.b0 = aVar;
        nVar.toString();
        aVar2.getClass();
        this.Z = nVar;
        this.O = str;
        this.P = i;
        inetAddress = inetAddress == null ? InetAddress.getByName(str) : inetAddress;
        this.S = inetAddress;
        this.j0 = list;
        DatagramSocket datagramSocket = new DatagramSocket();
        this.R = datagramSocket;
        this.F = new d(this);
        final net.luminis.quic.send.k kVar = new net.luminis.quic.send.k(this.e, datagramSocket, new InetSocketAddress(inetAddress, i), this, aVar2);
        this.T = kVar;
        androidx.emoji2.text.f fVar = kVar.j;
        fVar.getClass();
        fVar.c = androidx.constraintlayout.core.g.f(4);
        this.F.d = new IntSupplier() { // from class: net.luminis.quic.impl.f
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return kVar.d();
            }
        };
        this.k0 = kVar.k;
        this.U = new net.luminis.quic.receive.b(datagramSocket, aVar2, new x0(this, 3), new net.luminis.quic.ack.a(this, 1));
        this.W = new net.luminis.quic.stream.n(this, aVar2, aVar);
        this.Y = new net.luminis.quic.cid.b(kVar, new g(this), aVar2);
        this.L = 1;
        this.Q = new net.luminis.tls.engine.impl.a(new g0(14, this, aVar2), this);
    }

    public static String c(net.luminis.quic.frame.b bVar) {
        int i = bVar.B;
        String str = null;
        String string = "";
        if (i != 28 || bVar.e == 0) {
            if (i != 29 || bVar.e == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder("application protocol error ");
            sb.append(bVar.e);
            if (bVar.z != null) {
                StringBuilder sb2 = new StringBuilder(": ");
                try {
                    str = new String(bVar.z, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
                sb2.append(str);
                string = sb2.toString();
            }
            sb.append(string);
            return sb.toString();
        }
        if (bVar.A == -1) {
            StringBuilder sb3 = new StringBuilder("transport error ");
            sb3.append(bVar.e);
            if (bVar.z != null) {
                StringBuilder sb4 = new StringBuilder(": ");
                try {
                    str = new String(bVar.z, "UTF-8");
                } catch (UnsupportedEncodingException unused2) {
                }
                sb4.append(str);
                string = sb4.toString();
            }
            sb3.append(string);
            return sb3.toString();
        }
        StringBuilder sb5 = new StringBuilder("TLS error ");
        int i2 = bVar.A;
        if (i2 == -1) {
            net.luminis.tls.engine.impl.c.r("Close does not have a TLS error");
            return null;
        }
        sb5.append(i2);
        if (bVar.z != null) {
            StringBuilder sb6 = new StringBuilder(": ");
            try {
                str = new String(bVar.z, "UTF-8");
            } catch (UnsupportedEncodingException unused3) {
            }
            sb6.append(str);
            string = sb6.toString();
        }
        sb5.append(string);
        return sb5.toString();
    }

    public final void a(Throwable th) {
        if (this.L == 2) {
            this.m0 = th.toString();
        }
        this.L = 4;
        if (th != null) {
            this.z.f("Aborting connection because of error", th);
        }
        this.d0.countDown();
        this.T.i();
        l();
        this.W.a();
    }

    public final void b() {
        String str;
        synchronized (this) {
            try {
                if (this.L != 1) {
                    switch (this.L) {
                        case 1:
                            str = "Created";
                            break;
                        case 2:
                            str = "Handshaking";
                            break;
                        case 3:
                            str = "Connected";
                            break;
                        case 4:
                            str = "Closing";
                            break;
                        case 5:
                            str = "Draining";
                            break;
                        case 6:
                            str = "Closed";
                            break;
                        case 7:
                            str = "Failed";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalStateException("Cannot connect a connection that is in state ".concat(str));
                }
                this.W.g(this.b0);
                this.X = f();
                m mVar = this.X;
                net.luminis.quic.cid.b bVar = this.Y;
                mVar.m = bVar.g;
                List<net.luminis.quic.stream.e> list = Collections.EMPTY_LIST;
                net.luminis.quic.log.a aVar = this.z;
                com.google.common.base.b.b(bVar.h);
                com.google.common.base.b.b(this.Y.g);
                aVar.getClass();
                net.luminis.quic.crypto.d dVar = this.B;
                net.luminis.quic.cid.d dVar2 = this.Y.f;
                dVar.b(dVar2 != null ? dVar2.b : new byte[0]);
                this.U.e.start();
                net.luminis.quic.send.k kVar = this.T;
                kVar.p = this.B;
                kVar.n.start();
                this.l0 = new Thread(new h(this, 0), "receiver-loop");
                this.l0.setDaemon(true);
                this.l0.start();
                k(this.g0, !list.isEmpty());
                if (!list.isEmpty()) {
                    throw null;
                }
                try {
                    if (!this.d0.await(this.a0, TimeUnit.MILLISECONDS)) {
                        this.L = 7;
                        this.T.i();
                        l();
                        throw new ConnectException("Connection timed out after " + this.a0 + " ms");
                    }
                    if (this.L != 3) {
                        this.L = 7;
                        this.T.i();
                        l();
                        StringBuilder sb = new StringBuilder("Handshake error: ");
                        sb.append(this.m0 != null ? this.m0 : "");
                        throw new ConnectException(sb.toString());
                    }
                    if (!list.isEmpty()) {
                        if (this.p0 != 3) {
                            this.z.getClass();
                        }
                        for (net.luminis.quic.stream.e eVar : list) {
                            if (eVar != null) {
                                ((net.luminis.quic.stream.a) eVar).g(this.p0 == 3);
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    this.L = 7;
                    this.T.i();
                    l();
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final net.luminis.quic.crypto.f d(int i) {
        ArrayList arrayList = this.H;
        if (arrayList.size() <= androidx.constraintlayout.core.g.e(i)) {
            for (int iE = androidx.constraintlayout.core.g.e(i) - arrayList.size(); iE >= 0; iE--) {
                arrayList.add(new net.luminis.quic.crypto.f(this.e, i, this.y, this.Q, this.z, this.T));
            }
        }
        return (net.luminis.quic.crypto.f) arrayList.get(androidx.constraintlayout.core.g.e(i));
    }

    public final void e(int i, long j, String str) {
        androidx.compose.foundation.lazy.grid.l lVar = this.f0;
        if (lVar != null) {
            ((ScheduledExecutorService) lVar.f).shutdown();
        }
        if (this.L == 4 || this.L == 5) {
            this.z.getClass();
            return;
        }
        long j2 = net.luminis.quic.a.NO_ERROR.e;
        net.luminis.quic.log.a aVar = this.z;
        if (j == j2) {
            toString();
            aVar.getClass();
        } else {
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            sb.append(" with error ");
            sb.append(j);
            sb.append(str != null ? ": ".concat(str) : "");
            aVar.d(sb.toString());
        }
        this.T.i();
        net.luminis.quic.send.k kVar = this.T;
        n nVar = this.e.a;
        net.luminis.quic.frame.b bVar = new net.luminis.quic.frame.b();
        int iCharCount = 0;
        bVar.z = new byte[0];
        bVar.A = -1;
        bVar.B = 28;
        bVar.e = j;
        if (j >= 256 && j < 512) {
            bVar.A = (int) (j - 256);
        }
        if (str != null) {
            int length = str.length();
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    bVar.z = str.getBytes(StandardCharsets.UTF_8);
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        kVar.i[androidx.constraintlayout.core.g.e(i)].a(bVar, new j(0));
        this.L = 4;
        this.W.a();
        if (i != 1) {
            try {
                this.N.schedule(new h(this, 2), this.T.d() * 3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            this.G.add(new h(this, 3));
        }
        this.z.i();
        System.currentTimeMillis();
    }

    public final m f() {
        m mVar = new m();
        a aVar = this.b0;
        int i = aVar.a;
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o("maxIdleTimeout must be set");
            return null;
        }
        mVar.b = i;
        long j = aVar.d;
        if (j <= 0) {
            net.luminis.tls.engine.impl.c.o("maxConnectionBufferSize must be set");
            return null;
        }
        mVar.c = j;
        long j2 = aVar.e;
        if (j2 <= 0) {
            net.luminis.tls.engine.impl.c.o("maxBidirectionalStreamBufferSize must be set");
            return null;
        }
        mVar.f = j2;
        long j3 = aVar.f;
        if (j3 <= 0) {
            net.luminis.tls.engine.impl.c.o("maxBidirectionalStreamBufferSize must be set");
            return null;
        }
        mVar.d = j3;
        mVar.e = j3;
        int i2 = aVar.c;
        if (i2 < 0) {
            net.luminis.tls.engine.impl.c.o("maxOpenBidirectionalStreams must be set");
            return null;
        }
        mVar.g = i2;
        int i3 = aVar.b;
        if (i3 < 0) {
            net.luminis.tls.engine.impl.c.o("maxOpenUnidirectionalStreams must be set");
            return null;
        }
        mVar.h = i3;
        int i4 = aVar.g;
        if (i4 < 2) {
            net.luminis.tls.engine.impl.c.o("activeConnectionIdLimit must be set");
            return null;
        }
        mVar.l = i4;
        int i5 = aVar.h;
        if (i5 >= 1200) {
            mVar.o = i5;
            return mVar;
        }
        net.luminis.tls.engine.impl.c.o("maxUdpPayloadSize must be set");
        return null;
    }

    @Override // net.luminis.quic.packet.e
    public final void g(net.luminis.quic.packet.g gVar, net.luminis.quic.packet.f fVar) {
        if (gVar.a(this, fVar.c) == 2) {
            return;
        }
        c0 c0Var = this.k0;
        c0Var.getClass();
        if (gVar.c()) {
            ((net.luminis.quic.ack.b[]) c0Var.e)[androidx.constraintlayout.core.g.e(gVar.m())].d(gVar);
        }
        d dVar = this.F;
        if (dVar.f) {
            dVar.e = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void h(net.luminis.quic.packet.g gVar, Long l) {
        Iterator it = gVar.c.iterator();
        while (it.hasNext()) {
            ((net.luminis.quic.frame.n) it.next()).a(this, gVar, l);
        }
    }

    public final void i(Function function, int i, int i2, Consumer consumer, boolean z) {
        net.luminis.quic.send.k kVar = this.T;
        kVar.e(function, i, i2, consumer);
        if (z) {
            kVar.j();
        }
    }

    public final void j(net.luminis.quic.frame.n nVar, Consumer consumer, boolean z) {
        net.luminis.quic.send.k kVar = this.T;
        kVar.f(nVar, 4, consumer);
        if (z) {
            kVar.j();
        }
    }

    public final void k(String str, boolean z) {
        net.luminis.tls.engine.impl.a aVar = this.Q;
        aVar.g = this.O;
        aVar.h.addAll(this.j0);
        if (this.e.a.b()) {
            ArrayList arrayList = new ArrayList(2);
            n nVar = n.c;
            arrayList.add(nVar);
            arrayList.add(n.b);
            this.X.q = new g0(15, nVar, arrayList, false);
        }
        this.Q.k.add(new net.luminis.quic.tls.a(this.e.a, this.X));
        net.luminis.tls.engine.impl.a aVar2 = this.Q;
        aVar2.k.add(new net.luminis.tls.extension.a(str));
        if (z) {
            net.luminis.tls.engine.impl.a aVar3 = this.Q;
            aVar3.k.add(new net.luminis.tls.extension.f());
        }
        try {
            this.Q.f();
        } catch (IOException unused) {
        }
    }

    public final void l() {
        d dVar = this.F;
        if (dVar.f) {
            dVar.a.shutdown();
        }
        net.luminis.quic.send.k kVar = this.T;
        kVar.getClass();
        kVar.t = true;
        kVar.n.interrupt();
        this.L = 6;
        this.N.shutdown();
        this.d0.countDown();
        net.luminis.quic.receive.b bVar = this.U;
        bVar.g = true;
        bVar.e.interrupt();
        this.R.close();
        if (this.l0 != null) {
            this.l0.interrupt();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ClientConnection[");
        sb.append(com.google.common.base.b.b(this.Y.h));
        sb.append("/");
        sb.append(com.google.common.base.b.b(this.Y.g));
        sb.append("(");
        int i = this.e.a.a;
        char c = 1;
        if (i != 1) {
            c = i == 1798521807 ? (char) 2 : (char) 0;
        }
        if (c != 1) {
            str = c != 2 ? "null" : "V2";
        } else {
            str = "V1";
        }
        sb.append(str);
        sb.append(") with ");
        sb.append(new InetSocketAddress(this.S, this.P));
        sb.append("]");
        return sb.toString();
    }
}
