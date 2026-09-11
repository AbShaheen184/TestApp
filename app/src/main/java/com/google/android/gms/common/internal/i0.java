package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final Object g = new Object();
    public static i0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile com.google.android.gms.internal.base.g c;
    public final com.google.android.gms.common.stats.a d;
    public final long e;
    public final long f;

    public i0(Context context, Looper looper) {
        com.google.android.gms.cloudmessaging.k kVar = new com.google.android.gms.cloudmessaging.k(this, 1);
        this.b = context.getApplicationContext();
        com.google.android.gms.internal.base.g gVar = new com.google.android.gms.internal.base.g(looper, kVar);
        Looper.getMainLooper();
        this.c = gVar;
        this.d = com.google.android.gms.common.stats.a.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static i0 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new i0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final com.google.android.gms.common.b b(g0 g0Var, c0 c0Var, String str, Executor executor) {
        com.google.android.gms.common.b bVarA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                h0 h0Var = (h0) map.get(g0Var);
                if (executor == null) {
                    executor = null;
                }
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.e.put(c0Var, c0Var);
                    bVarA = h0Var.a(str, executor);
                    map.put(g0Var, h0Var);
                } else {
                    this.c.removeMessages(0, g0Var);
                    if (h0Var.e.containsKey(c0Var)) {
                        String string = g0Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    h0Var.e.put(c0Var, c0Var);
                    int i2 = h0Var.y;
                    if (i2 == 1) {
                        c0Var.onServiceConnected(h0Var.C, h0Var.A);
                    } else if (i2 == 2) {
                        bVarA = h0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (h0Var.z) {
                    return com.google.android.gms.common.b.C;
                }
                if (bVarA == null) {
                    bVarA = new com.google.android.gms.common.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        g0 g0Var = new g0(str, z);
        x.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                h0 h0Var = (h0) map.get(g0Var);
                if (h0Var == null) {
                    String string = g0Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!h0Var.e.containsKey(serviceConnection)) {
                    String string2 = g0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                h0Var.e.remove(serviceConnection);
                if (h0Var.e.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, g0Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
