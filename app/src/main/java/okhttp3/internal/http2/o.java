package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Closeable {
    public static final a0 X;
    public int A;
    public int B;
    public boolean C;
    public final okhttp3.internal.concurrent.d D;
    public final okhttp3.internal.concurrent.c E;
    public final okhttp3.internal.concurrent.c F;
    public final okhttp3.internal.concurrent.c G;
    public final z H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public final c N;
    public final a0 O;
    public a0 P;
    public final okhttp3.internal.http2.flowcontrol.a Q;
    public long R;
    public long S;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c T;
    public final x U;
    public final com.app.mlounge.ui.screens.downloads.e V;
    public final LinkedHashSet W;
    public final m e;
    public final LinkedHashMap y = new LinkedHashMap();
    public final String z;

    static {
        a0 a0Var = new a0();
        a0Var.b(4, 65535);
        a0Var.b(5, 16384);
        X = a0Var;
    }

    public o(androidx.appcompat.widget.o oVar) {
        this.e = (m) oVar.e;
        String str = (String) oVar.d;
        if (str == null) {
            kotlin.jvm.internal.l.f("connectionName");
            throw null;
        }
        this.z = str;
        this.B = 3;
        okhttp3.internal.concurrent.d dVar = (okhttp3.internal.concurrent.d) oVar.b;
        this.D = dVar;
        okhttp3.internal.concurrent.c cVarD = dVar.d();
        this.E = cVarD;
        this.F = dVar.d();
        this.G = dVar.d();
        this.H = z.a;
        this.N = (c) oVar.f;
        a0 a0Var = new a0();
        a0Var.b(4, 16777216);
        this.O = a0Var;
        a0 a0Var2 = X;
        this.P = a0Var2;
        this.Q = new okhttp3.internal.http2.flowcontrol.a(0);
        this.S = a0Var2.a();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) oVar.c;
        if (cVar == null) {
            kotlin.jvm.internal.l.f("socket");
            throw null;
        }
        this.T = cVar;
        this.U = new x((okio.z) cVar.A);
        this.V = new com.app.mlounge.ui.screens.downloads.e(this, new s((okio.b0) cVar.z));
        this.W = new LinkedHashSet();
        int i = oVar.a;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            cVarD.d(new okhttp3.internal.concurrent.b(str.concat(" ping"), new androidx.compose.ui.text.platform.e(this, nanos, 1)), nanos);
        }
    }

    public final void L(int i, boolean z, okio.f fVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.U.g(z, i, fVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.R;
                            j3 = this.S;
                            if (j2 >= j3) {
                                if (!this.y.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.U.z);
                j4 = iMin;
                this.R += j4;
            }
            j -= j4;
            this.U.g(z && j == 0, i, fVar, iMin);
        }
    }

    public final void N(int i, b bVar) {
        okhttp3.internal.concurrent.c.c(this.E, this.z + '[' + i + "] writeSynReset", 0L, new com.app.mlounge.ui.screens.movies.f(this, i, bVar, 1), 6);
    }

    public final void X(final int i, final long j) {
        okhttp3.internal.concurrent.c.c(this.E, this.z + '[' + i + "] windowUpdate", 0L, new kotlin.jvm.functions.a() { // from class: okhttp3.internal.http2.i
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                o oVar = this.e;
                try {
                    oVar.U.X(i, j);
                } catch (IOException e) {
                    b bVar = b.PROTOCOL_ERROR;
                    oVar.a(bVar, bVar, e);
                }
                return kotlin.y.a;
            }
        }, 6);
    }

    public final void a(b bVar, b bVar2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = okhttp3.internal.g.a;
        try {
            w(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.y.isEmpty()) {
                array = null;
            } else {
                array = this.y.values().toArray(new w[0]);
                this.y.clear();
            }
        }
        w[] wVarArr = (w[]) array;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.e(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.U.close();
        } catch (IOException unused3) {
        }
        try {
            this.T.cancel();
        } catch (IOException unused4) {
        }
        this.E.g();
        this.F.g();
        this.G.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.NO_ERROR, b.CANCEL, null);
    }

    public final void flush() {
        this.U.flush();
    }

    public final w g(int i) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.y.get(Integer.valueOf(i));
        }
        return wVar;
    }

    public final w m(int i) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.y.remove(Integer.valueOf(i));
            notifyAll();
        }
        return wVar;
    }

    public final void w(b bVar) {
        synchronized (this.U) {
            synchronized (this) {
                if (this.C) {
                    return;
                }
                this.C = true;
                this.U.w(this.A, bVar, okhttp3.internal.e.a);
            }
        }
    }

    public final void z(long j) {
        synchronized (this) {
            try {
                okhttp3.internal.http2.flowcontrol.a.b(this.Q, j, 0L, 2);
                long jA = this.Q.a();
                if (jA >= this.O.a() / 2) {
                    X(0, jA);
                    okhttp3.internal.http2.flowcontrol.a.b(this.Q, 0L, jA, 1);
                }
                c cVar = this.N;
                okhttp3.internal.http2.flowcontrol.a aVar = this.Q;
                cVar.getClass();
                aVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
