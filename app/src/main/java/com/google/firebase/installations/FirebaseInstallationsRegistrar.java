package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.android.material.textfield.p;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import com.google.firebase.components.s;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(com.google.firebase.components.c cVar) {
        return new c((com.google.firebase.g) cVar.a(com.google.firebase.g.class), cVar.c(com.google.firebase.heartbeatinfo.f.class), (ExecutorService) cVar.f(new r(com.google.firebase.annotations.concurrent.a.class, ExecutorService.class)), new com.google.firebase.concurrent.i((Executor) cVar.f(new r(com.google.firebase.annotations.concurrent.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(d.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(com.google.firebase.components.j.b(com.google.firebase.g.class));
        aVarB.a(new com.google.firebase.components.j(0, 1, com.google.firebase.heartbeatinfo.f.class));
        aVarB.a(new com.google.firebase.components.j(new r(com.google.firebase.annotations.concurrent.a.class, ExecutorService.class), 1, 0));
        aVarB.a(new com.google.firebase.components.j(new r(com.google.firebase.annotations.concurrent.b.class, Executor.class), 1, 0));
        aVarB.f = new s(18);
        com.google.firebase.components.b bVarB = aVarB.b();
        com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e();
        com.google.firebase.components.a aVarB2 = com.google.firebase.components.b.b(com.google.firebase.heartbeatinfo.e.class);
        aVarB2.e = 1;
        aVarB2.f = new androidx.media3.exoplayer.analytics.e(eVar);
        return Arrays.asList(bVarB, aVarB2.b(), p.i(LIBRARY_NAME, "18.0.0"));
    }
}
