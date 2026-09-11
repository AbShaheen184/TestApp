package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends p {
    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        return g(jVar2);
    }

    @Override // org.jsoup.select.p
    public final boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        return g(nVar);
    }

    @Override // org.jsoup.select.p
    public final boolean f() {
        return true;
    }

    public abstract boolean g(org.jsoup.nodes.o oVar);
}
