package androidx.navigation.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.z0;
import androidx.compose.material3.m1;
import androidx.lifecycle.o;
import androidx.lifecycle.v0;
import androidx.navigation.b0;
import androidx.navigation.compose.n;
import androidx.navigation.i;
import androidx.navigation.i0;
import androidx.navigation.j;
import androidx.navigation.k;
import androidx.navigation.k0;
import androidx.navigation.l0;
import androidx.navigation.m;
import androidx.navigation.s;
import androidx.navigation.t;
import androidx.navigation.v;
import androidx.navigation.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final MutableSharedFlow A;
    public final y a;
    public final k b;
    public v c;
    public Bundle d;
    public Bundle[] e;
    public final kotlin.collections.k f = new kotlin.collections.k();
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public androidx.lifecycle.v o;
    public m p;
    public final ArrayList q;
    public o r;
    public final d s;
    public final l0 t;
    public final LinkedHashMap u;
    public l v;
    public m1 w;
    public final LinkedHashMap x;
    public int y;
    public final ArrayList z;

    public f(y yVar, k kVar) {
        this.a = yVar;
        this.b = kVar;
        u uVar = u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uVar);
        this.i = MutableStateFlow2;
        this.j = FlowKt.asStateFlow(MutableStateFlow2);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new ArrayList();
        this.r = o.y;
        this.s = new d(this, 0);
        this.t = new l0();
        this.u = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.z = new ArrayList();
        this.A = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
    }

    public static t e(int i, t tVar, t tVar2, boolean z) {
        if (tVar.y.a == i && (tVar2 == null || (tVar.equals(tVar2) && kotlin.jvm.internal.l.a(tVar.z, tVar2.z)))) {
            return tVar;
        }
        v vVar = tVar instanceof v ? (v) tVar : null;
        if (vVar == null) {
            vVar = tVar.z;
            vVar.getClass();
        }
        return vVar.C.B(i, vVar, tVar2, z);
    }

    public static /* synthetic */ void p(f fVar, i iVar) {
        fVar.o(iVar, false, new kotlin.collections.k());
    }

    public final void a(t tVar, Bundle bundle, i iVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        androidx.media3.exoplayer.mediacodec.g gVar = this.a.c;
        t tVar2 = iVar.y;
        boolean z = tVar2 instanceof n;
        kotlin.collections.k kVar = this.f;
        if (!z) {
            while (!kVar.isEmpty() && (((i) kVar.last()).y instanceof n) && n(((i) kVar.last()).y.y.a, true, false)) {
            }
        }
        kotlin.collections.k<i> kVar2 = new kotlin.collections.k();
        Object obj = null;
        if (tVar instanceof v) {
            t tVar3 = tVar2;
            do {
                tVar3.getClass();
                tVar3 = tVar3.z;
                if (tVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!kotlin.jvm.internal.l.a(((i) objPrevious2).y, tVar3));
                    i iVarK = (i) objPrevious2;
                    if (iVarK == null) {
                        iVarK = com.google.firebase.heartbeatinfo.e.k(gVar, tVar3, bundle, i(), this.p);
                    }
                    kVar2.addFirst(iVarK);
                    if (!kVar.isEmpty() && ((i) kVar.last()).y == tVar3) {
                        p(this, (i) kVar.last());
                    }
                }
                if (tVar3 == null) {
                    break;
                }
            } while (tVar3 != tVar);
        }
        t tVar4 = kVar2.isEmpty() ? tVar2 : ((i) kVar2.first()).y;
        while (tVar4 != null && d(tVar4.y.a, tVar4) != tVar4) {
            tVar4 = tVar4.z;
            if (tVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!kotlin.jvm.internal.l.a(((i) objPrevious).y, tVar4));
                i iVarK2 = (i) objPrevious;
                if (iVarK2 == null) {
                    iVarK2 = com.google.firebase.heartbeatinfo.e.k(gVar, tVar4, tVar4.b(bundle2), i(), this.p);
                }
                kVar2.addFirst(iVarK2);
            }
        }
        if (!kVar2.isEmpty()) {
            tVar2 = ((i) kVar2.first()).y;
        }
        while (!kVar.isEmpty() && (((i) kVar.last()).y instanceof v)) {
            t tVar5 = ((i) kVar.last()).y;
            tVar5.getClass();
            if (((z0) ((v) tVar5).C.A).c(tVar2.y.a) != null) {
                break;
            } else {
                p(this, (i) kVar.last());
            }
        }
        i iVar2 = (i) kVar.f();
        if (iVar2 == null) {
            iVar2 = (i) kVar2.f();
        }
        if (!kotlin.jvm.internal.l.a(iVar2 != null ? iVar2.y : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                t tVar6 = ((i) objPrevious3).y;
                v vVar = this.c;
                vVar.getClass();
                if (kotlin.jvm.internal.l.a(tVar6, vVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            i iVarK3 = (i) obj;
            if (iVarK3 == null) {
                v vVar2 = this.c;
                vVar2.getClass();
                v vVar3 = this.c;
                vVar3.getClass();
                iVarK3 = com.google.firebase.heartbeatinfo.e.k(gVar, vVar2, vVar3.b(bundle), i(), this.p);
            }
            kVar2.addFirst(iVarK3);
        }
        for (i iVar3 : kVar2) {
            Object obj2 = this.u.get(this.t.b(iVar3.y.e));
            if (obj2 == null) {
                net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("NavigatorBackStack for "), tVar.e, " should already be created"));
                return;
            }
            ((androidx.navigation.l) obj2).a(iVar3);
        }
        kVar.addAll(kVar2);
        kVar.addLast(iVar);
        for (i iVar4 : kotlin.collections.o.W(kVar2, iVar)) {
            v vVar4 = iVar4.y.z;
            if (vVar4 != null) {
                k(iVar4, f(vVar4.y.a));
            }
        }
    }

    public final boolean b() {
        kotlin.collections.k kVar;
        while (true) {
            kVar = this.f;
            if (kVar.isEmpty() || !(((i) kVar.last()).y instanceof v)) {
                break;
            }
            p(this, (i) kVar.last());
        }
        i iVar = (i) kVar.i();
        ArrayList arrayList = this.z;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        this.y++;
        t();
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<i> arrayListL0 = kotlin.collections.o.l0(arrayList);
            arrayList.clear();
            for (i iVar2 : arrayListL0) {
                Iterator it = kotlin.collections.o.k0(this.q).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        androidx.transition.k.i();
                        return false;
                    }
                    t tVar = iVar2.y;
                    iVar2.E.a();
                    throw null;
                }
                this.A.tryEmit(iVar2);
            }
            this.g.tryEmit(new ArrayList(kVar));
            this.i.tryEmit(q());
        }
        return iVar != null;
    }

    public final boolean c(ArrayList arrayList, t tVar, boolean z, boolean z2) {
        f fVar;
        boolean z3;
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        kotlin.collections.k kVar = new kotlin.collections.k();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = this;
                z3 = z2;
                break;
            }
            k0 k0Var = (k0) it.next();
            kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
            i iVar = (i) this.f.last();
            fVar = this;
            z3 = z2;
            m1 m1Var = new m1(vVar2, vVar, fVar, z3, kVar);
            k0Var.getClass();
            iVar.getClass();
            fVar.w = m1Var;
            k0Var.e(iVar, z3);
            fVar.w = null;
            if (!vVar2.e) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = fVar.m;
            if (!z) {
                final int i = 0;
                kotlin.sequences.f fVar2 = new kotlin.sequences.f(new kotlin.sequences.n(kotlin.sequences.k.o(tVar, new androidx.compose.ui.text.y(25)), new l(this) { // from class: androidx.navigation.internal.e
                    public final /* synthetic */ f y;

                    {
                        this.y = this;
                    }

                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        t tVar2 = (t) obj;
                        switch (i) {
                            case 0:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                            default:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((t) fVar2.next()).y.a);
                    j jVar = (j) kVar.f();
                    linkedHashMap.put(numValueOf, jVar != null ? (String) jVar.a.y : null);
                }
            }
            if (!kVar.isEmpty()) {
                com.google.android.gms.cloudmessaging.n nVar = ((j) kVar.first()).a;
                final int i2 = 1;
                kotlin.sequences.f fVar3 = new kotlin.sequences.f(new kotlin.sequences.n(kotlin.sequences.k.o(d(nVar.e, null), new androidx.compose.ui.text.y(26)), new l(this) { // from class: androidx.navigation.internal.e
                    public final /* synthetic */ f y;

                    {
                        this.y = this;
                    }

                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        t tVar2 = (t) obj;
                        switch (i2) {
                            case 0:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                            default:
                                tVar2.getClass();
                                zContainsKey = this.y.m.containsKey(Integer.valueOf(tVar2.y.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar3.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((t) fVar3.next()).y.a), (String) nVar.y);
                }
                if (linkedHashMap.values().contains((String) nVar.y)) {
                    fVar.n.put((String) nVar.y, kVar);
                }
            }
        }
        fVar.b.invoke();
        return vVar.e;
    }

    public final t d(int i, t tVar) {
        t tVar2;
        v vVar = this.c;
        if (vVar == null) {
            return null;
        }
        if (vVar.y.a == i) {
            if (tVar == null) {
                return vVar;
            }
            if (kotlin.jvm.internal.l.a(vVar, tVar) && tVar.z == null) {
                return this.c;
            }
        }
        i iVar = (i) this.f.i();
        if (iVar == null || (tVar2 = iVar.y) == null) {
            tVar2 = this.c;
            tVar2.getClass();
        }
        return e(i, tVar2, tVar, false);
    }

    public final i f(int i) {
        Object objPrevious;
        kotlin.collections.k kVar = this.f;
        ListIterator<E> listIterator = kVar.listIterator(kVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((i) objPrevious).y.y.a != i);
        i iVar = (i) objPrevious;
        if (iVar != null) {
            return iVar;
        }
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbV.append(g());
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    public final t g() {
        i iVar = (i) this.f.i();
        if (iVar != null) {
            return iVar.y;
        }
        return null;
    }

    public final v h() {
        v vVar = this.c;
        if (vVar != null) {
            vVar.getClass();
            return vVar;
        }
        net.luminis.tls.engine.impl.c.r("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final o i() {
        return this.o == null ? o.z : this.r;
    }

    public final v j() {
        t tVar;
        i iVar = (i) this.f.i();
        if (iVar == null || (tVar = iVar.y) == null) {
            tVar = this.c;
            tVar.getClass();
        }
        v vVar = tVar instanceof v ? (v) tVar : null;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = tVar.z;
        vVar2.getClass();
        return vVar2;
    }

    public final void k(i iVar, i iVar2) {
        this.k.put(iVar, iVar2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(iVar2) == null) {
            linkedHashMap.put(iVar2, new a());
        }
        Object obj = linkedHashMap.get(iVar2);
        obj.getClass();
        ((a) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0228  */
    /* JADX WARN: Code duplicated, block: B:113:0x0235 A[LOOP:4: B:111:0x022d->B:113:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0294  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f8 A[Catch: all -> 0x030d, TryCatch #0 {all -> 0x030d, blocks: (B:132:0x02de, B:133:0x02f2, B:135:0x02f8, B:137:0x0308, B:141:0x0310), top: B:163:0x02de }] */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:163:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[LOOP:7: B:133:0x02f2->B:182:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008e A[PHI: r11
  0x008e: PHI (r11v22 java.util.ListIterator) = 
  (r11v12 java.util.ListIterator)
  (r11v12 java.util.ListIterator)
  (r11v12 java.util.ListIterator)
  (r11v13 java.util.ListIterator)
 binds: [B:24:0x008c, B:27:0x0094, B:28:0x0096, B:186:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    public final void l(t tVar, Bundle bundle, b0 b0Var) {
        boolean z;
        boolean z2;
        int iNextIndex;
        t tVar2;
        kotlin.collections.k<i> kVar;
        k0 k0VarB;
        t tVar3;
        androidx.navigation.l lVarB;
        ListIterator listIterator;
        int iNextIndex2;
        v vVar;
        boolean zN;
        Object objPrevious;
        ListIterator listIterator2;
        boolean z3;
        tVar.getClass();
        Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            ((androidx.navigation.l) it.next()).d = true;
        }
        kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
        if (b0Var == null) {
            z = false;
        } else {
            String str = b0Var.h;
            if (str != null) {
                boolean z4 = b0Var.d;
                boolean z5 = b0Var.e;
                str.getClass();
                kotlin.collections.k kVar2 = this.f;
                if (kVar2.isEmpty()) {
                    zN = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator3 = kVar2.listIterator(kVar2.b());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator3.previous();
                        i iVar = (i) objPrevious;
                        t tVar4 = iVar.y;
                        Bundle bundleA = iVar.E.a();
                        tVar4.getClass();
                        androidx.appcompat.widget.o oVar = tVar4.y;
                        oVar.getClass();
                        if (kotlin.jvm.internal.l.a((String) oVar.e, str)) {
                            listIterator2 = listIterator3;
                            z3 = true;
                        } else {
                            s sVarG = oVar.g(str);
                            if (((t) oVar.b).equals(sVarG != null ? sVarG.e : null)) {
                                Bundle bundle2 = sVarG.y;
                                if (bundleA == null || bundle2 == null) {
                                    listIterator2 = listIterator3;
                                } else {
                                    Set<String> setKeySet = bundle2.keySet();
                                    setKeySet.getClass();
                                    Iterator<T> it2 = setKeySet.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str2 = (String) it2.next();
                                            str2.getClass();
                                            if (bundleA.containsKey(str2)) {
                                                listIterator2 = listIterator3;
                                                androidx.navigation.g gVar = (androidx.navigation.g) sVarG.e.c().get(str2);
                                                i0 i0Var = gVar != null ? gVar.a : null;
                                                Object objA = i0Var != null ? i0Var.a(str2, bundle2) : null;
                                                Object objA2 = i0Var != null ? i0Var.a(str2, bundleA) : null;
                                                if (i0Var == null || i0Var.f(objA, objA2)) {
                                                    listIterator3 = listIterator2;
                                                    bundle2 = bundle2;
                                                }
                                            } else {
                                                listIterator2 = listIterator3;
                                            }
                                        } else {
                                            listIterator2 = listIterator3;
                                            z3 = true;
                                        }
                                    }
                                }
                            } else {
                                listIterator2 = listIterator3;
                            }
                            z3 = false;
                        }
                        if (z4 || !z3) {
                            arrayList.add(this.t.b(iVar.y.e));
                        }
                        if (z3) {
                            break;
                        } else {
                            listIterator3 = listIterator2;
                        }
                    }
                    i iVar2 = (i) objPrevious;
                    t tVar5 = iVar2 != null ? iVar2.y : null;
                    if (tVar5 == null) {
                        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
                        zN = false;
                    } else {
                        zN = c(arrayList, tVar5, z4, z5);
                    }
                }
            } else {
                int i = b0Var.c;
                if (i != -1) {
                    zN = n(i, b0Var.d, b0Var.e);
                } else {
                    z = false;
                }
            }
            z = zN;
        }
        Bundle bundleB = tVar.b(bundle);
        if (b0Var != null && b0Var.b && this.m.containsKey(Integer.valueOf(tVar.y.a))) {
            vVar2.e = r(tVar.y.a, bundleB, b0Var);
            z2 = false;
        } else {
            if (b0Var == null || !b0Var.a) {
                z2 = false;
            } else {
                i iVar3 = (i) this.f.i();
                kotlin.collections.k kVar3 = this.f;
                ListIterator listIterator4 = kVar3.listIterator(kVar3.b());
                while (true) {
                    if (listIterator4.hasPrevious()) {
                        if (((i) listIterator4.previous()).y == tVar) {
                            iNextIndex = listIterator4.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z2 = false;
                } else if (tVar instanceof v) {
                    int i2 = v.D;
                    List listR = kotlin.sequences.k.r(new kotlin.sequences.n(kotlin.sequences.k.o((v) tVar, new androidx.compose.ui.text.y(18)), new androidx.compose.ui.text.y(27), 1));
                    if (this.f.z - iNextIndex == listR.size()) {
                        kotlin.collections.k kVar4 = this.f;
                        List listSubList = kVar4.subList(iNextIndex, kVar4.z);
                        ArrayList arrayList2 = new ArrayList(p.y(listSubList, 10));
                        Iterator it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Integer.valueOf(((i) it3.next()).y.y.a));
                        }
                        if (arrayList2.equals(listR)) {
                            kVar = new kotlin.collections.k();
                            while (com.google.common.base.c.k(this.f) >= iNextIndex) {
                                i iVar4 = (i) kotlin.collections.o.b0(this.f);
                                s(iVar4);
                                i iVar5 = new i(iVar4.e, iVar4.y, iVar4.y.b(bundle), iVar4.A, iVar4.B, iVar4.C, iVar4.D);
                                c cVar = iVar5.E;
                                o oVar2 = iVar4.A;
                                cVar.getClass();
                                oVar2.getClass();
                                cVar.d = oVar2;
                                c cVar2 = iVar5.E;
                                o oVar3 = iVar4.E.k;
                                cVar2.getClass();
                                oVar3.getClass();
                                cVar2.k = oVar3;
                                cVar2.b();
                                kVar.addFirst(iVar5);
                            }
                            for (i iVar6 : kVar) {
                                vVar = iVar6.y.z;
                                if (vVar != null) {
                                    k(iVar6, f(vVar.y.a));
                                }
                                this.f.addLast(iVar6);
                            }
                            for (i iVar7 : kVar) {
                                k0VarB = this.t.b(iVar7.y.e);
                                tVar3 = iVar7.y;
                                if (tVar3 == null) {
                                    tVar3 = null;
                                }
                                if (tVar3 == null) {
                                    k0VarB.c(tVar3);
                                    lVarB = k0VarB.b();
                                    synchronized (lVarB.a) {
                                        try {
                                            ArrayList arrayListL0 = kotlin.collections.o.l0((Collection) lVarB.e.getValue());
                                            listIterator = arrayListL0.listIterator(arrayListL0.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (kotlin.jvm.internal.l.a(((i) listIterator.previous()).C, iVar7.C)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListL0.set(iNextIndex2, iVar7);
                                            lVarB.b.setValue(arrayListL0);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else if (iVar3 == null || (tVar2 = iVar3.y) == null || tVar.y.a != tVar2.y.a) {
                    z2 = false;
                } else {
                    kVar = new kotlin.collections.k();
                    while (com.google.common.base.c.k(this.f) >= iNextIndex) {
                        i iVar8 = (i) kotlin.collections.o.b0(this.f);
                        s(iVar8);
                        i iVar9 = new i(iVar8.e, iVar8.y, iVar8.y.b(bundle), iVar8.A, iVar8.B, iVar8.C, iVar8.D);
                        c cVar3 = iVar9.E;
                        o oVar4 = iVar8.A;
                        cVar3.getClass();
                        oVar4.getClass();
                        cVar3.d = oVar4;
                        c cVar4 = iVar9.E;
                        o oVar5 = iVar8.E.k;
                        cVar4.getClass();
                        oVar5.getClass();
                        cVar4.k = oVar5;
                        cVar4.b();
                        kVar.addFirst(iVar9);
                    }
                    while (r5.hasNext()) {
                        vVar = iVar6.y.z;
                        if (vVar != null) {
                            k(iVar6, f(vVar.y.a));
                        }
                        this.f.addLast(iVar6);
                    }
                    while (r0.hasNext()) {
                        k0VarB = this.t.b(iVar7.y.e);
                        tVar3 = iVar7.y;
                        if (tVar3 == null) {
                            tVar3 = null;
                        }
                        if (tVar3 == null) {
                            k0VarB.c(tVar3);
                            lVarB = k0VarB.b();
                            synchronized (lVarB.a) {
                                ArrayList arrayListL1 = kotlin.collections.o.l0((Collection) lVarB.e.getValue());
                                listIterator = arrayListL1.listIterator(arrayListL1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (kotlin.jvm.internal.l.a(((i) listIterator.previous()).C, iVar7.C)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListL1.set(iNextIndex2, iVar7);
                                lVarB.b.setValue(arrayListL1);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                i iVarK = com.google.firebase.heartbeatinfo.e.k(this.a.c, tVar, bundleB, i(), this.p);
                k0 k0VarB2 = this.t.b(tVar.e);
                List listP = com.google.common.base.c.p(iVarK);
                this.v = new androidx.compose.animation.core.i0(vVar2, this, tVar, bundleB, 5);
                k0VarB2.d(listP, b0Var);
                this.v = null;
            }
        }
        this.b.invoke();
        Iterator it4 = this.u.values().iterator();
        while (it4.hasNext()) {
            ((androidx.navigation.l) it4.next()).d = false;
        }
        if (z || vVar2.e || z2) {
            b();
        } else {
            t();
        }
    }

    public final void m(String str, b0 b0Var) {
        str.getClass();
        if (this.c == null) {
            net.luminis.tls.engine.impl.c.i("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        v vVarJ = j();
        s sVarF = vVarJ.f(str, true, vVarJ);
        if (sVarF == null) {
            com.google.gson.b.k(androidx.privacysandbox.ads.adservices.java.internal.a.x("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        t tVar = sVarF.e;
        Bundle bundleB = tVar.b(sVarF.y);
        if (bundleB == null) {
            bundleB = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        }
        int i = t.B;
        String str2 = (String) tVar.y.e;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        l(tVar, bundleB, b0Var);
    }

    public final boolean n(int i, boolean z, boolean z2) {
        t tVar;
        androidx.appcompat.widget.o oVar;
        kotlin.collections.k kVar = this.f;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = kotlin.collections.o.d0(kVar).iterator();
        do {
            if (!it.hasNext()) {
                tVar = null;
                break;
            }
            tVar = ((i) it.next()).y;
            String str = tVar.e;
            oVar = tVar.y;
            k0 k0VarB = this.t.b(str);
            if (z || oVar.a != i) {
                arrayList.add(k0VarB);
            }
        } while (oVar.a != i);
        if (tVar != null) {
            return c(arrayList, tVar, z, z2);
        }
        int i2 = t.B;
        Log.i("NavController", "Ignoring popBackStack to destination " + androidx.navigation.f.a(this.a.c, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void o(i iVar, boolean z, kotlin.collections.k kVar) {
        m mVar;
        StateFlow stateFlow;
        Set set;
        iVar.getClass();
        kotlin.collections.k kVar2 = this.f;
        i iVar2 = (i) kVar2.last();
        if (!kotlin.jvm.internal.l.a(iVar2, iVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(iVar.y);
            t tVar = iVar2.y;
            sb.append(", which is not the top of the back stack (");
            sb.append(tVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        kotlin.collections.o.b0(kVar2);
        androidx.navigation.l lVar = (androidx.navigation.l) this.u.get(this.t.b(iVar2.y.e));
        boolean z2 = true;
        if ((lVar == null || (stateFlow = lVar.f) == null || (set = (Set) stateFlow.getValue()) == null || !set.contains(iVar2)) && !this.l.containsKey(iVar2)) {
            z2 = false;
        }
        o oVar = iVar2.E.j.d;
        o oVar2 = o.z;
        if (oVar.compareTo(oVar2) >= 0) {
            if (z) {
                iVar2.a(oVar2);
                kVar.addFirst(new j(iVar2));
            }
            if (z2) {
                iVar2.a(oVar2);
            } else {
                iVar2.a(o.e);
                s(iVar2);
            }
        }
        if (z || z2 || (mVar = this.p) == null) {
            return;
        }
        String str = iVar2.C;
        str.getClass();
        v0 v0Var = (v0) mVar.b.remove(str);
        if (v0Var != null) {
            v0Var.a();
        }
    }

    public final ArrayList q() {
        o oVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.u.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oVar = o.A;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((androidx.navigation.l) it.next()).f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                i iVar = (i) obj;
                if (!arrayList.contains(iVar) && iVar.E.k.compareTo(oVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.o.C(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            i iVar2 = (i) obj2;
            if (!arrayList.contains(iVar2) && iVar2.E.k.compareTo(oVar) >= 0) {
                arrayList3.add(obj2);
            }
        }
        kotlin.collections.o.C(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((i) obj3).y instanceof v)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i, Bundle bundle, b0 b0Var) {
        t tVarH;
        i iVar;
        t tVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a((String) it.next(), str)) {
                it.remove();
            }
        }
        kotlin.collections.k<j> kVar = (kotlin.collections.k) c0.b(this.n).remove(str);
        androidx.media3.exoplayer.mediacodec.g gVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        i iVar2 = (i) this.f.i();
        if (iVar2 == null || (tVarH = iVar2.y) == null) {
            tVarH = h();
        }
        if (kVar != null) {
            for (j jVar : kVar) {
                com.google.android.gms.cloudmessaging.n nVar = jVar.a;
                com.google.android.gms.cloudmessaging.n nVar2 = jVar.a;
                t tVarE = e(nVar.e, tVarH, null, true);
                if (tVarE == null) {
                    int i2 = t.B;
                    androidx.media3.exoplayer.hls.playlist.a.i("Restore State failed: destination ", androidx.navigation.f.a(gVar, nVar2.e), " cannot be found from the current destination ", tVarH);
                    return false;
                }
                o oVarI = i();
                m mVar = this.p;
                gVar.getClass();
                oVarI.getClass();
                Bundle bundle3 = (Bundle) nVar2.z;
                if (bundle3 != null) {
                    Context context = gVar.e;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) nVar2.y;
                Bundle bundle4 = (Bundle) nVar2.A;
                str2.getClass();
                arrayList.add(new i(gVar, tVarE, bundle2, oVarI, mVar, str2, bundle4));
                tVarH = tVarE;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<i> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((i) obj).y instanceof v)) {
                arrayList3.add(obj);
            }
        }
        for (i iVar3 : arrayList3) {
            List list = (List) kotlin.collections.o.T(arrayList2);
            if (kotlin.jvm.internal.l.a((list == null || (iVar = (i) kotlin.collections.o.S(list)) == null || (tVar = iVar.y) == null) ? null : tVar.e, iVar3.y.e)) {
                list.add(iVar3);
            } else {
                arrayList2.add(com.google.common.base.c.s(iVar3));
            }
        }
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        for (List list2 : arrayList2) {
            k0 k0VarB = this.t.b(((i) kotlin.collections.o.K(list2)).y.e);
            ArrayList arrayList4 = arrayList;
            this.v = new androidx.activity.compose.c(vVar, arrayList4, new x(), this, bundle, 4);
            k0VarB.d(list2, b0Var);
            this.v = null;
            arrayList = arrayList4;
        }
        return vVar.e;
    }

    public final void s(i iVar) {
        iVar.getClass();
        i iVar2 = (i) this.k.remove(iVar);
        if (iVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        a aVar = (a) linkedHashMap.get(iVar2);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            androidx.navigation.l lVar = (androidx.navigation.l) this.u.get(this.t.b(iVar2.y.e));
            if (lVar != null) {
                lVar.c(iVar2);
            }
            linkedHashMap.remove(iVar2);
        }
    }

    public final void t() {
        a aVar;
        StateFlow stateFlow;
        Set set;
        ArrayList<i> arrayListL0 = kotlin.collections.o.l0(this.f);
        if (arrayListL0.isEmpty()) {
            return;
        }
        ArrayList arrayListS = com.google.common.base.c.s(((i) kotlin.collections.o.S(arrayListL0)).y);
        ArrayList arrayList = new ArrayList();
        if (kotlin.collections.o.S(arrayListS) instanceof n) {
            Iterator it = kotlin.collections.o.d0(arrayListL0).iterator();
            while (it.hasNext()) {
                t tVar = ((i) it.next()).y;
                arrayList.add(tVar);
                if (!(tVar instanceof n) && !(tVar instanceof v)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (i iVar : kotlin.collections.o.d0(arrayListL0)) {
            o oVar = iVar.E.k;
            t tVar2 = iVar.y;
            t tVar3 = (t) kotlin.collections.o.M(arrayListS);
            o oVar2 = o.B;
            o oVar3 = o.A;
            if (tVar3 != null && tVar3.y.a == tVar2.y.a) {
                if (oVar != oVar2) {
                    androidx.navigation.l lVar = (androidx.navigation.l) this.u.get(this.t.b(iVar.y.e));
                    if (kotlin.jvm.internal.l.a((lVar == null || (stateFlow = lVar.f) == null || (set = (Set) stateFlow.getValue()) == null) ? null : Boolean.valueOf(set.contains(iVar)), Boolean.TRUE) || ((aVar = (a) this.l.get(iVar)) != null && aVar.a.get() == 0)) {
                        map.put(iVar, oVar3);
                    } else {
                        map.put(iVar, oVar2);
                    }
                }
                t tVar4 = (t) kotlin.collections.o.M(arrayList);
                if (tVar4 != null && tVar4.y.a == tVar2.y.a) {
                    kotlin.collections.o.a0(arrayList);
                }
                kotlin.collections.o.a0(arrayListS);
                v vVar = tVar2.z;
                if (vVar != null) {
                    arrayListS.add(vVar);
                }
            } else if (arrayList.isEmpty() || tVar2.y.a != ((t) kotlin.collections.o.K(arrayList)).y.a) {
                iVar.a(o.z);
            } else {
                t tVar5 = (t) kotlin.collections.o.a0(arrayList);
                if (oVar == oVar2) {
                    iVar.a(oVar3);
                } else if (oVar != oVar3) {
                    map.put(iVar, oVar3);
                }
                v vVar2 = tVar5.z;
                if (vVar2 != null && !arrayList.contains(vVar2)) {
                    arrayList.add(vVar2);
                }
            }
        }
        for (i iVar2 : arrayListL0) {
            o oVar4 = (o) map.get(iVar2);
            if (oVar4 != null) {
                iVar2.a(oVar4);
            } else {
                iVar2.E.b();
            }
        }
    }
}
