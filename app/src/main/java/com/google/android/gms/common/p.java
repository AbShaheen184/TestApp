package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final k a;
    public static final k b;
    public static volatile w c;
    public static final Object d;
    public static Context e;

    static {
        new k(l.J("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new k(l.J("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new k(l.J("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new k(l.J("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new k(l.J("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new k(l.J("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    public static void a() {
        w uVar;
        if (c != null) {
            return;
        }
        x.g(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = com.google.android.gms.dynamite.e.c(e, com.google.android.gms.dynamite.e.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = v.e;
                    if (iBinderB == null) {
                        uVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    c = uVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static s b(String str, m mVar, boolean z, boolean z2) {
        try {
            a();
            x.g(e);
            try {
                w wVar = c;
                com.google.android.gms.dynamic.b bVar = new com.google.android.gms.dynamic.b(e.getPackageManager());
                u uVar = (u) wVar;
                Parcel parcelH = uVar.h();
                int i = com.google.android.gms.internal.common.g.a;
                boolean z3 = true;
                parcelH.writeInt(1);
                int iH = androidx.room.r.H(parcelH, 20293);
                androidx.room.r.D(parcelH, 1, str);
                androidx.room.r.A(parcelH, 2, mVar);
                androidx.room.r.G(parcelH, 3, 4);
                parcelH.writeInt(z ? 1 : 0);
                androidx.room.r.G(parcelH, 4, 4);
                parcelH.writeInt(z2 ? 1 : 0);
                androidx.room.r.I(parcelH, iH);
                com.google.android.gms.internal.common.g.b(parcelH, bVar);
                Parcel parcelD = uVar.d(parcelH, 5);
                if (parcelD.readInt() == 0) {
                    z3 = false;
                }
                parcelD.recycle();
                return z3 ? s.d : new r(new n(z, str, mVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return s.c(e2, "module call");
            }
        } catch (com.google.android.gms.dynamite.b e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return s.c(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
