package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration e;
    public final /* synthetic */ androidx.compose.ui.res.c y;

    public k0(Configuration configuration, androidx.compose.ui.res.c cVar) {
        this.e = configuration;
        this.y = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.e;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.y.a.entrySet().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.res.a aVar = (androidx.compose.ui.res.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.y.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.y.a.clear();
    }
}
