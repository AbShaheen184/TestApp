package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                l lVar = (l) this.b;
                lVar.c.setAlpha(iFloatValue);
                lVar.d.setAlpha(iFloatValue);
                lVar.s.invalidate();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.material.shape.j jVar = ((BottomSheetBehavior) this.b).i;
                if (jVar != null) {
                    com.google.android.material.shape.h hVar = jVar.y;
                    if (hVar.j != fFloatValue) {
                        hVar.j = fFloatValue;
                        jVar.C = true;
                        jVar.D = true;
                        jVar.invalidateSelf();
                    }
                }
                break;
            default:
                ((TextInputLayout) this.b).T0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
