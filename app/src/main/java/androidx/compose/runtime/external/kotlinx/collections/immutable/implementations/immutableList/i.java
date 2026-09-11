package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {
    public int A;
    public k B;
    public int C;
    public final g z;

    public i(g gVar, int i) {
        super(i, gVar.E);
        this.z = gVar;
        this.A = gVar.f();
        this.C = -1;
        c();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i = this.e;
        g gVar = this.z;
        gVar.add(i, obj);
        this.e++;
        this.y = gVar.b();
        this.A = gVar.f();
        this.C = -1;
        c();
    }

    public final void b() {
        if (this.A == this.z.f()) {
            return;
        }
        androidx.collection.g.d();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        g gVar = this.z;
        Object[] objArr = gVar.C;
        if (objArr == null) {
            this.B = null;
            return;
        }
        int i = (gVar.E - 1) & (-32);
        int i2 = this.e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (gVar.A / 5) + 1;
        k kVar = this.B;
        if (kVar == null) {
            this.B = new k(objArr, i2, i, i3);
            return;
        }
        kVar.e = i2;
        kVar.y = i;
        kVar.z = i3;
        if (kVar.A.length < i3) {
            kVar.A = new Object[i3];
        }
        kVar.A[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        kVar.B = r6;
        kVar.c(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.e;
        this.C = i;
        k kVar = this.B;
        g gVar = this.z;
        if (kVar == null) {
            Object[] objArr = gVar.D;
            this.e = i + 1;
            return objArr[i];
        }
        if (kVar.hasNext()) {
            this.e++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.D;
        int i2 = this.e;
        this.e = i2 + 1;
        return objArr2[i2 - kVar.y];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (!hasPrevious()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.e;
        this.C = i - 1;
        k kVar = this.B;
        g gVar = this.z;
        if (kVar == null) {
            Object[] objArr = gVar.D;
            int i2 = i - 1;
            this.e = i2;
            return objArr[i2];
        }
        int i3 = kVar.y;
        if (i <= i3) {
            this.e = i - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.D;
        int i4 = i - 1;
        this.e = i4;
        return objArr2[i4 - i3];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i = this.C;
        if (i == -1) {
            org.mozilla.javascript.c.a();
            return;
        }
        g gVar = this.z;
        gVar.c(i);
        int i2 = this.C;
        if (i2 < this.e) {
            this.e = i2;
        }
        this.y = gVar.b();
        this.A = gVar.f();
        this.C = -1;
        c();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i = this.C;
        if (i == -1) {
            org.mozilla.javascript.c.a();
            return;
        }
        g gVar = this.z;
        gVar.set(i, obj);
        this.A = gVar.f();
        c();
    }
}
