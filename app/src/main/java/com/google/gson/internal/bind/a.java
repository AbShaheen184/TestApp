package com.google.gson.internal.bind;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a implements com.google.gson.o {
    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        Type typeB = aVar.b();
        boolean z = typeB instanceof GenericArrayType;
        if (!z && (!(typeB instanceof Class) || !((Class) typeB).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) typeB).getGenericComponentType() : ((Class) typeB).getComponentType();
        return new b(fVar, fVar.e(new com.google.gson.reflect.a(genericComponentType)), com.google.gson.internal.h.g(genericComponentType));
    }
}
