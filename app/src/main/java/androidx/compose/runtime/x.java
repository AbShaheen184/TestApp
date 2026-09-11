package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements androidx.compose.runtime.tooling.c {
    public final u e;

    public x(u uVar) {
        this.e = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.e.equals(((x) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}
