package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public float a;
    public float b;

    public a1 a(float f) {
        double dB = b(f);
        double d = c1.a;
        double d2 = d - 1.0d;
        return new a1(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = b.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
