package net.luminis.quic.recovery;

import com.google.android.gms.measurement.internal.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final g a;
    public final h b;
    public final net.luminis.quic.cc.a c;
    public final c d;
    public final e0 e;
    public volatile Long i;
    public volatile Long j;
    public volatile boolean k;
    public volatile long h = -1;
    public final AtomicInteger g = new AtomicInteger();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public a(g gVar, h hVar, net.luminis.quic.cc.a aVar, c cVar, e0 e0Var) {
        this.a = gVar;
        this.b = hVar;
        this.c = aVar;
        this.d = cVar;
        this.e = e0Var;
    }

    public static ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b.q()) {
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void a() {
        if (this.k) {
            return;
        }
        long jMax = (int) (1.125f * Integer.max(this.b.b(), this.b.f));
        long jCurrentTimeMillis = System.currentTimeMillis() - jMax;
        ArrayList<b> arrayList = new ArrayList();
        for (b bVar : this.f.values()) {
            if (bVar.a() && (bVar.b.l().longValue() <= this.h - ((long) 3) || (bVar.b.l().longValue() <= this.h && bVar.a.longValue() < jCurrentTimeMillis))) {
                if (!bVar.b.p()) {
                    arrayList.add(bVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<b> arrayList2 = new ArrayList();
            for (b bVar2 : arrayList) {
                synchronized (bVar2) {
                    if (!bVar2.e && !bVar2.d) {
                        bVar2.d = true;
                        arrayList2.add(bVar2);
                    }
                }
            }
            Iterator it = arrayList2.iterator();
            long j = 0;
            while (it.hasNext()) {
                if (((b) it.next()).b.o()) {
                    j++;
                }
            }
            this.g.getAndAdd(((int) j) * (-1));
            for (b bVar3 : arrayList2) {
                bVar3.c.accept(bVar3.b);
                e0 e0Var = this.e;
                System.currentTimeMillis();
                e0Var.getClass();
            }
            this.d.run();
            net.luminis.quic.cc.a aVar = this.c;
            ArrayList<b> arrayListB = b(arrayList2);
            synchronized (aVar) {
                try {
                    Iterator it2 = arrayListB.iterator();
                    int iN = 0;
                    while (it2.hasNext()) {
                        iN += ((b) it2.next()).b.n();
                    }
                    long j2 = iN;
                    aVar.b -= j2;
                    aVar.d.j();
                    if (j2 > 0) {
                        aVar.a();
                        net.luminis.quic.log.a aVar2 = aVar.a;
                        arrayListB.size();
                        aVar2.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayListB.isEmpty()) {
                b bVar4 = null;
                boolean z = false;
                for (b bVar5 : arrayListB) {
                    if (!z || bVar5.b.l().compareTo(bVar4.b.l()) > 0) {
                        bVar4 = bVar5;
                        z = true;
                    }
                }
                if (!z) {
                    bVar4 = null;
                }
                if (bVar4.a.longValue() > aVar.f.longValue()) {
                    aVar.f = Long.valueOf(System.currentTimeMillis());
                    aVar.c /= (long) 2;
                    long j3 = 2400;
                    if (aVar.c < j3) {
                        aVar.c = j3;
                    }
                    aVar.a.getClass();
                    aVar.e = aVar.c;
                }
            }
            aVar.a.i();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                this.f.remove(((b) it3.next()).b.l());
            }
        }
        Long l = null;
        boolean z2 = false;
        for (b bVar6 : this.f.values()) {
            if (bVar6.a() && bVar6.b.l().longValue() <= this.h && !bVar6.b.p()) {
                Long l2 = bVar6.a;
                if (!z2 || l2.longValue() < l.longValue()) {
                    l = l2;
                    z2 = true;
                }
            }
        }
        if (!z2) {
            l = null;
        }
        if (l == null || l.longValue() <= jCurrentTimeMillis) {
            this.i = null;
        } else {
            this.i = Long.valueOf(l.longValue() + jMax);
        }
    }

    public final synchronized void c() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f.values().iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar.a()) {
                        synchronized (bVar) {
                            try {
                                if (!bVar.e && !bVar.d) {
                                    bVar.d = true;
                                    z = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z) {
                            arrayList.add(bVar);
                        }
                    }
                } else {
                    this.c.b(arrayList);
                    this.g.set(0);
                    this.f.clear();
                    this.i = null;
                    this.j = null;
                    this.k = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
