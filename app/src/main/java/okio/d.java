package okio;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f0 {
    @Override // okio.f0
    public final void E(f fVar, long j) throws EOFException {
        fVar.skip(j);
    }

    @Override // okio.f0
    public final j0 e() {
        return j0.d;
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() {
    }
}
