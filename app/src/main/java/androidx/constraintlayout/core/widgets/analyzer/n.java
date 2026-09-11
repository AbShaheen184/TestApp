package androidx.constraintlayout.core.widgets.analyzer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.e == nVar.b) {
                    c(this.c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(androidx.constraintlayout.core.c cVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) ((androidx.constraintlayout.core.widgets.d) arrayList.get(0)).S;
        cVar.t();
        eVar.b(cVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((androidx.constraintlayout.core.widgets.d) arrayList.get(i2)).b(cVar, false);
        }
        if (i == 0 && eVar.y0 > 0) {
            androidx.constraintlayout.core.widgets.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.z0 > 0) {
            androidx.constraintlayout.core.widgets.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(i3);
            com.google.firebase.heartbeatinfo.e eVar2 = new com.google.firebase.heartbeatinfo.e();
            new WeakReference(dVar);
            androidx.constraintlayout.core.c.n(dVar.H);
            androidx.constraintlayout.core.c.n(dVar.I);
            androidx.constraintlayout.core.c.n(dVar.J);
            androidx.constraintlayout.core.c.n(dVar.K);
            androidx.constraintlayout.core.c.n(dVar.L);
            this.d.add(eVar2);
        }
        if (i == 0) {
            iN = androidx.constraintlayout.core.c.n(eVar.H);
            iN2 = androidx.constraintlayout.core.c.n(eVar.J);
            cVar.t();
        } else {
            iN = androidx.constraintlayout.core.c.n(eVar.I);
            iN2 = androidx.constraintlayout.core.c.n(eVar.K);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, n nVar) {
        int i2 = nVar.b;
        for (androidx.constraintlayout.core.widgets.d dVar : this.a) {
            ArrayList arrayList = nVar.a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            if (i == 0) {
                dVar.m0 = i2;
            } else {
                dVar.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM = androidx.privacysandbox.ads.adservices.java.internal.a.m(this.b, "] <", sb);
        for (androidx.constraintlayout.core.widgets.d dVar : this.a) {
            StringBuilder sbD = androidx.constraintlayout.core.g.d(strM, " ");
            sbD.append(dVar.g0);
            strM = sbD.toString();
        }
        return strM.concat(" >");
    }
}
