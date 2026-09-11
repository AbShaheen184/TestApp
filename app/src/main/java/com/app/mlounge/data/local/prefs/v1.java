package com.app.mlounge.data.local.prefs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ FlowCollector y;

    public /* synthetic */ v1(FlowCollector flowCollector, int i) {
        this.e = i;
        this.y = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0211  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:178:0x0315  */
    /* JADX WARN: Code duplicated, block: B:194:0x035d  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        u1 u1Var;
        w1 w1Var;
        com.app.mlounge.data.repository.k0 k0Var;
        com.app.mlounge.data.repository.n0 n0Var;
        com.app.mlounge.data.repository.o0 o0Var;
        com.app.mlounge.ui.viewmodel.d0 d0Var;
        com.app.mlounge.ui.viewmodel.i1 i1Var;
        com.app.mlounge.ui.viewmodel.v1 v1Var;
        switch (this.e) {
            case 0:
                if (dVar instanceof u1) {
                    u1Var = (u1) dVar;
                    int i = u1Var.y;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u1Var.y = i - Integer.MIN_VALUE;
                    } else {
                        u1Var = new u1(this, dVar);
                    }
                } else {
                    u1Var = new u1(this, dVar);
                }
                Object obj2 = u1Var.e;
                int i2 = u1Var.y;
                if (i2 == 0) {
                    kotlin.a.e(obj2);
                    Object objC = ((androidx.datastore.preferences.core.a) obj).c(y1.q0);
                    u1Var.y = 1;
                    Object objEmit = this.y.emit(objC, u1Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj2);
                }
                return kotlin.y.a;
            case 1:
                if (dVar instanceof w1) {
                    w1Var = (w1) dVar;
                    int i3 = w1Var.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        w1Var.y = i3 - Integer.MIN_VALUE;
                    } else {
                        w1Var = new w1(this, dVar);
                    }
                } else {
                    w1Var = new w1(this, dVar);
                }
                Object obj3 = w1Var.e;
                int i4 = w1Var.y;
                if (i4 == 0) {
                    kotlin.a.e(obj3);
                    Object objC2 = ((androidx.datastore.preferences.core.a) obj).c(y1.r0);
                    w1Var.y = 1;
                    Object objEmit2 = this.y.emit(objC2, w1Var);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj3);
                }
                return kotlin.y.a;
            case 2:
                if (dVar instanceof com.app.mlounge.data.repository.k0) {
                    k0Var = (com.app.mlounge.data.repository.k0) dVar;
                    int i5 = k0Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        k0Var.y = i5 - Integer.MIN_VALUE;
                    } else {
                        k0Var = new com.app.mlounge.data.repository.k0(this, dVar);
                    }
                } else {
                    k0Var = new com.app.mlounge.data.repository.k0(this, dVar);
                }
                Object obj4 = k0Var.e;
                int i6 = k0Var.y;
                if (i6 == 0) {
                    kotlin.a.e(obj4);
                    List<com.app.mlounge.data.local.entity.e> list = (List) obj;
                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(list, 10));
                    if (iU < 16) {
                        iU = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                    for (com.app.mlounge.data.local.entity.e eVar : list) {
                        linkedHashMap.put(eVar.a, new Float(eVar.a()));
                    }
                    k0Var.y = 1;
                    Object objEmit3 = this.y.emit(linkedHashMap, k0Var);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj4);
                }
                return kotlin.y.a;
            case 3:
                if (dVar instanceof com.app.mlounge.data.repository.n0) {
                    n0Var = (com.app.mlounge.data.repository.n0) dVar;
                    int i7 = n0Var.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        n0Var.y = i7 - Integer.MIN_VALUE;
                    } else {
                        n0Var = new com.app.mlounge.data.repository.n0(this, dVar);
                    }
                } else {
                    n0Var = new com.app.mlounge.data.repository.n0(this, dVar);
                }
                Object obj5 = n0Var.e;
                int i8 = n0Var.y;
                if (i8 == 0) {
                    kotlin.a.e(obj5);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : (List) obj) {
                        if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj6).b, "tv")) {
                            arrayList.add(obj6);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = ((com.app.mlounge.data.local.entity.c) it.next()).l;
                        Integer numQ = str != null ? kotlin.text.r.Q(str) : null;
                        if (numQ != null) {
                            arrayList2.add(numQ);
                        }
                    }
                    Set setO0 = kotlin.collections.o.o0(arrayList2);
                    n0Var.y = 1;
                    Object objEmit4 = this.y.emit(setO0, n0Var);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i8 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj5);
                }
                return kotlin.y.a;
            case 4:
                if (dVar instanceof com.app.mlounge.data.repository.o0) {
                    o0Var = (com.app.mlounge.data.repository.o0) dVar;
                    int i9 = o0Var.y;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        o0Var.y = i9 - Integer.MIN_VALUE;
                    } else {
                        o0Var = new com.app.mlounge.data.repository.o0(this, dVar);
                    }
                } else {
                    o0Var = new com.app.mlounge.data.repository.o0(this, dVar);
                }
                Object obj7 = o0Var.e;
                int i10 = o0Var.y;
                if (i10 == 0) {
                    kotlin.a.e(obj7);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((Set) obj).iterator();
                    while (true) {
                        Integer numQ2 = null;
                        if (it2.hasNext()) {
                            List listP0 = kotlin.text.k.p0(new String[]{":"}, (String) it2.next(), 6);
                            if (listP0.size() == 4 && kotlin.jvm.internal.l.a(listP0.get(0), "tv")) {
                                numQ2 = kotlin.text.r.Q((String) listP0.get(1));
                            }
                            if (numQ2 != null) {
                                arrayList3.add(numQ2);
                            }
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                Integer numValueOf = Integer.valueOf(((Number) it3.next()).intValue());
                                Object xVar = linkedHashMap2.get(numValueOf);
                                if (xVar == null && !linkedHashMap2.containsKey(numValueOf)) {
                                    xVar = new kotlin.jvm.internal.x();
                                }
                                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) xVar;
                                xVar2.e++;
                                linkedHashMap2.put(numValueOf, xVar2);
                            }
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                entry.getClass();
                                if ((entry instanceof kotlin.jvm.internal.markers.a) && !(entry instanceof kotlin.jvm.internal.markers.c)) {
                                    kotlin.jvm.internal.c0.g(entry, "kotlin.collections.MutableMap.MutableEntry");
                                    throw null;
                                }
                                entry.setValue(Integer.valueOf(((kotlin.jvm.internal.x) entry.getValue()).e));
                            }
                            Map mapB = kotlin.jvm.internal.c0.b(linkedHashMap2);
                            o0Var.y = 1;
                            Object objEmit5 = this.y.emit(mapB, o0Var);
                            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                            if (objEmit5 == aVar5) {
                                return aVar5;
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj7);
                }
                return kotlin.y.a;
            case 5:
                if (dVar instanceof com.app.mlounge.ui.viewmodel.d0) {
                    d0Var = (com.app.mlounge.ui.viewmodel.d0) dVar;
                    int i11 = d0Var.y;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        d0Var.y = i11 - Integer.MIN_VALUE;
                    } else {
                        d0Var = new com.app.mlounge.ui.viewmodel.d0(this, dVar);
                    }
                } else {
                    d0Var = new com.app.mlounge.ui.viewmodel.d0(this, dVar);
                }
                Object obj8 = d0Var.e;
                int i12 = d0Var.y;
                if (i12 == 0) {
                    kotlin.a.e(obj8);
                    String str2 = (String) obj;
                    Boolean boolValueOf = Boolean.valueOf(!(str2 == null || kotlin.text.k.d0(str2)));
                    d0Var.y = 1;
                    Object objEmit6 = this.y.emit(boolValueOf, d0Var);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj8);
                }
                return kotlin.y.a;
            case 6:
                if (dVar instanceof com.app.mlounge.ui.viewmodel.i1) {
                    i1Var = (com.app.mlounge.ui.viewmodel.i1) dVar;
                    int i13 = i1Var.y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        i1Var.y = i13 - Integer.MIN_VALUE;
                    } else {
                        i1Var = new com.app.mlounge.ui.viewmodel.i1(this, dVar);
                    }
                } else {
                    i1Var = new com.app.mlounge.ui.viewmodel.i1(this, dVar);
                }
                Object obj9 = i1Var.e;
                int i14 = i1Var.y;
                if (i14 == 0) {
                    kotlin.a.e(obj9);
                    String str3 = (String) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(!(str3 == null || kotlin.text.k.d0(str3)));
                    i1Var.y = 1;
                    Object objEmit7 = this.y.emit(boolValueOf2, i1Var);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit7 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i14 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj9);
                }
                return kotlin.y.a;
            default:
                if (dVar instanceof com.app.mlounge.ui.viewmodel.v1) {
                    v1Var = (com.app.mlounge.ui.viewmodel.v1) dVar;
                    int i15 = v1Var.y;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        v1Var.y = i15 - Integer.MIN_VALUE;
                    } else {
                        v1Var = new com.app.mlounge.ui.viewmodel.v1(this, dVar);
                    }
                } else {
                    v1Var = new com.app.mlounge.ui.viewmodel.v1(this, dVar);
                }
                Object obj10 = v1Var.e;
                int i16 = v1Var.y;
                if (i16 == 0) {
                    kotlin.a.e(obj10);
                    String str4 = (String) obj;
                    Boolean boolValueOf3 = Boolean.valueOf(!(str4 == null || kotlin.text.k.d0(str4)));
                    v1Var.y = 1;
                    Object objEmit8 = this.y.emit(boolValueOf3, v1Var);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objEmit8 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj10);
                }
                return kotlin.y.a;
        }
    }
}
