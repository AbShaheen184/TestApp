package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.z0;
import androidx.compose.foundation.gestures.z1;
import androidx.core.view.s0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] a1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public final int A;
    public ColorDrawable A0;
    public EditText B;
    public int B0;
    public CharSequence C;
    public final LinkedHashSet C0;
    public int D;
    public ColorDrawable D0;
    public int E;
    public int E0;
    public int F;
    public Drawable F0;
    public int G;
    public ColorStateList G0;
    public final s H;
    public ColorStateList H0;
    public boolean I;
    public int I0;
    public int J;
    public int J0;
    public boolean K;
    public int K0;
    public x L;
    public ColorStateList L0;
    public l0 M;
    public int M0;
    public int N;
    public int N0;
    public int O;
    public int O0;
    public CharSequence P;
    public int P0;
    public boolean Q;
    public int Q0;
    public l0 R;
    public int R0;
    public ColorStateList S;
    public boolean S0;
    public int T;
    public final com.google.android.material.internal.c T0;
    public androidx.transition.h U;
    public boolean U0;
    public androidx.transition.h V;
    public boolean V0;
    public ColorStateList W;
    public ValueAnimator W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public ColorStateList a0;
    public ColorStateList b0;
    public ColorStateList c0;
    public boolean d0;
    public final FrameLayout e;
    public CharSequence e0;
    public boolean f0;
    public com.google.android.material.shape.j g0;
    public com.google.android.material.shape.j h0;
    public StateListDrawable i0;
    public boolean j0;
    public com.google.android.material.shape.j k0;
    public com.google.android.material.shape.j l0;
    public com.google.android.material.shape.o m0;
    public boolean n0;
    public final int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final Rect w0;
    public final Rect x0;
    public final u y;
    public final RectF y0;
    public final n z;
    public Typeface z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, com.app.mlounge.R.attr.textInputStyle, com.app.mlounge.R.style.Widget_Design_TextInputLayout), attributeSet, com.app.mlounge.R.attr.textInputStyle);
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = new s(this);
        this.L = new androidx.transition.k(23);
        this.w0 = new Rect();
        this.x0 = new Rect();
        this.y0 = new RectF();
        this.C0 = new LinkedHashSet();
        com.google.android.material.internal.c cVar = new com.google.android.material.internal.c(this);
        this.T0 = cVar;
        this.Z0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = com.google.android.material.animation.a.a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.g != 8388659) {
            cVar.g = 8388659;
            cVar.j(false);
        }
        com.google.android.material.internal.j.a(context2, attributeSet, com.app.mlounge.R.attr.textInputStyle, com.app.mlounge.R.style.Widget_Design_TextInputLayout);
        int[] iArr = com.google.android.material.a.x;
        com.google.android.material.internal.j.b(context2, attributeSet, iArr, com.app.mlounge.R.attr.textInputStyle, com.app.mlounge.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.app.mlounge.R.attr.textInputStyle, com.app.mlounge.R.style.Widget_Design_TextInputLayout);
        c2 c2Var = new c2(context2, typedArrayObtainStyledAttributes);
        u uVar = new u(this, c2Var);
        this.y = uVar;
        this.d0 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.V0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.U0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.m0 = com.google.android.material.shape.o.b(context2, attributeSet, com.app.mlounge.R.attr.textInputStyle, com.app.mlounge.R.style.Widget_Design_TextInputLayout).a();
        this.o0 = context2.getResources().getDimensionPixelOffset(com.app.mlounge.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.A = getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.r0 = this.s0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        com.google.android.material.shape.n nVarF = this.m0.f();
        if (dimension >= 0.0f) {
            nVarF.e = new com.google.android.material.shape.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            nVarF.f = new com.google.android.material.shape.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            nVarF.g = new com.google.android.material.shape.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            nVarF.h = new com.google.android.material.shape.a(dimension4);
        }
        this.m0 = nVarF.a();
        ColorStateList colorStateListK = com.google.android.material.resources.c.k(context2, c2Var, 7);
        if (colorStateListK != null) {
            int defaultColor = colorStateListK.getDefaultColor();
            this.M0 = defaultColor;
            this.v0 = defaultColor;
            if (colorStateListK.isStateful()) {
                this.N0 = colorStateListK.getColorForState(new int[]{-16842910}, -1);
                this.O0 = colorStateListK.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.P0 = colorStateListK.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.O0 = this.M0;
                ColorStateList colorStateListT = org.jsoup.helper.n.t(context2, com.app.mlounge.R.color.mtrl_filled_background_color);
                this.N0 = colorStateListT.getColorForState(new int[]{-16842910}, -1);
                this.P0 = colorStateListT.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.v0 = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
            this.P0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListZ = c2Var.z(1);
            this.H0 = colorStateListZ;
            this.G0 = colorStateListZ;
        }
        ColorStateList colorStateListK2 = com.google.android.material.resources.c.k(context2, c2Var, 14);
        this.K0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.I0 = context2.getColor(com.app.mlounge.R.color.mtrl_textinput_default_box_stroke_color);
        this.Q0 = context2.getColor(com.app.mlounge.R.color.mtrl_textinput_disabled_color);
        this.J0 = context2.getColor(com.app.mlounge.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListK2 != null) {
            setBoxStrokeColorStateList(colorStateListK2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(com.google.android.material.resources.c.k(context2, c2Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.b0 = c2Var.z(24);
        this.c0 = c2Var.z(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.O = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.N);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.O);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c2Var.z(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c2Var.z(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c2Var.z(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c2Var.z(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c2Var.z(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c2Var.z(59));
        }
        n nVar = new n(this, c2Var);
        this.z = nVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        c2Var.U();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(nVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.B;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.g0;
        }
        int iS = org.jsoup.helper.n.s(this.B, com.app.mlounge.R.attr.colorControlHighlight);
        int i = this.p0;
        int[][] iArr = a1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            com.google.android.material.shape.j jVar = this.g0;
            int i2 = this.v0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{org.jsoup.helper.n.D(0.1f, iS, i2), i2}), jVar, jVar);
        }
        Context context = getContext();
        com.google.android.material.shape.j jVar2 = this.g0;
        TypedValue typedValueV = com.google.android.material.resources.b.v(com.app.mlounge.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = typedValueV.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueV.data;
        com.google.android.material.shape.j jVar3 = new com.google.android.material.shape.j(jVar2.y.a);
        int iD = org.jsoup.helper.n.D(0.1f, iS, color);
        jVar3.n(new ColorStateList(iArr, new int[]{iD, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iD, color});
        com.google.android.material.shape.j jVar4 = new com.google.android.material.shape.j(jVar2.y.a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.i0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.i0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.i0.addState(new int[0], h(false));
        }
        return this.i0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.h0 == null) {
            this.h0 = h(true);
        }
        return this.h0;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.B != null) {
            net.luminis.tls.engine.impl.c.o("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.B = editText;
        int i = this.D;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.F);
        }
        int i2 = this.E;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.G);
        }
        this.j0 = false;
        k();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.B.getTypeface();
        com.google.android.material.internal.c cVar = this.T0;
        cVar.n(typeface);
        float textSize = this.B.getTextSize();
        if (cVar.h != textSize) {
            cVar.h = textSize;
            cVar.j(false);
        }
        float letterSpacing = this.B.getLetterSpacing();
        if (cVar.X != letterSpacing) {
            cVar.X = letterSpacing;
            cVar.j(false);
        }
        int gravity = this.B.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (cVar.g != i3) {
            cVar.g = i3;
            cVar.j(false);
        }
        if (cVar.f != gravity) {
            cVar.f = gravity;
            cVar.j(false);
        }
        this.R0 = editText.getMinimumHeight();
        this.B.addTextChangedListener(new v(this, editText));
        if (this.G0 == null) {
            this.G0 = this.B.getHintTextColors();
        }
        if (this.d0) {
            if (TextUtils.isEmpty(this.e0)) {
                CharSequence hint = this.B.getHint();
                this.C = hint;
                setHint(hint);
                this.B.setHint((CharSequence) null);
            }
            this.f0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.M != null) {
            p(this.B.getText());
        }
        t();
        this.H.b();
        this.y.bringToFront();
        n nVar = this.z;
        nVar.bringToFront();
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        nVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.e0)) {
            return;
        }
        this.e0 = charSequence;
        com.google.android.material.internal.c cVar = this.T0;
        if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
            cVar.B = charSequence;
            cVar.C = null;
            cVar.j(false);
        }
        if (this.S0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.Q == z) {
            return;
        }
        l0 l0Var = this.R;
        if (!z) {
            if (l0Var != null) {
                l0Var.setVisibility(8);
            }
            this.R = null;
        } else if (l0Var != null) {
            this.e.addView(l0Var);
            this.R.setVisibility(0);
        }
        this.Q = z;
    }

    public final void a() {
        if (this.B == null || this.p0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.B;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.T0.f() + this.A), this.B.getPaddingEnd(), getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.B;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_filled_edittext_font_2_0_padding_top), this.B.getPaddingEnd(), getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.google.android.material.resources.c.m(getContext())) {
            EditText editText3 = this.B;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_filled_edittext_font_1_3_padding_top), this.B.getPaddingEnd(), getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.e;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        com.google.android.material.internal.c cVar = this.T0;
        if (cVar.b == f) {
            return;
        }
        int i = 2;
        if (this.W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W0 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.motion.a.C(getContext(), com.app.mlounge.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.b));
            this.W0.setDuration(com.google.android.material.motion.a.B(getContext(), com.app.mlounge.R.attr.motionDurationMedium4, Token.LET));
            this.W0.addUpdateListener(new androidx.recyclerview.widget.k(this, i));
        }
        this.W0.setFloatValues(cVar.b, f);
        this.W0.start();
    }

    public final void c() {
        int i;
        int i2;
        com.google.android.material.shape.j jVar = this.g0;
        if (jVar == null) {
            return;
        }
        com.google.android.material.shape.o oVar = jVar.y.a;
        com.google.android.material.shape.o oVar2 = this.m0;
        if (oVar != oVar2) {
            jVar.setShapeAppearanceModel(oVar2);
        }
        if (this.p0 == 2 && (i = this.r0) > -1 && (i2 = this.u0) != 0) {
            com.google.android.material.shape.j jVar2 = this.g0;
            jVar2.y.k = i;
            jVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            com.google.android.material.shape.h hVar = jVar2.y;
            if (hVar.e != colorStateListValueOf) {
                hVar.e = colorStateListValueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int iB = this.v0;
        if (this.p0 == 1) {
            iB = androidx.core.graphics.a.b(this.v0, org.jsoup.helper.n.r(getContext(), com.app.mlounge.R.attr.colorSurface, 0));
        }
        this.v0 = iB;
        this.g0.n(ColorStateList.valueOf(iB));
        com.google.android.material.shape.j jVar3 = this.k0;
        if (jVar3 != null && this.l0 != null) {
            if (this.r0 > -1 && this.u0 != 0) {
                jVar3.n(this.B.isFocused() ? ColorStateList.valueOf(this.I0) : ColorStateList.valueOf(this.u0));
                this.l0.n(ColorStateList.valueOf(this.u0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.B == null) {
            org.mozilla.javascript.c.a();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.x0;
        rect2.bottom = i;
        int i2 = this.p0;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.q0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.B.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.B.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.B;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.C != null) {
            boolean z = this.f0;
            this.f0 = false;
            CharSequence hint = editText.getHint();
            this.B.setHint(this.C);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.B.setHint(hint);
                this.f0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.e;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.B) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        com.google.android.material.shape.j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.d0;
        com.google.android.material.internal.c cVar = this.T0;
        if (z) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.e;
            int iSave = canvas2.save();
            if (cVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f = cVar.q;
                float f2 = cVar.r;
                float f3 = cVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((cVar.e0 > 1 || cVar.f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (cVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = cVar.H;
                        float f6 = cVar.I;
                        float f7 = cVar.J;
                        int i2 = cVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, androidx.core.graphics.a.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    cVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (cVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = cVar.H;
                        float f9 = cVar.I;
                        float f10 = cVar.J;
                        int i3 = cVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, androidx.core.graphics.a.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String strTrim = cVar.d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    cVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.l0 == null || (jVar = this.k0) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.B.isFocused()) {
            Rect bounds = this.l0.getBounds();
            Rect bounds2 = this.k0.getBounds();
            float f12 = cVar.b;
            int iCenterX = bounds2.centerX();
            bounds.left = com.google.android.material.animation.a.c(f12, iCenterX, bounds2.left);
            bounds.right = com.google.android.material.animation.a.c(f12, iCenterX, bounds2.right);
            this.l0.draw(canvas2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.X0) {
            return;
        }
        this.X0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.c cVar = this.T0;
        if (cVar != null) {
            cVar.M = drawableState;
            ColorStateList colorStateList2 = cVar.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cVar.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                cVar.j(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.B != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z) {
            invalidate();
        }
        this.X0 = false;
    }

    public final int e() {
        if (this.d0) {
            int i = this.p0;
            com.google.android.material.internal.c cVar = this.T0;
            if (i == 0) {
                return (int) cVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (cVar.f() / 2.0f);
                }
                float f = cVar.f();
                TextPaint textPaint = cVar.P;
                textPaint.setTextSize(cVar.i);
                textPaint.setTypeface(cVar.s);
                textPaint.setLetterSpacing(cVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final androidx.transition.h f() {
        androidx.transition.h hVar = new androidx.transition.h();
        hVar.z = com.google.android.material.motion.a.B(getContext(), com.app.mlounge.R.attr.motionDurationShort2, 87);
        hVar.A = com.google.android.material.motion.a.C(getContext(), com.app.mlounge.R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.a.a);
        return hVar;
    }

    public final boolean g() {
        return this.d0 && !TextUtils.isEmpty(this.e0) && (this.g0 instanceof g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.B;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public com.google.android.material.shape.j getBoxBackground() {
        int i = this.p0;
        if (i == 1 || i == 2) {
            return this.g0;
        }
        org.mozilla.javascript.c.a();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.v0;
    }

    public int getBoxBackgroundMode() {
        return this.p0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.q0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.o oVar = this.m0;
        RectF rectF = this.y0;
        return layoutDirection == 1 ? oVar.h.a(rectF) : oVar.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.o oVar = this.m0;
        RectF rectF = this.y0;
        return layoutDirection == 1 ? oVar.g.a(rectF) : oVar.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.o oVar = this.m0;
        RectF rectF = this.y0;
        return layoutDirection == 1 ? oVar.e.a(rectF) : oVar.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.o oVar = this.m0;
        RectF rectF = this.y0;
        return layoutDirection == 1 ? oVar.f.a(rectF) : oVar.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.L0;
    }

    public int getBoxStrokeWidth() {
        return this.s0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.t0;
    }

    public int getCounterMaxLength() {
        return this.J;
    }

    public CharSequence getCounterOverflowDescription() {
        l0 l0Var;
        if (this.I && this.K && (l0Var = this.M) != null) {
            return l0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.a0;
    }

    public ColorStateList getCounterTextColor() {
        return this.W;
    }

    public ColorStateList getCursorColor() {
        return this.b0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.c0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.G0;
    }

    public EditText getEditText() {
        return this.B;
    }

    public CharSequence getEndIconContentDescription() {
        return this.z.D.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.z.D.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.z.J;
    }

    public int getEndIconMode() {
        return this.z.F;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.z.K;
    }

    public CheckableImageButton getEndIconView() {
        return this.z.D;
    }

    public CharSequence getError() {
        s sVar = this.H;
        if (sVar.q) {
            return sVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.H.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.H.s;
    }

    public int getErrorCurrentTextColors() {
        l0 l0Var = this.H.r;
        if (l0Var != null) {
            return l0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.z.z.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.H;
        if (sVar.x) {
            return sVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        l0 l0Var = this.H.y;
        if (l0Var != null) {
            return l0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.d0) {
            return this.e0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.T0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.c cVar = this.T0;
        return cVar.g(cVar.k);
    }

    public int getHintMaxLines() {
        return this.T0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.H0;
    }

    public x getLengthCounter() {
        return this.L;
    }

    public int getMaxEms() {
        return this.E;
    }

    public int getMaxWidth() {
        return this.G;
    }

    public int getMinEms() {
        return this.D;
    }

    public int getMinWidth() {
        return this.F;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.z.D.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.z.D.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.Q) {
            return this.P;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.T;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.S;
    }

    public CharSequence getPrefixText() {
        return this.y.z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.y.y.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.y.y;
    }

    public com.google.android.material.shape.o getShapeAppearanceModel() {
        return this.m0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.y.A.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.y.A.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.y.D;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.y.E;
    }

    public CharSequence getSuffixText() {
        return this.z.M;
    }

    public ColorStateList getSuffixTextColor() {
        return this.z.N.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.z.N;
    }

    public Typeface getTypeface() {
        return this.z0;
    }

    public final com.google.android.material.shape.j h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.app.mlounge.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.app.mlounge.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.app.mlounge.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        int i = 0;
        com.google.android.material.shape.m mVar = new com.google.android.material.shape.m(i);
        com.google.android.material.shape.m mVar2 = new com.google.android.material.shape.m(i);
        com.google.android.material.shape.m mVar3 = new com.google.android.material.shape.m(i);
        com.google.android.material.shape.m mVar4 = new com.google.android.material.shape.m(i);
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        com.google.android.material.shape.g gVar2 = new com.google.android.material.shape.g();
        com.google.android.material.shape.g gVar3 = new com.google.android.material.shape.g();
        com.google.android.material.shape.g gVar4 = new com.google.android.material.shape.g();
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(f);
        com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a(f);
        com.google.android.material.shape.a aVar3 = new com.google.android.material.shape.a(dimensionPixelOffset);
        com.google.android.material.shape.a aVar4 = new com.google.android.material.shape.a(dimensionPixelOffset);
        com.google.android.material.shape.o oVar = new com.google.android.material.shape.o();
        oVar.a = mVar;
        oVar.b = mVar2;
        oVar.c = mVar3;
        oVar.d = mVar4;
        oVar.e = aVar;
        oVar.f = aVar2;
        oVar.g = aVar4;
        oVar.h = aVar3;
        oVar.i = gVar;
        oVar.j = gVar2;
        oVar.k = gVar3;
        oVar.l = gVar4;
        Context context = getContext();
        Paint paint = com.google.android.material.shape.j.b0;
        TypedValue typedValueV = com.google.android.material.resources.b.v(com.app.mlounge.R.attr.colorSurface, context, com.google.android.material.shape.j.class.getSimpleName());
        int i2 = typedValueV.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueV.data);
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
        jVar.k(context);
        jVar.n(colorStateListValueOf);
        jVar.m(dimensionPixelOffset2);
        jVar.setShapeAppearanceModel(oVar);
        com.google.android.material.shape.h hVar = jVar.y;
        if (hVar.h == null) {
            hVar.h = new Rect();
        }
        jVar.y.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.B.getCompoundPaddingLeft() : this.z.c();
        } else {
            compoundPaddingLeft = this.y.a();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.B.getCompoundPaddingRight() : this.y.a();
        } else {
            compoundPaddingRight = this.z.c();
        }
        return i - compoundPaddingRight;
    }

    public final void k() {
        int i = this.p0;
        if (i == 0) {
            this.g0 = null;
            this.k0 = null;
            this.l0 = null;
        } else if (i == 1) {
            this.g0 = new com.google.android.material.shape.j(this.m0);
            this.k0 = new com.google.android.material.shape.j();
            this.l0 = new com.google.android.material.shape.j();
        } else {
            if (i != 2) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.m(this.p0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.d0 || (this.g0 instanceof g)) {
                this.g0 = new com.google.android.material.shape.j(this.m0);
            } else {
                com.google.android.material.shape.o oVar = this.m0;
                int i2 = g.e0;
                if (oVar == null) {
                    oVar = new com.google.android.material.shape.o();
                }
                e eVar = new e(oVar, new RectF());
                f fVar = new f(eVar);
                fVar.d0 = eVar;
                this.g0 = fVar;
            }
            this.k0 = null;
            this.l0 = null;
        }
        u();
        z();
        if (this.p0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.q0 = getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.google.android.material.resources.c.m(getContext())) {
                this.q0 = getResources().getDimensionPixelSize(com.app.mlounge.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.p0 != 0) {
            v();
        }
        EditText editText = this.B;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.p0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        float lineWidth;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.B.getWidth();
            int gravity = this.B.getGravity();
            com.google.android.material.internal.c cVar = this.T0;
            boolean zC = cVar.c(cVar.B);
            cVar.D = zC;
            Rect rect = cVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = cVar.a0;
                    }
                } else if (zC) {
                    f = rect.right;
                    f2 = cVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.y0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (cVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (cVar.D) {
                        f5 = cVar.a0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (cVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = cVar.a0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = cVar.f() + rect.top;
                if (cVar.Z != null && !cVar.o()) {
                    StaticLayout staticLayout = cVar.Z;
                    lineWidth = (cVar.i / cVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (cVar.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.o0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.r0);
                rectF.top = 0.0f;
                g gVar = (g) this.g0;
                gVar.getClass();
                gVar.t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = cVar.a0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.y0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (cVar.a0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (cVar.a0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = cVar.f() + rect.top;
            if (cVar.Z != null) {
                StaticLayout staticLayout2 = cVar.Z;
                lineWidth = (cVar.i / cVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (cVar.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(l0 l0Var, int i) {
        try {
            l0Var.setTextAppearance(i);
            if (l0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        l0Var.setTextAppearance(com.app.mlounge.R.style.TextAppearance_AppCompat_Caption);
        l0Var.setTextColor(getContext().getColor(com.app.mlounge.R.color.design_error));
    }

    public final boolean o() {
        s sVar = this.H;
        return (sVar.o != 1 || sVar.r == null || TextUtils.isEmpty(sVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        n nVar = this.z;
        nVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.Z0 = false;
        if (this.B != null && this.B.getMeasuredHeight() < (iMax = Math.max(nVar.getMeasuredHeight(), this.y.getMeasuredHeight()))) {
            this.B.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.B.post(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 6));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.B;
        if (editText != null) {
            Rect rect = this.w0;
            com.google.android.material.internal.d.a(this, editText, rect);
            com.google.android.material.shape.j jVar = this.k0;
            if (jVar != null) {
                int i6 = rect.bottom;
                jVar.setBounds(rect.left, i6 - this.s0, rect.right, i6);
            }
            com.google.android.material.shape.j jVar2 = this.l0;
            if (jVar2 != null) {
                int i7 = rect.bottom;
                jVar2.setBounds(rect.left, i7 - this.t0, rect.right, i7);
            }
            if (this.d0) {
                float textSize = this.B.getTextSize();
                com.google.android.material.internal.c cVar = this.T0;
                float f = cVar.h;
                TextPaint textPaint = cVar.P;
                if (f != textSize) {
                    cVar.h = textSize;
                    cVar.j(false);
                }
                int gravity = this.B.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (cVar.g != i8) {
                    cVar.g = i8;
                    cVar.j(false);
                }
                if (cVar.f != gravity) {
                    cVar.f = gravity;
                    cVar.j(false);
                }
                Rect rectD = d(rect);
                int i9 = rectD.left;
                int i10 = rectD.top;
                int i11 = rectD.right;
                int i12 = rectD.bottom;
                Rect rect2 = cVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    cVar.N = true;
                }
                if (this.B == null) {
                    org.mozilla.javascript.c.a();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(cVar.h);
                    textPaint.setTypeface(cVar.v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(cVar.h);
                    textPaint.setTypeface(cVar.v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = cVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.B.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.x0;
                rect3.left = compoundPaddingLeft;
                if (this.p0 != 1 || this.B.getMinLines() > 1) {
                    if (this.p0 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(cVar.h);
                        textPaint.setTypeface(cVar.v);
                        textPaint.setLetterSpacing(cVar.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.B.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.B.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.p0 != 1 || this.B.getMinLines() > 1) ? rect.bottom - this.B.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = cVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != cVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    cVar.N = true;
                    cVar.k0 = true;
                }
                cVar.j(false);
                if (!g() || this.S0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.Z0;
        n nVar = this.z;
        if (!z) {
            nVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Z0 = true;
        }
        if (this.R != null && (editText = this.B) != null) {
            this.R.setGravity(editText.getGravity());
            this.R.setPadding(this.B.getCompoundPaddingLeft(), this.B.getCompoundPaddingTop(), this.B.getCompoundPaddingRight(), this.B.getCompoundPaddingBottom());
        }
        nVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.B.getMeasuredWidth() - this.B.getCompoundPaddingLeft()) - this.B.getCompoundPaddingRight();
        com.google.android.material.internal.c cVar = this.T0;
        TextPaint textPaint = cVar.P;
        textPaint.setTextSize(cVar.i);
        textPaint.setTypeface(cVar.s);
        textPaint.setLetterSpacing(cVar.W);
        float f2 = measuredWidth;
        cVar.i0 = cVar.e(cVar.f0, textPaint, cVar.B, (cVar.i / cVar.h) * f2, cVar.D).getHeight();
        textPaint.setTextSize(cVar.h);
        textPaint.setTypeface(cVar.v);
        textPaint.setLetterSpacing(cVar.X);
        cVar.j0 = cVar.e(cVar.e0, textPaint, cVar.B, f2, cVar.D).getHeight();
        EditText editText2 = this.B;
        Rect rect = this.w0;
        com.google.android.material.internal.d.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i3 = rectD.left;
        int i4 = rectD.top;
        int i5 = rectD.right;
        int i6 = rectD.bottom;
        Rect rect2 = cVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            cVar.N = true;
        }
        v();
        a();
        if (this.B == null) {
            return;
        }
        int i7 = cVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = cVar.P;
            textPaint2.setTextSize(cVar.h);
            textPaint2.setTypeface(cVar.v);
            textPaint2.setLetterSpacing(cVar.X);
            f = -textPaint2.ascent();
        }
        float f3 = 0.0f;
        if (this.P != null) {
            TextPaint textPaint3 = new TextPaint(Token.DEFAULT);
            textPaint3.set(this.R.getPaint());
            textPaint3.setTextSize(this.R.getTextSize());
            textPaint3.setTypeface(this.R.getTypeface());
            textPaint3.setLetterSpacing(this.R.getLetterSpacing());
            com.google.android.material.internal.g gVar = new com.google.android.material.internal.g(this.P, textPaint3, measuredWidth);
            gVar.k = getLayoutDirection() == 1;
            gVar.j = true;
            float lineSpacingExtra = this.R.getLineSpacingExtra();
            float lineSpacingMultiplier = this.R.getLineSpacingMultiplier();
            gVar.g = lineSpacingExtra;
            gVar.h = lineSpacingMultiplier;
            gVar.m = new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(this, 2);
            f3 = (this.p0 == 1 ? cVar.f() + this.q0 + this.A : 0.0f) + gVar.a().getHeight();
        }
        float fMax = Math.max(f, f3);
        if (this.B.getMeasuredHeight() < fMax) {
            this.B.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.e);
        setError(yVar.z);
        if (yVar.A) {
            post(new z0(this, 28));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.n0) {
            com.google.android.material.shape.d dVar = this.m0.e;
            RectF rectF = this.y0;
            float fA = dVar.a(rectF);
            float fA2 = this.m0.f.a(rectF);
            float fA3 = this.m0.h.a(rectF);
            float fA4 = this.m0.g.a(rectF);
            com.google.android.material.shape.o oVar = this.m0;
            com.google.android.material.shape.e eVar = oVar.a;
            com.google.android.material.shape.e eVar2 = oVar.b;
            com.google.android.material.shape.e eVar3 = oVar.d;
            com.google.android.material.shape.e eVar4 = oVar.c;
            com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
            com.google.android.material.shape.g gVar2 = new com.google.android.material.shape.g();
            com.google.android.material.shape.g gVar3 = new com.google.android.material.shape.g();
            com.google.android.material.shape.g gVar4 = new com.google.android.material.shape.g();
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(fA2);
            com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a(fA);
            com.google.android.material.shape.a aVar3 = new com.google.android.material.shape.a(fA4);
            com.google.android.material.shape.a aVar4 = new com.google.android.material.shape.a(fA3);
            com.google.android.material.shape.o oVar2 = new com.google.android.material.shape.o();
            oVar2.a = eVar2;
            oVar2.b = eVar;
            oVar2.c = eVar3;
            oVar2.d = eVar4;
            oVar2.e = aVar;
            oVar2.f = aVar2;
            oVar2.g = aVar4;
            oVar2.h = aVar3;
            oVar2.i = gVar;
            oVar2.j = gVar2;
            oVar2.k = gVar3;
            oVar2.l = gVar4;
            this.n0 = z;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        if (o()) {
            yVar.z = getError();
        }
        n nVar = this.z;
        yVar.A = nVar.F != 0 && nVar.D.A;
        return yVar;
    }

    public final void p(Editable editable) {
        ((androidx.transition.k) this.L).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.K;
        int i = this.J;
        if (i == -1) {
            this.M.setText(String.valueOf(length));
            this.M.setContentDescription(null);
            this.K = false;
        } else {
            this.K = length > i;
            Context context = getContext();
            this.M.setContentDescription(context.getString(this.K ? com.app.mlounge.R.string.character_counter_overflowed_content_description : com.app.mlounge.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.J)));
            if (z != this.K) {
                q();
            }
            String str = androidx.core.text.b.b;
            androidx.core.text.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? androidx.core.text.b.e : androidx.core.text.b.d;
            l0 l0Var = this.M;
            String string = getContext().getString(com.app.mlounge.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.J));
            bVar.getClass();
            z1 z1Var = androidx.core.text.f.a;
            l0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.B == null || z == this.K) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        l0 l0Var = this.M;
        if (l0Var != null) {
            n(l0Var, this.K ? this.N : this.O);
            if (!this.K && (colorStateList2 = this.W) != null) {
                this.M.setTextColor(colorStateList2);
            }
            if (!this.K || (colorStateList = this.a0) == null) {
                return;
            }
            this.M.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.b0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueU = com.google.android.material.resources.b.u(context, com.app.mlounge.R.attr.colorControlActivated);
            if (typedValueU != null) {
                int i = typedValueU.resourceId;
                if (i != 0) {
                    colorStateListValueOf = org.jsoup.helper.n.t(context, i);
                } else {
                    int i2 = typedValueU.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.B;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.B.getTextCursorDrawable().mutate();
        if ((o() || (this.M != null && this.K)) && (colorStateList = this.c0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean s() {
        boolean z;
        if (this.B == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            u uVar = this.y;
            if (uVar.getMeasuredWidth() > 0) {
                int measuredWidth = uVar.getMeasuredWidth() - this.B.getPaddingLeft();
                if (this.A0 == null || this.B0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.A0 = colorDrawable;
                    this.B0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.B.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.A0;
                if (drawable != colorDrawable2) {
                    this.B.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.A0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.B.getCompoundDrawablesRelative();
                this.B.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.A0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.A0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.B.getCompoundDrawablesRelative();
            this.B.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.A0 = null;
            z = true;
        } else {
            z = false;
        }
        n nVar = this.z;
        if ((nVar.e() || ((nVar.F != 0 && nVar.d()) || nVar.M != null)) && nVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = nVar.N.getMeasuredWidth() - this.B.getPaddingRight();
            if (nVar.e()) {
                checkableImageButton = nVar.z;
            } else if (nVar.F != 0 && nVar.d()) {
                checkableImageButton = nVar.D;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.B.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.D0;
            if (colorDrawable3 != null && this.E0 != measuredWidth2) {
                this.E0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.B.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.D0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.D0 = colorDrawable4;
                this.E0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.D0;
            if (drawable2 != colorDrawable5) {
                this.F0 = drawable2;
                this.B.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.D0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.B.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.D0) {
                this.B.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.F0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.D0 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            this.M0 = i;
            this.O0 = i;
            this.P0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.M0 = defaultColor;
        this.v0 = defaultColor;
        this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.p0) {
            return;
        }
        this.p0 = i;
        if (this.B != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.q0 = i;
    }

    public void setBoxCornerFamily(int i) {
        com.google.android.material.shape.n nVarF = this.m0.f();
        com.google.android.material.shape.d dVar = this.m0.e;
        nVarF.a = com.google.android.material.shape.k.F(i);
        nVarF.e = dVar;
        com.google.android.material.shape.d dVar2 = this.m0.f;
        nVarF.b = com.google.android.material.shape.k.F(i);
        nVarF.f = dVar2;
        com.google.android.material.shape.d dVar3 = this.m0.h;
        nVarF.d = com.google.android.material.shape.k.F(i);
        nVarF.h = dVar3;
        com.google.android.material.shape.d dVar4 = this.m0.g;
        nVarF.c = com.google.android.material.shape.k.F(i);
        nVarF.g = dVar4;
        this.m0 = nVarF.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.I0 = colorStateList.getDefaultColor();
            this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.K0 != colorStateList.getDefaultColor()) {
            this.K0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.s0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.t0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.I != z) {
            s sVar = this.H;
            if (z) {
                l0 l0Var = new l0(getContext(), null);
                this.M = l0Var;
                l0Var.setId(com.app.mlounge.R.id.textinput_counter);
                Typeface typeface = this.z0;
                if (typeface != null) {
                    this.M.setTypeface(typeface);
                }
                this.M.setMaxLines(1);
                sVar.a(this.M, 2);
                ((ViewGroup.MarginLayoutParams) this.M.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.app.mlounge.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.M != null) {
                    EditText editText = this.B;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.M, 2);
                this.M = null;
            }
            this.I = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.J != i) {
            if (i > 0) {
                this.J = i;
            } else {
                this.J = -1;
            }
            if (!this.I || this.M == null) {
                return;
            }
            EditText editText = this.B;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.N != i) {
            this.N = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.O != i) {
            this.O = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            if (o() || (this.M != null && this.K)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList;
        if (this.B != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.z.D.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.z.D.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        n nVar = this.z;
        CharSequence text = i != 0 ? nVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = nVar.D;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        n nVar = this.z;
        Drawable drawableP = i != 0 ? coil3.network.g.p(nVar.getContext(), i) : null;
        TextInputLayout textInputLayout = nVar.e;
        CheckableImageButton checkableImageButton = nVar.D;
        checkableImageButton.setImageDrawable(drawableP);
        if (drawableP != null) {
            p.a(textInputLayout, checkableImageButton, nVar.H, nVar.I);
            p.u(textInputLayout, checkableImageButton, nVar.H);
        }
    }

    public void setEndIconMinSize(int i) {
        n nVar = this.z;
        if (i < 0) {
            nVar.getClass();
            net.luminis.tls.engine.impl.c.o("endIconSize cannot be less than 0");
        } else if (i != nVar.J) {
            nVar.J = i;
            CheckableImageButton checkableImageButton = nVar.D;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = nVar.z;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.z.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.z;
        CheckableImageButton checkableImageButton = nVar.D;
        View.OnLongClickListener onLongClickListener = nVar.L;
        checkableImageButton.setOnClickListener(onClickListener);
        p.v(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.z;
        nVar.L = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.D;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.v(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n nVar = this.z;
        nVar.K = scaleType;
        nVar.D.setScaleType(scaleType);
        nVar.z.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.z;
        if (nVar.H != colorStateList) {
            nVar.H = colorStateList;
            p.a(nVar.e, nVar.D, colorStateList, nVar.I);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.z;
        if (nVar.I != mode) {
            nVar.I = mode;
            p.a(nVar.e, nVar.D, nVar.H, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.z.h(z);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.H;
        if (!sVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.p = charSequence;
        sVar.r.setText(charSequence);
        int i = sVar.n;
        if (i != 1) {
            sVar.o = 1;
        }
        sVar.i(i, sVar.o, sVar.h(sVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        s sVar = this.H;
        sVar.t = i;
        l0 l0Var = sVar.r;
        if (l0Var != null) {
            l0Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.H;
        sVar.s = charSequence;
        l0 l0Var = sVar.r;
        if (l0Var != null) {
            l0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        s sVar = this.H;
        TextInputLayout textInputLayout = sVar.h;
        if (sVar.q == z) {
            return;
        }
        sVar.c();
        if (z) {
            l0 l0Var = new l0(sVar.g, null);
            sVar.r = l0Var;
            l0Var.setId(com.app.mlounge.R.id.textinput_error);
            sVar.r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.r.setTypeface(typeface);
            }
            int i = sVar.u;
            sVar.u = i;
            l0 l0Var2 = sVar.r;
            if (l0Var2 != null) {
                sVar.h.n(l0Var2, i);
            }
            ColorStateList colorStateList = sVar.v;
            sVar.v = colorStateList;
            l0 l0Var3 = sVar.r;
            if (l0Var3 != null && colorStateList != null) {
                l0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.s;
            sVar.s = charSequence;
            l0 l0Var4 = sVar.r;
            if (l0Var4 != null) {
                l0Var4.setContentDescription(charSequence);
            }
            int i2 = sVar.t;
            sVar.t = i2;
            l0 l0Var5 = sVar.r;
            if (l0Var5 != null) {
                l0Var5.setAccessibilityLiveRegion(i2);
            }
            sVar.r.setVisibility(4);
            sVar.a(sVar.r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.r, 0);
            sVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        n nVar = this.z;
        nVar.i(i != 0 ? coil3.network.g.p(nVar.getContext(), i) : null);
        p.u(nVar.e, nVar.z, nVar.A);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.z;
        CheckableImageButton checkableImageButton = nVar.z;
        View.OnLongClickListener onLongClickListener = nVar.C;
        checkableImageButton.setOnClickListener(onClickListener);
        p.v(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.z;
        nVar.C = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.v(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.z;
        if (nVar.A != colorStateList) {
            nVar.A = colorStateList;
            p.a(nVar.e, nVar.z, colorStateList, nVar.B);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.z;
        if (nVar.B != mode) {
            nVar.B = mode;
            p.a(nVar.e, nVar.z, nVar.A, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        s sVar = this.H;
        sVar.u = i;
        l0 l0Var = sVar.r;
        if (l0Var != null) {
            sVar.h.n(l0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.H;
        sVar.v = colorStateList;
        l0 l0Var = sVar.r;
        if (l0Var == null || colorStateList == null) {
            return;
        }
        l0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.H;
        if (zIsEmpty) {
            if (sVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.w = charSequence;
        sVar.y.setText(charSequence);
        int i = sVar.n;
        if (i != 2) {
            sVar.o = 2;
        }
        sVar.i(i, sVar.o, sVar.h(sVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.H;
        sVar.A = colorStateList;
        l0 l0Var = sVar.y;
        if (l0Var == null || colorStateList == null) {
            return;
        }
        l0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        s sVar = this.H;
        TextInputLayout textInputLayout = sVar.h;
        if (sVar.x == z) {
            return;
        }
        sVar.c();
        if (z) {
            l0 l0Var = new l0(sVar.g, null);
            sVar.y = l0Var;
            l0Var.setId(com.app.mlounge.R.id.textinput_helper_text);
            sVar.y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.y.setTypeface(typeface);
            }
            sVar.y.setVisibility(4);
            sVar.y.setAccessibilityLiveRegion(1);
            int i = sVar.z;
            sVar.z = i;
            l0 l0Var2 = sVar.y;
            if (l0Var2 != null) {
                l0Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            l0 l0Var3 = sVar.y;
            if (l0Var3 != null && colorStateList != null) {
                l0Var3.setTextColor(colorStateList);
            }
            sVar.a(sVar.y, 1);
            sVar.y.setAccessibilityDelegate(new r(sVar));
        } else {
            sVar.c();
            int i2 = sVar.n;
            if (i2 == 2) {
                sVar.o = 0;
            }
            sVar.i(i2, sVar.o, sVar.h(sVar.y, ""));
            sVar.g(sVar.y, 1);
            sVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        s sVar = this.H;
        sVar.z = i;
        l0 l0Var = sVar.y;
        if (l0Var != null) {
            l0Var.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.V0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.d0) {
            this.d0 = z;
            if (z) {
                CharSequence hint = this.B.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.e0)) {
                        setHint(hint);
                    }
                    this.B.setHint((CharSequence) null);
                }
                this.f0 = true;
            } else {
                this.f0 = false;
                if (!TextUtils.isEmpty(this.e0) && TextUtils.isEmpty(this.B.getHint())) {
                    this.B.setHint(this.e0);
                }
                setHintInternal(null);
            }
            if (this.B != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        com.google.android.material.internal.c cVar = this.T0;
        if (i != cVar.f0) {
            cVar.f0 = i;
            cVar.j(false);
        }
        if (i != cVar.e0) {
            cVar.e0 = i;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        com.google.android.material.internal.c cVar = this.T0;
        TextInputLayout textInputLayout = cVar.a;
        com.google.android.material.resources.f fVar = new com.google.android.material.resources.f(textInputLayout.getContext(), i);
        ColorStateList colorStateList = fVar.k;
        if (colorStateList != null) {
            cVar.k = colorStateList;
        }
        float f = fVar.l;
        if (f != 0.0f) {
            cVar.i = f;
        }
        ColorStateList colorStateList2 = fVar.a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = fVar.f;
        cVar.U = fVar.g;
        cVar.S = fVar.h;
        cVar.W = fVar.j;
        com.google.android.material.resources.a aVar = cVar.z;
        if (aVar != null) {
            aVar.c = true;
        }
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(cVar);
        fVar.a();
        cVar.z = new com.google.android.material.resources.a(bVar, fVar.p);
        fVar.b(textInputLayout.getContext(), cVar.z);
        cVar.j(false);
        this.H0 = cVar.k;
        if (this.B != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            if (this.G0 == null) {
                com.google.android.material.internal.c cVar = this.T0;
                if (cVar.k != colorStateList) {
                    cVar.k = colorStateList;
                    cVar.j(false);
                }
            }
            this.H0 = colorStateList;
            if (this.B != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.L = xVar;
    }

    public void setMaxEms(int i) {
        this.E = i;
        EditText editText = this.B;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.G = i;
        EditText editText = this.B;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.D = i;
        EditText editText = this.B;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.F = i;
        EditText editText = this.B;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        n nVar = this.z;
        nVar.D.setContentDescription(i != 0 ? nVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        n nVar = this.z;
        nVar.D.setImageDrawable(i != 0 ? coil3.network.g.p(nVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        n nVar = this.z;
        if (z && nVar.F != 1) {
            nVar.g(1);
        } else if (z) {
            nVar.getClass();
        } else {
            nVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.z;
        nVar.H = colorStateList;
        p.a(nVar.e, nVar.D, colorStateList, nVar.I);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.z;
        nVar.I = mode;
        p.a(nVar.e, nVar.D, nVar.H, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.R == null) {
            l0 l0Var = new l0(getContext(), null);
            this.R = l0Var;
            l0Var.setId(com.app.mlounge.R.id.textinput_placeholder);
            this.R.setImportantForAccessibility(1);
            this.R.setAccessibilityLiveRegion(1);
            androidx.transition.h hVarF = f();
            this.U = hVarF;
            hVarF.y = 67L;
            this.V = f();
            setPlaceholderTextAppearance(this.T);
            setPlaceholderTextColor(this.S);
            s0.m(this.R, new androidx.core.widget.d(2));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.Q) {
                setPlaceholderTextEnabled(true);
            }
            this.P = charSequence;
        }
        EditText editText = this.B;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.T = i;
        l0 l0Var = this.R;
        if (l0Var != null) {
            l0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            l0 l0Var = this.R;
            if (l0Var == null || colorStateList == null) {
                return;
            }
            l0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.y;
        uVar.getClass();
        uVar.z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.y.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.y.y.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.y.y.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(com.google.android.material.shape.o oVar) {
        com.google.android.material.shape.j jVar = this.g0;
        if (jVar == null || jVar.y.a == oVar) {
            return;
        }
        this.m0 = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.y.A.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? coil3.network.g.p(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        u uVar = this.y;
        if (i < 0) {
            uVar.getClass();
            net.luminis.tls.engine.impl.c.o("startIconSize cannot be less than 0");
        } else if (i != uVar.D) {
            uVar.D = i;
            CheckableImageButton checkableImageButton = uVar.A;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.y;
        CheckableImageButton checkableImageButton = uVar.A;
        View.OnLongClickListener onLongClickListener = uVar.F;
        checkableImageButton.setOnClickListener(onClickListener);
        p.v(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.y;
        uVar.F = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.A;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.v(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.y;
        uVar.E = scaleType;
        uVar.A.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.y;
        if (uVar.B != colorStateList) {
            uVar.B = colorStateList;
            p.a(uVar.e, uVar.A, colorStateList, uVar.C);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.y;
        if (uVar.C != mode) {
            uVar.C = mode;
            p.a(uVar.e, uVar.A, uVar.B, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.y.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        n nVar = this.z;
        nVar.getClass();
        nVar.M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        nVar.N.setText(charSequence);
        nVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.z.N.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.z.N.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.B;
        if (editText != null) {
            s0.m(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.z0) {
            this.z0 = typeface;
            this.T0.n(typeface);
            s sVar = this.H;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                l0 l0Var = sVar.r;
                if (l0Var != null) {
                    l0Var.setTypeface(typeface);
                }
                l0 l0Var2 = sVar.y;
                if (l0Var2 != null) {
                    l0Var2.setTypeface(typeface);
                }
            }
            l0 l0Var3 = this.M;
            if (l0Var3 != null) {
                l0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        l0 l0Var;
        EditText editText = this.B;
        if (editText == null || this.p0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = t0.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.s.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.K && (l0Var = this.M) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.s.b(l0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.B.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.B;
        if (editText == null || this.g0 == null) {
            return;
        }
        if ((this.j0 || editText.getBackground() == null) && this.p0 != 0) {
            this.B.setBackground(getEditTextBoxBackground());
            this.j0 = true;
        }
    }

    public final void v() {
        if (this.p0 != 1) {
            FrameLayout frameLayout = this.e;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        l0 l0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.B;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.B;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.G0;
        com.google.android.material.internal.c cVar = this.T0;
        if (colorStateList2 != null) {
            cVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.G0;
            int colorForState = this.Q0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            cVar.k(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            l0 l0Var2 = this.H.r;
            cVar.k(l0Var2 != null ? l0Var2.getTextColors() : null);
        } else if (this.K && (l0Var = this.M) != null) {
            cVar.k(l0Var.getTextColors());
        } else if (z4 && (colorStateList = this.H0) != null && cVar.k != colorStateList) {
            cVar.k = colorStateList;
            cVar.j(false);
        }
        n nVar = this.z;
        u uVar = this.y;
        if (z3 || !this.U0 || (isEnabled() && z4)) {
            if (z2 || this.S0) {
                ValueAnimator valueAnimator = this.W0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.W0.cancel();
                }
                if (z && this.V0) {
                    b(1.0f);
                } else {
                    cVar.m(1.0f);
                }
                this.S0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.B;
                x(editText3 != null ? editText3.getText() : null);
                uVar.G = false;
                uVar.e();
                nVar.O = false;
                nVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.S0) {
            ValueAnimator valueAnimator2 = this.W0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.W0.cancel();
            }
            if (z && this.V0) {
                b(0.0f);
            } else {
                cVar.m(0.0f);
            }
            if (g() && !((g) this.g0).d0.r.isEmpty() && g()) {
                ((g) this.g0).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.S0 = true;
            l0 l0Var3 = this.R;
            if (l0Var3 != null && this.Q) {
                l0Var3.setText((CharSequence) null);
                androidx.transition.q.a(this.e, this.V);
                this.R.setVisibility(4);
            }
            uVar.G = true;
            uVar.e();
            nVar.O = true;
            nVar.n();
        }
    }

    public final void x(Editable editable) {
        ((androidx.transition.k) this.L).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.e;
        if (length != 0 || this.S0) {
            l0 l0Var = this.R;
            if (l0Var == null || !this.Q) {
                return;
            }
            l0Var.setText((CharSequence) null);
            androidx.transition.q.a(frameLayout, this.V);
            this.R.setVisibility(4);
            return;
        }
        if (this.R == null || !this.Q || TextUtils.isEmpty(this.P)) {
            return;
        }
        this.R.setText(this.P);
        androidx.transition.q.a(frameLayout, this.U);
        this.R.setVisibility(0);
        this.R.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.L0.getDefaultColor();
        int colorForState = this.L0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.L0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.u0 = colorForState2;
        } else if (z2) {
            this.u0 = colorForState;
        } else {
            this.u0 = defaultColor;
        }
    }

    public final void z() {
        l0 l0Var;
        EditText editText;
        EditText editText2;
        if (this.g0 == null || this.p0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.B) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.B) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.u0 = this.Q0;
        } else if (o()) {
            if (this.L0 != null) {
                y(z2, z);
            } else {
                this.u0 = getErrorCurrentTextColors();
            }
        } else if (!this.K || (l0Var = this.M) == null) {
            if (z2) {
                this.u0 = this.K0;
            } else if (z) {
                this.u0 = this.J0;
            } else {
                this.u0 = this.I0;
            }
        } else if (this.L0 != null) {
            y(z2, z);
        } else {
            this.u0 = l0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        n nVar = this.z;
        TextInputLayout textInputLayout = nVar.e;
        CheckableImageButton checkableImageButton = nVar.D;
        TextInputLayout textInputLayout2 = nVar.e;
        nVar.l();
        p.u(textInputLayout2, nVar.z, nVar.A);
        p.u(textInputLayout2, checkableImageButton, nVar.H);
        if (nVar.b() instanceof k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                p.a(textInputLayout, checkableImageButton, nVar.H, nVar.I);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        u uVar = this.y;
        p.u(uVar.e, uVar.A, uVar.B);
        if (this.p0 == 2) {
            int i = this.r0;
            if (z2 && isEnabled()) {
                this.r0 = this.t0;
            } else {
                this.r0 = this.s0;
            }
            if (this.r0 != i && g() && !this.S0) {
                if (g()) {
                    ((g) this.g0).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.p0 == 1) {
            if (!isEnabled()) {
                this.v0 = this.N0;
            } else if (z && !z2) {
                this.v0 = this.P0;
            } else if (z2) {
                this.v0 = this.O0;
            } else {
                this.v0 = this.M0;
            }
        }
        c();
    }

    public void setHint(CharSequence charSequence) {
        if (this.d0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.y.A;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.y.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.z.D.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.z.D.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.z.D;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.z.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.z;
        TextInputLayout textInputLayout = nVar.e;
        CheckableImageButton checkableImageButton = nVar.D;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            p.a(textInputLayout, checkableImageButton, nVar.H, nVar.I);
            p.u(textInputLayout, checkableImageButton, nVar.H);
        }
    }
}
