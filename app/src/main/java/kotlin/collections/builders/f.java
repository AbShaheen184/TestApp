package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.h;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public final /* synthetic */ int e;
    public final e y;

    public /* synthetic */ f(e eVar, int i) {
        this.e = i;
        this.y = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
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
                e eVar = this.y;
                eVar.getClass();
                int iG = eVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = eVar.y;
                objArr.getClass();
                return l.a(objArr[iG], entry.getValue());
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                return this.y.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // kotlin.collections.h
    public final int getSize() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                e eVar = this.y;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.y;
                eVar2.getClass();
                return new c(eVar2, 1);
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
                e eVar = this.y;
                eVar.getClass();
                eVar.c();
                int iG = eVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = eVar.y;
                objArr.getClass();
                if (!l.a(objArr[iG], entry.getValue())) {
                    return false;
                }
                eVar.k(iG);
                return true;
            default:
                e eVar2 = this.y;
                eVar2.c();
                int iG2 = eVar2.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                eVar2.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                this.y.c();
                break;
            default:
                this.y.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                this.y.c();
                break;
            default:
                this.y.c();
                break;
        }
        return super.retainAll(collection);
    }
}
