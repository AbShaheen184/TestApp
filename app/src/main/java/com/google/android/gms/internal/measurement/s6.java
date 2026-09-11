package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 extends w6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ w5 C;
    public final /* synthetic */ a7 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(a7 a7Var, w5 w5Var, int i) {
        super(a7Var, true);
        this.B = i;
        switch (i) {
            case 1:
                this.C = w5Var;
                Objects.requireNonNull(a7Var);
                this.D = a7Var;
                super(a7Var, true);
                break;
            case 2:
                this.C = w5Var;
                Objects.requireNonNull(a7Var);
                this.D = a7Var;
                super(a7Var, true);
                break;
            default:
                this.C = w5Var;
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
                z5Var.getGmpAppId(this.C);
                break;
            case 1:
                z5 z5Var2 = this.D.f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.getCachedAppInstanceId(this.C);
                break;
            case 2:
                z5 z5Var3 = this.D.f;
                com.google.android.gms.common.internal.x.g(z5Var3);
                z5Var3.generateEventId(this.C);
                break;
            case 3:
                z5 z5Var4 = this.D.f;
                com.google.android.gms.common.internal.x.g(z5Var4);
                z5Var4.getCurrentScreenName(this.C);
                break;
            default:
                z5 z5Var5 = this.D.f;
                com.google.android.gms.common.internal.x.g(z5Var5);
                z5Var5.getCurrentScreenClass(this.C);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void b() {
        switch (this.B) {
            case 0:
                this.C.w(null);
                break;
            case 1:
                this.C.w(null);
                break;
            case 2:
                this.C.w(null);
                break;
            case 3:
                this.C.w(null);
                break;
            default:
                this.C.w(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(a7 a7Var, w5 w5Var, int i, boolean z) {
        super(a7Var, true);
        this.B = i;
        this.C = w5Var;
        this.D = a7Var;
    }
}
