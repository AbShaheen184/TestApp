package androidx.media3.common.util;

import android.os.SystemClock;
import androidx.compose.ui.node.a1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ a1 e;

    public c0(a1 a1Var, int i) {
        this.e = a1Var;
        this.a = i;
    }

    public final void a() {
        a1 a1Var = this.e;
        g0 g0Var = (g0) a1Var.g;
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) a1Var.b;
        int iR = c0Var.r();
        if (!c0Var.p() || c0Var.q() == 1 || c0Var.q() == 4 || iR == 0 || iR == 1) {
            if (this.c) {
                g0Var.e(4);
            }
            this.c = false;
            return;
        }
        ((e0) a1Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iR) {
            if (jElapsedRealtime - this.d >= i) {
                ((androidx.media3.exoplayer.x) a1Var.d).e.Q(new androidx.media3.exoplayer.j(2, new d0(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iR;
        g0Var.e(4);
        g0Var.a.sendEmptyMessageDelayed(4, i);
    }
}
