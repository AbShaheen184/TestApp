package com.google.gson.internal.bind;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        try {
            com.google.gson.internal.h.c(strL0);
            return new BigInteger(strL0);
        } catch (NumberFormatException e) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Failed parsing '", strL0, "' as BigInteger; at path ");
            sbX.append(aVar.Z());
            throw new com.google.gson.i(8, sbX.toString(), e);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.g0((BigInteger) obj);
    }
}
