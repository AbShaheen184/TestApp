package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends o implements Serializable {
    public final transient Map A;
    public transient int B;
    public transient w0 C;

    public x0(Map map) {
        com.google.android.material.motion.a.f(map.isEmpty());
        this.A = map;
    }

    @Override // com.google.common.collect.o
    public final Map b() {
        Map map = this.A;
        if (map instanceof NavigableMap) {
            return new f(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new i(this, (SortedMap) map) : new d(this, map);
    }

    @Override // com.google.common.collect.o
    public final Set c() {
        Map map = this.A;
        if (map instanceof NavigableMap) {
            return new g(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new j(this, (SortedMap) map) : new e(this, map);
    }

    public final void d() {
        Map map = this.A;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.B = 0;
    }

    public final Collection e() {
        return (List) this.C.get();
    }
}
