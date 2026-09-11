package androidx.compose.ui.text;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public final g a;
    public final m0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final androidx.compose.ui.unit.c g;
    public final androidx.compose.ui.unit.m h;
    public final androidx.compose.ui.text.font.d i;
    public final long j;

    public i0(g gVar, m0 m0Var, List list, int i, boolean z, int i2, androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar, androidx.compose.ui.text.font.d dVar, long j) {
        this.a = gVar;
        this.b = m0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = cVar;
        this.h = mVar;
        this.i = dVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.l.a(this.a, i0Var.a) && kotlin.jvm.internal.l.a(this.b, i0Var.b) && kotlin.jvm.internal.l.a(this.c, i0Var.c) && this.d == i0Var.d && this.e == i0Var.e && this.f == i0Var.f && kotlin.jvm.internal.l.a(this.g, i0Var.g) && this.h == i0Var.h && kotlin.jvm.internal.l.a(this.i, i0Var.i) && androidx.compose.ui.unit.a.b(this.j, i0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.f, androidx.privacysandbox.ads.adservices.java.internal.a.f((((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) androidx.compose.ui.unit.a.l(this.j));
        sb.append(')');
        return sb.toString();
    }
}
