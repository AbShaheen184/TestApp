package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public androidx.compose.ui.graphics.g a = null;
    public androidx.compose.ui.graphics.c b = null;
    public androidx.compose.ui.graphics.drawscope.b c = null;
    public androidx.compose.ui.graphics.j d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.l.a(this.a, uVar.a) && kotlin.jvm.internal.l.a(this.b, uVar.b) && kotlin.jvm.internal.l.a(this.c, uVar.c) && kotlin.jvm.internal.l.a(this.d, uVar.d);
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.g gVar = this.a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        androidx.compose.ui.graphics.c cVar = this.b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        androidx.compose.ui.graphics.drawscope.b bVar = this.c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        androidx.compose.ui.graphics.j jVar = this.d;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
