package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class l extends com.google.gson.n {
    public static final l a = new l();

    private l() {
    }

    public static com.google.gson.h d(int i, com.google.gson.stream.a aVar) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 5) {
            return new com.google.gson.l(aVar.l0());
        }
        if (iE == 6) {
            return new com.google.gson.l(new com.google.gson.internal.j(aVar.l0()));
        }
        if (iE == 7) {
            return new com.google.gson.l(Boolean.valueOf(aVar.d0()));
        }
        if (iE == 8) {
            aVar.j0();
            return com.google.gson.j.e;
        }
        net.luminis.tls.engine.impl.c.r("Unexpected token: ".concat(com.google.android.datatransport.runtime.backends.c.x(i)));
        return null;
    }

    public static void e(com.google.gson.h hVar, com.google.gson.stream.b bVar) throws IOException {
        if (hVar == null || (hVar instanceof com.google.gson.j)) {
            bVar.Y();
            return;
        }
        boolean z = hVar instanceof com.google.gson.l;
        if (z) {
            if (!z) {
                com.google.gson.b.m(hVar, "Not a JSON Primitive: ");
                return;
            }
            com.google.gson.l lVar = (com.google.gson.l) hVar;
            Serializable serializable = lVar.e;
            if (serializable instanceof Number) {
                bVar.g0(lVar.k());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.i0(lVar.b());
                return;
            } else {
                bVar.h0(lVar.h());
                return;
            }
        }
        if (hVar instanceof com.google.gson.g) {
            bVar.g();
            Iterator it = hVar.d().e.iterator();
            while (it.hasNext()) {
                e((com.google.gson.h) it.next(), bVar);
            }
            bVar.z();
            return;
        }
        if (!(hVar instanceof com.google.gson.k)) {
            androidx.core.graphics.b.b(hVar.getClass(), "Couldn't write ");
            return;
        }
        bVar.m();
        Iterator it2 = ((com.google.gson.internal.l) hVar.e().e.entrySet()).iterator();
        while (((com.google.gson.internal.k) it2).hasNext()) {
            com.google.gson.internal.m mVarC = ((com.google.gson.internal.k) it2).c();
            bVar.N((String) mVarC.getKey());
            e((com.google.gson.h) mVarC.getValue(), bVar);
        }
        bVar.L();
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        com.google.gson.h gVar;
        com.google.gson.h gVar2;
        if (aVar instanceof n) {
            n nVar = (n) aVar;
            int iN0 = nVar.n0();
            if (iN0 == 5 || iN0 == 2 || iN0 == 4 || iN0 == 10) {
                com.google.gson.b.f(com.google.android.datatransport.runtime.backends.c.x(iN0), " when reading a JsonElement.", "Unexpected ");
                return null;
            }
            com.google.gson.h hVar = (com.google.gson.h) nVar.A0();
            nVar.t0();
            return hVar;
        }
        int iN1 = aVar.n0();
        int iE = androidx.constraintlayout.core.g.e(iN1);
        if (iE == 0) {
            aVar.a();
            gVar = new com.google.gson.g();
        } else if (iE != 2) {
            gVar = null;
        } else {
            aVar.g();
            gVar = new com.google.gson.k();
        }
        if (gVar == null) {
            return d(iN1, aVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.a0()) {
                String strH0 = gVar instanceof com.google.gson.k ? aVar.h0() : null;
                int iN2 = aVar.n0();
                int iE2 = androidx.constraintlayout.core.g.e(iN2);
                if (iE2 == 0) {
                    aVar.a();
                    gVar2 = new com.google.gson.g();
                } else if (iE2 != 2) {
                    gVar2 = null;
                } else {
                    aVar.g();
                    gVar2 = new com.google.gson.k();
                }
                boolean z = gVar2 != null;
                if (gVar2 == null) {
                    gVar2 = d(iN2, aVar);
                }
                if (gVar instanceof com.google.gson.g) {
                    ((com.google.gson.g) gVar).e.add(gVar2);
                } else {
                    ((com.google.gson.k) gVar).i(strH0, gVar2);
                }
                if (z) {
                    arrayDeque.addLast(gVar);
                    gVar = gVar2;
                }
            } else {
                if (gVar instanceof com.google.gson.g) {
                    aVar.z();
                } else {
                    aVar.L();
                }
                if (arrayDeque.isEmpty()) {
                    return gVar;
                }
                gVar = (com.google.gson.h) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.n
    public final /* bridge */ /* synthetic */ void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        e((com.google.gson.h) obj, bVar);
    }
}
