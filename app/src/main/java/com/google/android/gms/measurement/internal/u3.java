package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 implements Runnable {
    public final long e;
    public final long y;
    public final /* synthetic */ coil3.memory.c z;

    public u3(coil3.memory.c cVar, long j, long j2) {
        Objects.requireNonNull(cVar);
        this.z = cVar;
        this.e = j;
        this.y = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1 p1Var = ((s1) ((w3) this.z.z).e).D;
        s1.m(p1Var);
        p1Var.E(new androidx.appcompat.widget.z0(this, 21));
    }
}
