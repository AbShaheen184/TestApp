package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static int k;
    public static final com.google.firebase.heartbeatinfo.e l = new com.google.firebase.heartbeatinfo.e();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final g0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public f(String str, float f, float f2, float f3, float f4, g0 g0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = g0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.a, fVar.a) && androidx.compose.ui.unit.f.d(this.b, fVar.b) && androidx.compose.ui.unit.f.d(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f.equals(fVar.f) && androidx.compose.ui.graphics.t.c(this.g, fVar.g) && this.h == fVar.h && this.i == fVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = androidx.compose.ui.graphics.t.j;
        return Boolean.hashCode(this.i) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.c(iHashCode, 31, this.g), 31);
    }
}
