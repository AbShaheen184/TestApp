package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static z1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        z1 z1VarD = z1.d(null, rootWindowInsets);
        w1 w1Var = z1VarD.a;
        w1Var.y(z1VarD);
        View rootView = view.getRootView();
        w1Var.d(rootView);
        w1Var.p(rootView);
        w1Var.q();
        return z1VarD;
    }
}
