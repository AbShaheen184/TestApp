package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ z1 e;

    public /* synthetic */ w1(z1 z1Var, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                z1 z1Var = this.e;
                z1Var.d.W();
                m mVar = z1Var.d.z;
                l4.U(mVar);
                return mVar.t0(this.b, this.c, this.d);
            case 1:
                z1 z1Var2 = this.e;
                z1Var2.d.W();
                m mVar2 = z1Var2.d.z;
                l4.U(mVar2);
                return mVar2.t0(this.b, this.c, this.d);
            case 2:
                z1 z1Var3 = this.e;
                z1Var3.d.W();
                m mVar3 = z1Var3.d.z;
                l4.U(mVar3);
                return mVar3.x0(this.b, this.c, this.d);
            default:
                z1 z1Var4 = this.e;
                z1Var4.d.W();
                m mVar4 = z1Var4.d.z;
                l4.U(mVar4);
                return mVar4.x0(this.b, this.c, this.d);
        }
    }
}
