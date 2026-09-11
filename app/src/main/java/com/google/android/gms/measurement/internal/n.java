package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static volatile com.google.android.gms.internal.base.g d;
    public final b2 a;
    public final com.google.common.util.concurrent.l0 b;
    public volatile long c;

    public n(b2 b2Var) {
        com.google.android.gms.common.internal.x.g(b2Var);
        this.a = b2Var;
        this.b = new com.google.common.util.concurrent.l0(9, this, b2Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            b2 b2Var = this.a;
            b2Var.c().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            b2Var.b().C.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        com.google.android.gms.internal.base.g gVar;
        if (d != null) {
            return d;
        }
        synchronized (n.class) {
            try {
                if (d == null) {
                    d = new com.google.android.gms.internal.base.g(this.a.f().getMainLooper(), 3);
                }
                gVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
