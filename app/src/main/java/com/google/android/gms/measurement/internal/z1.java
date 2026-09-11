package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends n5 implements k0 {
    public final l4 d;
    public Boolean e;
    public String f;

    public z1(l4 l4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.google.android.gms.common.internal.x.g(l4Var);
        this.d = l4Var;
        this.f = null;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List B(String str, String str2, boolean z, t4 t4Var) {
        h(t4Var);
        String str3 = t4Var.e;
        com.google.android.gms.common.internal.x.g(str3);
        l4 l4Var = this.d;
        try {
            List<p4> list = (List) l4Var.e().C(new w1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (p4 p4Var : list) {
                if (z || !r4.a0(p4Var.c)) {
                    arrayList.add(new o4(p4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            l4Var.b().C.c(x0.D(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            l4Var.b().C.c(x0.D(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void C(u uVar, t4 t4Var) {
        com.google.android.gms.common.internal.x.g(uVar);
        h(t4Var);
        H(new androidx.core.provider.m(this, uVar, t4Var, 6, false));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final String D(t4 t4Var) {
        h(t4Var);
        l4 l4Var = this.d;
        try {
            return (String) l4Var.e().C(new t1(l4Var, t4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            l4Var.b().C.c(x0.D(t4Var.e), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List E(String str, String str2, t4 t4Var) {
        h(t4Var);
        String str3 = t4Var.e;
        com.google.android.gms.common.internal.x.g(str3);
        l4 l4Var = this.d;
        try {
            return (List) l4Var.e().C(new w1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            l4Var.b().C.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void F(t4 t4Var) {
        com.google.android.gms.common.internal.x.d(t4Var.e);
        com.google.android.gms.common.internal.x.g(t4Var.P);
        g(new u1(this, t4Var, 4));
    }

    public final void G(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        l4 l4Var = this.d;
        if (zIsEmpty) {
            l4Var.b().C.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.e == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f) && !com.google.android.gms.common.util.b.b(l4Var.I.e, Binder.getCallingUid()) && !com.google.android.gms.common.h.a(l4Var.I.e).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.e = Boolean.valueOf(z2);
                }
                if (this.e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                l4Var.b().C.b(x0.D(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f == null) {
            Context context = l4Var.I.e;
            int callingUid = Binder.getCallingUid();
            int i = com.google.android.gms.common.g.e;
            if (com.google.android.gms.common.util.b.e(callingUid, context, str)) {
                this.f = str;
            }
        }
        if (str.equals(this.f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void H(Runnable runnable) {
        l4 l4Var = this.d;
        if (l4Var.e().B()) {
            runnable.run();
        } else {
            l4Var.e().E(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void a(t4 t4Var, e4 e4Var, o0 o0Var) {
        h(t4Var);
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.g(str);
        this.d.e().E(new androidx.appcompat.view.menu.e(this, str, e4Var, o0Var, 2, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        l4 l4Var = this.d;
        ArrayList arrayList = null;
        m0 l0Var = null;
        o0 n0Var = null;
        switch (i) {
            case 1:
                u uVar = (u) o5.a(parcel, u.CREATOR);
                t4 t4Var = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                C(uVar, t4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                o4 o4Var = (o4) o5.a(parcel, o4.CREATOR);
                t4 t4Var2 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                t(o4Var, t4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                t4 t4Var3 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                x(t4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                u uVar2 = (u) o5.a(parcel, u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                o5.d(parcel);
                com.google.android.gms.common.internal.x.g(uVar2);
                com.google.android.gms.common.internal.x.d(string);
                G(string, true);
                H(new androidx.core.provider.m(this, uVar2, string, 7, false));
                parcel2.writeNoException();
                return true;
            case 6:
                t4 t4Var4 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                q(t4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                t4 t4Var5 = (t4) o5.a(parcel, t4.CREATOR);
                byte b = parcel.readInt() != 0;
                o5.d(parcel);
                h(t4Var5);
                String str = t4Var5.e;
                com.google.android.gms.common.internal.x.g(str);
                try {
                    List<p4> list2 = (List) l4Var.e().C(new t1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (p4 p4Var : list2) {
                        if (b != false || !r4.a0(p4Var.c)) {
                            arrayList2.add(new o4(p4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    l4Var.b().C.c(x0.D(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    l4Var.b().C.c(x0.D(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) o5.a(parcel, u.CREATOR);
                String string2 = parcel.readString();
                o5.d(parcel);
                byte[] bArrN = n(uVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                o5.d(parcel);
                k(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                t4 t4Var6 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                String strD = D(t4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 12:
                e eVar = (e) o5.a(parcel, e.CREATOR);
                t4 t4Var7 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                i(eVar, t4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) o5.a(parcel, e.CREATOR);
                o5.d(parcel);
                com.google.android.gms.common.internal.x.g(eVar2);
                com.google.android.gms.common.internal.x.g(eVar2.z);
                com.google.android.gms.common.internal.x.d(eVar2.e);
                G(eVar2.e, true);
                H(new com.google.common.util.concurrent.l0(12, this, new e(eVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = o5.a;
                z = parcel.readInt() != 0;
                t4 t4Var8 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                List listB = B(string6, string7, z, t4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listB);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = o5.a;
                z = parcel.readInt() != 0;
                o5.d(parcel);
                List listE = e(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                t4 t4Var9 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                List listE2 = E(string11, string12, t4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE2);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                o5.d(parcel);
                List listM = m(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 18:
                t4 t4Var10 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                l(t4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
                t4 t4Var11 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                v(bundle, t4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                t4 t4Var12 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                F(t4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                t4 t4Var13 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                i iVarU = u(t4Var13);
                parcel2.writeNoException();
                if (iVarU == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarU.writeToParcel(parcel2, 1);
                return true;
            case 24:
                t4 t4Var14 = (t4) o5.a(parcel, t4.CREATOR);
                Bundle bundle2 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                h(t4Var14);
                String str2 = t4Var14.e;
                com.google.android.gms.common.internal.x.g(str2);
                if (!l4Var.f0().G(null, h0.T0)) {
                    try {
                        list = (List) l4Var.e().C(new x1(this, t4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        l4Var.b().C.c(x0.D(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) l4Var.e().D(new x1(this, t4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        l4Var.b().C.c(x0.D(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                t4 t4Var15 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                o(t4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                t4 t4Var16 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                r(t4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                t4 t4Var17 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                z(t4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                t4 t4Var18 = (t4) o5.a(parcel, t4.CREATOR);
                e4 e4Var = (e4) o5.a(parcel, e4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    n0Var = iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new n0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                o5.d(parcel);
                a(t4Var18, e4Var, n0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                t4 t4Var19 = (t4) o5.a(parcel, t4.CREATOR);
                d dVar = (d) o5.a(parcel, d.CREATOR);
                o5.d(parcel);
                s(t4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                t4 t4Var20 = (t4) o5.a(parcel, t4.CREATOR);
                Bundle bundle3 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    l0Var = iInterfaceQueryLocalInterface2 instanceof m0 ? (m0) iInterfaceQueryLocalInterface2 : new l0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                o5.d(parcel);
                p(t4Var20, bundle3, l0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List e(String str, String str2, String str3, boolean z) {
        G(str, true);
        l4 l4Var = this.d;
        try {
            List<p4> list = (List) l4Var.e().C(new w1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (p4 p4Var : list) {
                if (z || !r4.a0(p4Var.c)) {
                    arrayList.add(new o4(p4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            l4Var.b().C.c(x0.D(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            l4Var.b().C.c(x0.D(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void g(Runnable runnable) {
        l4 l4Var = this.d;
        if (l4Var.e().B()) {
            runnable.run();
        } else {
            l4Var.e().G(runnable);
        }
    }

    public final void h(t4 t4Var) {
        com.google.android.gms.common.internal.x.g(t4Var);
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        G(str, false);
        this.d.l0().B(t4Var.y);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void i(e eVar, t4 t4Var) {
        com.google.android.gms.common.internal.x.g(eVar);
        com.google.android.gms.common.internal.x.g(eVar.z);
        h(t4Var);
        e eVar2 = new e(eVar);
        eVar2.e = t4Var.e;
        H(new androidx.core.provider.m(this, eVar2, t4Var, 5, false));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void k(long j, String str, String str2, String str3) {
        H(new v1(this, str2, str3, str, j, 0));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void l(t4 t4Var) {
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        G(str, false);
        H(new u1(this, t4Var, 3));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List m(String str, String str2, String str3) {
        G(str, true);
        l4 l4Var = this.d;
        try {
            return (List) l4Var.e().C(new w1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            l4Var.b().C.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final byte[] n(u uVar, String str) {
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.g(uVar);
        G(str, true);
        l4 l4Var = this.d;
        v0 v0Var = l4Var.b().J;
        s1 s1Var = l4Var.I;
        s0 s0Var = s1Var.G;
        String str2 = uVar.e;
        v0Var.b(s0Var.a(str2), "Log and bundle. event");
        l4Var.c().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) l4Var.e().D(new k1(this, uVar, str)).get();
            if (bArr == null) {
                l4Var.b().C.b(x0.D(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            l4Var.c().getClass();
            l4Var.b().J.d("Log and bundle processed. event, size, time_ms", s1Var.G.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            l4Var.b().C.d("Failed to log and bundle. appId, event, error", x0.D(str), s1Var.G.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            l4Var.b().C.d("Failed to log and bundle. appId, event, error", x0.D(str), s1Var.G.a(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void o(t4 t4Var) {
        com.google.android.gms.common.internal.x.d(t4Var.e);
        com.google.android.gms.common.internal.x.g(t4Var.P);
        g(new u1(this, t4Var, 6));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void p(t4 t4Var, Bundle bundle, m0 m0Var) {
        h(t4Var);
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.g(str);
        this.d.e().E(new y1(this, t4Var, bundle, m0Var, str));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void q(t4 t4Var) {
        h(t4Var);
        H(new u1(this, t4Var, 2));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void r(t4 t4Var) {
        com.google.android.gms.common.internal.x.d(t4Var.e);
        com.google.android.gms.common.internal.x.g(t4Var.P);
        g(new u1(this, t4Var, 5));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void s(t4 t4Var, d dVar) {
        h(t4Var);
        H(new androidx.core.provider.m(9, this, t4Var, dVar));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void t(o4 o4Var, t4 t4Var) {
        com.google.android.gms.common.internal.x.g(o4Var);
        h(t4Var);
        H(new androidx.core.provider.m(this, o4Var, t4Var, 8, false));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final i u(t4 t4Var) {
        h(t4Var);
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        l4 l4Var = this.d;
        try {
            return (i) l4Var.e().D(new t1(this, t4Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            l4Var.b().C.c(x0.D(str), e, "Failed to get consent. appId");
            return new i(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void v(Bundle bundle, t4 t4Var) {
        h(t4Var);
        String str = t4Var.e;
        com.google.android.gms.common.internal.x.g(str);
        H(new androidx.appcompat.view.menu.e(this, bundle, str, t4Var, 4, false));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void x(t4 t4Var) {
        h(t4Var);
        H(new u1(this, t4Var, 0));
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void z(t4 t4Var) {
        h(t4Var);
        H(new u1(this, t4Var, 1));
    }
}
