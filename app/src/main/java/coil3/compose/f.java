package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    public final androidx.compose.ui.graphics.painter.b a;

    public f(androidx.compose.ui.graphics.painter.b bVar) {
        this.a = bVar;
    }

    @Override // coil3.compose.h
    public final androidx.compose.ui.graphics.painter.b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.l.a(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.painter.b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
