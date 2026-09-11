package androidx.core.view;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends org.jsoup.helper.n {
    public final Window l;
    public final com.google.firebase.platforminfo.c m;

    public a2(Window window, com.google.firebase.platforminfo.c cVar) {
        this.l = window;
        this.m = cVar;
    }

    @Override // org.jsoup.helper.n
    public final void M() {
        this.l.getDecorView().setTag(356039078, 2);
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~2048));
        O(4096);
    }

    public final void O(int i) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // org.jsoup.helper.n
    public final void z() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    O(4);
                } else if (i == 2) {
                    O(2);
                } else if (i == 8) {
                    ((a0) this.m.e).a();
                }
            }
        }
    }
}
