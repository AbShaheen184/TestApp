package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements j {
    @Override // androidx.compose.ui.layout.j
    public final long a(long j, long j2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(1.0f)));
        int i = g1.a;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
