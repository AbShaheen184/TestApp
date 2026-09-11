package com.app.mlounge.ui.screens.settings;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ f0 A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ kotlin.jvm.functions.p z;

    public /* synthetic */ f(boolean z, kotlin.jvm.functions.p pVar, f0 f0Var, Context context, int i) {
        this.e = i;
        this.y = z;
        this.z = pVar;
        this.A = f0Var;
        this.B = context;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                f0 f0Var = this.A;
                String str = f0Var.b;
                if (this.y) {
                    this.z.invoke(f0Var.a, str);
                } else {
                    Toast.makeText(this.B, "Please install " + str + " first", 0).show();
                }
                break;
            default:
                f0 f0Var2 = this.A;
                String str2 = f0Var2.b;
                if (this.y) {
                    this.z.invoke(f0Var2.a, str2);
                } else {
                    Toast.makeText(this.B, "Please install " + str2 + " first", 0).show();
                }
                break;
        }
        return kotlin.y.a;
    }
}
