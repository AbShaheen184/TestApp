package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public t1(l4 l4Var, t4 t4Var) {
        this.a = 2;
        this.c = t4Var;
        Objects.requireNonNull(l4Var);
        this.b = l4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.a) {
            case 0:
                z1 z1Var = (z1) this.b;
                z1Var.d.W();
                m mVar = z1Var.d.z;
                l4.U(mVar);
                return mVar.s0((String) this.c);
            case 1:
                z1 z1Var2 = (z1) this.b;
                z1Var2.d.W();
                return new i(z1Var2.d.q0(((t4) this.c).e));
            default:
                t4 t4Var = (t4) this.c;
                String str = t4Var.e;
                com.google.android.gms.common.internal.x.g(str);
                l4 l4Var = (l4) this.b;
                f2 f2VarD = l4Var.d(str);
                e2 e2Var = e2.ANALYTICS_STORAGE;
                if (f2VarD.i(e2Var) && f2.c(100, t4Var.P).i(e2Var)) {
                    return l4Var.d0(t4Var).F();
                }
                l4Var.b().K.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ t1(z1 z1Var, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = z1Var;
    }
}
