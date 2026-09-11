package androidx.core.widget;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return c.b((j - j2) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (c.b((j - j3) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
