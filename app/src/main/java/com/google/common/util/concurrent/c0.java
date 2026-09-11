package com.google.common.util.concurrent;

import com.google.common.collect.p1;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends x {
    public static final t0 L = new t0(c0.class);
    public com.google.common.collect.b0 I;
    public final boolean J;
    public b0 K;

    public c0(com.google.common.collect.b0 b0Var, boolean z) {
        int size = b0Var.size();
        this.E = null;
        this.F = size;
        this.I = b0Var;
        this.J = z;
    }

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        com.google.common.collect.b0 b0Var = this.I;
        this.I = null;
        this.K = null;
        if ((this.e instanceof d) && (b0Var != null)) {
            boolean zP = p();
            p1 it = b0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // com.google.common.util.concurrent.r
    public final void i() {
        b0 b0Var = this.K;
        if (b0Var != null) {
            b0Var.c();
        }
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        com.google.common.collect.b0 b0Var = this.I;
        if (b0Var == null) {
            return super.j();
        }
        return "futures=" + b0Var;
    }

    public final void q(com.google.common.collect.b0 b0Var) {
        int iG = x.G.g(this);
        com.google.android.material.motion.a.p("Less than 0 remaining futures", iG >= 0);
        if (iG == 0) {
            if (b0Var != null) {
                p1 it = b0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
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
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                r(e.getCause());
                            } catch (Throwable th2) {
                                r(th2);
                            }
                        }
                    }
                }
            }
            this.E = null;
            b0 b0Var2 = this.K;
            if (b0Var2 != null) {
                try {
                    b0Var2.z.execute(b0Var2);
                } catch (RejectedExecutionException e2) {
                    b0Var2.A.m(e2);
                }
            }
            this.I = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        if (this.J && !m(th)) {
            Set set = this.E;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.e instanceof d)) {
                    Throwable thO = o();
                    Objects.requireNonNull(thO);
                    while (thO != null && setNewSetFromMap.add(thO)) {
                        thO = thO.getCause();
                    }
                }
                x.G.e(this, setNewSetFromMap);
                Set set2 = this.E;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    L.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        boolean z = th instanceof Error;
        if (z) {
            L.a().log(Level.SEVERE, z ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.I);
        if (this.I.isEmpty()) {
            b0 b0Var = this.K;
            if (b0Var != null) {
                try {
                    b0Var.z.execute(b0Var);
                    return;
                } catch (RejectedExecutionException e) {
                    b0Var.A.m(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.J;
        d0 d0Var = d0.e;
        if (!z) {
            androidx.media3.ui.c0 c0Var = new androidx.media3.ui.c0(4, this, (Object) null);
            p1 it = this.I.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    q(null);
                } else {
                    listenableFuture.a(c0Var, d0Var);
                }
            }
            return;
        }
        p1 it2 = this.I.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                t(listenableFuture2);
            } else {
                listenableFuture2.a(new androidx.media3.ui.c0(this, i, listenableFuture2), d0Var);
            }
            i = i2;
        }
    }

    public final void t(ListenableFuture listenableFuture) {
        try {
            boolean z = false;
            if (listenableFuture.isCancelled()) {
                this.I = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (ExecutionException e) {
                            r(e.getCause());
                        } catch (Throwable th) {
                            r(th);
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th2) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            q(null);
        } catch (Throwable th3) {
            q(null);
            throw th3;
        }
    }
}
