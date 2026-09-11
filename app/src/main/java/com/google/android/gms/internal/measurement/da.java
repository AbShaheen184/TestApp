package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Serializable z;

    public /* synthetic */ da(Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.e = i;
        this.y = obj;
        this.z = serializable;
        this.A = obj2;
        this.B = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                com.google.common.util.concurrent.y0 y0Var = (com.google.common.util.concurrent.y0) this.y;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.z;
                Context context = (Context) this.A;
                ca caVar = (ca) this.B;
                if ((y0Var.e instanceof com.google.common.util.concurrent.d) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(caVar);
                    } catch (IllegalArgumentException e) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e);
                        return;
                    }
                    break;
                }
                break;
            default:
                s5 s5Var = sa.a;
                Level level = (Level) this.y;
                w2 w2Var = (w2) s5Var.y;
                boolean zE = w2Var.e(level);
                String str = (String) w2Var.a;
                ((i) d.a).getClass();
                n.b.a(str, level, zE);
                ((yf) ((yf) (!zE ? s5.B : new zf(s5Var, level)).c((Throwable) this.z)).a()).b((String) this.A, (Object[]) this.B);
                break;
        }
    }
}
