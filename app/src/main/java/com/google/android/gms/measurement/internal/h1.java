package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.r5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ServiceConnection {
    public final String e;
    public final /* synthetic */ i1 y;

    public h1(i1 i1Var, String str) {
        Objects.requireNonNull(i1Var);
        this.y = i1Var;
        this.e = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i1 i1Var = this.y;
        if (iBinder == null) {
            x0 x0Var = i1Var.b.C;
            s1.m(x0Var);
            x0Var.F.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = q5.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            r5 p5Var = iInterfaceQueryLocalInterface instanceof r5 ? (r5) iInterfaceQueryLocalInterface : new p5(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            s1 s1Var = i1Var.b;
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.K.a("Install Referrer Service connected");
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new com.google.common.util.concurrent.l0(this, p5Var, this));
        } catch (RuntimeException e) {
            x0 x0Var3 = i1Var.b.C;
            s1.m(x0Var3);
            x0Var3.F.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        x0 x0Var = this.y.b.C;
        s1.m(x0Var);
        x0Var.K.a("Install Referrer Service disconnected");
    }
}
