package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x6 extends n5 implements f6 {
    public final com.google.firebase.analytics.connector.internal.b d;

    public x6(com.google.firebase.analytics.connector.internal.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.d = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final int b() {
        return System.identityHashCode(this.d);
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.d);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        o5.d(parcel);
        f(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final void f(String str, String str2, Bundle bundle, long j) {
        this.d.a(str, str2, bundle, j);
    }
}
