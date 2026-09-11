package kotlinx.serialization.json;

import java.util.Map;
import kotlinx.serialization.internal.d0;
import kotlinx.serialization.internal.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements kotlinx.serialization.a {
    public static final u a = new u();
    public static final t b = t.b;

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        com.google.android.material.sidesheet.b.d(bVar);
        y0 y0Var = y0.a;
        return new s((Map) new d0(k.a).i(bVar));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        s sVar = (s) obj;
        sVar.getClass();
        com.google.android.material.sidesheet.b.b(nVar);
        y0 y0Var = y0.a;
        new d0(k.a).b(nVar, sVar);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
