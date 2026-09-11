package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    public final k A;
    public final Object[] z;

    public h(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.z = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.A = new k(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        k kVar = this.A;
        if (kVar.hasNext()) {
            this.e++;
            return kVar.next();
        }
        int i = this.e;
        this.e = i + 1;
        return this.z[i - kVar.y];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.e;
        k kVar = this.A;
        int i2 = kVar.y;
        if (i <= i2) {
            this.e = i - 1;
            return kVar.previous();
        }
        int i3 = i - 1;
        this.e = i3;
        return this.z[i3 - i2];
    }
}
