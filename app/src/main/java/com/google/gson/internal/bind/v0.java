package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements com.google.gson.o {
    public final /* synthetic */ int e;
    public final /* synthetic */ Class y;
    public final /* synthetic */ com.google.gson.n z;

    public /* synthetic */ v0(Class cls, com.google.gson.n nVar, int i) {
        this.e = i;
        this.y = cls;
        this.z = nVar;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        switch (this.e) {
            case 0:
                if (aVar.a() == this.y) {
                    return this.z;
                }
                return null;
            default:
                Class<?> clsA = aVar.a();
                if (this.y.isAssignableFrom(clsA)) {
                    return new c(this, clsA);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return "Factory[type=" + this.y.getName() + ",adapter=" + this.z + "]";
            default:
                return "Factory[typeHierarchy=" + this.y.getName() + ",adapter=" + this.z + "]";
        }
    }
}
