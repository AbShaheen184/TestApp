package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements m2 {
    public final m0 a;
    public final f1 b;

    public f2(f1 f1Var, m0 m0Var) {
        f1 f1Var2 = b1.a;
        this.b = f1Var;
        this.a = m0Var;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final i1 a() {
        m0 m0Var = this.a;
        if (m0Var instanceof i1) {
            return ((i1) m0Var).i();
        }
        g1 g1Var = (g1) ((i1) m0Var).t(5);
        boolean zG = g1Var.y.g();
        i1 i1Var = g1Var.y;
        if (!zG) {
            return i1Var;
        }
        i1Var.j();
        return g1Var.y;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final int b(m0 m0Var) {
        s2 s2Var = ((i1) m0Var).zzc;
        int i = s2Var.d;
        if (i != -1) {
            return i;
        }
        int iM = 0;
        for (int i2 = 0; i2 < s2Var.a; i2++) {
            int i3 = s2Var.b[i2] >>> 3;
            t0 t0Var = (t0) s2Var.c[i2];
            int iA = z0.a(8);
            int iA2 = z0.a(i3) + z0.a(16);
            int iA3 = z0.a(24);
            int iC = t0Var.c();
            iM += iA + iA + iA2 + com.google.android.datatransport.runtime.backends.c.m(iC, iC, iA3);
        }
        s2Var.d = iM;
        return iM;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void c(Object obj, Object obj2) {
        n2.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void d(Object obj, androidx.compose.foundation.text.selection.w wVar, a1 a1Var) {
        this.b.getClass();
        f1.g(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final boolean e(Object obj) {
        throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void f(Object obj) {
        this.b.getClass();
        s2 s2Var = ((i1) obj).zzc;
        if (s2Var.e) {
            s2Var.e = false;
        }
        f1 f1Var = b1.a;
        throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final boolean g(i1 i1Var, i1 i1Var2) {
        return i1Var.zzc.equals(i1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void h(Object obj, byte[] bArr, int i, int i2, p0 p0Var) {
        i1 i1Var = (i1) obj;
        if (i1Var.zzc == s2.f) {
            i1Var.zzc = s2.a();
        }
        throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void i(Object obj, s5 s5Var) {
        throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final int j(i1 i1Var) {
        return i1Var.zzc.hashCode();
    }
}
