package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r {
    public Canvas a = d.a;
    public Rect b;
    public Rect c;

    @Override // androidx.compose.ui.graphics.r
    public final void a(j jVar) {
        Canvas canvas = this.a;
        if (jVar instanceof j) {
            canvas.clipPath(jVar.a, Region.Op.INTERSECT);
        } else {
            com.google.gson.b.r("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.r
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void d(g gVar, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.drawBitmap(h.a(gVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void e(j jVar, com.google.android.gms.cloudmessaging.n nVar) {
        Canvas canvas = this.a;
        if (jVar instanceof j) {
            canvas.drawPath(jVar.a, (Paint) nVar.y);
        } else {
            com.google.gson.b.r("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.r
    public final void f() {
        this.a.save();
    }

    @Override // androidx.compose.ui.graphics.r
    public final void g() {
        a0.l(this.a, false);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void h(androidx.compose.ui.geometry.c cVar, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.saveLayer(cVar.a, cVar.b, cVar.c, cVar.d, (Paint) nVar.y, 31);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void i(long j, long j2, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void j(float[] fArr) {
        if (a0.r(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        a0.t(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void m(float f, float f2, float f3, float f4, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.drawRect(f, f2, f3, f4, (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void n(float f, long j, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void o(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void p(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void q() {
        this.a.restore();
    }

    @Override // androidx.compose.ui.graphics.r
    public final void r(g gVar, long j, long j2, long j3, com.google.android.gms.cloudmessaging.n nVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapA = h.a(gVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) 0;
        rect2.left = i3;
        int i4 = (int) 0;
        rect2.top = i4;
        rect2.right = i3 + ((int) (j3 >> 32));
        rect2.bottom = i4 + ((int) (4294967295L & j3));
        canvas.drawBitmap(bitmapA, rect, rect2, (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void s(float f, float f2, float f3, float f4, float f5, float f6, com.google.android.gms.cloudmessaging.n nVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) nVar.y);
    }

    @Override // androidx.compose.ui.graphics.r
    public final void t() {
        a0.l(this.a, true);
    }
}
