package com.google.firebase.sessions;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a;
    public final m0 b;

    public /* synthetic */ m(m0 m0Var, int i) {
        this.a = i;
        this.b = m0Var;
    }

    @Override // javax.inject.a
    public final Object get() {
        int i = this.a;
        m0 m0Var = this.b;
        switch (i) {
            case 0:
                return new l((com.google.firebase.inject.b) m0Var.b);
            case 1:
                com.google.firebase.g gVar = (com.google.firebase.g) m0Var.b;
                gVar.getClass();
                r0 r0Var = r0.a;
                return r0.a(gVar);
            default:
                return new com.google.firebase.sessions.settings.a((Context) m0Var.b);
        }
    }
}
