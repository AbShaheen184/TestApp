package com.google.gson;

import com.google.gson.internal.bind.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class e extends b0 {
    public n a = null;

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.b(aVar);
        }
        net.luminis.tls.engine.impl.c.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.c(bVar, obj);
        } else {
            net.luminis.tls.engine.impl.c.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.internal.bind.b0
    public final n d() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar;
        }
        net.luminis.tls.engine.impl.c.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
