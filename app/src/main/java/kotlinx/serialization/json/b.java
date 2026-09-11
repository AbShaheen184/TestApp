package kotlinx.serialization.json;

import androidx.compose.foundation.gestures.z1;
import androidx.media3.common.util.m0;
import com.google.android.gms.measurement.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b d = new b();
    public final m0 a = new m0();
    public final c0 b = kotlinx.serialization.modules.a.a;
    public final com.google.android.material.internal.b c = new com.google.android.material.internal.b(10, false);

    public final Object a(String str, kotlinx.serialization.a aVar) {
        aVar.getClass();
        this.a.getClass();
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(str);
        Object objP = new kotlinx.serialization.json.internal.m(this, kotlinx.serialization.json.internal.q.OBJ, hVar, aVar.d()).p(aVar);
        if (hVar.h() == 10) {
            return objP;
        }
        androidx.fragment.app.h.x(hVar, "Expected EOF after parsing, but had " + str.charAt(hVar.y - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(kotlinx.serialization.a aVar, Object obj) {
        char[] cArr;
        aVar.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l((char) 0, 12);
        kotlinx.serialization.json.internal.b bVar = kotlinx.serialization.json.internal.b.c;
        synchronized (bVar) {
            kotlin.collections.k kVar = bVar.a;
            cArr = null;
            char[] cArr2 = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
            if (cArr2 != null) {
                bVar.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        lVar.z = cArr;
        try {
            kotlinx.serialization.json.internal.q qVar = kotlinx.serialization.json.internal.q.OBJ;
            kotlinx.serialization.json.internal.n[] nVarArr = new kotlinx.serialization.json.internal.n[kotlinx.serialization.json.internal.q.E.b()];
            this.a.getClass();
            new kotlinx.serialization.json.internal.n(new z1(lVar), this, qVar, nVarArr).p(aVar, obj);
            return lVar.toString();
        } finally {
            lVar.m();
        }
    }
}
