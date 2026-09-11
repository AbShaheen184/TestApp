package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements com.google.firebase.sessions.dagger.internal.b {
    public final com.google.firebase.sessions.dagger.internal.c a;
    public final com.google.firebase.sessions.dagger.internal.c b;
    public final com.google.firebase.sessions.dagger.internal.c c;
    public final com.google.firebase.sessions.dagger.internal.c d;
    public final com.google.firebase.sessions.dagger.internal.c e;
    public final com.google.firebase.sessions.dagger.internal.c f;
    public final com.google.firebase.sessions.dagger.internal.c g;

    public f1(com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, com.google.firebase.sessions.dagger.internal.c cVar3, com.google.firebase.sessions.dagger.internal.c cVar4, com.google.firebase.sessions.dagger.internal.c cVar5, com.google.firebase.sessions.dagger.internal.c cVar6, com.google.firebase.sessions.dagger.internal.c cVar7) {
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.d = cVar4;
        this.e = cVar5;
        this.f = cVar6;
        this.g = cVar7;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new e1((com.google.firebase.sessions.settings.j) this.a.get(), (v0) this.b.get(), (t0) this.c.get(), (j1) this.d.get(), (androidx.datastore.core.e) this.e.get(), (f0) this.f.get(), (kotlin.coroutines.i) this.g.get());
    }
}
