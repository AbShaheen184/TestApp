package com.google.firebase.components;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements com.google.firebase.inject.b {
    public static final androidx.transition.k c = new androidx.transition.k(29);
    public static final f d = new f(1);
    public com.google.firebase.inject.a a;
    public volatile com.google.firebase.inject.b b;

    public p(androidx.transition.k kVar, com.google.firebase.inject.b bVar) {
        this.a = kVar;
        this.b = bVar;
    }

    public final void a(com.google.firebase.inject.a aVar) {
        com.google.firebase.inject.b bVar;
        com.google.firebase.inject.b bVar2;
        com.google.firebase.inject.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.e(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new androidx.media3.exoplayer.analytics.c(8, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.e(bVar);
        }
    }

    @Override // com.google.firebase.inject.b
    public final Object get() {
        return this.b.get();
    }
}
