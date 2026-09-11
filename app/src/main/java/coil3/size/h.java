package coil3.size;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h c;
    public final c a;
    public final c b;

    static {
        b bVar = b.a;
        c = new h(bVar, bVar);
    }

    public h(c cVar, c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && this.b.equals(hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
