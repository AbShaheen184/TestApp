package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends com.google.android.material.shape.j {
    public static final /* synthetic */ int e0 = 0;
    public e d0;

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.d0 = new e(this.d0);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.d0.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
