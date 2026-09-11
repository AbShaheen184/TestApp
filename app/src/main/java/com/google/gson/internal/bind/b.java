package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.gson.n {
    public static final a c = new a();
    public final Class a;
    public final q b;

    public b(com.google.gson.f fVar, com.google.gson.n nVar, Class cls) {
        this.b = new q(fVar, nVar, cls);
        this.a = cls;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.a0()) {
            arrayList.add(this.b.c.b(aVar));
        }
        aVar.z();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.Y();
            return;
        }
        bVar.g();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(bVar, Array.get(obj, i));
        }
        bVar.z();
    }
}
