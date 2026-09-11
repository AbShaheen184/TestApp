package com.google.firebase.sessions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements androidx.datastore.core.y0 {
    public final v0 a;

    public l0(v0 v0Var) {
        v0Var.getClass();
        this.a = v0Var;
    }

    @Override // androidx.datastore.core.y0
    public final Object a() {
        return new k0(this.a.a(null), null, null);
    }

    @Override // androidx.datastore.core.y0
    public final Object b(FileInputStream fileInputStream) throws androidx.datastore.core.b {
        try {
            kotlinx.serialization.json.b bVar = kotlinx.serialization.json.b.d;
            String str = new String(com.google.android.material.textfield.p.t(fileInputStream), kotlin.text.a.a);
            bVar.getClass();
            return (k0) bVar.a(str, k0.Companion.serializer());
        } catch (Exception e) {
            throw new androidx.datastore.core.b("Cannot parse session data", e);
        }
    }

    @Override // androidx.datastore.core.y0
    public final void c(Object obj, androidx.datastore.core.j1 j1Var) throws IOException {
        byte[] bytes = kotlinx.serialization.json.b.d.b(k0.Companion.serializer(), (k0) obj).getBytes(kotlin.text.a.a);
        bytes.getClass();
        ((FileOutputStream) j1Var.y).write(bytes);
    }
}
