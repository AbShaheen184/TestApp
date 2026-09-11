package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okio.h0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h0 {
    public boolean B;
    public final /* synthetic */ w C;
    public final long e;
    public boolean y;
    public final okio.f z = new okio.f();
    public final okio.f A = new okio.f();

    public u(w wVar, long j, boolean z) {
        this.C = wVar;
        this.e = j;
        this.y = z;
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) throws Throwable {
        boolean z;
        Throwable b0Var;
        long jK;
        fVar.getClass();
        long j2 = 0;
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            w wVar = this.C;
            synchronized (wVar) {
                wVar.y.getClass();
                t tVar = wVar.F;
                z = true;
                boolean z2 = tVar.z || tVar.e;
                if (z2) {
                    wVar.G.i();
                }
                try {
                    if (wVar.h() == null || this.y) {
                        b0Var = null;
                    } else {
                        b0Var = wVar.J;
                        if (b0Var == null) {
                            b bVarH = wVar.h();
                            bVarH.getClass();
                            b0Var = new b0(bVarH);
                        }
                    }
                    if (this.B) {
                        throw new IOException("stream closed");
                    }
                    okio.f fVar2 = this.A;
                    long j3 = fVar2.y;
                    if (j3 > j2) {
                        jK = fVar2.K(fVar, Math.min(j, j3));
                        okhttp3.internal.http2.flowcontrol.a.b(wVar.z, jK, 0L, 2);
                        long jA = wVar.z.a();
                        if (b0Var == null && jA >= wVar.y.O.a() / 2) {
                            wVar.y.X(wVar.e, jA);
                            okhttp3.internal.http2.flowcontrol.a.b(wVar.z, 0L, jA, 1);
                        }
                        z = false;
                    } else {
                        if (this.y || b0Var != null) {
                            z = false;
                        } else {
                            try {
                                wVar.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jK = -1;
                    }
                    if (z2) {
                        wVar.G.m();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        wVar.G.m();
                    }
                    throw th;
                }
            }
            this.C.y.N.getClass();
            if (!z) {
                if (jK != -1) {
                    return jK;
                }
                if (b0Var == null) {
                    return -1L;
                }
                throw b0Var;
            }
            j2 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        w wVar = this.C;
        synchronized (wVar) {
            this.B = true;
            okio.f fVar = this.A;
            j = fVar.y;
            fVar.a();
            wVar.notifyAll();
        }
        if (j > 0) {
            w wVar2 = this.C;
            TimeZone timeZone = okhttp3.internal.g.a;
            wVar2.y.z(j);
        }
        this.C.a();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.C.G;
    }
}
