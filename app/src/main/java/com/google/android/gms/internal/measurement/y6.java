package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y6 extends w6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Activity C;
    public final /* synthetic */ z6 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(z6 z6Var, Activity activity, int i) {
        super(z6Var.e, true);
        this.B = i;
        switch (i) {
            case 1:
                this.C = activity;
                this.D = z6Var;
                super(z6Var.e, true);
                break;
            case 2:
                this.C = activity;
                this.D = z6Var;
                super(z6Var.e, true);
                break;
            case 3:
                this.C = activity;
                this.D = z6Var;
                super(z6Var.e, true);
                break;
            case 4:
                this.C = activity;
                this.D = z6Var;
                super(z6Var.e, true);
                break;
            default:
                this.C = activity;
                this.D = z6Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.B) {
            case 0:
                z5 z5Var = this.D.e.f;
                com.google.android.gms.common.internal.x.g(z5Var);
                z5Var.onActivityStartedByScionActivityInfo(l6.d(this.C), this.y);
                break;
            case 1:
                z5 z5Var2 = this.D.e.f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.onActivityResumedByScionActivityInfo(l6.d(this.C), this.y);
                break;
            case 2:
                z5 z5Var3 = this.D.e.f;
                com.google.android.gms.common.internal.x.g(z5Var3);
                z5Var3.onActivityPausedByScionActivityInfo(l6.d(this.C), this.y);
                break;
            case 3:
                z5 z5Var4 = this.D.e.f;
                com.google.android.gms.common.internal.x.g(z5Var4);
                z5Var4.onActivityStoppedByScionActivityInfo(l6.d(this.C), this.y);
                break;
            default:
                z5 z5Var5 = this.D.e.f;
                com.google.android.gms.common.internal.x.g(z5Var5);
                z5Var5.onActivityDestroyedByScionActivityInfo(l6.d(this.C), this.y);
                break;
        }
    }
}
