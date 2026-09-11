package okhttp3.internal.http1;

import java.io.IOException;
import okhttp3.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public boolean B;

    @Override // okhttp3.internal.http1.a, okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        fVar.getClass();
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("closed");
            return 0L;
        }
        if (this.B) {
            return -1L;
        }
        long jK = super.K(fVar, j);
        if (jK != -1) {
            return jK;
        }
        this.B = true;
        a(r.y);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.z) {
            return;
        }
        if (!this.B) {
            a(f.f);
        }
        this.z = true;
    }
}
