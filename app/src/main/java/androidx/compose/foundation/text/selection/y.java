package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final androidx.compose.ui.text.style.j a;
    public final int b;
    public final long c;

    public y(androidx.compose.ui.text.style.j jVar, int i, long j) {
        this.a = jVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b && this.c == yVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
