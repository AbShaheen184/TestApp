package com.google.firebase.sessions.settings;

import androidx.datastore.core.j1;
import androidx.datastore.core.y0;
import com.google.android.material.textfield.p;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements y0 {
    public static final h a = new h();
    public static final g b = new g(null, null, null, null, null);

    @Override // androidx.datastore.core.y0
    public final /* bridge */ /* synthetic */ Object a() {
        return b;
    }

    @Override // androidx.datastore.core.y0
    public final Object b(FileInputStream fileInputStream) throws androidx.datastore.core.b {
        try {
            kotlinx.serialization.json.b bVar = kotlinx.serialization.json.b.d;
            String str = new String(p.t(fileInputStream), kotlin.text.a.a);
            bVar.getClass();
            return (g) bVar.a(str, g.Companion.serializer());
        } catch (Exception e) {
            throw new androidx.datastore.core.b("Cannot parse session configs", e);
        }
    }

    @Override // androidx.datastore.core.y0
    public final void c(Object obj, j1 j1Var) throws IOException {
        byte[] bytes = kotlinx.serialization.json.b.d.b(g.Companion.serializer(), (g) obj).getBytes(kotlin.text.a.a);
        bytes.getClass();
        ((FileOutputStream) j1Var.y).write(bytes);
    }
}
