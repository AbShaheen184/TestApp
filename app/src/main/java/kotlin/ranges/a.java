package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float a;

    public a(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f = this.a;
        return (0.0f > f && 0.0f > ((a) obj).a) || f == ((a) obj).a;
    }

    public final int hashCode() {
        float f = this.a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
