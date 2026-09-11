package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 extends n5 implements d6 {
    public final /* synthetic */ com.google.common.util.concurrent.l0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(m6 m6Var, com.google.common.util.concurrent.l0 l0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.d = l0Var;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void c() {
        this.d.run();
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        c();
        return true;
    }
}
