package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static void a(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }
}
