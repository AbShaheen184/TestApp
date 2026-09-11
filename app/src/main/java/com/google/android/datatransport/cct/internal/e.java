package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.google.firebase.encoders.d {
    public static final e a = new e();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("privacyContext");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("productIdOrigin");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, ((o) ((a0) obj)).a);
        eVar.g(c, z.e);
    }
}
