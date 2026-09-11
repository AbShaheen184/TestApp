package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class na {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile na l = null;
    public static final com.google.common.base.t m = com.google.android.material.resources.c.n(f1.C);
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c a = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(7);
    public final Context b;
    public final com.google.common.base.t c;
    public final com.google.common.base.t d;
    public final com.google.common.base.t e;
    public final com.google.common.base.t f;
    public final ld g;
    public final com.google.common.base.t h;
    public final zc i;

    public na(Context context, com.google.common.base.t tVar, com.google.common.base.t tVar2, com.google.common.base.t tVar3, com.google.common.base.t tVar4, com.google.common.base.t tVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        tVar.getClass();
        tVar2.getClass();
        tVar3.getClass();
        tVar4.getClass();
        tVar5.getClass();
        com.google.common.base.t tVarN = com.google.android.material.resources.c.n(tVar);
        com.google.common.base.t tVarN2 = com.google.android.material.resources.c.n(tVar2);
        com.google.common.base.t tVarN3 = com.google.android.material.resources.c.n(new qa(tVar3, 0));
        com.google.common.base.t tVarN4 = com.google.android.material.resources.c.n(tVar4);
        com.google.common.base.t tVarN5 = com.google.android.material.resources.c.n(tVar5);
        this.b = applicationContext;
        this.c = tVarN;
        this.d = tVarN2;
        this.e = tVarN3;
        this.f = tVarN4;
        this.g = new ld(applicationContext, tVarN, tVarN4, tVarN2);
        this.h = tVarN5;
        this.i = new zc(applicationContext, tVarN, tVarN3, tVarN2);
    }

    public static void b() {
        synchronized (ea.c) {
        }
        if (k.get() == null && ea.d == null) {
            ea.d = new androidx.compose.runtime.snapshots.g(6);
        }
    }

    public final com.google.common.util.concurrent.w0 a() {
        return (com.google.common.util.concurrent.w0) this.c.get();
    }
}
