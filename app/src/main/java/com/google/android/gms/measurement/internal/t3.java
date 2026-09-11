package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ w3 z;

    public t3(w3 w3Var, long j, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = j;
                Objects.requireNonNull(w3Var);
                this.z = w3Var;
                break;
            default:
                this.y = j;
                Objects.requireNonNull(w3Var);
                this.z = w3Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                w3 w3Var = this.z;
                androidx.media3.exoplayer.source.r0 r0Var = w3Var.C;
                w3Var.v();
                w3Var.z();
                s1 s1Var = (s1) w3Var.e;
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                v0 v0Var = x0Var.K;
                long j = this.y;
                v0Var.b(Long.valueOf(j), "Activity resumed, time");
                g gVar = s1Var.A;
                if (gVar.G(null, h0.S0)) {
                    if (gVar.K() || w3Var.A) {
                        ((w3) r0Var.A).v();
                        ((v3) r0Var.z).c();
                        r0Var.e = j;
                        r0Var.y = j;
                    }
                } else if (gVar.K()) {
                    ((w3) r0Var.A).v();
                    ((v3) r0Var.z).c();
                    r0Var.e = j;
                    r0Var.y = j;
                } else {
                    g1 g1Var = s1Var.B;
                    s1.k(g1Var);
                    if (g1Var.P.a()) {
                        ((w3) r0Var.A).v();
                        ((v3) r0Var.z).c();
                        r0Var.e = j;
                        r0Var.y = j;
                    }
                }
                coil3.memory.c cVar = w3Var.D;
                w3 w3Var2 = (w3) cVar.z;
                w3Var2.v();
                u3 u3Var = (u3) cVar.y;
                if (u3Var != null) {
                    w3Var2.z.removeCallbacks(u3Var);
                }
                g1 g1Var2 = ((s1) w3Var2.e).B;
                s1.k(g1Var2);
                g1Var2.P.b(false);
                w3Var2.v();
                w3Var2.A = false;
                androidx.media3.exoplayer.hls.c cVar2 = w3Var.B;
                w3 w3Var3 = (w3) cVar2.e;
                w3Var3.v();
                s1 s1Var2 = (s1) w3Var3.e;
                boolean zD = s1Var2.d();
                com.google.android.gms.common.util.a aVar = s1Var2.H;
                if (zD) {
                    aVar.getClass();
                    cVar2.G(System.currentTimeMillis(), s1Var2.A.G(null, h0.e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                w3 w3Var4 = this.z;
                w3Var4.v();
                w3Var4.z();
                s1 s1Var3 = (s1) w3Var4.e;
                x0 x0Var2 = s1Var3.C;
                s1.m(x0Var2);
                v0 v0Var2 = x0Var2.K;
                long j2 = this.y;
                v0Var2.b(Long.valueOf(j2), "Activity paused, time");
                coil3.memory.c cVar3 = w3Var4.D;
                w3 w3Var5 = (w3) cVar3.z;
                ((s1) w3Var5.e).H.getClass();
                u3 u3Var2 = new u3(cVar3, System.currentTimeMillis(), j2);
                cVar3.y = u3Var2;
                w3Var5.z.postDelayed(u3Var2, 2000L);
                if (s1Var3.A.K()) {
                    ((v3) w3Var4.C.z).c();
                }
                break;
        }
    }
}
