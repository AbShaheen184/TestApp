package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final Object a = new Object();
    public static final long[] b = new long[0];
    public static final Object c = new Object();

    public static final void a(z0 z0Var) {
        int i = z0Var.A;
        int[] iArr = z0Var.y;
        Object[] objArr = z0Var.z;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != c) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        z0Var.e = false;
        z0Var.A = i2;
    }

    public static final int b(h hVar, Object obj, int i) {
        int i2 = hVar.z;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA = androidx.collection.internal.a.a(hVar.e, i2, i);
            if (iA < 0 || kotlin.jvm.internal.l.a(obj, hVar.y[iA])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && hVar.e[i3] == i) {
                if (kotlin.jvm.internal.l.a(obj, hVar.y[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && hVar.e[i4] == i; i4--) {
                if (kotlin.jvm.internal.l.a(obj, hVar.y[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            g.d();
            return 0;
        }
    }
}
