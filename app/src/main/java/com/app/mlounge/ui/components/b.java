package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.runtime.d1;
import androidx.compose.runtime.y0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ d1 B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Context y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ b(Context context, y0 y0Var, y0 y0Var2, d1 d1Var) {
        this.y = context;
        this.z = y0Var;
        this.A = y0Var2;
        this.B = d1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Boolean bool = Boolean.TRUE;
                final y0 y0Var = this.z;
                y0Var.setValue(bool);
                final int i = 1;
                final d1 d1Var = this.B;
                kotlin.jvm.functions.l lVar = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.c
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        int i2 = i;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i2) {
                            case 0:
                                d1Var.h(fFloatValue);
                                break;
                            default:
                                d1Var.h(fFloatValue);
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                final Context context = this.y;
                new Thread(new i(context, lVar, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.d
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        File file = (File) obj;
                        switch (i) {
                            case 0:
                                file.getClass();
                                y0Var.setValue(Boolean.FALSE);
                                b0.s(context, file);
                                break;
                            default:
                                file.getClass();
                                y0Var.setValue(Boolean.FALSE);
                                b0.s(context, file);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }, new e(y0Var, this.A, 1), 0)).start();
                break;
            default:
                y0 y0Var2 = this.z;
                y0Var2.setValue(null);
                Boolean bool2 = Boolean.TRUE;
                final y0 y0Var3 = this.A;
                y0Var3.setValue(bool2);
                final int i2 = 0;
                final d1 d1Var2 = this.B;
                kotlin.jvm.functions.l lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.c
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i3) {
                            case 0:
                                d1Var2.h(fFloatValue);
                                break;
                            default:
                                d1Var2.h(fFloatValue);
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                final Context context2 = this.y;
                new Thread(new i(context2, lVar2, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.d
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        File file = (File) obj;
                        switch (i2) {
                            case 0:
                                file.getClass();
                                y0Var3.setValue(Boolean.FALSE);
                                b0.s(context2, file);
                                break;
                            default:
                                file.getClass();
                                y0Var3.setValue(Boolean.FALSE);
                                b0.s(context2, file);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }, new e(y0Var3, y0Var2, 0), 0)).start();
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ b(Context context, y0 y0Var, d1 d1Var, y0 y0Var2) {
        this.y = context;
        this.z = y0Var;
        this.B = d1Var;
        this.A = y0Var2;
    }
}
