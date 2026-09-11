package net.luminis.quic.stream;

import com.appsalt.internal.x0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final net.luminis.quic.impl.j A = new net.luminis.quic.impl.j(2);
    public final net.luminis.quic.impl.i b;
    public volatile b c;
    public final net.luminis.quic.log.a d;
    public volatile net.luminis.quic.impl.a e;
    public volatile int f;
    public volatile int g;
    public volatile Long i;
    public volatile Long j;
    public volatile boolean m;
    public volatile boolean n;
    public volatile long o;
    public long p;
    public long q;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public volatile int v;
    public volatile int w;
    public long x;
    public long y;
    public long z;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Semaphore k = new Semaphore(0);
    public final Semaphore l = new Semaphore(0);
    public volatile Consumer h = A;
    public final ReentrantLock r = new ReentrantLock();
    public final ReentrantLock s = new ReentrantLock();

    public n(net.luminis.quic.impl.i iVar, net.luminis.quic.log.a aVar, net.luminis.quic.impl.a aVar2) {
        this.b = iVar;
        this.d = aVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.t = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.u = atomicInteger2;
        atomicInteger.set(0);
        atomicInteger2.set(2);
        this.v = 3;
        this.w = 1;
        g(aVar2);
    }

    public static int b(int i, int i2, boolean z) {
        if (i < 0) {
            return 0;
        }
        int i3 = i * 4;
        if (i2 == 2 && z) {
            i3++;
        }
        if (i2 == 1 && !z) {
            i3 += 2;
        }
        if (i2 == 1 && !z) {
            i3 += 3;
        }
        if (i3 > 0) {
            return i3;
        }
        return Integer.MAX_VALUE;
    }

    public final void a() {
        for (e eVar : this.a.values()) {
            eVar.f.a();
            eVar.e.a();
        }
    }

    public final net.luminis.quic.frame.g c(int i) {
        if (i < 9) {
            throw new androidx.compose.ui.res.e(13);
        }
        try {
            this.r.lock();
            this.n = false;
            return new net.luminis.quic.frame.g(this.g / 4, true);
        } finally {
            this.r.unlock();
        }
    }

    public final net.luminis.quic.frame.g d(int i) {
        if (i < 9) {
            throw new androidx.compose.ui.res.e(13);
        }
        try {
            this.r.lock();
            this.m = false;
            return new net.luminis.quic.frame.g(this.f / 4, false);
        } finally {
            this.r.unlock();
        }
    }

    public final void e(int i, int i2, Runnable runnable) {
        if (i < i2) {
            this.d.getClass();
            return;
        }
        for (int i3 = i2; i3 <= i; i3 += 4) {
            e eVar = new e(i3, this.b, this, this.c, this.d);
            this.a.put(Integer.valueOf(i3), eVar);
            this.h.accept(eVar);
        }
        runnable.run();
    }

    public final e f(boolean z, long j, TimeUnit timeUnit, com.google.android.datatransport.runtime.scheduling.jobscheduling.l lVar) throws TimeoutException {
        try {
            if (!(z ? this.k.tryAcquire(j, timeUnit) : this.l.tryAcquire(j, timeUnit))) {
                throw new TimeoutException();
            }
            int andAdd = z ? this.t.getAndAdd(4) : this.u.getAndAdd(4);
            n nVar = (n) lVar.y;
            nVar.getClass();
            e eVar = new e(andAdd, nVar.b, nVar, nVar.c, nVar.d);
            this.a.put(Integer.valueOf(andAdd), eVar);
            return eVar;
        } catch (InterruptedException unused) {
            this.d.getClass();
            throw new TimeoutException("operation interrupted");
        }
    }

    public final void g(net.luminis.quic.impl.a aVar) {
        this.e = aVar;
        this.f = b(aVar.b, 2, false);
        this.g = b(aVar.c, 2, true);
        this.y = b((int) Long.min(2147483647L, Long.MAX_VALUE), 2, false);
        this.z = b((int) Long.min(2147483647L, Long.MAX_VALUE), 2, true);
        this.o = aVar.d;
        this.p = this.o;
        this.q = this.o / 10;
    }

    public final void h(net.luminis.quic.frame.r rVar) throws net.luminis.quic.impl.l {
        int i;
        int i2;
        final int i3 = rVar.y;
        e eVar = (e) this.a.get(Integer.valueOf(i3));
        if (eVar != null || (((i2 = (i = rVar.y) % 4) > 1 && i >= this.v) || (i2 < 2 && i >= this.w))) {
            long jW = eVar != null ? eVar.e.w() : 0L;
            if (rVar.b() > jW) {
                if (this.x + (rVar.b() - jW) > this.o) {
                    throw new net.luminis.quic.impl.l(net.luminis.quic.a.FLOW_CONTROL_ERROR);
                }
            }
        }
        if (eVar != null) {
            this.x = eVar.a(rVar) + this.x;
            return;
        }
        if (i3 % 2 != 1) {
            this.d.getClass();
            return;
        }
        int i4 = i3 % 4;
        if ((i4 <= 1 || i3 >= this.f) && (i4 >= 2 || i3 >= this.g)) {
            throw new net.luminis.quic.impl.l(net.luminis.quic.a.STREAM_LIMIT_ERROR);
        }
        if (i4 > 1) {
            final int i5 = 0;
            e(i3, this.v, new Runnable(this) { // from class: net.luminis.quic.stream.m
                public final /* synthetic */ n y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            this.y.v = i3 + 4;
                            break;
                        default:
                            this.y.w = i3 + 4;
                            break;
                    }
                }
            });
        } else {
            final int i6 = 1;
            e(i3, this.w, new Runnable(this) { // from class: net.luminis.quic.stream.m
                public final /* synthetic */ n y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            this.y.v = i3 + 4;
                            break;
                        default:
                            this.y.w = i3 + 4;
                            break;
                    }
                }
            });
        }
        e eVar2 = (e) this.a.get(Integer.valueOf(i3));
        if (eVar2 != null) {
            this.x = eVar2.a(rVar) + this.x;
        }
    }

    public final void i(int i) {
        this.a.remove(Integer.valueOf(i));
        if (i % 2 == 1) {
            try {
                this.r.lock();
                if (!(i % 4 > 1) || this.f + 4 >= this.y) {
                    if ((i % 4 < 2) && this.g + 4 < this.z) {
                        this.g += 4;
                        if (!this.n) {
                            final int i2 = 1;
                            this.b.T.e(new Function(this) { // from class: net.luminis.quic.stream.l
                                public final /* synthetic */ n b;

                                {
                                    this.b = this;
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    int i3 = i2;
                                    int iIntValue = ((Integer) obj).intValue();
                                    switch (i3) {
                                        case 0:
                                            return this.b.d(iIntValue);
                                        default:
                                            return this.b.c(iIntValue);
                                    }
                                }
                            }, 9, 4, new x0(this, 4));
                            this.n = true;
                        }
                    }
                } else {
                    this.f += 4;
                    if (!this.m) {
                        final int i3 = 0;
                        this.b.T.e(new Function(this) { // from class: net.luminis.quic.stream.l
                            public final /* synthetic */ n b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i4 = i3;
                                int iIntValue = ((Integer) obj).intValue();
                                switch (i4) {
                                    case 0:
                                        return this.b.d(iIntValue);
                                    default:
                                        return this.b.c(iIntValue);
                                }
                            }
                        }, 9, 4, new x0(this, 4));
                        this.m = true;
                    }
                }
            } finally {
                this.r.unlock();
            }
        }
    }
}
