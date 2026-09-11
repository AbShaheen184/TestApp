package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.f1;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Handler.Callback {
    public final Handler e;
    public final /* synthetic */ k y;

    public j(k kVar, androidx.media3.exoplayer.mediacodec.l lVar) {
        this.y = kVar;
        Handler handlerQ = j0.q(this);
        this.e = handlerQ;
        lVar.h(this, handlerQ);
    }

    public final void a(long j) {
        Surface surface;
        k kVar = this.y;
        androidx.media3.exoplayer.audio.t tVar = kVar.h1;
        if (this != kVar.S1 || kVar.k0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            kVar.S0 = true;
            return;
        }
        try {
            kVar.D0(j);
            f1 f1Var = kVar.N1;
            if (!f1Var.equals(f1.d) && !f1Var.equals(kVar.O1)) {
                kVar.O1 = f1Var;
                tVar.b(f1Var);
            }
            kVar.U0.e++;
            w wVar = kVar.k1;
            boolean z = wVar.e != 3;
            wVar.e = 3;
            wVar.l.getClass();
            wVar.g = j0.Q(SystemClock.elapsedRealtime());
            if (z && (surface = kVar.x1) != null) {
                Handler handler = tVar.a;
                if (handler != null) {
                    handler.post(new com.google.firebase.crashlytics.internal.common.o(tVar, surface, SystemClock.elapsedRealtime()));
                }
                kVar.A1 = true;
            }
            kVar.i0(j);
        } catch (androidx.media3.exoplayer.j e) {
            kVar.T0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = j0.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
