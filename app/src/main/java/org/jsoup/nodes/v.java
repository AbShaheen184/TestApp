package org.jsoup.nodes;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class v extends n {
    public static boolean O(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // org.jsoup.nodes.o
    public void B(org.jsoup.internal.b bVar, f fVar) {
        String strJ = J();
        char[] cArr = l.a;
        l.c(strJ, bVar, fVar.e, fVar.y, 1);
    }

    @Override // org.jsoup.nodes.o
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public v l() {
        return (v) super.l();
    }

    @Override // org.jsoup.nodes.o
    public final String toString() {
        return A();
    }

    @Override // org.jsoup.nodes.o
    public String v() {
        return "#text";
    }
}
