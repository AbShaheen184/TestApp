package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements View.OnApplyWindowInsetsListener {
    public z1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ s c;

    public j0(View view, s sVar) {
        this.b = view;
        this.c = sVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z1 z1VarD = z1.d(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        s sVar = this.c;
        if (i < 30) {
            k0.a(windowInsets, this.b);
            if (z1VarD.equals(this.a)) {
                return sVar.i(view, z1VarD).c();
            }
        }
        this.a = z1VarD;
        z1 z1VarI = sVar.i(view, z1VarD);
        if (i >= 30) {
            return z1VarI.c();
        }
        Field field = s0.a;
        view.requestApplyInsets();
        return z1VarI.c();
    }
}
