package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public final float a;
    public final float b;
    public final long c;

    public a1(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Float.compare(this.a, a1Var.a) == 0 && Float.compare(this.b, a1Var.b) == 0 && this.c == a1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
