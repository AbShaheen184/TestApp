package com.google.android.material.animation;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final androidx.interpolator.view.animation.a b = new androidx.interpolator.view.animation.a(androidx.interpolator.view.animation.a.d);
    public static final androidx.interpolator.view.animation.a c = new androidx.interpolator.view.animation.a();
    public static final androidx.interpolator.view.animation.a d = new androidx.interpolator.view.animation.a(androidx.interpolator.view.animation.a.e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
