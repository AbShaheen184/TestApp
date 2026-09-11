package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.firebase.encoders.d {
    public static final b a = new b();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("pid");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("processName");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("reasonCode");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("importance");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("pss");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("rss");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("timestamp");
    public static final com.google.firebase.encoders.c i = com.google.firebase.encoders.c.a("traceFile");
    public static final com.google.firebase.encoders.c j = com.google.firebase.encoders.c.a("buildIdMappingForArch");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        d0 d0Var = (d0) ((p1) obj);
        eVar.c(b, d0Var.a);
        eVar.g(c, d0Var.b);
        eVar.c(d, d0Var.c);
        eVar.c(e, d0Var.d);
        eVar.b(f, d0Var.e);
        eVar.b(g, d0Var.f);
        eVar.b(h, d0Var.g);
        eVar.g(i, d0Var.h);
        eVar.g(j, d0Var.i);
    }
}
