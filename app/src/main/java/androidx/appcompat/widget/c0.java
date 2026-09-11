package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends androidx.core.content.res.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ WeakReference g;
    public final /* synthetic */ h0 h;

    public c0(h0 h0Var, int i, int i2, WeakReference weakReference) {
        this.h = h0Var;
        this.e = i;
        this.f = i2;
        this.g = weakReference;
    }

    @Override // androidx.core.content.res.b
    public final void f(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.e) != -1) {
            typeface = g0.a(typeface, i, (this.f & 2) != 0);
        }
        h0 h0Var = this.h;
        if (h0Var.m) {
            h0Var.l = typeface;
            TextView textView = (TextView) this.g.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = h0Var.j;
                if (zIsAttachedToWindow) {
                    textView.post(new d0(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // androidx.core.content.res.b
    public final void e(int i) {
    }
}
