package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final boolean a;
    public final boolean b;
    public final e0 c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public w(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = e0.e;
        this.d = z3;
        this.e = true;
        this.f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.f((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public /* synthetic */ w(int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0);
    }
}
