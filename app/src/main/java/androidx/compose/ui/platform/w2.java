package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View e;
    public final /* synthetic */ androidx.compose.runtime.w1 y;

    public w2(View view, androidx.compose.runtime.w1 w1Var) {
        this.e = view;
        this.y = w1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.e.removeOnAttachStateChangeListener(this);
        this.y.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
