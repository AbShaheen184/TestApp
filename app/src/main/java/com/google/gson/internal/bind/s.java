package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends com.google.gson.n {
    public static final r b = new r(new s(2), 0);
    public final int a;

    public s(int i) {
        this.a = i;
    }

    @Override // com.google.gson.n
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        int iN0 = aVar.n0();
        int iE = androidx.constraintlayout.core.g.e(iN0);
        if (iE == 5 || iE == 6) {
            return com.google.android.datatransport.runtime.backends.c.b(this.a, aVar);
        }
        if (iE == 8) {
            aVar.j0();
            return null;
        }
        throw new com.google.gson.i("Expecting number, got: " + com.google.android.datatransport.runtime.backends.c.x(iN0) + "; at path " + aVar.X(), 8);
    }

    @Override // com.google.gson.n
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.g0((Number) obj);
    }
}
