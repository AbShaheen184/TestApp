package kotlin;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {
    public static final g y = new g();
    public final int e = 131860;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        return this.e - gVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.e == gVar.e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return "2.3.20";
    }
}
