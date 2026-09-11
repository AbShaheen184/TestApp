package androidx.media3.exoplayer.video;

import android.view.Choreographer;
import android.view.Display;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends y implements Choreographer.FrameCallback {
    @Override // androidx.media3.exoplayer.video.y
    public final void a() {
        long refreshRate;
        this.y.registerDisplayListener(this, j0.q(null));
        this.e.postFrameCallback(this);
        Display display = this.y.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            androidx.media3.common.util.c.t("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.A = refreshRate;
    }

    @Override // androidx.media3.exoplayer.video.y
    public final void b() {
        this.y.unregisterDisplayListener(this);
        this.e.removeFrameCallback(this);
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.z = j;
        this.e.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.e.postFrameCallback(this);
            Display display = this.y.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                androidx.media3.common.util.c.t("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.A = refreshRate;
        }
    }
}
