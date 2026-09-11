package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k c;
    public final String a;
    public final androidx.compose.ui.scrollcapture.i b;

    static {
        new k("");
        c = new k("preload");
    }

    public k(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new androidx.compose.ui.scrollcapture.i(3) : null;
    }

    public final synchronized LogSessionId a() {
        androidx.compose.ui.scrollcapture.i iVar;
        iVar = this.b;
        iVar.getClass();
        return (LogSessionId) iVar.b;
    }
}
