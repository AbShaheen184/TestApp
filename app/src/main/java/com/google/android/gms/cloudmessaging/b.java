package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.z0;
import androidx.collection.y0;
import androidx.compose.animation.core.u2;
import com.google.android.gms.tasks.q;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final u2 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public g g;
    public final y0 a = new y0(0);
    public final Messenger e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.b = context;
        this.c = new u2(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    public final q a(Bundle bundle) {
        String string;
        int iX;
        Context context;
        synchronized (b.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        synchronized (this.a) {
            this.a.put(string, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.x() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context2, 0, intent2, com.google.android.gms.internal.cloudmessaging.a.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f == null && this.g == null) {
            iX = this.c.x();
            context = this.b;
            if (iX == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.g.e;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iX = this.c.x();
                context = this.b;
                if (iX == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        jVar.a.a(h.z, new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(1, this, string, this.d.schedule(new z0(jVar, 12), 30L, TimeUnit.SECONDS)));
        return jVar.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.a.remove(str);
                if (jVar != null) {
                    jVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
