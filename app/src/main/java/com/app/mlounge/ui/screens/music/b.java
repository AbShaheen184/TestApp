package com.app.mlounge.ui.screens.music;

import com.app.mlounge.ui.viewmodel.h0;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ h0 y;

    public /* synthetic */ b(h0 h0Var, int i) {
        this.e = i;
        this.y = h0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.runtime.h0 h0Var = (androidx.compose.runtime.h0) obj;
        switch (this.e) {
            case 0:
                h0Var.getClass();
                return new f(this.y, 0);
            default:
                h0Var.getClass();
                return new f(this.y, 1);
        }
    }
}
