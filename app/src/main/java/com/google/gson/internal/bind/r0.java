package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class r0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        try {
            return UUID.fromString(strL0);
        } catch (IllegalArgumentException e) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Failed parsing '", strL0, "' as UUID; at path ");
            sbX.append(aVar.Z());
            throw new com.google.gson.i(8, sbX.toString(), e);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        bVar.h0(uuid == null ? null : uuid.toString());
    }
}
