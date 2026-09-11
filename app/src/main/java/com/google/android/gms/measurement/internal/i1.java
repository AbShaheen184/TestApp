package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public final /* synthetic */ int a = 1;
    public final s1 b;

    public i1(l4 l4Var) {
        this.b = l4Var.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.a) {
            case 0:
                s1 s1Var = this.b;
                boolean z = false;
                try {
                    androidx.compose.ui.autofill.r rVarA = com.google.android.gms.common.wrappers.b.a(s1Var.e);
                    if (rVarA == null) {
                        x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.K.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        s1Var = s1Var;
                    } else {
                        int i = rVarA.c(128, "com.android.vending").versionCode;
                        s1Var = i;
                        if (i >= 80837300) {
                            z = true;
                            s1Var = i;
                        }
                    }
                    break;
                } catch (Exception e) {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.K.b(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                x0 x0Var3 = this.b.C;
                s1.m(x0Var3);
                return Log.isLoggable(x0Var3.F(), 3);
        }
    }

    public i1(i2 i2Var, s1 s1Var) {
        this.b = s1Var;
    }
}
