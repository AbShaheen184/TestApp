package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends r0 {
    public static final a1 c = new a1(b1.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        return ((kotlin.q) obj).e.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        z0 z0Var = (z0) obj;
        z0Var.getClass();
        byte bY = aVar.v(this.b, i).y();
        z0Var.b(z0Var.d() + 1);
        byte[] bArr = z0Var.a;
        int i2 = z0Var.b;
        z0Var.b = i2 + 1;
        bArr[i2] = bY;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        byte[] bArr = ((kotlin.q) obj).e;
        z0 z0Var = new z0();
        z0Var.a = bArr;
        z0Var.b = bArr.length;
        z0Var.b(10);
        return z0Var;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new kotlin.q(new byte[0]);
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        byte[] bArr = ((kotlin.q) obj).e;
        nVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            nVar.i(this.b, i2).c(bArr[i2]);
        }
    }
}
