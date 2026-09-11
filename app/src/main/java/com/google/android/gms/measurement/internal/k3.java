package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ o3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(o3 o3Var, s1 s1Var, int i) {
        super(s1Var);
        this.e = i;
        this.f = o3Var;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void a() {
        switch (this.e) {
            case 0:
                o3 o3Var = this.f;
                o3Var.v();
                if (o3Var.M()) {
                    x0 x0Var = ((s1) o3Var.e).C;
                    s1.m(x0Var);
                    x0Var.K.a("Inactivity, disconnecting from the service");
                    o3Var.D();
                    break;
                }
                break;
            default:
                x0 x0Var2 = ((s1) this.f.e).C;
                s1.m(x0Var2);
                x0Var2.F.a("Tasks have been queued for a long time");
                break;
        }
    }
}
