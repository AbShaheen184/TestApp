package androidx.media3.exoplayer.trackselection;

import com.google.common.collect.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {
    public final boolean e;
    public final boolean y;

    public h(androidx.media3.common.r rVar, int i) {
        this.e = (rVar.e & 1) != 0;
        this.y = androidx.media3.exoplayer.a.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return y.a.c(this.y, hVar.y).c(this.e, hVar.e).e();
    }
}
