package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((p0) this.k.get(i2)).a;
            d0 d0Var = (d0) view3.getLayoutParams();
            if (view3 != view && !d0Var.a.h() && (iB = (d0Var.a.b() - this.d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((d0) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(i0 i0Var) {
        List list = this.k;
        if (list == null) {
            View viewD = i0Var.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((p0) this.k.get(i)).a;
            d0 d0Var = (d0) view.getLayoutParams();
            if (!d0Var.a.h() && this.d == d0Var.a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
