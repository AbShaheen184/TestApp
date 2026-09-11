package androidx.collection;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class y0 {
    public int[] e;
    public Object[] y;
    public int z;

    public y0(int i) {
        this.e = i == 0 ? androidx.collection.internal.a.a : new int[i];
        this.y = i == 0 ? androidx.collection.internal.a.c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.z * 2;
        Object[] objArr = this.y;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.z;
        int[] iArr = this.e;
        if (iArr.length < i) {
            this.e = Arrays.copyOf(iArr, i);
            this.y = Arrays.copyOf(this.y, i * 2);
        }
        if (this.z == i2) {
            return;
        }
        g.d();
    }

    public final int c(int i, Object obj) {
        int i2 = this.z;
        if (i2 == 0) {
            return -1;
        }
        int iA = androidx.collection.internal.a.a(this.e, i2, i);
        if (iA < 0 || kotlin.jvm.internal.l.a(obj, this.y[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.e[i3] == i) {
            if (kotlin.jvm.internal.l.a(obj, this.y[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.e[i4] == i; i4--) {
            if (kotlin.jvm.internal.l.a(obj, this.y[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.z > 0) {
            this.e = androidx.collection.internal.a.a;
            this.y = androidx.collection.internal.a.c;
            this.z = 0;
        }
        if (this.z <= 0) {
            return;
        }
        g.d();
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.z;
        if (i == 0) {
            return -1;
        }
        int iA = androidx.collection.internal.a.a(this.e, i, 0);
        if (iA < 0 || this.y[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.e[i2] == 0) {
            if (this.y[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.e[i3] == 0; i3--) {
            if (this.y[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof y0) {
                int i = this.z;
                if (i != ((y0) obj).z) {
                    return false;
                }
                y0 y0Var = (y0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objI = i(i2);
                    Object obj2 = y0Var.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !y0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.z != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.z;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objI2 = i(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.z) {
            z = true;
        }
        if (z) {
            return this.y[i << 1];
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.z)) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.y;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.e;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                kotlin.collections.n.C(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.y;
                kotlin.collections.n.D(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.y;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.e = Arrays.copyOf(iArr, i7);
            this.y = Arrays.copyOf(this.y, i7 << 1);
            if (i2 != this.z) {
                g.d();
                return null;
            }
            if (i > 0) {
                kotlin.collections.n.C(0, 0, i, iArr, this.e);
                kotlin.collections.n.D(0, 0, i3, objArr, this.y);
            }
            if (i < i4) {
                int i8 = i + 1;
                kotlin.collections.n.C(i, i8, i2, iArr, this.e);
                kotlin.collections.n.D(i3, i8 << 1, i2 << 1, objArr, this.y);
            }
        }
        if (i2 == this.z) {
            this.z = i4;
            return obj;
        }
        g.d();
        return null;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.y[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.y[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.z) {
            z = true;
        }
        if (!z) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.y;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.e;
        Object[] objArr = this.y;
        int i = this.z;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        boolean z = false;
        if (i >= 0 && i < this.z) {
            z = true;
        }
        if (z) {
            return this.y[(i << 1) + 1];
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        return this.z <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.z;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.y;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.e;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.e = Arrays.copyOf(iArr, i4);
            this.y = Arrays.copyOf(this.y, i4 << 1);
            if (i != this.z) {
                g.d();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.e;
            int i5 = i3 + 1;
            kotlin.collections.n.C(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.y;
            kotlin.collections.n.D(i5 << 1, i3 << 1, this.z << 1, objArr2, objArr2);
        }
        int i6 = this.z;
        if (i == i6) {
            int[] iArr3 = this.e;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.y;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.z = i6 + 1;
                return null;
            }
        }
        g.d();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !kotlin.jvm.internal.l.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !kotlin.jvm.internal.l.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    public final int size() {
        return this.z;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.z * 28);
        sb.append('{');
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }
}
