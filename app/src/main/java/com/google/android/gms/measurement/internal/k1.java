package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.y9;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ k1(l1 l1Var) {
        this.b = l1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return new y9(((l1) this.b).I);
            default:
                z1 z1Var = (z1) this.b;
                z1Var.d.W();
                b1 b1Var = z1Var.d.E;
                l4.U(b1Var);
                b1Var.v();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public k1(z1 z1Var, u uVar, String str) {
        this.b = z1Var;
    }
}
