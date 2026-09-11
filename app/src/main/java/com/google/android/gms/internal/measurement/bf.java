package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bf {
    public static final AtomicReference a;
    public static final f1 b;
    public static final WeakHashMap c;
    public static final androidx.compose.ui.platform.q0 d;

    static {
        com.google.common.collect.k0.k(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(com.google.common.collect.h1.G);
        b = new f1(17);
        c = new WeakHashMap();
        d = new androidx.compose.ui.platform.q0(3);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static qf a() {
        pf pfVarC = c();
        qf qfVar = pfVarC.b;
        if (qfVar != null && qfVar != hf.D) {
            return qfVar;
        }
        androidx.compose.runtime.snapshots.g gVar = ff.D;
        UUID uuidB = cf.c.b();
        String strA = we.a(uuidB);
        com.google.common.collect.k0 k0Var = (com.google.common.collect.k0) a.get();
        if (!k0Var.isEmpty()) {
            k0Var.forEach(new ef(0));
        }
        return new ff(uuidB, strA, ff.D, pfVarC);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    public static qf b(pf pfVar, qf qfVar) {
        boolean zEquals;
        pfVar.getClass();
        qf qfVar2 = pfVar.b;
        if (qfVar2 != qfVar) {
            if (qfVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zEquals = Trace.isEnabled();
                } else {
                    nd.a.getClass();
                    b.getClass();
                    String str = "false";
                    try {
                        str = (String) od.a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    zEquals = str.equals("true");
                }
                pfVar.a = zEquals;
            }
            if (pfVar.a) {
                if (qfVar2 != null) {
                    if (qfVar != null) {
                        if (((we) qfVar2).e == qfVar && !e1.g(qfVar2)) {
                            Trace.endSection();
                        } else if (qfVar2 == ((we) qfVar).e && !e1.g(qfVar)) {
                            e1.h(qfVar);
                        }
                    }
                    e1.f(qfVar2);
                    if (qfVar != null) {
                        e1.e(qfVar);
                    }
                } else if (qfVar != null) {
                    e1.e(qfVar);
                }
            }
            if (qfVar2 != qfVar) {
                pfVar.b = qfVar;
                return qfVar2;
            }
        }
        return qfVar;
    }

    public static pf c() {
        return (pf) d.get();
    }
}
