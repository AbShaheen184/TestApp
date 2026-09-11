package androidx.compose.foundation;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    public static final androidx.compose.ui.semantics.w a = new androidx.compose.ui.semantics.w("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
