package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e {
    public final float a;
    public final float b;

    public j(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // androidx.compose.ui.e
    public final long a(long j, long j2, androidx.compose.ui.unit.m mVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        androidx.compose.ui.unit.m mVar2 = androidx.compose.ui.unit.m.e;
        float f3 = this.a;
        if (mVar != mVar2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        return (((long) Math.round((f4 + this.b) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.a, jVar.a) == 0 && Float.compare(this.b, jVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(sb, this.b, ')');
    }
}
