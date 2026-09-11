package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HashedWeakRef<T> extends WeakReference<T> {
    public final int hash;

    public HashedWeakRef(T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.hash = t != null ? t.hashCode() : 0;
    }
}
