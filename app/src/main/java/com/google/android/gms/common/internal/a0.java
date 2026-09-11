package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends com.google.android.gms.internal.base.g {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e eVar, Looper looper) {
        super(looper, 2);
        this.a = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        s sVar;
        e eVar = this.a;
        int i = eVar.T.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (sVar = (s) message.obj) != null) {
                synchronized (sVar) {
                    sVar.a = null;
                }
                e eVar2 = sVar.c;
                synchronized (eVar2.I) {
                    eVar2.I.remove(sVar);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !eVar.d()) {
            s sVar2 = (s) message.obj;
            if (sVar2 != null) {
                synchronized (sVar2) {
                    sVar2.a = null;
                }
                e eVar3 = sVar2.c;
                synchronized (eVar3.I) {
                    eVar3.I.remove(sVar2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            eVar.Q = new com.google.android.gms.common.b(message.arg2, null, null);
            if (!eVar.R && !TextUtils.isEmpty(eVar.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.u());
                    if (!eVar.R) {
                        eVar.y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.b bVar = eVar.Q;
            if (bVar == null) {
                bVar = new com.google.android.gms.common.b(8, null, null);
            }
            eVar.G.i(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            com.google.android.gms.common.b bVar2 = eVar.Q;
            if (bVar2 == null) {
                bVar2 = new com.google.android.gms.common.b(8, null, null);
            }
            eVar.G.i(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            eVar.G.i(new com.google.android.gms.common.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            eVar.y(5, null);
            b bVar3 = eVar.L;
            if (bVar3 != null) {
                bVar3.g(message.arg2);
            }
            System.currentTimeMillis();
            eVar.x(5, 1, null);
            return;
        }
        if (i4 == 2 && !eVar.h()) {
            s sVar3 = (s) message.obj;
            if (sVar3 != null) {
                synchronized (sVar3) {
                    sVar3.a = null;
                }
                e eVar4 = sVar3.c;
                synchronized (eVar4.I) {
                    eVar4.I.remove(sVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        s sVar4 = (s) message.obj;
        synchronized (sVar4) {
            try {
                bool = sVar4.a;
                if (sVar4.b) {
                    String string = sVar4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            e eVar5 = sVar4.f;
            int i6 = sVar4.d;
            if (i6 != 0) {
                eVar5.y(1, null);
                Bundle bundle = sVar4.e;
                sVar4.b(new com.google.android.gms.common.b(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!sVar4.a()) {
                eVar5.y(1, null);
                sVar4.b(new com.google.android.gms.common.b(8, null, null));
            }
        }
        synchronized (sVar4) {
            sVar4.b = true;
        }
        synchronized (sVar4) {
            sVar4.a = null;
        }
        e eVar6 = sVar4.c;
        synchronized (eVar6.I) {
            eVar6.I.remove(sVar4);
        }
    }
}
