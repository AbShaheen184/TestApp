package androidx.navigation;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.material3.m1;
import androidx.lifecycle.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final com.google.android.gms.common.internal.k a;
    public final MutableStateFlow b;
    public final MutableStateFlow c;
    public boolean d;
    public final StateFlow e;
    public final StateFlow f;
    public final k0 g;
    public final /* synthetic */ y h;

    public l(y yVar, k0 k0Var) {
        k0Var.getClass();
        this.h = yVar;
        this.a = new com.google.android.gms.common.internal.k(21);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(kotlin.collections.u.e);
        this.b = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(kotlin.collections.w.e);
        this.c = MutableStateFlow2;
        this.e = FlowKt.asStateFlow(MutableStateFlow);
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
        this.g = k0Var;
    }

    public final void a(i iVar) {
        iVar.getClass();
        synchronized (this.a) {
            MutableStateFlow mutableStateFlow = this.b;
            mutableStateFlow.setValue(kotlin.collections.o.W((Collection) mutableStateFlow.getValue(), iVar));
        }
    }

    public final i b(t tVar, Bundle bundle) {
        androidx.navigation.internal.f fVar = this.h.b;
        fVar.getClass();
        return com.google.firebase.heartbeatinfo.e.k(fVar.a.c, tVar, bundle, fVar.i(), fVar.p);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    public final void c(i iVar) {
        m mVar;
        v0 v0Var;
        iVar.getClass();
        androidx.navigation.internal.f fVar = this.h.b;
        MutableStateFlow mutableStateFlow = fVar.i;
        String str = iVar.C;
        LinkedHashMap linkedHashMap = fVar.x;
        boolean zA = kotlin.jvm.internal.l.a(linkedHashMap.get(iVar), Boolean.TRUE);
        MutableStateFlow mutableStateFlow2 = this.c;
        mutableStateFlow2.setValue(com.google.common.base.i.m((Set) mutableStateFlow2.getValue(), iVar));
        linkedHashMap.remove(iVar);
        kotlin.collections.k kVar = fVar.f;
        if (kVar.contains(iVar)) {
            if (this.d) {
                return;
            }
            fVar.t();
            fVar.g.tryEmit(new ArrayList(kVar));
            mutableStateFlow.tryEmit(fVar.q());
            return;
        }
        fVar.s(iVar);
        if (iVar.E.j.d.compareTo(androidx.lifecycle.o.z) >= 0) {
            iVar.a(androidx.lifecycle.o.e);
        }
        if (!kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.l.a(((i) it.next()).C, str)) {
                }
            }
            if (!zA) {
                str.getClass();
                v0Var = (v0) mVar.b.remove(str);
                if (v0Var != null) {
                    v0Var.a();
                }
            }
        } else if (!zA && (mVar = fVar.p) != null) {
            str.getClass();
            v0Var = (v0) mVar.b.remove(str);
            if (v0Var != null) {
                v0Var.a();
            }
        }
        fVar.t();
        mutableStateFlow.tryEmit(fVar.q());
    }

    public final void d(i iVar, boolean z) {
        androidx.navigation.internal.f fVar = this.h.b;
        androidx.activity.compose.f fVar2 = new androidx.activity.compose.f(this, iVar, z);
        fVar.getClass();
        k0 k0VarB = fVar.t.b(iVar.y.e);
        fVar.x.put(iVar, Boolean.valueOf(z));
        if (!k0VarB.equals(this.g)) {
            Object obj = fVar.u.get(k0VarB);
            obj.getClass();
            ((l) obj).d(iVar, z);
            return;
        }
        m1 m1Var = fVar.w;
        if (m1Var != null) {
            m1Var.invoke(iVar);
            fVar2.invoke();
            return;
        }
        kotlin.collections.k kVar = fVar.f;
        int iIndexOf = kVar.indexOf(iVar);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + iVar + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != kVar.z) {
            fVar.n(((i) kVar.get(i)).y.y.a, true, false);
        }
        androidx.navigation.internal.f.p(fVar, iVar);
        fVar2.invoke();
        fVar.b.invoke();
        fVar.b();
    }

    public final void e(i iVar, boolean z) {
        Object objPrevious;
        MutableStateFlow mutableStateFlow = this.c;
        Iterable iterable = (Iterable) mutableStateFlow.getValue();
        boolean z2 = iterable instanceof Collection;
        StateFlow stateFlow = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((i) it.next()) == iVar) {
                    Iterable iterable2 = (Iterable) stateFlow.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((i) it2.next()) == iVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        mutableStateFlow.setValue(com.google.common.base.i.s((Set) mutableStateFlow.getValue(), iVar));
        List list = (List) stateFlow.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            i iVar2 = (i) objPrevious;
            if (!kotlin.jvm.internal.l.a(iVar2, iVar) && ((List) stateFlow.getValue()).lastIndexOf(iVar2) < ((List) stateFlow.getValue()).lastIndexOf(iVar)) {
                break;
            }
        }
        i iVar3 = (i) objPrevious;
        if (iVar3 != null) {
            mutableStateFlow.setValue(com.google.common.base.i.s((Set) mutableStateFlow.getValue(), iVar3));
        }
        d(iVar, z);
    }

    public final void f(i iVar) {
        iVar.getClass();
        androidx.navigation.internal.f fVar = this.h.b;
        fVar.getClass();
        k0 k0VarB = fVar.t.b(iVar.y.e);
        if (!k0VarB.equals(this.g)) {
            Object obj = fVar.u.get(k0VarB);
            if (obj != null) {
                ((l) obj).f(iVar);
                return;
            } else {
                net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("NavigatorBackStack for "), iVar.y.e, " should already be created"));
                return;
            }
        }
        kotlin.jvm.functions.l lVar = fVar.v;
        if (lVar != null) {
            lVar.invoke(iVar);
            a(iVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + iVar.y + " outside of the call to navigate(). ");
        }
    }
}
