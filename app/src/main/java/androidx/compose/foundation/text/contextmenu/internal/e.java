package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final f a;
    public final b b;
    public final b c;
    public final View d;

    public e(f fVar, b bVar, b bVar2, View view) {
        this.a = fVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a(Menu menu) {
        int i;
        androidx.compose.foundation.text.contextmenu.data.c cVar = (androidx.compose.foundation.text.contextmenu.data.c) this.b.invoke();
        if (kotlin.jvm.internal.l.a(cVar, null)) {
            return false;
        }
        menu.clear();
        ?? r0 = cVar.a;
        int size = r0.size();
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.text.contextmenu.data.b bVar = (androidx.compose.foundation.text.contextmenu.data.b) r0.get(i4);
            if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.d) {
                i = i2 + 1;
                androidx.compose.foundation.text.contextmenu.data.d dVar = (androidx.compose.foundation.text.contextmenu.data.d) bVar;
                MenuItem menuItemAdd = menu.add(i3, i2, i2, dVar.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new d(0, dVar, this));
            } else {
                if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i2 + 1;
                        androidx.compose.foundation.text.contextmenu.data.h hVar = (androidx.compose.foundation.text.contextmenu.data.h) bVar;
                        x.b(menu, i2, this.d.getContext(), hVar.b, hVar.c);
                    }
                } else if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.f) {
                    i3++;
                }
            }
            i2 = i;
        }
        return true;
    }
}
