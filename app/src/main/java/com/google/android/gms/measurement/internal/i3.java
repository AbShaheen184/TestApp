package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends n5 implements o0 {
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ o3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(o3 o3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.d = atomicReference;
        this.e = o3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        f4 f4Var = (f4) o5.a(parcel, f4.CREATOR);
        o5.d(parcel);
        y(f4Var);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.o0
    public final void y(f4 f4Var) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            x0 x0Var = ((s1) this.e.e).C;
            s1.m(x0Var);
            x0Var.K.b(Integer.valueOf(f4Var.e.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(f4Var);
            atomicReference.notifyAll();
        }
    }
}
