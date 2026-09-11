package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public y0(View view, f1 f1Var) {
        this.b = f1Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.b;
                f1Var.a.e(1.0f);
                a1.f((View) this.c, f1Var);
                break;
            default:
                ((androidx.collection.f) this.b).remove(animator);
                ((androidx.transition.m) this.c).K.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((androidx.transition.m) this.c).K.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public y0(androidx.transition.m mVar, androidx.collection.f fVar) {
        this.c = mVar;
        this.b = fVar;
    }
}
