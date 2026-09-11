package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {
    public final r0 a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public androidx.compose.ui.geometry.a f;
    public androidx.compose.ui.geometry.a g;
    public boolean h;

    public w1(w1 w1Var) {
        this.b = w1Var.b;
        this.c = w1Var.c;
        this.d = new Paint(w1Var.d);
        this.e = new Paint(w1Var.e);
        androidx.compose.ui.geometry.a aVar = w1Var.f;
        if (aVar != null) {
            this.f = new androidx.compose.ui.geometry.a(aVar);
        }
        androidx.compose.ui.geometry.a aVar2 = w1Var.g;
        if (aVar2 != null) {
            this.g = new androidx.compose.ui.geometry.a(aVar2);
        }
        this.h = w1Var.h;
        try {
            this.a = (r0) w1Var.a.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.a = r0.a();
        }
    }

    public w1() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = r0.a();
    }
}
