package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ f3 y;

    public e3(f3 f3Var, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(f3Var);
                this.y = f3Var;
                break;
            default:
                Objects.requireNonNull(f3Var);
                this.y = f3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                f3 f3Var = this.y;
                f3Var.B = f3Var.G;
                break;
            default:
                this.y.G = null;
                break;
        }
    }
}
