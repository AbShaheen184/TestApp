package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public l(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            androidx.compose.ui.internal.a.a("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            androidx.compose.ui.internal.a.a("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            androidx.compose.ui.internal.a.a("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        androidx.compose.ui.internal.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return androidx.compose.ui.unit.f.d(this.a, lVar.a) && androidx.compose.ui.unit.f.d(this.b, lVar.b) && androidx.compose.ui.unit.f.d(this.c, lVar.c) && androidx.compose.ui.unit.f.d(this.d, lVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) androidx.compose.ui.unit.f.e(this.a)) + ", top=" + ((Object) androidx.compose.ui.unit.f.e(this.b)) + ", end=" + ((Object) androidx.compose.ui.unit.f.e(this.c)) + ", bottom=" + ((Object) androidx.compose.ui.unit.f.e(this.d)) + ", isLayoutDirectionAware=true)";
    }
}
