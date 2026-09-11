package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {
    public final float a;

    public g(float f) {
        this.a = f;
    }

    @Override // androidx.compose.ui.e
    public final long a(long j, long j2, androidx.compose.ui.unit.m mVar) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = 1;
        float f2 = (this.a + f) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f2)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.a, ((g) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
