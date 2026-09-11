package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.h;
import com.google.android.material.resources.f;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j implements Drawable.Callback {
    public static final int[] l1 = {R.attr.state_enabled};
    public static final ShapeDrawable m1 = new ShapeDrawable(new OvalShape());
    public com.google.android.material.animation.b A0;
    public com.google.android.material.animation.b B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public final Context K0;
    public final Paint L0;
    public final Paint.FontMetrics M0;
    public final RectF N0;
    public final PointF O0;
    public final Path P0;
    public final h Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public ColorFilter a1;
    public PorterDuffColorFilter b1;
    public ColorStateList c1;
    public ColorStateList d0;
    public PorterDuff.Mode d1;
    public ColorStateList e0;
    public int[] e1;
    public float f0;
    public ColorStateList f1;
    public float g0;
    public WeakReference g1;
    public ColorStateList h0;
    public TextUtils.TruncateAt h1;
    public float i0;
    public boolean i1;
    public ColorStateList j0;
    public int j1;
    public CharSequence k0;
    public boolean k1;
    public boolean l0;
    public Drawable m0;
    public ColorStateList n0;
    public float o0;
    public boolean p0;
    public boolean q0;
    public Drawable r0;
    public RippleDrawable s0;
    public ColorStateList t0;
    public float u0;
    public SpannableStringBuilder v0;
    public boolean w0;
    public boolean x0;
    public Drawable y0;
    public ColorStateList z0;

    public e(Context context, AttributeSet attributeSet) {
        super(o.b(context, attributeSet, com.app.mlounge.R.attr.chipStyle, com.app.mlounge.R.style.Widget_MaterialComponents_Chip_Action).a());
        this.g0 = -1.0f;
        this.L0 = new Paint(1);
        this.M0 = new Paint.FontMetrics();
        this.N0 = new RectF();
        this.O0 = new PointF();
        this.P0 = new Path();
        this.Z0 = 255;
        this.d1 = PorterDuff.Mode.SRC_IN;
        this.g1 = new WeakReference(null);
        k(context);
        this.K0 = context;
        h hVar = new h(this);
        this.Q0 = hVar;
        this.k0 = "";
        hVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = l1;
        setState(iArr);
        R(iArr);
        this.i1 = true;
        m1.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A() {
        Chip chip = (Chip) this.g1.get();
        if (chip != null) {
            chip.b(chip.M);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    public final boolean B(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.d0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.R0) : 0);
        boolean state = true;
        if (this.R0 != iC) {
            this.R0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.e0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.S0) : 0);
        if (this.S0 != iC2) {
            this.S0 = iC2;
            zOnStateChange = true;
        }
        int iB = androidx.core.graphics.a.b(iC2, iC);
        if ((this.T0 != iB) | (this.y.d == null)) {
            this.T0 = iB;
            n(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.h0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.U0) : 0;
        if (this.U0 != colorForState2) {
            this.U0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f1 != null) {
            int[] iArr3 = com.google.android.material.ripple.a.a;
            boolean z3 = false;
            boolean z4 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z3 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z4 = true;
                }
            }
            if (z3 && z4) {
                colorForState = this.f1.getColorForState(iArr, this.V0);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.V0 != colorForState) {
            this.V0 = colorForState;
        }
        f fVar = this.Q0.f;
        int colorForState3 = (fVar == null || (colorStateList = fVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.W0);
        if (this.W0 != colorForState3) {
            this.W0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (state2[i2] == 16842912) {
                    if (this.w0) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
            break;
        }
        if (this.X0 == z || this.y0 == null) {
            z2 = false;
        } else {
            float fV = v();
            this.X0 = z;
            if (fV != v()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.c1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.Y0) : 0;
        if (this.Y0 != colorForState4) {
            this.Y0 = colorForState4;
            ColorStateList colorStateList6 = this.c1;
            PorterDuff.Mode mode = this.d1;
            this.b1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (z(this.m0)) {
            state |= this.m0.setState(iArr);
        }
        if (z(this.y0)) {
            state |= this.y0.setState(iArr);
        }
        if (z(this.r0)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.r0.setState(iArr4);
        }
        if (z(this.s0)) {
            state |= this.s0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            A();
        }
        return state;
    }

    public final void C(boolean z) {
        if (this.w0 != z) {
            this.w0 = z;
            float fV = v();
            if (!z && this.X0) {
                this.X0 = false;
            }
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.y0 != drawable) {
            float fV = v();
            this.y0 = drawable;
            float fV2 = v();
            b0(this.y0);
            t(this.y0);
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            if (this.x0 && (drawable = this.y0) != null && this.w0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.x0 != z) {
            boolean zY = Y();
            this.x0 = z;
            boolean zY2 = Y();
            if (zY != zY2) {
                Drawable drawable = this.y0;
                if (zY2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            n nVarF = this.y.a.f();
            nVarF.e = new com.google.android.material.shape.a(f);
            nVarF.f = new com.google.android.material.shape.a(f);
            nVarF.g = new com.google.android.material.shape.a(f);
            nVarF.h = new com.google.android.material.shape.a(f);
            setShapeAppearanceModel(nVarF.a());
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.m0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fV = v();
            this.m0 = drawable != null ? drawable.mutate() : null;
            float fV2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.m0);
            }
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void I(float f) {
        if (this.o0 != f) {
            float fV = v();
            this.o0 = f;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.p0 = true;
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            if (Z()) {
                this.m0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.l0 != z) {
            boolean Z = Z();
            this.l0 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.m0;
                if (Z2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.h0 != colorStateList) {
            this.h0 = colorStateList;
            if (this.k1) {
                com.google.android.material.shape.h hVar = this.y;
                if (hVar.e != colorStateList) {
                    hVar.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            this.L0.setStrokeWidth(f);
            if (this.k1) {
                this.y.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.r0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fW = w();
            this.r0 = drawable != null ? drawable.mutate() : null;
            this.s0 = new RippleDrawable(com.google.android.material.ripple.a.a(this.j0), this.r0, m1);
            float fW2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.r0);
            }
            invalidateSelf();
            if (fW != fW2) {
                A();
            }
        }
    }

    public final void O(float f) {
        if (this.I0 != f) {
            this.I0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f) {
        if (this.u0 != f) {
            this.u0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f) {
        if (this.H0 != f) {
            this.H0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (Arrays.equals(this.e1, iArr)) {
            return false;
        }
        this.e1 = iArr;
        if (a0()) {
            return B(getState(), iArr);
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            if (a0()) {
                this.r0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.q0 != z) {
            boolean zA0 = a0();
            this.q0 = z;
            boolean zA1 = a0();
            if (zA0 != zA1) {
                Drawable drawable = this.r0;
                if (zA1) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f) {
        if (this.E0 != f) {
            float fV = v();
            this.E0 = f;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void V(float f) {
        if (this.D0 != f) {
            float fV = v();
            this.D0 = f;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            this.f1 = null;
            onStateChange(getState());
        }
    }

    public final void X(f fVar) {
        h hVar = this.Q0;
        b bVar = hVar.b;
        TextPaint textPaint = hVar.a;
        if (hVar.f != fVar) {
            hVar.f = fVar;
            if (fVar != null) {
                Context context = this.K0;
                fVar.e(context, textPaint, bVar);
                e eVar = (e) hVar.e.get();
                if (eVar != null) {
                    textPaint.drawableState = eVar.getState();
                }
                fVar.d(context, textPaint, bVar);
                hVar.d = true;
            }
            e eVar2 = (e) hVar.e.get();
            if (eVar2 != null) {
                eVar2.A();
                eVar2.invalidateSelf();
                eVar2.onStateChange(eVar2.getState());
            }
        }
    }

    public final boolean Y() {
        return this.x0 && this.y0 != null && this.X0;
    }

    public final boolean Z() {
        return this.l0 && this.m0 != null;
    }

    public final boolean a0() {
        return this.q0 && this.r0 != null;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: com.google.android.material.chip.e
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.RippleDrawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v54 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v54 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v56 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v56 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: com.google.android.material.chip.e
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.LayerDrawable
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.e.draw(android.graphics.Canvas):void");
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.Q0.a(this.k0.toString()) + v() + this.C0 + this.F0 + this.G0 + this.J0), this.j1);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.k1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f0, this.g0);
        } else {
            outline.setRoundRect(bounds, this.g0);
            outline2 = outline;
        }
        outline2.setAlpha(this.Z0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (y(this.d0) || y(this.e0) || y(this.h0)) {
            return true;
        }
        f fVar = this.Q0.f;
        if (fVar == null || (colorStateList = fVar.k) == null || !colorStateList.isStateful()) {
            return (this.x0 && this.y0 != null && this.w0) || z(this.m0) || z(this.y0) || y(this.c1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            zOnLayoutDirectionChanged |= this.m0.setLayoutDirection(i);
        }
        if (Y()) {
            zOnLayoutDirectionChanged |= this.y0.setLayoutDirection(i);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.r0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (Z()) {
            zOnLevelChange |= this.m0.setLevel(i);
        }
        if (Y()) {
            zOnLevelChange |= this.y0.setLevel(i);
        }
        if (a0()) {
            zOnLevelChange |= this.r0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.k1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.e1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.Z0 != i) {
            this.Z0 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.a1 != colorFilter) {
            this.a1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.c1 != colorStateList) {
            this.c1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.d1 != mode) {
            this.d1 = mode;
            ColorStateList colorStateList = this.c1;
            this.b1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.m0.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.y0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.r0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.r0) {
            if (drawable.isStateful()) {
                drawable.setState(this.e1);
            }
            drawable.setTintList(this.t0);
            return;
        }
        Drawable drawable2 = this.m0;
        if (drawable == drawable2 && this.p0) {
            drawable2.setTintList(this.n0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f = this.C0 + this.D0;
            Drawable drawable = this.X0 ? this.y0 : this.m0;
            float intrinsicWidth = this.o0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.X0 ? this.y0 : this.m0;
            float fCeil = this.o0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.K0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f = this.D0;
        Drawable drawable = this.X0 ? this.y0 : this.m0;
        float intrinsicWidth = this.o0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.E0;
    }

    public final float w() {
        if (a0()) {
            return this.H0 + this.u0 + this.I0;
        }
        return 0.0f;
    }

    public final float x() {
        if (!this.k1) {
            return this.g0;
        }
        float[] fArr = this.Y;
        return fArr != null ? fArr[3] : this.y.a.e.a(g());
    }
}
