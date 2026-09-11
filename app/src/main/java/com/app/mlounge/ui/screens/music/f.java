package com.app.mlounge.ui.screens.music;

import androidx.compose.runtime.g0;
import com.app.mlounge.ui.viewmodel.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ f(h0 h0Var, int i) {
        this.a = i;
        this.b = h0Var;
    }

    @Override // androidx.compose.runtime.g0
    public final void dispose() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                h0Var.x.setValue(null);
                h0Var.z.setValue(null);
                break;
            default:
                h0 h0Var2 = this.b;
                h0Var2.x.setValue(null);
                h0Var2.z.setValue(null);
                break;
        }
    }
}
