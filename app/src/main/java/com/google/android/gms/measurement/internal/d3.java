package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ f3 B;
    public final /* synthetic */ c3 e;
    public final /* synthetic */ c3 y;
    public final /* synthetic */ long z;

    public d3(f3 f3Var, c3 c3Var, c3 c3Var2, long j, boolean z) {
        this.e = c3Var;
        this.y = c3Var2;
        this.z = j;
        this.A = z;
        this.B = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.B(this.e, this.y, this.z, this.A, null);
    }
}
