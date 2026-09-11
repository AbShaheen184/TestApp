package org.jsoup.nodes;

import java.util.Arrays;
import org.jsoup.parser.f0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j {
    public final org.jsoup.select.e G;

    static {
        String[] strArr = org.jsoup.internal.k.a;
        org.jsoup.select.v.Z(org.jsoup.internal.k.j(Arrays.asList(org.jsoup.internal.b.c), ", "));
    }

    public m(f0 f0Var, b bVar) {
        super(f0Var, null, bVar);
        this.G = new org.jsoup.select.e();
    }

    @Override // org.jsoup.nodes.o
    public final void G(o oVar) {
        super.G(oVar);
        this.G.remove(oVar);
    }

    @Override // org.jsoup.nodes.j
    /* JADX INFO: renamed from: Q */
    public final j l() {
        return (m) super.l();
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.o
    /* JADX INFO: renamed from: clone */
    public final Object l() {
        return (m) super.l();
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.o
    public final o l() {
        return (m) super.l();
    }
}
