package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements com.google.firebase.encoders.d {
    public static final y a = new y();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("platform");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("version");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("buildVersion");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("jailbroken");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        i1 i1Var = (i1) ((k2) obj);
        eVar.c(b, i1Var.a);
        eVar.g(c, i1Var.b);
        eVar.g(d, i1Var.c);
        eVar.a(e, i1Var.d);
    }
}
