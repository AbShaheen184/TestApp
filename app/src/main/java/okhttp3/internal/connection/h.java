package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements r {
    public final q a;

    public h(Throwable th) {
        this.a = new q(this, th, 2);
    }

    @Override // okhttp3.internal.connection.r
    public final boolean a() {
        return false;
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
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.r
    public final q e() {
        return this.a;
    }

    @Override // okhttp3.internal.connection.r
    public final q g() {
        return this.a;
    }
}
