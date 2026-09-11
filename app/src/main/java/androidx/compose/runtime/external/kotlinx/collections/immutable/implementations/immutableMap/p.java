package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {
    public final f A;

    public p(f fVar) {
        this.A = fVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.z;
        this.z = i + 2;
        Object[] objArr = this.e;
        return new a(this.A, objArr[i], objArr[i + 1]);
    }
}
