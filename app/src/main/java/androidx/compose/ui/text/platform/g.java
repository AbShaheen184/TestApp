package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.m;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ClickableSpan {
    public final m e;

    public g(m mVar) {
        this.e = mVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.getClass();
    }
}
