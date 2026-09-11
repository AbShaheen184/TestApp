package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ v2 z;

    public m2(v2 v2Var, long j, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = j;
                this.z = v2Var;
                break;
            default:
                this.y = j;
                Objects.requireNonNull(v2Var);
                this.z = v2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                s1 s1Var = (s1) this.z.e;
                g1 g1Var = s1Var.B;
                s1.k(g1Var);
                androidx.media3.exoplayer.l1 l1Var = g1Var.H;
                long j = this.y;
                l1Var.h(j);
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.J.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                v2 v2Var = this.z;
                v2Var.v();
                v2Var.w();
                s1 s1Var2 = (s1) v2Var.e;
                x0 x0Var2 = s1Var2.C;
                s1.m(x0Var2);
                x0Var2.J.a("Resetting analytics data (FE)");
                w3 w3Var = s1Var2.E;
                s1.l(w3Var);
                w3Var.v();
                androidx.media3.exoplayer.source.r0 r0Var = w3Var.C;
                ((v3) r0Var.z).c();
                ((s1) ((w3) r0Var.A).e).H.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                r0Var.e = jElapsedRealtime;
                r0Var.y = jElapsedRealtime;
                s1Var2.r().A();
                boolean z = !s1Var2.d();
                g1 g1Var2 = s1Var2.B;
                s1.k(g1Var2);
                g1Var2.C.h(this.y);
                s1 s1Var3 = (s1) g1Var2.e;
                g1 g1Var3 = s1Var3.B;
                s1.k(g1Var3);
                if (!TextUtils.isEmpty(g1Var3.S.t())) {
                    g1Var2.S.v(null);
                }
                g1Var2.M.h(0L);
                g1Var2.N.h(0L);
                if (!s1Var3.A.J()) {
                    g1Var2.D(z);
                }
                g1Var2.T.v(null);
                g1Var2.U.h(0L);
                g1Var2.V.I(null);
                o3 o3VarP = s1Var2.p();
                o3VarP.v();
                o3VarP.w();
                t4 t4VarL = o3VarP.L(false);
                o3VarP.H();
                ((s1) o3VarP.e).o().z();
                o3VarP.J(new j3(o3VarP, t4VarL, 0));
                s1.l(w3Var);
                w3Var.B.F();
                v2Var.O = z;
                s1Var2.p().z(new AtomicReference());
                break;
        }
    }
}
