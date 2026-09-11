package com.google.firebase.installations;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {
    public final com.google.android.gms.tasks.j a;

    public g(com.google.android.gms.tasks.j jVar) {
        this.a = jVar;
    }

    @Override // com.google.firebase.installations.i
    public final boolean a(com.google.firebase.installations.local.b bVar) {
        int i = bVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(bVar.a);
        return true;
    }

    @Override // com.google.firebase.installations.i
    public final boolean b(Exception exc) {
        return false;
    }
}
