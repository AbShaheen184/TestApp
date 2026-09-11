package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {
    public final androidx.compose.ui.h a;
    public final androidx.compose.ui.h b;
    public final int c;

    public c(androidx.compose.ui.h hVar, androidx.compose.ui.h hVar2, int i) {
        this.a = hVar;
        this.b = hVar2;
        this.c = i;
    }

    @Override // androidx.compose.material3.internal.k
    public final int a(androidx.compose.ui.unit.k kVar, long j, int i, androidx.compose.ui.unit.m mVar) {
        int iA = this.b.a(0, kVar.c(), mVar);
        int i2 = -this.a.a(0, i, mVar);
        androidx.compose.ui.unit.m mVar2 = androidx.compose.ui.unit.m.e;
        int i3 = this.c;
        if (mVar != mVar2) {
            i3 = -i3;
        }
        return kVar.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c == cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.c, ')');
    }
}
