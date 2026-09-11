package com.google.firebase.installations;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {
    public final j a;
    public final com.google.android.gms.tasks.j b;

    public f(j jVar, com.google.android.gms.tasks.j jVar2) {
        this.a = jVar;
        this.b = jVar2;
    }

    @Override // com.google.firebase.installations.i
    public final boolean a(com.google.firebase.installations.local.b bVar) {
        if (bVar.b != 4 || this.a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            com.google.gson.b.h("Null token");
            return false;
        }
        this.b.b(new a(bVar.e, bVar.f, str));
        return true;
    }

    @Override // com.google.firebase.installations.i
    public final boolean b(Exception exc) {
        this.b.c(exc);
        return true;
    }
}
