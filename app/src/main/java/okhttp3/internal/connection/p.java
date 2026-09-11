package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements r {
    public final n a;

    public p(n nVar) {
        nVar.getClass();
        this.a = nVar;
    }

    @Override // okhttp3.internal.connection.r
    public final boolean a() {
        return true;
    }

    @Override // okhttp3.internal.connection.r
    public final r b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.r, okhttp3.internal.http.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.r
    public final n d() {
        return this.a;
    }

    @Override // okhttp3.internal.connection.r
    public final q e() {
        throw new IllegalStateException("already connected");
    }

    @Override // okhttp3.internal.connection.r
    public final q g() {
        throw new IllegalStateException("already connected");
    }
}
