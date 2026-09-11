package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.l2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final androidx.compose.animation.core.p a = new androidx.compose.animation.core.p(Float.NaN, Float.NaN);
    public static final l2 b = new l2(new androidx.compose.foundation.lazy.i(18), new androidx.compose.foundation.lazy.i(19));
    public static final long c;
    public static final androidx.compose.animation.core.k1 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new androidx.compose.animation.core.k1(new androidx.compose.ui.geometry.b(jFloatToRawIntBits));
    }
}
