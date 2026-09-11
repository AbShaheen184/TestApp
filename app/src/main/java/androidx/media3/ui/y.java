package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ y(a0 a0Var, int i) {
        this.a = i;
        this.b = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                View view = a0Var.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = a0Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = a0Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = a0Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.b.i(0);
                break;
            case 3:
                this.b.i(0);
                break;
            case 4:
                ViewGroup viewGroup4 = this.b.g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup5 = this.b.i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        a0 a0Var = this.b;
        switch (i) {
            case 0:
                View view = a0Var.k;
                if ((view instanceof g) && !a0Var.B) {
                    g gVar = (g) view;
                    ValueAnimator valueAnimator = gVar.e0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(gVar.f0, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = a0Var.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = a0Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = a0Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = a0Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(a0Var.B ? 0 : 4);
                }
                View view3 = a0Var.k;
                if ((view3 instanceof g) && !a0Var.B) {
                    g gVar2 = (g) view3;
                    ValueAnimator valueAnimator2 = gVar2.e0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    gVar2.g0 = false;
                    valueAnimator2.setFloatValues(gVar2.f0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                a0Var.i(4);
                break;
            case 3:
                a0Var.i(4);
                break;
            case 4:
                ViewGroup viewGroup4 = a0Var.i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup5 = a0Var.g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                break;
        }
    }
}
