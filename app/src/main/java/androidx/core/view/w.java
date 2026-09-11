package androidx.core.view;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements x {
    public final ScrollFeedbackProvider e;

    public w(NestedScrollView nestedScrollView) {
        this.e = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // androidx.core.view.x
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.e.onScrollLimit(i, i2, i3, z);
    }

    @Override // androidx.core.view.x
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.e.onScrollProgress(i, i2, i3, i4);
    }
}
