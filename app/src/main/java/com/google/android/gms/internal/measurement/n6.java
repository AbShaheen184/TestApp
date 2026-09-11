package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n6 extends w6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Bundle E;
    public final /* synthetic */ a7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(a7 a7Var, String str, String str2, Bundle bundle, int i) {
        super(a7Var, true);
        this.B = i;
        switch (i) {
            case 1:
                this.C = str;
                this.D = str2;
                this.E = bundle;
                Objects.requireNonNull(a7Var);
                this.F = a7Var;
                super(a7Var, true);
                break;
            default:
                this.C = str;
                this.D = str2;
                this.E = bundle;
                this.F = a7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.B) {
            case 0:
                z5 z5Var = this.F.f;
                com.google.android.gms.common.internal.x.g(z5Var);
                z5Var.clearConditionalUserProperty(this.C, this.D, this.E);
                break;
            default:
                long j = this.e;
                long j2 = this.y;
                z5 z5Var2 = this.F.f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.logEventWithElapsedTime(this.C, this.D, this.E, true, true, j, j2);
                break;
        }
    }
}
