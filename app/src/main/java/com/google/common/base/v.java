package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements t {
    public static final androidx.transition.k A = new androidx.transition.k(24);
    public final Object e = new Object();
    public volatile t y;
    public Object z;

    public v(t tVar) {
        tVar.getClass();
        this.y = tVar;
    }

    @Override // com.google.common.base.t
    public final Object get() {
        t tVar = this.y;
        androidx.transition.k kVar = A;
        if (tVar != kVar) {
            synchronized (this.e) {
                try {
                    if (this.y != kVar) {
                        Object obj = this.y.get();
                        this.z = obj;
                        this.y = kVar;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.z;
    }

    public final String toString() {
        Object obj = this.y;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == A) {
            obj = "<supplier that returned " + this.z + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
