package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends r0 {
    public static final g0 c = new g0(h0.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        f0 f0Var = (f0) obj;
        f0Var.getClass();
        long jF = aVar.f(this.b, i);
        f0Var.b(f0Var.d() + 1);
        long[] jArr = f0Var.a;
        int i2 = f0Var.b;
        f0Var.b = i2 + 1;
        jArr[i2] = jF;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        f0 f0Var = new f0();
        f0Var.a = jArr;
        f0Var.b = jArr.length;
        f0Var.b(10);
        return f0Var;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        nVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            nVar.l(this.b, i2, jArr[i2]);
        }
    }
}
