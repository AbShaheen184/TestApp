package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        int iN0 = aVar.n0();
        if (iN0 != 9) {
            return iN0 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.l0())) : Boolean.valueOf(aVar.d0());
        }
        aVar.j0();
        return null;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.f0((Boolean) obj);
    }
}
