package androidx.compose.ui.window;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {
    @Override // androidx.compose.ui.window.b0
    public final void a(z zVar, int i, int i2) {
        zVar.setSystemGestureExclusionRects(com.google.common.base.c.s(new Rect(0, 0, i, i2)));
    }
}
