package com.google.common.util.concurrent;

import com.google.android.gms.internal.measurement.j5;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends s0 {
    public final /* synthetic */ c0 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ c0 C;
    public final Object D;
    public final Executor z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Callable callable) {
        this(c0Var, d0.e);
        this.B = 1;
        this.C = c0Var;
        this.D = callable;
    }

    @Override // com.google.common.util.concurrent.s0
    public final void a(Throwable th) {
        c0 c0Var = this.A;
        c0Var.K = null;
        if (th instanceof ExecutionException) {
            c0Var.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c0Var.cancel(false);
        } else {
            c0Var.m(th);
        }
    }

    @Override // com.google.common.util.concurrent.s0
    public final void b(Object obj) {
        this.A.K = null;
        switch (this.B) {
            case 0:
                this.C.n((ListenableFuture) obj);
                break;
            default:
                this.C.l(obj);
                break;
        }
    }

    @Override // com.google.common.util.concurrent.s0
    public final boolean d() {
        return this.A.isDone();
    }

    @Override // com.google.common.util.concurrent.s0
    public final Object e() {
        switch (this.B) {
            case 0:
                return ((j5) this.D).call();
            default:
                return ((Callable) this.D).call();
        }
    }

    @Override // com.google.common.util.concurrent.s0
    public final String f() {
        switch (this.B) {
            case 0:
                return ((j5) this.D).toString();
            default:
                return ((Callable) this.D).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, j5 j5Var, Executor executor) {
        this(c0Var, executor);
        this.B = 0;
        this.C = c0Var;
        this.D = j5Var;
    }

    public b0(c0 c0Var, Executor executor) {
        this.A = c0Var;
        executor.getClass();
        this.z = executor;
    }
}
