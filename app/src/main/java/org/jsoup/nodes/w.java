package org.jsoup.nodes;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends n {
    public final boolean B;

    public w(String str, boolean z) {
        super(str);
        this.B = z;
    }

    @Override // org.jsoup.nodes.o
    public final void B(org.jsoup.internal.b bVar, f fVar) {
        org.jsoup.internal.b bVarB = bVar.b("<");
        boolean z = this.B;
        bVarB.b(z ? "!" : "?").b(J());
        b bVarF = f();
        bVarF.getClass();
        androidx.datastore.preferences.protobuf.c cVar = new androidx.datastore.preferences.protobuf.c(bVarF);
        while (true) {
            if (!cVar.hasNext()) {
                break;
            }
            a aVar = (a) cVar.next();
            String str = aVar.e;
            String str2 = aVar.y;
            String str3 = str2 != null ? str2 : "";
            if (!str.equals("#declaration")) {
                bVar.a(' ');
                bVar.b(str);
                if (!str3.isEmpty()) {
                    bVar.b("=\"");
                    char[] cArr = l.a;
                    l.c(str3, bVar, fVar.e, fVar.y, 2);
                    bVar.a('\"');
                }
            }
        }
        bVar.b(z ? "" : "?").b(">");
    }

    @Override // org.jsoup.nodes.o
    /* JADX INFO: renamed from: clone */
    public final Object l() {
        return (w) super.l();
    }

    @Override // org.jsoup.nodes.o
    public final o l() {
        return (w) super.l();
    }

    @Override // org.jsoup.nodes.o
    public final String toString() {
        return A();
    }

    @Override // org.jsoup.nodes.o
    public final String v() {
        return "#declaration";
    }
}
