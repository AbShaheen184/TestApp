package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements e {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, e.c);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        h hVar;
        String str = e.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.d = strongBinder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            dVar.getClass();
            int i3 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
                synchronized (multiInstanceInvalidationService.z) {
                    try {
                        int i4 = multiInstanceInvalidationService.e + 1;
                        multiInstanceInvalidationService.e = i4;
                        if (multiInstanceInvalidationService.z.register(dVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.y.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.e--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.b);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                    c cVar2 = new c();
                    cVar2.d = strongBinder2;
                    dVar2 = cVar2;
                } else {
                    dVar2 = (d) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            dVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.z) {
                multiInstanceInvalidationService2.z.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.d;
        synchronized (multiInstanceInvalidationService3.z) {
            String str2 = (String) multiInstanceInvalidationService3.y.get(Integer.valueOf(i6));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.z.beginBroadcast();
                int i7 = 0;
                while (true) {
                    hVar = multiInstanceInvalidationService3.z;
                    if (i7 >= iBeginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = hVar.getBroadcastCookie(i7);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.y.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((d) multiInstanceInvalidationService3.z.getBroadcastItem(i7)).j(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i7++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.z.finishBroadcast();
                        throw th2;
                    }
                }
                hVar.finishBroadcast();
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
