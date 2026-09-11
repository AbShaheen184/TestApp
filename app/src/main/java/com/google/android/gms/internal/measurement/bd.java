package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class bd implements dd {
    public static boolean d;
    public final com.google.common.base.t a;
    public final int b;
    public final f1 c;

    public bd(com.google.common.base.t tVar) {
        f1 f1Var = f1.D;
        this.a = tVar;
        this.b = Math.max(5, 10);
        this.c = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.dd
    public final void a() {
        synchronized (bd.class) {
            try {
                if (!d) {
                    vc vcVar = new vc(this, 3);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    com.google.common.util.concurrent.w0 w0Var = (com.google.common.util.concurrent.w0) this.a.get();
                    ad adVar = new ad(this, vcVar, w0Var, j);
                    w0Var.getClass();
                    com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1(Executors.callable(adVar, null));
                    com.google.common.util.concurrent.u0 u0Var = new com.google.common.util.concurrent.u0(a1Var, w0Var.y.schedule(a1Var, j, timeUnit));
                    u0Var.a(new vc(u0Var, 1), com.google.common.util.concurrent.d0.e);
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
