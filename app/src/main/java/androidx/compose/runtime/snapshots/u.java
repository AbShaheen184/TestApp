package androidx.compose.runtime.snapshots;

import androidx.collection.j0;
import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ListIterator, kotlin.jvm.internal.markers.a {
    public int A;
    public final Object B;
    public final /* synthetic */ int e;
    public int y;
    public int z;

    public u(q qVar, int i) {
        this.e = 0;
        this.B = qVar;
        this.y = i - 1;
        this.z = -1;
        this.A = r.g(qVar);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                d();
                q qVar = (q) this.B;
                qVar.add(this.y + 1, obj);
                this.z = -1;
                this.y++;
                this.A = r.g(qVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                b();
                kotlin.collections.builders.a aVar = (kotlin.collections.builders.a) this.B;
                int i = this.y;
                this.y = i + 1;
                aVar.add(i, obj);
                this.z = -1;
                this.A = ((AbstractList) aVar).modCount;
                return;
            default:
                c();
                kotlin.collections.builders.b bVar = (kotlin.collections.builders.b) this.B;
                int i2 = this.y;
                this.y = i2 + 1;
                bVar.add(i2, obj);
                this.z = -1;
                this.A = ((AbstractList) bVar).modCount;
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((kotlin.collections.builders.a) this.B).B).modCount == this.A) {
            return;
        }
        androidx.collection.g.d();
    }

    public void c() {
        if (((AbstractList) ((kotlin.collections.builders.b) this.B)).modCount == this.A) {
            return;
        }
        androidx.collection.g.d();
    }

    public void d() {
        if (r.g((q) this.B) == this.A) {
            return;
        }
        androidx.collection.g.d();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.y < ((q) this.B).size() - 1;
            case 1:
                return this.y < this.A;
            case 2:
                return this.y < ((kotlin.collections.builders.a) this.B).z;
            default:
                return this.y < ((kotlin.collections.builders.b) this.B).y;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                return this.y >= 0;
            case 1:
                return this.y > this.z;
            case 2:
                return this.y > 0;
            default:
                return this.y > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                d();
                int i = this.y + 1;
                this.z = i;
                q qVar = (q) this.B;
                r.a(i, qVar.size());
                Object obj = qVar.get(i);
                this.y = i;
                return obj;
            case 1:
                j0 j0Var = ((androidx.compose.ui.node.p) this.B).e;
                int i2 = this.y;
                this.y = i2 + 1;
                Object objF = j0Var.f(i2);
                objF.getClass();
                return (androidx.compose.ui.q) objF;
            case 2:
                b();
                int i3 = this.y;
                kotlin.collections.builders.a aVar = (kotlin.collections.builders.a) this.B;
                if (i3 >= aVar.z) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.y = i3 + 1;
                this.z = i3;
                return aVar.e[aVar.y + i3];
            default:
                c();
                int i4 = this.y;
                kotlin.collections.builders.b bVar = (kotlin.collections.builders.b) this.B;
                if (i4 >= bVar.y) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.y = i4 + 1;
                this.z = i4;
                return bVar.e[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.y + 1;
            case 1:
                return this.y - this.z;
            case 2:
                return this.y;
            default:
                return this.y;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.e) {
            case 0:
                d();
                int i = this.y;
                q qVar = (q) this.B;
                r.a(i, qVar.size());
                int i2 = this.y;
                this.z = i2;
                Object obj = qVar.get(i2);
                this.y--;
                return obj;
            case 1:
                j0 j0Var = ((androidx.compose.ui.node.p) this.B).e;
                int i3 = this.y - 1;
                this.y = i3;
                Object objF = j0Var.f(i3);
                objF.getClass();
                return (androidx.compose.ui.q) objF;
            case 2:
                b();
                int i4 = this.y;
                if (i4 <= 0) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                int i5 = i4 - 1;
                this.y = i5;
                this.z = i5;
                kotlin.collections.builders.a aVar = (kotlin.collections.builders.a) this.B;
                return aVar.e[aVar.y + i5];
            default:
                c();
                int i6 = this.y;
                if (i6 <= 0) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                int i7 = i6 - 1;
                this.y = i7;
                this.z = i7;
                return ((kotlin.collections.builders.b) this.B).e[i7];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.e) {
            case 0:
                return this.y;
            case 1:
                i = this.y - this.z;
                break;
            case 2:
                i = this.y;
                break;
            default:
                i = this.y;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                d();
                q qVar = (q) this.B;
                qVar.remove(this.z);
                this.y--;
                this.z = -1;
                this.A = r.g(qVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                kotlin.collections.builders.a aVar = (kotlin.collections.builders.a) this.B;
                b();
                int i = this.z;
                if (i == -1) {
                    net.luminis.tls.engine.impl.c.r("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                aVar.c(i);
                this.y = this.z;
                this.z = -1;
                this.A = ((AbstractList) aVar).modCount;
                return;
            default:
                kotlin.collections.builders.b bVar = (kotlin.collections.builders.b) this.B;
                c();
                int i2 = this.z;
                if (i2 == -1) {
                    net.luminis.tls.engine.impl.c.r("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                bVar.c(i2);
                this.y = this.z;
                this.z = -1;
                this.A = ((AbstractList) bVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                q qVar = (q) this.B;
                d();
                int i = this.z;
                if (i < 0) {
                    net.luminis.tls.engine.impl.c.r("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    qVar.set(i, obj);
                    this.A = r.g(qVar);
                    return;
                }
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                b();
                int i2 = this.z;
                if (i2 != -1) {
                    ((kotlin.collections.builders.a) this.B).set(i2, obj);
                    return;
                } else {
                    net.luminis.tls.engine.impl.c.r("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                c();
                int i3 = this.z;
                if (i3 != -1) {
                    ((kotlin.collections.builders.b) this.B).set(i3, obj);
                    return;
                } else {
                    net.luminis.tls.engine.impl.c.r("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    public u(kotlin.collections.builders.b bVar, int i) {
        this.e = 3;
        this.B = bVar;
        this.y = i;
        this.z = -1;
        this.A = ((AbstractList) bVar).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(androidx.compose.ui.node.p pVar, int i, int i2) {
        this(pVar, (i2 & 1) != 0 ? 0 : i, 0, pVar.e.b);
        this.e = 1;
    }

    public u(androidx.compose.ui.node.p pVar, int i, int i2, int i3) {
        this.e = 1;
        this.B = pVar;
        this.y = i;
        this.z = i2;
        this.A = i3;
    }

    public u(kotlin.collections.builders.a aVar, int i) {
        this.e = 2;
        this.B = aVar;
        this.y = i;
        this.z = -1;
        this.A = ((AbstractList) aVar).modCount;
    }
}
