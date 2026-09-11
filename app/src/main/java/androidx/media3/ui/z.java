package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ a0 c;

    public /* synthetic */ z(a0 a0Var, v vVar, int i) {
        this.a = i;
        this.c = a0Var;
        this.b = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a0 a0Var = this.c;
                a0Var.i(1);
                if (a0Var.C) {
                    this.b.post(a0Var.t);
                    a0Var.C = false;
                }
                break;
            case 1:
                a0 a0Var2 = this.c;
                a0Var2.i(2);
                if (a0Var2.C) {
                    this.b.post(a0Var2.t);
                    a0Var2.C = false;
                }
                break;
            default:
                a0 a0Var3 = this.c;
                a0Var3.i(2);
                if (a0Var3.C) {
                    this.b.post(a0Var3.t);
                    a0Var3.C = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.i(3);
                break;
            case 1:
                this.c.i(3);
                break;
            default:
                this.c.i(3);
                break;
        }
    }
}
