package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b {
    public final androidx.compose.ui.d c;

    public x(androidx.compose.ui.h hVar) {
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && kotlin.jvm.internal.l.a(this.c, ((x) obj).c);
    }

    @Override // androidx.compose.foundation.layout.b
    public final int f(int i, int i2, androidx.compose.ui.unit.m mVar) {
        return this.c.a(i2, i, mVar);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.c + ')';
    }
}
