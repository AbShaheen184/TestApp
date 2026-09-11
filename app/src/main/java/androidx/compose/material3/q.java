package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public q(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final q a(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new q(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return androidx.compose.ui.graphics.t.c(this.a, qVar.a) && androidx.compose.ui.graphics.t.c(this.b, qVar.b) && androidx.compose.ui.graphics.t.c(this.c, qVar.c) && androidx.compose.ui.graphics.t.c(this.d, qVar.d);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
