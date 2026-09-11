package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() != 9) {
            return InetAddress.getByName(aVar.l0());
        }
        aVar.j0();
        return null;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.h0(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
