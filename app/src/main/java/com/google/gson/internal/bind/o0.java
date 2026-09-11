package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        if (strL0.equals("null")) {
            return null;
        }
        return new URL(strL0);
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bVar.h0(url == null ? null : url.toExternalForm());
    }
}
