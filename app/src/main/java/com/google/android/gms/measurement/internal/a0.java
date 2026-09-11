package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long y;
    public final /* synthetic */ d0 z;

    public a0(b0 b0Var, long j) {
        this.y = j;
        Objects.requireNonNull(b0Var);
        this.z = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((b0) this.z).B(this.y);
                break;
            default:
                f3 f3Var = (f3) this.z;
                b0 b0Var = ((s1) f3Var.e).K;
                s1.j(b0Var);
                b0Var.y(this.y);
                f3Var.B = null;
                break;
        }
    }

    public a0(f3 f3Var, long j) {
        this.y = j;
        Objects.requireNonNull(f3Var);
        this.z = f3Var;
    }
}
