package com.google.firebase.messaging;

import io.hopmonsdk.Hopmn;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.google.firebase.encoders.d {
    public static final a a = new a();
    public static final com.google.firebase.encoders.c b = new com.google.firebase.encoders.c("projectNumber", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(1))));
    public static final com.google.firebase.encoders.c c = new com.google.firebase.encoders.c("messageId", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(2))));
    public static final com.google.firebase.encoders.c d = new com.google.firebase.encoders.c("instanceId", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(3))));
    public static final com.google.firebase.encoders.c e = new com.google.firebase.encoders.c("messageType", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(4))));
    public static final com.google.firebase.encoders.c f = new com.google.firebase.encoders.c("sdkPlatform", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(5))));
    public static final com.google.firebase.encoders.c g = new com.google.firebase.encoders.c("packageName", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(6))));
    public static final com.google.firebase.encoders.c h = new com.google.firebase.encoders.c("collapseKey", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(7))));
    public static final com.google.firebase.encoders.c i = new com.google.firebase.encoders.c("priority", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(8))));
    public static final com.google.firebase.encoders.c j = new com.google.firebase.encoders.c("ttl", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(9))));
    public static final com.google.firebase.encoders.c k = new com.google.firebase.encoders.c("topic", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(10))));
    public static final com.google.firebase.encoders.c l = new com.google.firebase.encoders.c("bulkId", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(11))));
    public static final com.google.firebase.encoders.c m = new com.google.firebase.encoders.c(Hopmn.EVENT, coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(12))));
    public static final com.google.firebase.encoders.c n = new com.google.firebase.encoders.c("analyticsLabel", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(13))));
    public static final com.google.firebase.encoders.c o = new com.google.firebase.encoders.c("campaignId", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(14))));
    public static final com.google.firebase.encoders.c p = new com.google.firebase.encoders.c("composerLabel", coil3.compose.internal.f.h(coil3.compose.internal.f.g(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(15))));

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.messaging.reporting.d dVar = (com.google.firebase.messaging.reporting.d) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.b(b, dVar.a);
        eVar.g(c, dVar.b);
        eVar.g(d, dVar.c);
        eVar.g(e, dVar.d);
        eVar.g(f, com.google.firebase.messaging.reporting.c.ANDROID);
        eVar.g(g, dVar.e);
        eVar.g(h, dVar.f);
        eVar.c(i, dVar.g);
        eVar.c(j, dVar.h);
        eVar.g(k, dVar.i);
        eVar.b(l, 0L);
        eVar.g(m, com.google.firebase.messaging.reporting.a.MESSAGE_DELIVERED);
        eVar.g(n, dVar.j);
        eVar.b(o, 0L);
        eVar.g(p, dVar.k);
    }
}
