package okio;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h0 {
    public final InputStream e;
    public final j0 y;

    public r(InputStream inputStream, j0 j0Var) {
        inputStream.getClass();
        this.e = inputStream;
        this.y = j0Var;
    }

    @Override // okio.h0
    public final long K(f fVar, long j) throws IOException {
        fVar.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.y.f();
            c0 c0VarL0 = fVar.l0(1);
            int i = this.e.read(c0VarL0.a, c0VarL0.c, (int) Math.min(j, 8192 - c0VarL0.c));
            if (i != -1) {
                c0VarL0.c += i;
                long j2 = i;
                fVar.y += j2;
                return j2;
            }
            if (c0VarL0.b != c0VarL0.c) {
                return -1L;
            }
            fVar.e = c0VarL0.a();
            d0.a(c0VarL0);
            return -1L;
        } catch (AssertionError e) {
            if (okio.internal.m.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.y;
    }

    public final String toString() {
        return "source(" + this.e + ')';
    }
}
