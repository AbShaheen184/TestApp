package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public IBinder d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override // androidx.room.d
    public final void j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.b);
            parcelObtain.writeStringArray(strArr);
            this.d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
