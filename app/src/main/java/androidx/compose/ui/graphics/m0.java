package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final m0 d = new m0();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ m0() {
        this(a0.d(4278190080L), 0L, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return t.c(this.a, m0Var.a) && androidx.compose.ui.geometry.b.b(this.b, m0Var.b) && this.c == m0Var.c;
    }

    public final int hashCode() {
        int i = t.j;
        return Float.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.a, ", offset=", sb);
        sb.append((Object) androidx.compose.ui.geometry.b.g(this.b));
        sb.append(", blurRadius=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(sb, this.c, ')');
    }

    public m0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
