package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.datastore.preferences.protobuf.h1;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static h c;
    public final Context a;
    public volatile String b;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public static h a(Context context) {
        x.g(context);
        synchronized (h.class) {
            if (c == null) {
                k kVar = p.a;
                synchronized (p.class) {
                    if (p.e == null) {
                        p.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new h(context);
            }
        }
        return c;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        com.google.android.gms.internal.common.f fVar;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & Token.DEFAULT) == 0) ? false : true;
            }
            try {
                com.google.android.gms.internal.common.f fVar2 = z ? o.c : o.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        com.google.android.gms.internal.common.b bVar = com.google.android.gms.internal.common.e.y;
                        Object[] objArr = {byteArray};
                        com.google.android.gms.dynamite.g.F(1, objArr);
                        fVar = new com.google.android.gms.internal.common.f(objArr, 1);
                    } else {
                        com.google.android.gms.internal.common.b bVar2 = com.google.android.gms.internal.common.e.y;
                        fVar = com.google.android.gms.internal.common.f.B;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        com.google.android.gms.internal.common.b bVar3 = com.google.android.gms.internal.common.e.y;
                        fVar = com.google.android.gms.internal.common.f.B;
                    } else {
                        com.google.android.gms.internal.common.b bVar4 = com.google.android.gms.internal.common.e.y;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        fVar = i4 == 0 ? com.google.android.gms.internal.common.f.B : new com.google.android.gms.internal.common.f(objArrCopyOf, i4);
                    }
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                com.google.android.gms.internal.common.e eVarF = fVar.f();
                int size = eVarF.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) eVarF.get(i6);
                    com.google.android.gms.internal.common.b bVarI = fVar2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!bVarI.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarI.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? d(packageInfo, o.a) : d(packageInfo, o.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static l d(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < lVarArr.length; i++) {
                if (lVarArr[i].equals(mVar)) {
                    return lVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01c6  */
    public final boolean b(int i) {
        s sVarB;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            sVarB = s.b("no pkgs");
        } else {
            sVarB = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    x.g(sVarB);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    sVarB = s.b("null pkg");
                } else if (str.equals(this.b)) {
                    sVarB = s.d;
                } else {
                    k kVar = p.a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            p.a();
                            boolean zI = ((u) p.c).I();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zI) {
                                boolean zA = g.a(this.a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    x.g(p.e);
                                    try {
                                        p.a();
                                        x.g(p.e);
                                        Context context = (Context) com.google.android.gms.dynamic.b.I(com.google.android.gms.dynamic.b.H(new com.google.android.gms.dynamic.b(p.e)));
                                        try {
                                            u uVar = (u) p.c;
                                            Parcel parcelH = uVar.h();
                                            int i3 = com.google.android.gms.internal.common.g.a;
                                            parcelH.writeInt(1);
                                            int iH = androidx.room.r.H(parcelH, 20293);
                                            androidx.room.r.D(parcelH, 1, str);
                                            androidx.room.r.G(parcelH, 2, 4);
                                            parcelH.writeInt(zA ? 1 : 0);
                                            androidx.room.r.G(parcelH, 3, 4);
                                            parcelH.writeInt(0);
                                            androidx.room.r.A(parcelH, 4, new com.google.android.gms.dynamic.b(context));
                                            androidx.room.r.G(parcelH, 5, 4);
                                            parcelH.writeInt(0);
                                            androidx.room.r.G(parcelH, 6, 4);
                                            parcelH.writeInt(1);
                                            androidx.room.r.G(parcelH, 8, 4);
                                            parcelH.writeInt(0);
                                            androidx.room.r.I(parcelH, iH);
                                            Parcel parcelD = uVar.d(parcelH, 6);
                                            q qVar = (q) com.google.android.gms.internal.common.g.a(parcelD, q.CREATOR);
                                            parcelD.recycle();
                                            if (qVar.e) {
                                                coil3.network.g.E(qVar.A);
                                                sVarB = new s(null, null, true);
                                            } else {
                                                String str2 = qVar.y;
                                                PackageManager.NameNotFoundException nameNotFoundException = h1.C(qVar.z) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                coil3.network.g.E(qVar.A);
                                                h1.C(qVar.z);
                                                sVarB = new s(nameNotFoundException, str2, false);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            sVarB = s.c(e, "module call");
                                        }
                                    } catch (com.google.android.gms.dynamite.b e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        sVarB = s.c(e2, "module init: ".concat(String.valueOf(e2.getMessage())));
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                    boolean zA2 = g.a(this.a);
                                    if (packageInfo == null) {
                                        sVarB = s.b("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            sVarB = s.b("single cert required");
                                        } else {
                                            m mVar = new m(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                s sVarB2 = p.b(str3, mVar, zA2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (sVarB2.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        s sVarB3 = p.b(str3, mVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (sVarB3.a) {
                                                            sVarB = s.b("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                                sVarB = sVarB2;
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                    if (sVarB.a) {
                                        this.b = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    sVarB = s.c(e3, "no pkg ".concat(str));
                                }
                            }
                        } catch (RemoteException | com.google.android.gms.dynamite.b e4) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (sVarB.a) {
                            this.b = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (sVarB.a) {
                    break;
                }
                i2++;
            }
        }
        if (!sVarB.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = sVarB.c;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", sVarB.a(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", sVarB.a());
            }
        }
        return sVarB.a;
    }
}
