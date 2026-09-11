package okhttp3.internal.concurrent;

import androidx.appcompat.widget.z0;
import com.google.android.material.shape.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.internal.e;
import okhttp3.internal.f;
import okhttp3.internal.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Logger k;
    public static final d l;
    public final c0 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final z0 j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        logger.getClass();
        k = logger;
        f fVar = new f(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), g.b, " TaskRunner"), true);
        c0 c0Var = new c0();
        c0Var.e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), fVar);
        l = new d(c0Var);
    }

    public d(c0 c0Var) {
        Logger logger = k;
        logger.getClass();
        this.a = c0Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new z0(this, 29);
    }

    public static final void a(d dVar, a aVar, long j, boolean z) {
        TimeZone timeZone = g.a;
        c cVar = aVar.c;
        cVar.getClass();
        if (cVar.d != aVar) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            return;
        }
        boolean z2 = cVar.f;
        cVar.f = false;
        cVar.d = null;
        dVar.h.remove(cVar);
        if (j != -1 && !z2 && !cVar.c) {
            cVar.f(aVar, j, true);
        }
        if (cVar.e.isEmpty()) {
            return;
        }
        dVar.i.add(cVar);
        if (z) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        boolean z;
        TimeZone timeZone = g.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).e.get(0);
                long jMax = Math.max(0L, aVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (aVar != null) {
                TimeZone timeZone2 = g.a;
                aVar.d = -1L;
                c cVar = aVar.c;
                cVar.getClass();
                cVar.e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar;
            }
            if (this.d) {
                if (jMin >= this.e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.d = true;
            this.e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = g.a;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = g.a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.d = false;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
        return null;
    }

    public final void c(c cVar) {
        cVar.getClass();
        TimeZone timeZone = g.a;
        if (cVar.d == null) {
            boolean zIsEmpty = cVar.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                byte[] bArr = e.a;
                arrayList.getClass();
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new c(this, androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = g.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        z0 z0Var = this.j;
        z0Var.getClass();
        ((ThreadPoolExecutor) this.a.e).execute(z0Var);
    }
}
