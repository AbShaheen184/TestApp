package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.l6;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends j0 {
    public volatile c3 A;
    public c3 B;
    public final ConcurrentHashMap C;
    public l6 D;
    public volatile boolean E;
    public volatile c3 F;
    public c3 G;
    public boolean H;
    public final Object I;
    public volatile c3 z;

    public f3(s1 s1Var) {
        super(s1Var);
        this.I = new Object();
        this.C = new ConcurrentHashMap();
    }

    public final String A(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        s1 s1Var = (s1) this.e;
        int length2 = str2.length();
        s1Var.A.getClass();
        if (length2 <= 500) {
            return str2;
        }
        s1Var.A.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    public final void B(c3 c3Var, c3 c3Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = c3Var.e;
        s1 s1Var = (s1) this.e;
        v();
        boolean z4 = false;
        if (c3Var2 != null) {
            if (c3Var2.c == c3Var.c && Objects.equals(c3Var2.b, c3Var.b) && Objects.equals(c3Var2.a, c3Var.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.B != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            r4.s0(c3Var, bundle3, true);
            if (c3Var2 != null) {
                String str = c3Var2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = c3Var2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", c3Var2.c);
            }
            if (z4) {
                w3 w3Var = s1Var.E;
                s1.l(w3Var);
                androidx.media3.exoplayer.source.r0 r0Var = w3Var.C;
                long j3 = j - r0Var.y;
                r0Var.y = j;
                if (j3 > 0) {
                    r4 r4Var = s1Var.F;
                    s1.k(r4Var);
                    r4Var.i0(bundle3, j3);
                }
            }
            g gVar = s1Var.A;
            com.google.android.gms.common.util.a aVar = s1Var.H;
            if (!gVar.K()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = c3Var.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = s1Var.A.G(null, h0.e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = c3Var.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            v2 v2Var = s1Var.J;
            s1.l(v2Var);
            v2Var.D(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            E(this.B, true, j);
        }
        this.B = c3Var;
        if (z3) {
            this.G = c3Var;
        }
        o3 o3VarP = s1Var.p();
        o3VarP.v();
        o3VarP.w();
        o3VarP.J(new com.google.common.util.concurrent.l0(o3VarP, c3Var));
    }

    public final void C(l6 l6Var, Bundle bundle) {
        Bundle bundle2;
        if (!((s1) this.e).A.K() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.C.put(Integer.valueOf(l6Var.e), new c3(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void D(String str, c3 c3Var, boolean z) {
        c3 c3Var2;
        c3 c3Var3 = this.z == null ? this.A : this.z;
        if (c3Var.b == null) {
            c3Var2 = new c3(c3Var.a, str != null ? A(str) : null, c3Var.c, c3Var.e, c3Var.f, c3Var.g);
        } else {
            c3Var2 = c3Var;
        }
        this.A = this.z;
        this.z = c3Var2;
        s1 s1Var = (s1) this.e;
        s1Var.H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.E(new d3(this, c3Var2, c3Var3, jElapsedRealtime, z));
    }

    public final void E(c3 c3Var, boolean z, long j) {
        s1 s1Var = (s1) this.e;
        b0 b0Var = s1Var.K;
        s1.j(b0Var);
        s1Var.H.getClass();
        b0Var.y(SystemClock.elapsedRealtime());
        boolean z2 = c3Var != null && c3Var.d;
        w3 w3Var = s1Var.E;
        s1.l(w3Var);
        if (!w3Var.C.e(j, z2, z) || c3Var == null) {
            return;
        }
        c3Var.d = false;
    }

    public final c3 F(l6 l6Var) {
        com.google.android.gms.common.internal.x.g(l6Var);
        Integer numValueOf = Integer.valueOf(l6Var.e);
        ConcurrentHashMap concurrentHashMap = this.C;
        c3 c3Var = (c3) concurrentHashMap.get(numValueOf);
        if (c3Var == null) {
            String strA = A(l6Var.y);
            r4 r4Var = ((s1) this.e).F;
            s1.k(r4Var);
            c3 c3Var2 = new c3(r4Var.u0(), null, strA);
            concurrentHashMap.put(numValueOf, c3Var2);
            c3Var = c3Var2;
        }
        return this.F != null ? this.F : c3Var;
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final boolean y() {
        return false;
    }

    public final c3 z(boolean z) {
        w();
        v();
        c3 c3Var = this.B;
        return (z && c3Var == null) ? this.G : c3Var;
    }
}
