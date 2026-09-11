package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends FutureTask implements Comparable {
    public final /* synthetic */ p1 A;
    public final long e;
    public final boolean y;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Callable callable, boolean z) {
        super(callable);
        this.A = p1Var;
        long andIncrement = p1.H.getAndIncrement();
        this.e = andIncrement;
        this.z = "Task exception on worker thread";
        this.y = z;
        if (andIncrement == Long.MAX_VALUE) {
            x0 x0Var = ((s1) p1Var.e).C;
            s1.m(x0Var);
            x0Var.C.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n1 n1Var = (n1) obj;
        boolean z = n1Var.y;
        boolean z2 = this.y;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = n1Var.e;
        long j2 = this.e;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        x0 x0Var = ((s1) this.A.e).C;
        s1.m(x0Var);
        x0Var.D.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        x0 x0Var = ((s1) this.A.e).C;
        s1.m(x0Var);
        x0Var.C.b(th, this.z);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.A = p1Var;
        long andIncrement = p1.H.getAndIncrement();
        this.e = andIncrement;
        this.z = str;
        this.y = z;
        if (andIncrement == Long.MAX_VALUE) {
            x0 x0Var = ((s1) p1Var.e).C;
            s1.m(x0Var);
            x0Var.C.a("Tasks index overflow");
        }
    }
}
