package com.caverock.androidsvg;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public f(int i, int i2, boolean z, boolean z2, String str) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // com.caverock.androidsvg.e
    public final boolean a(x0 x0Var) {
        int i;
        int i2;
        boolean z = this.d;
        String strN = this.e;
        if (z && strN == null) {
            strN = x0Var.n();
        }
        v0 v0Var = x0Var.b;
        if (v0Var != null) {
            Iterator it = v0Var.getChildren().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                x0 x0Var2 = (x0) ((z0) it.next());
                if (x0Var2 == x0Var) {
                    i = i2;
                }
                if (strN == null || x0Var2.n().equals(strN)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.c ? i + 1 : i2 - i;
        int i4 = this.b;
        int i5 = this.a;
        if (i5 == 0) {
            if (i3 == i4) {
                return true;
            }
            return false;
        }
        int i6 = i3 - i4;
        if (i6 % i5 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i5))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.c ? "" : "last-";
        int i = this.b;
        boolean z = this.d;
        int i2 = this.a;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
