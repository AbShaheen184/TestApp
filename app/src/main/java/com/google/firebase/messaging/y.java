package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements ServiceConnection {
    public final ArrayDeque A;
    public w B;
    public boolean C;
    public final Context e;
    public final Intent y;
    public final ScheduledThreadPoolExecutor z;

    public y(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.a("Firebase-FirebaseInstanceIdServiceConnection", 0));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A = new ArrayDeque();
        this.C = false;
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.y = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.z = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.A.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                w wVar = this.B;
                if (wVar == null || !wVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.B.a((x) this.A.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized com.google.android.gms.tasks.q b(Intent intent) {
        x xVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            xVar = new x(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.z;
            xVar.b.a.a(scheduledThreadPoolExecutor, new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(scheduledThreadPoolExecutor.schedule(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(xVar, 9), 20L, TimeUnit.SECONDS), 10));
            this.A.add(xVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return xVar.b.a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.C);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.C) {
            return;
        }
        this.C = true;
        try {
            if (com.google.android.gms.common.stats.a.b().a(this.e, this.y, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.A;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((x) arrayDeque.poll()).b.d(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.C = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.C = false;
            if (iBinder instanceof w) {
                this.B = (w) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.A;
            while (!arrayDeque.isEmpty()) {
                ((x) arrayDeque.poll()).b.d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
