package androidx.compose.foundation.interaction;

import android.os.Environment;
import androidx.activity.compose.p;
import androidx.compose.animation.core.a0;
import androidx.compose.animation.core.c2;
import androidx.compose.animation.core.k2;
import androidx.compose.foundation.lazy.layout.u0;
import androidx.compose.foundation.text.selection.l0;
import androidx.compose.material3.s3;
import androidx.compose.material3.t0;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.g0;
import com.app.mlounge.ui.viewmodel.h0;
import com.app.mlounge.ui.viewmodel.p1;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.u1;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.z1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.x;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        float f;
        String str;
        com.app.mlounge.ui.viewmodel.n nVar;
        p1 p1Var;
        switch (this.e) {
            case 0:
                j jVar = (j) obj;
                ArrayList arrayList = (ArrayList) this.y;
                if (jVar instanceof d) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).a);
                }
                ((y0) this.z).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return y.a;
            case 1:
                long j = ((androidx.compose.ui.geometry.b) obj).a;
                androidx.compose.animation.core.d dVar2 = (androidx.compose.animation.core.d) this.y;
                long j2 = ((androidx.compose.ui.geometry.b) dVar2.d()).a & 9223372034707292159L;
                y yVar = y.a;
                if (j2 == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) dVar2.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objE = dVar2.e(new androidx.compose.ui.geometry.b(j), dVar);
                    return objE == kotlin.coroutines.intrinsics.a.e ? objE : yVar;
                }
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.z, null, null, new l0(dVar2, j, null, 0), 3, null);
                return yVar;
            case 2:
                j jVar2 = (j) obj;
                boolean z = jVar2 instanceof o;
                androidx.compose.material.ripple.a aVar = (androidx.compose.material.ripple.a) this.y;
                if (!z) {
                    CoroutineScope coroutineScope = (CoroutineScope) this.z;
                    androidx.compose.material.ripple.g gVar = aVar.Q;
                    if (gVar == null) {
                        boolean z2 = aVar.M;
                        t0 t0Var = aVar.P;
                        gVar = new androidx.compose.material.ripple.g();
                        gVar.a = z2;
                        gVar.b = t0Var;
                        gVar.c = androidx.compose.animation.core.e.a(0.0f);
                        gVar.d = new ArrayList();
                        androidx.compose.ui.node.k.j(aVar);
                        aVar.Q = gVar;
                    }
                    ArrayList arrayList2 = (ArrayList) gVar.d;
                    if (jVar2 instanceof h) {
                        arrayList2.add(jVar2);
                    } else if (jVar2 instanceof i) {
                        arrayList2.remove(((i) jVar2).a);
                    } else if (jVar2 instanceof d) {
                        arrayList2.add(jVar2);
                    } else if (jVar2 instanceof e) {
                        arrayList2.remove(((e) jVar2).a);
                    } else if (jVar2 instanceof b) {
                        arrayList2.add(jVar2);
                    } else if (jVar2 instanceof c) {
                        arrayList2.remove(((c) jVar2).a);
                    } else if (jVar2 instanceof a) {
                        arrayList2.remove(((a) jVar2).a);
                    }
                    j jVar3 = (j) kotlin.collections.o.T(arrayList2);
                    if (!kotlin.jvm.internal.l.a((j) gVar.e, jVar3)) {
                        kotlin.coroutines.d dVar3 = null;
                        if (jVar3 != null) {
                            ((t0) gVar.b).invoke();
                            boolean z3 = jVar3 instanceof h;
                            if (z3) {
                                f = 0.08f;
                            } else if (jVar3 instanceof d) {
                                f = 0.1f;
                            } else {
                                f = jVar3 instanceof b ? 0.16f : 0.0f;
                            }
                            k2 k2Var = androidx.compose.material.ripple.f.a;
                            if (!z3 && ((jVar3 instanceof d) || (jVar3 instanceof b))) {
                                k2Var = new k2(45, 0, a0.b);
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c2(gVar, f, k2Var, (kotlin.coroutines.d) null), 3, null);
                        } else {
                            j jVar4 = (j) gVar.e;
                            k2 k2Var2 = androidx.compose.material.ripple.f.a;
                            if (!(jVar4 instanceof h) && !(jVar4 instanceof d) && (jVar4 instanceof b)) {
                                k2Var2 = new k2(150, 0, a0.b);
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new p(gVar, k2Var2, dVar3, 14), 3, null);
                        }
                        gVar.e = jVar3;
                    }
                } else if (aVar.T) {
                    aVar.L0((o) jVar2);
                } else {
                    aVar.U.a(jVar2);
                }
                return y.a;
            case 3:
                j jVar5 = (j) obj;
                x xVar = (x) this.y;
                if (jVar5 instanceof m) {
                    xVar.e++;
                } else if ((jVar5 instanceof n) || (jVar5 instanceof l)) {
                    xVar.e--;
                }
                boolean z4 = xVar.e > 0;
                s3 s3Var = (s3) this.z;
                if (s3Var.O != z4) {
                    s3Var.O = z4;
                    androidx.compose.ui.node.k.k(s3Var);
                }
                return y.a;
            case 4:
                Integer num = (Integer) obj;
                t2 t2Var = (t2) this.z;
                if ((num != null ? num.intValue() : 0) >= ((List) t2Var.getValue()).size() - 6 && !((List) t2Var.getValue()).isEmpty()) {
                    com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                    if (!((Boolean) cVar.k.getValue()).booleanValue() && cVar.F && (str = (String) cVar.q.getValue()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(cVar), null, null, new com.app.mlounge.ui.viewmodel.b(cVar, (com.app.mlounge.data.repository.a) cVar.o.getValue(), str, null, 0), 3, null);
                    }
                }
                return y.a;
            case 5:
                Integer num2 = (Integer) obj;
                t2 t2Var2 = (t2) this.z;
                if ((num2 != null ? num2.intValue() : 0) >= ((List) t2Var2.getValue()).size() - 6 && !((List) t2Var2.getValue()).isEmpty()) {
                    e0 e0Var = (e0) this.y;
                    if (!((Boolean) e0Var.m.getValue()).booleanValue() && e0Var.L < e0Var.M) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(e0Var), null, null, new com.app.mlounge.ui.screens.movies.h(e0Var, (kotlin.coroutines.d) null, 2), 3, null);
                    }
                }
                return y.a;
            case 6:
                Integer num3 = (Integer) obj;
                t2 t2Var3 = (t2) this.z;
                int iIntValue = num3 != null ? num3.intValue() : 0;
                if (!((List) t2Var3.getValue()).isEmpty() && iIntValue >= ((List) t2Var3.getValue()).size() - 6) {
                    h0 h0Var = (h0) this.y;
                    if (!((Boolean) h0Var.j.getValue()).booleanValue() && h0Var.m && h0Var.l != null) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(h0Var), null, null, new g0(h0Var, null, 1), 3, null);
                    }
                }
                return y.a;
            case 7:
                Integer num4 = (Integer) obj;
                t2 t2Var4 = (t2) this.z;
                if ((num4 != null ? num4.intValue() : 0) >= ((List) t2Var4.getValue()).size() - 6 && !((List) t2Var4.getValue()).isEmpty()) {
                    x1 x1Var = (x1) this.y;
                    if (!((Boolean) x1Var.s.getValue()).booleanValue() && x1Var.T < x1Var.U) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(x1Var), null, null, new com.app.mlounge.ui.screens.tvshows.l(x1Var, (kotlin.coroutines.d) null, 1), 3, null);
                    }
                }
                return y.a;
            case 8:
                if (dVar instanceof com.app.mlounge.ui.viewmodel.n) {
                    nVar = (com.app.mlounge.ui.viewmodel.n) dVar;
                    int i = nVar.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nVar.y = i - Integer.MIN_VALUE;
                    } else {
                        nVar = new com.app.mlounge.ui.viewmodel.n(this, dVar);
                    }
                } else {
                    nVar = new com.app.mlounge.ui.viewmodel.n(this, dVar);
                }
                Object obj2 = nVar.e;
                int i2 = nVar.y;
                if (i2 == 0) {
                    kotlin.a.e(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.y;
                    String absolutePath = (String) obj;
                    if (absolutePath == null) {
                        com.app.mlounge.data.download.h hVar = ((com.app.mlounge.ui.viewmodel.p) this.z).b;
                        hVar.getClass();
                        absolutePath = new File(hVar.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "CinemaHQ").getAbsolutePath();
                    }
                    nVar.y = 1;
                    Object objEmit = flowCollector.emit(absolutePath, nVar);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj2);
                }
                return y.a;
            case 9:
                if (dVar instanceof p1) {
                    p1Var = (p1) dVar;
                    int i3 = p1Var.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p1Var.y = i3 - Integer.MIN_VALUE;
                    } else {
                        p1Var = new p1(this, dVar);
                    }
                } else {
                    p1Var = new p1(this, dVar);
                }
                Object obj3 = p1Var.e;
                int i4 = p1Var.y;
                if (i4 == 0) {
                    kotlin.a.e(obj3);
                    FlowCollector flowCollector2 = (FlowCollector) this.y;
                    List list = (List) obj;
                    if (kotlin.jvm.internal.l.a(((r1) this.z).x, "download")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : list) {
                            ChqStream chqStream = (ChqStream) obj4;
                            if (!kotlin.jvm.internal.l.a(chqStream.l(), "hls") && !kotlin.jvm.internal.l.a(chqStream.k(), "hls")) {
                                arrayList3.add(obj4);
                            }
                        }
                        list = arrayList3;
                    }
                    p1Var.y = 1;
                    Object objEmit2 = flowCollector2.emit(list, p1Var);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj3);
                }
                return y.a;
            case 10:
                x1 x1Var2 = (x1) this.y;
                Map map = (Map) x1Var2.h.getValue();
                CoroutineScope coroutineScope2 = (CoroutineScope) this.z;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    int iIntValue2 = ((Number) entry.getKey()).intValue();
                    if (((Number) entry.getValue()).intValue() > 0 && !map.containsKey(new Integer(iIntValue2))) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new u1(x1Var2, iIntValue2, null, 0), 3, null);
                    }
                }
                return y.a;
            default:
                z1 z1Var = (z1) this.y;
                Map map2 = (Map) z1Var.h.getValue();
                CoroutineScope coroutineScope3 = (CoroutineScope) this.z;
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    int iIntValue3 = ((Number) entry2.getKey()).intValue();
                    if (((Number) entry2.getValue()).intValue() > 0 && !map2.containsKey(new Integer(iIntValue3))) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new u0(z1Var, iIntValue3, null, 2), 3, null);
                    }
                }
                return y.a;
        }
    }
}
