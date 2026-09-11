package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.google.gson.n {
    public static final t c = new t(1);
    public final com.google.gson.f a;
    public final int b;

    public u(com.google.gson.f fVar, int i) {
        this.a = fVar;
        this.b = i;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iN0 = aVar.n0();
        int iE = androidx.constraintlayout.core.g.e(iN0);
        if (iE == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iE != 2) {
            arrayList = null;
        } else {
            aVar.g();
            arrayList = new com.google.gson.internal.n(true);
        }
        if (arrayList == null) {
            return d(iN0, aVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.a0()) {
                String strH0 = arrayList instanceof Map ? aVar.h0() : null;
                int iN1 = aVar.n0();
                int iE2 = androidx.constraintlayout.core.g.e(iN1);
                if (iE2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iE2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.g();
                    arrayList2 = new com.google.gson.internal.n(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(iN1, aVar);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strH0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.z();
                } else {
                    aVar.L();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.Y();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.f fVar = this.a;
        fVar.getClass();
        com.google.gson.n nVarE = fVar.e(new com.google.gson.reflect.a(cls));
        if (!(nVarE instanceof u)) {
            nVarE.c(bVar, obj);
        } else {
            bVar.m();
            bVar.L();
        }
    }

    public final Serializable d(int i, com.google.gson.stream.a aVar) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 5) {
            return aVar.l0();
        }
        if (iE == 6) {
            return com.google.android.datatransport.runtime.backends.c.b(this.b, aVar);
        }
        if (iE == 7) {
            return Boolean.valueOf(aVar.d0());
        }
        if (iE == 8) {
            aVar.j0();
            return null;
        }
        net.luminis.tls.engine.impl.c.r("Unexpected token: ".concat(com.google.android.datatransport.runtime.backends.c.x(i)));
        return null;
    }
}
