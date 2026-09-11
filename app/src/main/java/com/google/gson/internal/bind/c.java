package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.gson.n {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(q qVar, com.google.gson.internal.o oVar) {
        this.b = qVar;
        this.c = oVar;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        switch (this.a) {
            case 0:
                if (aVar.n0() == 9) {
                    aVar.j0();
                    return null;
                }
                Collection collection = (Collection) ((com.google.gson.internal.o) this.c).a();
                aVar.a();
                while (aVar.a0()) {
                    collection.add(((q) this.b).c.b(aVar));
                }
                aVar.z();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object objB = ((v0) this.c).z.b(aVar);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new com.google.gson.i("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.Z(), 8);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.g();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((q) this.b).c(bVar, it.next());
                    }
                    bVar.z();
                } else {
                    bVar.Y();
                }
                break;
            default:
                ((v0) this.c).z.c(bVar, obj);
                break;
        }
    }

    public c(v0 v0Var, Class cls) {
        this.c = v0Var;
        this.b = cls;
    }
}
