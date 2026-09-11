package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ u(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.G(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
