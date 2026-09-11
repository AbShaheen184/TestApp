package okhttp3.internal.http1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.g;
import okhttp3.r;
import okhttp3.s;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public long B;
    public final /* synthetic */ f C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, s sVar, long j) {
        super(fVar, sVar);
        sVar.getClass();
        this.C = fVar;
        this.B = j;
        if (j == 0) {
            a(r.y);
        }
    }

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
        long j2 = this.B;
        if (j2 == 0) {
            return -1L;
        }
        long jK = super.K(fVar, Math.min(j2, j));
        if (jK == -1) {
            this.C.b.f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(f.f);
            throw protocolException;
        }
        long j3 = this.B - jK;
        this.B = j3;
        if (j3 == 0) {
            a(r.y);
        }
        return jK;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.z) {
            return;
        }
        if (this.B != 0) {
            TimeZone timeZone = g.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = g.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.C.b.f();
                a(f.f);
            }
        }
        this.z = true;
    }
}
