package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class n extends p {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public n(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        int iS;
        org.jsoup.nodes.j jVar3 = jVar2.e;
        if (jVar3 == null || (jVar3 instanceof org.jsoup.nodes.g)) {
            return false;
        }
        switch (this.c) {
            case 0:
                iS = jVar2.S() + 1;
                break;
            case 1:
                org.jsoup.nodes.j jVar4 = jVar2.e;
                iS = 0;
                if (jVar4 != null) {
                    iS = (jVar4.B.size() != 0 ? jVar4.P().size() : 0) - jVar2.S();
                }
                break;
            case 2:
                iS = 0;
                if (jVar2.e != null) {
                    for (org.jsoup.nodes.j jVarT = jVar2; jVarT != null; jVarT = jVarT.t()) {
                        if (jVarT.A.z.equals(jVar2.A.z)) {
                            iS++;
                        }
                    }
                }
                break;
            default:
                org.jsoup.nodes.j jVar5 = jVar2.e;
                iS = 0;
                if (jVar5 != null) {
                    int size = jVar5.B.size();
                    int i = 0;
                    while (iS < size) {
                        org.jsoup.nodes.o oVarI = jVar5.i(iS);
                        if (oVarI.y().equals(jVar2.A.z)) {
                            i++;
                        }
                        if (oVarI == jVar2) {
                            iS = i;
                        } else {
                            iS++;
                        }
                        break;
                    }
                    iS = i;
                }
                break;
        }
        int i2 = this.a;
        int i3 = this.b;
        if (i2 == 0) {
            return iS == i3;
        }
        int i4 = iS - i3;
        return i4 * i2 >= 0 && i4 % i2 == 0;
    }

    public String toString() {
        String str;
        String str2;
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            str = ":%s(%3$d)";
        } else {
            str = i == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)";
        }
        switch (this.c) {
            case 0:
                str2 = "nth-child";
                break;
            case 1:
                str2 = "nth-last-child";
                break;
            case 2:
                str2 = "nth-last-of-type";
                break;
            default:
                str2 = "nth-of-type";
                break;
        }
        return String.format(str, str2, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
