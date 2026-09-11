package androidx.appcompat.view.menu;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {
    public final /* synthetic */ n e;

    public m(n nVar) {
        this.e = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.e.c();
    }
}
