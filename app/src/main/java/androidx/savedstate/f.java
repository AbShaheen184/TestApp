package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import java.util.Arrays;
import java.util.Map;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final androidx.savedstate.internal.a a;
    public final e b;

    public f(androidx.savedstate.internal.a aVar) {
        this.a = aVar;
        this.b = new e(aVar);
    }

    public final void a() {
        this.a.a();
    }

    public final void b(Bundle bundle) {
        androidx.savedstate.internal.a aVar = this.a;
        g gVar = aVar.a;
        if (!aVar.e) {
            aVar.a();
        }
        if (((x) gVar.getLifecycle()).d.compareTo(o.A) >= 0) {
            net.luminis.tls.engine.impl.c.e(((x) gVar.getLifecycle()).d, "performRestore cannot be called when owner is ");
            return;
        }
        if (aVar.g) {
            net.luminis.tls.engine.impl.c.r("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                android.support.v4.media.session.b.z("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        aVar.f = bundle2;
        aVar.g = true;
    }

    public final void c(Bundle bundle) {
        androidx.savedstate.internal.a aVar = this.a;
        Bundle bundleI = coil3.network.g.i((k[]) Arrays.copyOf(new k[0], 0));
        Bundle bundle2 = aVar.f;
        if (bundle2 != null) {
            bundleI.putAll(bundle2);
        }
        synchronized (aVar.c) {
            for (Map.Entry entry : aVar.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((d) entry.getValue()).a();
                str.getClass();
                bundleI.putBundle(str, bundleA);
            }
        }
        if (bundleI.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleI);
    }
}
