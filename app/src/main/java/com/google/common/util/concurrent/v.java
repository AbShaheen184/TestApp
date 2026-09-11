package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.google.android.material.resources.c {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicIntegerFieldUpdater b;

    public v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.material.resources.c
    public final void e(c0 c0Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(c0Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c0Var) == null);
    }

    @Override // com.google.android.material.resources.c
    public final int g(c0 c0Var) {
        return this.b.decrementAndGet(c0Var);
    }
}
