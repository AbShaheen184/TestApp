package androidx.media3.exoplayer.audio;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final Handler a;
    public final b0 b;
    public final /* synthetic */ d0 c;

    public c0(d0 d0Var) {
        this.c = d0Var;
        Handler handlerQ = androidx.media3.common.util.j0.q(null);
        this.a = handlerQ;
        b0 b0Var = new b0(this);
        this.b = b0Var;
        d0Var.a.registerStreamEventCallback(new androidx.compose.ui.text.input.b0(handlerQ, 2), b0Var);
    }

    public static void a(c0 c0Var) {
        c0Var.c.a.unregisterStreamEventCallback(c0Var.b);
        c0Var.a.removeCallbacksAndMessages(null);
    }
}
