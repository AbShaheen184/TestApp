package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r0 {
    public static final l c = new l(m.a);

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        char cD = aVar.d(this.b, i);
        kVar.b(kVar.d() + 1);
        char[] cArr = kVar.a;
        int i2 = kVar.b;
        kVar.b = i2 + 1;
        cArr[i2] = cD;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        k kVar = new k();
        kVar.a = cArr;
        kVar.b = cArr.length;
        kVar.b(10);
        return kVar;
    }

    @Override // kotlinx.serialization.internal.r0
    public final Object n() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.r0
    public final void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        nVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            q0 q0Var = this.b;
            q0Var.getClass();
            nVar.f(q0Var, i2);
            nVar.d(c2);
        }
    }
}
