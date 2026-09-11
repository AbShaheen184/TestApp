package kotlin;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {
    public final short e;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.l.b(this.e & 65535, ((w) obj).e & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.e == ((w) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 65535);
    }
}
