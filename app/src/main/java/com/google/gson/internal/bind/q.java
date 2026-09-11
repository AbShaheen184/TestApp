package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.gson.n {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final com.google.gson.n c;
    public final Object d;

    public q(com.google.gson.f fVar, com.google.gson.n nVar, Type type) {
        this.b = fVar;
        this.c = nVar;
        this.d = type;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        switch (this.a) {
            case 0:
                int iN0 = aVar.n0();
                if (iN0 == 9) {
                    aVar.j0();
                    return null;
                }
                Map map = (Map) ((com.google.gson.internal.o) this.d).a();
                if (iN0 == 1) {
                    aVar.a();
                    while (aVar.a0()) {
                        aVar.a();
                        Object objB = ((q) this.b).c.b(aVar);
                        if (map.put(objB, ((q) this.c).c.b(aVar)) != null) {
                            throw new com.google.gson.i(androidx.privacysandbox.ads.adservices.java.internal.a.o(objB, "duplicate key: "), 8);
                        }
                        aVar.z();
                    }
                    aVar.z();
                } else {
                    aVar.g();
                    while (aVar.a0()) {
                        com.google.android.gms.measurement.internal.c0.H.getClass();
                        if (aVar instanceof n) {
                            n nVar = (n) aVar;
                            nVar.w0(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) nVar.A0()).next();
                            nVar.C0(entry.getValue());
                            nVar.C0(new com.google.gson.l((String) entry.getKey()));
                        } else {
                            int iW = aVar.D;
                            if (iW == 0) {
                                iW = aVar.w();
                            }
                            if (iW == 13) {
                                aVar.D = 9;
                            } else if (iW == 12) {
                                aVar.D = 8;
                            } else {
                                if (iW != 14) {
                                    throw aVar.v0("a name");
                                }
                                aVar.D = 10;
                            }
                        }
                        Object objB2 = ((q) this.b).c.b(aVar);
                        if (map.put(objB2, ((q) this.c).c.b(aVar)) != null) {
                            throw new com.google.gson.i(androidx.privacysandbox.ads.adservices.java.internal.a.o(objB2, "duplicate key: "), 8);
                        }
                    }
                    aVar.L();
                }
                return map;
            default:
                return this.c.b(aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        com.google.gson.n nVarD;
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                q qVar = (q) this.c;
                if (map == null) {
                    bVar.Y();
                } else {
                    bVar.m();
                    for (Map.Entry entry : map.entrySet()) {
                        bVar.N(String.valueOf(entry.getKey()));
                        qVar.c(bVar, entry.getValue());
                    }
                    bVar.L();
                }
                break;
            default:
                Type type = (Type) this.d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                com.google.gson.n nVar = this.c;
                if (type2 != type) {
                    com.google.gson.n nVarE = ((com.google.gson.f) this.b).e(new com.google.gson.reflect.a(type2));
                    if (nVarE instanceof w) {
                        com.google.gson.n nVar2 = nVar;
                        while ((nVar2 instanceof b0) && (nVarD = ((b0) nVar2).d()) != nVar2) {
                            nVar2 = nVarD;
                        }
                        if (nVar2 instanceof w) {
                            nVar = nVarE;
                        }
                    } else {
                        nVar = nVarE;
                    }
                }
                nVar.c(bVar, obj);
                break;
        }
    }

    public q(d dVar, q qVar, q qVar2, com.google.gson.internal.o oVar) {
        this.b = qVar;
        this.c = qVar2;
        this.d = oVar;
    }
}
