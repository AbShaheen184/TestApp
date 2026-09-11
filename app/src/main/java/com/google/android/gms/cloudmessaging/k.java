package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.g0;
import com.google.android.gms.common.internal.h0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Handler.Callback {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ k(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.e) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                l lVar = (l) this.y;
                synchronized (lVar) {
                    try {
                        m mVar = (m) lVar.B.get(i);
                        if (mVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        lVar.B.remove(i);
                        lVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mVar.b(new androidx.compose.runtime.snapshots.g("Not supported by GmsCore", (Throwable) null));
                            return true;
                        }
                        switch (mVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    mVar.c(null);
                                    return true;
                                }
                                mVar.b(new androidx.compose.runtime.snapshots.g("Invalid response to one way request", (Throwable) null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                mVar.c(bundle);
                                return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return false;
                    }
                    i0 i0Var = (i0) this.y;
                    synchronized (i0Var.a) {
                        try {
                            g0 g0Var = (g0) message.obj;
                            h0 h0Var = (h0) i0Var.a.get(g0Var);
                            if (h0Var != null && h0Var.y == 3) {
                                String strValueOf = String.valueOf(g0Var);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(strValueOf);
                                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName = h0Var.C;
                                if (componentName == null) {
                                    g0Var.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = g0Var.b;
                                    x.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                h0Var.onServiceDisconnected(componentName);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                } else {
                    i0 i0Var2 = (i0) this.y;
                    synchronized (i0Var2.a) {
                        try {
                            g0 g0Var2 = (g0) message.obj;
                            h0 h0Var2 = (h0) i0Var2.a.get(g0Var2);
                            if (h0Var2 != null && h0Var2.e.isEmpty()) {
                                if (h0Var2.z) {
                                    g0 g0Var3 = h0Var2.B;
                                    i0 i0Var3 = h0Var2.D;
                                    i0Var3.c.removeMessages(1, g0Var3);
                                    i0Var3.d.c(i0Var3.b, h0Var2);
                                    h0Var2.z = false;
                                    h0Var2.y = 2;
                                }
                                i0Var2.a.remove(g0Var2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return true;
            default:
                if (message.what != 0) {
                    return false;
                }
                coil3.i iVar = (coil3.i) this.y;
                if (message.obj != null) {
                    androidx.transition.k.i();
                    return false;
                }
                synchronized (iVar.a) {
                    try {
                        throw null;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
        }
    }
}
