package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 {
    @Override // org.jsoup.parser.o0, org.jsoup.parser.r0
    /* JADX INFO: renamed from: m */
    public final o0 f() {
        super.f();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str = this.f ? "/>" : ">";
        org.jsoup.nodes.b bVar = this.g;
        if (bVar == null || bVar.size() <= 0) {
            return "<" + n() + str;
        }
        return "<" + n() + " " + this.g.toString() + str;
    }
}
