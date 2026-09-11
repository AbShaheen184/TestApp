package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public e a;
    public e b;
    public e c;
    public e d;
    public d e = new a(0.0f);
    public d f = new a(0.0f);
    public d g = new a(0.0f);
    public d h = new a(0.0f);
    public g i = new g();
    public g j = new g();
    public g k = new g();
    public g l = new g();

    public o() {
        int i = 0;
        this.a = new m(i);
        this.b = new m(i);
        this.c = new m(i);
        this.d = new m(i);
    }

    public static n a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(com.google.android.material.a.s);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            d dVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            d dVarC2 = c(typedArrayObtainStyledAttributes, 8, dVarC);
            d dVarC3 = c(typedArrayObtainStyledAttributes, 9, dVarC);
            d dVarC4 = c(typedArrayObtainStyledAttributes, 7, dVarC);
            d dVarC5 = c(typedArrayObtainStyledAttributes, 6, dVarC);
            n nVar = new n();
            nVar.a = k.F(i4);
            nVar.e = dVarC2;
            nVar.b = k.F(i5);
            nVar.f = dVarC3;
            nVar.c = k.F(i6);
            nVar.g = dVarC4;
            nVar.d = k.F(i7);
            nVar.h = dVarC5;
            return nVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static n b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.m, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.b instanceof m) && (this.a instanceof m) && (this.c instanceof m) && (this.d instanceof m);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.l.getClass().equals(g.class) && this.j.getClass().equals(g.class) && this.i.getClass().equals(g.class) && this.k.getClass().equals(g.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final n f() {
        n nVar = new n();
        nVar.a = this.a;
        nVar.b = this.b;
        nVar.c = this.c;
        nVar.d = this.d;
        nVar.e = this.e;
        nVar.f = this.f;
        nVar.g = this.g;
        nVar.h = this.h;
        nVar.i = this.i;
        nVar.j = this.j;
        nVar.k = this.k;
        nVar.l = this.l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
