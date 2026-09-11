package com.google.firebase.sessions;

import android.content.Context;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a = 1;
    public final com.google.firebase.sessions.dagger.internal.c b;
    public final com.google.firebase.sessions.dagger.internal.c c;
    public final com.google.firebase.sessions.dagger.internal.c d;

    public s(com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, com.google.firebase.sessions.dagger.internal.c cVar3) {
        this.b = cVar;
        this.c = cVar2;
        this.d = cVar3;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) ((m0) this.d).b;
                kotlin.coroutines.i iVar = (kotlin.coroutines.i) this.b.get();
                l0 l0Var = (l0) this.c.get();
                context.getClass();
                iVar.getClass();
                l0Var.getClass();
                return p.a(l0Var, new androidx.compose.ui.draw.i(new androidx.compose.ui.text.font.e(l0Var, 19)), CoroutineScopeKt.CoroutineScope(iVar), new androidx.navigation.compose.p(context, 6));
            default:
                return new com.google.firebase.sessions.settings.n((kotlin.coroutines.i) this.b.get(), (j1) this.c.get(), (androidx.datastore.core.e) this.d.get());
        }
    }

    public s(m0 m0Var, com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2) {
        this.d = m0Var;
        this.b = cVar;
        this.c = cVar2;
    }
}
