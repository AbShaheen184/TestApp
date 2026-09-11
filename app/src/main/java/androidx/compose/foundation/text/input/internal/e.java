package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void a(CursorAnchorInfo.Builder builder, androidx.compose.ui.geometry.c cVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(a0.x(cVar)).setHandwritingBounds(a0.x(cVar)).build());
    }

    public static void b(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
