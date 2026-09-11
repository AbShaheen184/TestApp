package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.firebase.encoders.d {
    public static final b a = new b();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("sdkVersion");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("model");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("hardware");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("device");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("product");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("osBuild");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("manufacturer");
    public static final com.google.firebase.encoders.c i = com.google.firebase.encoders.c.a("fingerprint");
    public static final com.google.firebase.encoders.c j = com.google.firebase.encoders.c.a("locale");
    public static final com.google.firebase.encoders.c k = com.google.firebase.encoders.c.a("country");
    public static final com.google.firebase.encoders.c l = com.google.firebase.encoders.c.a("mccMnc");
    public static final com.google.firebase.encoders.c m = com.google.firebase.encoders.c.a("applicationBuild");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        l lVar = (l) ((a) obj);
        eVar.g(b, lVar.a);
        eVar.g(c, lVar.b);
        eVar.g(d, lVar.c);
        eVar.g(e, lVar.d);
        eVar.g(f, lVar.e);
        eVar.g(g, lVar.f);
        eVar.g(h, lVar.g);
        eVar.g(i, lVar.h);
        eVar.g(j, lVar.i);
        eVar.g(k, lVar.j);
        eVar.g(l, lVar.k);
        eVar.g(m, lVar.l);
    }
}
