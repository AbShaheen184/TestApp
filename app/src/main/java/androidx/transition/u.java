package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final v a;
    public static final b b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new w();
        } else {
            a = new v();
        }
        b = new b("translationAlpha", Float.class, 5);
        new b("clipBounds", Rect.class, 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.O(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.P(view, i);
    }
}
