package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public j(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final j a(j jVar, String str) {
        String strQ = androidx.media3.common.util.c.q(str, this.c);
        if (jVar == null) {
            return null;
        }
        long j = jVar.b;
        if (!strQ.equals(androidx.media3.common.util.c.q(str, jVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == jVar.a) {
                return new j(j3, j != -1 ? j2 + j : -1L, strQ);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = jVar.a;
        if (j4 + j == this.a) {
            return new j(j4, j2 != -1 ? j + j2 : -1L, strQ);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c.equals(jVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.b, ")", sb);
    }
}
