package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ d(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        switch (this.a) {
            case 0:
                return new AtomicLong(((Number) this.b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.a0()) {
                    arrayList.add(Long.valueOf(((Number) this.b.b(aVar)).longValue()));
                }
                aVar.z();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                this.b.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.g();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.b.c(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.z();
                break;
        }
    }
}
