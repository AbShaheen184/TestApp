package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.z0;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final com.google.android.gms.common.d[] U = new com.google.android.gms.common.d[0];
    public final i0 A;
    public final com.google.android.gms.common.f B;
    public final a0 C;
    public t F;
    public d G;
    public IInterface H;
    public c0 J;
    public final b L;
    public final c M;
    public final int N;
    public final String O;
    public volatile String P;
    public androidx.room.t y;
    public final Context z;
    public volatile String e = null;
    public final Object D = new Object();
    public final Object E = new Object();
    public final ArrayList I = new ArrayList();
    public int K = 1;
    public com.google.android.gms.common.b Q = null;
    public boolean R = false;
    public volatile f0 S = null;
    public final AtomicInteger T = new AtomicInteger(0);

    public e(Context context, Looper looper, i0 i0Var, com.google.android.gms.common.f fVar, int i, b bVar, c cVar, String str) {
        x.h(context, "Context must not be null");
        this.z = context;
        x.h(looper, "Looper must not be null");
        x.h(i0Var, "Supervisor must not be null");
        this.A = i0Var;
        x.h(fVar, "API availability must not be null");
        this.B = fVar;
        this.C = new a0(this, looper);
        this.N = i;
        this.L = bVar;
        this.M = cVar;
        this.O = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(i iVar, Set set) {
        Bundle bundleR = r();
        String str = this.P;
        int i = this.N;
        int i2 = com.google.android.gms.common.f.a;
        Scope[] scopeArr = g.L;
        Bundle bundle = new Bundle();
        com.google.android.gms.common.d[] dVarArr = g.M;
        g gVar = new g(6, i, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.A = this.z.getPackageName();
        gVar.D = bundleR;
        if (set != null) {
            gVar.C = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            gVar.E = accountP;
            if (iVar != 0) {
                gVar.B = ((com.google.android.gms.internal.base.a) iVar).e;
            }
        }
        gVar.F = U;
        gVar.G = q();
        try {
            synchronized (this.E) {
                try {
                    t tVar = this.F;
                    if (tVar != null) {
                        tVar.d(new b0(this, this.T.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.T.get();
            a0 a0Var = this.C;
            a0Var.sendMessage(a0Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.T.get();
            d0 d0Var = new d0(this, 8, null, null);
            a0 a0Var2 = this.C;
            a0Var2.sendMessage(a0Var2.obtainMessage(1, i4, -1, d0Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.T.get();
            d0 d0Var2 = new d0(this, 8, null, null);
            a0 a0Var3 = this.C;
            a0Var3.sendMessage(a0Var3.obtainMessage(1, i5, -1, d0Var2));
        }
    }

    public final void c(String str) {
        this.e = str;
        o();
    }

    public final boolean d() {
        boolean z;
        synchronized (this.D) {
            int i = this.K;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void e() {
        if (!h() || this.y == null) {
            org.mozilla.javascript.c.b("Failed to connect when checking package");
        }
    }

    public final void f(androidx.media3.exoplayer.hls.c cVar) {
        ((com.google.android.gms.common.api.internal.k) cVar.e).o.J.post(new z0(cVar, 14));
    }

    public final void g(d dVar) {
        this.G = dVar;
        y(2, null);
    }

    public final boolean h() {
        boolean z;
        synchronized (this.D) {
            z = this.K == 4;
        }
        return z;
    }

    public abstract int i();

    public final com.google.android.gms.common.d[] j() {
        f0 f0Var = this.S;
        if (f0Var == null) {
            return null;
        }
        return f0Var.y;
    }

    public final String k() {
        return this.e;
    }

    public boolean l() {
        return false;
    }

    public final void m() {
        int iB = this.B.b(this.z, i());
        if (iB == 0) {
            g(new androidx.media3.exoplayer.dash.manifest.t(this));
            return;
        }
        y(1, null);
        this.G = new androidx.media3.exoplayer.dash.manifest.t(this);
        int i = this.T.get();
        a0 a0Var = this.C;
        a0Var.sendMessage(a0Var.obtainMessage(3, i, iB, null));
    }

    public abstract IInterface n(IBinder iBinder);

    public final void o() {
        this.T.incrementAndGet();
        ArrayList arrayList = this.I;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    s sVar = (s) arrayList.get(i);
                    synchronized (sVar) {
                        sVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.E) {
            this.F = null;
        }
        y(1, null);
    }

    public Account p() {
        return null;
    }

    public com.google.android.gms.common.d[] q() {
        return U;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.D) {
            try {
                if (this.K == 5) {
                    throw new DeadObjectException();
                }
                if (!h()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.H;
                x.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return i() >= 211700000;
    }

    public final /* synthetic */ boolean x(int i, int i2, IInterface iInterface) {
        synchronized (this.D) {
            try {
                if (this.K != i) {
                    return false;
                }
                y(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(int i, IInterface iInterface) {
        androidx.room.t tVar;
        x.b((i == 4) == (iInterface != null));
        synchronized (this.D) {
            try {
                this.K = i;
                this.H = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    c0 c0Var = this.J;
                    if (c0Var != null) {
                        i0 i0Var = this.A;
                        String str = this.y.b;
                        x.g(str);
                        this.y.getClass();
                        if (this.O == null) {
                            this.z.getClass();
                        }
                        i0Var.c(str, c0Var, this.y.c);
                        this.J = null;
                    }
                } else if (i == 2 || i == 3) {
                    c0 c0Var2 = this.J;
                    if (c0Var2 != null && (tVar = this.y) != null) {
                        String str2 = tVar.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        i0 i0Var2 = this.A;
                        String str3 = this.y.b;
                        x.g(str3);
                        this.y.getClass();
                        if (this.O == null) {
                            this.z.getClass();
                        }
                        i0Var2.c(str3, c0Var2, this.y.c);
                        this.T.incrementAndGet();
                    }
                    c0 c0Var3 = new c0(this, this.T.get());
                    this.J = c0Var3;
                    String strV = v();
                    boolean zW = w();
                    this.y = new androidx.room.t(2, strV, zW);
                    if (zW && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.y.b)));
                    }
                    i0 i0Var3 = this.A;
                    String str4 = this.y.b;
                    x.g(str4);
                    this.y.getClass();
                    String name = this.O;
                    if (name == null) {
                        name = this.z.getClass().getName();
                    }
                    com.google.android.gms.common.b bVarB = i0Var3.b(new g0(str4, this.y.c), c0Var3, name, null);
                    if (!(bVarB.y == 0)) {
                        String str5 = this.y.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = bVarB.y;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (bVarB.z != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarB.z);
                        }
                        int i3 = this.T.get();
                        e0 e0Var = new e0(this, i2, bundle);
                        a0 a0Var = this.C;
                        a0Var.sendMessage(a0Var.obtainMessage(7, i3, -1, e0Var));
                    }
                } else if (i == 4) {
                    x.g(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
