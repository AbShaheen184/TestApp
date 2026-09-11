package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.google.android.material.resources.b {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.material.resources.b
    public final boolean c(r rVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == fVar);
        return false;
    }

    @Override // com.google.android.material.resources.b
    public final boolean d(r rVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == obj);
        return false;
    }

    @Override // com.google.android.material.resources.b
    public final boolean e(r rVar, q qVar, q qVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, qVar, qVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == qVar);
        return false;
    }

    @Override // com.google.android.material.resources.b
    public final f j(r rVar) {
        return (f) this.d.getAndSet(rVar, f.d);
    }

    @Override // com.google.android.material.resources.b
    public final q k(r rVar) {
        return (q) this.c.getAndSet(rVar, q.c);
    }

    @Override // com.google.android.material.resources.b
    public final void r(q qVar, q qVar2) {
        this.b.lazySet(qVar, qVar2);
    }

    @Override // com.google.android.material.resources.b
    public final void s(q qVar, Thread thread) {
        this.a.lazySet(qVar, thread);
    }
}
