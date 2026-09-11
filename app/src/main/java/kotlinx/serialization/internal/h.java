package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r0 {
    public static final h c = new h(i.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        byte bG = aVar.g(this.b, i);
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.a;
        int i2 = gVar.b;
        gVar.b = i2 + 1;
        bArr[i2] = bG;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        g gVar = new g();
        gVar.a = bArr;
        gVar.b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        nVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.c(b);
        }
    }
}
