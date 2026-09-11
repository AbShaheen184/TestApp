package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements List, kotlin.jvm.internal.markers.b {
    public int A;
    public final /* synthetic */ int e;
    public final Object y;
    public final int z;

    public /* synthetic */ i0(List list, int i, int i2, int i3) {
        this.e = i3;
        this.y = list;
        this.z = i;
        this.A = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.e) {
            case 0:
                this.y.add(i + this.z, obj);
                this.A++;
                break;
            default:
                this.y.add(i + this.z, obj);
                this.A++;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                this.y.addAll(i + this.z, collection);
                this.A = collection.size() + this.A;
                return collection.size() > 0;
            default:
                this.y.addAll(i + this.z, collection);
                int size = collection.size();
                this.A += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                int i = this.A - 1;
                int i2 = this.z;
                if (i2 <= i) {
                    while (true) {
                        this.y.remove(i);
                        if (i != i2) {
                            i--;
                        }
                    }
                }
                this.A = i2;
                break;
            default:
                int i3 = this.A - 1;
                int i4 = this.z;
                if (i4 <= i3) {
                    while (true) {
                        this.y.remove(i3);
                        if (i3 != i4) {
                            i3--;
                        }
                    }
                }
                this.A = i4;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.A;
                for (int i2 = this.z; i2 < i; i2++) {
                    if (kotlin.jvm.internal.l.a(this.y.get(i2), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i3 = this.A;
                for (int i4 = this.z; i4 < i3; i4++) {
                    if (kotlin.jvm.internal.l.a(this.y.get(i4), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        switch (this.e) {
            case 0:
                u0.a(i, this);
                return this.y.get(i + this.z);
            default:
                androidx.compose.runtime.collection.c.a(i, this);
                return this.y.get(i + this.z);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.A;
                int i2 = this.z;
                for (int i3 = i2; i3 < i; i3++) {
                    if (kotlin.jvm.internal.l.a(this.y.get(i3), obj)) {
                        return i3 - i2;
                    }
                }
                return -1;
            default:
                int i4 = this.A;
                int i5 = this.z;
                for (int i6 = i5; i6 < i4; i6++) {
                    if (kotlin.jvm.internal.l.a(this.y.get(i6), obj)) {
                        return i6 - i5;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                return this.A == this.z;
            default:
                return this.A == this.z;
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

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.A - 1;
                int i2 = this.z;
                if (i2 <= i) {
                    while (!kotlin.jvm.internal.l.a(this.y.get(i), obj)) {
                        if (i != i2) {
                            i--;
                        }
                    }
                    return i - i2;
                }
                return -1;
            default:
                int i3 = this.A - 1;
                int i4 = this.z;
                if (i4 <= i3) {
                    while (!kotlin.jvm.internal.l.a(this.y.get(i3), obj)) {
                        if (i3 != i4) {
                            i3--;
                        }
                    }
                    return i3 - i4;
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

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.A;
                for (int i2 = this.z; i2 < i; i2++) {
                    ?? r2 = this.y;
                    if (kotlin.jvm.internal.l.a(r2.get(i2), obj)) {
                        r2.remove(i2);
                        this.A--;
                        return true;
                    }
                }
                return false;
            default:
                int i3 = this.A;
                for (int i4 = this.z; i4 < i3; i4++) {
                    ?? r3 = this.y;
                    if (kotlin.jvm.internal.l.a(r3.get(i4), obj)) {
                        r3.remove(i4);
                        this.A--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                int i = this.A;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.A;
            default:
                int i2 = this.A;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.A;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                int i = this.A;
                int i2 = i - 1;
                int i3 = this.z;
                if (i3 <= i2) {
                    while (true) {
                        ?? r3 = this.y;
                        if (!collection.contains(r3.get(i2))) {
                            r3.remove(i2);
                            this.A--;
                        }
                        if (i2 != i3) {
                            i2--;
                        }
                    }
                }
                return i != this.A;
            default:
                int i4 = this.A;
                int i5 = i4 - 1;
                int i6 = this.z;
                if (i6 <= i5) {
                    while (true) {
                        ?? r4 = this.y;
                        if (!collection.contains(r4.get(i5))) {
                            r4.remove(i5);
                            this.A--;
                        }
                        if (i5 != i6) {
                            i5--;
                        }
                    }
                }
                return i4 != this.A;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.e) {
            case 0:
                u0.a(i, this);
                return this.y.set(i + this.z, obj);
            default:
                androidx.compose.runtime.collection.c.a(i, this);
                return this.y.set(i + this.z, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                i = this.A;
                i2 = this.z;
                break;
            default:
                i = this.A;
                i2 = this.z;
                break;
        }
        return i - i2;
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

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.A;
                this.A = i + 1;
                this.y.add(i, obj);
                break;
            default:
                int i2 = this.A;
                this.A = i2 + 1;
                this.y.add(i2, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                this.y.addAll(this.A, collection);
                this.A = collection.size() + this.A;
                return collection.size() > 0;
            default:
                this.y.addAll(this.A, collection);
                int size = collection.size();
                this.A += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.e) {
            case 0:
                u0.a(i, this);
                Object objRemove = this.y.remove(i + this.z);
                this.A--;
                return objRemove;
            default:
                androidx.compose.runtime.collection.c.a(i, this);
                Object objRemove2 = this.y.remove(i + this.z);
                this.A--;
                return objRemove2;
        }
    }
}
