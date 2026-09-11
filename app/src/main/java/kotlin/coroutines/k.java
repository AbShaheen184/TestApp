package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d, kotlin.coroutines.jvm.internal.d {
    public static final AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");
    public final d e;
    private volatile Object result;

    public k(d dVar) {
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        this.e = dVar;
        this.result = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        d dVar = this.e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public final i getContext() {
        return this.e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.y;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
            if (obj2 != aVar2) {
                net.luminis.tls.engine.impl.c.r("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y;
            kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.z;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.e.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.e;
    }
}
