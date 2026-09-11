package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ l b;

    public j(l lVar) {
        this.b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        l lVar = this.b;
        if (((Float) lVar.z.getAnimatedValue()).floatValue() == 0.0f) {
            lVar.A = 0;
            lVar.f(0);
        } else {
            lVar.A = 2;
            lVar.s.invalidate();
        }
    }
}
