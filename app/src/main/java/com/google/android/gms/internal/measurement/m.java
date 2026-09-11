package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends w2 {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f;
    public static final AtomicLong g;
    public static final ConcurrentLinkedQueue h;
    public volatile w2 b;

    static {
        String str = Build.FINGERPRINT;
        c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        e = "eng".equals(str3) || "userdebug".equals(str3);
        f = new AtomicReference();
        g = new AtomicLong();
        h = new ConcurrentLinkedQueue();
    }

    public static void m() {
        while (true) {
            l lVar = (l) h.poll();
            if (lVar == null) {
                return;
            }
            g.getAndDecrement();
            m mVar = lVar.a;
            zf zfVar = lVar.b;
            dg dgVar = zfVar.c;
            if ((dgVar != null && Boolean.TRUE.equals(dgVar.k(cg.g))) || mVar.e(zfVar.a)) {
                mVar.f(zfVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final boolean e(Level level) {
        return this.b == null || this.b.e(level);
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void f(zf zfVar) {
        if (this.b != null) {
            this.b.f(zfVar);
            return;
        }
        if (g.incrementAndGet() > 20) {
            h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        h.offer(new l(this, zfVar));
        if (this.b != null) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void i(RuntimeException runtimeException, zf zfVar) {
        if (this.b != null) {
            this.b.i(runtimeException, zfVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
