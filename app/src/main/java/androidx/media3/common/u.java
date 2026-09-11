package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class u {
    public final long a;

    static {
        new u(new d1());
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(2);
        androidx.media3.common.util.j0.K(3);
        androidx.media3.common.util.j0.K(4);
        androidx.media3.common.util.j0.K(5);
        androidx.media3.common.util.j0.K(6);
        androidx.media3.common.util.j0.K(7);
    }

    public u(d1 d1Var) {
        String str = androidx.media3.common.util.j0.a;
        this.a = Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 923521;
    }
}
