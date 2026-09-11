package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public /* synthetic */ v0(int i, kotlin.jvm.functions.l lVar) {
        this.e = i;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                return this.y.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                androidx.compose.runtime.snapshots.l lVar = (androidx.compose.runtime.snapshots.l) obj;
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    j = androidx.compose.runtime.snapshots.n.e;
                    androidx.compose.runtime.snapshots.n.e = ((long) 1) + j;
                }
                return new androidx.compose.runtime.snapshots.e(j, lVar, this.y);
        }
    }
}
