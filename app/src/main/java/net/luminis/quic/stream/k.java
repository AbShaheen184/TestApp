package net.luminis.quic.stream;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public volatile Thread A;
    public long D;
    public final long E;
    public long F;
    public long G;
    public volatile boolean H;
    public final e e;
    public volatile boolean y;
    public volatile boolean z;
    public final Object C = new Object();
    public volatile long I = -1;
    public final g B = new g();

    public k(e eVar, long j) {
        this.e = eVar;
        this.G = j;
        this.D = j;
        this.E = (long) (j * 0.1f);
    }

    public static void L(k kVar, net.luminis.quic.frame.n nVar) {
        e eVar = kVar.e;
        eVar.b.j(new net.luminis.quic.frame.f(eVar.a, kVar.G), new j(kVar, 0), false);
        net.luminis.quic.log.a aVar = eVar.d;
        Objects.toString(nVar);
        aVar.getClass();
    }

    public final void N(int i) {
        this.G += (long) i;
        e eVar = this.e;
        eVar.f(i);
        long j = this.G;
        if (j - this.D > this.E) {
            eVar.b.j(new net.luminis.quic.frame.f(eVar.a, j), new j(this, 0), true);
            this.D = this.G;
        }
    }

    @Override // net.luminis.quic.stream.i
    public final void a() {
        this.H = true;
        Thread thread = this.A;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        g gVar = this.B;
        long j = gVar.c - gVar.d;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g();
    }

    @Override // net.luminis.quic.stream.i
    public final void g() {
        g gVar = this.B;
        if (gVar.e < 0 || gVar.c != gVar.e) {
            e eVar = this.e;
            net.luminis.quic.impl.i iVar = eVar.b;
            int i = eVar.a;
            net.luminis.quic.frame.f fVar = new net.luminis.quic.frame.f(1);
            fVar.y = i;
            fVar.z = 0L;
            iVar.j(fVar, new j(this, 1), true);
        }
        this.y = true;
        g gVar2 = this.B;
        gVar2.g = true;
        gVar2.a.clear();
        gVar2.b.clear();
        Thread thread = this.A;
        if (thread != null) {
            thread.interrupt();
        }
        this.e.b();
    }

    @Override // net.luminis.quic.stream.i
    public final long m(net.luminis.quic.frame.r rVar) throws net.luminis.quic.impl.l {
        long jMax;
        if (this.I >= 0 && rVar.b() > this.I) {
            throw new net.luminis.quic.impl.l(net.luminis.quic.a.FINAL_SIZE_ERROR);
        }
        if (this.I >= 0 && rVar.C && rVar.b() != this.I) {
            throw new net.luminis.quic.impl.l(net.luminis.quic.a.FINAL_SIZE_ERROR);
        }
        if (rVar.C) {
            this.I = rVar.b();
        }
        if (this.H || this.y || this.z) {
            return 0L;
        }
        synchronized (this.C) {
            try {
                if (rVar.b() > this.G) {
                    throw new net.luminis.quic.impl.l(net.luminis.quic.a.FLOW_CONTROL_ERROR);
                }
                this.B.a(rVar);
                jMax = Long.max(0L, rVar.b() - this.F);
                this.F = Long.max(this.F, rVar.b());
                this.C.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String str;
        if (i2 == 0) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Long.MAX_VALUE;
        while (!this.H && !this.y && !this.z) {
            synchronized (this.C) {
                try {
                    this.A = Thread.currentThread();
                    int iD = this.B.d(ByteBuffer.wrap(bArr, i, i2));
                    if (iD > 0) {
                        N(iD);
                        this.A = null;
                        return iD;
                    }
                    if (iD < 0) {
                        this.e.b();
                        this.A = null;
                        return -1;
                    }
                    try {
                        this.C.wait(jMax);
                    } catch (InterruptedException unused) {
                    }
                    this.A = null;
                    g gVar = this.B;
                    if (gVar.c - gVar.d == 0) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 > Long.MAX_VALUE) {
                            throw new SocketTimeoutException("Read timeout on stream " + this.e.a + "; read up to " + this.B.d);
                        }
                        jMax = Long.max(1L, Long.MAX_VALUE - jCurrentTimeMillis2);
                    }
                } catch (Throwable th) {
                    this.A = null;
                    throw th;
                }
            }
        }
        if (this.H) {
            str = "Connection closed";
        } else {
            str = this.y ? "Stream closed" : "Stream reset by peer";
        }
        throw new IOException(str);
    }

    @Override // net.luminis.quic.stream.i
    public final long w() {
        return this.F;
    }

    @Override // net.luminis.quic.stream.i
    public final long z(long j) throws net.luminis.quic.impl.l {
        if (this.I >= 0 && j != this.I) {
            throw new net.luminis.quic.impl.l(net.luminis.quic.a.FINAL_SIZE_ERROR);
        }
        long j2 = this.F;
        if (j < j2) {
            throw new net.luminis.quic.impl.l(net.luminis.quic.a.FINAL_SIZE_ERROR);
        }
        long j3 = j - j2;
        if (this.I < 0) {
            this.I = j;
        }
        if (!this.H && !this.y && !this.z) {
            this.z = true;
            this.e.f((int) (this.I - this.B.d));
            g gVar = this.B;
            gVar.g = true;
            gVar.a.clear();
            gVar.b.clear();
            Thread thread = this.A;
            if (thread != null) {
                thread.interrupt();
            }
            this.e.b();
        }
        return j3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & 255;
        }
        if (i < 0) {
            return -1;
        }
        com.google.gson.b.l();
        return 0;
    }
}
