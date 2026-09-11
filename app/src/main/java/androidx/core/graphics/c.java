package androidx.core.graphics;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.a, cVar2.a), Math.max(cVar.b, cVar2.b), Math.max(cVar.c, cVar2.c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new c(i, i2, i3, i4);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return androidx.compose.ui.platform.coreshims.b.s(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.a == cVar.a && this.c == cVar.c && this.b == cVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.d, '}');
    }
}
