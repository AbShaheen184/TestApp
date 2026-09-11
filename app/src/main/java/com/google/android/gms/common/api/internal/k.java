package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.appcompat.widget.z0;
import androidx.compose.foundation.lazy.layout.b1;
import com.caverock.androidsvg.y1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.x9;
import com.google.android.gms.internal.measurement.z9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.android.gms.common.api.g, com.google.android.gms.common.api.h {
    public final com.google.android.gms.common.api.c e;
    public final b f;
    public final coil3.memory.c g;
    public final int j;
    public final u k;
    public boolean l;
    public final /* synthetic */ e o;
    public final LinkedList d = new LinkedList();
    public final HashSet h = new HashSet();
    public final HashMap i = new HashMap();
    public final ArrayList m = new ArrayList();
    public com.google.android.gms.common.b n = null;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e eVar, com.google.android.gms.common.api.f fVar) {
        this.o = eVar;
        Looper looper = eVar.J.getLooper();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarA = fVar.a();
        y1 y1Var = new y1((androidx.collection.h) cVarA.y, (String) cVarA.z, (String) cVarA.A);
        _COROUTINE.a aVar = (_COROUTINE.a) fVar.c.y;
        com.google.android.gms.common.internal.x.g(aVar);
        com.google.android.gms.common.api.c cVarI = aVar.i(fVar.a, looper, y1Var, fVar.d, this, this);
        String str = fVar.b;
        if (str != null && (cVarI instanceof com.google.android.gms.common.internal.e)) {
            ((com.google.android.gms.common.internal.e) cVarI).P = str;
        }
        if (str != null && (cVarI instanceof g)) {
            androidx.privacysandbox.ads.adservices.java.internal.a.C(cVarI);
            throw null;
        }
        this.e = cVarI;
        this.f = fVar.e;
        this.g = new coil3.memory.c(18);
        this.j = fVar.g;
        if (!cVarI.l()) {
            this.k = null;
            return;
        }
        Context context = eVar.B;
        com.google.android.gms.internal.base.g gVar = eVar.J;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarA2 = fVar.a();
        this.k = new u(context, gVar, new y1((androidx.collection.h) cVarA2.y, (String) cVarA2.z, (String) cVarA2.A));
    }

    public final com.google.android.gms.common.d a(com.google.android.gms.common.d[] dVarArr) {
        if (dVarArr == null || dVarArr.length == 0) {
            return null;
        }
        com.google.android.gms.common.d[] dVarArrJ = this.e.j();
        if (dVarArrJ == null) {
            dVarArrJ = new com.google.android.gms.common.d[0];
        }
        androidx.collection.f fVar = new androidx.collection.f(dVarArrJ.length);
        for (com.google.android.gms.common.d dVar : dVarArrJ) {
            fVar.put(dVar.e, Long.valueOf(dVar.d()));
        }
        for (com.google.android.gms.common.d dVar2 : dVarArr) {
            Long l = (Long) fVar.get(dVar2.e);
            if (l == null || l.longValue() < dVar2.d()) {
                return dVar2;
            }
        }
        return null;
    }

    public final void b(com.google.android.gms.common.b bVar) {
        HashSet hashSet = this.h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            androidx.transition.k.i();
        } else {
            if (com.google.android.gms.common.internal.x.j(bVar, com.google.android.gms.common.b.C)) {
                this.e.e();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        com.google.android.gms.common.internal.x.c(this.o.J);
        e(status, null, false);
    }

    @Override // com.google.android.gms.common.api.h
    public final void d(com.google.android.gms.common.b bVar) {
        p(bVar, null);
    }

    public final void e(Status status, Exception exc, boolean z) {
        com.google.android.gms.common.internal.x.c(this.o.J);
        if ((status == null) == (exc == null)) {
            net.luminis.tls.engine.impl.c.o("Status XOR exception should be null");
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (!z || pVar.a == 2) {
                if (status != null) {
                    pVar.c(status);
                } else {
                    pVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        LinkedList linkedList = this.d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            if (!this.e.h()) {
                return;
            }
            if (l(pVar)) {
                linkedList.remove(pVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void g(int i) {
        Looper looperMyLooper = Looper.myLooper();
        com.google.android.gms.internal.base.g gVar = this.o.J;
        if (looperMyLooper == gVar.getLooper()) {
            j(i);
        } else {
            gVar.post(new androidx.core.provider.a(this, i, 2));
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void h() {
        Looper looperMyLooper = Looper.myLooper();
        com.google.android.gms.internal.base.g gVar = this.o.J;
        if (looperMyLooper == gVar.getLooper()) {
            i();
        } else {
            gVar.post(new z0(this, 13));
        }
    }

    public final void i() {
        com.google.android.gms.common.api.c cVar = this.e;
        e eVar = this.o;
        com.google.android.gms.common.internal.x.c(eVar.J);
        this.n = null;
        b(com.google.android.gms.common.b.C);
        com.google.android.gms.internal.base.g gVar = eVar.J;
        if (this.l) {
            b bVar = this.f;
            gVar.removeMessages(11, bVar);
            gVar.removeMessages(9, bVar);
            this.l = false;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (a((com.google.android.gms.common.d[]) sVar.a.z) != null) {
                it.remove();
            } else {
                try {
                    b1 b1Var = sVar.a;
                    new com.google.android.gms.tasks.q();
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) ((androidx.compose.material.ripple.g) b1Var.A).b;
                    cVar2.getClass();
                    aa aaVar = (aa) ((ba) cVar).t();
                    x9 x9Var = new x9((z9) cVar2.y, (androidx.emoji2.text.f) cVar2.A);
                    String str = (String) cVar2.z;
                    Parcel parcelH = aaVar.h();
                    parcelH.writeString(str);
                    o5.c(parcelH, x9Var);
                    aaVar.G(parcelH, 28);
                } catch (DeadObjectException unused) {
                    g(3);
                    cVar.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        k();
    }

    public final void j(int i) {
        e eVar = this.o;
        com.google.android.gms.internal.base.g gVar = eVar.J;
        com.google.android.gms.common.internal.x.c(eVar.J);
        this.n = null;
        this.l = true;
        String strK = this.e.k();
        coil3.memory.c cVar = this.g;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        cVar.r(true, new Status(20, sb.toString(), null, null));
        b bVar = this.f;
        gVar.sendMessageDelayed(Message.obtain(gVar, 9, bVar), 5000L);
        gVar.sendMessageDelayed(Message.obtain(gVar, 11, bVar), 120000L);
        ((SparseIntArray) eVar.D.y).clear();
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((s) it.next()).getClass();
        }
    }

    public final void k() {
        e eVar = this.o;
        com.google.android.gms.internal.base.g gVar = eVar.J;
        b bVar = this.f;
        gVar.removeMessages(12, bVar);
        gVar.sendMessageDelayed(gVar.obtainMessage(12, bVar), eVar.e);
    }

    public final boolean l(p pVar) {
        if (pVar == null) {
            coil3.memory.c cVar = this.g;
            com.google.android.gms.common.api.c cVar2 = this.e;
            pVar.f(cVar, cVar2.l());
            try {
                pVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                g(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        com.google.android.gms.common.d dVarA = a(pVar.b(this));
        if (dVarA == null) {
            coil3.memory.c cVar3 = this.g;
            com.google.android.gms.common.api.c cVar4 = this.e;
            pVar.f(cVar3, cVar4.l());
            try {
                pVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                g(1);
                cVar4.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.e.getClass().getName() + " could not execute call because it requires feature (" + dVarA.e + ", " + dVarA.d() + ").");
        if (!this.o.K || !pVar.a(this)) {
            pVar.d(new com.google.android.gms.common.api.k(dVarA));
            return true;
        }
        l lVar = new l(this.f, dVarA);
        int iIndexOf = this.m.indexOf(lVar);
        ArrayList arrayList = this.m;
        if (iIndexOf >= 0) {
            l lVar2 = (l) arrayList.get(iIndexOf);
            this.o.J.removeMessages(15, lVar2);
            com.google.android.gms.internal.base.g gVar = this.o.J;
            gVar.sendMessageDelayed(Message.obtain(gVar, 15, lVar2), 5000L);
            return false;
        }
        arrayList.add(lVar);
        com.google.android.gms.internal.base.g gVar2 = this.o.J;
        gVar2.sendMessageDelayed(Message.obtain(gVar2, 15, lVar), 5000L);
        com.google.android.gms.internal.base.g gVar3 = this.o.J;
        gVar3.sendMessageDelayed(Message.obtain(gVar3, 16, lVar), 120000L);
        com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(2, null, null);
        if (m(bVar)) {
            return false;
        }
        this.o.b(bVar, this.j);
        return false;
    }

    public final boolean m(com.google.android.gms.common.b bVar) {
        synchronized (e.N) {
        }
        return false;
    }

    public final void n() {
        e eVar = this.o;
        com.google.android.gms.common.internal.x.c(eVar.J);
        com.google.android.gms.common.api.c cVar = this.e;
        if (cVar.h() || cVar.d()) {
            return;
        }
        try {
            coil3.memory.c cVar2 = eVar.D;
            Context context = eVar.B;
            SparseIntArray sparseIntArray = (SparseIntArray) cVar2.y;
            com.google.android.gms.common.internal.x.g(context);
            int i = cVar.i();
            int iB = ((SparseIntArray) cVar2.y).get(i, -1);
            if (iB == -1) {
                iB = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i2);
                    if (iKeyAt > i && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (iB == -1) {
                    iB = ((com.google.android.gms.common.e) cVar2.z).b(context, i);
                }
                sparseIntArray.put(i, iB);
            }
            if (iB != 0) {
                com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(iB, null, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                p(bVar, null);
                return;
            }
            m mVar = new m();
            mVar.C = eVar;
            mVar.A = null;
            mVar.B = null;
            mVar.e = false;
            mVar.y = cVar;
            mVar.z = this.f;
            if (cVar.l()) {
                u uVar = this.k;
                com.google.android.gms.common.internal.x.g(uVar);
                Handler handler = uVar.f;
                y1 y1Var = uVar.i;
                com.google.android.gms.signin.internal.a aVar = uVar.j;
                if (aVar != null) {
                    aVar.o();
                }
                y1Var.f = Integer.valueOf(System.identityHashCode(uVar));
                uVar.j = (com.google.android.gms.signin.internal.a) uVar.g.i(uVar.e, handler.getLooper(), y1Var, (com.google.android.gms.signin.a) y1Var.e, uVar, uVar);
                uVar.k = mVar;
                Set set = uVar.h;
                if (set == null || set.isEmpty()) {
                    handler.post(new z0(uVar, 15));
                } else {
                    com.google.android.gms.signin.internal.a aVar2 = uVar.j;
                    aVar2.getClass();
                    aVar2.g(new androidx.media3.exoplayer.dash.manifest.t(aVar2));
                }
            }
            try {
                cVar.g(mVar);
            } catch (SecurityException e) {
                p(new com.google.android.gms.common.b(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            p(new com.google.android.gms.common.b(10, null, null), e2);
        }
    }

    public final void o(p pVar) {
        com.google.android.gms.common.internal.x.c(this.o.J);
        boolean zH = this.e.h();
        LinkedList linkedList = this.d;
        if (zH) {
            if (l(pVar)) {
                k();
                return;
            } else {
                linkedList.add(pVar);
                return;
            }
        }
        linkedList.add(pVar);
        com.google.android.gms.common.b bVar = this.n;
        if (bVar == null || bVar.y == 0 || bVar.z == null) {
            n();
        } else {
            p(bVar, null);
        }
    }

    public final void p(com.google.android.gms.common.b bVar, RuntimeException runtimeException) {
        com.google.android.gms.signin.internal.a aVar;
        com.google.android.gms.common.internal.x.c(this.o.J);
        u uVar = this.k;
        if (uVar != null && (aVar = uVar.j) != null) {
            aVar.o();
        }
        com.google.android.gms.common.internal.x.c(this.o.J);
        this.n = null;
        ((SparseIntArray) this.o.D.y).clear();
        b(bVar);
        if ((this.e instanceof com.google.android.gms.common.internal.service.d) && bVar.y != 24) {
            e eVar = this.o;
            eVar.y = true;
            com.google.android.gms.internal.base.g gVar = eVar.J;
            gVar.sendMessageDelayed(gVar.obtainMessage(19), 300000L);
        }
        if (bVar.y == 4) {
            c(e.M);
            return;
        }
        if (this.d.isEmpty()) {
            this.n = bVar;
            return;
        }
        e eVar2 = this.o;
        if (runtimeException != null) {
            com.google.android.gms.common.internal.x.c(eVar2.J);
            e(null, runtimeException, false);
            return;
        }
        boolean z = eVar2.K;
        b bVar2 = this.f;
        if (!z) {
            c(e.c(bVar2, bVar));
            return;
        }
        e(e.c(bVar2, bVar), null, true);
        if (this.d.isEmpty() || m(bVar) || this.o.b(bVar, this.j)) {
            return;
        }
        if (bVar.y == 18) {
            this.l = true;
        }
        if (!this.l) {
            c(e.c(this.f, bVar));
            return;
        }
        e eVar3 = this.o;
        b bVar3 = this.f;
        com.google.android.gms.internal.base.g gVar2 = eVar3.J;
        gVar2.sendMessageDelayed(Message.obtain(gVar2, 9, bVar3), 5000L);
    }

    public final void q(com.google.android.gms.common.b bVar) {
        com.google.android.gms.common.internal.x.c(this.o.J);
        com.google.android.gms.common.api.c cVar = this.e;
        cVar.c("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        p(bVar, null);
    }

    public final void r() {
        com.google.android.gms.common.internal.x.c(this.o.J);
        Status status = e.L;
        c(status);
        this.g.r(false, status);
        for (f fVar : (f[]) this.i.keySet().toArray(new f[0])) {
            o(new v(fVar, new com.google.android.gms.tasks.j()));
        }
        b(new com.google.android.gms.common.b(4, null, null));
        com.google.android.gms.common.api.c cVar = this.e;
        if (cVar.h()) {
            cVar.f(new androidx.media3.exoplayer.hls.c(this));
        }
    }
}
