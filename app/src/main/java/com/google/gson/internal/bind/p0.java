package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends com.google.gson.n {
    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        try {
            String strL0 = aVar.l0();
            if (strL0.equals("null")) {
                return null;
            }
            return new URI(strL0);
        } catch (URISyntaxException e) {
            throw new com.google.gson.i(e, 8);
        }
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bVar.h0(uri == null ? null : uri.toASCIIString());
    }
}
