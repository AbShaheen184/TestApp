package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h, Serializable {
    public static final AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "y");
    public volatile kotlin.jvm.functions.a e;
    public volatile Object y;

    @Override // kotlin.h
    public final Object getValue() {
        Object obj = this.y;
        v vVar = v.a;
        if (obj != vVar) {
            return obj;
        }
        kotlin.jvm.functions.a aVar = this.e;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.e = null;
            return objInvoke;
        }
        return this.y;
    }

    public final String toString() {
        return this.y != v.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
