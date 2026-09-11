package net.luminis.quic.recovery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import net.luminis.quic.frame.j;
import net.luminis.quic.frame.m;
import net.luminis.quic.frame.n;
import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;
    public final h b;
    public final k d;
    public final net.luminis.quic.log.a e;
    public final ScheduledExecutorService f;
    public int g;
    public ScheduledFuture h;
    public volatile int j;
    public volatile Long k;
    public final a[] c = new a[androidx.constraintlayout.core.g.f(3).length];
    public final Object i = new Object();
    public volatile int l = 1;
    public volatile boolean m = false;

    public g(int i, h hVar, net.luminis.quic.cc.a aVar, k kVar, net.luminis.quic.log.a aVar2) {
        this.a = i;
        this.b = hVar;
        for (int i2 : androidx.constraintlayout.core.g.f(3)) {
            this.c[androidx.constraintlayout.core.g.e(i2)] = new a(this, hVar, aVar, new c(0, kVar), aVar2.i());
        }
        this.d = kVar;
        this.e = aVar2;
        this.f = Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.a("loss-detection", 1));
        synchronized (this.i) {
            this.h = new f();
        }
    }

    public static void g(int i, Runnable runnable) {
        for (int i2 = 0; i2 < i; i2++) {
            runnable.run();
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public final net.luminis.quic.packet.f a(Function function) {
        net.luminis.quic.packet.f fVar = null;
        for (int i : androidx.constraintlayout.core.g.f(3)) {
            Long l = (Long) function.apply(this.c[androidx.constraintlayout.core.g.e(i)]);
            if (l != null) {
                if (fVar == null) {
                    fVar = new net.luminis.quic.packet.f(i, l);
                } else if (fVar.c.longValue() >= l.longValue()) {
                    fVar = new net.luminis.quic.packet.f(i, l);
                }
            }
        }
        return fVar;
    }

    public final List b(int i) {
        net.luminis.quic.packet.g gVar;
        a aVar = this.c[androidx.constraintlayout.core.g.e(i)];
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (b bVar : aVar.f.values()) {
            boolean zA = bVar.a();
            net.luminis.quic.packet.g gVar2 = bVar.b;
            if (zA && !gVar2.p()) {
                arrayList.add(gVar2);
            }
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (net.luminis.quic.packet.g) it.next();
            if (gVar.o()) {
                for (n nVar : gVar.c) {
                    if (!(nVar instanceof m) && !(nVar instanceof j) && !(nVar instanceof net.luminis.quic.frame.a)) {
                        break loop1;
                    }
                }
            }
        }
        if (gVar == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        for (n nVar2 : gVar.c) {
            if (!(nVar2 instanceof net.luminis.quic.frame.a)) {
                arrayList2.add(nVar2);
            }
        }
        return arrayList2;
    }

    public final net.luminis.quic.packet.f c() {
        int i = 4;
        int iMax = (Integer.max(1, this.b.a() * 4) + this.b.b()) * ((int) Math.pow(2.0d, this.j));
        int i2 = 0;
        if (f()) {
            i2 = androidx.constraintlayout.core.g.e(this.l) < 1 ? 1 : 0;
            net.luminis.quic.log.a aVar = this.e;
            if (i2 != 0) {
                aVar.getClass();
                return new net.luminis.quic.packet.f(1, Long.valueOf(System.currentTimeMillis() + ((long) iMax)));
            }
            aVar.getClass();
            return new net.luminis.quic.packet.f(2, Long.valueOf(System.currentTimeMillis() + ((long) iMax)));
        }
        Long lValueOf = Long.MAX_VALUE;
        int i3 = 3;
        int[] iArrF = androidx.constraintlayout.core.g.f(3);
        int length = iArrF.length;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArrF[i2];
            if (this.c[androidx.constraintlayout.core.g.e(i5)].g.get() != 0) {
                if (i5 != i3 || androidx.constraintlayout.core.g.e(this.l) >= i) {
                    if (i5 == i3) {
                        iMax += this.g * ((int) Math.pow(2.0d, this.j));
                    }
                    Long l = this.c[androidx.constraintlayout.core.g.e(i5)].j;
                    if (l != null) {
                        long j = iMax;
                        if (l.longValue() + j < lValueOf.longValue()) {
                            lValueOf = Long.valueOf(l.longValue() + j);
                            i4 = i5;
                        }
                    }
                } else {
                    this.e.getClass();
                }
            }
            i2++;
            i = 4;
            i3 = 3;
        }
        if (i4 != 0) {
            return new net.luminis.quic.packet.f(i4, lValueOf);
        }
        return null;
    }

    public final void d(int i) {
        if (this.m) {
            return;
        }
        int i2 = this.l;
        this.l = i;
        if (i != 5 || i2 == 5) {
            return;
        }
        this.e.getClass();
        j();
    }

    public final void e() {
        Long l = this.k;
        if (l == null) {
            this.e.getClass();
            return;
        }
        if (System.currentTimeMillis() >= l.longValue() || l.longValue() - System.currentTimeMillis() <= 0) {
            net.luminis.quic.log.a aVar = this.e;
            System.currentTimeMillis();
            aVar.getClass();
        } else {
            net.luminis.quic.log.a aVar2 = this.e;
            System.currentTimeMillis();
            System.currentTimeMillis();
            aVar2.getClass();
            h(this.k);
        }
        net.luminis.quic.packet.f fVarA = a(new androidx.media3.exoplayer.audio.f(2));
        if ((fVarA != null ? fVarA.c : null) != null) {
            this.c[androidx.constraintlayout.core.g.e(fVarA.b)].a();
            this.d.j();
            j();
            return;
        }
        this.e.getClass();
        this.j++;
        int i = this.j > 1 ? 2 : 1;
        for (a aVar3 : this.c) {
            if (aVar3.g.get() != 0) {
                net.luminis.quic.packet.f fVarC = c();
                if (fVarC == null) {
                    this.e.getClass();
                    return;
                } else {
                    i(fVarC.b, i);
                    return;
                }
            }
        }
        boolean zF = f();
        net.luminis.quic.log.a aVar4 = this.e;
        if (!zF) {
            aVar4.getClass();
            return;
        }
        aVar4.getClass();
        if (androidx.constraintlayout.core.g.e(this.l) < 1) {
            i(1, 1);
        } else {
            i(2, 1);
        }
    }

    public final boolean f() {
        return this.a == 1 && androidx.constraintlayout.core.g.e(this.l) < 4 && this.c[1].h < 0;
    }

    public final void h(Long l) {
        try {
            synchronized (this.i) {
                this.h.cancel(false);
                this.k = l;
                this.h = this.f.schedule(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 13), l.longValue() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException e) {
            if (!this.m) {
                throw e;
            }
        }
    }

    public final void i(int i, int i2) {
        final ArrayList arrayList = new ArrayList(2);
        arrayList.add(new m());
        arrayList.add(new j(2));
        net.luminis.quic.log.a aVar = this.e;
        if (i == 1) {
            final List listB = b(1);
            if (listB.isEmpty()) {
                aVar.getClass();
                final int i3 = 0;
                g(i2, new Runnable(this) { // from class: net.luminis.quic.recovery.e
                    public final /* synthetic */ g y;

                    {
                        this.y = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.y.d.h(1, arrayList);
                                break;
                            default:
                                this.y.d.h(3, arrayList);
                                break;
                        }
                    }
                });
                return;
            } else {
                aVar.getClass();
                final int i4 = 0;
                g(i2, new Runnable(this) { // from class: net.luminis.quic.recovery.d
                    public final /* synthetic */ g y;

                    {
                        this.y = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.y.d.h(1, listB);
                                break;
                            default:
                                this.y.d.h(3, listB);
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i != 2) {
            int iD = com.google.android.datatransport.runtime.backends.c.d(i);
            List listB2 = b(i);
            if (listB2.isEmpty()) {
                aVar.getClass();
                g(i2, new androidx.activity.n(this, arrayList, iD, 5));
                return;
            } else {
                aVar.getClass();
                g(i2, new androidx.activity.n(this, listB2, iD, 4));
                return;
            }
        }
        final List listB3 = b(2);
        if (listB3.isEmpty()) {
            aVar.getClass();
            final int i5 = 1;
            g(i2, new Runnable(this) { // from class: net.luminis.quic.recovery.e
                public final /* synthetic */ g y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            this.y.d.h(1, arrayList);
                            break;
                        default:
                            this.y.d.h(3, arrayList);
                            break;
                    }
                }
            });
        } else {
            aVar.getClass();
            final int i6 = 1;
            g(i2, new Runnable(this) { // from class: net.luminis.quic.recovery.d
                public final /* synthetic */ g y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            this.y.d.h(1, listB3);
                            break;
                        default:
                            this.y.d.h(3, listB3);
                            break;
                    }
                }
            });
        }
    }

    public final void j() {
        net.luminis.quic.log.a aVar = this.e;
        net.luminis.quic.packet.f fVarA = a(new androidx.media3.exoplayer.audio.f(2));
        Long l = fVarA != null ? fVarA.c : null;
        if (l != null) {
            h(l);
            return;
        }
        boolean z = false;
        for (a aVar2 : this.c) {
            if (aVar2.g.get() != 0) {
                z = true;
                break;
            }
        }
        boolean zF = f();
        if (!z && !zF) {
            aVar.getClass();
            this.h.cancel(true);
            this.k = null;
            return;
        }
        net.luminis.quic.packet.f fVarC = c();
        if (fVarC != null) {
            h(fVarC.c);
            aVar.getClass();
        } else {
            aVar.getClass();
            this.h.cancel(true);
            this.k = null;
        }
    }
}
