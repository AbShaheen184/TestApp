package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements com.google.firebase.encoders.d {
    public static final v a = new v();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("rolloutVariant");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("parameterKey");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("parameterValue");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("templateVersion");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        e1 e1Var = (e1) ((h2) obj);
        eVar.g(b, e1Var.a);
        eVar.g(c, e1Var.b);
        eVar.g(d, e1Var.c);
        eVar.b(e, e1Var.d);
    }
}
