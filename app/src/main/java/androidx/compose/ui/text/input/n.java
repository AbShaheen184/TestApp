package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    @Override // androidx.compose.ui.text.input.m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
