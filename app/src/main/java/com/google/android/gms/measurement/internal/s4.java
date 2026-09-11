package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.f6;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 implements h2 {
    public final f6 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public s4(AppMeasurementDynamiteService appMeasurementDynamiteService, f6 f6Var) {
        this.b = appMeasurementDynamiteService;
        this.a = f6Var;
    }

    @Override // com.google.android.gms.measurement.internal.h2
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.f(str, str2, bundle, j);
        } catch (RemoteException e) {
            s1 s1Var = this.b.d;
            if (s1Var != null) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.b(e, "Event listener threw exception");
            }
        }
    }
}
