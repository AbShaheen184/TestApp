package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Log;
import android.view.ActionMode;
import android.view.SurfaceView;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.q0;
import androidx.media3.common.t0;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.r0;
import androidx.media3.ui.g0;
import com.caverock.androidsvg.y1;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                i iVar = (i) this.y;
                e eVar = (e) this.z;
                f fVar = (f) this.A;
                ActionMode actionModeStartActionMode = iVar.a.startActionMode(new o(eVar), 1);
                kotlin.jvm.internal.l.a(iVar.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    fVar.close();
                    return;
                }
                return;
            case 1:
                androidx.emoji2.text.m mVar = (androidx.emoji2.text.m) this.y;
                okhttp3.internal.platform.android.g gVar = (okhttp3.internal.platform.android.g) this.z;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A;
                try {
                    androidx.emoji2.text.u uVarQ = kotlin.math.a.q(mVar.a);
                    if (uVarQ == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) ((androidx.emoji2.text.i) uVarQ.b);
                    synchronized (tVar.d) {
                        tVar.f = threadPoolExecutor;
                        break;
                    }
                    ((androidx.emoji2.text.i) uVarQ.b).a(new androidx.emoji2.text.l(gVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    gVar.B(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                r0 r0Var = (r0) this.y;
                d0 d0Var = (d0) this.z;
                androidx.media3.exoplayer.source.v vVar = (androidx.media3.exoplayer.source.v) this.A;
                androidx.media3.exoplayer.analytics.g gVar2 = r0Var.c;
                a1 a1VarG = d0Var.g();
                y1 y1Var = gVar2.A;
                q0 q0Var = gVar2.D;
                q0Var.getClass();
                y1Var.getClass();
                y1Var.b = h0.o(a1VarG);
                if (!a1VarG.isEmpty()) {
                    y1Var.e = (androidx.media3.exoplayer.source.v) a1VarG.get(0);
                    vVar.getClass();
                    y1Var.f = vVar;
                }
                if (((androidx.media3.exoplayer.source.v) y1Var.d) == null) {
                    y1Var.d = y1.F(q0Var, (h0) y1Var.b, (androidx.media3.exoplayer.source.v) y1Var.e, (t0) y1Var.a);
                }
                y1Var.r0(((c0) q0Var).l());
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.y;
                Handler handler = (Handler) this.z;
                androidx.media3.common.util.p pVar = (androidx.media3.common.util.p) this.A;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new androidx.activity.l(pVar, 18));
                    }
                    synchronized (androidx.media3.exoplayer.audio.d0.s) {
                        try {
                            int i = androidx.media3.exoplayer.audio.d0.u - 1;
                            androidx.media3.exoplayer.audio.d0.u = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = androidx.media3.exoplayer.audio.d0.t;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                androidx.media3.exoplayer.audio.d0.t = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new androidx.activity.l(pVar, 18));
                    }
                    synchronized (androidx.media3.exoplayer.audio.d0.s) {
                        try {
                            int i2 = androidx.media3.exoplayer.audio.d0.u - 1;
                            androidx.media3.exoplayer.audio.d0.u = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = androidx.media3.exoplayer.audio.d0.t;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                androidx.media3.exoplayer.audio.d0.t = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 4:
                g0.a((g0) this.y, (SurfaceView) this.z, (androidx.activity.l) this.A);
                return;
            case 5:
                com.google.firebase.crashlytics.internal.common.q qVar = (com.google.firebase.crashlytics.internal.common.q) this.y;
                String str = (String) this.z;
                String str2 = (String) this.A;
                com.google.firebase.crashlytics.internal.common.m mVar2 = qVar.g;
                mVar2.getClass();
                try {
                    ((b1) mVar2.d.d).q(str, str2);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = mVar2.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 6:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.y;
                Intent intent = (Intent) this.z;
                com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.A;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    jVar.b(null);
                }
            case 7:
                com.google.common.util.concurrent.g0 g0Var = (com.google.common.util.concurrent.g0) this.y;
                retrofit2.g gVar3 = (retrofit2.g) this.z;
                retrofit2.r0 r0Var2 = (retrofit2.r0) this.A;
                retrofit2.n nVar = (retrofit2.n) g0Var.z;
                if (nVar.y.z()) {
                    gVar3.b(nVar, new IOException("Canceled"));
                    return;
                } else {
                    gVar3.g(nVar, r0Var2);
                    return;
                }
            default:
                ((retrofit2.g) this.z).b((retrofit2.n) ((com.google.common.util.concurrent.g0) this.y).z, (Throwable) this.A);
                return;
        }
    }
}
