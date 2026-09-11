package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Collection, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e = 1;
    public final Object y;

    public c1() {
        int i = v0.a;
        this.y = new k0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((k0) this.y).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((k0) this.y).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((o0) this.y).d(obj);
            default:
                return ((k0) this.y).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!((o0) this.y).d(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((k0) this.y).c(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                return ((o0) this.y).i();
            default:
                return ((k0) this.y).g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return com.google.android.material.resources.g.g(new i(this, null, 2));
            default:
                k0 k0Var = (k0) this.y;
                k0Var.getClass();
                return new m0(new n0(k0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((k0) this.y).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((k0) this.y).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((k0) this.y).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((o0) this.y).e;
            default:
                return ((k0) this.y).g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                break;
        }
        return kotlin.jvm.internal.k.c(this, objArr);
    }

    public c1(o0 o0Var) {
        o0Var.getClass();
        this.y = o0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.k.b(this);
    }
}
