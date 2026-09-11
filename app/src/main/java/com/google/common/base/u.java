package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements t, Serializable {
    public transient Object A;
    public final transient Object e = new Object();
    public final t y;
    public volatile transient boolean z;

    public u(t tVar) {
        tVar.getClass();
        this.y = tVar;
    }

    @Override // com.google.common.base.t
    public final Object get() {
        if (!this.z) {
            synchronized (this.e) {
                try {
                    if (!this.z) {
                        Object obj = this.y.get();
                        this.A = obj;
                        this.z = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.A;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.z) {
            obj = "<supplier that returned " + this.A + ">";
        } else {
            obj = this.y;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
