package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e b = new e();
    public AudioAttributes a;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
        androidx.media3.common.util.j0.K(6);
    }

    public final AudioAttributes a() {
        if (this.a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                androidx.compose.ui.platform.coreshims.b.u(usage);
                androidx.compose.ui.platform.coreshims.b.a(usage);
            }
            if (i >= 32) {
                d.b(usage);
                d.a(usage);
            }
            this.a = usage.build();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
