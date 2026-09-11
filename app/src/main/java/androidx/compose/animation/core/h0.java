package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements androidx.compose.runtime.t2 {
    public t1 A;
    public boolean B;
    public boolean C;
    public long D;
    public final /* synthetic */ k0 E;
    public Float e;
    public Float y;
    public final androidx.compose.runtime.h1 z;

    public h0(k0 k0Var, Float f, Float f2, f0 f0Var) {
        l2 l2Var = e.j;
        this.E = k0Var;
        this.e = f;
        this.y = f2;
        this.z = androidx.compose.runtime.s.r(f);
        this.A = new t1(f0Var, l2Var, this.e, this.y, null);
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return this.z.getValue();
    }
}
