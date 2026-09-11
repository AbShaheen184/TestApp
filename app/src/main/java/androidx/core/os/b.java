package androidx.core.os;

import android.os.Build;
import androidx.compose.ui.graphics.layer.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            i.b(30);
        }
        if (i >= 30) {
            i.b(31);
        }
        if (i >= 30) {
            i.b(33);
        }
        if (i >= 30) {
            i.b(1000000);
        }
    }
}
