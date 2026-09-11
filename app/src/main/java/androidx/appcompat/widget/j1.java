package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends DataSetObserver {
    public final /* synthetic */ m1 a;

    public j1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        m1 m1Var = this.a;
        if (m1Var.S.isShowing()) {
            m1Var.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
