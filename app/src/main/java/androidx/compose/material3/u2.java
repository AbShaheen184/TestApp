package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u2 {
    public static final androidx.compose.runtime.b0 a = new androidx.compose.runtime.b0(new androidx.activity.compose.b(23));
    public static final v2 b;
    public static final v2 c;

    static {
        long j = androidx.compose.ui.graphics.t.i;
        b = new v2(true, Float.NaN, j);
        c = new v2(false, Float.NaN, j);
    }

    public static v2 a(boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = androidx.compose.ui.graphics.t.i;
        if (androidx.compose.ui.unit.f.d(f, Float.NaN) && androidx.compose.ui.graphics.t.c(j, j)) {
            return z ? b : c;
        }
        return new v2(z, f, j);
    }
}
