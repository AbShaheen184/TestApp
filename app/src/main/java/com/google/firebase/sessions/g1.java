package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements kotlinx.serialization.internal.w {
    public static final g1 a;
    private static final kotlinx.serialization.descriptors.e descriptor;

    static {
        g1 g1Var = new g1();
        a = g1Var;
        kotlinx.serialization.internal.o0 o0Var = new kotlinx.serialization.internal.o0("com.google.firebase.sessions.Time", g1Var, 3);
        o0Var.k("ms", false);
        o0Var.k("us", true);
        o0Var.k("seconds", true);
        descriptor = o0Var;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVar);
        int i = 0;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        boolean z = true;
        while (z) {
            int iS = aVarN.s(eVar);
            if (iS == -1) {
                z = false;
            } else if (iS == 0) {
                jF = aVarN.f(eVar, 0);
                i |= 1;
            } else if (iS == 1) {
                jF2 = aVarN.f(eVar, 1);
                i |= 2;
            } else {
                if (iS != 2) {
                    throw new kotlinx.serialization.e(iS);
                }
                jF3 = aVarN.f(eVar, 2);
                i |= 4;
            }
        }
        aVarN.h(eVar);
        return new i1(i, jF, jF2, jF3);
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        i1 i1Var = (i1) obj;
        i1Var.getClass();
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.json.internal.n nVarA = nVar.a(eVar);
        long j = i1Var.a;
        long j2 = i1Var.c;
        long j3 = i1Var.b;
        nVarA.l(eVar, 0, j);
        if (nVarA.t(eVar) || j3 != ((long) 1000) * j) {
            nVarA.l(eVar, 1, j3);
        }
        if (nVarA.t(eVar) || j2 != j / ((long) 1000)) {
            nVarA.l(eVar, 2, j2);
        }
        nVarA.s(eVar);
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        kotlinx.serialization.internal.h0 h0Var = kotlinx.serialization.internal.h0.a;
        return new kotlinx.serialization.a[]{h0Var, h0Var, h0Var};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return descriptor;
    }
}
