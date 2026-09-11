package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.google.firebase.encoders.d {
    public static final g a = new g();
    public static final com.google.firebase.encoders.c b = new com.google.firebase.encoders.c("startMs", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(1))));
    public static final com.google.firebase.encoders.c c = new com.google.firebase.encoders.c("endMs", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(2))));

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.firebase.transport.g gVar = (com.google.android.datatransport.runtime.firebase.transport.g) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.b(b, gVar.a);
        eVar.b(c, gVar.b);
    }
}
