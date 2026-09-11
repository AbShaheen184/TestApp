package com.google.gson.internal.bind;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.gson.o {
    public static final j z;
    public final com.google.android.gms.measurement.internal.f0 e;
    public final ConcurrentHashMap y = new ConcurrentHashMap();

    static {
        int i = 0;
        z = new j(i);
        new j(i);
    }

    public k(com.google.android.gms.measurement.internal.f0 f0Var) {
        this.e = f0Var;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        com.google.gson.annotations.a aVar2 = (com.google.gson.annotations.a) aVar.a().getAnnotation(com.google.gson.annotations.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.e, fVar, aVar, aVar2, true);
    }

    public final com.google.gson.n b(com.google.android.gms.measurement.internal.f0 f0Var, com.google.gson.f fVar, com.google.gson.reflect.a aVar, com.google.gson.annotations.a aVar2, boolean z2) {
        com.google.gson.n nVarA;
        Object objA = f0Var.h(new com.google.gson.reflect.a(aVar2.value()), true).a();
        boolean zNullSafe = aVar2.nullSafe();
        if (objA instanceof com.google.gson.n) {
            nVarA = (com.google.gson.n) objA;
        } else {
            if (!(objA instanceof com.google.gson.o)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            com.google.gson.o oVar = (com.google.gson.o) objA;
            if (z2) {
                com.google.gson.o oVar2 = (com.google.gson.o) this.y.putIfAbsent(aVar.a(), oVar);
                if (oVar2 != null) {
                    oVar = oVar2;
                }
            }
            nVarA = oVar.a(fVar, aVar);
        }
        return (nVarA == null || !zNullSafe) ? nVarA : nVarA.a();
    }
}
