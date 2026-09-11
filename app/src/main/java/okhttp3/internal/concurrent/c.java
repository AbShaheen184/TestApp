package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a0;
import okhttp3.internal.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final d a;
    public final String b;
    public boolean c;
    public a d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public c(d dVar, String str) {
        this.a = dVar;
        this.b = str;
    }

    public static void c(c cVar, String str, long j, kotlin.jvm.functions.a aVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        cVar.getClass();
        str.getClass();
        aVar.getClass();
        cVar.d(new b(str, z, aVar), j);
    }

    public final void a() {
        d dVar = this.a;
        TimeZone timeZone = g.a;
        synchronized (dVar) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    a0.a(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(a aVar, long j) {
        aVar.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (f(aVar, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = aVar.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    a0.a(logger, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    a0.a(logger, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[LOOP:0: B:23:0x0062->B:28:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[EDGE_INSN: B:40:0x007a->B:30:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:28:0x0076], SYNTHETIC] */
    public final boolean f(a aVar, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.a.b;
        aVar.getClass();
        c cVar = aVar.c;
        if (cVar != this) {
            if (cVar != null) {
                net.luminis.tls.engine.impl.c.r("task is in multiple queues");
                return false;
            }
            aVar.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf == -1) {
            aVar.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(a0.o(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(a0.o(j2 - jNanoTime));
                }
                a0.a(logger, aVar, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, aVar);
            if (size == 0) {
                return true;
            }
        } else if (aVar.d > j2) {
            arrayList.remove(iIndexOf);
            aVar.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(a0.o(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(a0.o(j2 - jNanoTime));
                }
                a0.a(logger, aVar, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, aVar);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            a0.a(logger, aVar, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void g() {
        d dVar = this.a;
        TimeZone timeZone = g.a;
        synchronized (dVar) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
