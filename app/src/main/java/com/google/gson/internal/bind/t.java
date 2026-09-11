package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements com.google.gson.o {
    public final /* synthetic */ int e;

    public t(int i) {
        this.e = i;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        if (aVar.a() == Object.class) {
            return new u(fVar, this.e);
        }
        return null;
    }
}
