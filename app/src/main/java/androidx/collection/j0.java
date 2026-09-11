package androidx.collection;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public Object[] a;
    public int b;
    public h0 c;

    public j0(int i) {
        this.a = i == 0 ? u0.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(j0 j0Var) {
        j0Var.getClass();
        if (j0Var.h()) {
            return;
        }
        int i = this.b + j0Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        kotlin.collections.n.D(this.b, 0, j0Var.b, j0Var.a, this.a);
        this.b += j0Var.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        kotlin.collections.n.K(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        androidx.transition.k.m("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            int i = j0Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = j0Var.a;
                kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, i2);
                int i3 = dVarR.e;
                int i4 = dVarR.y;
                if (i3 > i4) {
                    return true;
                }
                while (kotlin.jvm.internal.l.a(objArr[i3], objArr2[i3])) {
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

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        n(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        return this.b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            n(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            kotlin.collections.n.D(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.w("Start (", ") and end (", i, ") must be in 0..", i2), this.b);
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                kotlin.collections.n.D(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            kotlin.collections.n.K(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        kotlin.collections.n.D(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final void n(int i) {
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Index ", i, " must be in 0..");
        sbV.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    public final void o(int i) {
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Index ", i, " must be in 0..");
        sbV.append(this.b);
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ j0() {
        this(16);
    }
}
