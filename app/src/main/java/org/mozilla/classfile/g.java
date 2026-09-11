package org.mozilla.classfile;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public int a;
    public String b;
    public String c;
    public int d;

    public final boolean equals(Object obj) {
        String str = this.c;
        String str2 = this.b;
        int i = this.a;
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i == gVar.a && str2.equals(gVar.b) && str.equals(gVar.c);
    }

    public final int hashCode() {
        return this.d;
    }
}
