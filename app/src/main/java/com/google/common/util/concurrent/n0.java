package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static a a(ListenableFuture listenableFuture, Class cls, z zVar, Executor executor) {
        int i = c.I;
        a aVar = new a(listenableFuture, cls, zVar);
        listenableFuture.a(aVar, com.google.android.material.resources.g.m(executor, aVar));
        return aVar;
    }

    public static Object b(Future future) {
        Object obj;
        if (!future.isDone()) {
            net.luminis.tls.engine.impl.c.r(com.google.android.material.resources.b.p("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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

    public static p0 c(Exception exc) {
        p0 p0Var = new p0();
        p0Var.m(exc);
        return p0Var;
    }

    public static q0 d(Object obj) {
        return obj == null ? q0.y : new q0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        m0 m0Var = new m0();
        m0Var.E = listenableFuture;
        listenableFuture.a(m0Var, d0.e);
        return m0Var;
    }

    public static t f(ListenableFuture listenableFuture, com.google.common.base.f fVar, Executor executor) {
        int i = u.H;
        t tVar = new t(listenableFuture, fVar);
        listenableFuture.a(tVar, com.google.android.material.resources.g.m(executor, tVar));
        return tVar;
    }

    public static s g(ListenableFuture listenableFuture, z zVar, Executor executor) {
        int i = u.H;
        executor.getClass();
        s sVar = new s(listenableFuture, zVar);
        listenableFuture.a(sVar, com.google.android.material.resources.g.m(executor, sVar));
        return sVar;
    }
}
