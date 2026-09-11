package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r0 {
    public static final p c = new p(q.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        o oVar = (o) obj;
        oVar.getClass();
        double dX = aVar.x(this.b, i);
        oVar.b(oVar.d() + 1);
        double[] dArr = oVar.a;
        int i2 = oVar.b;
        oVar.b = i2 + 1;
        dArr[i2] = dX;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        o oVar = new o();
        oVar.a = dArr;
        oVar.b = dArr.length;
        oVar.b(10);
        return oVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        nVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.e(d);
        }
    }
}
