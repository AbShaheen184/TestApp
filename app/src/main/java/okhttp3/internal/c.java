package okhttp3.internal;

import okhttp3.j0;
import okhttp3.u;
import okio.b0;
import okio.h;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j0 implements h0 {
    public final long A;
    public final u z;

    public c(u uVar, long j) {
        this.z = uVar;
        this.A = j;
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) {
        fVar.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.j0
    public final h P() {
        return new b0(this);
    }

    @Override // okio.h0
    public final okio.j0 e() {
        return okio.j0.d;
    }

    @Override // okhttp3.j0
    public final long m() {
        return this.A;
    }

    @Override // okhttp3.j0
    public final u w() {
        return this.z;
    }

    @Override // okhttp3.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
