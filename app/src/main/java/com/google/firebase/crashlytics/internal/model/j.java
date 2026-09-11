package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.google.firebase.encoders.d {
    public static final j a = new j();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("generator");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("identifier");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("appQualitySessionId");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("startedAt");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("endedAt");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("crashed");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("app");
    public static final com.google.firebase.encoders.c i = com.google.firebase.encoders.c.a("user");
    public static final com.google.firebase.encoders.c j = com.google.firebase.encoders.c.a("os");
    public static final com.google.firebase.encoders.c k = com.google.firebase.encoders.c.a("device");
    public static final com.google.firebase.encoders.c l = com.google.firebase.encoders.c.a("events");
    public static final com.google.firebase.encoders.c m = com.google.firebase.encoders.c.a("generatorType");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        j0 j0Var = (j0) ((m2) obj);
        eVar.g(b, j0Var.a);
        eVar.g(c, j0Var.b.getBytes(n2.a));
        eVar.g(d, j0Var.c);
        eVar.b(e, j0Var.d);
        eVar.g(f, j0Var.e);
        eVar.a(g, j0Var.f);
        eVar.g(h, j0Var.g);
        eVar.g(i, j0Var.h);
        eVar.g(j, j0Var.i);
        eVar.g(k, j0Var.j);
        eVar.g(l, j0Var.k);
        eVar.c(m, j0Var.l);
    }
}
