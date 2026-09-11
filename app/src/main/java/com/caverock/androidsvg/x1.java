package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.math.a {
    public float n = 0.0f;
    public final /* synthetic */ y1 o;

    public x1(y1 y1Var) {
        this.o = y1Var;
    }

    @Override // kotlin.math.a
    public final void A(String str) {
        this.n = ((w1) this.o.c).d.measureText(str) + this.n;
    }
}
