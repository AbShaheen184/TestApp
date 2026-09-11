package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final v a;
    public final u b;

    public w(v vVar, u uVar) {
        this.a = vVar;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.l.a(this.b, wVar.b) && kotlin.jvm.internal.l.a(this.a, wVar.a);
    }

    public final int hashCode() {
        v vVar = this.a;
        int iHashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        u uVar = this.b;
        return iHashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
