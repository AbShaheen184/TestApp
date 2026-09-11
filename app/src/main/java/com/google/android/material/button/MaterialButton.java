package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.p;
import coil3.network.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.material.internal.j;
import com.google.android.material.shape.b0;
import com.google.android.material.shape.d0;
import com.google.android.material.shape.e0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import com.google.android.material.shape.y;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends p implements Checkable, y {
    public static final int[] f0 = {R.attr.state_checkable};
    public static final int[] g0 = {R.attr.state_checked};
    public static final a h0 = new a();
    public final e A;
    public final LinkedHashSet B;
    public b C;
    public PorterDuff.Mode D;
    public ColorStateList E;
    public Drawable F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public LinearLayout.LayoutParams S;
    public boolean T;
    public int U;
    public boolean V;
    public int W;
    public e0 a0;
    public int b0;
    public float c0;
    public float d0;
    public androidx.dynamicanimation.animation.e e0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.b(context, attributeSet, com.app.mlounge.R.attr.materialButtonStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Button, new int[]{com.app.mlounge.R.attr.materialSizeOverlay}), attributeSet);
        this.B = new LinkedHashSet();
        this.L = false;
        this.M = false;
        this.O = -1;
        this.P = -1.0f;
        this.Q = -1;
        this.R = -1;
        this.W = -1;
        Context context2 = getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, com.google.android.material.a.i, com.app.mlounge.R.attr.materialButtonStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.K = typedArrayE.getDimensionPixelSize(13, 0);
        int i = typedArrayE.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.D = j.f(i, mode);
        this.E = com.google.android.material.resources.c.j(getContext(), typedArrayE, 15);
        this.F = com.google.android.material.resources.c.l(getContext(), typedArrayE, 11);
        this.N = typedArrayE.getInteger(12, 1);
        this.H = typedArrayE.getDimensionPixelSize(14, 0);
        b0 b0VarB = b0.b(context2, typedArrayE, 19);
        o oVarC = b0VarB != null ? b0VarB.c() : o.b(context2, attributeSet, com.app.mlounge.R.attr.materialButtonStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Button).a();
        boolean z = typedArrayE.getBoolean(17, false);
        e eVar = new e(this, oVarC);
        this.A = eVar;
        eVar.f = typedArrayE.getDimensionPixelOffset(2, 0);
        eVar.g = typedArrayE.getDimensionPixelOffset(3, 0);
        eVar.h = typedArrayE.getDimensionPixelOffset(4, 0);
        eVar.i = typedArrayE.getDimensionPixelOffset(5, 0);
        if (typedArrayE.hasValue(9)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(9, -1);
            eVar.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            n nVarF = eVar.b.f();
            nVarF.e = new com.google.android.material.shape.a(f);
            nVarF.f = new com.google.android.material.shape.a(f);
            nVarF.g = new com.google.android.material.shape.a(f);
            nVarF.h = new com.google.android.material.shape.a(f);
            eVar.b = nVarF.a();
            eVar.c = null;
            eVar.d();
            eVar.s = true;
        }
        eVar.k = typedArrayE.getDimensionPixelSize(22, 0);
        eVar.l = j.f(typedArrayE.getInt(8, -1), mode);
        eVar.m = com.google.android.material.resources.c.j(getContext(), typedArrayE, 7);
        eVar.n = com.google.android.material.resources.c.j(getContext(), typedArrayE, 21);
        eVar.o = com.google.android.material.resources.c.j(getContext(), typedArrayE, 18);
        eVar.t = typedArrayE.getBoolean(6, false);
        eVar.w = typedArrayE.getDimensionPixelSize(10, 0);
        eVar.u = typedArrayE.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            eVar.r = true;
            setSupportBackgroundTintList(eVar.m);
            setSupportBackgroundTintMode(eVar.l);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f, paddingTop + eVar.h, paddingEnd + eVar.g, paddingBottom + eVar.i);
        setCheckedInternal(typedArrayE.getBoolean(1, false));
        if (b0VarB != null) {
            eVar.d = d();
            if (eVar.c != null) {
                eVar.d();
            }
            eVar.c = b0VarB;
            eVar.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.K);
        h(this.F != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.U = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.c0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        com.google.android.material.shape.j jVarA;
        if (this.T && this.V && (jVarA = this.A.a(false)) != null) {
            return (int) (jVarA.h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        e eVar = this.A;
        if (eVar == null || !eVar.t || this.L == z) {
            return;
        }
        this.L = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.L;
            if (!materialButtonToggleGroup.I) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.M) {
            return;
        }
        this.M = true;
        Iterator it = this.B.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
        this.M = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.c0 != f) {
            this.c0 = f;
            j();
            invalidate();
            if (getParent() instanceof d) {
                d dVar = (d) getParent();
                int i = (int) this.c0;
                int iIndexOfChild = dVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (dVar.c(i2)) {
                            materialButton2 = (MaterialButton) dVar.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = dVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (dVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) dVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final androidx.dynamicanimation.animation.f d() {
        Context context = getContext();
        TypedValue typedValueU = com.google.android.material.resources.b.u(context, com.app.mlounge.R.attr.motionSpringFastSpatial);
        int[] iArr = com.google.android.material.a.n;
        TypedArray typedArrayObtainStyledAttributes = typedValueU == null ? context.obtainStyledAttributes(null, iArr, 0, com.app.mlounge.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueU.resourceId, iArr);
        androidx.dynamicanimation.animation.f fVar = new androidx.dynamicanimation.animation.f();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar.a = Math.sqrt(f);
            fVar.c = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar.b = f2;
            fVar.c = false;
            typedArrayObtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        e eVar = this.A;
        return (eVar == null || eVar.r) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void f(boolean z) {
        int i;
        if (this.a0 == null) {
            return;
        }
        if (this.e0 == null) {
            androidx.dynamicanimation.animation.e eVar = new androidx.dynamicanimation.animation.e(this, h0);
            this.e0 = eVar;
            eVar.j = d();
        }
        if (this.V) {
            int i2 = this.b0;
            e0 e0Var = this.a0;
            int[] drawableState = getDrawableState();
            int[][] iArr = e0Var.c;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= e0Var.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = e0Var.c;
                for (int i5 = 0; i5 < e0Var.a; i5++) {
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                }
                i4 = i;
            }
            d0 d0Var = (d0) (i4 < 0 ? e0Var.b : e0Var.d[i4]).e;
            int width = getWidth();
            float f = d0Var.b;
            int i6 = d0Var.a;
            if (i6 != 1) {
                if (i6 == 2) {
                }
                this.e0.a(Math.min(i2, i3));
                if (z) {
                    this.e0.d();
                }
            }
            f *= width;
            i3 = (int) f;
            this.e0.a(Math.min(i2, i3));
            if (z) {
                this.e0.d();
            }
        }
    }

    public final void g() {
        int i = this.N;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.F, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.F, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.F, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.G)) {
            return this.G;
        }
        e eVar = this.A;
        return ((eVar == null || !eVar.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.W;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.A.j;
        }
        return 0;
    }

    public androidx.dynamicanimation.animation.f getCornerSpringForce() {
        return this.A.d;
    }

    public Drawable getIcon() {
        return this.F;
    }

    public int getIconGravity() {
        return this.N;
    }

    public int getIconPadding() {
        return this.K;
    }

    public int getIconSize() {
        return this.H;
    }

    public ColorStateList getIconTint() {
        return this.E;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.D;
    }

    public int getInsetBottom() {
        return this.A.i;
    }

    public int getInsetTop() {
        return this.A.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.A.o;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        if (e()) {
            return this.A.b;
        }
        net.luminis.tls.engine.impl.c.r("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.A.c;
        }
        net.luminis.tls.engine.impl.c.r("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.A.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.A.k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.p
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.A.m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.A.l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.F;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.F = drawableMutate;
            drawableMutate.setTintList(this.E);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                this.F.setTintMode(mode);
            }
            int intrinsicWidth = this.H;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.F.getIntrinsicWidth();
            }
            int intrinsicHeight = this.H;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.F.getIntrinsicHeight();
            }
            Drawable drawable2 = this.F;
            int i = this.I;
            int i2 = this.J;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.F.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.N;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.F) || (((i3 == 3 || i3 == 4) && drawable5 != this.F) || ((i3 == 16 || i3 == 32) && drawable4 != this.F))) {
            g();
        }
    }

    public final void i(int i, int i2) {
        if (this.F == null || getLayout() == null) {
            return;
        }
        int i3 = this.N;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.I = 0;
                if (i3 == 16) {
                    this.J = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.H;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.F.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.K) - getPaddingBottom()) / 2);
                if (this.J != iMax) {
                    this.J = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.J = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.N;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.I = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.H;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.F.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.K) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.N == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.I != textLayoutWidth) {
            this.I = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.L;
    }

    public final void j() {
        int i = (int) (this.c0 - this.d0);
        int i2 = (i / 2) + this.U;
        getLayoutParams().width = (int) (this.P + i);
        setPaddingRelative(this.Q + i2, getPaddingTop(), (this.R + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            k.L(this, this.A.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        e eVar = this.A;
        if (eVar != null && eVar.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f0);
        }
        if (this.L) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, g0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.L);
    }

    @Override // androidx.appcompat.widget.p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        e eVar = this.A;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.t);
        accessibilityNodeInfo.setChecked(this.L);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.O != i6) {
            this.O = i6;
            this.P = -1.0f;
        }
        if (this.P == -1.0f) {
            this.P = getMeasuredWidth();
            if (this.S == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.S = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.S);
                layoutParams.width = (int) this.P;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.W == -1) {
            if (this.F == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.H;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.F.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.W = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.Q == -1) {
            this.Q = getPaddingStart();
        }
        if (this.R == -1) {
            this.R = getPaddingEnd();
        }
        if ((getParent() instanceof d) && ((d) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.V = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.e);
        setChecked(cVar.z);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.z = this.L;
        return cVar;
    }

    @Override // androidx.appcompat.widget.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.A.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.F != null) {
            if (this.F.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.G = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!e()) {
            super.setBackgroundColor(i);
            return;
        }
        e eVar = this.A;
        if (eVar.a(false) != null) {
            eVar.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        e eVar = this.A;
        eVar.r = true;
        MaterialButton materialButton = eVar.a;
        materialButton.setSupportBackgroundTintList(eVar.m);
        materialButton.setSupportBackgroundTintMode(eVar.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.p, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? g.p(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.A.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            e eVar = this.A;
            if (eVar.s && eVar.j == i) {
                return;
            }
            eVar.j = i;
            eVar.s = true;
            float f = i;
            n nVarF = eVar.b.f();
            nVarF.e = new com.google.android.material.shape.a(f);
            nVarF.f = new com.google.android.material.shape.a(f);
            nVarF.g = new com.google.android.material.shape.a(f);
            nVarF.h = new com.google.android.material.shape.a(f);
            eVar.b = nVarF.a();
            eVar.c = null;
            eVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(androidx.dynamicanimation.animation.f fVar) {
        e eVar = this.A;
        eVar.d = fVar;
        if (eVar.c != null) {
            eVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.d0 = Math.min(i, this.W);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.A.a(false).m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.F != drawable) {
            this.F = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.N != i) {
            this.N = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.K != i) {
            this.K = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? g.p(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("iconSize cannot be less than 0");
        } else if (this.H != i) {
            this.H = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.D != mode) {
            this.D = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(org.jsoup.helper.n.t(getContext(), i));
    }

    public void setInsetBottom(int i) {
        e eVar = this.A;
        eVar.b(eVar.h, i);
    }

    public void setInsetTop(int i) {
        e eVar = this.A;
        eVar.b(i, eVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.C = bVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.T != z) {
            this.T = z;
            e eVar = this.A;
            if (z) {
                l lVar = new l(this, 1);
                eVar.e = lVar;
                com.google.android.material.shape.j jVarA = eVar.a(false);
                if (jVarA != null) {
                    jVarA.a0 = lVar;
                }
            } else {
                eVar.e = null;
                com.google.android.material.shape.j jVarA2 = eVar.a(false);
                if (jVarA2 != null) {
                    jVarA2.a0 = null;
                }
            }
            post(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 1));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.C;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((androidx.media3.exoplayer.hls.c) bVar).e).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.A;
            MaterialButton materialButton = eVar.a;
            if (eVar.o != colorStateList) {
                eVar.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(com.google.android.material.ripple.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(org.jsoup.helper.n.t(getContext(), i));
        }
    }

    @Override // com.google.android.material.shape.y
    public void setShapeAppearanceModel(o oVar) {
        if (!e()) {
            net.luminis.tls.engine.impl.c.r("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        e eVar = this.A;
        eVar.b = oVar;
        eVar.c = null;
        eVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            e eVar = this.A;
            eVar.q = z;
            eVar.e();
        }
    }

    public void setSizeChange(e0 e0Var) {
        if (this.a0 != e0Var) {
            this.a0 = e0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (!e()) {
            net.luminis.tls.engine.impl.c.r("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        e eVar = this.A;
        if (eVar.d == null && b0Var.d()) {
            eVar.d = d();
            if (eVar.c != null) {
                eVar.d();
            }
        }
        eVar.c = b0Var;
        eVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.A;
            if (eVar.n != colorStateList) {
                eVar.n = colorStateList;
                eVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(org.jsoup.helper.n.t(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            e eVar = this.A;
            if (eVar.k != i) {
                eVar.k = i;
                eVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        e eVar = this.A;
        if (eVar.m != colorStateList) {
            eVar.m = colorStateList;
            if (eVar.a(false) != null) {
                eVar.a(false).setTintList(eVar.m);
            }
        }
    }

    @Override // androidx.appcompat.widget.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        e eVar = this.A;
        if (eVar.l != mode) {
            eVar.l = mode;
            if (eVar.a(false) == null || eVar.l == null) {
                return;
            }
            eVar.a(false).setTintMode(eVar.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.A.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.P = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.b0 != i) {
            this.b0 = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.L);
    }
}
