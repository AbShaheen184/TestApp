package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.a0()) {
            try {
                arrayList.add(Integer.valueOf(aVar.f0()));
            } catch (NumberFormatException e) {
                throw new com.google.gson.i(e, 8);
            }
        }
        aVar.z();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bVar.g();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            bVar.e0(atomicIntegerArray.get(i));
        }
        bVar.z();
    }
}
