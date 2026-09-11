package com.app.mlounge.ui.components;

import android.view.KeyEvent;
import androidx.compose.runtime.y0;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.m1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements kotlin.jvm.functions.l {
    public final /* synthetic */ androidx.compose.ui.focus.y A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ k2 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.ui.focus.y z;

    public z(k2 k2Var, boolean z, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, y0 y0Var) {
        this.e = k2Var;
        this.y = z;
        this.z = yVar;
        this.A = yVar2;
        this.B = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            return Boolean.FALSE;
        }
        y0 y0Var = this.B;
        boolean z = true;
        if (((Boolean) y0Var.getValue()).booleanValue() || !(keyCode == 23 || keyCode == 66)) {
            boolean zBooleanValue = ((Boolean) y0Var.getValue()).booleanValue();
            k2 k2Var = this.e;
            if (zBooleanValue && (keyCode == 4 || keyCode == 97)) {
                y0Var.setValue(Boolean.FALSE);
                if (k2Var != null) {
                    ((m1) k2Var).a();
                }
            } else {
                boolean zBooleanValue2 = ((Boolean) y0Var.getValue()).booleanValue();
                androidx.compose.ui.focus.y yVar = this.A;
                androidx.compose.ui.focus.y yVar2 = this.z;
                boolean z2 = this.y;
                if (zBooleanValue2 && keyCode == 20) {
                    y0Var.setValue(Boolean.FALSE);
                    if (k2Var != null) {
                        ((m1) k2Var).a();
                    }
                    if (z2) {
                        androidx.compose.ui.focus.y.a(yVar);
                    } else {
                        androidx.compose.ui.focus.y.a(yVar2);
                    }
                } else if (((Boolean) y0Var.getValue()).booleanValue() && keyCode == 19) {
                    y0Var.setValue(Boolean.FALSE);
                    if (k2Var != null) {
                        ((m1) k2Var).a();
                    }
                } else if (((Boolean) y0Var.getValue()).booleanValue() || keyCode != 20) {
                    if (((Boolean) y0Var.getValue()).booleanValue() || (keyCode != 19 && keyCode != 21 && keyCode != 22)) {
                        z = false;
                    }
                } else if (z2) {
                    androidx.compose.ui.focus.y.a(yVar);
                } else {
                    androidx.compose.ui.focus.y.a(yVar2);
                }
            }
        } else {
            y0Var.setValue(Boolean.TRUE);
        }
        return Boolean.valueOf(z);
    }
}
