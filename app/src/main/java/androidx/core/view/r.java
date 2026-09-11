package androidx.core.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class r {
    public int a;
    public int b;

    public r(int i) {
        this.a = 2;
        this.b = i;
    }

    public int a() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(androidx.recyclerview.widget.p0 p0Var) {
        View view = p0Var.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public /* synthetic */ r(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
