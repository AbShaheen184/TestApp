package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.media3.exoplayer.source.r0;
import coil3.n;
import coil3.o;
import coil3.q;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public final double e;
    public final /* synthetic */ androidx.compose.material.ripple.g y;

    public a(androidx.compose.material.ripple.g gVar, q qVar) {
        this.y = gVar;
        o oVar = qVar.a;
        coil3.i iVar = n.a;
        Object obj = oVar.b.n.a.get(n.d);
        this.e = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        long j2;
        double d = this.e;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        androidx.compose.material.ripple.g gVar = this.y;
        q qVar = (q) ((WeakReference) gVar.b).get();
        if (qVar == null) {
            gVar.i();
            return;
        }
        coil3.memory.d dVarC = qVar.c();
        if (dVarC != null) {
            synchronized (dVarC.c) {
                j = dVarC.a.a;
            }
            dVarC.a((long) (d * j));
            t tVar = qVar.a.g;
            if (tVar != null) {
                h hVar = h.e;
                if (((h) tVar.y).compareTo(hVar) <= 0) {
                    synchronized (dVarC.c) {
                        j2 = ((r0) dVarC.a.c).e;
                    }
                    t.N("AndroidSystemCallbacks", hVar, "Restricting " + dVarC + "'s max size to " + j2 + " bytes.", null);
                }
            }
        }
    }

    public final void b(Context context) {
        long j;
        long j2;
        if (this.e == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        androidx.compose.material.ripple.g gVar = this.y;
        q qVar = (q) ((WeakReference) gVar.b).get();
        if (qVar == null) {
            gVar.i();
            return;
        }
        coil3.memory.d dVarC = qVar.c();
        if (dVarC != null) {
            synchronized (dVarC.c) {
                j = dVarC.a.a;
            }
            dVarC.a(j);
            t tVar = qVar.a.g;
            if (tVar != null) {
                h hVar = h.e;
                if (((h) tVar.y).compareTo(hVar) <= 0) {
                    synchronized (dVarC.c) {
                        j2 = ((r0) dVarC.a.c).e;
                    }
                    t.N("AndroidSystemCallbacks", hVar, "Restoring " + dVarC + "'s max size to " + j2 + " bytes.", null);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
