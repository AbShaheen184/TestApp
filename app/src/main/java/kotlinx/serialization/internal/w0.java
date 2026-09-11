package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends r0 {
    public static final w0 c = new w0(x0.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        v0 v0Var = (v0) obj;
        v0Var.getClass();
        short sA = aVar.a(this.b, i);
        v0Var.b(v0Var.d() + 1);
        short[] sArr = v0Var.a;
        int i2 = v0Var.b;
        v0Var.b = i2 + 1;
        sArr[i2] = sA;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        v0 v0Var = new v0();
        v0Var.a = sArr;
        v0Var.b = sArr.length;
        v0Var.b(10);
        return v0Var;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        nVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.q(s);
        }
    }
}
