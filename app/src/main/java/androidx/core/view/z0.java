package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements View.OnApplyWindowInsetsListener {
    public final w0 a;
    public z1 b;

    public z0(View view, w0 w0Var) {
        z1 z1VarB;
        this.a = w0Var;
        Field field = s0.a;
        z1 z1VarA = l0.a(view);
        if (z1VarA != null) {
            int i = Build.VERSION.SDK_INT;
            z1VarB = (i >= 36 ? new m1(z1VarA) : i >= 35 ? new l1(z1VarA) : i >= 34 ? new k1(z1VarA) : i >= 31 ? new j1(z1VarA) : i >= 30 ? new i1(z1VarA) : i >= 29 ? new h1(z1VarA) : new g1(z1VarA)).b();
        } else {
            z1VarB = null;
        }
        this.b = z1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = z1.d(view, windowInsets);
            return a1.j(view, windowInsets);
        }
        z1 z1VarD = z1.d(view, windowInsets);
        w1 w1Var = z1VarD.a;
        if (this.b == null) {
            Field field = s0.a;
            this.b = l0.a(view);
        }
        if (this.b == null) {
            this.b = z1VarD;
            return a1.j(view, windowInsets);
        }
        w0 w0VarK = a1.k(view);
        if (w0VarK != null && Objects.equals((z1) w0VarK.z, z1VarD)) {
            return a1.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        z1 z1Var = this.b;
        int i = 1;
        while (i <= 512) {
            androidx.core.graphics.c cVarI = w1Var.i(i);
            androidx.core.graphics.c cVarI2 = z1Var.a.i(i);
            int i2 = cVarI.a;
            int i3 = cVarI.d;
            int i4 = cVarI.c;
            int i5 = cVarI.b;
            int i6 = cVarI2.a;
            int i7 = cVarI2.d;
            int i8 = cVarI2.c;
            int i9 = cVarI2.b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = z1VarD;
            return a1.j(view, windowInsets);
        }
        z1 z1Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = a1.e;
        } else if ((i11 & 8) != 0) {
            interpolator = a1.f;
        } else if ((i10 & 519) != 0) {
            interpolator = a1.g;
        } else {
            interpolator = (i11 & 519) != 0 ? a1.h : null;
        }
        f1 f1Var = new f1(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        f1Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(f1Var.a.b());
        androidx.core.graphics.c cVarI3 = w1Var.i(i12);
        androidx.core.graphics.c cVarI4 = z1Var2.a.i(i12);
        int iMin = Math.min(cVarI3.a, cVarI4.a);
        int i13 = cVarI3.b;
        int i14 = cVarI4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = cVarI3.c;
        int i16 = cVarI4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = cVarI3.d;
        int i18 = cVarI4.d;
        androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(25, androidx.core.graphics.c.b(iMin, iMin2, iMin3, Math.min(i17, i18)), androidx.core.graphics.c.b(Math.max(cVarI3.a, cVarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        a1.g(view, f1Var, z1VarD, false);
        duration.addUpdateListener(new x0(f1Var, z1VarD, z1Var2, i12, view));
        duration.addListener(new y0(view, f1Var));
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(view, f1Var, oVar, duration, 1, false);
        if (view != null) {
            u uVar = new u(view, eVar);
            view.getViewTreeObserver().addOnPreDrawListener(uVar);
            view.addOnAttachStateChangeListener(uVar);
        } else {
            com.google.gson.b.h("view == null");
        }
        this.b = z1VarD;
        return a1.j(view, windowInsets);
    }
}
