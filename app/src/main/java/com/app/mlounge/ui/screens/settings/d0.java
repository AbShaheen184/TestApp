package com.app.mlounge.ui.screens.settings;

import android.view.KeyEvent;
import androidx.compose.runtime.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String y;
    public final /* synthetic */ y0 z;

    public d0(boolean z, String str, y0 y0Var) {
        this.e = z;
        this.y = str;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && !this.e && (keyEvent.getKeyCode() == 96 || keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160)) {
            this.z.setValue(this.y);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
