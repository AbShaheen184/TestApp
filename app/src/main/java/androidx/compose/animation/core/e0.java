package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements c0 {
    public final int a;
    public final z b;
    public final long c;
    public final long d;

    public e0(int i, int i2, z zVar) {
        this.a = i;
        this.b = zVar;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // androidx.compose.animation.core.c0
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(j4, f, f2, f3) - e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.c0
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // androidx.compose.animation.core.c0
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fA = this.b.a(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fA) + ((1 - fA) * f);
    }
}
