package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.google.firebase.encoders.d {
    public static final l a = new l();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("baseAddress");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("size");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("name");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("uuid");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        s0 s0Var = (s0) ((w1) obj);
        eVar.b(b, s0Var.a);
        eVar.b(c, s0Var.b);
        eVar.g(d, s0Var.c);
        String str = s0Var.d;
        eVar.g(e, str != null ? str.getBytes(n2.a) : null);
    }
}
