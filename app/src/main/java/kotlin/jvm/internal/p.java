package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements d {
    public final Class e;

    public p(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.a(this.e, ((p) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
