package androidx.compose.ui.contentcapture;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;
    public final long b;
    public final h c;
    public final com.google.firebase.platforminfo.c d;

    public g(int i, long j, h hVar, com.google.firebase.platforminfo.c cVar) {
        this.a = i;
        this.b = j;
        this.c = hVar;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && l.a(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        com.google.firebase.platforminfo.c cVar = this.d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
