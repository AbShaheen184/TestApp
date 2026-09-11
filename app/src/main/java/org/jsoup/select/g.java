package org.jsoup.select;

import java.util.List;
import org.jsoup.parser.f0;
import org.jsoup.parser.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p {
    public static boolean b = false;
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // org.jsoup.select.p
    public int a() {
        switch (this.a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        org.jsoup.nodes.j jVar3;
        e eVar;
        switch (this.a) {
            case 0:
                return true;
            case 1:
                for (org.jsoup.nodes.o oVarP = jVar2.p(); oVarP != null; oVarP = oVarP.u()) {
                    if (oVarP instanceof org.jsoup.nodes.v) {
                        if (!org.jsoup.internal.k.f(((org.jsoup.nodes.v) oVarP).J())) {
                            return false;
                        }
                    } else {
                        if (!(oVarP instanceof org.jsoup.nodes.d) && !(oVarP instanceof org.jsoup.nodes.w) && !(oVarP instanceof org.jsoup.nodes.h)) {
                            return false;
                        }
                    }
                }
                return true;
            case 2:
                org.jsoup.nodes.j jVar4 = jVar2.e;
                return (jVar4 == null || (jVar4 instanceof org.jsoup.nodes.g) || jVar2 != jVar4.U()) ? false : true;
            case 3:
                org.jsoup.nodes.j jVar5 = jVar2.e;
                if (jVar5 != null && !(jVar5 instanceof org.jsoup.nodes.g)) {
                    for (int size = jVar5.B.size() - 1; size >= 0; size--) {
                        org.jsoup.nodes.o oVar = (org.jsoup.nodes.o) jVar5.B.get(size);
                        if (oVar instanceof org.jsoup.nodes.j) {
                            jVar3 = (org.jsoup.nodes.j) oVar;
                            if (jVar2 == jVar3) {
                                return true;
                            }
                        }
                    }
                    jVar3 = null;
                    if (jVar2 == jVar3) {
                        return true;
                    }
                }
                return false;
            case 4:
                org.jsoup.nodes.j jVar6 = jVar2.e;
                if (jVar6 == null || (jVar6 instanceof org.jsoup.nodes.g)) {
                    return false;
                }
                if (jVar6 == null) {
                    eVar = new e(0);
                } else {
                    List<org.jsoup.nodes.j> listP = jVar6.P();
                    e eVar2 = new e(listP.size() - 1);
                    for (org.jsoup.nodes.j jVar7 : listP) {
                        if (jVar7 != jVar2) {
                            eVar2.add(jVar7);
                        }
                    }
                    eVar = eVar2;
                }
                return eVar.isEmpty();
            case 5:
                org.jsoup.nodes.j jVar8 = jVar2.e;
                if (jVar8 == null || (jVar8 instanceof org.jsoup.nodes.g)) {
                    return false;
                }
                int i = 0;
                for (org.jsoup.nodes.j jVarU = jVar8.U(); jVarU != null; jVarU = jVarU.t()) {
                    if (jVarU.A.z.equals(jVar2.A.z)) {
                        i++;
                    }
                    if (i > 1) {
                        if (i == 1) {
                            return true;
                        }
                        return false;
                    }
                }
                if (i == 1) {
                    return true;
                }
                return false;
            case 6:
                if (jVar instanceof org.jsoup.nodes.g) {
                    jVar = jVar.U();
                }
                return jVar2 == jVar;
            case 7:
                if (jVar2 instanceof org.jsoup.nodes.r) {
                    return true;
                }
                for (org.jsoup.nodes.o oVar2 : jVar2.T(org.jsoup.nodes.v.class)) {
                    f0 f0Var = jVar2.A;
                    org.jsoup.nodes.r rVar = new org.jsoup.nodes.r(new g0(g0.d, null).d(f0Var.y, null, f0Var.e, true), jVar2.h(), jVar2.f());
                    oVar2.H(rVar);
                    rVar.J(oVar2);
                }
                return false;
            default:
                return jVar == jVar2;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return ">";
        }
    }
}
