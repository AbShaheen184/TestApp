package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public d0(boolean z, e0 e0Var, boolean z2) {
        androidx.compose.runtime.b0 b0Var = o.a;
        int i = !z ? 262152 : 262144;
        i = e0Var == e0.y ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = e0Var == e0.e;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && this.b == d0Var.b && this.c == d0Var.c && this.d == d0Var.d && this.e == d0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public d0(int i) {
        this((i & 1) == 0, e0.e, true);
    }
}
