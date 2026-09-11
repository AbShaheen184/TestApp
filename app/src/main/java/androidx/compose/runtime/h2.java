package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int iD = d(arrayList, i, i2);
        return iD >= 0 ? iD : -(iD + 1);
    }

    public static final int b(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int d(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((a) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iB = kotlin.jvm.internal.l.b(i5, i);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }
}
