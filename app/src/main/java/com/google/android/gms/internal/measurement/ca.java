package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ com.google.common.util.concurrent.y0 c;
    public final /* synthetic */ s5 d;
    public final /* synthetic */ Executor e;

    public ca(AtomicBoolean atomicBoolean, Context context, com.google.common.util.concurrent.y0 y0Var, s5 s5Var, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = y0Var;
        this.d = s5Var;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            com.google.common.util.concurrent.y0 y0Var = this.c;
            s5 s5Var = this.d;
            Executor executor = this.e;
            com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1();
            a1Var.F = new com.google.common.util.concurrent.z0(a1Var, s5Var);
            executor.execute(a1Var);
            y0Var.n(a1Var);
        }
    }
}
