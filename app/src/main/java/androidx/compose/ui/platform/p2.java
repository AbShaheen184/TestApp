package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface p2 {
    long a();

    long b();

    default float c() {
        return 2.0f;
    }

    default long d() {
        float f = 48;
        return _COROUTINE.b.b(f, f);
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();

    default float g() {
        return 16.0f;
    }
}
