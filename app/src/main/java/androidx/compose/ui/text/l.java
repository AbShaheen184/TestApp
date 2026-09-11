package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    public final String a;
    public final k0 b;

    public l(String str, k0 k0Var) {
        this.a = str;
        this.b = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && kotlin.jvm.internal.l.a(this.b, lVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k0 k0Var = this.b;
        return (iHashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
