package okhttp3.internal.http2;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import okio.f0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements f0 {
    public final /* synthetic */ w A;
    public final boolean e;
    public final okio.f y = new okio.f();
    public boolean z;

    public t(w wVar, boolean z) {
        this.A = wVar;
        this.e = z;
    }

    @Override // okio.f0
    public final void E(okio.f fVar, long j) {
        TimeZone timeZone = okhttp3.internal.g.a;
        okio.f fVar2 = this.y;
        fVar2.E(fVar, j);
        while (fVar2.y >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        w wVar = this.A;
        synchronized (wVar) {
            wVar.H.i();
            while (wVar.A >= wVar.B && !this.e && !this.z && wVar.h() == null) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    wVar.H.m();
                    throw th;
                }
            }
            wVar.H.m();
            wVar.b();
            jMin = Math.min(wVar.B - wVar.A, this.y.y);
            wVar.A += jMin;
            z2 = z && jMin == this.y.y;
        }
        this.A.H.i();
        try {
            w wVar2 = this.A;
            wVar2.y.L(wVar2.e, z2, this.y, jMin);
        } finally {
            this.A.H.m();
        }
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.A;
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (wVar) {
            if (this.z) {
                return;
            }
            boolean z = wVar.h() == null;
            w wVar2 = this.A;
            if (!wVar2.F.e) {
                if (this.y.y > 0) {
                    while (this.y.y > 0) {
                        a(true);
                    }
                } else if (z) {
                    wVar2.y.L(wVar2.e, true, null, 0L);
                }
            }
            w wVar3 = this.A;
            synchronized (wVar3) {
                this.z = true;
                wVar3.notifyAll();
            }
            this.A.y.flush();
            this.A.a();
        }
    }

    @Override // okio.f0
    public final j0 e() {
        return this.A.H;
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() {
        w wVar = this.A;
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.y.y > 0) {
            a(false);
            this.A.y.flush();
        }
    }
}
