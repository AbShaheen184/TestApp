package kotlinx.serialization.json;

import com.app.mlounge.ui.screens.player.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements kotlinx.serialization.a {
    public static final k a = new k();
    public static final kotlinx.serialization.descriptors.f b;

    static {
        kotlinx.serialization.descriptors.f fVar;
        kotlinx.serialization.descriptors.e[] eVarArr = new kotlinx.serialization.descriptors.e[0];
        j0 j0Var = new j0(25);
        if (!kotlin.text.k.d0("kotlinx.serialization.json.JsonElement")) {
            kotlinx.serialization.descriptors.h hVar = kotlinx.serialization.descriptors.h.y;
            kotlinx.serialization.descriptors.c cVar = kotlinx.serialization.descriptors.c.y;
            if (cVar.equals(hVar)) {
                net.luminis.tls.engine.impl.c.o("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            } else {
                kotlinx.serialization.descriptors.a aVar = new kotlinx.serialization.descriptors.a("kotlinx.serialization.json.JsonElement");
                j0Var.invoke(aVar);
                fVar = new kotlinx.serialization.descriptors.f("kotlinx.serialization.json.JsonElement", cVar, aVar.b.size(), kotlin.collections.n.V(eVarArr), aVar);
            }
            b = fVar;
        }
        net.luminis.tls.engine.impl.c.o("Blank serial names are prohibited");
        fVar = null;
        b = fVar;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        return com.google.android.material.sidesheet.b.d(bVar).M();
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        com.google.android.material.sidesheet.b.b(nVar);
        if (iVar instanceof w) {
            nVar.p(x.a, iVar);
            return;
        }
        if (iVar instanceof s) {
            nVar.p(u.a, iVar);
        } else if (iVar instanceof d) {
            nVar.p(f.a, iVar);
        } else {
            coil3.g.a();
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
