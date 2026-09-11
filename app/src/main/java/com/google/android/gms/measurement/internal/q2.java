package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ v2 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ f2 y;
    public final /* synthetic */ long z;

    public /* synthetic */ q2(v2 v2Var, f2 f2Var, long j, boolean z, int i) {
        this.e = i;
        this.y = f2Var;
        this.z = j;
        this.A = z;
        this.B = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                v2 v2Var = this.B;
                f2 f2Var = this.y;
                v2Var.V(f2Var);
                v2Var.L(f2Var, this.z, this.A);
                break;
            default:
                v2 v2Var2 = this.B;
                f2 f2Var2 = this.y;
                v2Var2.V(f2Var2);
                v2Var2.L(f2Var2, this.z, this.A);
                break;
        }
    }
}
