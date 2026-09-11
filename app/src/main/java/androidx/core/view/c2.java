package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends org.jsoup.helper.n {
    public final WindowInsetsController l;
    public final Window m;

    public c2(Window window, com.google.firebase.platforminfo.c cVar) {
        this.l = window.getInsetsController();
        this.m = window;
    }

    @Override // org.jsoup.helper.n
    public void M() {
        Window window = this.m;
        if (window == null) {
            this.l.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        View decorView = this.m.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~2048));
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
    }

    @Override // org.jsoup.helper.n
    public final void z() {
        this.l.hide(519);
    }
}
