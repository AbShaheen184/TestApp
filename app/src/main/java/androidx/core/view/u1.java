package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class u1 extends t1 {
    public static final z1 x = z1.d(null, WindowInsets.CONSUMED);

    public u1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var, windowInsets);
    }

    @Override // androidx.core.view.s1, androidx.core.view.o1, androidx.core.view.w1
    public androidx.core.graphics.c i(int i) {
        return androidx.core.graphics.c.c(this.c.getInsets(y1.a(i)));
    }

    @Override // androidx.core.view.s1, androidx.core.view.o1, androidx.core.view.w1
    public androidx.core.graphics.c j(int i) {
        return androidx.core.graphics.c.c(this.c.getInsetsIgnoringVisibility(y1.a(i)));
    }

    @Override // androidx.core.view.s1, androidx.core.view.o1, androidx.core.view.w1
    public boolean u(int i) {
        return this.c.isVisible(y1.a(i));
    }

    public u1(z1 z1Var, u1 u1Var) {
        super(z1Var, u1Var);
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public void p(View view) {
    }
}
