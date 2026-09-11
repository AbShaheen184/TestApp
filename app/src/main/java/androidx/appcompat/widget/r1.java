package androidx.appcompat.widget;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends m1 implements n1 {
    public static final Method W;
    public com.google.firebase.platforminfo.c V;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.n1
    public final void c(androidx.appcompat.view.menu.j jVar, androidx.appcompat.view.menu.k kVar) {
        com.google.firebase.platforminfo.c cVar = this.V;
        if (cVar != null) {
            cVar.c(jVar, kVar);
        }
    }

    @Override // androidx.appcompat.widget.n1
    public final void e(androidx.appcompat.view.menu.j jVar, MenuItem menuItem) {
        com.google.firebase.platforminfo.c cVar = this.V;
        if (cVar != null) {
            cVar.e(jVar, menuItem);
        }
    }
}
