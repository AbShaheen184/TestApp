package com.google.android.gms.measurement.internal;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends j0 {
    public boolean A;
    public final androidx.media3.exoplayer.hls.c B;
    public final androidx.media3.exoplayer.source.r0 C;
    public final coil3.memory.c D;
    public com.google.android.gms.internal.base.g z;

    public w3(s1 s1Var) {
        super(s1Var);
        this.A = true;
        this.B = new androidx.media3.exoplayer.hls.c(this);
        androidx.media3.exoplayer.source.r0 r0Var = new androidx.media3.exoplayer.source.r0();
        r0Var.A = this;
        s1 s1Var2 = (s1) this.e;
        r0Var.z = new v3(r0Var, s1Var2, 0);
        s1Var2.H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        r0Var.e = jElapsedRealtime;
        r0Var.y = jElapsedRealtime;
        this.C = r0Var;
        this.D = new coil3.memory.c(this);
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final boolean y() {
        return false;
    }

    public final void z() {
        v();
        if (this.z == null) {
            this.z = new com.google.android.gms.internal.base.g(Looper.getMainLooper(), 3);
        }
    }
}
