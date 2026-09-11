package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s {
    public final int c;

    public b(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).c == this.c;
    }

    public final int hashCode() {
        return this.c * 31;
    }
}
