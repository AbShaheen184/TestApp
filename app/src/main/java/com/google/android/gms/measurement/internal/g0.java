package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final Object f = new Object();
    public final String a;
    public final y b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ g0(String str, Object obj, y yVar) {
        this.a = str;
        this.c = obj;
        this.b = yVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (g2.n == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (com.google.android.material.shape.g.q()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (g0 g0Var : h0.a) {
                        if (com.google.android.material.shape.g.q()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            y yVar = g0Var.b;
                            if (yVar != null) {
                                objA = yVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            g0Var.e = objA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                y yVar2 = this.b;
                if (yVar2 != null) {
                    try {
                        return yVar2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
