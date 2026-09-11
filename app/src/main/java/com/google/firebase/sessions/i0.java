package com.google.firebase.sessions;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements kotlinx.serialization.internal.w {
    public static final i0 a;
    private static final kotlinx.serialization.descriptors.e descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        kotlinx.serialization.internal.o0 o0Var = new kotlinx.serialization.internal.o0("com.google.firebase.sessions.SessionData", i0Var, 3);
        o0Var.k("sessionDetails", false);
        o0Var.k("backgroundTime", true);
        o0Var.k("processDataMap", true);
        descriptor = o0Var;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVar);
        kotlinx.serialization.a[] aVarArr = k0.d;
        p0 p0Var = null;
        boolean z = true;
        int i = 0;
        i1 i1Var = null;
        Map map = null;
        while (z) {
            int iS = aVarN.s(eVar);
            if (iS == -1) {
                z = false;
            } else if (iS == 0) {
                p0Var = (p0) aVarN.w(eVar, 0, n0.a, p0Var);
                i |= 1;
            } else if (iS == 1) {
                i1Var = (i1) aVarN.t(eVar, 1, g1.a, i1Var);
                i |= 2;
            } else {
                if (iS != 2) {
                    throw new kotlinx.serialization.e(iS);
                }
                map = (Map) aVarN.t(eVar, 2, aVarArr[2], map);
                i |= 4;
            }
        }
        aVarN.h(eVar);
        return new k0(i, p0Var, i1Var, map);
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        kotlinx.serialization.descriptors.e eVar = descriptor;
        kotlinx.serialization.json.internal.n nVarA = nVar.a(eVar);
        kotlinx.serialization.a[] aVarArr = k0.d;
        n0 n0Var = n0.a;
        p0 p0Var = k0Var.a;
        Map map = k0Var.c;
        i1 i1Var = k0Var.b;
        nVarA.o(eVar, 0, n0Var, p0Var);
        if (nVarA.t(eVar) || i1Var != null) {
            nVarA.n(eVar, 1, g1.a, i1Var);
        }
        if (nVarA.t(eVar) || map != null) {
            nVarA.n(eVar, 2, aVarArr[2], map);
        }
        nVarA.s(eVar);
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        return new kotlinx.serialization.a[]{n0.a, com.google.android.material.resources.b.l(g1.a), com.google.android.material.resources.b.l(k0.d[2])};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return descriptor;
    }
}
