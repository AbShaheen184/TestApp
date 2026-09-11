package androidx.compose.ui.input.indirect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.a + ')';
    }
}
