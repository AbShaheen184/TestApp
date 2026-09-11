package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.f1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final Handler a;
    public final androidx.media3.exoplayer.x b;

    public t(Handler handler, androidx.media3.exoplayer.x xVar, int i) {
        switch (i) {
            case 1:
                if (xVar != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.a = handler;
                this.b = xVar;
                break;
            default:
                this.a = handler;
                this.b = xVar;
                break;
        }
    }

    public void a(androidx.media3.exoplayer.c cVar) {
        synchronized (cVar) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new androidx.activity.c(16, this, cVar));
        }
    }

    public void b(f1 f1Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new androidx.activity.c(28, this, f1Var));
        }
    }
}
