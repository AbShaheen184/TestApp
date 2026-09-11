package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final androidx.compose.ui.h a;
    public final androidx.compose.ui.h b;

    public n3() {
        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
        this.a = hVar;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return kotlin.jvm.internal.l.a(this.a, n3Var.a) && kotlin.jvm.internal.l.a(this.b, n3Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }
}
