package androidx.datastore.preferences;

import com.app.mlounge.ui.viewmodel.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements q {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                i iVar = new i(3, 0, (kotlin.coroutines.d) obj3);
                iVar.y = (androidx.datastore.migrations.e) obj;
                iVar.z = (androidx.datastore.preferences.core.a) obj2;
                return iVar.invokeSuspend(y.a);
            default:
                i iVar2 = new i(3, 1, (kotlin.coroutines.d) obj3);
                iVar2.y = (List) obj;
                iVar2.z = (y1) obj2;
                return iVar2.invokeSuspend(y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                androidx.datastore.migrations.e eVar = (androidx.datastore.migrations.e) this.y;
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.z;
                Set setKeySet = aVar.a().keySet();
                ArrayList arrayList = new ArrayList(p.y(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.datastore.preferences.core.d) it.next()).a);
                }
                Map<String, ?> all = eVar.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a0.u(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = o.o0((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        androidx.datastore.preferences.core.a aVar2 = new androidx.datastore.preferences.core.a(new LinkedHashMap(aVar.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                str.getClass();
                                aVar2.f(new androidx.datastore.preferences.core.d(str), value2);
                            } else if (value2 instanceof Float) {
                                str.getClass();
                                aVar2.f(new androidx.datastore.preferences.core.d(str), value2);
                            } else if (value2 instanceof Integer) {
                                str.getClass();
                                aVar2.f(new androidx.datastore.preferences.core.d(str), value2);
                            } else if (value2 instanceof Long) {
                                str.getClass();
                                aVar2.f(new androidx.datastore.preferences.core.d(str), value2);
                            } else if (value2 instanceof String) {
                                str.getClass();
                                aVar2.f(new androidx.datastore.preferences.core.d(str), value2);
                            } else if (value2 instanceof Set) {
                                str.getClass();
                                aVar2.f(new androidx.datastore.preferences.core.d(str), (Set) value2);
                            }
                        }
                        return new androidx.datastore.preferences.core.a(new LinkedHashMap(aVar2.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = eVar.b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                break;
            default:
                List list = (List) this.y;
                y1 y1Var = (y1) this.z;
                kotlin.a.e(obj);
                switch (y1Var.ordinal()) {
                    case 0:
                        return o.f0(list, new androidx.constraintlayout.core.e(25));
                    case 1:
                        return o.f0(list, new androidx.constraintlayout.core.e(21));
                    case 2:
                        return o.f0(list, new androidx.constraintlayout.core.e(22));
                    case 3:
                        return o.f0(list, new androidx.constraintlayout.core.e(26));
                    case 4:
                        return o.f0(list, new androidx.constraintlayout.core.e(27));
                    case 5:
                        return o.f0(list, new androidx.constraintlayout.core.e(23));
                    case 6:
                        return o.f0(list, new androidx.constraintlayout.core.e(28));
                    case 7:
                        return o.f0(list, new androidx.constraintlayout.core.e(24));
                    default:
                        coil3.g.a();
                        return null;
                }
        }
    }
}
