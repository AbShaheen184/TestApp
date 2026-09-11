package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.material.shape.h {
    public final RectF r;

    public e(e eVar) {
        super(eVar);
        this.r = eVar.r;
    }

    @Override // com.google.android.material.shape.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(this);
        fVar.d0 = this;
        fVar.invalidateSelf();
        return fVar;
    }

    public e(com.google.android.material.shape.o oVar, RectF rectF) {
        super(oVar);
        this.r = rectF;
    }
}
