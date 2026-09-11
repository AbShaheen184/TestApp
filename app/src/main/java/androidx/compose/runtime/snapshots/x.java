package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements w {
    public final androidx.compose.runtime.internal.a e = new androidx.compose.runtime.internal.a(0);

    public final boolean e(int i) {
        return (i & this.e.get()) != 0;
    }

    public final void f(int i) {
        androidx.compose.runtime.internal.a aVar;
        int i2;
        do {
            aVar = this.e;
            i2 = aVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i2, i2 | i));
    }
}
