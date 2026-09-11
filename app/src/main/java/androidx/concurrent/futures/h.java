package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ListenableFuture {
    public static final boolean A = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger B = Logger.getLogger(h.class.getName());
    public static final kotlin.math.a C;
    public static final Object D;
    public volatile Object e;
    public volatile d y;
    public volatile g z;

    static {
        kotlin.math.a fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "z"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "y"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "e"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        C = fVar;
        if (th != null) {
            B.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        D = new Object();
    }

    public static void f(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.z;
        } while (!C.o(hVar, gVar, g.c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.a;
            if (thread != null) {
                gVar.a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.b;
        }
        hVar.e();
        do {
            dVar2 = hVar.y;
        } while (!C.m(hVar, dVar2, d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.c;
            dVar.c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.c;
            g(dVar3.a, dVar3.b);
            dVar3 = dVar4;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            B.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == D) {
            return null;
        }
        return obj;
    }

    public static Object i(h hVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        d dVar = this.y;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (C.m(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.y;
                }
            } while (dVar != dVar2);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        a aVar;
        Object obj = this.e;
        if (obj == null) {
            if (A) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z);
            } else {
                aVar = z ? a.c : a.d;
            }
            if (C.n(this, obj, aVar)) {
                f(this);
                return true;
            }
        }
        return false;
    }

    public final void d(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objI == this ? "this future" : String.valueOf(objI));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g gVar = g.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.e;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.z;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                while (true) {
                    kotlin.math.a aVar = C;
                    aVar.B(gVar3, gVar2);
                    if (aVar.o(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.e;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(gVar3);
                        break;
                    }
                    gVar2 = this.z;
                    if (gVar2 == gVar) {
                    }
                }
            }
            return h(this.e);
        }
        while (nanos > 0) {
            Object obj3 = this.e;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "Waited ", " ");
        sbM.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(g gVar) {
        gVar.a = null;
        while (true) {
            g gVar2 = this.z;
            if (gVar2 == g.c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.b;
                if (gVar2.a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.b = gVar4;
                    if (gVar3.a == null) {
                    }
                } else if (!C.o(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = D;
        }
        if (!C.n(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!C.n(this, null, new c(th))) {
            return false;
        }
        f(this);
        return true;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.e instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e) {
                strJ = "Exception thrown from implementation: " + e.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strJ);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if (obj2 != null) {
                return h(obj2);
            }
            g gVar2 = this.z;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    kotlin.math.a aVar = C;
                    aVar.B(gVar3, gVar2);
                    if (aVar.o(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                k(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    gVar2 = this.z;
                } while (gVar2 != gVar);
            }
            return h(this.e);
        }
        throw new InterruptedException();
    }
}
