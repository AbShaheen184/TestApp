package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z0 implements Serializable {
    public final com.google.common.base.f e;
    public final z0 y;

    public p(com.google.common.base.f fVar, z0 z0Var) {
        this.e = fVar;
        this.y = z0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.google.common.base.f fVar = this.e;
        return this.y.compare(fVar.apply(obj), fVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.e.equals(pVar.e) && this.y.equals(pVar.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.y});
    }

    public final String toString() {
        return this.y + ".onResultOf(" + this.e + ")";
    }
}
