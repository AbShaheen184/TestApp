package retrofit2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends okhttp3.j0 {
    public final long A;
    public final okhttp3.u z;

    public y(okhttp3.u uVar, long j) {
        this.z = uVar;
        this.A = j;
    }

    @Override // okhttp3.j0
    public final okio.h P() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // okhttp3.j0
    public final long m() {
        return this.A;
    }

    @Override // okhttp3.j0
    public final okhttp3.u w() {
        return this.z;
    }
}
