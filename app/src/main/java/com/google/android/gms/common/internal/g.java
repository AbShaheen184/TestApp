package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.a(22);
    public static final Scope[] L = new Scope[0];
    public static final com.google.android.gms.common.d[] M = new com.google.android.gms.common.d[0];
    public String A;
    public IBinder B;
    public Scope[] C;
    public Bundle D;
    public Account E;
    public com.google.android.gms.common.d[] F;
    public com.google.android.gms.common.d[] G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final String K;
    public final int e;
    public final int y;
    public final int z;

    public g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.d[] dVarArr, com.google.android.gms.common.d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? L : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        com.google.android.gms.common.d[] dVarArr3 = M;
        com.google.android.gms.common.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.e = i;
        this.y = i2;
        this.z = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A = "com.google.android.gms";
        } else {
            this.A = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = a.e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i j0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new j0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        j0 j0Var2 = (j0) j0Var;
                        Parcel parcelD = j0Var2.d(j0Var2.h(), 2);
                        Account account3 = (Account) com.google.android.gms.internal.common.g.a(parcelD, Account.CREATOR);
                        parcelD.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.E = account2;
        } else {
            this.B = iBinder;
            this.E = account;
        }
        this.C = scopeArr2;
        this.D = bundle2;
        this.F = dVarArr4;
        this.G = dVarArr3;
        this.H = z;
        this.I = i4;
        this.J = z2;
        this.K = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        android.support.v4.media.a.a(this, parcel, i);
    }
}
