package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {
    public final float a;

    public f(float f) {
        this.a = f;
    }

    @Override // androidx.compose.ui.d
    public final int a(int i, int i2, androidx.compose.ui.unit.m mVar) {
        return Math.round((1 + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.a, ((f) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
