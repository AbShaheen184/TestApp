package okio;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements h0 {
    public final h0 e;

    public n(h0 h0Var) {
        h0Var.getClass();
        this.e = h0Var;
    }

    @Override // okio.h0
    public long K(f fVar, long j) {
        fVar.getClass();
        return this.e.K(fVar, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e.close();
    }

    @Override // okio.h0
    public final j0 e() {
        return this.e.e();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.e + ')';
    }
}
