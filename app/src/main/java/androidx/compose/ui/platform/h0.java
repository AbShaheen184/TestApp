package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final h0 a = new h0();

    public final void a(View view, int i, boolean z) {
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
