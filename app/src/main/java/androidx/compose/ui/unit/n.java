package androidx.compose.ui.unit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements androidx.compose.ui.unit.fontscaling.a {
    public final float a;

    public n(float f) {
        this.a = f;
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public final float a(float f) {
        return f / this.a;
    }

    @Override // androidx.compose.ui.unit.fontscaling.a
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.a, ((n) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
