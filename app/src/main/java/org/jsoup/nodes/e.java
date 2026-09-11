package org.jsoup.nodes;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {
    @Override // org.jsoup.nodes.o
    public final void B(org.jsoup.internal.b bVar, f fVar) {
        String strJ = J();
        if (fVar.C != 2 || strJ.contains("<![CDATA[")) {
            bVar.b(strJ);
            return;
        }
        j jVar = this.e;
        if (jVar != null && jVar.A.z.equals("script")) {
            bVar.b("//<![CDATA[\n").b(strJ).b("\n//]]>");
            return;
        }
        j jVar2 = this.e;
        if (jVar2 == null || !jVar2.A.z.equals("style")) {
            bVar.b("<![CDATA[").b(strJ).b("]]>");
        } else {
            bVar.b("/*<![CDATA[*/\n").b(strJ).b("\n/*]]>*/");
        }
    }

    @Override // org.jsoup.nodes.o
    /* JADX INFO: renamed from: clone */
    public final Object l() {
        return (e) super.l();
    }

    @Override // org.jsoup.nodes.o
    public final o l() {
        return (e) super.l();
    }

    @Override // org.jsoup.nodes.o
    public final String v() {
        return "#data";
    }
}
