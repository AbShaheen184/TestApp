package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends IllegalStateException {
    public final int e;
    public final int y;

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(int i, int i2) {
        String strP;
        if (i == 0) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Player stuck buffering and not loading for ", i2, " ms");
        } else if (i == 1) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Player stuck buffering with no progress for ", i2, " ms");
        } else if (i == 2) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Player stuck playing with no progress for ", i2, " ms");
        } else if (i == 3) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Player stuck playing without ending for ", i2, " ms");
        } else {
            if (i != 4) {
                org.mozilla.javascript.c.a();
                throw null;
            }
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Player stuck suppressed for ", i2, " ms");
        }
        super(strP);
        this.e = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.e == d0Var.e && this.y == d0Var.y;
    }

    public final int hashCode() {
        return ((527 + this.e) * 31) + this.y;
    }
}
