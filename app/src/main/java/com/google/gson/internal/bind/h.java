package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class h implements com.google.gson.o {
    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        if (!Enum.class.isAssignableFrom(clsA) || clsA == Enum.class) {
            return null;
        }
        if (!clsA.isEnum()) {
            clsA = clsA.getSuperclass();
        }
        return new i(clsA);
    }
}
