package com.app.mlounge.ui.components;

import androidx.compose.runtime.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ e(y0 y0Var, y0 y0Var2, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = y0Var2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.e) {
            case 0:
                str.getClass();
                this.y.setValue(Boolean.FALSE);
                this.z.setValue(str);
                break;
            case 1:
                str.getClass();
                this.y.setValue(Boolean.FALSE);
                this.z.setValue(str);
                break;
            case 2:
                str.getClass();
                if (str.length() <= 4) {
                    for (int i = 0; i < str.length(); i++) {
                        if (Character.isDigit(str.charAt(i))) {
                        }
                    }
                    this.y.setValue(str);
                    this.z.setValue(null);
                }
                return kotlin.y.a;
            default:
                str.getClass();
                if (str.length() <= 4) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (Character.isDigit(str.charAt(i2))) {
                        }
                    }
                    this.y.setValue(str);
                    this.z.setValue(null);
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }
}
