package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends u1 {
    public final Path q;
    public final /* synthetic */ y1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(y1 y1Var, Path path, float f) {
        super(y1Var, f, 0.0f);
        this.r = y1Var;
        this.q = path;
    }

    @Override // com.caverock.androidsvg.u1, kotlin.math.a
    public final void A(String str) {
        y1 y1Var = this.r;
        if (y1Var.w0()) {
            w1 w1Var = (w1) y1Var.c;
            if (w1Var.b) {
                ((Canvas) y1Var.a).drawTextOnPath(str, this.q, this.n, this.o, w1Var.d);
            }
            w1 w1Var2 = (w1) y1Var.c;
            if (w1Var2.c) {
                ((Canvas) y1Var.a).drawTextOnPath(str, this.q, this.n, this.o, w1Var2.e);
            }
        }
        this.n = ((w1) y1Var.c).d.measureText(str) + this.n;
    }
}
