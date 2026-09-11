package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements com.google.gson.o {
    public final k A;
    public final com.google.android.gms.measurement.internal.f0 e;
    public final int y;
    public final com.google.gson.internal.d z;

    public a0(com.google.android.gms.measurement.internal.f0 f0Var, int i, com.google.gson.internal.d dVar, k kVar) {
        List list = Collections.EMPTY_LIST;
        this.e = f0Var;
        this.y = i;
        this.z = dVar;
        this.A = kVar;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + com.google.gson.internal.reflect.c.c(field) + " and " + com.google.gson.internal.reflect.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        if (!Object.class.isAssignableFrom(clsA)) {
            return null;
        }
        com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
        if (!Modifier.isStatic(clsA.getModifiers()) && (clsA.isAnonymousClass() || clsA.isLocalClass())) {
            return new com.google.gson.c(2);
        }
        List list = Collections.EMPTY_LIST;
        com.google.gson.internal.h.e();
        return com.google.gson.internal.reflect.c.a.n(clsA) ? new z(clsA, c(fVar, aVar, clsA, true)) : new x(this.e.h(aVar, true), c(fVar, aVar, clsA, false));
    }

    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final com.google.gson.internal.bind.y c(com.google.gson.f r30, com.google.gson.reflect.a r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.a0.c(com.google.gson.f, com.google.gson.reflect.a, java.lang.Class, boolean):com.google.gson.internal.bind.y");
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        com.google.gson.internal.d dVar = this.z;
        dVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || dVar.b(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? dVar.e : dVar.y;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
