package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements androidx.compose.foundation.d1 {
    public final boolean a;
    public final float b;
    public final long c;

    public v2(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // androidx.compose.foundation.d1
    public final androidx.compose.ui.node.i a(androidx.compose.foundation.interaction.k kVar) {
        return new v0(kVar, this.a, this.b, new u0(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        if (this.a == v2Var.a && androidx.compose.ui.unit.f.d(this.b, v2Var.b)) {
            return androidx.compose.ui.graphics.t.c(this.c, v2Var.c);
        }
        return false;
    }

    @Override // androidx.compose.foundation.d1
    public final int hashCode() {
        int iA = androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.c) + iA;
    }
}
