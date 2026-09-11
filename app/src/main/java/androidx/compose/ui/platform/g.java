package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g1 {
    public final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final void a(f1 f1Var) {
        ClipboardManager clipboardManager = this.a.a;
        if (f1Var != null) {
            clipboardManager.setPrimaryClip(f1Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            y0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
