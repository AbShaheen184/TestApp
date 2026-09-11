package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends w6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ a7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(a7 a7Var, String str, int i) {
        super(a7Var, true);
        this.B = i;
        switch (i) {
            case 1:
                this.C = str;
                Objects.requireNonNull(a7Var);
                this.D = a7Var;
                super(a7Var, true);
                break;
            default:
                this.C = str;
                Objects.requireNonNull(a7Var);
                this.D = a7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.B) {
            case 0:
                z5 z5Var = this.D.f;
                com.google.android.gms.common.internal.x.g(z5Var);
                z5Var.beginAdUnitExposure(this.C, this.y);
                break;
            default:
                z5 z5Var2 = this.D.f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.endAdUnitExposure(this.C, this.y);
                break;
        }
    }
}
