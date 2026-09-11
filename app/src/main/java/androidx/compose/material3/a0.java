package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public a0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return androidx.compose.ui.graphics.t.c(this.a, a0Var.a) && androidx.compose.ui.graphics.t.c(this.b, a0Var.b) && androidx.compose.ui.graphics.t.c(this.c, a0Var.c) && androidx.compose.ui.graphics.t.c(this.d, a0Var.d);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
