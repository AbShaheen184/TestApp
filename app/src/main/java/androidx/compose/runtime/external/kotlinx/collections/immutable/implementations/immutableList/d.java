package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public final Object A;
    public final /* synthetic */ int z = 1;

    public d(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.A = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.z) {
            case 0:
                if (!hasNext()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                Object[] objArr = (Object[]) this.A;
                int i = this.e;
                this.e = i + 1;
                return objArr[i];
            default:
                if (hasNext()) {
                    this.e++;
                    return this.A;
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.z) {
            case 0:
                if (!hasPrevious()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                Object[] objArr = (Object[]) this.A;
                int i = this.e - 1;
                this.e = i;
                return objArr[i];
            default:
                if (hasPrevious()) {
                    this.e--;
                    return this.A;
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
        }
    }

    public d(Object obj, int i) {
        super(i, 1);
        this.A = obj;
    }
}
