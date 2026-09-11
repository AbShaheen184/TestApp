package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends w6 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ a7 E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(a7 a7Var, l6 l6Var, String str, String str2) {
        super(a7Var, true);
        this.F = l6Var;
        this.C = str;
        this.D = str2;
        Objects.requireNonNull(a7Var);
        this.E = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.B) {
            case 0:
                z5 z5Var = this.E.f;
                com.google.android.gms.common.internal.x.g(z5Var);
                z5Var.getConditionalUserProperties(this.C, this.D, (w5) this.F);
                break;
            default:
                z5 z5Var2 = this.E.f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.setCurrentScreenByScionActivityInfo((l6) this.F, this.C, this.D, this.e);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public void b() {
        switch (this.B) {
            case 0:
                ((w5) this.F).w(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(a7 a7Var, String str, String str2, w5 w5Var) {
        super(a7Var, true);
        this.C = str;
        this.D = str2;
        this.F = w5Var;
        this.E = a7Var;
    }
}
