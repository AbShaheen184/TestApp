package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends r0 {
    public static final d1 c = new d1(e1.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        return ((kotlin.s) obj).e.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        c1 c1Var = (c1) obj;
        c1Var.getClass();
        int iJ = aVar.v(this.b, i).j();
        c1Var.b(c1Var.d() + 1);
        int[] iArr = c1Var.a;
        int i2 = c1Var.b;
        c1Var.b = i2 + 1;
        iArr[i2] = iJ;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        int[] iArr = ((kotlin.s) obj).e;
        c1 c1Var = new c1();
        c1Var.a = iArr;
        c1Var.b = iArr.length;
        c1Var.b(10);
        return c1Var;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new kotlin.s(new int[0]);
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        int[] iArr = ((kotlin.s) obj).e;
        nVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            nVar.i(this.b, i2).j(iArr[i2]);
        }
    }
}
