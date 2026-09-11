package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.t8;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements okhttp3.internal.connection.g {
    public Serializable A;
    public final Object B;
    public long e;
    public Object y;
    public Object z;

    public /* synthetic */ f1(g1 g1Var, long j) {
        this.B = g1Var;
        com.google.android.gms.common.internal.x.d("health_monitor");
        com.google.android.gms.common.internal.x.b(j > 0);
        this.y = "health_monitor:start";
        this.z = "health_monitor:count";
        this.A = "health_monitor:value";
        this.e = j;
    }

    @Override // okhttp3.internal.connection.g
    public okhttp3.internal.connection.n a() throws IOException {
        okhttp3.internal.connection.q qVarD;
        long j;
        okhttp3.internal.connection.q qVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.A).isEmpty() && !((okhttp3.internal.connection.o) this.y).a(null)) {
                    b();
                    iOException.getClass();
                    throw iOException;
                }
                if (((okhttp3.internal.connection.o) this.y).l.N) {
                    throw new IOException("Canceled");
                }
                com.google.android.material.shape.c0 c0Var = ((okhttp3.internal.concurrent.d) this.z).a;
                long jNanoTime = System.nanoTime();
                long j2 = this.e - jNanoTime;
                if (((CopyOnWriteArrayList) this.A).isEmpty() || j2 <= 0) {
                    qVarD = d();
                    j = 250000000;
                    this.e = jNanoTime + 250000000;
                } else {
                    j = j2;
                    qVarD = null;
                }
                if (qVarD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.A;
                    if (copyOnWriteArrayList.isEmpty() || (qVar = (okhttp3.internal.connection.q) ((LinkedBlockingDeque) this.B).poll(j, timeUnit)) == null) {
                        qVarD = null;
                    } else {
                        copyOnWriteArrayList.remove(qVar.a);
                        qVarD = qVar;
                    }
                    if (qVarD == null) {
                    }
                }
                boolean z = false;
                if (qVarD.b == null && qVarD.c == null) {
                    b();
                    if (!qVarD.a.a()) {
                        qVarD = qVarD.a.g();
                    }
                    if (qVarD.b == null && qVarD.c == null) {
                        z = true;
                    }
                    if (z) {
                        okhttp3.internal.connection.n nVarD = qVarD.a.d();
                        b();
                        return nVarD;
                    }
                }
                Throwable th = qVarD.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        kotlin.a.a(iOException, th);
                    }
                }
                okhttp3.internal.connection.r rVar = qVarD.b;
                if (rVar != null) {
                    ((okhttp3.internal.connection.o) this.y).q.addFirst(rVar);
                }
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
    }

    public void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.A;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            okhttp3.internal.connection.r rVar = (okhttp3.internal.connection.r) it.next();
            rVar.cancel();
            okhttp3.internal.connection.r rVarB = rVar.b();
            if (rVarB != null) {
                ((okhttp3.internal.connection.o) this.y).q.addLast(rVarB);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // okhttp3.internal.connection.g
    public okhttp3.internal.connection.o c() {
        return (okhttp3.internal.connection.o) this.y;
    }

    public okhttp3.internal.connection.q d() {
        okhttp3.internal.connection.r hVar;
        okhttp3.internal.connection.o oVar = (okhttp3.internal.connection.o) this.y;
        if (oVar.a(null)) {
            try {
                hVar = oVar.b();
            } catch (Throwable th) {
                hVar = new okhttp3.internal.connection.h(th);
            }
            if (hVar.a()) {
                return new okhttp3.internal.connection.q(hVar, (Throwable) null, 6);
            }
            if (hVar instanceof okhttp3.internal.connection.h) {
                return ((okhttp3.internal.connection.h) hVar).a;
            }
            ((CopyOnWriteArrayList) this.A).add(hVar);
            ((okhttp3.internal.concurrent.d) this.z).d().d(new okhttp3.internal.connection.i(okhttp3.internal.g.b + " connect " + oVar.j.h.h(), hVar, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    public boolean e(long j, t8 t8Var) {
        b9 b9Var;
        if (((ArrayList) this.A) == null) {
            this.A = new ArrayList();
        }
        if (((ArrayList) this.z) == null) {
            this.z = new ArrayList();
        }
        if (((ArrayList) this.A).isEmpty() || ((((t8) ((ArrayList) this.A).get(0)).B() / 1000) / 60) / 60 == ((t8Var.B() / 1000) / 60) / 60) {
            long jN = this.e + ((long) t8Var.n());
            l4 l4Var = (l4) this.B;
            if (!l4Var.f0().G(null, h0.Y0)) {
                l4Var.f0();
                if (jN < Math.max(0, ((Integer) h0.j.a(null)).intValue())) {
                    this.e = jN;
                    ((ArrayList) this.A).add(t8Var);
                    ((ArrayList) this.z).add(Long.valueOf(j));
                    b9Var = (b9) this.y;
                    if (((ArrayList) this.A).size() < Math.max(1, l4Var.f0().E(b9Var != null ? b9Var.u() : null, h0.k))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.A).isEmpty()) {
                this.e = jN;
                ((ArrayList) this.A).add(t8Var);
                ((ArrayList) this.z).add(Long.valueOf(j));
                b9Var = (b9) this.y;
                if (((ArrayList) this.A).size() < Math.max(1, l4Var.f0().E(b9Var != null ? b9Var.u() : null, h0.k))) {
                    return true;
                }
            } else {
                l4Var.f0();
                if (jN < Math.max(0, ((Integer) h0.j.a(null)).intValue())) {
                    this.e = jN;
                    ((ArrayList) this.A).add(t8Var);
                    ((ArrayList) this.z).add(Long.valueOf(j));
                    b9Var = (b9) this.y;
                    if (((ArrayList) this.A).size() < Math.max(1, l4Var.f0().E(b9Var != null ? b9Var.u() : null, h0.k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void f() {
        g1 g1Var = (g1) this.B;
        g1Var.v();
        ((s1) g1Var.e).H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = g1Var.z().edit();
        editorEdit.remove((String) this.z);
        editorEdit.remove((String) this.A);
        editorEdit.putLong((String) this.y, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public f1(okhttp3.internal.connection.o oVar, okhttp3.internal.concurrent.d dVar) {
        dVar.getClass();
        this.y = oVar;
        this.z = dVar;
        this.e = Long.MIN_VALUE;
        this.A = new CopyOnWriteArrayList();
        this.B = new LinkedBlockingDeque();
    }
}
