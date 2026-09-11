package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends androidx.compose.runtime.snapshots.y {
    public int c;

    public k2(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final void a(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.c = ((k2) yVar).c;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final androidx.compose.runtime.snapshots.y b(long j) {
        return new k2(j, this.c);
    }
}
