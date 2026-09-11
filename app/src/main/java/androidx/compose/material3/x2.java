package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public x2(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return androidx.compose.ui.unit.f.d(this.a, x2Var.a) && androidx.compose.ui.unit.f.d(this.b, x2Var.b) && androidx.compose.ui.unit.f.d(this.c, x2Var.c) && androidx.compose.ui.unit.f.d(this.d, x2Var.d) && androidx.compose.ui.unit.f.d(this.f, x2Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
