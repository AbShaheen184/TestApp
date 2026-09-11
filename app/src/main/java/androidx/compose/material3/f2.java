package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 {
    public static final float a = androidx.compose.material3.tokens.c.c;
    public static final int b = 1;
    public static final int c = 1;
    public static final float d = androidx.compose.material3.tokens.m.b;
    public static final float e = androidx.compose.material3.tokens.m.c;
    public static final float f = androidx.compose.material3.tokens.c.b;

    public static final void a(androidx.compose.ui.graphics.drawscope.d dVar, int i, long j, float f2, float f3) {
        if (i == 1) {
            float f4 = f2 / 2.0f;
            androidx.compose.ui.graphics.drawscope.d.R(dVar, j, f4, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (dVar.d() >> 32)) - f4) - f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / 2.0f)) & 4294967295L), null, 120);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.d() >> 32)) - f2) - f3;
        androidx.compose.ui.graphics.drawscope.d.p0(dVar, j, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - f2) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))), 120);
    }
}
