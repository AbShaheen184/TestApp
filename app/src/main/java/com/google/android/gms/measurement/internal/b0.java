package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d0 {
    public long A;
    public final androidx.collection.f y;
    public final androidx.collection.f z;

    public b0(s1 s1Var) {
        super(s1Var);
        this.z = new androidx.collection.f(0);
        this.y = new androidx.collection.f(0);
    }

    public final void A(String str, long j, c3 c3Var) {
        s1 s1Var = (s1) this.e;
        if (c3Var == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.K.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                x0 x0Var2 = s1Var.C;
                s1.m(x0Var2);
                x0Var2.K.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            r4.s0(c3Var, bundle, true);
            v2 v2Var = s1Var.J;
            s1.l(v2Var);
            v2Var.C("am", "_xu", bundle);
        }
    }

    public final void B(long j) {
        androidx.collection.f fVar = this.y;
        Iterator it = ((androidx.collection.c) fVar.keySet()).iterator();
        while (it.hasNext()) {
            fVar.put((String) it.next(), Long.valueOf(j));
        }
        if (fVar.isEmpty()) {
            return;
        }
        this.A = j;
    }

    public final void w(String str, long j) {
        s1 s1Var = (s1) this.e;
        if (str == null || str.length() == 0) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Ad unit id must be a non-empty string");
        } else {
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new a(this, str, j, 0));
        }
    }

    public final void x(String str, long j) {
        s1 s1Var = (s1) this.e;
        if (str == null || str.length() == 0) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Ad unit id must be a non-empty string");
        } else {
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new a(this, str, j, 1));
        }
    }

    public final void y(long j) {
        f3 f3Var = ((s1) this.e).I;
        s1.l(f3Var);
        c3 c3VarZ = f3Var.z(false);
        androidx.collection.f fVar = this.y;
        for (String str : (androidx.collection.c) fVar.keySet()) {
            A(str, j - ((Long) fVar.get(str)).longValue(), c3VarZ);
        }
        if (!fVar.isEmpty()) {
            z(j - this.A, c3VarZ);
        }
        B(j);
    }

    public final void z(long j, c3 c3Var) {
        s1 s1Var = (s1) this.e;
        if (c3Var == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.K.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.K.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            r4.s0(c3Var, bundle, true);
            v2 v2Var = s1Var.J;
            s1.l(v2Var);
            v2Var.C("am", "_xa", bundle);
        }
    }
}
