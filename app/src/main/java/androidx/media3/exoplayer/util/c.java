package androidx.media3.exoplayer.util;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ Runnable a;

    public c(Runnable runnable) {
        this.a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.run();
    }
}
