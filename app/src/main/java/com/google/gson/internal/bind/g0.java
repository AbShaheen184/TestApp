package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        if (strL0.length() == 1) {
            return Character.valueOf(strL0.charAt(0));
        }
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Expecting character, got: ", strL0, "; at ");
        sbX.append(aVar.Z());
        throw new com.google.gson.i(sbX.toString(), 8);
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        bVar.h0(ch == null ? null : String.valueOf(ch));
    }
}
