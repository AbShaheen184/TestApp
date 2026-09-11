package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static m0 a(Object obj) {
        if (obj != null) {
            return new m0(obj, 2);
        }
        com.google.gson.b.h("instance cannot be null");
        return null;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l0((v0) ((com.google.firebase.sessions.dagger.internal.c) this.b).get());
            case 1:
                return new y0((e1) ((com.google.firebase.sessions.dagger.internal.c) this.b).get());
            default:
                return this.b;
        }
    }
}
