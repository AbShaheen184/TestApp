package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t {
    public final Class a;
    public final String b;

    public s(Class cls, String str) {
        this.a = cls;
        this.b = "::".concat(str);
    }

    @Override // org.jsoup.select.p
    public final int a() {
        return 1;
    }

    @Override // org.jsoup.select.t
    public final boolean g(org.jsoup.nodes.o oVar) {
        return this.a.isInstance(oVar);
    }

    public final String toString() {
        return this.b;
    }
}
