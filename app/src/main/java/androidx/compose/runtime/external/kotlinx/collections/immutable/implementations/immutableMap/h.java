package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection, kotlin.jvm.internal.markers.b {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ h(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.e) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((androidx.compose.runtime.internal.i) this.y).clear();
                break;
            default:
                ((kotlin.collections.builders.e) this.y).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((androidx.compose.runtime.internal.i) this.y).containsValue(obj);
            default:
                return ((kotlin.collections.builders.e) this.y).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 1:
                return ((kotlin.collections.builders.e) this.y).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.internal.i iVar = (androidx.compose.runtime.internal.i) this.y;
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(2);
                }
                return new g(iVar, nVarArr);
            default:
                kotlin.collections.builders.e eVar = (kotlin.collections.builders.e) this.y;
                eVar.getClass();
                return new kotlin.collections.builders.c(eVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.e) {
            case 1:
                kotlin.collections.builders.e eVar = (kotlin.collections.builders.e) this.y;
                eVar.c();
                int iH = eVar.h(obj);
                if (iH < 0) {
                    return false;
                }
                eVar.k(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.e) {
            case 1:
                collection.getClass();
                ((kotlin.collections.builders.e) this.y).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.e) {
            case 1:
                collection.getClass();
                ((kotlin.collections.builders.e) this.y).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((androidx.compose.runtime.internal.i) this.y).size();
            default:
                return ((kotlin.collections.builders.e) this.y).F;
        }
    }
}
