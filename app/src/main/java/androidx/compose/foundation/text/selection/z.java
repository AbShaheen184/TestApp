package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final y a;
    public final y b;
    public final boolean c;

    public z(y yVar, y yVar2, boolean z) {
        this.a = yVar;
        this.b = yVar2;
        this.c = z;
    }

    public static z a(z zVar, y yVar, y yVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            yVar = zVar.a;
        }
        if ((i & 2) != 0) {
            yVar2 = zVar.b;
        }
        zVar.getClass();
        return new z(yVar, yVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.l.a(this.a, zVar.a) && kotlin.jvm.internal.l.a(this.b, zVar.b) && this.c == zVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
