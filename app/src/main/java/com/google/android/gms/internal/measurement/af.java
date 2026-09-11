package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        f1 f1Var;
        Closeable closeable;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                f1Var = null;
            } else {
                weakHashMap2.put(th, (xe) weakHashMap2.get(cause2));
                f1Var = new f1(20);
            }
        }
        if (f1Var != null || (closeable = bf.c().b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = bf.c().b; closeable != null; closeable = ((we) closeable).e) {
            arrayList.add(closeable);
        }
        UUID uuid = ((we) ((qf) arrayList.get(0))).y;
        if (uuid == null) {
            com.google.gson.b.h("Null rootTraceId");
            return;
        }
        ((qf) arrayList.get(0)).getClass();
        com.google.common.collect.d0 d0VarL = com.google.common.collect.h0.l(arrayList.size());
        com.google.common.collect.d0 d0VarL2 = com.google.common.collect.h0.l(arrayList.size());
        for (qf qfVar : com.google.common.collect.q.r(arrayList)) {
            d0VarL2.b(((we) qfVar).A);
            d0VarL.b(qfVar.c());
        }
        WeakHashMap weakHashMap3 = a;
        synchronized (weakHashMap3) {
            try {
                com.google.common.collect.a1 a1VarG = d0VarL2.g();
                if (a1VarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                com.google.common.collect.a1 a1VarG2 = d0VarL.g();
                if (a1VarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new xe(a1VarG, a1VarG2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
