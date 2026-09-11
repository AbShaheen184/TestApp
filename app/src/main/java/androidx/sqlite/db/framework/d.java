package androidx.sqlite.db.framework;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {
    public final e e;
    public final Throwable y;

    public d(e eVar, Throwable th) {
        super(th);
        this.e = eVar;
        this.y = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.y;
    }
}
