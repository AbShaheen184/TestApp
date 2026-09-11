package androidx.activity.compose.internal;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.activity.c0;
import androidx.activity.d0;
import androidx.activity.t;
import androidx.activity.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final androidx.navigationevent.c a;
    public final c0 b;

    public c(androidx.navigationevent.c cVar, c0 c0Var) {
        this.a = cVar;
        this.b = c0Var;
        if ((cVar == null ? c0Var : cVar) != null) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(b bVar) {
        androidx.navigationevent.c cVar = this.a;
        if (cVar != null) {
            androidx.navigationevent.c.a(cVar, (a) bVar.b);
            return;
        }
        c0 c0Var = this.b;
        if (c0Var == null) {
            net.luminis.tls.engine.impl.c.r("Unreachable");
            return;
        }
        d0 d0Var = (d0) bVar.a;
        d0Var.getClass();
        t tVar = new t(d0Var, new v(d0Var, null));
        d0Var.a.add(tVar);
        androidx.navigationevent.c.a(c0Var.b().c, tVar);
    }

    public final void b(b bVar) {
        boolean zIsTerminated;
        if (this.a != null) {
            ((a) bVar.b).e();
            return;
        }
        if (this.b == null) {
            net.luminis.tls.engine.impl.c.r("Unreachable");
            return;
        }
        d0 d0Var = (d0) bVar.a;
        ArrayList arrayList = d0Var.a;
        CopyOnWriteArrayList copyOnWriteArrayList = d0Var.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    net.luminis.tls.engine.impl.c.a();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((t) it2.next()).e();
        }
        arrayList.clear();
    }
}
