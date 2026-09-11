package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.mlounge.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends androidx.coordinatorlayout.widget.a {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public a h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = com.google.android.material.motion.a.B(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = com.google.android.material.motion.a.B(view.getContext(), R.attr.motionDurationMedium4, Token.COMMENT);
        this.d = com.google.android.material.motion.a.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.d);
        this.e = com.google.android.material.motion.a.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || this.h != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new androidx.appcompat.view.menu.d(this, 4));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                r(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
        this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new androidx.appcompat.widget.b(this, 2));
    }

    @Override // androidx.coordinatorlayout.widget.a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public final void r(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
        this.k = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new androidx.appcompat.widget.b(this, 2));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
