package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.firebase.encoders.d {
    public static final d a = new d();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("sdkVersion");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("gmpAppId");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("platform");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("installationUuid");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("firebaseInstallationId");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("firebaseAuthenticationToken");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("appQualitySessionId");
    public static final com.google.firebase.encoders.c i = com.google.firebase.encoders.c.a("buildVersion");
    public static final com.google.firebase.encoders.c j = com.google.firebase.encoders.c.a("displayVersion");
    public static final com.google.firebase.encoders.c k = com.google.firebase.encoders.c.a("session");
    public static final com.google.firebase.encoders.c l = com.google.firebase.encoders.c.a("ndkPayload");
    public static final com.google.firebase.encoders.c m = com.google.firebase.encoders.c.a("appExitInfo");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        b0 b0Var = (b0) ((n2) obj);
        eVar.g(b, b0Var.b);
        eVar.g(c, b0Var.c);
        eVar.c(d, b0Var.d);
        eVar.g(e, b0Var.e);
        eVar.g(f, b0Var.f);
        eVar.g(g, b0Var.g);
        eVar.g(h, b0Var.h);
        eVar.g(i, b0Var.i);
        eVar.g(j, b0Var.j);
        eVar.g(k, b0Var.k);
        eVar.g(l, b0Var.l);
        eVar.g(m, b0Var.m);
    }
}
