package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() != 9) {
            return this.a.b(aVar);
        }
        aVar.j0();
        return null;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        if (obj == null) {
            bVar.Y();
        } else {
            this.a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
