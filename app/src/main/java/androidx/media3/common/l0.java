package androidx.media3.common;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final l0 d = new l0(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
    }

    public l0(float f, float f2) {
        com.google.android.material.motion.a.f(f > 0.0f);
        com.google.android.material.motion.a.f(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.a == l0Var.a && this.b == l0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = androidx.media3.common.util.j0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
