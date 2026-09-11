package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {
    public c e;
    public c y;
    public final WeakHashMap z = new WeakHashMap();
    public int A = 0;

    public c b(Object obj) {
        c cVar = this.e;
        while (cVar != null && !cVar.e.equals(obj)) {
            cVar = cVar.z;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.A--;
        WeakHashMap weakHashMap = this.z;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(cVarB);
            }
        }
        c cVar = cVarB.A;
        c cVar2 = cVarB.z;
        if (cVar != null) {
            cVar.z = cVar2;
        } else {
            this.e = cVar2;
        }
        c cVar3 = cVarB.z;
        if (cVar3 != null) {
            cVar3.A = cVar;
        } else {
            this.y = cVar;
        }
        cVarB.z = null;
        cVarB.A = null;
        return cVarB.y;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.A != fVar.A) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.e, this.y, 0);
        this.z.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
