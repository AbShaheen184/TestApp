package kotlinx.serialization.json;

import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements kotlinx.serialization.a {
    public static final x a = new x();
    public static final kotlinx.serialization.descriptors.f b = com.google.android.material.resources.g.a("kotlinx.serialization.json.JsonPrimitive", kotlinx.serialization.descriptors.d.G, new kotlinx.serialization.descriptors.e[0]);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        i iVarM = com.google.android.material.sidesheet.b.d(bVar).M();
        if (iVarM instanceof w) {
            return (w) iVarM;
        }
        throw kotlinx.serialization.json.internal.i.b(-1, iVarM.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + a0.a(iVarM.getClass()));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        w wVar = (w) obj;
        wVar.getClass();
        com.google.android.material.sidesheet.b.b(nVar);
        if (wVar instanceof p) {
            nVar.p(q.a, p.INSTANCE);
        } else {
            nVar.p(n.a, (m) wVar);
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
