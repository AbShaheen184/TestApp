package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public b0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return androidx.compose.ui.unit.f.d(this.a, b0Var.a) && androidx.compose.ui.unit.f.d(this.b, b0Var.b) && androidx.compose.ui.unit.f.d(this.c, b0Var.c) && androidx.compose.ui.unit.f.d(this.d, b0Var.d) && androidx.compose.ui.unit.f.d(this.e, b0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
