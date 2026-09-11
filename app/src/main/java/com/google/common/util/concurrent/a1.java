package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends h0 implements RunnableFuture {
    public volatile s0 F;

    public a1(Callable callable) {
        this.F = new z0(this, callable);
    }

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        s0 s0Var;
        if (p() && (s0Var = this.F) != null) {
            s0Var.c();
        }
        this.F = null;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        s0 s0Var = this.F;
        if (s0Var == null) {
            return super.j();
        }
        return "task=[" + s0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            s0Var.run();
        }
        this.F = null;
    }
}
