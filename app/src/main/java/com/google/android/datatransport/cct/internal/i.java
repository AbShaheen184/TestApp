package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements com.google.firebase.encoders.d {
    public static final i a = new i();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("eventTimeMs");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("eventCode");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("complianceData");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("eventUptimeMs");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("sourceExtension");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("sourceExtensionJsonProto3");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("timezoneOffsetSeconds");
    public static final com.google.firebase.encoders.c i = com.google.firebase.encoders.c.a("networkConnectionInfo");
    public static final com.google.firebase.encoders.c j = com.google.firebase.encoders.c.a("experimentIds");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        s sVar = (s) ((e0) obj);
        eVar.b(b, sVar.a);
        eVar.g(c, sVar.b);
        eVar.g(d, sVar.c);
        eVar.b(e, sVar.d);
        eVar.g(f, sVar.e);
        eVar.g(g, sVar.f);
        eVar.b(h, sVar.g);
        eVar.g(i, sVar.h);
        eVar.g(j, sVar.i);
    }
}
