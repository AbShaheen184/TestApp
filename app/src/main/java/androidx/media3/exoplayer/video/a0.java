package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends y implements Choreographer$VsyncCallback {
    public final Handler B;

    public a0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.B = j0.q(null);
    }

    @Override // androidx.media3.exoplayer.video.y
    public final void a() {
        this.y.registerDisplayListener(this, j0.q(null));
        this.e.postVsyncCallback(this);
    }

    @Override // androidx.media3.exoplayer.video.y
    public final void b() {
        this.y.unregisterDisplayListener(this);
        this.B.removeCallbacksAndMessages(null);
        this.e.removeVsyncCallback(this);
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.e.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.z = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.A = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.A = -9223372036854775807L;
        }
        this.B.postDelayed(new androidx.activity.l(this, 25), 500L);
    }
}
