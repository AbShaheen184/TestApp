package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;
import androidx.media3.datasource.y;
import androidx.media3.exoplayer.source.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements androidx.media3.exoplayer.upstream.k {
    public final r A;
    public final int B;
    public final Object C;
    public final long D;
    public final long E;
    public final y F;
    public final long e = n.b.getAndIncrement();
    public final androidx.media3.datasource.l y;
    public final int z;

    public f(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, int i, r rVar, int i2, Object obj, long j, long j2) {
        this.F = new y(hVar);
        this.y = lVar;
        this.z = i;
        this.A = rVar;
        this.B = i2;
        this.C = obj;
        this.D = j;
        this.E = j2;
    }
}
