package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements com.google.firebase.encoders.d {
    public static final t a = new t();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("timestamp");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("type");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("app");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("device");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("log");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("rollouts");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        p0 p0Var = (p0) ((j2) obj);
        eVar.b(b, p0Var.a);
        eVar.g(c, p0Var.b);
        eVar.g(d, p0Var.c);
        eVar.g(e, p0Var.d);
        eVar.g(f, p0Var.e);
        eVar.g(g, p0Var.f);
    }
}
