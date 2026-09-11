package com.google.firebase.sessions;

import android.content.Context;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a;
    public final m0 b;
    public final com.google.firebase.sessions.dagger.internal.c c;

    public r(com.google.firebase.sessions.dagger.internal.c cVar, m0 m0Var) {
        this.a = 2;
        this.c = cVar;
        this.b = m0Var;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.b;
                kotlin.coroutines.i iVar = (kotlin.coroutines.i) this.c.get();
                context.getClass();
                iVar.getClass();
                return p.a(com.google.firebase.sessions.settings.h.a, new androidx.compose.ui.draw.i(new com.app.mlounge.ui.screens.player.j0(20)), CoroutineScopeKt.CoroutineScope(iVar), new androidx.navigation.compose.p(context, 5));
            case 1:
                return new f0((Context) this.b.b, (k1) this.c.get());
            default:
                return new com.google.firebase.sessions.settings.d((b) this.c.get(), (kotlin.coroutines.i) this.b.b);
        }
    }

    public /* synthetic */ r(m0 m0Var, com.google.firebase.sessions.dagger.internal.c cVar, int i) {
        this.a = i;
        this.b = m0Var;
        this.c = cVar;
    }
}
