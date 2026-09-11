package androidx.compose.ui.unit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k e = new k(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public k(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        int iC = (c() / 2) + this.a;
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) iC) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final int c() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.d, ')');
    }
}
