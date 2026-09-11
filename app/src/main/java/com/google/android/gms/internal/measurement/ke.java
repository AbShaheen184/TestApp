package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke implements com.google.common.util.concurrent.z {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xc b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ ke(xc xcVar, int i, ArrayList arrayList) {
        this.b = xcVar;
        this.d = i;
        this.c = arrayList;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.d;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) com.google.common.util.concurrent.n0.b((Future) this.c.get(i2))).booleanValue()) {
                        ((List) this.b.b).get(i2).getClass();
                        androidx.transition.k.i();
                        return null;
                    }
                }
                com.google.common.collect.h0 h0VarN = com.google.common.collect.h0.n(arrayList);
                com.google.common.util.concurrent.a0 a0Var = new com.google.common.util.concurrent.a0();
                com.google.common.util.concurrent.c0 c0Var = new com.google.common.util.concurrent.c0(h0VarN, true);
                c0Var.K = new com.google.common.util.concurrent.b0(c0Var, a0Var);
                c0Var.s();
                return c0Var;
            default:
                ArrayList arrayList2 = this.c;
                com.google.common.collect.h0 h0VarN2 = com.google.common.collect.h0.n(arrayList2);
                com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
                xc xcVar = this.b;
                nVar.y = xcVar;
                nVar.z = (m0) obj;
                nVar.e = this.d;
                nVar.A = arrayList2;
                j5 j5VarA = rf.a(nVar);
                Executor executor = (Executor) xcVar.c;
                com.google.common.util.concurrent.c0 c0Var2 = new com.google.common.util.concurrent.c0(h0VarN2, false);
                c0Var2.K = new com.google.common.util.concurrent.b0(c0Var2, j5VarA, executor);
                c0Var2.s();
                return c0Var2;
        }
    }

    public /* synthetic */ ke(xc xcVar, ArrayList arrayList, int i) {
        this.b = xcVar;
        this.c = arrayList;
        this.d = i;
    }
}
