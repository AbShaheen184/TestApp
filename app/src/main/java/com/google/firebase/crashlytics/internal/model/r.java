package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.firebase.encoders.d {
    public static final r a = new r();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("processName");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("pid");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("importance");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("defaultProcess");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        z0 z0Var = (z0) ((c2) obj);
        eVar.g(b, z0Var.a);
        eVar.c(c, z0Var.b);
        eVar.c(d, z0Var.c);
        eVar.a(e, z0Var.d);
    }
}
