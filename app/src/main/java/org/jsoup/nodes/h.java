package org.jsoup.nodes;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n {
    public static final String B = "/".concat("doctypeInternalSubset");

    public h(String str, String str2, String str3) {
        super(str);
        org.jsoup.helper.n.H(str2);
        org.jsoup.helper.n.H(str3);
        b bVarF = f();
        bVarF.c("name", str);
        bVarF.c("publicId", str2);
        bVarF.c("systemId", str3);
        if (M("publicId")) {
            f().c("pubSysKey", "PUBLIC");
        } else if (M("systemId")) {
            f().c("pubSysKey", "SYSTEM");
        }
    }

    @Override // org.jsoup.nodes.o
    public final void B(org.jsoup.internal.b bVar, f fVar) {
        if (fVar.C != 1 || M("publicId") || M("systemId")) {
            bVar.b("<!DOCTYPE");
        } else {
            bVar.b("<!doctype");
        }
        if (M("name")) {
            bVar.b(" ").b(d("name"));
        }
        if (M("pubSysKey")) {
            bVar.b(" ").b(d("pubSysKey"));
        }
        if (M("publicId")) {
            bVar.b(" \"").b(d("publicId")).a('\"');
        }
        if (M("systemId")) {
            bVar.b(" \"").b(d("systemId")).a('\"');
        }
        b bVarF = f();
        String str = B;
        if (bVarF.j(str)) {
            bVar.b(" [").b(d(str)).a(']');
        }
        bVar.a('>');
    }

    public final boolean M(String str) {
        return !org.jsoup.internal.k.f(d(str));
    }

    @Override // org.jsoup.nodes.o
    public final String v() {
        return "#doctype";
    }
}
