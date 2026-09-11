package androidx.media3.common;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final Object a;
    public final int b;
    public final c0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
        androidx.media3.common.util.j0.K(6);
    }

    public p0(Object obj, int i, c0 c0Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        com.google.android.material.motion.a.f(i >= 0);
        com.google.android.material.motion.a.f(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = c0Var;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.b == p0Var.b && this.e == p0Var.e && this.f == p0Var.f && this.g == p0Var.g && this.h == p0Var.h && this.i == p0Var.i && Objects.equals(this.c, p0Var.c) && Objects.equals(this.a, p0Var.a) && Objects.equals(this.d, p0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbD = androidx.constraintlayout.core.g.d(str, ", contentPos=");
        sbD.append(this.g);
        sbD.append(", adGroup=");
        sbD.append(i);
        sbD.append(", ad=");
        sbD.append(this.i);
        return sbD.toString();
    }
}
