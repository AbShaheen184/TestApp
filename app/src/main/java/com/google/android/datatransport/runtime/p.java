package com.google.android.datatransport.runtime;

import android.os.Looper;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v2;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {
    public final /* synthetic */ int e;
    public final Object y;

    public p() {
        this.e = 3;
        com.google.android.gms.internal.base.g gVar = new com.google.android.gms.internal.base.g(Looper.getMainLooper());
        Looper.getMainLooper();
        this.y = gVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                ((Executor) this.y).execute(new o(0, runnable));
                break;
            case 1:
                ((com.google.android.gms.internal.base.g) this.y).post(runnable);
                break;
            case 2:
                p1 p1Var = ((s1) ((v2) this.y).e).D;
                s1.m(p1Var);
                p1Var.E(runnable);
                break;
            default:
                ((com.google.android.gms.internal.base.g) this.y).post(runnable);
                break;
        }
    }

    public /* synthetic */ p(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public p(Looper looper) {
        this.e = 1;
        this.y = new com.google.android.gms.internal.base.g(looper, 2);
    }
}
