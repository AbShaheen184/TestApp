package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ pc y;
    public final /* synthetic */ com.google.common.util.concurrent.t z;

    public /* synthetic */ lc(pc pcVar, com.google.common.util.concurrent.t tVar, int i) {
        this.e = i;
        this.y = pcVar;
        this.z = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[Catch: CancellationException -> 0x0024, ExecutionException -> 0x0027, TryCatch #4 {CancellationException -> 0x0024, ExecutionException -> 0x0027, blocks: (B:5:0x0009, B:7:0x001f, B:20:0x0033, B:22:0x0044, B:24:0x0050, B:30:0x0062, B:32:0x0066, B:14:0x002a, B:35:0x00a0), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: CancellationException -> 0x0024, ExecutionException -> 0x0027, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0024, ExecutionException -> 0x0027, blocks: (B:5:0x0009, B:7:0x001f, B:20:0x0033, B:22:0x0044, B:24:0x0050, B:30:0x0062, B:32:0x0066, B:14:0x002a, B:35:0x00a0), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.compose.material.ripple.g gVar;
        com.google.common.collect.f1 f1Var;
        com.google.common.collect.f1 f1Var2;
        dd ddVar;
        switch (this.e) {
            case 0:
                pc pcVar = this.y;
                try {
                    com.google.common.util.concurrent.n0.b(this.z);
                    return;
                } catch (Exception e) {
                    String str = pcVar.c;
                    Log.w("FlagStore", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e);
                    return;
                }
            default:
                pc pcVar2 = this.y;
                try {
                    id idVar = (id) com.google.common.util.concurrent.n0.b(this.z);
                    androidx.compose.material.ripple.g gVar2 = new androidx.compose.material.ripple.g(idVar, new androidx.core.view.r(6, 2));
                    boolean z = pcVar2.e;
                    if (z || (gVar = pcVar2.a) == null) {
                        synchronized (pcVar2) {
                            if (!z) {
                                gVar = pcVar2.a;
                                if (gVar != null) {
                                    f1Var = (com.google.common.collect.f1) gVar.d;
                                    f1Var2 = (com.google.common.collect.f1) gVar2.d;
                                    f1Var.getClass();
                                    if (!com.google.common.collect.q.i(f1Var2, f1Var)) {
                                        ddVar = (dd) pcVar2.b.e.get();
                                        if (ddVar != null) {
                                            ddVar.a();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            pcVar2.a = gVar2;
                            ((AtomicInteger) pcVar2.g.y).incrementAndGet();
                        }
                    } else {
                        f1Var = (com.google.common.collect.f1) gVar.d;
                        f1Var2 = (com.google.common.collect.f1) gVar2.d;
                        f1Var.getClass();
                        if (!com.google.common.collect.q.i(f1Var2, f1Var)) {
                            ddVar = (dd) pcVar2.b.e.get();
                            if (ddVar != null) {
                                ddVar.a();
                                return;
                            }
                            return;
                        }
                    }
                    if (pcVar2.e) {
                        na naVar = pcVar2.b;
                        eb ebVar = (eb) naVar.d.get();
                        String strU = idVar.u();
                        ebVar.getClass();
                        strU.getClass();
                        com.google.common.util.concurrent.a aVarB = eb.b(ebVar.a.c(strU));
                        nc ncVar = new nc(pcVar2, 0);
                        com.google.common.util.concurrent.w0 w0VarA = naVar.a();
                        int i = com.google.common.util.concurrent.c.I;
                        com.google.common.util.concurrent.b bVar = new com.google.common.util.concurrent.b(aVarB, Throwable.class, ncVar);
                        aVarB.a(bVar, com.google.android.material.resources.g.m(w0VarA, bVar));
                        return;
                    }
                    return;
                } catch (CancellationException e2) {
                    e = e2;
                    if (e.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str2 = pcVar2.c;
                    Log.w("FlagStore", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    if (e.getCause() instanceof SecurityException) {
                        String str3 = pcVar2.c;
                        Log.w("FlagStore", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(String.valueOf(str3).length() + 64), "Unable to update local snapshot for ", str3, ", may result in stale flags."), e);
                        return;
                    }
                    return;
                }
        }
    }
}
