package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.app.mlounge.R;
import com.google.android.material.resources.c;
import com.google.android.material.shape.j;
import com.google.android.material.theme.overlay.a;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public int A;
    public int B;
    public final j e;
    public int y;
    public int z;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.e = new j();
        TypedArray typedArrayE = com.google.android.material.internal.j.e(context2, attributeSet, com.google.android.material.a.l, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.y = typedArrayE.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.A = typedArrayE.getDimensionPixelOffset(2, 0);
        this.B = typedArrayE.getDimensionPixelOffset(1, 0);
        setDividerColor(c.j(context2, typedArrayE, 0).getDefaultColor());
        typedArrayE.recycle();
    }

    public int getDividerColor() {
        return this.z;
    }

    public int getDividerInsetEnd() {
        return this.B;
    }

    public int getDividerInsetStart() {
        return this.A;
    }

    public int getDividerThickness() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.B : this.A;
        if (z) {
            width = getWidth();
            i = this.A;
        } else {
            width = getWidth();
            i = this.B;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        j jVar = this.e;
        jVar.setBounds(i2, 0, i3, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.y;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.z != i) {
            this.z = i;
            this.e.n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.B = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.A = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.y != i) {
            this.y = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
