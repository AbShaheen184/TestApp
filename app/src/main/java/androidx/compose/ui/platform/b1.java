package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            return this.a == ((b1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.a + ')';
    }
}
