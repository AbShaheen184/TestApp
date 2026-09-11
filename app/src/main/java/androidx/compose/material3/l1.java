package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public l1(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return androidx.compose.ui.graphics.t.c(this.a, l1Var.a) && androidx.compose.ui.graphics.t.c(this.b, l1Var.b) && androidx.compose.ui.graphics.t.c(this.c, l1Var.c) && androidx.compose.ui.graphics.t.c(this.d, l1Var.d) && androidx.compose.ui.graphics.t.c(this.e, l1Var.e) && androidx.compose.ui.graphics.t.c(this.f, l1Var.f);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
