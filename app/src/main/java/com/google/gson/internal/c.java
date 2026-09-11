package com.google.gson.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.gson.n {
    public volatile com.google.gson.n a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.google.gson.f d;
    public final /* synthetic */ com.google.gson.reflect.a e;
    public final /* synthetic */ d f;

    public c(d dVar, boolean z, boolean z2, com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        this.f = dVar;
        this.b = z;
        this.c = z2;
        this.d = fVar;
        this.e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (this.b) {
            aVar.t0();
            return null;
        }
        com.google.gson.n nVarE = this.a;
        if (nVarE == null) {
            com.google.gson.f fVar = this.d;
            com.google.gson.o oVar = this.f;
            com.google.gson.reflect.a aVar2 = this.e;
            com.google.gson.internal.bind.k kVar = fVar.d;
            kVar.getClass();
            ConcurrentHashMap concurrentHashMap = kVar.y;
            if (oVar == com.google.gson.internal.bind.k.z) {
                oVar = kVar;
            } else {
                Class clsA = aVar2.a();
                com.google.gson.o oVar2 = (com.google.gson.o) concurrentHashMap.get(clsA);
                if (oVar2 == null) {
                    com.google.gson.annotations.a aVar3 = (com.google.gson.annotations.a) clsA.getAnnotation(com.google.gson.annotations.a.class);
                    if (aVar3 != null) {
                        Class clsValue = aVar3.value();
                        if (com.google.gson.o.class.isAssignableFrom(clsValue)) {
                            com.google.gson.o oVar3 = (com.google.gson.o) kVar.e.h(new com.google.gson.reflect.a(clsValue), true).a();
                            com.google.gson.o oVar4 = (com.google.gson.o) concurrentHashMap.putIfAbsent(clsA, oVar3);
                            if (oVar4 != null) {
                                oVar3 = oVar4;
                            }
                            if (oVar3 == oVar) {
                                oVar = kVar;
                            }
                        }
                    }
                } else if (oVar2 == oVar) {
                    oVar = kVar;
                }
            }
            Iterator it = fVar.e.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        nVarE = fVar.e(aVar2);
                        break;
                    }
                    com.google.gson.b.g(aVar2, "GSON cannot serialize or deserialize ");
                    return null;
                }
                com.google.gson.o oVar5 = (com.google.gson.o) it.next();
                if (z) {
                    com.google.gson.n nVarA = oVar5.a(fVar, aVar2);
                    if (nVarA != null) {
                        nVarE = nVarA;
                        break;
                    }
                } else if (oVar5 == oVar) {
                    z = true;
                }
            }
            this.a = nVarE;
        }
        return nVarE.b(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        if (this.c) {
            bVar.Y();
            return;
        }
        com.google.gson.n nVarE = this.a;
        if (nVarE == null) {
            com.google.gson.f fVar = this.d;
            com.google.gson.o oVar = this.f;
            com.google.gson.reflect.a aVar = this.e;
            com.google.gson.internal.bind.k kVar = fVar.d;
            kVar.getClass();
            ConcurrentHashMap concurrentHashMap = kVar.y;
            if (oVar == com.google.gson.internal.bind.k.z) {
                oVar = kVar;
            } else {
                Class clsA = aVar.a();
                com.google.gson.o oVar2 = (com.google.gson.o) concurrentHashMap.get(clsA);
                if (oVar2 == null) {
                    com.google.gson.annotations.a aVar2 = (com.google.gson.annotations.a) clsA.getAnnotation(com.google.gson.annotations.a.class);
                    if (aVar2 != null) {
                        Class clsValue = aVar2.value();
                        if (com.google.gson.o.class.isAssignableFrom(clsValue)) {
                            com.google.gson.o oVar3 = (com.google.gson.o) kVar.e.h(new com.google.gson.reflect.a(clsValue), true).a();
                            com.google.gson.o oVar4 = (com.google.gson.o) concurrentHashMap.putIfAbsent(clsA, oVar3);
                            if (oVar4 != null) {
                                oVar3 = oVar4;
                            }
                            if (oVar3 == oVar) {
                                oVar = kVar;
                            }
                        }
                    }
                } else if (oVar2 == oVar) {
                    oVar = kVar;
                }
            }
            Iterator it = fVar.e.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        nVarE = fVar.e(aVar);
                        break;
                    } else {
                        com.google.gson.b.g(aVar, "GSON cannot serialize or deserialize ");
                        return;
                    }
                }
                com.google.gson.o oVar5 = (com.google.gson.o) it.next();
                if (z) {
                    com.google.gson.n nVarA = oVar5.a(fVar, aVar);
                    if (nVarA != null) {
                        nVarE = nVarA;
                        break;
                    }
                } else if (oVar5 == oVar) {
                    z = true;
                }
            }
            this.a = nVarE;
        }
        nVarE.c(bVar, obj);
    }
}
