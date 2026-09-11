package androidx.arch.core.executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.firebase.b {
    public static volatile b m;
    public static final a n = new a(0);
    public final d l = new d();

    public static b O() {
        if (m != null) {
            return m;
        }
        synchronized (b.class) {
            try {
                if (m == null) {
                    m = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m;
    }
}
