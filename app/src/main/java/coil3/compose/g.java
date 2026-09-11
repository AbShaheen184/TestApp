package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {
    public final androidx.compose.ui.graphics.painter.b a;
    public final coil3.request.p b;

    public g(androidx.compose.ui.graphics.painter.b bVar, coil3.request.p pVar) {
        this.a = bVar;
        this.b = pVar;
    }

    @Override // coil3.compose.h
    public final androidx.compose.ui.graphics.painter.b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
