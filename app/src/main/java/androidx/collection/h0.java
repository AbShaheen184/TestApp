package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements List, kotlin.jvm.internal.markers.b {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ h0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        switch (this.e) {
            case 0:
                j0 j0Var = (j0) this.y;
                if (i < 0 || i > (i2 = j0Var.b)) {
                    j0Var.o(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = j0Var.a;
                if (objArr.length < i3) {
                    j0Var.m(i3, objArr);
                }
                Object[] objArr2 = j0Var.a;
                int i4 = j0Var.b;
                if (i != i4) {
                    kotlin.collections.n.D(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                j0Var.b++;
                return;
            default:
                ((androidx.compose.runtime.collection.b) this.y).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                j0 j0Var = (j0) this.y;
                if (i < 0 || i > j0Var.b) {
                    j0Var.o(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + j0Var.b;
                Object[] objArr = j0Var.a;
                if (objArr.length < size) {
                    j0Var.m(size, objArr);
                }
                Object[] objArr2 = j0Var.a;
                if (i != j0Var.b) {
                    kotlin.collections.n.D(collection.size() + i, i, j0Var.b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        com.google.common.base.c.w();
                        throw null;
                    }
                    objArr2[i2 + i] = obj;
                    i2 = i3;
                }
                j0Var.b = collection.size() + j0Var.b;
                return true;
            default:
                return ((androidx.compose.runtime.collection.b) this.y).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((j0) this.y).d();
                break;
            default:
                ((androidx.compose.runtime.collection.b) this.y).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((j0) this.y).g(obj) >= 0;
            default:
                return ((androidx.compose.runtime.collection.b) this.y).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                j0 j0Var = (j0) this.y;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (j0Var.g(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!bVar.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.e) {
            case 0:
                u0.a(i, this);
                return ((j0) this.y).f(i);
            default:
                androidx.compose.runtime.collection.c.a(i, this);
                return ((androidx.compose.runtime.collection.b) this.y).e[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.e) {
            case 0:
                return ((j0) this.y).g(obj);
            default:
                return ((androidx.compose.runtime.collection.b) this.y).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                return ((j0) this.y).h();
            default:
                return ((androidx.compose.runtime.collection.b) this.y).z == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new g0(0, this, 0);
            default:
                return new g0(0, this, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        switch (this.e) {
            case 0:
                j0 j0Var = (j0) this.y;
                Object[] objArr = j0Var.a;
                int i2 = j0Var.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
                Object[] objArr2 = bVar.e;
                for (int i3 = bVar.z - 1; i3 >= 0; i3--) {
                    if (kotlin.jvm.internal.l.a(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new g0(0, this, 0);
            default:
                return new g0(0, this, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.e) {
            case 0:
                u0.a(i, this);
                return ((j0) this.y).k(i);
            default:
                androidx.compose.runtime.collection.c.a(i, this);
                return ((androidx.compose.runtime.collection.b) this.y).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                j0 j0Var = (j0) this.y;
                int i = j0Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    j0Var.j(it.next());
                }
                return i != j0Var.b;
            default:
                androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
                if (!collection.isEmpty()) {
                    int i2 = bVar.z;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        bVar.j(it2.next());
                    }
                    if (i2 != bVar.z) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                j0 j0Var = (j0) this.y;
                int i = j0Var.b;
                Object[] objArr = j0Var.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        j0Var.k(i2);
                    }
                }
                return i != j0Var.b;
            default:
                androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
                int i3 = bVar.z;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(bVar.e[i4])) {
                        bVar.k(i4);
                    }
                }
                return i3 != bVar.z;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.e) {
            case 0:
                u0.a(i, this);
                j0 j0Var = (j0) this.y;
                if (i < 0 || i >= j0Var.b) {
                    j0Var.n(i);
                    throw null;
                }
                Object[] objArr = j0Var.a;
                Object obj2 = objArr[i];
                objArr[i] = obj;
                return obj2;
            default:
                androidx.compose.runtime.collection.c.a(i, this);
                Object[] objArr2 = ((androidx.compose.runtime.collection.b) this.y).e;
                Object obj3 = objArr2[i];
                objArr2[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((j0) this.y).b;
            default:
                return ((androidx.compose.runtime.collection.b) this.y).z;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.e) {
            case 0:
                u0.b(i, this, i2);
                return new i0(this, i, i2, 0);
            default:
                androidx.compose.runtime.collection.c.b(i, this, i2);
                return new i0(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                break;
        }
        return kotlin.jvm.internal.k.c(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.k.b(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new g0(i, this, 0);
            default:
                return new g0(i, this, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                return ((j0) this.y).j(obj);
            default:
                return ((androidx.compose.runtime.collection.b) this.y).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((j0) this.y).a(obj);
                break;
            default:
                ((androidx.compose.runtime.collection.b) this.y).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                j0 j0Var = (j0) this.y;
                int i = j0Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    j0Var.a(it.next());
                }
                return i != j0Var.b;
            default:
                androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.y;
                return bVar.e(bVar.z, collection);
        }
    }
}
