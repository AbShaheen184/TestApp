package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements com.google.firebase.encoders.d {
    public static final i a = new i();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("arch");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("model");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("cores");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("ram");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("diskSpace");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("simulator");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("state");
    public static final com.google.firebase.encoders.c i = com.google.firebase.encoders.c.a("manufacturer");
    public static final com.google.firebase.encoders.c j = com.google.firebase.encoders.c.a("modelClass");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        n0 n0Var = (n0) ((v1) obj);
        eVar.c(b, n0Var.a);
        eVar.g(c, n0Var.b);
        eVar.c(d, n0Var.c);
        eVar.b(e, n0Var.d);
        eVar.b(f, n0Var.e);
        eVar.a(g, n0Var.f);
        eVar.c(h, n0Var.g);
        eVar.g(i, n0Var.h);
        eVar.g(j, n0Var.i);
    }
}
