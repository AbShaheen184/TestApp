package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.app.mlounge.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends e1 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final androidx.interpolator.view.animation.a f = new androidx.interpolator.view.animation.a();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, f1 f1Var) {
        w0 w0VarK = k(view);
        if (w0VarK != null) {
            w0VarK.n(f1Var);
            if (w0VarK.y == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), f1Var);
            }
        }
    }

    public static void g(View view, f1 f1Var, z1 z1Var, boolean z) {
        w0 w0VarK = k(view);
        if (w0VarK != null) {
            w0VarK.z = z1Var;
            if (!z) {
                w0VarK.o();
                z = w0VarK.y == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), f1Var, z1Var, z);
            }
        }
    }

    public static void h(View view, z1 z1Var, List list) {
        w0 w0VarK = k(view);
        if (w0VarK != null) {
            z1Var = w0VarK.p(z1Var, list);
            if (w0VarK.y == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), z1Var, list);
            }
        }
    }

    public static void i(View view, f1 f1Var, androidx.compose.foundation.text.input.internal.o oVar) {
        w0 w0VarK = k(view);
        if (w0VarK != null) {
            w0VarK.q(f1Var, oVar);
            if (w0VarK.y == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), f1Var, oVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static w0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof z0) {
            return ((z0) tag).a;
        }
        return null;
    }
}
