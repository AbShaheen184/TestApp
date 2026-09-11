package com.app.mlounge.emulator;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                EmulatorActivity.showMenu$lambda$13$1((GradientDrawable) this.b, view, z);
                break;
            case 1:
                com.google.android.material.textfield.c cVar = (com.google.android.material.textfield.c) this.b;
                cVar.s(cVar.t());
                break;
            default:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) this.b;
                kVar.l = z;
                kVar.p();
                if (!z) {
                    kVar.s(false);
                    kVar.m = false;
                }
                break;
        }
    }
}
