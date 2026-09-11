package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v {
    @Override // kotlin.math.a
    public final void I(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.v
    public final void O(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.v
    public final void P(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.v
    public final void Q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.v
    public final void R(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // kotlin.math.a
    public final float y(View view) {
        return view.getTransitionAlpha();
    }
}
