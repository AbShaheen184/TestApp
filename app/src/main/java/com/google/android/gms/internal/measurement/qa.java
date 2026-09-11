package com.google.android.gms.internal.measurement;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements com.google.common.base.t {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.google.common.base.t y;

    public /* synthetic */ qa(com.google.common.base.t tVar, int i) {
        this.e = i;
        this.y = tVar;
    }

    @Override // com.google.common.base.t
    public final Object get() {
        int i = this.e;
        com.google.common.base.t tVar = this.y;
        switch (i) {
            case 0:
                Object obj = na.j;
                return (dd) ((com.google.common.base.h) tVar.get()).c();
            default:
                com.google.common.util.concurrent.w0 w0Var = (com.google.common.util.concurrent.w0) tVar.get();
                w0Var.getClass();
                com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1(u6.c);
                return new com.google.common.util.concurrent.u0(a1Var, w0Var.y.schedule(a1Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
