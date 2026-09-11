package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements kotlinx.serialization.internal.w {
    public static final b0 a;
    private static final kotlinx.serialization.descriptors.e descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        kotlinx.serialization.internal.o0 o0Var = new kotlinx.serialization.internal.o0("com.google.firebase.sessions.ProcessData", b0Var, 2);
        o0Var.k("pid", false);
        o0Var.k("uuid", false);
        descriptor = o0Var;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVar);
        String strQ = null;
        boolean z = true;
        int i = 0;
        int iK = 0;
        while (z) {
            int iS = aVarN.s(eVar);
            if (iS == -1) {
                z = false;
            } else if (iS == 0) {
                iK = aVarN.k(eVar, 0);
                i |= 1;
            } else {
                if (iS != 1) {
                    throw new kotlinx.serialization.e(iS);
                }
                strQ = aVarN.q(eVar, 1);
                i |= 2;
            }
        }
        aVarN.h(eVar);
        return new d0(i, iK, strQ);
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.json.internal.n nVarA = nVar.a(eVar);
        int i = d0Var.a;
        nVarA.f(eVar, 0);
        nVarA.j(i);
        String str = d0Var.b;
        str.getClass();
        nVarA.f(eVar, 1);
        nVarA.r(str);
        nVarA.s(eVar);
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        return new kotlinx.serialization.a[]{kotlinx.serialization.internal.b0.a, kotlinx.serialization.internal.y0.a};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return descriptor;
    }
}
