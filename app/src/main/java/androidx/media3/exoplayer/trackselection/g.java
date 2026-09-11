package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m implements Comparable {
    public final int B;
    public final int C;

    public g(int i, w0 w0Var, int i2, j jVar, int i3) {
        int i4;
        super(i, w0Var, i2);
        this.B = androidx.media3.exoplayer.a.n(i3, jVar.C) ? 1 : 0;
        androidx.media3.common.r rVar = this.A;
        int i5 = rVar.v;
        int i6 = -1;
        if (i5 != -1 && (i4 = rVar.w) != -1) {
            i6 = i5 * i4;
        }
        this.C = i6;
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final int a() {
        return this.B;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.C, ((g) obj).C);
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final /* bridge */ /* synthetic */ boolean d(m mVar) {
        return false;
    }
}
