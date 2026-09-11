package coil3.network;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final String a;
    public final String b;
    public final o c;
    public final coil3.j d;

    public p(String str, String str2, o oVar, coil3.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
        this.d = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && kotlin.jvm.internal.l.a(this.b, pVar.b) && this.c.equals(pVar.c) && kotlin.jvm.internal.l.a(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b)) * 961);
    }

    public final String toString() {
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbO.append(this.c);
        sbO.append(", body=null, extras=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
