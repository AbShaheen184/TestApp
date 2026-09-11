package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler implements Runnable {
    public i A;
    public IOException B;
    public int C;
    public Thread D;
    public boolean E;
    public volatile boolean F;
    public final /* synthetic */ n G;
    public final int e;
    public final k y;
    public final long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i, long j) {
        super(looper);
        this.G = nVar;
        this.y = kVar;
        this.A = iVar;
        this.e = i;
        this.z = j;
    }

    public final void a(boolean z) {
        this.F = z;
        this.B = null;
        if (hasMessages(1)) {
            this.E = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.E = true;
                    this.y.e();
                    Thread thread = this.D;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.G.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.A;
            iVar.getClass();
            iVar.w(this.y, jElapsedRealtime, jElapsedRealtime - this.z, true);
            this.A = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.z;
        i iVar = this.A;
        iVar.getClass();
        iVar.m(this.y, jElapsedRealtime, j, this.C);
        this.B = null;
        n nVar = this.G;
        androidx.media3.exoplayer.util.a aVar = nVar.a;
        j jVar = nVar.b;
        jVar.getClass();
        aVar.execute(jVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.F) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.G.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.z;
        i iVar = this.A;
        iVar.getClass();
        if (this.E) {
            iVar.w(this.y, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                iVar.s(this.y, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                androidx.media3.common.util.c.g("LoadTask", "Unexpected exception handling load completed", e);
                this.G.c = new m(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.B = iOException;
        int i3 = this.C + 1;
        this.C = i3;
        h hVarE = iVar.e(this.y, jElapsedRealtime, j, iOException, i3);
        int i4 = hVarE.a;
        if (i4 == 3) {
            this.G.c = this.B;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.C = 1;
            }
            long jMin = hVarE.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.C - 1) * 1000, 5000);
            }
            n nVar = this.G;
            com.google.android.material.motion.a.q(nVar.b == null);
            nVar.b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.E;
                this.D = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.y.getClass().getSimpleName()));
                try {
                    this.y.c();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.D = null;
                Thread.interrupted();
            }
            if (this.F) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.F) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.F) {
                return;
            }
            androidx.media3.common.util.c.g("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new m(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.F) {
                return;
            }
            androidx.media3.common.util.c.g("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new m(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.F) {
                androidx.media3.common.util.c.g("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
