package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends n5 implements m0 {
    public final /* synthetic */ AtomicReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(o3 o3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.d = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.m0
    public final void A(List list) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(a4.CREATOR);
        o5.d(parcel);
        A(arrayListCreateTypedArrayList);
        return true;
    }
}
