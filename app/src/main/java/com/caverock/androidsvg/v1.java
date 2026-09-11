package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends kotlin.math.a {
    public final /* synthetic */ int n;
    public float o;
    public final float p;
    public final /* synthetic */ y1 q;
    public final Object r;

    public v1(y1 y1Var, float f, float f2) {
        this.n = 1;
        this.q = y1Var;
        this.r = new RectF();
        this.o = f;
        this.p = f2;
    }

    @Override // kotlin.math.a
    public final void A(String str) {
        String str2;
        switch (this.n) {
            case 0:
                y1 y1Var = this.q;
                if (y1Var.w0()) {
                    Path path = new Path();
                    str2 = str;
                    ((w1) y1Var.c).d.getTextPath(str2, 0, str.length(), this.o, this.p, path);
                    ((Path) this.r).addPath(path);
                } else {
                    str2 = str;
                }
                this.o = ((w1) y1Var.c).d.measureText(str2) + this.o;
                break;
            default:
                y1 y1Var2 = this.q;
                if (y1Var2.w0()) {
                    Rect rect = new Rect();
                    ((w1) y1Var2.c).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.o, this.p);
                    ((RectF) this.r).union(rectF);
                }
                this.o = ((w1) y1Var2.c).d.measureText(str) + this.o;
                break;
        }
    }

    @Override // kotlin.math.a
    public final boolean r(k1 k1Var) {
        switch (this.n) {
            case 0:
                if (!(k1Var instanceof l1)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(k1Var instanceof l1)) {
                    return true;
                }
                l1 l1Var = (l1) k1Var;
                x0 x0VarW = k1Var.a.W(l1Var.n);
                if (x0VarW == null) {
                    y1.z("TextPath path reference '%s' not found", l1Var.n);
                } else {
                    j0 j0Var = (j0) x0VarW;
                    s1 s1Var = new s1(j0Var.o);
                    Matrix matrix = j0Var.n;
                    Path path = s1Var.a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.r).union(rectF);
                }
                return false;
        }
    }

    public v1(y1 y1Var, float f, float f2, Path path) {
        this.n = 0;
        this.q = y1Var;
        this.o = f;
        this.p = f2;
        this.r = path;
    }
}
