package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.u;
import com.google.common.util.concurrent.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    public final /* synthetic */ int d = 0;

    public b(String str) {
        attachInterface(this, str);
    }

    public boolean G(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.d;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.d) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                u uVar = (u) this;
                switch (i) {
                    case 3:
                        c.b(parcel);
                        break;
                    case 4:
                        c.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        c.b(parcel);
                        break;
                    case 7:
                        c.b(parcel);
                        break;
                    case 8:
                        com.google.android.gms.signin.internal.e eVar = (com.google.android.gms.signin.internal.e) c.a(parcel, com.google.android.gms.signin.internal.e.CREATOR);
                        c.b(parcel);
                        uVar.f.post(new l0(8, uVar, eVar, false));
                        break;
                    case 9:
                        c.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return G(i, parcel, parcel2);
        }
    }

    public /* synthetic */ b() {
    }
}
