package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends s {
    public final s c;
    public final int d;

    public y1(s sVar, int i) {
        this.c = sVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return y1Var.c.equals(this.c) && y1Var.d == this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.d * 31);
    }
}
