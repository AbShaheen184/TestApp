package androidx.compose.runtime.collection;

import androidx.collection.h0;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements RandomAccess {
    public Object[] e;
    public h0 y;
    public int z = 0;

    public b(Object[] objArr) {
        this.e = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.z + 1;
        if (this.e.length < i2) {
            n(i2);
        }
        Object[] objArr = this.e;
        int i3 = this.z;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.z++;
    }

    public final void b(Object obj) {
        int i = this.z + 1;
        if (this.e.length < i) {
            n(i);
        }
        Object[] objArr = this.e;
        int i2 = this.z;
        objArr[i2] = obj;
        this.z = i2 + 1;
    }

    public final void c(int i, b bVar) {
        int i2 = bVar.z;
        if (i2 == 0) {
            return;
        }
        int i3 = this.z + i2;
        if (this.e.length < i3) {
            n(i3);
        }
        Object[] objArr = this.e;
        int i4 = this.z;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(bVar.e, 0, objArr, i, i2);
        this.z += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.z + size;
        if (this.e.length < i2) {
            n(i2);
        }
        Object[] objArr = this.e;
        int i3 = this.z;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.z += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.z + size;
        if (this.e.length < i3) {
            n(i3);
        }
        Object[] objArr = this.e;
        int i4 = this.z;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.z += size;
        return true;
    }

    public final List f() {
        h0 h0Var = this.y;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this, 1);
        this.y = h0Var2;
        return h0Var2;
    }

    public final void g() {
        Object[] objArr = this.e;
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.z = 0;
    }

    public final boolean h(Object obj) {
        int i = this.z - 1;
        if (i >= 0) {
            for (int i2 = 0; !l.a(this.e[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.e;
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (l.a(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final Object k(int i) {
        Object[] objArr = this.e;
        Object obj = objArr[i];
        int i2 = this.z;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.z - 1;
        this.z = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.z;
            if (i2 < i3) {
                Object[] objArr = this.e;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.z;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.e[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.z = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.e;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.e = objArr2;
    }
}
