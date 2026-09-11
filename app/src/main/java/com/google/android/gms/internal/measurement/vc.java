package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ vc(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.e) {
            case 0:
                throw new RuntimeException(((ExecutionException) this.y).getCause());
            case 1:
                try {
                    com.google.common.util.concurrent.n0.b((ListenableFuture) this.y);
                    return;
                } catch (ExecutionException e) {
                    ka.g().post(new vc(e, 0));
                    return;
                }
            case 2:
                try {
                    com.google.common.util.concurrent.n0.b((com.google.common.util.concurrent.h0) this.y);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 3:
                if (((Boolean) ((bd) this.y).c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    com.google.common.util.concurrent.n0.b((com.google.common.util.concurrent.i0) this.y);
                    return;
                } catch (Exception e3) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e3);
                        return;
                    }
                    return;
                }
        }
    }
}
