package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z0 implements Serializable {
    public final Comparator[] e;

    public z(p pVar, p pVar2) {
        this.e = new Comparator[]{pVar, pVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.e;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return Arrays.equals(this.e, ((z) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("Ordering.compound("), Arrays.toString(this.e), ")");
    }
}
