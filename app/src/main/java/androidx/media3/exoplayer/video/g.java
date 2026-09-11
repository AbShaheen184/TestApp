package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.f1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f0 {
    public final /* synthetic */ k b;

    public g(k kVar) {
        this.b = kVar;
    }

    @Override // androidx.media3.exoplayer.video.f0
    public final void b() {
        k kVar = this.b;
        Surface surface = kVar.x1;
        if (surface != null) {
            androidx.media3.exoplayer.audio.t tVar = kVar.h1;
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new com.google.firebase.crashlytics.internal.common.o(tVar, surface, SystemClock.elapsedRealtime()));
            }
            kVar.A1 = true;
        }
    }

    @Override // androidx.media3.exoplayer.video.f0
    public final void c() {
        k kVar = this.b;
        if (kVar.x1 != null) {
            kVar.S0(0, 1);
        }
    }

    @Override // androidx.media3.exoplayer.video.f0
    public final void d() {
        androidx.media3.exoplayer.f0 f0Var = this.b.f0;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    @Override // androidx.media3.exoplayer.video.f0
    public final void a(f1 f1Var) {
    }
}
