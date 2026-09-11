package com.app.mlounge.ui.screens.settings;

import androidx.compose.runtime.y0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;

    public /* synthetic */ q(y0 y0Var, int i) {
        this.e = i;
        this.y = y0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.setValue(Boolean.FALSE);
                break;
            case 1:
                this.y.setValue(Boolean.FALSE);
                break;
            case 2:
                this.y.setValue(Boolean.FALSE);
                break;
            case 3:
                y0 y0Var = this.y;
                File parentFile = ((File) y0Var.getValue()).getParentFile();
                if (parentFile != null) {
                    y0Var.setValue(parentFile);
                }
                return kotlin.y.a;
            case 4:
                this.y.setValue(Boolean.TRUE);
                break;
            case 5:
                this.y.setValue(Boolean.TRUE);
                break;
            case 6:
                y0 y0Var2 = this.y;
                y0Var2.setValue(Boolean.valueOf(!((Boolean) y0Var2.getValue()).booleanValue()));
                break;
            case 7:
                this.y.setValue(Boolean.TRUE);
                break;
            case 8:
                this.y.setValue(Boolean.FALSE);
                break;
            case 9:
                this.y.setValue(Boolean.TRUE);
                break;
            case 10:
                this.y.setValue(Boolean.TRUE);
                break;
            case 11:
                this.y.setValue(Boolean.TRUE);
                break;
            case 12:
                this.y.setValue(Boolean.FALSE);
                break;
            case 13:
                this.y.setValue(Boolean.FALSE);
                break;
            case 14:
                this.y.setValue(null);
                break;
            case 15:
                this.y.setValue(Boolean.FALSE);
                break;
            case 16:
                this.y.setValue(Boolean.FALSE);
                break;
            case 17:
                this.y.setValue(Boolean.TRUE);
                break;
            default:
                this.y.setValue(Boolean.FALSE);
                break;
        }
        return kotlin.y.a;
    }
}
