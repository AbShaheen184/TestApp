package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends androidx.compose.ui.node.j implements androidx.compose.ui.node.m {
    public final n N;
    public final p0 O;
    public final androidx.compose.foundation.layout.m0 P;

    public w0(androidx.compose.ui.input.pointer.l0 l0Var, n nVar, p0 p0Var, androidx.compose.foundation.layout.m0 m0Var) {
        this.N = nVar;
        this.O = p0Var;
        this.P = m0Var;
        L0(l0Var);
    }

    public static boolean O0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.m
    public final void W(androidx.compose.ui.node.h0 h0Var) {
        boolean zO0;
        char c;
        long j;
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jD = bVar.d();
        n nVar = this.N;
        nVar.i(jD);
        if (androidx.compose.ui.geometry.e.e(bVar.d())) {
            h0Var.b();
            return;
        }
        h0Var.b();
        nVar.d.getValue();
        Canvas canvasA = androidx.compose.ui.graphics.d.a(bVar.y.w());
        p0 p0Var = this.O;
        boolean zF = p0.f(p0Var.f);
        androidx.compose.foundation.layout.m0 m0Var = this.P;
        if (zF) {
            zO0 = O0(270.0f, (((long) Float.floatToRawIntBits(h0Var.V(m0Var.a(h0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) << 32), p0Var.c(), canvasA);
        } else {
            zO0 = false;
        }
        if (p0.f(p0Var.d)) {
            c = ' ';
            j = 4294967295L;
            zO0 = O0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(h0Var.V(m0Var.b))) & 4294967295L), p0Var.e(), canvasA) || zO0;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (p0.f(p0Var.g)) {
            zO0 = O0(90.0f, (((long) Float.floatToRawIntBits(h0Var.V(m0Var.b(h0Var.getLayoutDirection())) + (-((float) kotlin.math.a.F(Float.intBitsToFloat((int) (bVar.d() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), p0Var.d(), canvasA) || zO0;
        }
        if (p0.f(p0Var.e)) {
            EdgeEffect edgeEffectB = p0Var.b();
            zO0 = O0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (bVar.d() & j))) + h0Var.V(m0Var.d))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() >> c)))) << c), edgeEffectB, canvasA) || zO0;
        }
        if (zO0) {
            nVar.d();
        }
    }
}
