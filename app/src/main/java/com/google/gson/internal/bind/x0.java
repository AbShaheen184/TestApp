package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements com.google.gson.o {
    public final /* synthetic */ Class e;
    public final /* synthetic */ Class y;
    public final /* synthetic */ com.google.gson.n z;

    public x0(Class cls, Class cls2, com.google.gson.n nVar) {
        this.e = cls;
        this.y = cls2;
        this.z = nVar;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        if (clsA == this.e || clsA == this.y) {
            return this.z;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.y.getName() + "+" + this.e.getName() + ",adapter=" + this.z + "]";
    }
}
