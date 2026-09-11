package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {
    public Object[] A;
    public boolean B;
    public int z;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.z = i3;
        Object[] objArr2 = new Object[i3];
        this.A = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.B = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    public final Object b() {
        int i = this.e & 31;
        Object obj = this.A[this.z - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void c(int i, int i2) {
        int i3 = (this.z - i2) * 5;
        while (i2 < this.z) {
            Object[] objArr = this.A;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[com.google.android.gms.dynamite.g.u(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void d(int i) {
        int i2 = 0;
        while (com.google.android.gms.dynamite.g.u(this.e, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            c(this.e, ((this.z - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        Object objB = b();
        int i = this.e + 1;
        this.e = i;
        if (i == this.y) {
            this.B = true;
            return objB;
        }
        d(0);
        return objB;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.e--;
        if (this.B) {
            this.B = false;
            return b();
        }
        d(31);
        return b();
    }
}
