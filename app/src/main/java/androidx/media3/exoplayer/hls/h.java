package androidx.media3.exoplayer.hls;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.media3.exoplayer.trackselection.c {
    public int g;

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int d() {
        return this.g;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void l(long j, long j2, long j3, List list, androidx.media3.exoplayer.source.chunk.l[] lVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            org.mozilla.javascript.c.a();
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int o() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final Object r() {
        return null;
    }
}
