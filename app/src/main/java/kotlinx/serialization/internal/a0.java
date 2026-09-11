package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends r0 {
    public static final a0 c = new a0(b0.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        z zVar = (z) obj;
        zVar.getClass();
        int iK = aVar.k(this.b, i);
        zVar.b(zVar.d() + 1);
        int[] iArr = zVar.a;
        int i2 = zVar.b;
        zVar.b = i2 + 1;
        iArr[i2] = iK;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        z zVar = new z();
        zVar.a = iArr;
        zVar.b = iArr.length;
        zVar.b(10);
        return zVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        nVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.j(i3);
        }
    }
}
