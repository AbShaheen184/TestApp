package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.firebase.b {
    public int l;
    public int m = -1;
    public final /* synthetic */ SwipeDismissBehavior n;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.n = swipeDismissBehavior;
    }

    @Override // com.google.firebase.b
    public final void C(View view, int i) {
        this.m = i;
        this.l = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.n;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // com.google.firebase.b
    public final void E(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.n;
        float f = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i - this.l);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // com.google.firebase.b
    public final void F(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.m = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.n;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.l;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.l;
                    if (left < i2) {
                        i = this.l - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.l - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.l) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.l;
                    if (left < i2) {
                        i = this.l - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.l - width;
                }
                z = true;
            } else {
                i = this.l;
            }
        }
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
            view.postOnAnimation(new d(swipeDismissBehavior, view, z));
        }
    }

    @Override // com.google.firebase.b
    public final boolean J(View view, int i) {
        int i2 = this.m;
        return (i2 == -1 || i2 == i) && this.n.r(view);
    }

    @Override // com.google.firebase.b
    public final int i(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.n.d;
        if (i2 == 0) {
            width = this.l;
            if (z) {
                width -= view.getWidth();
                width2 = this.l;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.l;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = view.getWidth() + this.l;
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.l;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.google.firebase.b
    public final int j(View view, int i) {
        return view.getTop();
    }

    @Override // com.google.firebase.b
    public final int v(View view) {
        return view.getWidth();
    }

    @Override // com.google.firebase.b
    public final void D(int i) {
    }
}
