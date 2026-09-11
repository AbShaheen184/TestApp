package com.caverock.androidsvg;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class u1 extends kotlin.math.a {
    public float n;
    public float o;
    public final /* synthetic */ y1 p;

    public u1(y1 y1Var, float f, float f2) {
        this.p = y1Var;
        this.n = f;
        this.o = f2;
    }

    @Override // kotlin.math.a
    public void A(String str) {
        y1 y1Var = this.p;
        Canvas canvas = (Canvas) y1Var.a;
        if (y1Var.w0()) {
            w1 w1Var = (w1) y1Var.c;
            if (w1Var.b) {
                canvas.drawText(str, this.n, this.o, w1Var.d);
            }
            w1 w1Var2 = (w1) y1Var.c;
            if (w1Var2.c) {
                canvas.drawText(str, this.n, this.o, w1Var2.e);
            }
        }
        this.n = ((w1) y1Var.c).d.measureText(str) + this.n;
    }
}
