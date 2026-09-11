package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public final long a;
    public final androidx.compose.foundation.layout.m0 b;

    public o1() {
        long jD = androidx.compose.ui.graphics.a0.d(4284900966L);
        androidx.compose.foundation.layout.m0 m0VarA = androidx.compose.foundation.layout.b.a(3, 0.0f);
        this.a = jD;
        this.b = m0VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o1 o1Var = (o1) obj;
        return androidx.compose.ui.graphics.t.c(this.a, o1Var.a) && kotlin.jvm.internal.l.a(this.b, o1Var.b);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
