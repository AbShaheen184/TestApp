package org.jsoup.parser;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum r extends b0 {
    public r() {
        super("ForeignContent", 23);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        org.jsoup.nodes.b bVar2;
        org.jsoup.nodes.b bVar3;
        org.jsoup.nodes.b bVar4;
        org.jsoup.nodes.j jVarB;
        int iE = androidx.constraintlayout.core.g.e(r0Var.a);
        if (iE == 0) {
            bVar.z(this);
            return true;
        }
        if (iE == 1) {
            n0 n0Var = (n0) r0Var;
            if (org.jsoup.internal.k.c(n0Var.e, a0.L)) {
                return bVar.l.f(r0Var, bVar);
            }
            if (n0Var.e.equals("font") && (((bVar2 = n0Var.g) != null && bVar2.n("color") != -1) || (((bVar3 = n0Var.g) != null && bVar3.n("face") != -1) || ((bVar4 = n0Var.g) != null && bVar4.n("size") != -1)))) {
                return bVar.l.f(r0Var, bVar);
            }
            String str = bVar.b().A.e;
            bVar.N(n0Var, str);
            l3 l3VarF = bVar.i.d(n0Var.d.E(), n0Var.e, str, bVar.h.a).f();
            if (l3VarF != null) {
                boolean zEquals = n0Var.e.equals("script");
                t0 t0Var = bVar.c;
                if (zEquals) {
                    t0Var.o(l3.C);
                    return true;
                }
                t0Var.o(l3VarF);
            }
        } else if (iE == 2) {
            m0 m0Var = (m0) r0Var;
            if (m0Var.e.equals("br") || m0Var.e.equals("p")) {
                return bVar.l.f(r0Var, bVar);
            }
            if (m0Var.e.equals("script") && bVar.e.size() != 0 && (jVarB = bVar.b()) != null) {
                f0 f0Var = jVarB.A;
                if (f0Var.z.equals("script") && f0Var.e.equals("http://www.w3.org/2000/svg")) {
                    bVar.l();
                    return true;
                }
            }
            ArrayList arrayList = bVar.e;
            if (arrayList.isEmpty()) {
                net.luminis.tls.engine.impl.c.r("Stack unexpectedly empty");
                return false;
            }
            int size = arrayList.size() - 1;
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) arrayList.get(size);
            if (!jVar.s(m0Var.e)) {
                bVar.z(this);
            }
            while (size != 0) {
                if (jVar.s(m0Var.e)) {
                    String str2 = jVar.A.z;
                    for (int size2 = bVar.e.size() - 1; size2 >= 0 && !bVar.l().s(str2); size2--) {
                    }
                    break;
                }
                size--;
                jVar = (org.jsoup.nodes.j) arrayList.get(size);
                if (jVar.A.e.equals("http://www.w3.org/1999/xhtml")) {
                    return bVar.l.f(r0Var, bVar);
                }
            }
        } else {
            if (iE == 3) {
                bVar.K((j0) r0Var);
                return true;
            }
            if (iE == 4) {
                i0 i0Var = (i0) r0Var;
                if (b0.a(i0Var)) {
                    bVar.I(i0Var, false);
                    return true;
                }
                bVar.I(i0Var, true);
                bVar.v = false;
                return true;
            }
            if (iE != 6) {
                net.luminis.tls.engine.impl.c.r("Unexpected state: ".concat(p0.e(r0Var.a)));
                return false;
            }
        }
        return true;
    }
}
