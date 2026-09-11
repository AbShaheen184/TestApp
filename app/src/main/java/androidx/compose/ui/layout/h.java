package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j {
    public final /* synthetic */ int a;

    @Override // androidx.compose.ui.layout.j
    public long a(long j, long j2) {
        switch (this.a) {
            case 0:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = g1.a;
                return jFloatToRawIntBits;
            case 1:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i2 = g1.a;
                return jFloatToRawIntBits2;
            case 2:
                float fB = a0.b(j, j2);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
                int i3 = g1.a;
                return jFloatToRawIntBits3;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i4 = g1.a;
                    return jFloatToRawIntBits4;
                }
                float fB2 = a0.b(j, j2);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fB2)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & 4294967295L);
                int i5 = g1.a;
                return jFloatToRawIntBits5;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
