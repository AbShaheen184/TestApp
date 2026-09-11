package com.app.mlounge.ui;

import androidx.compose.runtime.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.navigation.y y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ b(androidx.navigation.y yVar, y0 y0Var, int i) {
        this.e = i;
        this.y = yVar;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.e) {
            case 0:
                str.getClass();
                str2.getClass();
                y0 y0Var = this.z;
                if (!h0.b(y0Var)) {
                    y0Var.setValue(Boolean.TRUE);
                    com.app.mlounge.ui.navigation.f.g.getClass();
                    androidx.navigation.y.b(this.y, "game_detail/" + str + "/" + str2);
                }
                break;
            default:
                str.getClass();
                str2.getClass();
                y0 y0Var2 = this.z;
                if (!h0.b(y0Var2)) {
                    y0Var2.setValue(Boolean.TRUE);
                    com.app.mlounge.ui.navigation.f.g.getClass();
                    androidx.navigation.y.b(this.y, "game_detail/" + str + "/" + str2);
                }
                break;
        }
        return kotlin.y.a;
    }
}
