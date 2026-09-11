package com.google.android.material.shape;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class h extends Drawable.ConstantState {
    public o a;
    public b0 b;
    public com.google.android.material.elevation.a c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public final Paint.Style q;

    public h(h hVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = hVar.a;
        this.b = hVar.b;
        this.c = hVar.c;
        this.k = hVar.k;
        this.d = hVar.d;
        this.e = hVar.e;
        this.g = hVar.g;
        this.f = hVar.f;
        this.l = hVar.l;
        this.i = hVar.i;
        this.p = hVar.p;
        this.j = hVar.j;
        this.m = hVar.m;
        this.n = hVar.n;
        this.o = hVar.o;
        this.q = hVar.q;
        if (hVar.h != null) {
            this.h = new Rect(hVar.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.C = true;
        jVar.D = true;
        return jVar;
    }

    public h(o oVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = oVar;
        this.c = null;
    }
}
