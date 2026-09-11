package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okio.f0;
import okio.g0;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements g0 {
    public long A;
    public long B;
    public final ArrayDeque C;
    public boolean D;
    public final u E;
    public final t F;
    public final v G;
    public final v H;
    public b I;
    public IOException J;
    public final int e;
    public final o y;
    public final okhttp3.internal.http2.flowcontrol.a z;

    public w(int i, o oVar, boolean z, boolean z2, okhttp3.r rVar) {
        oVar.getClass();
        this.e = i;
        this.y = oVar;
        this.z = new okhttp3.internal.http2.flowcontrol.a(i);
        this.B = oVar.P.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.C = arrayDeque;
        this.E = new u(this, oVar.O.a(), z2);
        this.F = new t(this, z);
        this.G = new v(this);
        this.H = new v(this);
        if (rVar == null) {
            if (i()) {
                return;
            }
            net.luminis.tls.engine.impl.c.r("remotely-initiated streams should have headers");
            throw null;
        }
        if (i()) {
            net.luminis.tls.engine.impl.c.r("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zJ;
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (this) {
            try {
                u uVar = this.E;
                if (uVar.y || !uVar.B) {
                    z = false;
                } else {
                    t tVar = this.F;
                    if (tVar.e || tVar.z) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zJ = j();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(b.CANCEL, null);
        } else {
            if (zJ) {
                return;
            }
            this.y.m(this.e);
        }
    }

    public final void b() throws IOException {
        t tVar = this.F;
        if (tVar.z) {
            net.luminis.tls.engine.impl.c.t("stream closed");
            return;
        }
        if (tVar.e) {
            net.luminis.tls.engine.impl.c.t("stream finished");
            return;
        }
        if (h() != null) {
            IOException iOException = this.J;
            if (iOException != null) {
                throw iOException;
            }
            b bVarH = h();
            bVarH.getClass();
            throw new b0(bVarH);
        }
    }

    @Override // okio.g0
    public final h0 c() {
        return this.E;
    }

    @Override // okio.g0
    public final void cancel() {
        g(b.CANCEL);
    }

    @Override // okio.g0
    public final f0 d() {
        return this.F;
    }

    public final void e(b bVar, IOException iOException) {
        if (f(bVar, iOException)) {
            o oVar = this.y;
            oVar.getClass();
            oVar.U.N(this.e, bVar);
        }
    }

    public final boolean f(b bVar, IOException iOException) {
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.I = bVar;
            this.J = iOException;
            notifyAll();
            if (this.E.y && this.F.e) {
                return false;
            }
            this.y.m(this.e);
            return true;
        }
    }

    public final void g(b bVar) {
        if (f(bVar, null)) {
            this.y.N(this.e, bVar);
        }
    }

    public final b h() {
        b bVar;
        synchronized (this) {
            bVar = this.I;
        }
        return bVar;
    }

    public final boolean i() {
        boolean z = (this.e & 1) == 1;
        this.y.getClass();
        return true == z;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                u uVar = this.E;
                if (uVar.y || uVar.B) {
                    t tVar = this.F;
                    if ((tVar.e || tVar.z) && this.D) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(okhttp3.r rVar, boolean z) {
        boolean zJ;
        rVar.getClass();
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (this) {
            try {
                if (this.D && rVar.b(":status") == null && rVar.b(":method") == null) {
                    this.E.getClass();
                } else {
                    this.D = true;
                    this.C.add(rVar);
                }
                if (z) {
                    this.E.y = true;
                }
                zJ = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zJ) {
            return;
        }
        this.y.m(this.e);
    }
}
