package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.q1;
import androidx.core.view.k0;
import androidx.core.view.s0;
import androidx.core.view.z1;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.compose.ui.platform.a implements androidx.core.view.s {
    public final Window F;
    public final h1 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;

    public v(Context context, Window window) {
        super(context);
        this.F = window;
        this.G = androidx.compose.runtime.s.r(t.a);
        Field field = s0.a;
        k0.c(this, this);
        s0.o(this, new androidx.compose.ui.viewinterop.a(this, 1));
    }

    @Override // androidx.compose.ui.platform.a
    public final void a(int i, androidx.compose.runtime.r rVar) {
        rVar.c0(1735448596);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            ((kotlin.jvm.functions.p) this.G.getValue()).invoke(rVar, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.f(this, i, 5);
        }
    }

    @Override // androidx.compose.ui.platform.a
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // androidx.compose.ui.platform.a
    public final void f(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.F;
        if (mode != Integer.MIN_VALUE || this.H || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.I) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = p.a.a(window);
            } else if (i3 < 32) {
                iA = r.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.I || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.H) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.compose.ui.platform.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.K;
    }

    @Override // androidx.core.view.s
    public final z1 i(View view, z1 z1Var) {
        if (!this.I) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return z1Var.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return z1Var;
    }
}
