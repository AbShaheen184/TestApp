package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public final transient e z;

    public c(e eVar) {
        this.z = eVar;
    }

    @Override // com.google.android.gms.internal.common.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.z.contains(obj);
    }

    @Override // com.google.android.gms.internal.common.e
    public final e f() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.z;
        com.google.firebase.b.L(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final e subList(int i, int i2) {
        e eVar = this.z;
        com.google.firebase.b.M(i, i2, eVar.size());
        return eVar.subList(eVar.size() - i2, eVar.size() - i).f();
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    public final int indexOf(Object obj) {
        e eVar = this.z;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.z;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.size();
    }
}
