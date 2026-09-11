package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a = 1;
    public final com.google.firebase.sessions.dagger.internal.c b;
    public final com.google.firebase.sessions.dagger.internal.c c;
    public final com.google.firebase.sessions.dagger.internal.c d;
    public final com.google.firebase.sessions.dagger.internal.c e;
    public final com.google.firebase.sessions.dagger.internal.c f;

    public u0(com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, com.google.firebase.sessions.dagger.internal.c cVar3, com.google.firebase.sessions.dagger.internal.c cVar4, com.google.firebase.sessions.dagger.internal.c cVar5) {
        this.b = cVar;
        this.c = cVar2;
        this.d = cVar3;
        this.e = cVar4;
        this.f = cVar5;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new t0((com.google.firebase.g) ((m0) this.f).b, (com.google.firebase.installations.d) this.b.get(), (com.google.firebase.sessions.settings.j) this.c.get(), (l) this.d.get(), (kotlin.coroutines.i) this.e.get());
            default:
                return new com.google.firebase.sessions.settings.c((j1) this.b.get(), (com.google.firebase.installations.d) this.c.get(), (b) this.d.get(), (com.google.firebase.sessions.settings.d) this.e.get(), (com.google.firebase.sessions.settings.n) this.f.get());
        }
    }

    public u0(m0 m0Var, com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, com.google.firebase.sessions.dagger.internal.c cVar3, com.google.firebase.sessions.dagger.internal.c cVar4) {
        this.f = m0Var;
        this.b = cVar;
        this.c = cVar2;
        this.d = cVar3;
        this.e = cVar4;
    }
}
