package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends v {
    public static final RectF h = new RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    public t(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // com.google.android.material.shape.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.d;
        float f2 = this.e;
        RectF rectF = h;
        rectF.set(this.b, this.c, f, f2);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
