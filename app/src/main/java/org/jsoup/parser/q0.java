package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends o0 {
    public boolean k;

    @Override // org.jsoup.parser.o0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ o0 f() {
        f();
        return this;
    }

    @Override // org.jsoup.parser.o0, org.jsoup.parser.r0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void f() {
        super.f();
        this.k = true;
    }

    public final String toString() {
        boolean z = this.k;
        String str = z ? "<!" : "<?";
        String str2 = z ? ">" : "?>";
        org.jsoup.nodes.b bVar = this.g;
        if (bVar == null || bVar.size() <= 0) {
            StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str);
            sbN.append(n());
            sbN.append(str2);
            return sbN.toString();
        }
        StringBuilder sbN2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str);
        sbN2.append(n());
        sbN2.append(" ");
        sbN2.append(this.g.toString());
        sbN2.append(str2);
        return sbN2.toString();
    }
}
