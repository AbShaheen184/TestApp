package kotlin.collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b {
    public int A;
    public final /* synthetic */ d0 B;
    public int z;

    public c0(d0 d0Var) {
        this.B = d0Var;
        this.z = d0Var.A;
        this.A = d0Var.z;
    }

    @Override // kotlin.collections.b
    public final void b() {
        int i = this.z;
        if (i == 0) {
            this.e = 2;
            return;
        }
        d0 d0Var = this.B;
        Object[] objArr = d0Var.e;
        int i2 = this.A;
        this.y = objArr[i2];
        this.e = 1;
        this.A = (i2 + 1) % d0Var.y;
        this.z = i - 1;
    }
}
