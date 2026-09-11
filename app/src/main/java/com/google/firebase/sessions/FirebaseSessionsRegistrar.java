package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final v Companion = new v();
    private static final com.google.firebase.components.r appContext = com.google.firebase.components.r.a(Context.class);
    private static final com.google.firebase.components.r firebaseApp = com.google.firebase.components.r.a(com.google.firebase.g.class);
    private static final com.google.firebase.components.r firebaseInstallationsApi = com.google.firebase.components.r.a(com.google.firebase.installations.d.class);
    private static final com.google.firebase.components.r backgroundDispatcher = new com.google.firebase.components.r(com.google.firebase.annotations.concurrent.a.class, CoroutineDispatcher.class);
    private static final com.google.firebase.components.r blockingDispatcher = new com.google.firebase.components.r(com.google.firebase.annotations.concurrent.b.class, CoroutineDispatcher.class);
    private static final com.google.firebase.components.r transportFactory = com.google.firebase.components.r.a(com.google.android.datatransport.e.class);
    private static final com.google.firebase.components.r firebaseSessionsComponent = com.google.firebase.components.r.a(q.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(com.google.firebase.components.c cVar) {
        return (o) ((i) ((q) cVar.f(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q getComponents$lambda$1(com.google.firebase.components.c cVar) {
        Object objF = cVar.f(appContext);
        objF.getClass();
        Object objF2 = cVar.f(backgroundDispatcher);
        objF2.getClass();
        Object objF3 = cVar.f(blockingDispatcher);
        objF3.getClass();
        Object objF4 = cVar.f(firebaseApp);
        objF4.getClass();
        Object objF5 = cVar.f(firebaseInstallationsApi);
        objF5.getClass();
        com.google.firebase.inject.b bVarB = cVar.b(transportFactory);
        bVarB.getClass();
        i iVar = new i();
        iVar.a = m0.a((com.google.firebase.g) objF4);
        m0 m0VarA = m0.a((Context) objF);
        iVar.b = m0VarA;
        iVar.c = com.google.firebase.sessions.dagger.internal.a.a(new m(m0VarA, 2));
        iVar.d = com.google.firebase.sessions.dagger.internal.a.a(t.a);
        iVar.e = m0.a((com.google.firebase.installations.d) objF5);
        iVar.f = com.google.firebase.sessions.dagger.internal.a.a(new m(iVar.a, 1));
        m0 m0VarA2 = m0.a((kotlin.coroutines.i) objF3);
        iVar.g = m0VarA2;
        iVar.h = com.google.firebase.sessions.dagger.internal.a.a(new r(iVar.f, m0VarA2));
        iVar.i = m0.a((kotlin.coroutines.i) objF2);
        iVar.j = com.google.firebase.sessions.dagger.internal.a.a(new w0(iVar.c, com.google.firebase.sessions.dagger.internal.a.a(new u0(iVar.d, iVar.e, iVar.f, iVar.h, com.google.firebase.sessions.dagger.internal.a.a(new s((com.google.firebase.sessions.dagger.internal.c) iVar.i, iVar.d, com.google.firebase.sessions.dagger.internal.a.a(new r(iVar.b, iVar.g, 0)))))), 1));
        com.google.firebase.sessions.dagger.internal.c cVarA = com.google.firebase.sessions.dagger.internal.a.a(t.b);
        iVar.k = cVarA;
        iVar.l = com.google.firebase.sessions.dagger.internal.a.a(new w0(iVar.d, cVarA, 0));
        int i = 0;
        iVar.m = com.google.firebase.sessions.dagger.internal.a.a(new u0(iVar.a, (com.google.firebase.sessions.dagger.internal.c) iVar.e, iVar.j, com.google.firebase.sessions.dagger.internal.a.a(new m(m0.a(bVarB), i)), (com.google.firebase.sessions.dagger.internal.c) iVar.i));
        iVar.n = com.google.firebase.sessions.dagger.internal.a.a(new s(iVar.b, (com.google.firebase.sessions.dagger.internal.c) iVar.g, com.google.firebase.sessions.dagger.internal.a.a(new m0(iVar.l, i))));
        com.google.firebase.sessions.dagger.internal.c cVarA2 = com.google.firebase.sessions.dagger.internal.a.a(new f1(iVar.j, iVar.l, iVar.m, iVar.d, iVar.n, com.google.firebase.sessions.dagger.internal.a.a(new r(iVar.b, iVar.k, 1)), iVar.i));
        iVar.o = cVarA2;
        iVar.p = com.google.firebase.sessions.dagger.internal.a.a(new w(iVar.a, iVar.j, iVar.i, com.google.firebase.sessions.dagger.internal.a.a(new m0(cVarA2, 1))));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(o.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(com.google.firebase.components.j.a(firebaseSessionsComponent));
        aVarB.f = new com.google.firebase.components.s(28);
        aVarB.c(2);
        com.google.firebase.components.b bVarB = aVarB.b();
        com.google.firebase.components.a aVarB2 = com.google.firebase.components.b.b(q.class);
        aVarB2.a = "fire-sessions-component";
        aVarB2.a(com.google.firebase.components.j.a(appContext));
        aVarB2.a(com.google.firebase.components.j.a(backgroundDispatcher));
        aVarB2.a(com.google.firebase.components.j.a(blockingDispatcher));
        aVarB2.a(com.google.firebase.components.j.a(firebaseApp));
        aVarB2.a(com.google.firebase.components.j.a(firebaseInstallationsApi));
        aVarB2.a(new com.google.firebase.components.j(transportFactory, 1, 1));
        aVarB2.f = new com.google.firebase.components.s(29);
        return com.google.common.base.c.q(bVarB, aVarB2.b(), com.google.android.material.textfield.p.i(LIBRARY_NAME, "3.0.5"));
    }
}
