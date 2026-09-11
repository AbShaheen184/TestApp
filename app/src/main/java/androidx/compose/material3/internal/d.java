package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l {
    public final androidx.compose.ui.i a;
    public final androidx.compose.ui.i b;
    public final int c;

    public d(androidx.compose.ui.i iVar, androidx.compose.ui.i iVar2, int i) {
        this.a = iVar;
        this.b = iVar2;
        this.c = i;
    }

    @Override // androidx.compose.material3.internal.l
    public final int a(androidx.compose.ui.unit.k kVar, long j, int i) {
        int iA = this.b.a(0, kVar.b());
        return kVar.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.c, ')');
    }
}
