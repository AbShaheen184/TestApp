package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
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
public abstract class r implements ListenableFuture {
    public static final boolean A;
    public static final t0 B;
    public static final com.google.android.material.resources.b C;
    public static final Object D;
    public volatile Object e;
    public volatile f y;
    public volatile q z;

    static {
        boolean z;
        Throwable th;
        com.google.android.material.resources.b iVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        A = z;
        B = new t0(r.class);
        Throwable th2 = null;
        try {
            iVar = new p();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                iVar = new g(AtomicReferenceFieldUpdater.newUpdater(q.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(q.class, q.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r.class, q.class, "z"), AtomicReferenceFieldUpdater.newUpdater(r.class, f.class, "y"), AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "e"));
            } catch (Error | Exception e2) {
                th2 = e2;
                iVar = new i();
            }
        }
        C = iVar;
        if (th2 != null) {
            t0 t0Var = B;
            Logger loggerA = t0Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            t0Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        D = new Object();
    }

    public static void e(r rVar, boolean z) {
        f fVar = null;
        while (true) {
            for (q qVarK = C.k(rVar); qVarK != null; qVarK = qVarK.b) {
                Thread thread = qVarK.a;
                if (thread != null) {
                    qVarK.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                rVar.i();
                z = false;
            }
            rVar.c();
            f fVar2 = fVar;
            f fVarJ = C.j(rVar);
            f fVar3 = fVar2;
            while (fVarJ != null) {
                f fVar4 = fVarJ.c;
                fVarJ.c = fVar3;
                fVar3 = fVarJ;
                fVarJ = fVar4;
            }
            while (fVar3 != null) {
                fVar = fVar3.c;
                Runnable runnable = fVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof h) {
                    h hVar = (h) runnable;
                    rVar = hVar.e;
                    if (rVar.e == hVar) {
                        if (C.d(rVar, hVar, h(hVar.y))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = fVar3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                fVar3 = fVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            B.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            Throwable th = ((d) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof e) {
            throw new ExecutionException(((e) obj).a);
        }
        if (obj == D) {
            return null;
        }
        return obj;
    }

    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thO;
        if (listenableFuture instanceof j) {
            Object dVar = ((r) listenableFuture).e;
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                if (dVar2.a) {
                    dVar = dVar2.b != null ? new d(dVar2.b, false) : d.d;
                }
            }
            Objects.requireNonNull(dVar);
            return dVar;
        }
        if ((listenableFuture instanceof r) && (thO = ((r) listenableFuture).o()) != null) {
            return new e(thO);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!A) && zIsCancelled) {
            d dVar3 = d.d;
            Objects.requireNonNull(dVar3);
            return dVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new e(e);
                    } catch (CancellationException e2) {
                        if (zIsCancelled) {
                            return new d(e2, false);
                        }
                        return new e(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                    } catch (ExecutionException e3) {
                        if (!zIsCancelled) {
                            return new e(e3.getCause());
                        }
                        return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3), false);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e4) {
                e = e4;
                return new e(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? D : obj;
        }
        return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void a(Runnable runnable, Executor executor) {
        f fVar;
        f fVar2 = f.d;
        com.google.android.material.motion.a.m(executor, "Executor was null.");
        if (!isDone() && (fVar = this.y) != fVar2) {
            f fVar3 = new f(runnable, executor);
            do {
                fVar3.c = fVar;
                if (C.c(this, fVar, fVar3)) {
                    return;
                } else {
                    fVar = this.y;
                }
            } while (fVar != fVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        d dVar;
        Object obj = this.e;
        if (!(obj == null) && !(obj instanceof h)) {
            return false;
        }
        if (A) {
            dVar = new d(new CancellationException("Future.cancel() was called."), z);
        } else {
            dVar = z ? d.c : d.d;
            Objects.requireNonNull(dVar);
        }
        r rVar = this;
        boolean z2 = false;
        while (true) {
            if (C.d(rVar, obj, dVar)) {
                e(rVar, z);
                if (obj instanceof h) {
                    ListenableFuture listenableFuture = ((h) obj).y;
                    if (listenableFuture instanceof j) {
                        rVar = (r) listenableFuture;
                        obj = rVar.e;
                        if ((obj == null) | (obj instanceof h)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = rVar.e;
            if (!(obj instanceof h)) {
                return z2;
            }
        }
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        q qVar = q.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.e;
        if ((obj != null) && (!(obj instanceof h))) {
            return g(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            q qVar2 = this.z;
            if (qVar2 != qVar) {
                q qVar3 = new q();
                z = true;
                while (true) {
                    com.google.android.material.resources.b bVar = C;
                    bVar.r(qVar3, qVar2);
                    if (bVar.e(this, qVar2, qVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(qVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.e;
                            if ((obj2 != null) && (!(obj2 instanceof h))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(qVar3);
                        break;
                    }
                    long j4 = j3;
                    qVar2 = this.z;
                    if (qVar2 != qVar) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.e;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.e;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof h))) {
                return g(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
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
    public boolean isCancelled() {
        return this.e instanceof d;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.e;
        return (!(obj instanceof h)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(q qVar) {
        qVar.a = null;
        while (true) {
            q qVar2 = this.z;
            if (qVar2 == q.c) {
                return;
            }
            q qVar3 = null;
            while (qVar2 != null) {
                q qVar4 = qVar2.b;
                if (qVar2.a != null) {
                    qVar3 = qVar2;
                } else if (qVar3 != null) {
                    qVar3.b = qVar4;
                    if (qVar3.a == null) {
                    }
                } else if (!C.e(this, qVar2, qVar4)) {
                }
                qVar2 = qVar4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = D;
        }
        if (!C.d(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!C.d(this, null, new e(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean n(ListenableFuture listenableFuture) {
        e eVar;
        listenableFuture.getClass();
        Object obj = this.e;
        if (obj != null) {
            if (obj instanceof d) {
                listenableFuture.cancel(((d) obj).a);
            }
        } else if (listenableFuture.isDone()) {
            if (C.d(this, null, h(listenableFuture))) {
                e(this, false);
                return true;
            }
        } else {
            h hVar = new h(this, listenableFuture);
            if (C.d(this, null, hVar)) {
                try {
                    listenableFuture.a(hVar, d0.e);
                    return true;
                } catch (Throwable th) {
                    try {
                        eVar = new e(th);
                    } catch (Error | Exception unused) {
                        eVar = e.b;
                    }
                    C.d(this, hVar, eVar);
                    return true;
                }
            }
            obj = this.e;
            if (obj instanceof d) {
                listenableFuture.cancel(((d) obj).a);
            }
        }
        return false;
    }

    public final Throwable o() {
        if (!(this instanceof j)) {
            return null;
        }
        Object obj = this.e;
        if (obj instanceof e) {
            return ((e) obj).a;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.e;
        return (obj instanceof d) && ((d) obj).a;
    }

    public String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.e;
            if (obj instanceof h) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((h) obj).y;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strJ = j();
                    if (com.google.common.base.i.u(strJ)) {
                        strJ = null;
                    }
                } catch (Exception | StackOverflowError e3) {
                    strJ = "Exception thrown from implementation: " + e3.getClass();
                }
                if (strJ != null) {
                    sb.append(", info=[");
                    sb.append(strJ);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        q qVar = q.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) & (!(obj2 instanceof h))) {
                return g(obj2);
            }
            q qVar2 = this.z;
            if (qVar2 != qVar) {
                q qVar3 = new q();
                do {
                    com.google.android.material.resources.b bVar = C;
                    bVar.r(qVar3, qVar2);
                    if (bVar.e(this, qVar2, qVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                k(qVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof h))));
                        return g(obj);
                    }
                    qVar2 = this.z;
                } while (qVar2 != qVar);
            }
            Object obj3 = this.e;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
