package coil3.network;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b b = new b();
    public final q a;

    public b() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return kotlin.jvm.internal.l.a(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar != null) {
            return qVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public b(q qVar) {
        this.a = qVar;
    }
}
