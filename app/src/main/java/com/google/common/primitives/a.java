package com.google.common.primitives;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {
    public static final a z = new a(new int[0]);
    public final int[] e;
    public final int y;

    public a(int[] iArr) {
        int length = iArr.length;
        this.e = iArr;
        this.y = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && (i2 = this.y) == (i = (aVar = (a) obj).y)) {
            for (int i3 = 0; i3 < i2; i3++) {
                com.google.android.material.motion.a.j(i3, i2);
                int i4 = this.e[i3];
                com.google.android.material.motion.a.j(i3, i);
                if (i4 == aVar.e[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + this.e[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.y;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.e;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
