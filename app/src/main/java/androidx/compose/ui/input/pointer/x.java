package androidx.compose.ui.input.pointer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public x(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return u.e(this.a, xVar.a) && this.b == xVar.b && androidx.compose.ui.geometry.b.b(this.c, xVar.c) && androidx.compose.ui.geometry.b.b(this.d, xVar.d) && this.e == xVar.e && Float.compare(this.f, xVar.f) == 0 && this.g == xVar.g && this.h == xVar.h && this.i.equals(xVar.i) && androidx.compose.ui.geometry.b.b(this.j, xVar.j) && androidx.compose.ui.geometry.b.b(this.k, xVar.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + androidx.privacysandbox.ads.adservices.java.internal.a.c((this.i.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.g, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.f, androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) u.i(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) androidx.compose.ui.geometry.b.g(this.c)) + ", position=" + ((Object) androidx.compose.ui.geometry.b.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) d0.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) androidx.compose.ui.geometry.b.g(this.j)) + ", originalEventPosition=" + ((Object) androidx.compose.ui.geometry.b.g(this.k)) + ')';
    }
}
