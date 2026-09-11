package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final float a;
    public final androidx.compose.ui.graphics.p0 b;

    public a0(float f, androidx.compose.ui.graphics.p0 p0Var) {
        this.a = f;
        this.b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return androidx.compose.ui.unit.f.d(this.a, a0Var.a) && this.b.equals(a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) androidx.compose.ui.unit.f.e(this.a)) + ", brush=" + this.b + ')';
    }
}
