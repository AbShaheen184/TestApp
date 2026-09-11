package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    boolean a();

    long b();

    l2 c();

    s d(long j);

    default boolean e(long j) {
        return j >= b();
    }

    Object f(long j);

    Object g();
}
