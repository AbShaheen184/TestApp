package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ z1 d;

    public /* synthetic */ x1(z1 z1Var, t4 t4Var, Bundle bundle, int i) {
        this.a = i;
        this.b = t4Var;
        this.c = bundle;
        this.d = z1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                z1 z1Var = this.d;
                z1Var.d.W();
                return z1Var.d.e0(this.c, this.b);
            default:
                z1 z1Var2 = this.d;
                z1Var2.d.W();
                return z1Var2.d.e0(this.c, this.b);
        }
    }
}
