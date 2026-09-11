package com.google.firebase.components;

import android.util.Log;
import androidx.media3.ui.c0;
import com.google.android.gms.measurement.internal.e0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c {
    public static final f h = new f(0);
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashSet d;
    public final l e;
    public final AtomicReference f;
    public final e0 g;

    public g(ArrayList arrayList, ArrayList arrayList2, e0 e0Var) {
        com.google.firebase.concurrent.j jVar = com.google.firebase.concurrent.j.e;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        l lVar = new l();
        this.e = lVar;
        this.g = e0Var;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.c(lVar, l.class, com.google.firebase.events.c.class, com.google.firebase.events.b.class));
        arrayList3.add(b.c(this, g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((com.google.firebase.inject.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.j(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((b) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.d.add(obj.toString());
                    }
                }
            }
            if (this.a.isEmpty()) {
                com.google.android.material.shape.e.c(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                com.google.android.material.shape.e.c(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.a.put(bVar2, new n(new com.google.firebase.c(1, this, bVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // com.google.firebase.components.c
    public final synchronized com.google.firebase.inject.b b(r rVar) {
        com.google.android.material.shape.k.D(rVar, "Null interface requested.");
        return (com.google.firebase.inject.b) this.b.get(rVar);
    }

    @Override // com.google.firebase.components.c
    public final synchronized com.google.firebase.inject.b e(r rVar) {
        o oVar = (o) this.c.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return h;
    }

    @Override // com.google.firebase.components.c
    public final p g(r rVar) {
        com.google.firebase.inject.b bVarB = b(rVar);
        if (bVarB == null) {
            return new p(p.c, p.d);
        }
        return bVarB instanceof p ? (p) bVarB : new p(null, bVarB);
    }

    public final void h(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            com.google.firebase.inject.b bVar2 = (com.google.firebase.inject.b) entry.getValue();
            int i = bVar.d;
            if (i == 1 || (i == 2 && z)) {
                bVar2.get();
            }
        }
        l lVar = this.e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.b;
                if (arrayDeque != null) {
                    lVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
            }
        }
    }

    public final void i() {
        HashMap map = this.b;
        HashMap map2 = this.c;
        for (b bVar : this.a.keySet()) {
            for (j jVar : bVar.c) {
                boolean z = jVar.b == 2;
                r rVar = jVar.a;
                if (z && !map2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.b = null;
                    oVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.a.addAll(set);
                    map2.put(rVar, oVar);
                } else if (map.containsKey(rVar)) {
                    continue;
                } else {
                    int i = jVar.b;
                    if (i == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + rVar, 7);
                    }
                    if (i != 2) {
                        map.put(rVar, new p(p.c, p.d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.e == 0) {
                com.google.firebase.inject.b bVar2 = (com.google.firebase.inject.b) this.a.get(bVar);
                for (r rVar : bVar.b) {
                    HashMap map = this.b;
                    if (map.containsKey(rVar)) {
                        arrayList2.add(new c0(5, (p) ((com.google.firebase.inject.b) map.get(rVar)), bVar2));
                    } else {
                        map.put(rVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap map = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                com.google.firebase.inject.b bVar2 = (com.google.firebase.inject.b) entry.getValue();
                for (r rVar : bVar.b) {
                    if (!map2.containsKey(rVar)) {
                        map2.put(rVar, new HashSet());
                    }
                    ((Set) map2.get(rVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                o oVar = (o) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new c0(6, oVar, (com.google.firebase.inject.b) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.b = null;
                oVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.a.addAll(set);
                map.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
