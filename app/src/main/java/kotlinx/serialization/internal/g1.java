package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends r0 {
    public static final g1 c = new g1(h1.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        return ((kotlin.u) obj).e.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        f1 f1Var = (f1) obj;
        f1Var.getClass();
        long jO = aVar.v(this.b, i).o();
        f1Var.b(f1Var.d() + 1);
        long[] jArr = f1Var.a;
        int i2 = f1Var.b;
        f1Var.b = i2 + 1;
        jArr[i2] = jO;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        long[] jArr = ((kotlin.u) obj).e;
        f1 f1Var = new f1();
        f1Var.a = jArr;
        f1Var.b = jArr.length;
        f1Var.b(10);
        return f1Var;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new kotlin.u(new long[0]);
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        long[] jArr = ((kotlin.u) obj).e;
        nVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            nVar.i(this.b, i2).k(jArr[i2]);
        }
    }
}
