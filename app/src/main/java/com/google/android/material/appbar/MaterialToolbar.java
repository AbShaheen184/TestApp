package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.coreshims.b;
import com.app.mlounge.R;
import com.google.android.material.internal.j;
import com.google.android.material.shape.k;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] v0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer q0;
    public boolean r0;
    public boolean s0;
    public ImageView.ScaleType t0;
    public Boolean u0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, com.google.android.material.a.p, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayE.hasValue(2)) {
            setNavigationIconTint(typedArrayE.getColor(2, -1));
        }
        this.r0 = typedArrayE.getBoolean(4, false);
        this.s0 = typedArrayE.getBoolean(3, false);
        int i = typedArrayE.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = v0;
            if (i < scaleTypeArr.length) {
                this.t0 = scaleTypeArr[i];
            }
        }
        if (typedArrayE.hasValue(0)) {
            this.u0 = Boolean.valueOf(typedArrayE.getBoolean(0, false));
        }
        typedArrayE.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : b.m(background);
        if (colorStateListValueOf != null) {
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            jVar.n(colorStateListValueOf);
            jVar.k(context2);
            jVar.m(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.t0;
    }

    public Integer getNavigationIconTint() {
        return this.q0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.j) {
            k.L(this, (com.google.android.material.shape.j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        com.google.android.material.internal.k kVar = j.c;
        ImageView imageView2 = null;
        if (this.r0 || this.s0) {
            ArrayList arrayListD = j.d(this, getTitle());
            TextView textView = arrayListD.isEmpty() ? null : (TextView) Collections.min(arrayListD, kVar);
            ArrayList arrayListD2 = j.d(this, getSubtitle());
            TextView textView2 = arrayListD2.isEmpty() ? null : (TextView) Collections.max(arrayListD2, kVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.r0 && textView != null) {
                    t(textView, pair);
                }
                if (this.s0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.u0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.t0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.j) {
            ((com.google.android.material.shape.j) background).m(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.u0;
        if (bool == null || bool.booleanValue() != z) {
            this.u0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.t0 != scaleType) {
            this.t0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.q0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.q0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.q0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
