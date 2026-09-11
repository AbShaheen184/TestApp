package retrofit2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends RuntimeException {
    public final int e;
    public final transient r0 y;

    public q(r0 r0Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        okhttp3.g0 g0Var = r0Var.a;
        int i = g0Var.A;
        sb.append(i);
        sb.append(" ");
        sb.append(g0Var.z);
        super(sb.toString());
        this.e = i;
        this.y = r0Var;
    }
}
