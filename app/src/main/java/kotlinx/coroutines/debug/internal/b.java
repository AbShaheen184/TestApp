package kotlinx.coroutines.debug.internal;

import kotlin.collections.n;
import kotlin.text.k;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.json.q;
import kotlinx.serialization.json.u;
import kotlinx.serialization.json.x;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    public /* synthetic */ b(l0 l0Var) {
        this.e = 1;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            case 1:
                h hVar = h.B;
                e[] eVarArr = new e[0];
                if (k.d0("kotlin.Unit")) {
                    c.o("Blank serial names are prohibited");
                } else {
                    if (!hVar.equals(h.y)) {
                        kotlinx.serialization.descriptors.a aVar = new kotlinx.serialization.descriptors.a("kotlin.Unit");
                        return new f("kotlin.Unit", hVar, aVar.b.size(), n.V(eVarArr), aVar);
                    }
                    c.o("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 2:
                return x.b;
            case 3:
                return q.b;
            case 4:
                return kotlinx.serialization.json.n.b;
            case 5:
                return u.b;
            default:
                return kotlinx.serialization.json.f.b;
        }
    }

    public /* synthetic */ b(int i) {
        this.e = i;
    }
}
