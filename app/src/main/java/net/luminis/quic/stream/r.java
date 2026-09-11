package net.luminis.quic.stream;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class r extends o {
    public final int B;
    public final ReentrantLock D;
    public final Condition E;
    public long F;
    public boolean G;
    public volatile boolean H;
    public volatile boolean I;
    public volatile long J;
    public long K;
    public volatile Thread L;
    public final b M;
    public volatile boolean N;
    public final e e;
    public final ByteBuffer y = ByteBuffer.allocate(0);
    public final Object z = new Object();
    public final ConcurrentLinkedDeque A = new ConcurrentLinkedDeque();
    public final AtomicInteger C = new AtomicInteger();

    public r(e eVar, b bVar) {
        long j;
        this.e = eVar;
        this.M = bVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.D = reentrantLock;
        this.E = reentrantLock.newCondition();
        this.B = 51200;
        bVar.getClass();
        int i = eVar.a;
        synchronized (bVar) {
            try {
                if (!bVar.g.containsKey(Integer.valueOf(i))) {
                    HashMap map = bVar.g;
                    Integer numValueOf = Integer.valueOf(i);
                    if (eVar.d()) {
                        j = bVar.d;
                    } else {
                        int i2 = eVar.a;
                        if ((i2 & 3) == 0) {
                            j = bVar.c;
                        } else {
                            if (!((i2 & 3) == 1)) {
                                throw new androidx.compose.ui.res.e(13);
                            }
                            j = bVar.b;
                        }
                    }
                    map.put(numValueOf, Long.valueOf(j));
                    bVar.h.put(Integer.valueOf(i), 0L);
                }
                if (i > bVar.k) {
                    bVar.k = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.j.put(Integer.valueOf(eVar.a), this);
    }

    public static void m(r rVar, net.luminis.quic.frame.n nVar) {
        if (rVar.I) {
            return;
        }
        rVar.e.b.j(nVar, new q(rVar, 0), false);
        net.luminis.quic.log.a aVar = rVar.e.d;
        Objects.toString(nVar);
        aVar.getClass();
    }

    public static net.luminis.quic.frame.n w(r rVar) {
        b bVar = rVar.M;
        e eVar = rVar.e;
        bVar.getClass();
        int i = eVar.a;
        HashMap map = bVar.g;
        int i2 = 3;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Long) bVar.h.get(Integer.valueOf(i))).equals(map.get(Integer.valueOf(i)))) {
                i2 = 2;
            } else if (bVar.e == bVar.f) {
                i2 = 1;
            }
        }
        int iE = androidx.constraintlayout.core.g.e(i2);
        if (iE == 0) {
            long j = bVar.e;
            net.luminis.quic.frame.d dVar = new net.luminis.quic.frame.d(0);
            dVar.y = j;
            return dVar;
        }
        if (iE != 1) {
            return null;
        }
        int i3 = eVar.a;
        long j2 = rVar.F;
        net.luminis.quic.frame.f fVar = new net.luminis.quic.frame.f(2);
        fVar.y = i3;
        fVar.z = j2;
        return fVar;
    }

    public void L() {
        this.M.j.remove(Integer.valueOf(this.e.a));
        b bVar = this.M;
        e eVar = this.e;
        bVar.getClass();
        int i = eVar.a;
        synchronized (bVar) {
            bVar.h.remove(Integer.valueOf(i));
            bVar.g.remove(Integer.valueOf(i));
        }
        this.e.e();
    }

    public int N() {
        return 4;
    }

    @Override // net.luminis.quic.stream.o
    public final void a() {
        this.N = true;
        Thread thread = this.L;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.G || this.N || this.I) {
            return;
        }
        this.A.add(this.y);
        this.G = true;
        synchronized (this.z) {
            try {
                if (!this.H) {
                    this.H = true;
                    this.e.b.i(new p(this, 0), 20, N(), new q(this, 0), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        z();
    }

    @Override // net.luminis.quic.stream.o
    public final void g(long j) {
        if (this.G || this.I) {
            return;
        }
        this.I = true;
        this.J = j;
        this.A.clear();
        this.C.set(0);
        e eVar = this.e;
        eVar.b.i(new p(this, 1), com.google.android.material.textfield.p.b(j) + com.google.android.material.textfield.p.b(eVar.a) + 1 + 8, 4, new q(this, 1), true);
        Thread thread = this.L;
        if (thread != null) {
            thread.interrupt();
        }
        this.e.e();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            r6.z()
            int r0 = r6.B
            if (r9 <= r0) goto L20
            int r0 = r0 / 2
            int r1 = r9 / r0
            r2 = 0
        Lc:
            if (r2 >= r1) goto L17
            int r3 = r2 * r0
            int r3 = r3 + r8
            r6.write(r7, r3, r0)
            int r2 = r2 + 1
            goto Lc
        L17:
            int r9 = r9 % r0
            if (r9 <= 0) goto L1f
            int r1 = r1 * r0
            int r1 = r1 + r8
            r6.write(r7, r1, r9)
        L1f:
            return
        L20:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.C
            int r1 = r1.get()
            int r0 = r0 - r1
            if (r9 <= r0) goto L83
            java.util.concurrent.locks.ReentrantLock r0 = r6.D
            r0.lock()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r6.L = r0
        L34:
            r1 = 0
            int r0 = r6.B     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.atomic.AtomicInteger r2 = r6.C     // Catch: java.lang.Throwable -> L49
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L49
            int r0 = r0 - r2
            if (r0 >= r9) goto L73
            r6.z()     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.locks.Condition r0 = r6.E     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L4c
            r0.await()     // Catch: java.lang.Throwable -> L49 java.lang.InterruptedException -> L4c
            goto L34
        L49:
            r0 = move-exception
            r7 = r0
            goto L7b
        L4c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r7.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = "write failed because stream was "
            r7.append(r8)     // Catch: java.lang.Throwable -> L49
            boolean r8 = r6.G     // Catch: java.lang.Throwable -> L49
            if (r8 != 0) goto L64
            boolean r8 = r6.I     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L61
            java.lang.String r8 = "reset"
            goto L66
        L61:
            java.lang.String r8 = "aborted"
            goto L66
        L64:
            java.lang.String r8 = "closed"
        L66:
            r7.append(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L49
            java.io.InterruptedIOException r8 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L49
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L49
            throw r8     // Catch: java.lang.Throwable -> L49
        L73:
            r6.L = r1
            java.util.concurrent.locks.ReentrantLock r0 = r6.D
            r0.unlock()
            goto L83
        L7b:
            r6.L = r1
            java.util.concurrent.locks.ReentrantLock r8 = r6.D
            r8.unlock()
            throw r7
        L83:
            java.util.concurrent.ConcurrentLinkedDeque r0 = r6.A
            int r1 = r8 + r9
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r8, r1)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r0.add(r7)
            java.util.concurrent.atomic.AtomicInteger r7 = r6.C
            r7.getAndAdd(r9)
            java.lang.Object r7 = r6.z
            monitor-enter(r7)
            boolean r8 = r6.H     // Catch: java.lang.Throwable -> Lbc
            if (r8 != 0) goto Lbf
            r8 = 1
            r6.H = r8     // Catch: java.lang.Throwable -> Lbc
            net.luminis.quic.stream.e r8 = r6.e     // Catch: java.lang.Throwable -> Lbc
            net.luminis.quic.impl.i r0 = r8.b     // Catch: java.lang.Throwable -> Lbc
            net.luminis.quic.stream.p r1 = new net.luminis.quic.stream.p     // Catch: java.lang.Throwable -> Lbc
            r8 = 0
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lbc
            int r3 = r6.N()     // Catch: java.lang.Throwable -> Lbc
            net.luminis.quic.stream.q r4 = new net.luminis.quic.stream.q     // Catch: java.lang.Throwable -> Lbc
            r8 = 0
            r4.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lbc
            r5 = 1
            r2 = 20
            r0.i(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lbc
            goto Lbf
        Lbc:
            r0 = move-exception
            r8 = r0
            goto Lc1
        Lbf:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lbc
            return
        Lc1:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lbc
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.luminis.quic.stream.r.write(byte[], int, int):void");
    }

    public final void z() throws IOException {
        if (this.G || this.I) {
            throw new IOException("output stream ".concat(this.G ? "already closed" : "is reset"));
        }
        if (this.N) {
            net.luminis.tls.engine.impl.c.t("output aborted because connection is closed");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
