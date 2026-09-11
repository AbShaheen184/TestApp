package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final u0 a = new u0();

    public static androidx.compose.ui.r a(float f) {
        if (f <= 0.0d) {
            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return new h0(f, true);
    }
}
