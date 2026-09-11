package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public final long a;
    public final long b;

    public j1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return androidx.compose.ui.graphics.t.c(this.a, j1Var.a) && androidx.compose.ui.graphics.t.c(this.b, j1Var.b);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) androidx.compose.ui.graphics.t.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
