package androidx.media3.exoplayer.hls.playlist;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public f(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        com.google.android.material.motion.a.q(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.b == fVar.b && Double.compare(this.c, fVar.c) == 0 && Objects.equals(this.a, fVar.a) && Objects.equals(this.d, fVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public f(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
