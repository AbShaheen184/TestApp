package net.luminis.quic.stream;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public final int a;
    public final net.luminis.quic.impl.i b;
    public final n c;
    public final net.luminis.quic.log.a d;
    public final i e;
    public final o f;
    public volatile boolean g;
    public volatile boolean h;
    public final ReentrantLock i;

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    public e(int i, net.luminis.quic.impl.i iVar, n nVar, b bVar, net.luminis.quic.log.a aVar) {
        long j;
        this.a = i;
        this.b = iVar;
        this.c = nVar;
        this.d = aVar;
        if (c()) {
            if (c()) {
                j = nVar.e.f;
            } else {
                j = nVar.e.e;
            }
            this.e = new k(this, j);
        } else {
            if (d()) {
                if (!((i & 1) == 0)) {
                    if (c()) {
                        j = nVar.e.f;
                    } else {
                        j = nVar.e.e;
                    }
                    this.e = new k(this, j);
                }
            }
            this.e = new c();
        }
        if (c() || (d() && (i & 1) == 0)) {
            this.f = new r(this, bVar);
        } else {
            this.f = new d();
        }
        this.i = new ReentrantLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (((r2.a & 1) == 0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(net.luminis.quic.frame.r r3) throws net.luminis.quic.impl.l {
        /*
            r2 = this;
            boolean r0 = r2.c()
            if (r0 != 0) goto L1e
            boolean r0 = r2.d()
            if (r0 == 0) goto L16
            int r0 = r2.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L13
            r1 = 0
        L13:
            if (r1 != 0) goto L16
            goto L1e
        L16:
            net.luminis.quic.impl.l r3 = new net.luminis.quic.impl.l
            net.luminis.quic.a r0 = net.luminis.quic.a.STREAM_STATE_ERROR
            r3.<init>(r0)
            throw r3
        L1e:
            net.luminis.quic.stream.i r0 = r2.e
            long r0 = r0.m(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.luminis.quic.stream.e.a(net.luminis.quic.frame.r):long");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:2:0x0000, B:4:0x000e, B:11:0x001b, B:9:0x0015), top: B:16:0x0000 }] */
    public final void b() {
        try {
            this.i.lock();
            this.h = true;
            if (c() && this.g) {
                this.c.i(this.a);
            } else if (d()) {
                this.c.i(this.a);
            }
        } finally {
            this.i.unlock();
        }
    }

    public final boolean c() {
        return !d();
    }

    public final boolean d() {
        return (this.a & 2) == 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:2:0x0000, B:4:0x000e, B:11:0x001b, B:9:0x0015), top: B:16:0x0000 }] */
    public final void e() {
        try {
            this.i.lock();
            this.g = true;
            if (c() && this.h) {
                this.c.i(this.a);
            } else if (d()) {
                this.c.i(this.a);
            }
        } finally {
            this.i.unlock();
        }
    }

    public final void f(int i) {
        n nVar = this.c;
        nVar.getClass();
        try {
            nVar.s.lock();
            nVar.o += (long) i;
            if (nVar.o - nVar.p > nVar.q) {
                net.luminis.quic.impl.i iVar = nVar.b;
                long j = nVar.o;
                net.luminis.quic.frame.d dVar = new net.luminis.quic.frame.d(1);
                dVar.y = j;
                iVar.j(dVar, new net.luminis.quic.impl.j(0), true);
                nVar.p = nVar.o;
            }
        } finally {
            nVar.s.unlock();
        }
    }

    public final String toString() {
        return "Stream " + this.a;
    }
}
