package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ArrayList {
    public final String b(String str) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) it.next();
            if (jVar.q(str)) {
                return jVar.d(str);
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final org.jsoup.nodes.o c() {
        if (isEmpty()) {
            return null;
        }
        return (org.jsoup.nodes.o) get(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((org.jsoup.nodes.o) it.next()).F();
        }
        super.clear();
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        e eVar = new e(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            eVar.add(((org.jsoup.nodes.j) it.next()).l());
        }
        return eVar;
    }

    public final String d() {
        return (String) stream().map(new androidx.media3.exoplayer.audio.f(9)).collect(org.jsoup.internal.k.k(" "));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        org.jsoup.nodes.o oVar = (org.jsoup.nodes.o) super.remove(iIndexOf);
        oVar.F();
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((org.jsoup.nodes.o) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) ((org.jsoup.nodes.o) unaryOperator.apply((org.jsoup.nodes.o) get(i)));
            org.jsoup.helper.n.H(jVar);
            org.jsoup.nodes.o oVar = (org.jsoup.nodes.o) super.set(i, jVar);
            oVar.H(jVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((org.jsoup.nodes.o) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) obj;
        org.jsoup.helper.n.H(jVar);
        org.jsoup.nodes.o oVar = (org.jsoup.nodes.o) super.set(i, jVar);
        oVar.H(jVar);
        return (org.jsoup.nodes.j) oVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return (String) stream().map(new androidx.media3.exoplayer.audio.f(10)).collect(org.jsoup.internal.k.k("\n"));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        org.jsoup.nodes.o oVar = (org.jsoup.nodes.o) super.remove(i);
        oVar.F();
        return (org.jsoup.nodes.j) oVar;
    }
}
