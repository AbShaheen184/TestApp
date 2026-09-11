package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.common.util.concurrent.l0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ServiceConnection {
    public final ArrayDeque A;
    public final SparseArray B;
    public final /* synthetic */ n C;
    public int e = 0;
    public final Messenger y;
    public coil3.memory.c z;

    public l(n nVar) {
        this.C = nVar;
        com.google.android.gms.internal.base.g gVar = new com.google.android.gms.internal.base.g(Looper.getMainLooper(), new k(this, 0));
        Looper.getMainLooper();
        this.y = new Messenger(gVar);
        this.A = new ArrayDeque();
        this.B = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.e;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.e = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.e = 4;
            com.google.android.gms.common.stats.a.b().c((Context) this.C.y, this);
            androidx.compose.runtime.snapshots.g gVar = new androidx.compose.runtime.snapshots.g(str, securityException);
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                ((m) it.next()).b(gVar);
            }
            this.A.clear();
            int i2 = 0;
            while (true) {
                int size = this.B.size();
                SparseArray sparseArray = this.B;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((m) sparseArray.valueAt(i2)).b(gVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.e == 2 && this.A.isEmpty() && this.B.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.e = 3;
                com.google.android.gms.common.stats.a.b().c((Context) this.C.y, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(m mVar) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                this.A.add(mVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.A.add(mVar);
            ((ScheduledExecutorService) this.C.z).execute(new j(this, 0));
            return true;
        }
        this.A.add(mVar);
        if (this.e != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.e = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (com.google.android.gms.common.stats.a.b().a((Context) this.C.y, intent, this, 1)) {
                ((ScheduledExecutorService) this.C.z).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.C.z).execute(new l0(4, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.C.z).execute(new j(this, 2));
    }
}
