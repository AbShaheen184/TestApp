package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.util.concurrent.l0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ l y;

    public /* synthetic */ j(l lVar, int i) {
        this.e = i;
        this.y = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                l lVar = this.y;
                synchronized (lVar) {
                    if (lVar.e == 1) {
                        lVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.y.a("Service disconnected");
                return;
        }
        while (true) {
            l lVar2 = this.y;
            synchronized (lVar2) {
                try {
                    if (lVar2.e != 2) {
                        return;
                    }
                    if (lVar2.A.isEmpty()) {
                        lVar2.c();
                        return;
                    }
                    m mVar = (m) lVar2.A.poll();
                    lVar2.B.put(mVar.a, mVar);
                    ((ScheduledExecutorService) lVar2.C.z).schedule(new l0(5, lVar2, mVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                    }
                    n nVar = lVar2.C;
                    Messenger messenger = lVar2.y;
                    int i = mVar.c;
                    Context context = (Context) nVar.y;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = mVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", mVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", mVar.d);
                    messageObtain.setData(bundle);
                    try {
                        coil3.memory.c cVar = lVar2.z;
                        Messenger messenger2 = (Messenger) cVar.y;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) cVar.z;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.e;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        lVar2.a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
