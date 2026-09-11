package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class v extends kotlin.math.a {
    public static boolean n = true;
    public static boolean o = true;
    public static boolean p = true;
    public static boolean q = true;

    public void O(View view, int i, int i2, int i3, int i4) {
        if (p) {
            try {
                androidx.compose.ui.platform.coreshims.b.x(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                p = false;
            }
        }
    }

    public void P(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (q) {
                try {
                    androidx.compose.ui.platform.coreshims.b.z(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    q = false;
                    return;
                }
            }
            return;
        }
        if (!kotlin.math.a.k) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                kotlin.math.a.j = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            kotlin.math.a.k = true;
        }
        Field field = kotlin.math.a.j;
        if (field != null) {
            try {
                kotlin.math.a.j.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void Q(View view, Matrix matrix) {
        if (n) {
            try {
                androidx.compose.ui.platform.coreshims.b.D(view, matrix);
            } catch (NoSuchMethodError unused) {
                n = false;
            }
        }
    }

    public void R(ViewGroup viewGroup, Matrix matrix) {
        if (o) {
            try {
                androidx.compose.ui.platform.coreshims.b.E(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                o = false;
            }
        }
    }
}
