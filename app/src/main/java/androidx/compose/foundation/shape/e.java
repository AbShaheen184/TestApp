package androidx.compose.foundation.shape;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final d a;

    static {
        c cVar = new c(50);
        a = new d(cVar, cVar, cVar, cVar);
    }

    public static final d a(float f) {
        b bVar = new b(f);
        return new d(bVar, bVar, bVar, bVar);
    }

    public static final d b() {
        return a;
    }
}
