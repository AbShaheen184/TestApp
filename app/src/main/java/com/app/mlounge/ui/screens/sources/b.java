package com.app.mlounge.ui.screens.sources;

import com.app.mlounge.ui.viewmodel.m;
import com.app.mlounge.ui.viewmodel.r1;
import okhttp3.internal.g;
import okhttp3.x;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ r1 y;

    public /* synthetic */ b(r1 r1Var, int i) {
        this.e = i;
        this.y = r1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.n.setValue(new m(null, null, null, null, 63));
                break;
            case 1:
                this.y.n.setValue(new m(null, null, null, null, 63));
                break;
            case 2:
                this.y.m();
                break;
            default:
                x xVarA = this.y.f.a();
                xVarA.a(8L);
                xVarA.c(8L);
                xVarA.x = g.b("timeout", 10L);
                return new y(xVarA);
        }
        return kotlin.y.a;
    }
}
