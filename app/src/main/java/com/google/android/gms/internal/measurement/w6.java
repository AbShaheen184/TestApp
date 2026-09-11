package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w6 implements Runnable {
    public final /* synthetic */ a7 A;
    public final long e;
    public final long y;
    public final boolean z;

    public w6(a7 a7Var, boolean z) {
        Objects.requireNonNull(a7Var);
        this.A = a7Var;
        this.e = System.currentTimeMillis();
        this.y = SystemClock.elapsedRealtime();
        this.z = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        a7 a7Var = this.A;
        if (a7Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            a7Var.b(e, false, this.z);
            b();
        }
    }

    public void b() {
    }
}
