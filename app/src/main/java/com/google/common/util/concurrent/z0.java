package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends s0 {
    public final /* synthetic */ a1 A;
    public final Object B;
    public final /* synthetic */ int z = 0;

    public z0(a1 a1Var, Callable callable) {
        this.A = a1Var;
        callable.getClass();
        this.B = callable;
    }

    @Override // com.google.common.util.concurrent.s0
    public final void a(Throwable th) {
        switch (this.z) {
            case 0:
                this.A.m(th);
                break;
            default:
                this.A.m(th);
                break;
        }
    }

    @Override // com.google.common.util.concurrent.s0
    public final void b(Object obj) {
        switch (this.z) {
            case 0:
                this.A.n((ListenableFuture) obj);
                break;
            default:
                this.A.l(obj);
                break;
        }
    }

    @Override // com.google.common.util.concurrent.s0
    public final boolean d() {
        switch (this.z) {
            case 0:
                break;
        }
        return this.A.isDone();
    }

    @Override // com.google.common.util.concurrent.s0
    public final Object e() {
        switch (this.z) {
            case 0:
                y yVar = (y) this.B;
                ListenableFuture listenableFutureCall = yVar.call();
                com.google.android.material.motion.a.l(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", yVar);
                return listenableFutureCall;
            default:
                return ((Callable) this.B).call();
        }
    }

    @Override // com.google.common.util.concurrent.s0
    public final String f() {
        switch (this.z) {
            case 0:
                return ((y) this.B).toString();
            default:
                return ((Callable) this.B).toString();
        }
    }

    public z0(a1 a1Var, y yVar) {
        this.A = a1Var;
        this.B = yVar;
    }
}
