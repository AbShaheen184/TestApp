package androidx.datastore.preferences.core;

import androidx.datastore.core.j1;
import androidx.datastore.core.y0;
import androidx.datastore.preferences.h;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.x;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.collections.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements y0 {
    public static final g a = new g();

    @Override // androidx.datastore.core.y0
    public final Object a() {
        return new a(true);
    }

    @Override // androidx.datastore.core.y0
    public final Object b(FileInputStream fileInputStream) throws androidx.datastore.core.b {
        byte[] bArr;
        try {
            androidx.datastore.preferences.d dVarO = androidx.datastore.preferences.d.o(fileInputStream);
            a aVar = new a(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            aVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapM = dVarO.m();
            mapM.getClass();
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                h hVar = (h) entry.getValue();
                str.getClass();
                hVar.getClass();
                int iC = hVar.C();
                switch (iC == 0 ? -1 : f.a[androidx.constraintlayout.core.g.e(iC)]) {
                    case -1:
                        throw new androidx.datastore.core.b("Value case is null.", null);
                    case 0:
                    default:
                        coil3.g.a();
                        return null;
                    case 1:
                        aVar.f(new d(str), Boolean.valueOf(hVar.t()));
                        break;
                    case 2:
                        aVar.f(new d(str), Float.valueOf(hVar.x()));
                        break;
                    case 3:
                        aVar.f(new d(str), Double.valueOf(hVar.w()));
                        break;
                    case 4:
                        aVar.f(new d(str), Integer.valueOf(hVar.y()));
                        break;
                    case 5:
                        aVar.f(new d(str), Long.valueOf(hVar.z()));
                        break;
                    case 6:
                        aVar.f(new d(str), hVar.A());
                        break;
                    case 7:
                        d dVar = new d(str);
                        u uVarN = hVar.B().n();
                        uVarN.getClass();
                        aVar.f(dVar, o.o0(uVarN));
                        break;
                    case 8:
                        d dVar2 = new d(str);
                        androidx.datastore.preferences.protobuf.f fVarU = hVar.u();
                        int size = fVarU.size();
                        if (size == 0) {
                            bArr = v.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            fVarU.e(bArr2, size);
                            bArr = bArr2;
                        }
                        aVar.f(dVar2, bArr);
                        break;
                    case 9:
                        throw new androidx.datastore.core.b("Value not set.", null);
                }
            }
            return new a(new LinkedHashMap(aVar.a()), true);
        } catch (x e) {
            throw new androidx.datastore.core.b("Unable to parse preferences proto.", e);
        }
    }

    @Override // androidx.datastore.core.y0
    public final void c(Object obj, j1 j1Var) throws IOException {
        t tVarA;
        Map mapA = ((a) obj).a();
        androidx.datastore.preferences.b bVarN = androidx.datastore.preferences.d.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.a;
            if (value instanceof Boolean) {
                androidx.datastore.preferences.g gVarD = h.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                gVarD.c();
                h.q((h) gVarD.y, zBooleanValue);
                tVarA = gVarD.a();
            } else if (value instanceof Float) {
                androidx.datastore.preferences.g gVarD2 = h.D();
                float fFloatValue = ((Number) value).floatValue();
                gVarD2.c();
                h.r((h) gVarD2.y, fFloatValue);
                tVarA = gVarD2.a();
            } else if (value instanceof Double) {
                androidx.datastore.preferences.g gVarD3 = h.D();
                double dDoubleValue = ((Number) value).doubleValue();
                gVarD3.c();
                h.o((h) gVarD3.y, dDoubleValue);
                tVarA = gVarD3.a();
            } else if (value instanceof Integer) {
                androidx.datastore.preferences.g gVarD4 = h.D();
                int iIntValue = ((Number) value).intValue();
                gVarD4.c();
                h.s((h) gVarD4.y, iIntValue);
                tVarA = gVarD4.a();
            } else if (value instanceof Long) {
                androidx.datastore.preferences.g gVarD5 = h.D();
                long jLongValue = ((Number) value).longValue();
                gVarD5.c();
                h.l((h) gVarD5.y, jLongValue);
                tVarA = gVarD5.a();
            } else if (value instanceof String) {
                androidx.datastore.preferences.g gVarD6 = h.D();
                gVarD6.c();
                h.m((h) gVarD6.y, (String) value);
                tVarA = gVarD6.a();
            } else if (value instanceof Set) {
                androidx.datastore.preferences.g gVarD7 = h.D();
                androidx.datastore.preferences.e eVarO = androidx.datastore.preferences.f.o();
                eVarO.c();
                androidx.datastore.preferences.f.l((androidx.datastore.preferences.f) eVarO.y, (Set) value);
                gVarD7.c();
                h.n((h) gVarD7.y, (androidx.datastore.preferences.f) eVarO.a());
                tVarA = gVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    net.luminis.tls.engine.impl.c.r("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                androidx.datastore.preferences.g gVarD8 = h.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.f fVarD = androidx.datastore.preferences.protobuf.f.d(bArr, 0, bArr.length);
                gVarD8.c();
                h.p((h) gVarD8.y, fVarD);
                tVarA = gVarD8.a();
            }
            bVarN.getClass();
            str.getClass();
            bVarN.c();
            androidx.datastore.preferences.d.l((androidx.datastore.preferences.d) bVarN.y).put(str, (h) tVarA);
        }
        androidx.datastore.preferences.d dVar2 = (androidx.datastore.preferences.d) bVarN.a();
        int iA = dVar2.a(null);
        Logger logger = j.f;
        if (iA > 4096) {
            iA = 4096;
        }
        j jVar = new j(j1Var, iA);
        dVar2.b(jVar);
        if (jVar.d > 0) {
            jVar.k();
        }
    }
}
