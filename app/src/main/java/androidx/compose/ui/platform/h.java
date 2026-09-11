package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h1 {
    public final ClipboardManager a;

    public h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
    }
}
