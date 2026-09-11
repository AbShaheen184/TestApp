package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r0 {
    public static final u c = new u(v.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        t tVar = (t) obj;
        tVar.getClass();
        float fB = aVar.b(this.b, i);
        tVar.b(tVar.d() + 1);
        float[] fArr = tVar.a;
        int i2 = tVar.b;
        tVar.b = i2 + 1;
        fArr[i2] = fB;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        t tVar = new t();
        tVar.a = fArr;
        tVar.b = fArr.length;
        tVar.b(10);
        return tVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        nVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.g(f);
        }
    }
}
