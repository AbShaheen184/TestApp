package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public int[] a;
    public int b;

    public y(int i) {
        this.a = i == 0 ? p.a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        com.google.gson.b.n("Index must be between 0 and size");
        return 0;
    }

    public final void d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            com.google.gson.b.n("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            kotlin.collections.n.C(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final void e(int i, int i2) {
        if (i < 0 || i >= this.b) {
            com.google.gson.b.n("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            int i = yVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = yVar.a;
                kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, i2);
                int i3 = dVarR.e;
                int i4 = dVarR.y;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ y() {
        this(16);
    }
}
