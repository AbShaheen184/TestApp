package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends k {
    public final long H;
    public final long I;
    public androidx.media3.common.util.b J;
    public int[] K;

    public a(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(hVar, lVar, rVar, i, obj, j, j2, j5);
        this.H = j3;
        this.I = j4;
    }

    public final int d(int i) {
        int[] iArr = this.K;
        iArr.getClass();
        return iArr[i];
    }
}
