package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.firebase.encoders.d {
    public static final k a = new k();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("execution");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("customAttributes");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("internalKeys");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("background");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("currentProcessDetails");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("appProcessDetails");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("uiOrientation");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        q0 q0Var = (q0) ((d2) obj);
        eVar.g(b, q0Var.a);
        eVar.g(c, q0Var.b);
        eVar.g(d, q0Var.c);
        eVar.g(e, q0Var.d);
        eVar.g(f, q0Var.e);
        eVar.g(g, q0Var.f);
        eVar.c(h, q0Var.g);
    }
}
