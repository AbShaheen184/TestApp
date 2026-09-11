package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.focus.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends androidx.compose.ui.q implements w {
    @Override // androidx.compose.ui.focus.w
    public final void u(androidx.compose.ui.focus.r rVar) {
        View viewC = i.c(this);
        rVar.d(this.e.K && i.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            rVar.h(androidx.compose.ui.focus.h.a(viewFindFocus, viewC));
        }
    }
}
