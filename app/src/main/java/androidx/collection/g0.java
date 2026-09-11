package androidx.collection;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ListIterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public final Object y;
    public int z;

    public g0(int i, List list, int i2) {
        this.e = i2;
        switch (i2) {
            case 1:
                this.y = list;
                this.z = i;
                break;
            default:
                this.y = list;
                this.z = i - 1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.z + 1;
                this.z = i;
                this.y.add(i, obj);
                break;
            default:
                this.y.add(this.z, obj);
                this.z++;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.z < this.y.size() - 1;
            default:
                return this.z < this.y.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                return this.z >= 0;
            default:
                return this.z > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.z + 1;
                this.z = i;
                return this.y.get(i);
            default:
                int i2 = this.z;
                this.z = i2 + 1;
                return this.y.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.z + 1;
            default:
                return this.z;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.e) {
            case 0:
                int i = this.z;
                this.z = i - 1;
                return this.y.get(i);
            default:
                int i2 = this.z - 1;
                this.z = i2;
                return this.y.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.e) {
            case 0:
                return this.z;
            default:
                return this.z - 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                this.y.remove(this.z);
                this.z--;
                break;
            default:
                int i = this.z - 1;
                this.z = i;
                this.y.remove(i);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                this.y.set(this.z, obj);
                break;
            default:
                this.y.set(this.z, obj);
                break;
        }
    }
}
