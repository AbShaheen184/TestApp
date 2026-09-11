package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.google.firebase.encoders.d {
    public static final h a = new h();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("sessionId");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("firstSessionId");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("sessionIndex");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("eventTimestampUs");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("dataCollectionStatus");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("firebaseInstallationId");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("firebaseAuthenticationToken");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, x0Var.a);
        eVar.g(c, x0Var.b);
        eVar.c(d, x0Var.c);
        eVar.b(e, x0Var.d);
        eVar.g(f, x0Var.e);
        eVar.g(g, x0Var.f);
        eVar.g(h, x0Var.g);
    }
}
