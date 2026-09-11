package androidx.compose.runtime.snapshots;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements ListIterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e = 1;
    public final Object y;
    public final /* synthetic */ Object z;

    public z(kotlin.collections.b0 b0Var, int i) {
        this.z = b0Var;
        List list = (List) b0Var.y;
        if (i >= 0 && i <= b0Var.b()) {
            this.y = list.listIterator(b0Var.b() - i);
            return;
        }
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Position index ", i, " must be in range [");
        sbV.append(new kotlin.ranges.d(0, b0Var.b(), 1));
        sbV.append("].");
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((kotlin.jvm.internal.x) this.y).e < ((a0) this.z).A - 1;
            default:
                return ((ListIterator) this.y).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                return ((kotlin.jvm.internal.x) this.y).e >= 0;
            default:
                return ((ListIterator) this.y).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.y;
                int i = xVar.e + 1;
                a0 a0Var = (a0) this.z;
                r.a(i, a0Var.A);
                xVar.e = i;
                return a0Var.get(i);
            default:
                return ((ListIterator) this.y).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return ((kotlin.jvm.internal.x) this.y).e + 1;
            default:
                return (((kotlin.collections.b0) this.z).size() - 1) - ((ListIterator) this.y).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.y;
                int i = xVar.e;
                a0 a0Var = (a0) this.z;
                r.a(i, a0Var.A);
                xVar.e = i - 1;
                return a0Var.get(i);
            default:
                return ((ListIterator) this.y).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.e) {
            case 0:
                return ((kotlin.jvm.internal.x) this.y).e;
            default:
                return (((kotlin.collections.b0) this.z).size() - 1) - ((ListIterator) this.y).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(kotlin.jvm.internal.x xVar, a0 a0Var) {
        this.y = xVar;
        this.z = a0Var;
    }
}
