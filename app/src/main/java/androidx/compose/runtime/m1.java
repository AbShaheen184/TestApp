package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final androidx.collection.z e;
    public final kotlin.o f;

    public m1(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            n1.a("Invalid start index");
        }
        this.d = new ArrayList();
        androidx.collection.z zVar = new androidx.collection.z();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            s0 s0Var = (s0) this.a.get(i3);
            int i4 = s0Var.c;
            int i5 = s0Var.d;
            zVar.h(i4, new l0(i3, i2, i5));
            i2 += i5;
        }
        this.e = zVar;
        this.f = new kotlin.o(new l1(this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        androidx.collection.z zVar = this.e;
        l0 l0Var = (l0) zVar.b(i);
        if (l0Var == null) {
            return false;
        }
        int i4 = l0Var.b;
        int i5 = i2 - l0Var.c;
        l0Var.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = zVar.c;
        long[] jArr = zVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        l0 l0Var2 = (l0) objArr[(i6 << 3) + i8];
                        if (l0Var2.b >= i4 && !l0Var2.equals(l0Var) && (i3 = l0Var2.b + i5) >= 0) {
                            l0Var2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
