package com.google.firebase.concurrent;

import com.google.android.material.shape.c0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements g {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ TimeUnit C;
    public final /* synthetic */ int e;
    public final /* synthetic */ f y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ c(f fVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.e = i;
        this.y = fVar;
        this.z = runnable;
        this.A = j;
        this.B = j2;
        this.C = timeUnit;
    }

    @Override // com.google.firebase.concurrent.g
    public final ScheduledFuture a(c0 c0Var) {
        switch (this.e) {
            case 0:
                f fVar = this.y;
                return fVar.y.scheduleAtFixedRate(new d(fVar, this.z, c0Var, 0), this.A, this.B, this.C);
            default:
                f fVar2 = this.y;
                return fVar2.y.scheduleWithFixedDelay(new d(fVar2, this.z, c0Var, 2), this.A, this.B, this.C);
        }
    }
}
