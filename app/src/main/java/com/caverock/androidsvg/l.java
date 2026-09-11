package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public n a;
    public r0 b;
    public int c;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        sb.append(" {...} (src=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
