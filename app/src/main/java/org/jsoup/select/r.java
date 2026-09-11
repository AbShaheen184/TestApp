package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends t {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public r(String str) {
        StringBuilder sbB = org.jsoup.internal.k.b();
        org.jsoup.internal.k.a(str, sbB, false);
        this.b = org.jsoup.internal.b.c(org.jsoup.internal.k.l(sbB));
    }

    @Override // org.jsoup.select.p
    public final int a() {
        switch (this.a) {
            case 0:
                return 6;
            default:
                return 8;
        }
    }

    @Override // org.jsoup.select.t
    public final boolean g(org.jsoup.nodes.o oVar) {
        switch (this.a) {
            case 0:
                return org.jsoup.internal.b.c(oVar.x()).contains((String) this.b);
            default:
                return ((org.jsoup.helper.k) this.b).b(oVar.x()).a();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q(":contains(", (String) this.b, ")");
            default:
                return String.format(":matches(%s)", (org.jsoup.helper.k) this.b);
        }
    }

    public r(org.jsoup.helper.k kVar) {
        this.b = kVar;
    }
}
