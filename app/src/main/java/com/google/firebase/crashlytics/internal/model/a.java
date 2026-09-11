package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.google.firebase.encoders.d {
    public static final a a = new a();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("arch");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("libraryName");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("buildId");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        e0 e0Var = (e0) ((o1) obj);
        eVar.g(b, e0Var.a);
        eVar.g(c, e0Var.b);
        eVar.g(d, e0Var.c);
    }
}
