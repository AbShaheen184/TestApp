package androidx.compose.ui.node;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements List, kotlin.jvm.internal.markers.a {
    public final androidx.collection.j0 e = new androidx.collection.j0(16);
    public final androidx.collection.b0 y = new androidx.collection.b0(16);
    public int z = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jA = k.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.z + 1;
        int i2 = this.e.b - 1;
        if (i > i2) {
            return jA;
        }
        while (true) {
            androidx.collection.b0 b0Var = this.y;
            if (i < 0) {
                b0Var.getClass();
                break;
            }
            if (i >= b0Var.b) {
                break;
            }
            long j = b0Var.a[i];
            if (k.g(j, jA) < 0) {
                jA = j;
            }
            if ((k.i(jA) < 0.0f && k.n(jA)) || i == i2) {
                return jA;
            }
            i++;
        }
        com.google.gson.b.n("Index must be between 0 and size");
        return 0L;
    }

    public final void c(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.e.l(i, i2);
        androidx.collection.b0 b0Var = this.y;
        if (i >= 0) {
            int i3 = b0Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    net.luminis.tls.engine.impl.c.o("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = b0Var.a;
                            kotlin.collections.n.F(jArr, jArr, i, i2, i3);
                        }
                        b0Var.b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            b0Var.getClass();
        }
        com.google.gson.b.n("Index must be between 0 and size");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.z = -1;
        this.e.d();
        this.y.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof androidx.compose.ui.q) && indexOf((androidx.compose.ui.q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objF = this.e.f(i);
        objF.getClass();
        return (androidx.compose.ui.q) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof androidx.compose.ui.q)) {
            return -1;
        }
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!kotlin.jvm.internal.l.a(this.e.f(i), qVar)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.e.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new androidx.compose.runtime.snapshots.u(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof androidx.compose.ui.q)) {
            return -1;
        }
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (kotlin.jvm.internal.l.a(this.e.f(size), qVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new androidx.compose.runtime.snapshots.u(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new o(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.b(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.c(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new androidx.compose.runtime.snapshots.u(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
