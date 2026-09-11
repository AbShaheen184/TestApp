package com.app.mlounge.ui.screens.services;

import androidx.compose.runtime.y0;
import java.io.File;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ l(kotlin.jvm.functions.l lVar, y0 y0Var, int i) {
        this.e = i;
        this.y = lVar;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.invoke(kotlin.text.k.A0((String) this.z.getValue()).toString());
                break;
            default:
                String absolutePath = ((File) this.z.getValue()).getAbsolutePath();
                absolutePath.getClass();
                this.y.invoke(absolutePath);
                break;
        }
        return y.a;
    }
}
