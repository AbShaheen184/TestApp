package com.google.common.util.concurrent;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends AbstractOwnableSynchronizer implements Runnable {
    public final s0 e;

    public r0(s0 s0Var) {
        this.e = s0Var;
    }

    public static void a(r0 r0Var, Thread thread) {
        r0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
