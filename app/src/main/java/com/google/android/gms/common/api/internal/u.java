package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.caverock.androidsvg.y1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.common.util.concurrent.l0;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.google.android.gms.internal.base.b implements com.google.android.gms.common.api.g, com.google.android.gms.common.api.h {
    public static final com.google.android.gms.common.internal.service.b l = com.google.android.gms.signin.b.a;
    public final Context e;
    public final Handler f;
    public final com.google.android.gms.common.internal.service.b g;
    public final Set h;
    public final y1 i;
    public com.google.android.gms.signin.internal.a j;
    public m k;

    public u(Context context, com.google.android.gms.internal.base.g gVar, y1 y1Var) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.e = context;
        this.f = gVar;
        this.i = y1Var;
        this.h = (Set) y1Var.a;
        this.g = l;
    }

    @Override // com.google.android.gms.common.api.h
    public final void d(com.google.android.gms.common.b bVar) {
        this.k.c(bVar);
    }

    @Override // com.google.android.gms.common.api.g
    public final void g(int i) {
        m mVar = this.k;
        k kVar = (k) ((e) mVar.C).G.get((b) mVar.z);
        if (kVar != null) {
            if (kVar.l) {
                kVar.q(new com.google.android.gms.common.b(17, null, null));
            } else {
                kVar.g(i);
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void h() {
        GoogleSignInAccount googleSignInAccountD;
        com.google.android.gms.signin.internal.a aVar = this.j;
        aVar.getClass();
        boolean z = false;
        try {
            aVar.X.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.z;
                ReentrantLock reentrantLock = com.google.android.gms.auth.api.signin.internal.a.c;
                com.google.android.gms.common.internal.x.g(context);
                ReentrantLock reentrantLock2 = com.google.android.gms.auth.api.signin.internal.a.c;
                reentrantLock2.lock();
                try {
                    if (com.google.android.gms.auth.api.signin.internal.a.d == null) {
                        com.google.android.gms.auth.api.signin.internal.a.d = new com.google.android.gms.auth.api.signin.internal.a(context.getApplicationContext());
                    }
                    com.google.android.gms.auth.api.signin.internal.a aVar2 = com.google.android.gms.auth.api.signin.internal.a.d;
                    reentrantLock2.unlock();
                    String strA = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = aVar2.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountD = GoogleSignInAccount.d(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountD = null;
                            }
                        }
                    }
                    googleSignInAccountD = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountD = null;
            }
            Integer num = aVar.Z;
            com.google.android.gms.common.internal.x.g(num);
            com.google.android.gms.common.internal.q qVar = new com.google.android.gms.common.internal.q(2, account, num.intValue(), googleSignInAccountD);
            com.google.android.gms.signin.internal.c cVar = (com.google.android.gms.signin.internal.c) aVar.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f);
            int i = com.google.android.gms.internal.base.c.a;
            parcelObtain.writeInt(1);
            int iH = androidx.room.r.H(parcelObtain, 20293);
            androidx.room.r.G(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            androidx.room.r.C(parcelObtain, 2, qVar, 0);
            androidx.room.r.I(parcelObtain, iH);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cVar.e.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f.post(new l0(8, this, new com.google.android.gms.signin.internal.e(1, new com.google.android.gms.common.b(8, null, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
