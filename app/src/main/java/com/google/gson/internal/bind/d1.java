package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class d1 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) {
        try {
            return new AtomicInteger(aVar.f0());
        } catch (NumberFormatException e) {
            throw new com.google.gson.i(e, 8);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.e0(((AtomicInteger) obj).get());
    }
}
