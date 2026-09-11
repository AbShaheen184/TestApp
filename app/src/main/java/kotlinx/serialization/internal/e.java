package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r0 {
    public static final e c = new e(f.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        boolean zI = aVar.i(this.b, i);
        dVar.b(dVar.d() + 1);
        boolean[] zArr = dVar.a;
        int i2 = dVar.b;
        dVar.b = i2 + 1;
        zArr[i2] = zI;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        d dVar = new d();
        dVar.a = zArr;
        dVar.b = zArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        nVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.b(z);
        }
    }
}
