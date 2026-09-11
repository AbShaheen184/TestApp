package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c1 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        try {
            return Integer.valueOf(aVar.f0());
        } catch (NumberFormatException e) {
            throw new com.google.gson.i(e, 8);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.Y();
        } else {
            bVar.e0(number.intValue());
        }
    }
}
