package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.l0;
import com.app.mlounge.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends LinearLayout {
    public final CheckableImageButton A;
    public ColorStateList B;
    public PorterDuff.Mode C;
    public int D;
    public ImageView.ScaleType E;
    public View.OnLongClickListener F;
    public boolean G;
    public final TextInputLayout e;
    public final l0 y;
    public CharSequence z;

    public u(TextInputLayout textInputLayout, c2 c2Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.A = checkableImageButton;
        l0 l0Var = new l0(getContext(), null);
        this.y = l0Var;
        if (com.google.android.material.resources.c.m(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.F;
        checkableImageButton.setOnClickListener(null);
        p.v(checkableImageButton, onLongClickListener);
        this.F = null;
        checkableImageButton.setOnLongClickListener(null);
        p.v(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c2Var.z;
        if (typedArray.hasValue(70)) {
            this.B = com.google.android.material.resources.c.k(getContext(), c2Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.C = com.google.android.material.internal.j.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(c2Var.D(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            net.luminis.tls.engine.impl.c.o("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.D) {
            this.D = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeG = p.g(typedArray.getInt(69, -1));
            this.E = scaleTypeG;
            checkableImageButton.setScaleType(scaleTypeG);
        }
        l0Var.setVisibility(8);
        l0Var.setId(R.id.textinput_prefix_text);
        l0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        l0Var.setAccessibilityLiveRegion(1);
        l0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            l0Var.setTextColor(c2Var.z(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.z = TextUtils.isEmpty(text2) ? null : text2;
        l0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(l0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.A;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.y.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.B;
            PorterDuff.Mode mode = this.C;
            TextInputLayout textInputLayout = this.e;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            p.u(textInputLayout, checkableImageButton, this.B);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.F;
        checkableImageButton.setOnClickListener(null);
        p.v(checkableImageButton, onLongClickListener);
        this.F = null;
        checkableImageButton.setOnLongClickListener(null);
        p.v(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.A;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.e.B;
        if (editText == null) {
            return;
        }
        this.y.setPaddingRelative(this.A.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.z == null || this.G) ? 8 : 0;
        setVisibility((this.A.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.y.setVisibility(i);
        this.e.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
