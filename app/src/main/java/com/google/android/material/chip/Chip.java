package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.q;
import androidx.compose.foundation.gestures.z1;
import androidx.core.view.s0;
import coil3.network.g;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.google.android.material.resources.f;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.y;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends q implements y, Checkable {
    public static final Rect T = new Rect();
    public static final int[] U = {R.attr.state_selected};
    public static final int[] V = {R.attr.state_checkable};
    public e B;
    public InsetDrawable C;
    public RippleDrawable D;
    public View.OnClickListener E;
    public CompoundButton.OnCheckedChangeListener F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public CharSequence N;
    public final d O;
    public boolean P;
    public final Rect Q;
    public final RectF R;
    public final b S;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        this.Q = new Rect();
        this.R = new RectF();
        this.S = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                com.google.gson.b.r("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                com.google.gson.b.r("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                com.google.gson.b.r("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.K0;
        int[] iArr = com.google.android.material.a.c;
        TypedArray typedArrayE = j.e(context3, attributeSet, iArr, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.k1 = typedArrayE.hasValue(37);
        Context context4 = eVar.K0;
        ColorStateList colorStateListJ = com.google.android.material.resources.c.j(context4, typedArrayE, 24);
        if (eVar.d0 != colorStateListJ) {
            eVar.d0 = colorStateListJ;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList colorStateListJ2 = com.google.android.material.resources.c.j(context4, typedArrayE, 11);
        if (eVar.e0 != colorStateListJ2) {
            eVar.e0 = colorStateListJ2;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (eVar.f0 != dimension) {
            eVar.f0 = dimension;
            eVar.invalidateSelf();
            eVar.A();
        }
        if (typedArrayE.hasValue(12)) {
            eVar.G(typedArrayE.getDimension(12, 0.0f));
        }
        eVar.L(com.google.android.material.resources.c.j(context4, typedArrayE, 22));
        eVar.M(typedArrayE.getDimension(23, 0.0f));
        eVar.W(com.google.android.material.resources.c.j(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.k0, text)) {
            eVar.k0 = text;
            eVar.Q0.d = true;
            eVar.invalidateSelf();
            eVar.A();
        }
        f fVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new f(context4, resourceId3);
        fVar.l = typedArrayE.getDimension(1, fVar.l);
        eVar.X(fVar);
        int i = typedArrayE.getInt(3, 0);
        if (i == 1) {
            eVar.h1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            eVar.h1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            eVar.h1 = TextUtils.TruncateAt.END;
        }
        eVar.K(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.K(typedArrayE.getBoolean(15, false));
        }
        eVar.H(com.google.android.material.resources.c.l(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            eVar.J(com.google.android.material.resources.c.j(context4, typedArrayE, 17));
        }
        eVar.I(typedArrayE.getDimension(16, -1.0f));
        eVar.T(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.T(typedArrayE.getBoolean(26, false));
        }
        eVar.N(com.google.android.material.resources.c.l(context4, typedArrayE, 25));
        eVar.S(com.google.android.material.resources.c.j(context4, typedArrayE, 30));
        eVar.P(typedArrayE.getDimension(28, 0.0f));
        eVar.C(typedArrayE.getBoolean(6, false));
        eVar.F(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.F(typedArrayE.getBoolean(8, false));
        }
        eVar.D(com.google.android.material.resources.c.l(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            eVar.E(com.google.android.material.resources.c.j(context4, typedArrayE, 9));
        }
        eVar.A0 = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : com.google.android.material.animation.b.a(context4, resourceId2);
        eVar.B0 = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : com.google.android.material.animation.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (eVar.C0 != dimension2) {
            eVar.C0 = dimension2;
            eVar.invalidateSelf();
            eVar.A();
        }
        eVar.V(typedArrayE.getDimension(35, 0.0f));
        eVar.U(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (eVar.F0 != dimension3) {
            eVar.F0 = dimension3;
            eVar.invalidateSelf();
            eVar.A();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (eVar.G0 != dimension4) {
            eVar.G0 = dimension4;
            eVar.invalidateSelf();
            eVar.A();
        }
        eVar.Q(typedArrayE.getDimension(29, 0.0f));
        eVar.O(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (eVar.J0 != dimension5) {
            eVar.J0 = dimension5;
            eVar.invalidateSelf();
            eVar.A();
        }
        eVar.j1 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        j.a(context2, attributeSet, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action);
        this.K = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueU = com.google.android.material.resources.b.u(context2, com.app.mlounge.R.attr.minTouchTargetSize);
        this.M = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueU == null || typedValueU.type != 5) ? context2.getResources().getDimension(com.app.mlounge.R.dimen.mtrl_min_touch_target_size) : typedValueU.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.m(getElevation());
        j.a(context2, attributeSet, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action);
        j.b(context2, attributeSet, iArr, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.O = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.G);
        setText(eVar.k0);
        setEllipsize(eVar.h1);
        g();
        if (!this.B.i1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.K) {
            setMinHeight(this.M);
        }
        this.L = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a.F;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.R;
        rectF.setEmpty();
        if (c() && this.E != null) {
            e eVar = this.B;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.a0()) {
                float f = eVar.J0 + eVar.I0 + eVar.u0 + eVar.H0 + eVar.G0;
                if (eVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.Q;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private f getTextAppearance() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.Q0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.I != z) {
            this.I = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.H != z) {
            this.H = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.M = i;
        if (!this.K) {
            InsetDrawable insetDrawable = this.C;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.C = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.B.f0));
        int iMax2 = Math.max(0, i - this.B.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.C;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.C = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.C != null) {
            Rect rect = new Rect();
            this.C.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.C = new InsetDrawable((Drawable) this.B, i2, i3, i2, i3);
        e();
    }

    public final boolean c() {
        e eVar = this.B;
        if (eVar == null) {
            return false;
        }
        Drawable drawable = eVar.r0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        e eVar;
        if (!c() || (eVar = this.B) == null || !eVar.q0 || this.E == null) {
            s0.m(this, null);
            this.P = false;
        } else {
            s0.m(this, this.O);
            this.P = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.P) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.O;
        AccessibilityManager accessibilityManager = dVar.E;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = dVar.N;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = dVar.J;
                if (i3 != i2) {
                    dVar.J = i2;
                    dVar.r(i2, 128);
                    dVar.r(i3, LibretroCore.SCREEN_WIDTH);
                    return true;
                }
            } else if (action == 10 && (i = dVar.J) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    dVar.J = Integer.MIN_VALUE;
                    dVar.r(Integer.MIN_VALUE, 128);
                    dVar.r(i, LibretroCore.SCREEN_WIDTH);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.P) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.O;
        dVar.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && dVar.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = dVar.I;
                                if (i != Integer.MIN_VALUE) {
                                    chip = dVar.N;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.E;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.P) {
                                            chip.O.r(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = dVar.I;
                    if (i != Integer.MIN_VALUE) {
                        chip = dVar.N;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.E;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.P) {
                                chip.O.r(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = dVar.m(1, null);
            }
        }
        if (!zM || dVar.I == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        e eVar = this.B;
        boolean zR = false;
        int i2 = 0;
        zR = false;
        if (eVar != null && e.z(eVar.r0)) {
            e eVar2 = this.B;
            ?? IsEnabled = isEnabled();
            if (this.J) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.I) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.H) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.J) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.I) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.H) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zR = eVar2.R(iArr);
        }
        if (zR) {
            invalidate();
        }
    }

    public final void e() {
        this.D = new RippleDrawable(com.google.android.material.ripple.a.a(this.B.j0), getBackgroundDrawable(), null);
        this.B.getClass();
        setBackground(this.D);
        f();
    }

    public final void f() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.B) == null) {
            return;
        }
        int iW = (int) (eVar.w() + eVar.J0 + eVar.G0);
        e eVar2 = this.B;
        int iV = (int) (eVar2.v() + eVar2.C0 + eVar2.F0);
        if (this.C != null) {
            Rect rect = new Rect();
            this.C.getPadding(rect);
            iV += rect.left;
            iW += rect.right;
        }
        setPaddingRelative(iV, getPaddingTop(), iW, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.B;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        f textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.S);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.N)) {
            return this.N;
        }
        e eVar = this.B;
        if (eVar == null || !eVar.w0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.C;
        return insetDrawable == null ? this.B : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.y0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.z0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.e0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.B;
        if (eVar != null) {
            return Math.max(0.0f, eVar.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.B;
    }

    public float getChipEndPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.J0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.B;
        if (eVar == null || (drawable = eVar.m0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.n0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.f0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.C0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.h0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.i0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.B;
        if (eVar == null || (drawable = eVar.r0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.v0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.I0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.u0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.H0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.t0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.h1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.P) {
            d dVar = this.O;
            if (dVar.I == 1 || dVar.H == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public com.google.android.material.animation.b getHideMotionSpec() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.B0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.E0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.j0;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.B.y.a;
    }

    public com.google.android.material.animation.b getShowMotionSpec() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.A0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.G0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.F0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.L(this, this.B);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U);
        }
        e eVar = this.B;
        if (eVar != null && eVar.w0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.P) {
            d dVar = this.O;
            int i2 = dVar.I;
            if (i2 != Integer.MIN_VALUE) {
                dVar.j(i2);
            }
            if (z) {
                dVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.B;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.w0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.L != i) {
            this.L = i;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.H) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.H) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.E;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.P) {
                        this.O.r(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.N = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.D) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.D) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.q, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.C(z);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.C(eVar.K0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        e eVar = this.B;
        if (eVar == null) {
            this.G = z;
        } else if (eVar.w0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.D(g.p(eVar.K0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.E(n.t(eVar.K0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.F(eVar.K0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.B;
        if (eVar == null || eVar.e0 == colorStateList) {
            return;
        }
        eVar.e0 = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListT;
        e eVar = this.B;
        if (eVar == null || eVar.e0 == (colorStateListT = n.t(eVar.K0, i))) {
            return;
        }
        eVar.e0 = colorStateListT;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.G(eVar.K0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.B;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.g1 = new WeakReference(null);
            }
            this.B = eVar;
            eVar.i1 = false;
            eVar.g1 = new WeakReference(this);
            b(this.M);
        }
    }

    public void setChipEndPadding(float f) {
        e eVar = this.B;
        if (eVar == null || eVar.J0 == f) {
            return;
        }
        eVar.J0 = f;
        eVar.invalidateSelf();
        eVar.A();
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i);
            if (eVar.J0 != dimension) {
                eVar.J0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.H(g.p(eVar.K0, i));
        }
    }

    public void setChipIconSize(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.I(eVar.K0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.J(n.t(eVar.K0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.K(eVar.K0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        e eVar = this.B;
        if (eVar == null || eVar.f0 == f) {
            return;
        }
        eVar.f0 = f;
        eVar.invalidateSelf();
        eVar.A();
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i);
            if (eVar.f0 != dimension) {
                eVar.f0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        e eVar = this.B;
        if (eVar == null || eVar.C0 == f) {
            return;
        }
        eVar.C0 = f;
        eVar.invalidateSelf();
        eVar.A();
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i);
            if (eVar.C0 != dimension) {
                eVar.C0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.L(n.t(eVar.K0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.M(eVar.K0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.B;
        if (eVar == null || eVar.v0 == charSequence) {
            return;
        }
        String str = androidx.core.text.b.b;
        androidx.core.text.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? androidx.core.text.b.e : androidx.core.text.b.d;
        bVar.getClass();
        z1 z1Var = androidx.core.text.f.a;
        eVar.v0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.O(eVar.K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.N(g.p(eVar.K0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.P(eVar.K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.Q(eVar.K0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.S(n.t(eVar.K0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            com.google.gson.b.r("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            com.google.gson.b.r("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            com.google.gson.b.r("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            com.google.gson.b.r("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        e eVar = this.B;
        if (eVar != null) {
            eVar.m(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.B == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            com.google.gson.b.r("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        e eVar = this.B;
        if (eVar != null) {
            eVar.h1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.K = z;
        b(this.M);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(com.google.android.material.animation.b bVar) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.B0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.B0 = com.google.android.material.animation.b.a(eVar.K0, i);
        }
    }

    public void setIconEndPadding(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.U(eVar.K0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.V(eVar.K0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.B == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            com.google.gson.b.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            com.google.gson.b.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        e eVar = this.B;
        if (eVar != null) {
            eVar.j1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            com.google.gson.b.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.F = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.E = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.W(colorStateList);
        }
        this.B.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.W(n.t(eVar.K0, i));
            this.B.getClass();
            e();
        }
    }

    @Override // com.google.android.material.shape.y
    public void setShapeAppearanceModel(o oVar) {
        this.B.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(com.google.android.material.animation.b bVar) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.A0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.A0 = com.google.android.material.animation.b.a(eVar.K0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            com.google.gson.b.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.B;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.i1 ? null : charSequence, bufferType);
        e eVar2 = this.B;
        if (eVar2 == null || TextUtils.equals(eVar2.k0, charSequence)) {
            return;
        }
        eVar2.k0 = charSequence;
        eVar2.Q0.d = true;
        eVar2.invalidateSelf();
        eVar2.A();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e eVar = this.B;
        if (eVar != null) {
            eVar.X(new f(eVar.K0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        e eVar = this.B;
        if (eVar == null || eVar.G0 == f) {
            return;
        }
        eVar.G0 = f;
        eVar.invalidateSelf();
        eVar.A();
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i);
            if (eVar.G0 != dimension) {
                eVar.G0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        e eVar = this.B;
        if (eVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            h hVar = eVar.Q0;
            f fVar = hVar.f;
            if (fVar != null) {
                fVar.l = fApplyDimension;
                hVar.a.setTextSize(fApplyDimension);
                eVar.A();
                eVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        e eVar = this.B;
        if (eVar == null || eVar.F0 == f) {
            return;
        }
        eVar.F0 = f;
        eVar.invalidateSelf();
        eVar.A();
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.B;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i);
            if (eVar.F0 != dimension) {
                eVar.F0 = dimension;
                eVar.invalidateSelf();
                eVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.T(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.K(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            com.google.gson.b.r("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            com.google.gson.b.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            com.google.gson.b.r("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            com.google.gson.b.r("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(f fVar) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.X(fVar);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.B;
        if (eVar != null) {
            eVar.X(new f(eVar.K0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }
}
