package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements l {
    public final androidx.compose.ui.i a;
    public final int b;

    public c0(androidx.compose.ui.i iVar, int i) {
        this.a = iVar;
        this.b = i;
    }

    @Override // androidx.compose.material3.internal.l
    public final int a(androidx.compose.ui.unit.k kVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        if (i < i2 - (i3 * 2)) {
            return com.google.android.material.resources.c.c(this.a.a(i, i2), i3, (i2 - i3) - i);
        }
        return Math.round((1 + 0.0f) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a.equals(c0Var.a) && this.b == c0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
