package androidx.compose.animation.core;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.ui.viewmodel.g1;
import com.app.mlounge.ui.viewmodel.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i0(View view, androidx.compose.runtime.y0 y0Var, Map map, com.app.mlounge.ui.viewmodel.k1 k1Var) {
        this.e = 11;
        this.A = view;
        this.z = y0Var;
        this.y = map;
        this.B = k1Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x046e  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.z;
                k0 k0Var = (k0) this.A;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.B;
                long jLongValue = ((Long) obj).longValue();
                androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) y0Var.getValue();
                long jLongValue2 = t2Var != null ? ((Number) t2Var.getValue()).longValue() : jLongValue;
                long j = k0Var.c;
                androidx.compose.runtime.collection.b bVar = k0Var.a;
                if (j == Long.MIN_VALUE || wVar.e != e.j(coroutineScope.getCoroutineContext())) {
                    k0Var.c = jLongValue;
                    Object[] objArr = bVar.e;
                    int i = bVar.z;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((h0) objArr[i2]).C = true;
                    }
                    wVar.e = e.j(coroutineScope.getCoroutineContext());
                }
                float f = wVar.e;
                if (f == 0.0f) {
                    Object[] objArr2 = bVar.e;
                    int i3 = bVar.z;
                    for (int i4 = 0; i4 < i3; i4++) {
                        h0 h0Var = (h0) objArr2[i4];
                        h0Var.z.setValue(h0Var.A.c);
                        h0Var.C = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - k0Var.c) / f);
                    Object[] objArr3 = bVar.e;
                    int i5 = bVar.z;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        h0 h0Var2 = (h0) objArr3[i6];
                        if (!h0Var2.B) {
                            h0Var2.E.b.setValue(Boolean.FALSE);
                            if (h0Var2.C) {
                                h0Var2.C = false;
                                h0Var2.D = j2;
                            }
                            long j3 = j2 - h0Var2.D;
                            h0Var2.z.setValue(h0Var2.A.f(j3));
                            h0Var2.B = h0Var2.A.e(j3);
                        }
                        if (!h0Var2.B) {
                            z = false;
                        }
                    }
                    k0Var.d.setValue(Boolean.valueOf(!z));
                }
                return kotlin.y.a;
            case 1:
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) this.y;
                androidx.compose.foundation.gestures.j2 j2Var = (androidx.compose.foundation.gestures.j2) this.z;
                kotlin.jvm.internal.w wVar3 = (kotlin.jvm.internal.w) this.A;
                androidx.compose.foundation.gestures.l lVar = (androidx.compose.foundation.gestures.l) this.B;
                l lVar2 = (l) obj;
                float fFloatValue = ((Number) lVar2.e.getValue()).floatValue() - wVar2.e;
                float fA = j2Var.a(fFloatValue);
                wVar2.e = ((Number) lVar2.e.getValue()).floatValue();
                wVar3.e = ((Number) lVar2.a.b.invoke(lVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    lVar2.i.setValue(Boolean.FALSE);
                    lVar2.d.invoke();
                }
                lVar.getClass();
                return kotlin.y.a;
            case 2:
                kotlin.jvm.internal.w wVar4 = (kotlin.jvm.internal.w) this.y;
                androidx.compose.foundation.gestures.j1 j1Var = (androidx.compose.foundation.gestures.j1) this.z;
                androidx.compose.foundation.gestures.l2 l2Var = (androidx.compose.foundation.gestures.l2) this.A;
                androidx.activity.compose.c cVar = (androidx.activity.compose.c) this.B;
                l lVar3 = (l) obj;
                androidx.compose.runtime.h1 h1Var = lVar3.e;
                kotlin.jvm.functions.a aVar = lVar3.d;
                androidx.compose.runtime.h1 h1Var2 = lVar3.i;
                float fFloatValue2 = ((Number) h1Var.getValue()).floatValue() - wVar4.e;
                if (androidx.compose.foundation.gestures.b1.a(fFloatValue2)) {
                    if (((Boolean) cVar.invoke(Float.valueOf(wVar4.e))).booleanValue()) {
                        h1Var2.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                } else if (androidx.compose.foundation.gestures.b1.a(fFloatValue2 - j1Var.c(l2Var, fFloatValue2))) {
                    wVar4.e += fFloatValue2;
                    if (((Boolean) cVar.invoke(Float.valueOf(wVar4.e))).booleanValue()) {
                        h1Var2.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                } else {
                    h1Var2.setValue(Boolean.FALSE);
                    aVar.invoke();
                }
                return kotlin.y.a;
            case 3:
                List list = (List) this.z;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.A;
                List list2 = (List) this.y;
                androidx.compose.foundation.lazy.grid.n nVar = (androidx.compose.foundation.lazy.grid.n) this.B;
                androidx.compose.foundation.lazy.layout.a1 a1Var = (androidx.compose.foundation.lazy.layout.a1) obj;
                androidx.compose.ui.layout.j1 j1Var2 = a1Var.e;
                int iA = j1Var2 != null ? j1Var2.a() : 0;
                int iB = 0;
                for (int i7 = 0; i7 < iA; i7++) {
                    androidx.compose.foundation.gestures.k1 k1Var = nVar.q;
                    androidx.compose.foundation.gestures.k1 k1Var2 = androidx.compose.foundation.gestures.k1.e;
                    androidx.compose.ui.layout.j1 j1Var3 = a1Var.e;
                    iB += (int) (k1Var == k1Var2 ? 4294967295L & (j1Var3 != null ? j1Var3.b(i7) : 0L) : (j1Var3 != null ? j1Var3.b(i7) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(iB));
                }
                if (xVar.e != list2.size()) {
                    xVar.e++;
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.foundation.text.r0 r0Var = (androidx.compose.foundation.text.r0) this.z;
                androidx.compose.ui.text.input.y yVar = (androidx.compose.ui.text.input.y) this.A;
                androidx.compose.ui.text.input.x xVar2 = (androidx.compose.ui.text.input.x) this.y;
                androidx.compose.ui.text.input.k kVar = (androidx.compose.ui.text.input.k) this.B;
                if (r0Var.b()) {
                    androidx.compose.foundation.text.input.internal.o oVar = r0Var.d;
                    androidx.compose.foundation.text.s sVar = r0Var.v;
                    androidx.compose.foundation.text.s sVar2 = r0Var.w;
                    kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                    a aVar2 = new a(4, oVar, sVar, zVar);
                    androidx.compose.ui.text.input.s sVar3 = yVar.a;
                    sVar3.a(xVar2, kVar, aVar2, sVar2);
                    androidx.compose.ui.text.input.d0 d0Var = new androidx.compose.ui.text.input.d0(yVar, sVar3);
                    yVar.b.set(d0Var);
                    zVar.e = d0Var;
                    r0Var.e = d0Var;
                }
                return new androidx.compose.foundation.text.x();
            case 5:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.z;
                androidx.navigation.internal.f fVar = (androidx.navigation.internal.f) this.A;
                androidx.navigation.t tVar = (androidx.navigation.t) this.y;
                Bundle bundle = (Bundle) this.B;
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                iVar.getClass();
                vVar.e = true;
                fVar.a(tVar, bundle, iVar, kotlin.collections.u.e);
                return kotlin.y.a;
            case 6:
                androidx.compose.runtime.t2 t2Var2 = (androidx.compose.runtime.t2) this.z;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.A;
                androidx.compose.runtime.t2 t2Var3 = (androidx.compose.runtime.t2) this.y;
                androidx.compose.runtime.t2 t2Var4 = (androidx.compose.runtime.t2) this.B;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                List list3 = (List) t2Var2.getValue();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (hashSet.add(((HiAnimeItem) obj3).b())) {
                        arrayList.add(obj3);
                    }
                }
                hVar.q(arrayList.size(), new androidx.compose.foundation.text.c0(7, new androidx.compose.ui.text.x(29), arrayList), new com.app.mlounge.ui.screens.anime.l(0, arrayList), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(arrayList, lVar4, t2Var3, 0)));
                if (((Boolean) t2Var4.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar, com.app.mlounge.ui.screens.anime.o.c, null);
                }
                return kotlin.y.a;
            case 7:
                androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) this.z;
                com.app.mlounge.ui.viewmodel.p pVar = (com.app.mlounge.ui.viewmodel.p) this.A;
                kotlin.jvm.functions.s sVar4 = (kotlin.jvm.functions.s) this.y;
                androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.B;
                androidx.compose.foundation.lazy.k kVar2 = (androidx.compose.foundation.lazy.k) obj;
                kVar2.getClass();
                List list4 = (List) y0Var2.getValue();
                kVar2.q(list4.size(), new androidx.compose.foundation.text.c0(8, new com.app.mlounge.ui.q(19), list4), new com.app.mlounge.ui.screens.adult.g(3, list4), new androidx.compose.runtime.internal.f(802480018, true, new androidx.navigation.compose.t(list4, pVar, y0Var2, sVar4, yVar2)));
                return kotlin.y.a;
            case 8:
                androidx.compose.runtime.t2 t2Var5 = (androidx.compose.runtime.t2) this.A;
                kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) this.y;
                androidx.compose.runtime.y0 y0Var3 = (androidx.compose.runtime.y0) this.z;
                androidx.compose.runtime.t2 t2Var6 = (androidx.compose.runtime.t2) this.B;
                androidx.compose.foundation.lazy.grid.h hVar2 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar2.getClass();
                hVar2.q(((List) t2Var5.getValue()).size(), new androidx.compose.material3.internal.u(t2Var5, 1), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(-1546571790, true, new com.app.mlounge.ui.f(pVar2, y0Var3, t2Var5)));
                if (((Boolean) t2Var6.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar2, com.app.mlounge.ui.screens.games.a.b, null);
                }
                return kotlin.y.a;
            case 9:
                List list5 = (List) this.A;
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.B;
                androidx.compose.runtime.y0 y0Var4 = (androidx.compose.runtime.y0) this.z;
                androidx.compose.foundation.lazy.k kVar3 = (androidx.compose.foundation.lazy.k) obj;
                kVar3.getClass();
                kVar3.q(list5.size(), new androidx.compose.foundation.text.c0(11, new com.app.mlounge.ui.screens.anime.n(18), list5), new com.app.mlounge.ui.screens.adult.g(6, list5), new androidx.compose.runtime.internal.f(2039820996, true, new com.app.mlounge.ui.screens.livetv.i(list5, a0Var, rVar, y0Var4)));
                return kotlin.y.a;
            case 10:
                List list6 = (List) this.z;
                com.app.mlounge.ui.screens.player.b1 b1Var = (com.app.mlounge.ui.screens.player.b1) this.A;
                kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) this.y;
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) this.B;
                androidx.compose.foundation.lazy.k kVar4 = (androidx.compose.foundation.lazy.k) obj;
                kVar4.getClass();
                androidx.compose.foundation.lazy.k.p(kVar4, new androidx.compose.runtime.internal.f(-1974660684, true, new androidx.compose.foundation.contextmenu.i(7, b1Var, aVar3)), 3);
                kVar4.q(list6.size(), null, new com.app.mlounge.ui.screens.adult.g(12, list6), new androidx.compose.runtime.internal.f(2039820996, true, new com.app.mlounge.ui.screens.anime.m(list6, b1Var, lVar5)));
                return kotlin.y.a;
            case 11:
                View view = (View) this.A;
                final androidx.compose.runtime.y0 y0Var5 = (androidx.compose.runtime.y0) this.z;
                final Map map = (Map) this.y;
                final com.app.mlounge.ui.viewmodel.k1 k1Var3 = (com.app.mlounge.ui.viewmodel.k1) this.B;
                ((androidx.compose.runtime.h0) obj).getClass();
                if (((String) y0Var5.getValue()) != null) {
                    view.setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: com.app.mlounge.ui.screens.settings.a0
                        @Override // android.view.View.OnGenericMotionListener
                        public final boolean onGenericMotion(View view2, MotionEvent motionEvent) {
                            int i8;
                            y0 y0Var6 = y0Var5;
                            if (((String) y0Var6.getValue()) != null && (motionEvent.getSource() & 16777232) == 16777232) {
                                float axisValue = motionEvent.getAxisValue(0);
                                float axisValue2 = motionEvent.getAxisValue(1);
                                float axisValue3 = motionEvent.getAxisValue(11);
                                float axisValue4 = motionEvent.getAxisValue(14);
                                if (axisValue2 < -0.5f) {
                                    i8 = 10001;
                                } else if (axisValue2 > 0.5f) {
                                    i8 = 10002;
                                } else if (axisValue < -0.5f) {
                                    i8 = 10003;
                                } else if (axisValue > 0.5f) {
                                    i8 = 10004;
                                } else if (axisValue4 < -0.5f) {
                                    i8 = 10005;
                                } else if (axisValue4 > 0.5f) {
                                    i8 = 10006;
                                } else if (axisValue3 < -0.5f) {
                                    i8 = 10007;
                                } else if (axisValue3 > 0.5f) {
                                    i8 = 10008;
                                }
                                LinkedHashMap linkedHashMapI = kotlin.collections.a0.I(map);
                                String str = (String) y0Var6.getValue();
                                str.getClass();
                                linkedHashMapI.put(str, Integer.valueOf(i8));
                                String string = new JSONObject(kotlin.collections.a0.H(linkedHashMapI)).toString();
                                string.getClass();
                                k1 k1Var4 = k1Var3;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var4), null, null, new g1(k1Var4, string, null, 4), 3, null);
                                y0Var6.setValue(null);
                                return true;
                            }
                            return false;
                        }
                    });
                }
                return new androidx.activity.compose.d(view, 15);
            case 12:
                com.app.mlounge.ui.viewmodel.k1 k1Var4 = (com.app.mlounge.ui.viewmodel.k1) this.A;
                androidx.compose.runtime.t2 t2Var7 = (androidx.compose.runtime.t2) this.y;
                androidx.compose.runtime.y0 y0Var6 = (androidx.compose.runtime.y0) this.z;
                androidx.compose.runtime.y0 y0Var7 = (androidx.compose.runtime.y0) this.B;
                if (!((Boolean) obj).booleanValue()) {
                    k1Var4.f(false);
                } else if (((String) t2Var7.getValue()) == null || kotlin.jvm.internal.l.a((String) t2Var7.getValue(), "LOADING")) {
                    y0Var7.setValue(Boolean.TRUE);
                } else {
                    y0Var6.setValue(Boolean.TRUE);
                }
                return kotlin.y.a;
            default:
                com.google.firebase.heartbeatinfo.h hVar3 = (com.google.firebase.heartbeatinfo.h) this.z;
                String str = (String) this.A;
                String str2 = (String) this.y;
                androidx.datastore.preferences.core.d dVar = (androidx.datastore.preferences.core.d) this.B;
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) obj;
                if (((String) com.google.android.material.sidesheet.b.m(aVar4, com.google.firebase.heartbeatinfo.h.d, "")).equals(str)) {
                    androidx.datastore.preferences.core.d dVarC = hVar3.c(aVar4, str);
                    if (dVarC != null && !dVarC.a.equals(str2)) {
                        synchronized (hVar3) {
                            hVar3.d(aVar4, str);
                            HashSet hashSet2 = new HashSet((Collection) com.google.android.material.sidesheet.b.m(aVar4, dVar, new HashSet()));
                            hashSet2.add(str);
                            aVar4.f(dVar, hashSet2);
                        }
                    }
                    return null;
                }
                androidx.datastore.preferences.core.d dVar2 = com.google.firebase.heartbeatinfo.h.c;
                long jLongValue3 = ((Long) com.google.android.material.sidesheet.b.m(aVar4, dVar2, 0L)).longValue();
                if (jLongValue3 + 1 == 30) {
                    synchronized (hVar3) {
                        try {
                            long jLongValue4 = ((Long) com.google.android.material.sidesheet.b.m(aVar4, dVar2, 0L)).longValue();
                            String str3 = "";
                            Set hashSet3 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : aVar4.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                            str3 = ((androidx.datastore.preferences.core.d) entry.getKey()).a;
                                            str4 = str5;
                                            hashSet3 = set;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet4 = new HashSet(hashSet3);
                            hashSet4.remove(str4);
                            str3.getClass();
                            aVar4.f(new androidx.datastore.preferences.core.d(str3), hashSet4);
                            jLongValue3 = jLongValue4 - 1;
                            aVar4.e(com.google.firebase.heartbeatinfo.h.c, Long.valueOf(jLongValue3));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet5 = new HashSet((Collection) com.google.android.material.sidesheet.b.m(aVar4, dVar, new HashSet()));
                hashSet5.add(str);
                aVar4.f(dVar, hashSet5);
                aVar4.e(com.google.firebase.heartbeatinfo.h.c, Long.valueOf(jLongValue3 + 1));
                aVar4.e(com.google.firebase.heartbeatinfo.h.d, str);
                return obj2;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, androidx.compose.runtime.y0 y0Var, androidx.compose.runtime.y0 y0Var2, int i) {
        this.e = i;
        this.A = obj;
        this.y = obj2;
        this.z = y0Var;
        this.B = y0Var2;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.y = obj3;
        this.B = obj4;
    }

    public /* synthetic */ i0(ArrayList arrayList, kotlin.jvm.internal.x xVar, List list, int i, androidx.compose.foundation.lazy.grid.n nVar) {
        this.e = 3;
        this.z = arrayList;
        this.A = xVar;
        this.y = list;
        this.B = nVar;
    }

    public /* synthetic */ i0(List list, com.app.mlounge.ui.viewmodel.a0 a0Var, kotlin.jvm.functions.r rVar, androidx.compose.runtime.y0 y0Var) {
        this.e = 9;
        this.A = list;
        this.y = a0Var;
        this.B = rVar;
        this.z = y0Var;
    }

    public /* synthetic */ i0(kotlin.jvm.internal.w wVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.y = wVar;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
