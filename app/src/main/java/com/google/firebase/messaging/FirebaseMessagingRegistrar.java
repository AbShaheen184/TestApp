package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.r rVar, com.google.firebase.components.c cVar) {
        com.google.firebase.g gVar = (com.google.firebase.g) cVar.a(com.google.firebase.g.class);
        if (cVar.a(com.google.firebase.iid.internal.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(com.google.firebase.platforminfo.b.class), cVar.c(com.google.firebase.heartbeatinfo.g.class), (com.google.firebase.installations.d) cVar.a(com.google.firebase.installations.d.class), cVar.b(rVar), (com.google.firebase.events.c) cVar.a(com.google.firebase.events.c.class));
        }
        androidx.transition.k.i();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.r rVar = new com.google.firebase.components.r(com.google.firebase.datatransport.b.class, com.google.android.datatransport.e.class);
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(FirebaseMessaging.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(com.google.firebase.components.j.b(com.google.firebase.g.class));
        aVarB.a(new com.google.firebase.components.j(0, 0, com.google.firebase.iid.internal.a.class));
        aVarB.a(new com.google.firebase.components.j(0, 1, com.google.firebase.platforminfo.b.class));
        aVarB.a(new com.google.firebase.components.j(0, 1, com.google.firebase.heartbeatinfo.g.class));
        aVarB.a(com.google.firebase.components.j.b(com.google.firebase.installations.d.class));
        aVarB.a(new com.google.firebase.components.j(rVar, 0, 1));
        aVarB.a(com.google.firebase.components.j.b(com.google.firebase.events.c.class));
        aVarB.f = new com.google.firebase.heartbeatinfo.b(rVar, 1);
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), com.google.android.material.textfield.p.i(LIBRARY_NAME, "25.0.1"));
    }
}
