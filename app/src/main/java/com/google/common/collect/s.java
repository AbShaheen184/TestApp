package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractSet {
    public final /* synthetic */ int e;
    public final /* synthetic */ u y;

    public /* synthetic */ s(u uVar, int i) {
        this.e = i;
        this.y = uVar;
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
                u uVar = this.y;
                Map mapB = uVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = uVar.d(entry.getKey());
                    if (iD != -1 && kotlin.collections.a0.n(uVar.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                u uVar = this.y;
                Map mapB = uVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new r(uVar, 1);
            default:
                u uVar2 = this.y;
                Map mapB2 = uVar2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new r(uVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                u uVar = this.y;
                Map mapB = uVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!uVar.f()) {
                        int iC = uVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = uVar.e;
                        Objects.requireNonNull(obj2);
                        int iQ = q.q(key, value, iC, obj2, uVar.h(), uVar.i(), uVar.j());
                        if (iQ != -1) {
                            uVar.e(iQ, iC);
                            uVar.C--;
                            uVar.B += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                u uVar2 = this.y;
                Map mapB2 = uVar2.b();
                if (mapB2 != null) {
                    return mapB2.keySet().remove(obj);
                }
                return uVar2.g(obj) != u.G;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.size();
    }
}
