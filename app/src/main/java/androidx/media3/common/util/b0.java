package androidx.media3.common.util;

import android.os.SystemClock;
import androidx.compose.ui.node.a1;
import androidx.media3.common.t0;
import androidx.media3.common.v0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ a1 g;

    public b0(a1 a1Var, int i) {
        this.g = a1Var;
        this.a = i;
    }

    public final void a() {
        long jO;
        a1 a1Var = this.g;
        t0 t0Var = (t0) a1Var.f;
        g0 g0Var = (g0) a1Var.g;
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) a1Var.b;
        v0 v0VarL = c0Var.l();
        Object objL = v0VarL.p() ? null : v0VarL.l(c0Var.i());
        int iF = c0Var.f();
        int iG = c0Var.g();
        long j = c0Var.j();
        if (objL == null || iF != -1) {
            jO = iF != -1 ? c0Var.o() : -9223372036854775807L;
        } else {
            v0VarL.g(objL, t0Var);
            j -= j0.d0(t0Var.e);
            jO = j0.d0(t0Var.d);
        }
        boolean zW = c0Var.w();
        if (!zW || jO == -9223372036854775807L || j < jO) {
            g0Var.e(3);
            if (zW && jO != -9223372036854775807L) {
                c0Var.V();
                g0Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((jO - j) / c0Var.n0.o.a));
            }
            this.e = false;
            return;
        }
        ((e0) a1Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iF == this.c && iG == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                ((androidx.media3.exoplayer.x) a1Var.d).e.Q(new androidx.media3.exoplayer.j(2, new d0(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objL;
        this.c = iF;
        this.d = iG;
        g0Var.e(3);
        g0Var.a.sendEmptyMessageDelayed(3, i);
    }
}
