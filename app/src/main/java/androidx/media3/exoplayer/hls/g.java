package androidx.media3.exoplayer.hls;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.media3.exoplayer.source.chunk.b {
    public final List A;
    public final long B;

    public g(long j, List list) {
        super(0L, list.size() - 1);
        this.B = j;
        this.A = list;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long i() {
        a();
        return this.B + ((androidx.media3.exoplayer.hls.playlist.l) this.A.get((int) this.z)).B;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long k() {
        a();
        androidx.media3.exoplayer.hls.playlist.l lVar = (androidx.media3.exoplayer.hls.playlist.l) this.A.get((int) this.z);
        return this.B + lVar.B + lVar.z;
    }
}
