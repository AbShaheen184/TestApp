package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final r c = new r(q.e, 0);
    public static final r d = new r(q.C, 1);
    public final q a;
    public final int b;

    public r(q qVar, int i) {
        this.a = qVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.b == rVar.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
