package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                if (!(view instanceof m) || (outline2 = ((m) view).B) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                view.getClass();
                throw new ClassCastException();
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
