package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t2;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.viewmodel.n1;
import com.app.mlounge.ui.viewmodel.r1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements FlowCollector {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public a0(androidx.compose.runtime.y0 y0Var, androidx.compose.runtime.y0 y0Var2, androidx.compose.runtime.d1 d1Var) {
        this.e = 1;
        this.y = y0Var;
        this.z = y0Var2;
        this.A = d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(com.app.mlounge.data.repository.b0 b0Var, kotlin.coroutines.d dVar) {
        n1 n1Var;
        List list;
        if (dVar instanceof n1) {
            n1Var = (n1) dVar;
            int i = n1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1Var.A = i - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, dVar);
            }
        } else {
            n1Var = new n1(this, dVar);
        }
        Object objWithContext = n1Var.y;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = n1Var.A;
        kotlin.coroutines.d dVar2 = null;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            if (kotlin.jvm.internal.l.a(((r1) this.z).r, "anime") && (list = b0Var.d) != null && !list.isEmpty()) {
                ((r1) this.z).g = b0Var.d;
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            com.app.mlounge.ui.screens.adult.e eVar = new com.app.mlounge.ui.screens.adult.e(b0Var, (r1) this.z, dVar2, 19);
            n1Var.e = b0Var;
            n1Var.A = 1;
            objWithContext = BuildersKt.withContext(io2, eVar, n1Var);
            if (objWithContext == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b0Var = n1Var.e;
            kotlin.a.e(objWithContext);
        }
        List list2 = (List) objWithContext;
        if (b0Var.b.size() - list2.size() > 0) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
        }
        boolean z = b0Var.c;
        String str = b0Var.a;
        com.app.mlounge.ui.viewmodel.m0 m0Var = z ? new com.app.mlounge.ui.viewmodel.m0(str, com.app.mlounge.ui.viewmodel.l0.y, list2.size()) : new com.app.mlounge.ui.viewmodel.m0(str, com.app.mlounge.ui.viewmodel.l0.z, 0);
        MutableStateFlow mutableStateFlow = ((r1) this.z).l;
        Iterable<com.app.mlounge.ui.viewmodel.m0> iterable = (Iterable) mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(iterable, 10));
        for (com.app.mlounge.ui.viewmodel.m0 m0Var2 : iterable) {
            if (kotlin.jvm.internal.l.a(m0Var2.a, b0Var.a)) {
                m0Var2 = m0Var;
            }
            arrayList.add(m0Var2);
        }
        mutableStateFlow.setValue(arrayList);
        ((ArrayList) this.A).addAll(list2);
        MutableStateFlow mutableStateFlow2 = ((r1) this.z).h;
        ArrayList arrayList2 = (ArrayList) this.A;
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            ChqStream chqStream = (ChqStream) obj;
            if (hashSet.add(chqStream.m() + "|" + chqStream.g() + "|" + chqStream.h())) {
                arrayList3.add(obj);
            }
        }
        mutableStateFlow2.setValue(kotlin.collections.o.f0(arrayList3, new androidx.constraintlayout.core.e(20)));
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.y;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            ChqStream chqStream2 = (ChqStream) obj2;
            String strJ = chqStream2.j();
            if (strJ == null || kotlin.text.k.d0(strJ)) {
                if (!kotlin.jvm.internal.l.a(chqStream2.n(), Boolean.TRUE) && !kotlin.jvm.internal.l.a(chqStream2.k(), "torrent") && !kotlin.jvm.internal.l.a(chqStream2.l(), "hls") && !kotlin.jvm.internal.l.a(chqStream2.k(), "hls") && kotlin.text.r.O(chqStream2.m(), "http", false) && linkedHashSet.add(chqStream2.m())) {
                    arrayList4.add(obj2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g((r1) this.z), Dispatchers.getIO(), null, new com.app.mlounge.ui.screens.adult.e(arrayList4, (r1) this.z, dVar2, 18), 2, null);
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        androidx.room.coroutines.k kVar;
        FlowCollector flowCollector;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e2 e2Var = (e2) this.A;
                ((o1) this.z).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((kotlin.jvm.functions.p) ((androidx.compose.runtime.y0) this.y).getValue()).invoke(e2Var.a.n(), e2Var.d.getValue())).booleanValue() : false));
                return kotlin.y.a;
            case 1:
                androidx.activity.a aVar = (androidx.activity.a) obj;
                if (((List) ((androidx.compose.runtime.y0) this.y).getValue()).size() > 1) {
                    ((androidx.compose.runtime.y0) this.z).setValue(Boolean.TRUE);
                    ((androidx.compose.runtime.d1) this.A).h(aVar.c);
                }
                return kotlin.y.a;
            case 2:
                if (dVar instanceof androidx.room.coroutines.k) {
                    kVar = (androidx.room.coroutines.k) dVar;
                    int i = kVar.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kVar.y = i - Integer.MIN_VALUE;
                    } else {
                        kVar = new androidx.room.coroutines.k(this, dVar);
                    }
                } else {
                    kVar = new androidx.room.coroutines.k(this, dVar);
                }
                Object obj2 = kVar.e;
                int i2 = kVar.y;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        flowCollector = kVar.z;
                        kotlin.a.e(obj2);
                    } else {
                        if (i2 != 2) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj2);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj2);
                FlowCollector flowCollector2 = (FlowCollector) this.z;
                androidx.room.q qVar = (androidx.room.q) this.A;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.y;
                kVar.z = flowCollector2;
                kVar.y = 1;
                Object objA = com.google.android.gms.dynamite.g.A(qVar, kVar, lVar, true, false);
                if (objA == aVar2) {
                    return aVar2;
                }
                obj2 = objA;
                flowCollector = flowCollector2;
                kVar.z = null;
                kVar.y = 2;
                if (flowCollector.emit(obj2, kVar) == aVar2) {
                    return aVar2;
                }
                return kotlin.y.a;
            case 3:
                Integer num = (Integer) obj;
                t2 t2Var = (t2) this.y;
                int iIntValue = num != null ? num.intValue() : 0;
                if (!((Boolean) ((t2) this.A).getValue()).booleanValue() && iIntValue >= ((List) t2Var.getValue()).size() - 6 && !((List) t2Var.getValue()).isEmpty()) {
                    com.app.mlounge.ui.viewmodel.s sVar = (com.app.mlounge.ui.viewmodel.s) this.z;
                    if (!((Boolean) sVar.i.getValue()).booleanValue() && sVar.M < sVar.N) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(sVar), null, null, new com.app.mlounge.ui.viewmodel.r(sVar, null, 1), 3, null);
                    }
                }
                return kotlin.y.a;
            default:
                return a((com.app.mlounge.data.repository.b0) obj, dVar);
        }
    }

    public /* synthetic */ a0(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.y = obj3;
    }
}
