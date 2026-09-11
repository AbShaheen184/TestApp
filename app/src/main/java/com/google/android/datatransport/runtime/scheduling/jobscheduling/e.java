package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.media3.exoplayer.t;
import com.appsalt.internal.j0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ Runnable A;
    public final /* synthetic */ j0 e;
    public final /* synthetic */ com.google.android.datatransport.runtime.i y;
    public final /* synthetic */ int z;

    public /* synthetic */ e(j0 j0Var, com.google.android.datatransport.runtime.i iVar, int i, Runnable runnable) {
        this.e = j0Var;
        this.y = iVar;
        this.z = i;
        this.A = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.datatransport.runtime.i iVar = this.y;
        int i = this.z;
        Runnable runnable = this.A;
        j0 j0Var = this.e;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var.f;
        try {
            com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var.c;
            Objects.requireNonNull(gVar2);
            gVar.L(new f(gVar2, 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) j0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                gVar.L(new t(j0Var, iVar, i));
            } else {
                j0Var.c(iVar, i);
            }
        } catch (com.google.android.datatransport.runtime.synchronization.a unused) {
            ((c) j0Var.d).t(iVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
