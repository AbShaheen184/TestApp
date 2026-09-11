package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.google.firebase.crashlytics.internal.model.t1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c {
    public static final j y = new j(new Object[0]);
    public final Object[] e;

    public j(Object[] objArr) {
        this.e = objArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.e.length;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c c(int i, Object obj) {
        Object[] objArr = this.e;
        t1.f(i, objArr.length);
        if (i == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            n.H(0, i, 6, objArr, objArr2);
            n.D(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        n.D(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c d(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new j(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new f(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c e(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length > 32) {
            g gVarF = f();
            gVarF.addAll(collection);
            return gVarF.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new j(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final g f() {
        return new g(this, null, this.e, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.e;
        t1.e(i, objArr.length);
        return objArr[i];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c h(b bVar) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? y : new j(n.J(objArrCopyOf, 0, length));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c i(int i) {
        Object[] objArr = this.e;
        t1.e(i, objArr.length);
        if (objArr.length == 1) {
            return y;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        n.D(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new j(objArrCopyOf);
    }

    @Override // kotlin.collections.e, java.util.List
    public final int indexOf(Object obj) {
        return n.R(obj, this.e);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c j(int i, Object obj) {
        Object[] objArr = this.e;
        t1.e(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new j(objArrCopyOf);
    }

    @Override // kotlin.collections.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.e;
        t1.f(i, objArr.length);
        return new d(objArr, i, objArr.length);
    }
}
