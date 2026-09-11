package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    @Override // com.google.android.material.shape.j
    public final void f(Canvas canvas) {
        if (this.d0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        e eVar = this.d0;
        if (i >= 26) {
            canvas.clipOutRect(eVar.r);
        } else {
            canvas.clipRect(eVar.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
