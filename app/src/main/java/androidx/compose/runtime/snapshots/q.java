package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.n1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable, w, List, RandomAccess, kotlin.jvm.internal.markers.b {
    public static final Parcelable.Creator<q> CREATOR = new p(0);
    public v e;

    public q(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar) {
        f fVarJ = n.j();
        v vVar = new v(fVarJ.g(), cVar);
        if (!(fVarJ instanceof a)) {
            vVar.b = new v(1, cVar);
        }
        this.e = vVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarD = cVar.d(obj);
            if (cVarD.equals(cVar)) {
                return false;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i, cVarD, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarE = cVar.e(collection);
            if (kotlin.jvm.internal.l.a(cVarE, cVar)) {
                return false;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i, cVarE, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(y yVar) {
        yVar.b = this.e;
        this.e = (v) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final y c() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f fVarJ;
        v vVar = this.e;
        vVar.getClass();
        synchronized (n.c) {
            fVarJ = n.j();
            v vVar2 = (v) n.w(vVar, this, fVarJ);
            synchronized (r.a) {
                vVar2.c = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.y;
                vVar2.d++;
                vVar2.e++;
            }
        }
        n.n(fVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return r.f(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.f(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i3 = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarF = cVar.f();
            gVarF.subList(i, i2).clear();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarD = gVarF.d();
            if (kotlin.jvm.internal.l.a(cVarD, cVar)) {
                return;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i3, cVarD, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return r.f(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return r.f(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return r.f(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return r.f(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new u(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            int iIndexOf = cVar.indexOf(obj);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarI = iIndexOf != -1 ? cVar.i(iIndexOf) : cVar;
            if (cVarI.equals(cVar)) {
                return false;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i, cVarI, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarH = cVar.h(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b(0, collection));
            if (kotlin.jvm.internal.l.a(cVarH, cVar)) {
                return false;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i, cVarH, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return r.i(this, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        Object obj2 = get(i);
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i2 = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarJ = cVar.j(i, obj);
            if (cVarJ.equals(cVar)) {
                break;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i2, cVarJ, false);
            }
            n.n(fVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return r.f(this).c.b();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        return new a0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.b(this);
    }

    public final String toString() {
        v vVar = this.e;
        vVar.getClass();
        return "SnapshotStateList(value=" + ((v) n.h(vVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar = r.f(this).c;
        int iB = cVar.b();
        parcel.writeInt(iB);
        for (int i2 = 0; i2 < iB; i2++) {
            parcel.writeValue(cVar.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.c(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new u(this, i);
    }

    public q() {
        this(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.y);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i2 = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarC = cVar.c(i, obj);
            if (cVarC.equals(cVar)) {
                return;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i2, cVarC, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return r.i(this, new androidx.compose.foundation.lazy.grid.v(i, collection, 1));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        Object obj = get(i);
        do {
            synchronized (r.a) {
                v vVar = this.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i2 = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarI = cVar.i(i);
            if (cVarI.equals(cVar)) {
                break;
            }
            v vVar3 = this.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, this, fVarJ), i2, cVarI, true);
            }
            n.n(fVarJ, this);
        } while (!zB);
        return obj;
    }
}
