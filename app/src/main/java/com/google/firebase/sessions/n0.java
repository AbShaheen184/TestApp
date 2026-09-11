package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements kotlinx.serialization.internal.w {
    public static final n0 a;
    private static final kotlinx.serialization.descriptors.e descriptor;

    static {
        n0 n0Var = new n0();
        a = n0Var;
        kotlinx.serialization.internal.o0 o0Var = new kotlinx.serialization.internal.o0("com.google.firebase.sessions.SessionDetails", n0Var, 4);
        o0Var.k("sessionId", false);
        o0Var.k("firstSessionId", false);
        o0Var.k("sessionIndex", false);
        o0Var.k("sessionStartTimestampUs", false);
        descriptor = o0Var;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVar);
        int i = 0;
        int iK = 0;
        String strQ = null;
        String strQ2 = null;
        long jF = 0;
        boolean z = true;
        while (z) {
            int iS = aVarN.s(eVar);
            if (iS == -1) {
                z = false;
            } else if (iS == 0) {
                strQ = aVarN.q(eVar, 0);
                i |= 1;
            } else if (iS == 1) {
                strQ2 = aVarN.q(eVar, 1);
                i |= 2;
            } else if (iS == 2) {
                iK = aVarN.k(eVar, 2);
                i |= 4;
            } else {
                if (iS != 3) {
                    throw new kotlinx.serialization.e(iS);
                }
                jF = aVarN.f(eVar, 3);
                i |= 8;
            }
        }
        aVarN.h(eVar);
        return new p0(i, strQ, strQ2, iK, jF);
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        p0 p0Var = (p0) obj;
        p0Var.getClass();
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.json.internal.n nVarA = nVar.a(eVar);
        String str = p0Var.a;
        str.getClass();
        nVarA.f(eVar, 0);
        nVarA.r(str);
        String str2 = p0Var.b;
        str2.getClass();
        nVarA.f(eVar, 1);
        nVarA.r(str2);
        int i = p0Var.c;
        nVarA.f(eVar, 2);
        nVarA.j(i);
        nVarA.l(eVar, 3, p0Var.d);
        nVarA.s(eVar);
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        kotlinx.serialization.internal.y0 y0Var = kotlinx.serialization.internal.y0.a;
        return new kotlinx.serialization.a[]{y0Var, y0Var, kotlinx.serialization.internal.b0.a, kotlinx.serialization.internal.h0.a};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return descriptor;
    }
}
