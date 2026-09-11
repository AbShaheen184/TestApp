package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.b6;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ b6 y;
    public final /* synthetic */ AppMeasurementDynamiteService z;

    public /* synthetic */ q1(AppMeasurementDynamiteService appMeasurementDynamiteService, b6 b6Var, int i) {
        this.e = i;
        this.y = b6Var;
        this.z = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                o3 o3VarP = this.z.d.p();
                b6 b6Var = this.y;
                o3VarP.v();
                o3VarP.w();
                o3VarP.J(new androidx.core.provider.m(o3VarP, o3VarP.L(false), b6Var, 11, false));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.z;
                r4 r4Var = appMeasurementDynamiteService.d.F;
                s1.k(r4Var);
                s1 s1Var = appMeasurementDynamiteService.d;
                r4Var.n0(this.y, s1Var.V != null && s1Var.V.booleanValue());
                break;
        }
    }
}
