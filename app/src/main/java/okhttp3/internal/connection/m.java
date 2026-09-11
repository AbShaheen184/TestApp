package okhttp3.internal.connection;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Cloneable {
    public final androidx.compose.ui.graphics.vector.a A;
    public final l B;
    public final AtomicBoolean C;
    public Object D;
    public g E;
    public n F;
    public boolean G;
    public b1 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public volatile boolean N;
    public volatile b1 O;
    public final CopyOnWriteArrayList P;
    public final y e;
    public final b0 y;
    public final boolean z;

    public m(y yVar, b0 b0Var, boolean z) {
        yVar.getClass();
        b0Var.getClass();
        this.e = yVar;
        this.y = b0Var;
        this.z = z;
        this.A = (androidx.compose.ui.graphics.vector.a) yVar.F.e;
        yVar.d.getClass();
        l lVar = new l(this);
        lVar.g(yVar.w, TimeUnit.MILLISECONDS);
        this.B = lVar;
        this.C = new AtomicBoolean();
        this.M = true;
        this.P = new CopyOnWriteArrayList();
        new AtomicReference(b0Var.e);
    }

    public static final String a(m mVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.N ? "canceled " : "");
        sb.append(mVar.z ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mVar.y.a.h());
        return sb.toString();
    }

    public final void b(n nVar) {
        nVar.getClass();
        TimeZone timeZone = okhttp3.internal.g.a;
        if (this.F != null) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
        } else {
            this.F = nVar;
            nVar.q.add(new k(this, this.D));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        TimeZone timeZone = okhttp3.internal.g.a;
        n nVar = this.F;
        if (nVar != null) {
            synchronized (nVar) {
                socketJ = j();
            }
            if (this.F == null) {
                if (socketJ != null) {
                    okhttp3.internal.g.c(socketJ);
                }
            } else if (socketJ != null) {
                net.luminis.tls.engine.impl.c.r("Check failed.");
                return null;
            }
        }
        if (!this.G && this.B.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final void cancel() {
        if (this.N) {
            return;
        }
        this.N = true;
        b1 b1Var = this.O;
        if (b1Var != null) {
            ((okhttp3.internal.http.e) b1Var.A).cancel();
        }
        Iterator it = this.P.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((r) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new m(this.e, this.y, this.z);
    }

    public final void d(okhttp3.h hVar) {
        if (!this.C.compareAndSet(false, true)) {
            net.luminis.tls.engine.impl.c.r("Already Executed");
            return;
        }
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        this.D = okhttp3.internal.platform.e.a.g();
        com.google.firebase.messaging.o oVar = this.e.a;
        j jVar = new j(this, hVar);
        oVar.getClass();
        com.google.firebase.messaging.o.C(oVar, jVar, null, null, 6);
    }

    public final g0 e() {
        if (!this.C.compareAndSet(false, true)) {
            net.luminis.tls.engine.impl.c.r("Already Executed");
            return null;
        }
        this.B.i();
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        this.D = okhttp3.internal.platform.e.a.g();
        try {
            com.google.firebase.messaging.o oVar = this.e.a;
            synchronized (oVar) {
                ((ArrayDeque) oVar.A).add(this);
            }
            g0 g0VarG = g();
            com.google.firebase.messaging.o oVar2 = this.e.a;
            oVar2.getClass();
            com.google.firebase.messaging.o.C(oVar2, null, this, null, 5);
            return g0VarG;
        } catch (Throwable th) {
            com.google.firebase.messaging.o oVar3 = this.e.a;
            oVar3.getClass();
            com.google.firebase.messaging.o.C(oVar3, null, this, null, 5);
            throw th;
        }
    }

    public final void f(boolean z) {
        b1 b1Var;
        synchronized (this) {
            if (!this.M) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (b1Var = this.O) != null) {
            ((okhttp3.internal.http.e) b1Var.A).cancel();
            ((m) b1Var.y).h(b1Var, true, true, true, true, null);
        }
        this.H = null;
    }

    public final g0 g() {
        ArrayList arrayList = new ArrayList();
        kotlin.collections.o.C(arrayList, this.e.b);
        arrayList.add(new okhttp3.internal.cache.b(this.e));
        arrayList.add(new okhttp3.internal.cache.b(this.e.j));
        arrayList.add(new okhttp3.internal.cache.b(this.e.k));
        arrayList.add(a.a);
        if (!this.z) {
            kotlin.collections.o.C(arrayList, this.e.c);
        }
        arrayList.add(okhttp3.internal.http.b.a);
        b0 b0Var = this.y;
        y yVar = this.e;
        try {
            try {
                g0 g0VarF = new u(this, arrayList, 0, null, b0Var, yVar.x, yVar.y, yVar.z).f(this.y);
                if (this.N) {
                    okhttp3.internal.e.b(g0VarF);
                    throw new IOException("Canceled");
                }
                i(null);
                return g0VarF;
            } catch (IOException e) {
                IOException iOExceptionI = i(e);
                iOExceptionI.getClass();
                throw iOExceptionI;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004d  */
    public final IOException h(b1 b1Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        b1Var.getClass();
        if (b1Var.equals(this.O)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.I) {
                            if (z) {
                                this.I = false;
                            }
                            if (z2) {
                                this.J = false;
                            }
                            if (z4) {
                                this.K = false;
                            }
                            if (z3) {
                                this.L = false;
                            }
                            if (this.I) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.J) || ((z4 && this.K) || (z3 && this.L))) {
                            if (z) {
                                this.I = false;
                            }
                            if (z2) {
                                this.J = false;
                            }
                            if (z4) {
                                this.K = false;
                            }
                            if (z3) {
                                this.L = false;
                            }
                            if (this.I || this.J || this.K || this.L) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.M) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.O = null;
                n nVar = this.F;
                if (nVar != null) {
                    synchronized (nVar) {
                        nVar.n++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.M) {
                this.M = false;
                if (!this.I && !this.J && !this.K && !this.L) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket j() {
        n nVar = this.F;
        nVar.getClass();
        TimeZone timeZone = okhttp3.internal.g.a;
        ArrayList arrayList = nVar.q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.l.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            net.luminis.tls.engine.impl.c.r("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.F = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        nVar.r = System.nanoTime();
        androidx.compose.ui.graphics.vector.a aVar = this.A;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) aVar.e;
        okhttp3.internal.concurrent.c cVar = (okhttp3.internal.concurrent.c) aVar.c;
        TimeZone timeZone2 = okhttp3.internal.g.a;
        if (!nVar.k) {
            cVar.d((okhttp3.internal.cache.f) aVar.d, 0L);
            return null;
        }
        nVar.k = true;
        concurrentLinkedQueue.remove(nVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        return nVar.e;
    }
}
