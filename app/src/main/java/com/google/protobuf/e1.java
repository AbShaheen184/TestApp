package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements j1 {
    public j1[] a;

    @Override // com.google.protobuf.j1
    public final v1 a(Class cls) {
        for (j1 j1Var : this.a) {
            if (j1Var.b(cls)) {
                return j1Var.a(cls);
            }
        }
        com.google.gson.b.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.protobuf.j1
    public final boolean b(Class cls) {
        for (j1 j1Var : this.a) {
            if (j1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
