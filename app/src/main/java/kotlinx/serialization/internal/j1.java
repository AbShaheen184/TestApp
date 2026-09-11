package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends r0 {
    public static final j1 c = new j1(k1.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        return ((kotlin.x) obj).e.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        i1 i1Var = (i1) obj;
        i1Var.getClass();
        short sZ = aVar.v(this.b, i).z();
        i1Var.b(i1Var.d() + 1);
        short[] sArr = i1Var.a;
        int i2 = i1Var.b;
        i1Var.b = i2 + 1;
        sArr[i2] = sZ;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        short[] sArr = ((kotlin.x) obj).e;
        i1 i1Var = new i1();
        i1Var.a = sArr;
        i1Var.b = sArr.length;
        i1Var.b(10);
        return i1Var;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new kotlin.x(new short[0]);
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        short[] sArr = ((kotlin.x) obj).e;
        nVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            nVar.i(this.b, i2).q(sArr[i2]);
        }
    }
}
