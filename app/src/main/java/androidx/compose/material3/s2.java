package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {
    public final long a = androidx.compose.ui.graphics.t.i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s2) {
            return androidx.compose.ui.graphics.t.c(this.a, ((s2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) androidx.compose.ui.graphics.t.i(this.a)) + ", rippleAlpha=null)";
    }
}
