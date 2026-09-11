package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends ViewGroup {
    public final HashMap e;
    public final HashMap y;

    public x0(Context context) {
        super(context);
        setClipChildren(false);
        this.e = new HashMap();
        this.y = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.h, androidx.compose.ui.node.f0> getHolderToLayoutNode() {
        return this.e;
    }

    public final HashMap<androidx.compose.ui.node.f0, androidx.compose.ui.viewinterop.h> getLayoutNodeToHolder() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (androidx.compose.ui.viewinterop.h hVar : this.e.keySet()) {
            hVar.layout(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            androidx.compose.ui.internal.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            androidx.compose.ui.internal.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (androidx.compose.ui.viewinterop.h hVar : this.e.keySet()) {
            int i4 = hVar.S;
            if (i4 != Integer.MIN_VALUE && (i3 = hVar.T) != Integer.MIN_VALUE) {
                hVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.e.get(childAt);
            if (childAt.isLayoutRequested() && f0Var != null) {
                androidx.compose.ui.node.f0.V(f0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
