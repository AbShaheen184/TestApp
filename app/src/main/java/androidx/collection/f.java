package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends y0 implements Map {
    public a A;
    public c B;
    public e C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y0 y0Var) {
        super(0);
        int i = y0Var.z;
        b(this.z + i);
        if (this.z != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(y0Var.f(i2), y0Var.i(i2));
            }
        } else if (i > 0) {
            kotlin.collections.n.C(0, 0, i, y0Var.e, this.e);
            kotlin.collections.n.D(0, 0, i << 1, y0Var.y, this.y);
            this.z = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this, 0);
        this.A = aVar2;
        return aVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.z;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.z;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.B;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.B = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.z);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.C;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.C = eVar2;
        return eVar2;
    }

    public f() {
        super(0);
    }
}
