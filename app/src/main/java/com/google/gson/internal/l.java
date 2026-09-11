package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractSet {
    public final /* synthetic */ int e;
    public final /* synthetic */ n y;

    public /* synthetic */ l(n nVar, int i) {
        this.e = i;
        this.y = nVar;
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
        m mVarA;
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                n nVar = this.y;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                        mVarA = null;
                    }
                    break;
                } else {
                    mVarA = null;
                }
                if (mVarA != null && Objects.equals(mVarA.E, entry.getValue())) {
                    mVar = mVarA;
                }
                return mVar != null;
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new k(this.y, 0);
            default:
                return new k(this.y, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        m mVarA;
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = this.y;
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                        mVarA = null;
                    }
                    break;
                } else {
                    mVarA = null;
                }
                if (mVarA != null && Objects.equals(mVarA.E, entry.getValue())) {
                    mVar = mVarA;
                }
                if (mVar == null) {
                    return false;
                }
                nVar.c(mVar, true);
                return true;
            default:
                n nVar2 = this.y;
                m mVarA2 = null;
                if (obj != null) {
                    try {
                        mVarA2 = nVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVarA2 != null) {
                    nVar2.c(mVarA2, true);
                }
                return mVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.A;
    }
}
