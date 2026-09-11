package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.compose.foundation.text.input.internal.o;
import androidx.core.view.f1;
import androidx.core.view.w0;
import androidx.core.view.z1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w0 {
    public final View A;
    public int B;
    public int C;
    public final int[] D;

    public c(View view) {
        super(0);
        this.D = new int[2];
        this.A = view;
    }

    @Override // androidx.core.view.w0
    public final void n(f1 f1Var) {
        this.A.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.w0
    public final void o() {
        View view = this.A;
        int[] iArr = this.D;
        view.getLocationOnScreen(iArr);
        this.B = iArr[1];
    }

    @Override // androidx.core.view.w0
    public final z1 p(z1 z1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if ((f1Var.a.d() & 8) != 0) {
                this.A.setTranslationY(com.google.android.material.animation.a.c(f1Var.a.c(), this.C, 0));
                break;
            }
        }
        return z1Var;
    }

    @Override // androidx.core.view.w0
    public final o q(f1 f1Var, o oVar) {
        View view = this.A;
        int[] iArr = this.D;
        view.getLocationOnScreen(iArr);
        int i = this.B - iArr[1];
        this.C = i;
        view.setTranslationY(i);
        return oVar;
    }
}
