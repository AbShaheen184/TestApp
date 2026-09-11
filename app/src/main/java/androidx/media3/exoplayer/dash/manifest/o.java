package androidx.media3.exoplayer.dash.manifest;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(jVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.d));
    }

    @Override // androidx.media3.exoplayer.dash.manifest.n
    public final boolean i() {
        return true;
    }
}
