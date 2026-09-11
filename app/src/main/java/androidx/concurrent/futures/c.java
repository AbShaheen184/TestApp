package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Throwable a;

    static {
        new c(new b("Failure occurred while trying to finish a future.", 0));
    }

    public c(Throwable th) {
        boolean z = h.A;
        th.getClass();
        this.a = th;
    }
}
