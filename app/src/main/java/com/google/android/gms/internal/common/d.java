package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public final transient int A;
    public final /* synthetic */ e B;
    public final transient int z;

    public d(e eVar, int i, int i2) {
        this.B = eVar;
        this.z = i;
        this.A = i2;
    }

    @Override // com.google.android.gms.internal.common.a
    public final Object[] b() {
        return this.B.b();
    }

    @Override // com.google.android.gms.internal.common.a
    public final int c() {
        return this.B.c() + this.z;
    }

    @Override // com.google.android.gms.internal.common.a
    public final int d() {
        return this.B.c() + this.z + this.A;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.google.firebase.b.L(i, this.A);
        return this.B.get(i + this.z);
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    /* JADX INFO: renamed from: h */
    public final e subList(int i, int i2) {
        com.google.firebase.b.M(i, i2, this.A);
        int i3 = this.z;
        return this.B.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
