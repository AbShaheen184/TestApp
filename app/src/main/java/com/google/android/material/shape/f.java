package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    @Override // com.google.android.material.shape.e
    public final void f(x xVar, float f, float f2) {
        float f3 = f2 * f;
        xVar.d(f3, 180.0f, 90.0f);
        double d = f3;
        xVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d), (float) (Math.sin(Math.toRadians(0.0f)) * d));
    }
}
