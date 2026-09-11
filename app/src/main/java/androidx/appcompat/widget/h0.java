package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final TextView a;
    public a2 b;
    public a2 c;
    public a2 d;
    public a2 e;
    public a2 f;
    public a2 g;
    public a2 h;
    public final q0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public h0(TextView textView) {
        this.a = textView;
        this.i = new q0(textView);
    }

    public static a2 c(Context context, s sVar, int i) {
        ColorStateList colorStateListF;
        synchronized (sVar) {
            colorStateListF = sVar.a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        a2 a2Var = new a2();
        a2Var.b = true;
        a2Var.c = colorStateListF;
        return a2Var;
    }

    public final void a(Drawable drawable, a2 a2Var) {
        if (drawable == null || a2Var == null) {
            return;
        }
        s.d(drawable, a2Var, this.a.getDrawableState());
    }

    public final void b() {
        a2 a2Var = this.b;
        TextView textView = this.a;
        if (a2Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    /* JADX WARN: Code duplicated, block: B:240:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:242:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:245:0x03c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:248:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:250:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:252:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    public final void d(AttributeSet attributeSet, int i) {
        s sVar;
        boolean z;
        boolean z2;
        String string;
        String string2;
        float f;
        float fApplyDimension;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int[] iArr = androidx.appcompat.a.g;
        int[] iArr2 = androidx.appcompat.a.r;
        q0 q0Var = this.i;
        TextView textView = this.a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = s.b;
        synchronized (s.class) {
            try {
                if (s.c == null) {
                    s.c();
                }
                sVar = s.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = androidx.appcompat.a.f;
        c2 c2VarS = c2.S(context, attributeSet, iArr3, i);
        TextView textView2 = this.a;
        androidx.core.view.s0.l(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) c2VarS.z, i);
        TypedArray typedArray = (TypedArray) c2VarS.z;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, sVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, sVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, sVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, sVar, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, sVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, sVar, typedArray.getResourceId(6, 0));
        }
        c2VarS.U();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            c2 c2Var = new c2(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            k(context, c2Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c2Var.U();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        c2 c2Var2 = new c2(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z4 = z;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, c2Var2);
        c2Var2.U();
        if (!z3 && z2) {
            this.a.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            f0.d(textView, string);
        }
        if (string2 != null) {
            e0.b(textView, e0.a(string2));
        }
        Context context2 = q0Var.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = q0Var.i;
        androidx.core.view.s0.l(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            q0Var.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(1)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(1, -1.0f);
            f = -1.0f;
        } else {
            f = -1.0f;
            fApplyDimension = -1.0f;
        }
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                q0Var.f = q0.b(iArr4);
                q0Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!q0Var.j()) {
            q0Var.a = 0;
        } else if (q0Var.a == 1) {
            if (!q0Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (fApplyDimension == f) {
                    fApplyDimension = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f2 = fApplyDimension;
                if (dimension == f) {
                    dimension = 1.0f;
                }
                q0Var.k(dimension2, f2, dimension);
            }
            q0Var.h();
        }
        if (t2.a && q0Var.a != 0) {
            int[] iArr5 = q0Var.f;
            if (iArr5.length > 0) {
                if (f0.a(textView) != f) {
                    f0.b(textView, Math.round(q0Var.d), Math.round(q0Var.e), Math.round(q0Var.c), 0);
                } else {
                    f0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? sVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? sVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? sVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? sVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? sVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? sVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[r3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[r3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableA2, compoundDrawablesRelative2[2], drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = org.jsoup.helper.n.t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(t0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i7 = typedValuePeekValue.data;
                int i8 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                coil3.network.g.u(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                coil3.network.g.v(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != f) {
                if (i3 == i2) {
                    coil3.network.g.w(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    androidx.compose.ui.text.android.b.m(textView, i3, dimensionPixelSize);
                } else {
                    coil3.network.g.w(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            coil3.network.g.u(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            coil3.network.g.v(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != f) {
            if (i3 == i2) {
                coil3.network.g.w(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                androidx.compose.ui.text.android.b.m(textView, i3, dimensionPixelSize);
            } else {
                coil3.network.g.w(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, androidx.appcompat.a.r);
        c2 c2Var = new c2(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, c2Var);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            f0.d(textView, string);
        }
        c2Var.U();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        q0 q0Var = this.i;
        if (q0Var.j()) {
            DisplayMetrics displayMetrics = q0Var.j.getResources().getDisplayMetrics();
            q0Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (q0Var.h()) {
                q0Var.a();
            }
        }
    }

    public final void g(int[] iArr, int i) {
        q0 q0Var = this.i;
        if (q0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = q0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                q0Var.f = q0.b(iArrCopyOf);
                if (!q0Var.i()) {
                    androidx.core.graphics.b.b(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                q0Var.g = false;
            }
            if (q0Var.h()) {
                q0Var.a();
            }
        }
    }

    public final void h(int i) {
        q0 q0Var = this.i;
        if (q0Var.j()) {
            if (i == 0) {
                q0Var.a = 0;
                q0Var.d = -1.0f;
                q0Var.e = -1.0f;
                q0Var.c = -1.0f;
                q0Var.f = new int[0];
                q0Var.b = false;
                return;
            }
            if (i != 1) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = q0Var.j.getResources().getDisplayMetrics();
            q0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (q0Var.h()) {
                q0Var.a();
            }
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new a2();
        }
        a2 a2Var = this.h;
        a2Var.c = colorStateList;
        a2Var.b = colorStateList != null;
        this.b = a2Var;
        this.c = a2Var;
        this.d = a2Var;
        this.e = a2Var;
        this.f = a2Var;
        this.g = a2Var;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new a2();
        }
        a2 a2Var = this.h;
        a2Var.d = mode;
        a2Var.a = mode != null;
        this.b = a2Var;
        this.c = a2Var;
        this.d = a2Var;
        this.e = a2Var;
        this.f = a2Var;
        this.g = a2Var;
    }

    public final void k(Context context, c2 c2Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) c2Var.z;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceF = c2Var.F(i5, this.j, new c0(this, i6, i7, new WeakReference(this.a)));
                if (typefaceF != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceF;
                    } else {
                        this.l = g0.a(Typeface.create(typefaceF, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = g0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
