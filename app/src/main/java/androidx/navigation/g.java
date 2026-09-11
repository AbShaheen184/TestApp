package androidx.navigation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final i0 a;
    public final boolean b;
    public final Object c;

    public g(i0 i0Var, Object obj, boolean z) {
        if (z && obj == null) {
            androidx.media3.exoplayer.hls.playlist.a.g(i0Var.b(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.a = i0Var;
        this.c = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b != gVar.b || !this.a.equals(gVar.a)) {
            return false;
        }
        Object obj2 = gVar.c;
        Object obj3 = this.c;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 961) + (this.b ? 1 : 0)) * 31;
        Object obj = this.c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kotlin.jvm.internal.a0.a(g.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: false");
        if (this.b) {
            sb.append(" DefaultValue: " + this.c);
        }
        return sb.toString();
    }
}
