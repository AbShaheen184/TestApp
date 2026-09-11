package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public final long a;
    public final long b;
    public final boolean c;

    public c1(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final c1 a(c1 c1Var) {
        return new c1(androidx.compose.ui.geometry.b.e(this.a, c1Var.a), Math.max(this.b, c1Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return androidx.compose.ui.geometry.b.b(this.a, c1Var.a) && this.b == c1Var.b && this.c == c1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) androidx.compose.ui.geometry.b.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
