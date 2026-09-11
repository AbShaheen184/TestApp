package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    public final String a;
    public final org.jsoup.helper.k b;

    public j(String str, org.jsoup.helper.k kVar) {
        this.a = org.jsoup.internal.b.d(str);
        this.b = kVar;
    }

    @Override // org.jsoup.select.p
    public final int a() {
        return 8;
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        String str = this.a;
        return jVar2.q(str) && this.b.b(jVar2.d(str)).a();
    }

    public final String toString() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("[", this.a, "~=", this.b.toString(), "]");
    }
}
