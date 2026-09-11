package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    public /* synthetic */ a2(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x023c A[LOOP:1: B:51:0x01f5->B:64:0x023c, LOOP_END] */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return Integer.valueOf(((b2) obj2).a.g());
            case 1:
                return Integer.valueOf(Math.round((1 + (((androidx.compose.ui.unit.m) obj2) != androidx.compose.ui.unit.m.e ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 2:
                androidx.compose.foundation.lazy.z zVar = (androidx.compose.foundation.lazy.z) obj2;
                return com.google.common.base.c.q(Integer.valueOf(zVar.g()), Integer.valueOf(zVar.h()));
            case 3:
                ((Integer) obj2).intValue();
                return new androidx.compose.foundation.lazy.grid.b(com.google.firebase.crashlytics.internal.model.t1.b(1));
            case 4:
                androidx.compose.foundation.lazy.grid.x xVar = (androidx.compose.foundation.lazy.grid.x) obj2;
                return com.google.common.base.c.q(Integer.valueOf(xVar.g()), Integer.valueOf(xVar.d.c.g()));
            case 5:
                Map mapB = ((androidx.compose.foundation.lazy.layout.w0) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case 6:
                androidx.compose.foundation.text.i1 i1Var = (androidx.compose.foundation.text.i1) obj2;
                return com.google.common.base.c.q(Float.valueOf(i1Var.a.g()), Boolean.valueOf(((androidx.compose.foundation.gestures.k1) i1Var.f.getValue()) == androidx.compose.foundation.gestures.k1.e));
            case 7:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).Z(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).B(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).b(((Integer) obj2).intValue()));
            case 10:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).v(((Integer) obj2).intValue()));
            case 11:
                androidx.compose.runtime.saveable.e eVar = (androidx.compose.runtime.saveable.e) obj2;
                Map map = eVar.e;
                androidx.collection.o0 o0Var = eVar.y;
                Object[] objArr = o0Var.b;
                Object[] objArr2 = o0Var.c;
                long[] jArr = o0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapB2 = ((androidx.compose.runtime.saveable.h) objArr2[i4]).b();
                                    if (mapB2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapB2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 12:
                return obj2;
            case 13:
                androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) obj2;
                return com.google.common.base.c.a(gVar.y, androidx.compose.ui.text.c0.a(gVar.e, androidx.compose.ui.text.c0.a, (androidx.compose.runtime.saveable.c) obj));
            case 14:
                return Integer.valueOf(((androidx.compose.ui.text.style.l) obj2).a);
            case 15:
                androidx.compose.ui.text.style.p pVar = (androidx.compose.ui.text.style.p) obj2;
                return com.google.common.base.c.a(Float.valueOf(pVar.a), Float.valueOf(pVar.b));
            case 16:
                androidx.compose.runtime.saveable.c cVar = (androidx.compose.runtime.saveable.c) obj;
                androidx.compose.ui.text.style.q qVar = (androidx.compose.ui.text.style.q) obj2;
                androidx.compose.ui.unit.o oVar = new androidx.compose.ui.unit.o(qVar.a);
                androidx.compose.ui.text.b0 b0Var = androidx.compose.ui.text.c0.v;
                return com.google.common.base.c.a(androidx.compose.ui.text.c0.a(oVar, b0Var, cVar), androidx.compose.ui.text.c0.a(new androidx.compose.ui.unit.o(qVar.b), b0Var, cVar));
            case 17:
                return Integer.valueOf(((androidx.compose.ui.text.font.l) obj2).e);
            case 18:
                androidx.compose.ui.text.l lVar = (androidx.compose.ui.text.l) obj2;
                return com.google.common.base.c.a(lVar.a, androidx.compose.ui.text.c0.a(lVar.b, androidx.compose.ui.text.c0.i, (androidx.compose.runtime.saveable.c) obj));
            case 19:
                return Float.valueOf(((androidx.compose.ui.text.style.a) obj2).a);
            case 20:
                androidx.compose.runtime.saveable.c cVar2 = (androidx.compose.runtime.saveable.c) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(androidx.compose.ui.text.c0.a((androidx.compose.ui.text.e) list.get(i5), androidx.compose.ui.text.c0.b, cVar2));
                }
                return arrayList;
            case 21:
                androidx.compose.ui.text.l0 l0Var = (androidx.compose.ui.text.l0) obj2;
                return com.google.common.base.c.a(Integer.valueOf((int) (l0Var.a >> 32)), Integer.valueOf((int) (l0Var.a & 4294967295L)));
            case 22:
                androidx.compose.runtime.saveable.c cVar3 = (androidx.compose.runtime.saveable.c) obj;
                androidx.compose.ui.graphics.m0 m0Var = (androidx.compose.ui.graphics.m0) obj2;
                return com.google.common.base.c.a(androidx.compose.ui.text.c0.a(new androidx.compose.ui.graphics.t(m0Var.a), androidx.compose.ui.text.c0.p, cVar3), androidx.compose.ui.text.c0.a(new androidx.compose.ui.geometry.b(m0Var.b), androidx.compose.ui.text.c0.x, cVar3), Float.valueOf(m0Var.c));
            case 23:
                return Integer.valueOf(((androidx.compose.ui.text.style.k) obj2).a);
            case 24:
                return Integer.valueOf(((androidx.compose.ui.text.style.m) obj2).a);
            case 25:
                return Integer.valueOf(((androidx.compose.ui.text.style.d) obj2).a);
            case 26:
                return Integer.valueOf(((androidx.compose.ui.text.font.j) obj2).a);
            case 27:
                return Integer.valueOf(((androidx.compose.ui.text.font.k) obj2).a);
            case 28:
                androidx.compose.ui.unit.o oVar2 = (androidx.compose.ui.unit.o) obj2;
                return oVar2 == null ? false : androidx.compose.ui.unit.o.a(oVar2.a, androidx.compose.ui.unit.o.c) ? Boolean.FALSE : com.google.common.base.c.a(Float.valueOf(androidx.compose.ui.unit.o.c(oVar2.a)), androidx.compose.ui.text.c0.a(new androidx.compose.ui.unit.p(androidx.compose.ui.unit.o.b(oVar2.a)), androidx.compose.ui.text.c0.w, (androidx.compose.runtime.saveable.c) obj));
            default:
                androidx.compose.ui.text.k kVar = (androidx.compose.ui.text.k) obj2;
                return com.google.common.base.c.a(kVar.a, androidx.compose.ui.text.c0.a(kVar.b, androidx.compose.ui.text.c0.i, (androidx.compose.runtime.saveable.c) obj));
        }
    }
}
