package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ ActionBarOverlayLayout y;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.e = i;
        this.y = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.y;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.Q = actionBarOverlayLayout.z.animate().translationY(0.0f).setListener(actionBarOverlayLayout.R);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.y;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.Q = actionBarOverlayLayout2.z.animate().translationY(-actionBarOverlayLayout2.z.getHeight()).setListener(actionBarOverlayLayout2.R);
                break;
        }
    }
}
