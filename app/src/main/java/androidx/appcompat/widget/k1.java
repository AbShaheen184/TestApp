package androidx.appcompat.widget;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ m1 a;

    public k1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        m1 m1Var = this.a;
        i1 i1Var = m1Var.K;
        z zVar = m1Var.S;
        if (i != 1 || zVar.getInputMethodMode() == 2 || zVar.getContentView() == null) {
            return;
        }
        m1Var.O.removeCallbacks(i1Var);
        i1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
