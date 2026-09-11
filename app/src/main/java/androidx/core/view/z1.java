package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {
    public static final z1 b;
    public final w1 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = u1.x;
        } else if (i >= 30) {
            b = s1.w;
        } else {
            b = w1.b;
        }
    }

    public z1(z1 z1Var) {
        if (z1Var == null) {
            this.a = new w1(this);
            return;
        }
        w1 w1Var = z1Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (w1Var instanceof v1)) {
            this.a = new v1(this, (v1) w1Var);
        } else if (i >= 34 && (w1Var instanceof u1)) {
            this.a = new u1(this, (u1) w1Var);
        } else if (i >= 31 && (w1Var instanceof t1)) {
            this.a = new t1(this, (t1) w1Var);
        } else if (i >= 30 && (w1Var instanceof s1)) {
            this.a = new s1(this, (s1) w1Var);
        } else if (i >= 29 && (w1Var instanceof r1)) {
            this.a = new r1(this, (r1) w1Var);
        } else if (i >= 28 && (w1Var instanceof q1)) {
            this.a = new q1(this, (q1) w1Var);
        } else if (w1Var instanceof p1) {
            this.a = new p1(this, (p1) w1Var);
        } else if (w1Var instanceof o1) {
            this.a = new o1(this, (o1) w1Var);
        } else {
            this.a = new w1(this);
        }
        w1Var.e(this);
    }

    public static androidx.core.graphics.c b(androidx.core.graphics.c cVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, cVar.a - i);
        int iMax2 = Math.max(0, cVar.b - i2);
        int iMax3 = Math.max(0, cVar.c - i3);
        int iMax4 = Math.max(0, cVar.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? cVar : androidx.core.graphics.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static z1 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        z1 z1Var = new z1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = s0.a;
            z1 z1VarA = l0.a(view);
            w1 w1Var = z1Var.a;
            w1Var.y(z1VarA);
            View rootView = view.getRootView();
            w1Var.d(rootView);
            w1Var.p(rootView);
            w1Var.q();
            w1Var.A(view.getWindowSystemUiVisibility());
        }
        return z1Var;
    }

    public final int a() {
        return this.a.n().b;
    }

    public final WindowInsets c() {
        w1 w1Var = this.a;
        if (w1Var instanceof o1) {
            return ((o1) w1Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z1) {
            return Objects.equals(this.a, ((z1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        w1 w1Var = this.a;
        if (w1Var == null) {
            return 0;
        }
        return w1Var.hashCode();
    }

    public z1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new v1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new u1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new t1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new s1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new r1(this, windowInsets);
        } else if (i >= 28) {
            this.a = new q1(this, windowInsets);
        } else {
            this.a = new p1(this, windowInsets);
        }
    }
}
