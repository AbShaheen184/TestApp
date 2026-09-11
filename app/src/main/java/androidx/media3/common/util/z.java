package androidx.media3.common.util;

import android.os.SystemClock;
import androidx.compose.ui.node.a1;
import androidx.media3.common.t0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.c1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ a1 i;

    public z(a1 a1Var, int i) {
        this.i = a1Var;
        this.a = i;
    }

    public final void a() {
        long jD;
        if (((androidx.media3.exoplayer.c0) this.i.b).q() != 2 || !((androidx.media3.exoplayer.c0) this.i.b).p() || ((androidx.media3.exoplayer.c0) this.i.b).r() != 0) {
            if (this.g) {
                ((g0) this.i.g).e(1);
            }
            this.g = false;
            return;
        }
        v0 v0VarL = ((androidx.media3.exoplayer.c0) this.i.b).l();
        Object objL = v0VarL.p() ? null : v0VarL.l(((androidx.media3.exoplayer.c0) this.i.b).i());
        int iF = ((androidx.media3.exoplayer.c0) this.i.b).f();
        int iG = ((androidx.media3.exoplayer.c0) this.i.b).g();
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.i.b;
        c0Var.V();
        if (c0Var.x()) {
            c1 c1Var = c0Var.n0;
            jD = c1Var.k.equals(c1Var.b) ? j0.d0(c0Var.n0.q) : c0Var.o();
        } else {
            jD = c0Var.d();
        }
        long jMax = Math.max(0L, jD - ((androidx.media3.exoplayer.c0) this.i.b).j());
        androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) this.i.b;
        c0Var2.V();
        long jMax2 = Math.max(0L, j0.d0(c0Var2.n0.r) - jMax);
        if (objL != null && iF == -1) {
            jD -= j0.d0(v0VarL.g(objL, (t0) this.i.f).e);
        }
        ((e0) this.i.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.g && Objects.equals(objL, this.b) && iF == this.c && iG == this.d && jD == this.e && jMax2 == this.f) {
            long j = jElapsedRealtime - this.h;
            int i = this.a;
            if (j >= i) {
                ((androidx.media3.exoplayer.x) this.i.d).e.Q(new androidx.media3.exoplayer.j(2, new d0(1, i), 1003));
                return;
            }
            return;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = objL;
        this.c = iF;
        this.d = iG;
        this.e = jD;
        this.f = jMax2;
        ((g0) this.i.g).e(1);
        ((g0) this.i.g).a.sendEmptyMessageDelayed(1, this.a);
    }
}
