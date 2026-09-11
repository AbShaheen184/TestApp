package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.google.firebase.encoders.d {
    public static final e a = new e();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("performance");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("crashlytics");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("sessionSamplingRate");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, kVar.a);
        eVar.g(c, kVar.b);
        eVar.d(d, kVar.c);
    }
}
