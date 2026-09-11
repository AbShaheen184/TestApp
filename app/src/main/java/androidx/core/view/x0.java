package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ f1 a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ z1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public x0(f1 f1Var, z1 z1Var, z1 z1Var2, int i, View view) {
        this.a = f1Var;
        this.b = z1Var;
        this.c = z1Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n1 h1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        f1 f1Var = this.a;
        e1 e1Var = f1Var.a;
        e1Var.e(animatedFraction);
        float fC = e1Var.c();
        PathInterpolator pathInterpolator = a1.e;
        int i = Build.VERSION.SDK_INT;
        z1 z1Var = this.b;
        if (i >= 36) {
            h1Var = new m1(z1Var);
        } else if (i >= 35) {
            h1Var = new l1(z1Var);
        } else if (i >= 34) {
            h1Var = new k1(z1Var);
        } else if (i >= 31) {
            h1Var = new j1(z1Var);
        } else if (i >= 30) {
            h1Var = new i1(z1Var);
        } else {
            h1Var = i >= 29 ? new h1(z1Var) : new g1(z1Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            w1 w1Var = z1Var.a;
            if (i3 == 0) {
                h1Var.d(i2, w1Var.i(i2));
            } else {
                androidx.core.graphics.c cVarI = w1Var.i(i2);
                androidx.core.graphics.c cVarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                h1Var.d(i2, z1.b(cVarI, (int) (((double) ((cVarI.a - cVarI2.a) * f)) + 0.5d), (int) (((double) ((cVarI.b - cVarI2.b) * f)) + 0.5d), (int) (((double) ((cVarI.c - cVarI2.c) * f)) + 0.5d), (int) (((double) ((cVarI.d - cVarI2.d) * f)) + 0.5d)));
            }
        }
        a1.h(this.e, h1Var.b(), Collections.singletonList(f1Var));
    }
}
