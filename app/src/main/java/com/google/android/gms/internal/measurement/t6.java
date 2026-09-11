package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends w6 {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ w5 E;
    public final /* synthetic */ a7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(a7 a7Var, String str, String str2, boolean z, w5 w5Var) {
        super(a7Var, true);
        this.B = str;
        this.C = str2;
        this.D = z;
        this.E = w5Var;
        this.F = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        z5 z5Var = this.F.f;
        com.google.android.gms.common.internal.x.g(z5Var);
        z5Var.getUserProperties(this.B, this.C, this.D, this.E);
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void b() {
        this.E.w(null);
    }
}
