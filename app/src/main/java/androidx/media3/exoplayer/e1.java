package androidx.media3.exoplayer;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public final d1 a;
    public final k0 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public e1(k0 k0Var, d1 d1Var, androidx.media3.common.v0 v0Var, int i, Looper looper) {
        this.b = k0Var;
        this.a = d1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        com.google.android.material.motion.a.q(!this.f);
        this.f = true;
        k0 k0Var = this.b;
        if (!k0Var.g0 && k0Var.G.getThread().isAlive()) {
            k0Var.E.b(14, this).b();
        } else {
            androidx.media3.common.util.c.t("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
