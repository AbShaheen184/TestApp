package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.google.firebase.encoders.d {
    public static final g a = new g();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("eventType");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("sessionData");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("applicationInfo");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        q0Var.getClass();
        eVar.g(b, n.SESSION_START);
        eVar.g(c, q0Var.a);
        eVar.g(d, q0Var.b);
    }
}
