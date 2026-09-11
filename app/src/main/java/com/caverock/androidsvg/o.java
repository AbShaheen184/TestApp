package com.caverock.androidsvg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public o(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(String str, int i, String str2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new b(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<b> arrayList = this.c;
        if (arrayList != null) {
            for (b bVar : arrayList) {
                sb.append('[');
                String str2 = bVar.a;
                String str3 = bVar.c;
                sb.append(str2);
                int iE = androidx.constraintlayout.core.g.e(bVar.b);
                if (iE == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iE == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iE == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<e> arrayList2 = this.d;
        if (arrayList2 != null) {
            for (e eVar : arrayList2) {
                sb.append(':');
                sb.append(eVar);
            }
        }
        return sb.toString();
    }
}
