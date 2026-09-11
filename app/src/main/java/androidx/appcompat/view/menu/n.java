package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class n {
    public final Context a;
    public final j b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public o h;
    public l i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final m k = new m(this);

    public n(Context context, j jVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = jVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final l a() {
        l sVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                sVar = new g(context2, this.e, this.d, this.c);
            } else {
                sVar = new s(context2, this.b, this.e, this.d, this.c);
            }
            sVar.l(this.b);
            sVar.r(this.k);
            sVar.n(this.e);
            sVar.c(this.h);
            sVar.o(this.g);
            sVar.p(this.f);
            this.i = sVar;
        }
        return this.i;
    }

    public final boolean b() {
        l lVar = this.i;
        return lVar != null && lVar.d();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        l lVarA = a();
        lVarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            lVarA.q(i);
            lVarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarA.e = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        lVarA.f();
    }
}
