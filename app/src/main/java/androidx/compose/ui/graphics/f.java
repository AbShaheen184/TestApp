package androidx.compose.ui.graphics;

import android.content.Context;
import android.os.Build;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements y {
    public static boolean f = true;
    public final androidx.compose.ui.platform.u a;
    public final Object b = new Object();
    public androidx.compose.ui.graphics.layer.view.b c;
    public boolean d;
    public final e e;

    public f(androidx.compose.ui.platform.u uVar) {
        this.a = uVar;
        e eVar = new e();
        this.e = eVar;
        if (uVar.isAttachedToWindow()) {
            Context context = uVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(eVar);
                this.d = true;
            }
        }
        uVar.addOnAttachStateChangeListener(new androidx.appcompat.view.menu.d(this, 2));
    }

    @Override // androidx.compose.ui.graphics.y
    public final void a(androidx.compose.ui.graphics.layer.b bVar) {
        synchronized (this.b) {
            if (!bVar.s) {
                bVar.s = true;
                bVar.b();
            }
        }
    }

    @Override // androidx.compose.ui.graphics.y
    public final androidx.compose.ui.graphics.layer.b b() {
        androidx.compose.ui.graphics.layer.d hVar;
        androidx.compose.ui.graphics.layer.b bVar;
        synchronized (this.b) {
            try {
                androidx.compose.ui.platform.u uVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    b.b(uVar);
                }
                if (i >= 29) {
                    hVar = new androidx.compose.ui.graphics.layer.f();
                } else if (f) {
                    try {
                        hVar = new androidx.compose.ui.graphics.layer.e(this.a, new s(), new androidx.compose.ui.graphics.drawscope.b());
                    } catch (Throwable unused) {
                        f = false;
                        hVar = new androidx.compose.ui.graphics.layer.h(c(this.a));
                    }
                } else {
                    hVar = new androidx.compose.ui.graphics.layer.h(c(this.a));
                }
                bVar = new androidx.compose.ui.graphics.layer.b(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final androidx.compose.ui.graphics.layer.view.a c(androidx.compose.ui.platform.u uVar) {
        androidx.compose.ui.graphics.layer.view.b bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        androidx.compose.ui.graphics.layer.view.b bVar2 = new androidx.compose.ui.graphics.layer.view.b(uVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        uVar.addView(bVar2, -1);
        this.c = bVar2;
        return bVar2;
    }
}
