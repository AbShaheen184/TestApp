package kotlinx.serialization.json;

import kotlin.jvm.internal.a0;
import kotlinx.serialization.internal.h1;
import kotlinx.serialization.internal.s0;
import kotlinx.serialization.internal.t0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements kotlinx.serialization.a {
    public static final n a = new n();
    public static final s0 b;

    static {
        kotlinx.serialization.descriptors.d dVar = kotlinx.serialization.descriptors.d.G;
        if (kotlin.text.k.d0("kotlinx.serialization.json.JsonLiteral")) {
            net.luminis.tls.engine.impl.c.o("Blank serial names are prohibited");
            return;
        }
        Object it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.h) t0.a.values()).iterator();
        while (((androidx.emoji2.text.flatbuffer.c) it).hasNext()) {
            kotlinx.serialization.a aVar = (kotlinx.serialization.a) ((kotlin.collections.builders.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().a())) {
                net.luminis.tls.engine.impl.c.o(kotlin.text.l.D("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + a0.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new s0("kotlinx.serialization.json.JsonLiteral", dVar);
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        i iVarM = com.google.android.material.sidesheet.b.d(bVar).M();
        if (iVarM instanceof m) {
            return (m) iVarM;
        }
        throw kotlinx.serialization.json.internal.i.b(-1, iVarM.toString(), "Unexpected JSON element, expected JsonLiteral, had " + a0.a(iVarM.getClass()));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        Boolean bool;
        m mVar = (m) obj;
        mVar.getClass();
        String str = mVar.y;
        com.google.android.material.sidesheet.b.b(nVar);
        if (mVar.e) {
            nVar.r(str);
            return;
        }
        Long lR = kotlin.text.r.R(str);
        if (lR != null) {
            nVar.k(lR.longValue());
            return;
        }
        kotlin.t tVarX = com.google.android.material.textfield.p.x(str);
        if (tVarX != null) {
            nVar.h(h1.b).k(tVarX.e);
            return;
        }
        Double dG = kotlin.text.q.G(str);
        if (dG != null) {
            nVar.e(dG.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            nVar.b(bool.booleanValue());
        } else {
            nVar.r(str);
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
