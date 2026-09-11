package com.caverock.androidsvg;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e {
    public final boolean a;
    public final String b;

    public k(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    @Override // com.caverock.androidsvg.e
    public final boolean a(x0 x0Var) {
        int i;
        boolean z = this.a;
        String strN = this.b;
        if (z && strN == null) {
            strN = x0Var.n();
        }
        v0 v0Var = x0Var.b;
        if (v0Var != null) {
            Iterator it = v0Var.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                x0 x0Var2 = (x0) ((z0) it.next());
                if (strN == null || x0Var2.n().equals(strN)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? androidx.privacysandbox.ads.adservices.java.internal.a.q("only-of-type <", this.b, ">") : "only-child";
    }
}
