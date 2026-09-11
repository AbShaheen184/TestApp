package androidx.compose.ui.geometry;

import androidx.datastore.preferences.protobuf.h1;
import coil3.network.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        com.google.firebase.b.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0 && Float.compare(this.d, dVar.d) == 0 && g.l(this.e, dVar.e) && g.l(this.f, dVar.f) && g.l(this.g, dVar.g) && g.l(this.h, dVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = h1.A(this.a) + ", " + h1.A(this.b) + ", " + h1.A(this.c) + ", " + h1.A(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zL = g.l(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zL || !g.l(j2, j3) || !g.l(j3, j4)) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("RoundRect(rect=", str, ", topLeft=");
            sbX.append((Object) g.y(j));
            sbX.append(", topRight=");
            sbX.append((Object) g.y(j2));
            sbX.append(", bottomRight=");
            sbX.append((Object) g.y(j3));
            sbX.append(", bottomLeft=");
            sbX.append((Object) g.y(j4));
            sbX.append(')');
            return sbX.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbX2 = androidx.privacysandbox.ads.adservices.java.internal.a.x("RoundRect(rect=", str, ", radius=");
            sbX2.append(h1.A(Float.intBitsToFloat(i)));
            sbX2.append(')');
            return sbX2.toString();
        }
        StringBuilder sbX3 = androidx.privacysandbox.ads.adservices.java.internal.a.x("RoundRect(rect=", str, ", x=");
        sbX3.append(h1.A(Float.intBitsToFloat(i)));
        sbX3.append(", y=");
        sbX3.append(h1.A(Float.intBitsToFloat(i2)));
        sbX3.append(')');
        return sbX3.toString();
    }
}
