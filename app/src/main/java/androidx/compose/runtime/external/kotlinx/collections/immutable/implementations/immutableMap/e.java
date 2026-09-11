package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.collections.h {
    public final /* synthetic */ int e;
    public final androidx.compose.runtime.internal.i y;

    public /* synthetic */ e(int i, androidx.compose.runtime.internal.i iVar) {
        this.e = i;
        this.y = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.y.clear();
                break;
            default:
                this.y.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                androidx.compose.runtime.internal.i iVar = this.y;
                Object obj2 = iVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && iVar.containsKey(entry.getKey());
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // kotlin.collections.h
    public final int getSize() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new f(this.y);
            default:
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(1);
                }
                return new g(this.y, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.y.remove(entry.getKey(), entry.getValue());
            default:
                androidx.compose.runtime.internal.i iVar = this.y;
                if (!iVar.containsKey(obj)) {
                    return false;
                }
                iVar.remove(obj);
                return true;
        }
    }
}
