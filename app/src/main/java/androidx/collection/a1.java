package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.collections.z {
    public int e;
    public final /* synthetic */ z0 y;

    public a1(z0 z0Var) {
        this.y = z0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.y.f();
    }

    @Override // kotlin.collections.z
    public final int nextInt() {
        int i = this.e;
        this.e = i + 1;
        return this.y.d(i);
    }
}
