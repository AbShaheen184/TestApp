package androidx.compose.ui.text.input;

import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final androidx.compose.ui.text.g a;
    public final long b;
    public final l0 c;

    public x(androidx.compose.ui.text.g gVar, long j, l0 l0Var) {
        l0 l0Var2;
        this.a = gVar;
        this.b = androidx.compose.ui.text.d0.c(gVar.y.length(), j);
        if (l0Var != null) {
            l0Var2 = new l0(androidx.compose.ui.text.d0.c(gVar.y.length(), l0Var.a));
        } else {
            l0Var2 = null;
        }
        this.c = l0Var2;
    }

    public static x a(x xVar, androidx.compose.ui.text.g gVar, long j, int i) {
        if ((i & 1) != 0) {
            gVar = xVar.a;
        }
        if ((i & 2) != 0) {
            j = xVar.b;
        }
        l0 l0Var = (i & 4) != 0 ? xVar.c : null;
        xVar.getClass();
        return new x(gVar, j, l0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return l0.b(this.b, xVar.b) && kotlin.jvm.internal.l.a(this.c, xVar.c) && kotlin.jvm.internal.l.a(this.a, xVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = l0.c;
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(iHashCode, 31, this.b);
        l0 l0Var = this.c;
        return iC + (l0Var != null ? Long.hashCode(l0Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) l0.h(this.b)) + ", composition=" + this.c + ')';
    }

    public x(int i, long j, String str) {
        this(new androidx.compose.ui.text.g((i & 1) != 0 ? "" : str), (i & 2) != 0 ? l0.b : j, (l0) null);
    }
}
