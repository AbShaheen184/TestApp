package okio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements f0 {
    public final f0 e;

    public m(f0 f0Var) {
        f0Var.getClass();
        this.e = f0Var;
    }

    @Override // okio.f0
    public void E(f fVar, long j) {
        this.e.E(fVar, j);
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    @Override // okio.f0
    public final j0 e() {
        return this.e.e();
    }

    @Override // okio.f0, java.io.Flushable
    public void flush() {
        this.e.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.e + ')';
    }
}
