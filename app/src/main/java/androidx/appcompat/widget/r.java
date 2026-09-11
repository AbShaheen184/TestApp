package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;

    public r(androidx.compose.runtime.p1 p1Var, Object obj, boolean z, androidx.compose.runtime.f fVar, boolean z2) {
        this.d = p1Var;
        this.a = z;
        this.e = fVar;
        this.b = z2;
        this.f = obj;
        this.c = true;
    }

    public void a() {
        q qVar = (q) this.d;
        Drawable buttonDrawable = qVar.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.a || this.b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.a) {
                    drawableMutate.setTintList((ColorStateList) this.e);
                }
                if (this.b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(qVar.getDrawableState());
                }
                qVar.setButtonDrawable(drawableMutate);
            }
        }
    }

    public Object b() {
        if (this.a) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        androidx.compose.runtime.t.b("Unexpected form of a provided value");
        com.google.gson.b.b();
        return null;
    }

    public r(q qVar) {
        this.e = null;
        this.f = null;
        this.a = false;
        this.b = false;
        this.d = qVar;
    }
}
