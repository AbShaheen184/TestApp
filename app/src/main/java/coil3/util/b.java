package coil3.util;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.media3.exoplayer.source.r0;
import coil3.q;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public final /* synthetic */ androidx.compose.material.ripple.g e;

    public b(androidx.compose.material.ripple.g gVar) {
        this.e = gVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        androidx.compose.material.ripple.g gVar = this.e;
        synchronized (gVar) {
            if (((q) ((WeakReference) gVar.b).get()) == null) {
                gVar.i();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        coil3.memory.d dVarC;
        long jB;
        androidx.compose.material.ripple.g gVar = this.e;
        synchronized (gVar) {
            try {
                q qVar = (q) ((WeakReference) gVar.b).get();
                if (qVar != null) {
                    t tVar = qVar.a.g;
                    if (tVar != null) {
                        h hVar = h.e;
                        if (((h) tVar.y).compareTo(hVar) <= 0) {
                            t.N("AndroidSystemCallbacks", hVar, "trimMemory, level=" + i, null);
                        }
                    }
                    if (i >= 40) {
                        coil3.memory.d dVarC2 = qVar.c();
                        if (dVarC2 != null) {
                            synchronized (dVarC2.c) {
                                ((r0) dVarC2.a.c).d(-1L);
                                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = dVarC2.b;
                                lVar.y = 0;
                                ((LinkedHashMap) lVar.z).clear();
                            }
                        }
                    } else if (i >= 20) {
                        ((a) gVar.c).a(qVar.a.a);
                    } else if (i >= 10 && (dVarC = qVar.c()) != null) {
                        synchronized (dVarC.c) {
                            jB = ((r0) dVarC.a.c).b();
                        }
                        long j = jB / ((long) 2);
                        synchronized (dVarC.c) {
                            ((r0) dVarC.a.c).d(j);
                        }
                    }
                } else {
                    gVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
