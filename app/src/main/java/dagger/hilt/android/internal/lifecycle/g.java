package dagger.hilt.android.internal.lifecycle;

import android.os.Looper;
import com.google.android.material.shape.k;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final HashSet a = new HashSet();

    public final void a() {
        if (k.a == null) {
            k.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != k.a) {
            net.luminis.tls.engine.impl.c.r("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
    }
}
