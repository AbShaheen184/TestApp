package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.gson.o {
    public final /* synthetic */ int e;
    public final com.google.android.gms.measurement.internal.f0 y;

    public /* synthetic */ d(com.google.android.gms.measurement.internal.f0 f0Var, int i) {
        this.e = i;
        this.y = f0Var;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        Type[] actualTypeArguments;
        int i = this.e;
        com.google.android.gms.measurement.internal.f0 f0Var = this.y;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type typeB = aVar.b();
                Class clsA = aVar.a();
                if (!Collection.class.isAssignableFrom(clsA)) {
                    return null;
                }
                Type typeH = com.google.gson.internal.h.h(typeB, clsA, Collection.class);
                type = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new c(new q(fVar, fVar.e(new com.google.gson.reflect.a(type)), type), f0Var.h(aVar, false));
            default:
                Type typeB2 = aVar.b();
                Class clsA2 = aVar.a();
                if (!Map.class.isAssignableFrom(clsA2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(clsA2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeH2 = com.google.gson.internal.h.h(typeB2, clsA2, Map.class);
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type2 = actualTypeArguments[0];
                Type type3 = actualTypeArguments[1];
                return new q(this, new q(fVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? f1.c : fVar.e(new com.google.gson.reflect.a(type2)), type2), new q(fVar, fVar.e(new com.google.gson.reflect.a(type3)), type3), f0Var.h(aVar, false));
        }
    }
}
