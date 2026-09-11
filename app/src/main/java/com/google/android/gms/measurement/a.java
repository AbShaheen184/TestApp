package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.view.menu.e;
import androidx.collection.f;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.measurement.internal.c3;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.l2;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.material.shape.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public final s1 a;
    public final v2 b;

    public a(s1 s1Var) {
        x.g(s1Var);
        this.a = s1Var;
        v2 v2Var = s1Var.J;
        s1.l(v2Var);
        this.b = v2Var;
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String c() {
        f3 f3Var = ((s1) this.b.e).I;
        s1.l(f3Var);
        c3 c3Var = f3Var.z;
        if (c3Var != null) {
            return c3Var.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void e(String str, String str2, Bundle bundle) {
        this.b.z(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String f() {
        f3 f3Var = ((s1) this.b.e).I;
        s1.l(f3Var);
        c3 c3Var = f3Var.z;
        if (c3Var != null) {
            return c3Var.b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void g(Bundle bundle) {
        v2 v2Var = this.b;
        ((s1) v2Var.e).H.getClass();
        v2Var.I(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final long h() {
        r4 r4Var = this.a.F;
        s1.k(r4Var);
        return r4Var.u0();
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void i(String str) {
        s1 s1Var = this.a;
        b0 b0Var = s1Var.K;
        s1.j(b0Var);
        s1Var.H.getClass();
        b0Var.x(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void j(String str) {
        s1 s1Var = this.a;
        b0 b0Var = s1Var.K;
        s1.j(b0Var);
        s1Var.H.getClass();
        b0Var.w(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void k(String str, String str2, Bundle bundle) {
        v2 v2Var = this.a.J;
        s1.l(v2Var);
        v2Var.J(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final List l(String str, String str2) {
        v2 v2Var = this.b;
        s1 s1Var = (s1) v2Var.e;
        p1 p1Var = s1Var.D;
        x0 x0Var = s1Var.C;
        s1.m(p1Var);
        if (p1Var.B()) {
            s1.m(x0Var);
            x0Var.C.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (g.q()) {
            s1.m(x0Var);
            x0Var.C.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        p1 p1Var2 = s1Var.D;
        s1.m(p1Var2);
        p1Var2.F(atomicReference, 5000L, "get conditional user properties", new e(v2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return r4.q0(list);
        }
        s1.m(x0Var);
        x0Var.C.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final int m(String str) {
        v2 v2Var = this.b;
        v2Var.getClass();
        x.d(str);
        ((s1) v2Var.e).getClass();
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String n() {
        return (String) this.b.D.get();
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String o() {
        return this.b.K();
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final Map p(String str, String str2, boolean z) {
        v2 v2Var = this.b;
        s1 s1Var = (s1) v2Var.e;
        p1 p1Var = s1Var.D;
        x0 x0Var = s1Var.C;
        s1.m(p1Var);
        if (p1Var.B()) {
            s1.m(x0Var);
            x0Var.C.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (g.q()) {
            s1.m(x0Var);
            x0Var.C.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        p1 p1Var2 = s1Var.D;
        s1.m(p1Var2);
        p1Var2.F(atomicReference, 5000L, "get user properties", new l2(v2Var, atomicReference, str, str2, z));
        List<o4> list = (List) atomicReference.get();
        if (list == null) {
            s1.m(x0Var);
            x0Var.C.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        f fVar = new f(list.size());
        for (o4 o4Var : list) {
            Object objD = o4Var.d();
            if (objD != null) {
                fVar.put(o4Var.y, objD);
            }
        }
        return fVar;
    }
}
