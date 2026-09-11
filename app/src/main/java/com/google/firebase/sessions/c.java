package com.google.firebase.sessions;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.firebase.encoders.d {
    public static final c a = new c();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("packageName");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("versionName");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("appBuildVersion");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("deviceManufacturer");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("currentProcessDetails");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("appProcessDetails");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, aVar.a);
        eVar.g(c, aVar.b);
        eVar.g(d, aVar.c);
        eVar.g(e, Build.MANUFACTURER);
        eVar.g(f, aVar.d);
        eVar.g(g, aVar.e);
    }
}
