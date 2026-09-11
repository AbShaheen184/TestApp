package com.google.android.gms.tasks;

import androidx.media3.exoplayer.dash.manifest.t;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final q a = new q();

    public j(t tVar) {
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(this);
        tVar.getClass();
        ((q) tVar.y).c(k.a, new t(tVar, cVar));
    }

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.k(obj);
    }

    public final boolean c(Exception exc) {
        q qVar = this.a;
        qVar.getClass();
        x.h(exc, "Exception must not be null");
        synchronized (qVar.a) {
            try {
                if (qVar.c) {
                    return false;
                }
                qVar.c = true;
                qVar.f = exc;
                qVar.b.i(qVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.l(obj);
    }

    public j() {
    }
}
