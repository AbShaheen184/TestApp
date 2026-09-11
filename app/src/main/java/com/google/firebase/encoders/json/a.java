package com.google.firebase.encoders.json;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.google.firebase.encoders.d {
    public final /* synthetic */ int a;

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new com.google.firebase.encoders.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
                eVar.g(com.google.firebase.encoders.proto.f.g, entry.getKey());
                eVar.g(com.google.firebase.encoders.proto.f.h, entry.getValue());
                return;
            default:
                throw new com.google.firebase.encoders.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
