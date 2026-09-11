package okhttp3.internal.http1;

import okio.f0;
import okio.j0;
import okio.o;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f0 {
    public final o e;
    public boolean y;
    public final /* synthetic */ f z;

    public b(f fVar) {
        this.z = fVar;
        this.e = new o(((z) fVar.c.A).e.e());
    }

    @Override // okio.f0
    public final void E(okio.f fVar, long j) {
        if (this.y) {
            net.luminis.tls.engine.impl.c.r("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        z zVar = (z) this.z.c.A;
        if (zVar.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return;
        }
        zVar.y.q0(j);
        zVar.a();
        zVar.x("\r\n");
        zVar.E(fVar, j);
        zVar.x("\r\n");
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((z) this.z.c.A).x("0\r\n\r\n");
        o oVar = this.e;
        j0 j0Var = oVar.e;
        oVar.e = j0.d;
        j0Var.a();
        j0Var.b();
        this.z.d = 3;
    }

    @Override // okio.f0
    public final j0 e() {
        return this.e;
    }

    @Override // okio.f0, java.io.Flushable
    public final synchronized void flush() {
        if (this.y) {
            return;
        }
        ((z) this.z.c.A).flush();
    }
}
