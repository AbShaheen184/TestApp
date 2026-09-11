package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.s0;
import androidx.media3.exoplayer.dash.manifest.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends androidx.coordinatorlayout.widget.a {
    public androidx.customview.widget.d a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final c g = new c(this);

    @Override // androidx.coordinatorlayout.widget.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (zO) {
            if (this.a == null) {
                this.a = new androidx.customview.widget.d(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            s0.j(view, 1048576);
            s0.g(view, 0);
            if (r(view)) {
                s0.k(view, androidx.core.view.accessibility.b.l, new t(this, 29));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
