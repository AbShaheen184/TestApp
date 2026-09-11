package okhttp3.internal.http2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.h0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h0 {
    public int A;
    public int B;
    public int C;
    public final okio.h e;
    public int y;
    public int z;

    public r(okio.h hVar) {
        hVar.getClass();
        this.e = hVar;
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        int i;
        int i2;
        fVar.getClass();
        do {
            int i3 = this.B;
            okio.h hVar = this.e;
            if (i3 == 0) {
                hVar.skip(this.C);
                this.C = 0;
                if ((this.z & 4) == 0) {
                    i = this.A;
                    int iO = okhttp3.internal.e.o(hVar);
                    this.B = iO;
                    this.y = iO;
                    int i4 = hVar.readByte() & 255;
                    this.z = hVar.readByte() & 255;
                    Logger logger = s.A;
                    if (logger.isLoggable(Level.FINE)) {
                        okio.i iVar = h.a;
                        logger.fine(h.b(true, this.A, this.y, i4, this.z));
                    }
                    i2 = hVar.readInt() & Integer.MAX_VALUE;
                    this.A = i2;
                    if (i4 != 9) {
                        net.luminis.tls.engine.impl.c.t(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i4, " != TYPE_CONTINUATION"));
                        return 0L;
                    }
                }
            } else {
                long jK = hVar.K(fVar, Math.min(j, i3));
                if (jK != -1) {
                    this.B -= (int) jK;
                    return jK;
                }
            }
            return -1L;
        } while (i2 == i);
        net.luminis.tls.engine.impl.c.t("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // okio.h0
    public final j0 e() {
        return this.e.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
