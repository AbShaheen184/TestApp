package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements k {
    public final androidx.compose.ui.f a;

    public b0(androidx.compose.ui.f fVar) {
        this.a = fVar;
    }

    @Override // androidx.compose.material3.internal.k
    public final int a(androidx.compose.ui.unit.k kVar, long j, int i, androidx.compose.ui.unit.m mVar) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1 + (mVar != androidx.compose.ui.unit.m.e ? 0.0f * (-1) : 0.0f)) * ((i2 - i) / 2.0f));
        }
        return com.google.android.material.resources.c.c(this.a.a(i, i2, mVar), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a.equals(((b0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
