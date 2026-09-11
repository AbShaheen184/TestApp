package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static s c;
    public t1 a;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return t1.e(i, mode);
    }

    public static synchronized void c() {
        if (c == null) {
            s sVar = new s();
            c = sVar;
            sVar.a = t1.b();
            t1 t1Var = c.a;
            com.caverock.androidsvg.y1 y1Var = new com.caverock.androidsvg.y1(1);
            synchronized (t1Var) {
                t1Var.e = y1Var;
            }
        }
    }

    public static void d(Drawable drawable, a2 a2Var, int[] iArr) {
        PorterDuff.Mode mode = t1.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = a2Var.b;
        if (!z && !a2Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z ? (ColorStateList) a2Var.c : null;
        PorterDuff.Mode mode2 = a2Var.a ? (PorterDuff.Mode) a2Var.d : t1.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = t1.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.a.c(context, i);
    }
}
