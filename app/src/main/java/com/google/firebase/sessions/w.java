package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements com.google.firebase.sessions.dagger.internal.b {
    public final m0 a;
    public final com.google.firebase.sessions.dagger.internal.c b;
    public final com.google.firebase.sessions.dagger.internal.c c;
    public final com.google.firebase.sessions.dagger.internal.c d;

    public w(m0 m0Var, com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, com.google.firebase.sessions.dagger.internal.c cVar3) {
        this.a = m0Var;
        this.b = cVar;
        this.c = cVar2;
        this.d = cVar3;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new o((com.google.firebase.g) this.a.b, (com.google.firebase.sessions.settings.j) this.b.get(), (kotlin.coroutines.i) this.c.get(), (y0) this.d.get());
    }
}
